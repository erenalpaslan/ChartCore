package com.github.chartcore.data.option.elements

import com.github.chartcore.common.BorderAlign
import com.github.chartcore.common.BorderJoinStyle
import com.github.chartcore.data.option.plugin.BackgroundColor

/**
 * Created by erenalpaslan on 13.12.2022
 */
data class Arc(
    private var angle: Int? = null,
    private var backgroundColor: String? = null,
    private var borderAlign: String? = null,
    private var borderColor: String? = null,
    private var borderJoinStyle: String? = null,
    private var borderWidth: Int? = null,
    private var circular: Boolean? = null
) {
    fun angle(angle: Int) = apply { this.angle = angle }
    fun backgroundColor(color: String) = apply { this.backgroundColor = color }
    fun borderAlign(align: BorderAlign) = apply { this.borderAlign = align.align }
    fun borderColor(color: String) = apply { this.borderColor = color }
    fun borderJoinStyle(joinStyle: BorderJoinStyle) = apply { this.borderJoinStyle = joinStyle.style }
    fun borderWidth(width: Int) = apply { this.borderWidth = width }
    fun circular(circular: Boolean) = apply { this.circular = circular }
}
