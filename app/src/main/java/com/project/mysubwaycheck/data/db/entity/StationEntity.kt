package com.project.mysubwaycheck.data.db.entity

import androidx.room.*

@Entity
data class StationEntity(
    @PrimaryKey val stationName: String,
    val isFavorited: Boolean = false
)