package com.kubi.mvi.state;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mvi.state.j */
/* JADX INFO: compiled from: MethodTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000e\u0010\fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\fR0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u001a\u0010\f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/mvi/state/j;", "", "<init>", "()V", "Lkotlin/Function0;", "", "block", "e", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "d", "(Lkotlin/jvm/functions/Function1;)V", "", "f", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "setStart", "start", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "setSuccess", "success", "setFailCall", "failCall", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C19288j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> success;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> failCall;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Function1<Throwable, Unit> m42668a() {
        return this.failCall;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Function0<Unit> m42669b() {
        return this.start;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Function1<Long, Unit> m42670c() {
        return this.success;
    }

    /* JADX INFO: renamed from: d */
    public final void m42671d(@NotNull Function1<? super Throwable, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.failCall = block;
    }

    /* JADX INFO: renamed from: e */
    public final void m42672e(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.start = block;
    }

    /* JADX INFO: renamed from: f */
    public final void m42673f(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.success = block;
    }
}
