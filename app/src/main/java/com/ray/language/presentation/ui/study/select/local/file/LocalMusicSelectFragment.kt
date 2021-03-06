package com.ray.language.presentation.ui.study.select.local.file

import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.ray.language.databinding.FragmentLocalMusicSelectBinding
import com.ray.language.presentation.ui.common.base.BaseFragment
import com.ray.language.presentation.ui.study.select.local.LocalMusicViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LocalMusicSelectFragment : BaseFragment<FragmentLocalMusicSelectBinding>(FragmentLocalMusicSelectBinding::inflate) {
    private val viewModel: LocalMusicSelectViewModel by viewModels()

    private val activityViewModel: LocalMusicViewModel by activityViewModels()

    override fun initView() {
        bind {
            vm = viewModel
            lifecycleOwner = viewLifecycleOwner

            list.adapter = LocalMusicSelectAdapter().apply {
                onItemClick = {
                    activityViewModel.selectMusic(it)
                }
            }
        }
    }
}