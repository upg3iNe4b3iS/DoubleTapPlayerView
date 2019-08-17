DoubleTapPlayerView
=====

A simple library to include double tap behavior to ExoPlayer's PlayerView. Created to handle fast forward/rewind behavior.

<center>
<img src="github/youtube.png" alt="drawing" width="400"/>
</center>


### Pre-defined Layouts
 
* **YouTube:** Shows bubble overlay on double tap with forward/rewind animation and touch ripples.

Download
--------
Gradle:

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
  implementation 'com.github.vkay94:DoubleTapPlayerView:0.2.0'
}
```

How do I use (e.g. YouTube rewind/forward)
-------------------
Layout:

```java
<FrameLayout
    ... >

    <!-- Replace ExoPlayer's PlayerView -->
    <com.github.vkay94.dtpv.DoubleTapPlayerView
            android:id="@+id/doubletapplayerview"
            app:player_layout_id="@layout/exo_simple_player_view"
            app:use_controller="true"
            ...
    />

    <!-- Other views e.g. ProgressBar etc  -->

    <!-- Add the overlay on top of PlayerView -->
    <com.github.vkay94.dtpv.YouTubeDoubleTap
            android:background="@color/dtp_overlay_dim"
            android:id="@+id/youTubeDoubleTap"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

</FrameLayout>
```

Activity: 

```java
// Link the PlayerView to the overlay to pass increment to the Player (seekTo)
youTubeDoubleTap
    .setPlayer(videoFullScreenPlayer)
    .setForwardRewindIncrementMs(5000)

// Set YouTube overlay to the PlayerView and set double tapping enabled (false by default)
doubletapplayerview
    .activateDoubleTap(true)
    .setDoubleTapDelay(500)
    .setDoubleTapLayout(doubleTapOverlay)
```