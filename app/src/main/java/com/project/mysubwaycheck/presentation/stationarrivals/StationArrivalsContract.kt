package com.project.mysubwaycheck.presentation.stationarrivals

import com.project.mysubwaycheck.domain.ArrivalInformation
import com.project.mysubwaycheck.presentation.BasePresenter
import com.project.mysubwaycheck.presentation.BaseView

interface StationArrivalsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showStationArrivals(arrivalInformation: List<ArrivalInformation>)
    }

    interface Presenter : BasePresenter {

        fun fetchStationArrivals()

        fun toggleStationFavorite()
    }
}
