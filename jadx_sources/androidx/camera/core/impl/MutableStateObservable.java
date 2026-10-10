package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes23.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    public static <T> MutableStateObservable<T> withInitialError(Throwable th2) {
        return new MutableStateObservable<>(th2, true);
    }

    public static <T> MutableStateObservable<T> withInitialState(T t11) {
        return new MutableStateObservable<>(t11, false);
    }

    private MutableStateObservable(Object obj, boolean z11) {
        super(obj, z11);
    }

    public void setError(Throwable th2) {
        updateStateAsError(th2);
    }

    public void setState(T t11) {
        updateState(t11);
    }
}
