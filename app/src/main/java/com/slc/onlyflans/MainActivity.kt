package com.slc.onlyflans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.slc.onlyflans.adapters.FlanAdapter
import com.slc.onlyflans.databinding.MainActivityBinding
import com.slc.onlyflans.util.Mock

class MainActivity : AppCompatActivity(), FlanAdapter.OnFlanClickListener {

    private var _binding: MainActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVariables()
    }

    private fun initVariables() {
        val gridLayoutManager = GridLayoutManager(this, 2)
        val list = Mock.flanList
        list.shuffle()
        val adapter = FlanAdapter(list, this)

        binding.rvFlans.layoutManager = gridLayoutManager
        binding.rvFlans.adapter = adapter
    }

    // Listener

    override fun onClickFlan() {

    }
}