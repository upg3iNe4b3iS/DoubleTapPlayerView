package com.github.vkay94.doubletapplayerviewexample

import androidx.annotation.OptIn
import androidx.media3.common.util.UnstableApi
import androidx.media3.extractor.Extractor
import androidx.media3.extractor.ExtractorsFactory
import androidx.media3.extractor.mp4.Mp4Extractor


@UnstableApi
@OptIn(UnstableApi::class)
class Mp4ExtractorFactory : ExtractorsFactory {

    override fun createExtractors(): Array<Extractor> {
        return arrayOf(
            Mp4Extractor()
        )
    }
}