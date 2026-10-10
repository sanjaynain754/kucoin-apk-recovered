package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ImageReaderProxyProvider {
    ImageReaderProxy newInstance(int i11, int i12, int i13, int i14, long j11);
}
