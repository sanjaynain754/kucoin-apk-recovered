package com.facebook.soloader.observer;

import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;

/* JADX INFO: loaded from: classes45.dex */
public interface Observer {
    void onGetDependenciesEnd(Throwable th2);

    void onGetDependenciesStart();

    void onLoadDependencyEnd(Throwable th2, boolean z11);

    void onLoadDependencyStart(String str, int i11);

    void onLoadLibraryEnd(Throwable th2, boolean z11);

    void onLoadLibraryStart(String str, String str2, int i11);

    void onRecoveryEnd(Throwable th2);

    void onRecoveryStart(RecoveryStrategy recoveryStrategy);

    void onSoFileLoaderLoadEnd(Throwable th2);

    void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i11);

    void onSoSourceLoadLibraryEnd(Throwable th2);

    void onSoSourceLoadLibraryStart(SoSource soSource);
}
