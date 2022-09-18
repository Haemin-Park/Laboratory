package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

/**
 *
 * source : Annotations are to be discarded by the compiler, 빌드된 binary에 포함 x
 * binary : binary에도 포함, but reflection으로 접근 x
 * runtime : reflection을 통해 접근까지 가능, default
 *
 * 궁금했던점 : https://stackoverflow.com/questions/59479432/rentention-policy-in-custom-scope-declaration-of-dagger-2
 */

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class RedColor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class GreenColor

@Module
@InstallIn(SingletonComponent::class)
abstract class ColorModule {

    @RedColor
    @Singleton
    @Binds
    abstract fun bindRedColor(
        red: Red
    ): Color

    @GreenColor
    @Singleton
    @Binds
    abstract fun bindGreenColor(
        green: Green
    ): Color
}