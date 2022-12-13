package com.github.chartcore.data.option.plugin

import com.github.chartcore.common.Position
import com.github.chartcore.common.TextAlign

/**
 * Created by erenalpaslan on 12.12.2022
 */
data class Legend(
    private var display: Boolean? = null,
    private var position: String? = null,
    private var align: String? = null,
    private var labels: Label? = null,
    private var title: Title? = null,
) {
    fun display(display: Boolean) = apply { this.display = display }
    fun position(pos: Position) = apply { this.position = pos.pos }
    fun align(align: TextAlign) = apply { this.align = align.align }
    fun labels(labels: Label) = apply { this.labels = labels }
    fun title(title: Title) = apply { this.title = title }
}
