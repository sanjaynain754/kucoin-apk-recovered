package androidx.camera.core.processing;

import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes23.dex */
public interface Node<I, O> {
    void release();

    @MainThread
    O transform(I i11);
}
