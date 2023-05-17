package com.example.savemylinks.droidui

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup.LayoutParams
import androidx.appcompat.app.AppCompatActivity


abstract class Application: AppCompatActivity() {
    private lateinit var parent: ViewBuilder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentScreen()
    }
    private fun setContentScreen() {
        val home = onAppCreated()
        AppManager.setHomeScreen(home.id, home)
        home.shouldDisplay.setValue(true)
        parent = Stack()(
            home.frame(1000, LayoutParams.MATCH_PARENT),
            ).center()
            .background("#000000")
            .frame(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
            .addTask { viewGroup->
                viewGroup.setBackgroundColor( Color.parseColor("white"))
//                viewGroup.layoutParams = LayoutParams(
//                    800, 2000
//                )
                AppManager.setMainContainerIfNotExists(viewGroup)
            }
        setContentView(parent.build(this))
    }
    abstract fun onAppCreated(): UIComponent
    open fun getAppSplashScreen(): UIComponent? {
        return null
    }
}