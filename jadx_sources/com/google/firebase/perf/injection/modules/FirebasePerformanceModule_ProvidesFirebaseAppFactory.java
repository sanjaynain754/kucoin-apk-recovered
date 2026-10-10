package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements Provider {
    private final FirebasePerformanceModule module;

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public FirebaseApp get() {
        return providesFirebaseApp(this.module);
    }

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebaseApp providesFirebaseApp(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseApp) C43996b.m96964c(firebasePerformanceModule.providesFirebaseApp());
    }
}
