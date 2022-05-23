package com.project.mysubwaycheck.di

import android.app.Activity
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.project.mysubwaycheck.data.api.StationApi
import com.project.mysubwaycheck.data.api.StationStorageApi
import com.project.mysubwaycheck.data.db.AppDatabase
import com.project.mysubwaycheck.data.preference.PreferenceManager
import com.project.mysubwaycheck.data.preference.SharedPreferenceManager
import com.project.mysubwaycheck.data.repository.StationRepository
import com.project.mysubwaycheck.data.repository.StationRepositoryImpl
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {

    single { Dispatchers.IO }

    // Database
    single { AppDatabase.build(androidApplication()) }
    single { get<AppDatabase>().stationDao() }

    // Preference
    single { androidContext().getSharedPreferences("preference", Activity.MODE_PRIVATE) }
    single<PreferenceManager> { SharedPreferenceManager(get()) }

    // Api
    single<StationApi> { StationStorageApi(Firebase.storage) }

    // Repository
    single<StationRepository> { StationRepositoryImpl(get(), get(), get(), get()) }
}