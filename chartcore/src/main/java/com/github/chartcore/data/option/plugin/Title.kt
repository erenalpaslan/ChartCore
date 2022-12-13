package com.github.chartcore.data.option.plugin

import com.github.chartcore.common.Position
import com.github.chartcore.common.TextAlign

/**
 * Created by erenalpaslan on 12.12.2022
 */
data class Title(
    private var display: Boolean? = null,
    private var text: String? = null,
    private var align: String? = null,
    private var color: String? = null,
    private var position: String? = null,
    private var padding: Int? = null
) {
    fun display(display: Boolean) = apply { this.display = display }
    fun text(text: String) = apply { this.text = text }
    fun align(align: TextAlign) = apply { this.align = align.align }
    fun color(color: String) = apply { this.color = color }
    fun position(position: Position) = apply { this.position = position.pos }
    fun padding(padding: Int) = apply { this.padding = padding }
}