package ar.mad.sumeriosmobile

import android.app.Application
import ar.mad.sumeriosmobile.core.Config
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SumeriosMobileApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Config.baseUrl = resources.getString(R.string.base_url)
        Config.tokenType = resources.getString(R.string.token_type)
    }
}