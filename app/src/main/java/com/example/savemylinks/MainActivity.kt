package com.example.savemylinks

import com.example.savemylinks.droidui.*


class MainActivity: Application() {

    override fun onAppCreated(): UIComponent {
        return MainComponent()
    }
    override fun getAppSplashScreen(): UIComponent? {
        return SplashScreen()
    }
}


class SplashScreen: UIComponent() {
    override val body: ViewBuilder = VStack(
        VSpacer(400),
        HStack(
            HSpacer(100),
            Text("Welcome!")
                .textColor("red")
                .background("blue")
                .padding(),
            HSpacer(100),
        ).center(),
        VSpacer(400)
    ).center()
}
