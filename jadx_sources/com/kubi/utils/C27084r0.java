package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.utils.r0 */
/* JADX INFO: compiled from: ObservableLast.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/utils/r0;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/utils/a0;", "<init>", "()V", "t", "", "test", "(Ljava/lang/Object;)Z", "", "e", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShow", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27084r0<T> extends AbstractC27013a0<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isShow = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final void m66839d() {
        this.isShow.set(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m66840e() {
        this.isShow.set(true);
        m66499b();
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(T t11) {
        return this.isShow.get();
    }
}
