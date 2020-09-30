package com.example.mvvmappapplication.di;


import com.example.mvvmappapplication.ui.HomeActivity;
import com.example.mvvmappapplication.ui.HomeModule;
import com.example.mvvmappapplication.ui.MainActivity;
import com.example.mvvmappapplication.ui.MainModule;
import com.example.mvvmappapplication.ui.menu.CameraViewActivity;
import com.example.mvvmappapplication.ui.menu.CameraViewModule;
import com.example.mvvmappapplication.ui.user.LoginActivity;
import com.example.mvvmappapplication.ui.user.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    /**
     * MainActivity를 위한 서브컴포넌트 정의
     */
    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = HomeModule.class)
    abstract HomeActivity homeActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = CameraViewModule.class)
    abstract CameraViewActivity cameraViewActivity();

}
