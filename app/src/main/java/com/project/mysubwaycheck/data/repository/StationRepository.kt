package com.project.mysubwaycheck.data.repository

import com.project.mysubwaycheck.domain.Station
import kotlinx.coroutines.flow.Flow

interface StationRepository {

    val stations: Flow<List<Station>>

    suspend fun refreshStations()
}