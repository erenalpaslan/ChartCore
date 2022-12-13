package com.github.chartcore.data.option

import com.github.chartcore.common.Events
import com.github.chartcore.data.option.plugin.Plugin

/**
 * Created by erenalpaslan on 27.11.2022
 */
data class ChartOptions(
    //val animations: String? = null,
    //val scales: String? = null,
    private var plugins: Plugin? = null,
    //val elements: String? = null,
    //val interaction: String? = null,
    private var events: List<String>? = null,
    //val layout: String? = null,
    //val locale: String? = null,
    private var responsive: Boolean = true,
    private var maintainAspectRatio: Boolean = true,
    //val aspectRatio: String? = null,
    //val onResize: String? = null,
    private var resizeDelay: Int? = null
) {
    fun plugin(plugin: Plugin) = apply { this.plugins = plugin }
    fun events(list: List<Events>) = apply { this.events = list.map { it.event } }
    fun responsive(responsive: Boolean) = apply { this.responsive = responsive }
    fun maintainAspectRatio(maintainAspectRatio: Boolean) = apply { this.maintainAspectRatio = maintainAspectRatio }
    fun resizeDelay(delay: Int?) = apply { this.resizeDelay = delay }
}
