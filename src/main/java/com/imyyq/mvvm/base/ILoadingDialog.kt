package com.imyyq.mvvm.base

import com.imyyq.mvvm.app.GlobalConfig

/**
 * 加载中对话框接口
 */
interface ILoadingDialog {
    /**
     * 显示加载中对话框
     */
    fun showLoadingDialog(msg: String?)

    /**
     * 隐藏加载中对话框
     */
    fun dismissLoadingDialog()

    /**
     * 详见 [com.imyyq.mvvm.app.GlobalConfig.loadingDialogLayout]
     */
    fun loadingDialogLayout() = GlobalConfig.loadingDialogLayout

    /**
     * 详见 [com.imyyq.mvvm.app.GlobalConfig.loadingDialogLayoutMsgId]
     */
    fun loadingDialogLayoutMsgId() = GlobalConfig.loadingDialogLayoutMsgId

    /**
     * 详见 [com.imyyq.mvvm.app.GlobalConfig.isNeedLoadingDialog]
     */
    fun isNeedLoadingDialog() = GlobalConfig.isNeedLoadingDialog

    /**
     * 详见 [com.imyyq.mvvm.app.GlobalConfig.loadingDialogCancelable]
     */
    fun isLoadingDialogCancelable(): Boolean = GlobalConfig.loadingDialogCancelable

    /**
     * 详见 [com.imyyq.mvvm.app.GlobalConfig.loadingDialogCanceledOnTouchOutside]
     */
    fun isLoadingDialogCanceledOnTouchOutside(): Boolean = GlobalConfig.loadingDialogCanceledOnTouchOutside
}