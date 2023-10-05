package com.zyy.handleGoods;

/**
 * 定义操作商品的方法
 */
public interface HandleGoods {

    /**
     * 商品添加
     * @param gId 商品编码
     * @param gName 名称
     * @param gPrice 价格
     * @param gCount 数量
     */
    public void  addGoods(int gId, String gName, double gPrice ,int gCount);


    /**
     * 根据商品编号来删除商品
     * @param gId
     */
    public void delGoods(int gId);

    /**
     * 根据商品编号来修改商品价格
     * @param gId
     */
    public void updateGoodsPrice(int gId, double newPrice);

    /**
     * 展示商品列表信息
     */
    public void showGoods();

    /**
     * 商品入库
     * @param gId
     */
    public void inGoods(int gId, int inCount);

    /**
     * 商品出库
     * @param gId
     */
    public void outGoods(int gId, int outCount);

}
