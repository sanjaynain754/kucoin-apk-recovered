package com.kubi.kumex.trade;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.utils.AbstractC27013a0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.trade.d5, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0006\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kumex/trade/ScrollPredicate2;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/kubi/utils/LastPredicate;", "<init>", "()V", ViewProps.SCROLL, "Ljava/util/concurrent/atomic/AtomicBoolean;", "test", "", "t", "(Ljava/lang/Object;)Z", "", "stopScroll", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScrollPredicate2<T> extends AbstractC27013a0<T> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicBoolean f30484c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final void m36283d() {
        this.f30484c.compareAndSet(false, true);
    }

    /* JADX INFO: renamed from: e */
    public final void m36284e() {
        if (this.f30484c.compareAndSet(true, false)) {
            m66499b();
        }
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        return !this.f30484c.get();
    }
}
