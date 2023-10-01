package com.example.cbaappdemo.di

import com.example.cbaappdemo.data.network.IRepository
import com.example.cbaappdemo.data.network.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepoModule {

    @Binds
    abstract fun provideRepository(repository: Repository): IRepository
}