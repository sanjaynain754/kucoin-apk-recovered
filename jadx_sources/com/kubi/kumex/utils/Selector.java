package com.kubi.kumex.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.i0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Selector.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0013\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/utils/Selector;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "data", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "", "select", "t", "(Ljava/lang/Object;)V", "setSelect", "", "getSelect", "isSelect", "", "(Ljava/lang/Object;)Z", "setCallback", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Selector<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<T> f30802a = new ArrayList();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<Unit> f30803b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<T> m36522a() {
        return CollectionsKt.toList(this.f30802a);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36523b(T t11) {
        return this.f30802a.contains(t11);
    }

    /* JADX INFO: renamed from: c */
    public final void m36524c(T t11) {
        if (this.f30802a.contains(t11)) {
            this.f30802a.remove(t11);
        } else {
            this.f30802a.add(t11);
        }
        Function0<Unit> function0 = this.f30803b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36525d(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f30803b = callback;
    }

    /* JADX INFO: renamed from: e */
    public final void m36526e(@NotNull List<? extends T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f30802a.clear();
        this.f30802a.addAll(data);
    }
}
