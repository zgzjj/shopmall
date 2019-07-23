package com.mmall.vo;


import java.math.BigDecimal;
import java.util.List;

public class CartVo {
    private List<CartProductVo> cartProductVoList;
    private BigDecimal cartTotalPrice;
    private boolean allChecked;//是否已经都勾选
    private String imageHost;

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public void setAllChecked(boolean allChecked) {
        this.allChecked = allChecked;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
