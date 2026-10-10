package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(T t11) {
        Intrinsics.checkNotNull(this.mListener, "Listener is not set.");
        this.mListener.accept(t11);
    }

    public void setListener(Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
