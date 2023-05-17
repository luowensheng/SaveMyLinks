package com.example.savemylinks

import android.graphics.Color
import android.view.ViewGroup.LayoutParams
import android.widget.ImageView
import android.widget.Toast
import com.example.savemylinks.database.SQLQuery
import com.example.savemylinks.droidui.*

class Post(): UIComponent() {
    override val body: ViewBuilder =
        VStack(20)(
            Frame()
                .background("red")
                .frame(LayoutParams.MATCH_PARENT, 400),
            Text("Fallen NSF firefighter posthumously promoted to sergeant by SCDF")
                .textSize(fontSize = 16)
                .frame(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT),
            HStack(10)(

                Text("Source link - 18hrs ago")
                    .textSize(fontSize = 12),

                HSpacer(2),

                Text("Share")
                    .textSize(fontSize = 12),

                Text("Link")
                    .textSize(fontSize = 12),

//                Group(

//                    HStack(3)(
//                        Text("Share")
//                            .textSize(fontSize = 12),
//                        Text("Link")
//                            .textSize(fontSize = 12)
//                    ).frame(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
//                        .background("blue")
//                    ,
//                )
//                ).each { text ->
//                    text.frame(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
//                        .background("yellow")
//                }
            ).background("#555555")
                .frame(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        ).background("gray")
            .padding()
            .frame(850, LayoutParams.WRAP_CONTENT)
}

class MainComponent(): UIComponent() {

    private val openMenu = Reference(false)
    override var id: String = "home"
    override val body: ViewBuilder =
        HStack(
            VStack(10)(
                Spacer(200, 300)
                    .background("red")
                    .displayIf(openMenu)
                ,

                Spacer(200, 10)
                    .background("red")
                    .displayIf(openMenu),
                    Text("Discover").textSize(14).onTap { openMenu.toggle() },
                    Text("Hello").textSize(14),
                    Text("Hello").textSize(14).displayIf(openMenu),
            )
                .frame(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT),
            Scroll(
                VStack(30)(
//                    VSpacer(100),
                    Group(
                        Post(),
                        Post(),
                        Post(),
                        Post(),
                        Post(),
                        Post(),
                    ).each { post -> post.onTap {
                        openMenu.toggle()
                        Toast.makeText(it.context, post.toString(), Toast.LENGTH_SHORT).show()
                    } }

                )
//                    .frame(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT),
            )
//                .frame(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

        )

//        .frame(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)


}

