package com.xwray.groupie.example.databinding.item

import com.xwray.groupie.databinding.BindableItem
import com.xwray.groupie.example.databinding.MainActivity.INSET
import com.xwray.groupie.example.databinding.MainActivity.INSET_TYPE_KEY
import com.xwray.groupie.example.databinding.R
import com.xwray.groupie.example.databinding.databinding.ItemCardBinding

open class CardItem(
    val text: CharSequence = ""
) : BindableItem<ItemCardBinding>() {

    init {
        extras[INSET_TYPE_KEY] = INSET
    }

    override fun getLayout(): Int = R.layout.item_card

    override fun bind(viewBinding: ItemCardBinding, position: Int) {
        viewBinding.text.text = text
    }
}