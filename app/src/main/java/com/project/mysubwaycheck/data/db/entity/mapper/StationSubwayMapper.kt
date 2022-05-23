package com.project.mysubwaycheck.data.db.entity.mapper

import com.project.mysubwaycheck.data.db.entity.StationWithSubwaysEntity
import com.project.mysubwaycheck.data.db.entity.SubwayEntity
import com.project.mysubwaycheck.domain.Station
import com.project.mysubwaycheck.domain.Subway

fun StationWithSubwaysEntity.toStation() = Station(
    name = station.stationName,
    isFavorited = station.isFavorited,
    connectedSubways = subways.toSubways()
)

fun List<StationWithSubwaysEntity>.toStations() = map { it.toStation() }

fun List<SubwayEntity>.toSubways(): List<Subway> = map { Subway.findById(it.subwayId) }