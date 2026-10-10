package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: renamed from: com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory */
/* JADX INFO: loaded from: classes.dex */
public final class C8776x3dbbb29c implements Provider {
    private final FirebasePerformanceModule module;

    public static C8776x3dbbb29c create(FirebasePerformanceModule firebasePerformanceModule) {
        return new C8776x3dbbb29c(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public com.google.firebase.inject.Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.module);
    }

    public C8776x3dbbb29c(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static com.google.firebase.inject.Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        return (com.google.firebase.inject.Provider) C43996b.m96964c(firebasePerformanceModule.providesTransportFactoryProvider());
    }
}
