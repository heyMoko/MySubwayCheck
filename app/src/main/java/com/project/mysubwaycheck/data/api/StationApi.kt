package com.project.mysubwaycheck.data.api

import com.project.mysubwaycheck.data.db.entity.StationEntity
import com.project.mysubwaycheck.data.db.entity.SubwayEntity

interface StationApi {

    suspend fun getStationDataUpdatedTimeMillis(): Long

    suspend fun getStationSubways(): List<Pair<StationEntity, SubwayEntity>>
}