package androidx.camera.core.impl.utils.futures;

/* JADX INFO: loaded from: classes23.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable th2);

    void onSuccess(V v11);
}
