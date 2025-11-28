data class AppItem(
    val id: Int,
    val key: String,
    val desc: String = ""
)

val appItems = listOf(
    AppItem(13436, "clicfg_chatting_voice_input", "语音输入"),
    AppItem(14438, "clicfg_notification_half_screen_chat_enable_new", "半屏通知"),
    AppItem(14680, "clicfg_chatting_c2c_live_send_v4", "实况发送"),
)