package com.ray.language.presentation.helper.study.select.local

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.ray.language.common.util.getStringOrDefault
import com.ray.language.presentation.ui.study.select.local.LocalMusicActivity

object LocalMusicActivityHelper {
    private const val TITLE = "key_TITLE"
    private const val ARTIST = "key_ARTIST"

    fun getNavigationIntent(context: Context): Intent {
        return Intent(context, LocalMusicActivity::class.java)
    }

    fun getResultIntent(
        title: String?,
        artist: String?
    ): Intent {
        return Intent().apply {
            putExtra(TITLE, title)
            putExtra(ARTIST, artist)
        }
    }

    fun getTitleFromResult(bundle: Bundle?): String {
        return bundle.getStringOrDefault(TITLE)
    }

    fun getArtistFromResult(bundle: Bundle?): String {
        return bundle.getStringOrDefault(ARTIST)
    }
}