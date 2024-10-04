package com.m3upaser;
class Entry private constructor(
    val duration: String? = null,
    val groupTitle: String? = null,
    val tvgId: String? = null,
    val tvgName: String? = null,
    val tvgLogo: String? = null,
    val tvgShift: String? = null,
    val radio: String? = null,
    val channelUri: String? = null,
    val channelName: String? = null,
    val userAgent: String? = null
) {

    override fun toString(): String {
        return "Entry(duration='$duration', groupTitle='$groupTitle', tvgId='$tvgId', " +
                "tvgName='$tvgName', tvgLogo='$tvgLogo', tvgShift='$tvgShift', " +
                "radio='$radio', channelUri='$channelUri', channelName='$channelName', userAgent='$userAgent')"
    }

    class Builder {
        var duration: String? = null
        var groupTitle: String? = null
        var tvgId: String? = null
        var tvgName: String? = null
        var tvgLogo: String? = null
        var tvgShift: String? = null
        var radio: String? = null
        var channelUri: String? = null
        var channelName: String? = null
        var userAgent: String? = null

        fun duration(duration: String?) = apply { this.duration = duration }
        fun groupTitle(groupTitle: String?) = apply { this.groupTitle = groupTitle }
        fun tvgId(tvgId: String?) = apply { this.tvgId = tvgId }
        fun tvgName(tvgName: String?) = apply { this.tvgName = tvgName }
        fun tvgLogo(tvgLogo: String?) = apply { this.tvgLogo = tvgLogo }
        fun tvgShift(tvgShift: String?) = apply { this.tvgShift = tvgShift }
        fun radio(radio: String?) = apply { this.radio = radio }
        fun channelUri(channelUri: String?) = apply { this.channelUri = channelUri }
        fun channelName(channelName: String?) = apply { this.channelName = channelName }
        fun userAgent(userAgent: String?) = apply { this.userAgent = userAgent }
        fun build() = Entry(duration, groupTitle, tvgId, tvgName, tvgLogo, tvgShift, radio, channelUri, channelName,userAgent)
    }
}

