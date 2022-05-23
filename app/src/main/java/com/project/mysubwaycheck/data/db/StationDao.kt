package com.project.mysubwaycheck.data.db

import androidx.room.*
import androidx.room.Transaction
import com.project.mysubwaycheck.data.db.entity.StationEntity
import com.project.mysubwaycheck.data.db.entity.StationSubwayCrossRefEntity
import com.project.mysubwaycheck.data.db.entity.StationWithSubwaysEntity
import com.project.mysubwaycheck.data.db.entity.SubwayEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StationDao {

    @Transaction
    @Query("SELECT * FROM StationEntity")
    fun getStationWithSubways(): Flow<List<StationWithSubwaysEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStations(station: List<StationEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubways(subways: List<SubwayEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCrossReferences(reference: List<StationSubwayCrossRefEntity>)
}