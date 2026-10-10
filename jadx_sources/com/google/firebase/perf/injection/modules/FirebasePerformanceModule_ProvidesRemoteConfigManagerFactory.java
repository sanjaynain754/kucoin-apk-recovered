package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements Provider {
    private final FirebasePerformanceModule module;

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public RemoteConfigManager get() {
        return providesRemoteConfigManager(this.module);
    }

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static RemoteConfigManager providesRemoteConfigManager(FirebasePerformanceModule firebasePerformanceModule) {
        return (RemoteConfigManager) C43996b.m96964c(firebasePerformanceModule.providesRemoteConfigManager());
    }
}
