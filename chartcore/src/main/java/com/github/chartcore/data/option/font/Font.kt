package com.github.chartcore.data.option.font

import com.github.chartcore.common.FontStyle

/**
 * Created by erenalpaslan on 15.12.2022
 */
data class Font(
    private var family: String? = null,
    private var size: Int? = null,
    private var style: String? = null,
    private var weight: String? = null,
    private var lineHeight: Float? = null
) {
    fun family(family: String) = apply { this.family = family }
    fun size(size: Int) = apply { this.size = size }
    fun style(style: FontStyle) = apply { this.style = style.style }
    fun weight(weight: String) = apply { this.weight = weight }
    fun lineHeight(height: Float) = apply { this.lineHeight = height }
}
