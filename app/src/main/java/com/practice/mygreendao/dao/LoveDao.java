package com.practice.mygreendao.dao;

import com.practice.mygreendao.Bean.Shop;
import com.practice.mygreendao.Bean.ShopDao;
import com.practice.mygreendao.app.BaseApp;

import java.util.List;

/**
 * Created by Administrator on 2017/3/14.
 */

public class LoveDao {

    /**
     * 添加数据
     *
     * @param shop
     */
    public static void insertLove(Shop shop) {
        BaseApp.getDaoInstant().getShopDao().insert(shop);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void deleteLove(long id) {
        BaseApp.getDaoInstant().getShopDao().deleteByKey(id);
    }

    /**
     * 更新数据
     *
     * @param shop
     */
    public static void updateLove(Shop shop) {
        BaseApp.getDaoInstant().getShopDao().update(shop);
    }

    /**
     * 查询条件为Type=TYPE_LOVE的数据
     *
     * @return
     */
    public static List<Shop> queryLove() {
        return BaseApp.getDaoInstant().getShopDao().queryBuilder().where(ShopDao.Properties.Type.eq(Shop.TYPE_LOVE)).list();
    }
}
