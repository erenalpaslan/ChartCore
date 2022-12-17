package com.github.chartcore.data.option.plugin

/**
 * Created by erenalpaslan on 12.12.2022
 */
data class Plugin(
    private var title: Title? = null,
    private var subtitle: Title? = null,
    private var customCanvasBackgroundColor: BackgroundColor? = null,
    private var legend: Legend? = null,
    private var tooltip: Tooltip? = null
) {
    fun subtitle(subtitle: Title) = apply { this.subtitle = subtitle }
    fun title(title: Title) = apply { this.title = title }
    fun customCanvasBackgroundColor(backgroundColor: BackgroundColor) = apply { this.customCanvasBackgroundColor = backgroundColor }
    fun legend(legend: Legend) = apply { this.legend = legend }
    fun tooltip(tooltip: Tooltip) = apply { this.tooltip = tooltip }
}
