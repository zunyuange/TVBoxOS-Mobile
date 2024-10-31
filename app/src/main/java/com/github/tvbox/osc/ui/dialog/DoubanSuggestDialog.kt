package com.github.tvbox.osc.ui.dialog

import android.content.Context
import com.github.tvbox.osc.R
import com.github.tvbox.osc.bean.DoubanSuggestBean
import com.github.tvbox.osc.databinding.DialogDoubanSuggestBinding
import com.github.tvbox.osc.ui.adapter.DoubanSuggestAdapter
import com.lxj.xpopup.core.BottomPopupView

class DoubanSuggestDialog(context: Context,var list: List<DoubanSuggestBean>):BottomPopupView(context) {

    override fun getImplLayoutId(): Int {
        return R.layout.dialog_douban_suggest
    }

    override fun onCreate() {
        super.onCreate()
        val mBinding = DialogDoubanSuggestBinding.bind(popupImplView)
        mBinding.rv.adapter = DoubanSuggestAdapter(list)

        //根据豆瓣id查询分数 https://api.wmdb.tv/movie/api?id=1417598
    }
}