package com.project.mysubwaycheck.presentation


interface BaseView<PresenterT : BasePresenter> {

    val presenter: PresenterT
}
