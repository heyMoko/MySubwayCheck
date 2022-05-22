package fastcampus.aop.part5.chapter05.data.db.entity.mapper

import com.project.mysubwaycheck.data.db.entity.StationWithSubwaysEntity
import com.project.mysubwaycheck.data.db.entity.SubwayEntity
import com.project.mysubwaycheck.domain.Station
import com.project.mysubwaycheck.domain.Subway

fun StationWithSubwaysEntity.toStation() =
    Station(
        name = station.stationName,
        isFavorited = station.isFavorited,
        connectedSubways = subways.toSubways()
    )

fun Station.toStationEntity() =
    StationEntity(
        stationName = name,
        isFavorited = isFavorited,
    )


fun List<StationWithSubwaysEntity>.toStations() = map { it.toStation() }

fun List<SubwayEntity>.toSubways(): List<Subway> = map { Subway.findById(it.subwayId) }
