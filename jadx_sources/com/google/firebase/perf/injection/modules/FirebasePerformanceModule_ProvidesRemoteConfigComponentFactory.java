package com.google.firebase.perf.injection.modules;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements Provider {
    private final FirebasePerformanceModule module;

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public com.google.firebase.inject.Provider<RemoteConfigComponent> get() {
        return providesRemoteConfigComponent(this.module);
    }

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static com.google.firebase.inject.Provider<RemoteConfigComponent> providesRemoteConfigComponent(FirebasePerformanceModule firebasePerformanceModule) {
        return (com.google.firebase.inject.Provider) C43996b.m96964c(firebasePerformanceModule.providesRemoteConfigComponent());
    }
}
