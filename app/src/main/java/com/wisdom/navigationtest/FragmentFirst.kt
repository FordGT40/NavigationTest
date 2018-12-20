package com.wisdom.navigationtest

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import org.jetbrains.anko.support.v4.toast


/**
 * @author HanXueFeng
 * @ProjectName project： NavigationTest
 * @class package：com.wisdom.navigationtest
 * @class describe：
 * @time 2018/12/18 11:37
 * @change
 */
class FragmentFirst : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_first, null, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_jumpSecond.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentFirst_to_fragmentSecond2)
        }

    }
}
