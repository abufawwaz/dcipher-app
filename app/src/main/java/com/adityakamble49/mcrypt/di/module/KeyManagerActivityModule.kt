package com.adityakamble49.mcrypt.di.module

import com.adityakamble49.mcrypt.db.RSAKeyPairRepo
import com.adityakamble49.mcrypt.di.scope.PerActivity
import com.adityakamble49.mcrypt.ui.KeyManagerViewModelFactory
import dagger.Module
import dagger.Provides

/**
 * Key Manager Activity module to provide KeyManager specific dependencies
 *
 * @author Aditya Kamble
 * @since 13/12/2017
 */
@Module
class KeyManagerActivityModule {

    @Provides
    @PerActivity
    fun provideKeyManagerViewModelFactory(rsaKeyPairRepo: RSAKeyPairRepo):
            KeyManagerViewModelFactory = KeyManagerViewModelFactory(rsaKeyPairRepo)
}