package com.project.mysubwaycheck.domain

data class Station(
    val name: String,
    val isFavorited: Boolean,
    val connectedSubways: List<Subway>
)