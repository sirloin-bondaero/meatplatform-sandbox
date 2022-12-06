/*
 * meatplatform-sandbox
 * Distributed under CC BY-NC-SA
 */
package net.meatplatform.sandbox.util

/**
 * @since 2022-02-14
 */
enum class ClientDevicePlatform(override val code: String) : SerializableEnum<String> {
    ANDROID("android"),
    IOS("iOS"),
    WEB("web"),
    WINDOWS("windows"),
    LINUX("linux"),
    MACOS("macOS");

    companion object : EnumDeserializer<String, ClientDevicePlatform> {
        override fun from(code: String?): ClientDevicePlatform? =
            values().firstOrNull { it.code == code }
    }
}
