package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import javax.inject.Provider;
import re0.C43996b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements Provider {
    private final FirebasePerformanceModule module;

    public static FirebasePerformanceModule_ProvidesSessionManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule);
    }

    @Override // javax.inject.Provider
    public SessionManager get() {
        return providesSessionManager(this.module);
    }

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static SessionManager providesSessionManager(FirebasePerformanceModule firebasePerformanceModule) {
        return (SessionManager) C43996b.m96964c(firebasePerformanceModule.providesSessionManager());
    }
}
