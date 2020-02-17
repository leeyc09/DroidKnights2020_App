package com.droidknights.app2020.ui.eventinfo

import android.os.Bundle
import android.view.View
import com.droidknights.app2020.R
import com.droidknights.app2020.base.BaseFragment
import com.droidknights.app2020.databinding.EventinfoFragmentBinding

class EventInfoFragment : BaseFragment<EventInfoViewModel, EventinfoFragmentBinding>(
    R.layout.eventinfo_fragment,
    EventInfoViewModel::class
) {
    //TODO : 행사와 관련된 정보
    //TODO : 코엑스 위치 지도
    //TODO : 세션장 지도 이미지

    //TODO : 후원사 리스트
    //TODO : app contributors 리스트

    private val sponsorAdapter =
        EventInfoAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        sponsorAdapter.submitList(viewModel.sponsorList)
        binding.rvSponsor.apply {
            adapter = sponsorAdapter
        }
    }
}
