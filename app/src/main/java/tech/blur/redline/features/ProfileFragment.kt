package tech.blur.redline.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tech.blur.redline.R

class ProfileFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(getLayoutID(), container, false)
        return view
    }

    override fun getLayoutID(): Int = R.layout.fragment_profile

    companion object {
        fun newInstance() = ProfileFragment()
    }
}