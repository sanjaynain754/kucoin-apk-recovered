package com.facebook.soloader.observer;

import androidx.camera.view.C1454t;
import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public class ObserverHolder {
    private static final AtomicReference<Observer[]> sObservers = new AtomicReference<>();

    public static void addObserver(Observer observer) {
        AtomicReference<Observer[]> atomicReference;
        Observer[] observerArr;
        Observer[] observerArr2;
        do {
            atomicReference = sObservers;
            observerArr = atomicReference.get();
            if (observerArr == null) {
                observerArr2 = new Observer[]{observer};
            } else {
                observerArr2 = new Observer[observerArr.length + 1];
                System.arraycopy(observerArr, 0, observerArr2, 0, observerArr.length);
                observerArr2[observerArr.length] = observer;
            }
        } while (!C1454t.m2255a(atomicReference, observerArr, observerArr2));
    }

    public static void onGetDependenciesEnd(Throwable th2) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onGetDependenciesEnd(th2);
            }
        }
    }

    public static void onGetDependenciesStart() {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onGetDependenciesStart();
            }
        }
    }

    public static void onLoadDependencyEnd(Throwable th2, boolean z11) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadDependencyEnd(th2, z11);
            }
        }
    }

    public static void onLoadDependencyStart(String str, int i11) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadDependencyStart(str, i11);
            }
        }
    }

    public static void onLoadLibraryEnd(Throwable th2, boolean z11) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadLibraryEnd(th2, z11);
            }
        }
    }

    public static void onLoadLibraryStart(String str, String str2, int i11) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadLibraryStart(str, str2, i11);
            }
        }
    }

    public static void onRecoveryEnd(Throwable th2) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onRecoveryEnd(th2);
            }
        }
    }

    public static void onRecoveryStart(RecoveryStrategy recoveryStrategy) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onRecoveryStart(recoveryStrategy);
            }
        }
    }

    public static void onSoFileLoaderLoadEnd(Throwable th2) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoFileLoaderLoadEnd(th2);
            }
        }
    }

    public static void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i11) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoFileLoaderLoadStart(soFileLoader, str, i11);
            }
        }
    }

    public static void onSoSourceLoadLibraryEnd(Throwable th2) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoSourceLoadLibraryEnd(th2);
            }
        }
    }

    public static void onSoSourceLoadLibraryStart(SoSource soSource) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoSourceLoadLibraryStart(soSource);
            }
        }
    }

    public static void resetObserversForTestsOnly() {
        sObservers.set(null);
    }
}
