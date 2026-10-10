package com.kubi.mvi.state;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mvi.state.t */
/* JADX INFO: compiled from: TaskFlow.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u000eR-\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/mvi/state/t;", "", "", JPushConstants.Operation.KEY_SEQUENCE, "mainThread", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "c", "()Z", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C19298t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean sequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean mainThread;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<Continuation<? super Unit>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public C19298t(boolean z11, boolean z12, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.sequence = z11;
        this.mainThread = z12;
        this.block = block;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function1<Continuation<? super Unit>, Object> m42674a() {
        return this.block;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getMainThread() {
        return this.mainThread;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSequence() {
        return this.sequence;
    }
}
