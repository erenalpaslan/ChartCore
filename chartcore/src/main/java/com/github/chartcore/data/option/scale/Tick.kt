package com.github.chartcore.data.option.scale

import com.github.chartcore.data.option.font.Font
import com.github.chartcore.data.option.padding.Padding

/**
 * Created by erenalpaslan on 14.12.2022
 */
data class Tick(
    private var backdropColor: String? = null,
    private var backdropPadding: Padding? = null,
    private var display: Boolean? = null,
    private var color: String? = null,
    private var font: Font? = null,
    private var major: Major? = null,
    private var padding: Int? = null,
    private var showLabelBackdrop: Boolean? = null,
    private var textStrokeColor: String? = null,
    private var textStrokeWidth: Int? = null,
    private var z: Int? = null
) {
    fun backdropColor(color: String) = apply { this.backdropColor = color }
    fun display(display: Boolean) = apply { this.display = display }
    fun color(color: String) = apply { this.color = color }
    fun padding(padding: Int) = apply { this.padding = padding }
    fun showLabelBackdrop(show: Boolean) = apply { this.showLabelBackdrop }
    fun textStrokeColor(color: String) = apply { this.textStrokeColor = color }
    fun textStrokeWidth(width: Int) = apply { this.textStrokeWidth = width }
    fun z(z: Int) = apply { this.z = z }
    fun backdropPadding(padding: Padding) = apply { this.backdropPadding = padding }
    fun font(font: Font) = apply { this.font = font }
    fun major(enabled: Boolean) = apply { this.major = Major(enabled) }

}