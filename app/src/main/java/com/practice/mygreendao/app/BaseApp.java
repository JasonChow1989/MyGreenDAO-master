package com.practice.mygreendao.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.practice.mygreendao.DaoMaster;
import com.practice.mygreendao.DaoSession;

/**
 * Created by Administrator on 2017/3/14.
 */

public class BaseApp extends Application {

    private static DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        //配置数据库
        setupDatabase();
    }

    private void setupDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "shop.db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return mDaoSession;
    }

}
