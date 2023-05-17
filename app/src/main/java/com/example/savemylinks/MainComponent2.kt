package com.example.savemylinks

import android.graphics.Color
import android.view.ViewGroup.LayoutParams
import android.widget.ImageView
import android.widget.Toast
import com.example.savemylinks.database.SQLQuery
import com.example.savemylinks.droidui.*



// class PostModel { //(var caption: String, var isRead: Boolean, var isLiked: Boolean){
//     companion object {
//         var caption: String = ""
//         var isRead: Boolean =  false
//         var isLiked: Boolean = false
//     }
//}
//
//
//class Post(caption: String, isRead: Boolean, backgroundColor: String="white") : UIComponent() {
//
//    val url = "https://www.google.com/search?q=${caption.split(" ").joinToString("+")}"
//    var onTapImage : (ImageView)->Unit = { Toast.makeText(it.context, "going to $url", Toast.LENGTH_SHORT).show()}
//    override val body: ViewBuilder = VStack(10)(
//        Image(R.drawable.ic_launcher_foreground).background(backgroundColor).onTap {  onTapImage(it) },
//        Text(caption),
//        HStack(5)(
//            Text(if (isRead) "Read" else "Not Read"),
//            HSpacer(100),
//            Button("Like")
//                .onTap {
//                           SQLQuery()
//                               .update("post")
//                               .set("like")
//                               .equalTo("true")
//                               .where("id")
//                               .equalTo("")
//                       },
//            Button("Share")
//                .onTap { Toast.makeText(it.context, "Shared: $caption", Toast.LENGTH_SHORT).show() },
//            Button("Add Tag"),
//        ).center()
//    ).center().background("gray")
////        .frame(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
//}
//
//class PostContainer : UIComponent() {
//
//    override val body: ViewBuilder = Scroll(
//        VStack(100)(
//            Group(
//                Post("how are cars made", false),
//                Post("what is the capital of indonesia", false),
//                Post("is covid over", false),
//                Post("has google given up on carbon", true),
//                Post("what nba games are playing now", true),
//                Post("is messi going back to barcelona", true),
//                Post("is taiwan a good place to live", true),
//                Post("how religious is indonesia", true),
//            ).each { post->
//                post.onTapImage = {
//                            val success = AppManager.requestScreenChange( ReadPost(post.url) )
//                            Toast.makeText(it.context, "status: $success, Trying to go to: ${post.url}", Toast.LENGTH_SHORT).show()
//                }
//                   },
//    ).center()
//    )
//}
//
//class PostContainerHeader : UIComponent() {
//    override val body: ViewBuilder = Scroll(
//        HStack(100)(
//            Button("Filter").padding().background("green"),
//        ).center()
//    )
//}
//
//class NavItemComponent(itemName: String, backgroundColor: String, textColor:String="white") : UIComponent() {
//    override val body: ViewBuilder =
//        HStack(30)(
//            Text("${itemName[0]}").textColor(textColor),
//            Button(itemName).addTask { t-> t.setTextColor(Color.parseColor(textColor))  },
//        ).center()
//            .background(backgroundColor)
//}
//
//
//class SideNavComponent() : UIComponent() {
//    override val body: ViewBuilder = Scroll(
//        VStack(30)(
//            NavItemComponent("School", "gray"),
//            NavItemComponent("Sports", "green"),
//            NavItemComponent("LifeStyle", "magenta"),
//            NavItemComponent("AI", "white", "black"),
//            NavItemComponent("Computers", "red"),
//            NavItemComponent("Engineering", "blue"),
//            NavItemComponent("Entertainment", "purple"),
//            NavItemComponent("School", "gray"),
//            NavItemComponent("Sports", "green"),
//            NavItemComponent("LifeStyle", "magenta"),
//            NavItemComponent("AI", "white", "black"),
//            NavItemComponent("Computers", "red"),
//            NavItemComponent("Engineering", "blue"),
//            NavItemComponent("Entertainment", "purple"),
//            NavItemComponent("School", "gray"),
//            NavItemComponent("Sports", "green"),
//            NavItemComponent("LifeStyle", "magenta"),
//            NavItemComponent("AI", "white", "black"),
//            NavItemComponent("Computers", "red"),
//            NavItemComponent("Engineering", "blue"),
//            NavItemComponent("Entertainment", "purple"),
//            NavItemComponent("School", "gray"),
//            NavItemComponent("Sports", "green"),
//            NavItemComponent("LifeStyle", "magenta"),
//            NavItemComponent("AI", "white", "black"),
//            NavItemComponent("Computers", "red"),
//            NavItemComponent("Engineering", "blue"),
//            NavItemComponent("Entertainment", "purple"),
//            NavItemComponent("School", "gray"),
//            NavItemComponent("Sports", "green"),
//            NavItemComponent("LifeStyle", "magenta"),
//            NavItemComponent("AI", "white", "black"),
//            NavItemComponent("Computers", "red"),
//            NavItemComponent("Engineering", "blue"),
//            NavItemComponent("Entertainment", "purple"),
//            NavItemComponent("School", "gray"),
//            NavItemComponent("Sports", "green"),
//            NavItemComponent("LifeStyle", "magenta"),
//            NavItemComponent("AI", "white", "black"),
//            NavItemComponent("Computers", "red"),
//            NavItemComponent("Engineering", "blue"),
//            NavItemComponent("Entertainment", "purple"),
//        )
//    )
//}
//
//class ReadPost(url: String): UIComponent() {
//    override var id: String = "readPost"
//    override val body: ViewBuilder = VStack(10)(
//        WebView(url)
//            .frame(LayoutParams.MATCH_PARENT, 1800),
//        Button("Back")
//            .onTap { AppManager.requestPreviousScreen() },
//    ).background("green")
//        .frame(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
//
//}

//class MainComponent(): UIComponent() {
//    var tapped = Reference(true)
//    var text = Reference("Counter")
//    var count = 0
//    override var id: String = "home"
//    override val body: ViewBuilder = HStack(10)(
//        SideNavComponent()
//            .frame(200, LayoutParams.WRAP_CONTENT),
//
//        (VStack(10)(
//            PostContainerHeader(),
//            PostContainer()
//        ))
//            .center()
//            .frame(800, LayoutParams.WRAP_CONTENT)
//    ).background("red")
//}

