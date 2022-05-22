package com.project.mysubwaycheck.presentation.stations

import com.project.mysubwaycheck.domain.Station
import com.project.mysubwaycheck.presentation.BasePresenter
import com.project.mysubwaycheck.presentation.BaseView

interface StationsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showStations(stations: List<Station>)
    }

    interface Presenter : BasePresenter {

        fun filterStations(query: String)

        fun toggleStationFavorite(station: Station)
    }
}
