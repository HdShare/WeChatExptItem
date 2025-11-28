class AppItem(
    val id: Int,
    val args: List<Arg> = emptyList(),
) {
    data class Arg(
        val key: String,
        val value: String,
        val desc: String = "",
    )
}

val appItems = listOf(
    AppItem(
        13436,
        listOf(
            AppItem.Arg("clicfg_chatting_voice_input", "1", "聊天输入栏支持语音输入")
        )
    ),
    AppItem(
        14438,
        listOf(
            AppItem.Arg("clicfg_notification_half_screen_chat_enable_new", "1", "微信内消息通知半屏(新)")
        )
    ),
    AppItem(
        14476,
        listOf(
            AppItem.Arg("clicfg_sns_use_expandable_video_seek_bar", "1")
        )
    ),
    AppItem(
        14680,
        listOf(
            AppItem.Arg("clicfg_chatting_c2c_live_send_v4", "1", "聊天发送支持Live (by realhe)")
        )
    ),
    AppItem(
        14798,
        listOf(
            AppItem.Arg("clicfg_screenshot_share_service", "1", "「截图转发」 - 入口显示"),
            AppItem.Arg("clicfg_new_imgmsg_send_origin", "1", "新图片转发发送原图")
        )
    ),
)
