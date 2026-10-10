package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements Provider {
    private final FirebasePerformanceModule module;

    public static FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public FirebaseInstallationsApi get() {
        return providesFirebaseInstallations(this.module);
    }

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseInstallationsApi) C43996b.m96964c(firebasePerformanceModule.providesFirebaseInstallations());
    }
}
