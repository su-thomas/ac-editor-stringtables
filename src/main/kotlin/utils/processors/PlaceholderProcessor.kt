package utils.processors

import models.StringTableEntry

abstract class PlaceholderProcessor(targetEntry: StringTableEntry): MessageProcessor(targetEntry) {
    override val size = 2

    override fun decodeImpl(bytes: List<Byte>): String {
        return ""
    }

    override fun encodeImpl(textParts: List<String>): List<Byte>? {
        return null
    }
}