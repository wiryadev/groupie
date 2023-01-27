package com.xwray.groupie.example.databinding.item

import androidx.annotation.ColorInt
import com.xwray.groupie.databinding.BindableItem
import com.xwray.groupie.example.databinding.R
import com.xwray.groupie.example.databinding.databinding.ItemSquareCardBinding

/**
 * A card item with a fixed width so it can be used with a horizontal layout manager.
 */
class CarouselCardItem(
    @ColorInt private val colorInt: Int
) : BindableItem<ItemSquareCardBinding>() {

    override fun getLayout(): Int = R.layout.item_square_card

    override fun bind(viewBinding: ItemSquareCardBinding, position: Int) {
        viewBinding.root.setBackgroundColor(colorInt)
    }
}