package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements Provider {
    private final FirebasePerformanceModule module;

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public ConfigResolver get() {
        return providesConfigResolver(this.module);
    }

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static ConfigResolver providesConfigResolver(FirebasePerformanceModule firebasePerformanceModule) {
        return (ConfigResolver) C43996b.m96964c(firebasePerformanceModule.providesConfigResolver());
    }
}
