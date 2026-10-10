package com.kubi.unify.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DelayKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.utils.FlowExKt$throttleLatest$1", m90122f = "FlowEx.kt", m90123i = {}, m90124l = {25}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowExKt$throttleLatest$1<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicBoolean $firstRun;
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExKt$throttleLatest$1(AtomicBoolean atomicBoolean, long j11, Continuation<? super FlowExKt$throttleLatest$1> continuation) {
        super(2, continuation);
        this.$firstRun = atomicBoolean;
        this.$timeout = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowExKt$throttleLatest$1(this.$firstRun, this.$timeout, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(T t11, Continuation<? super Unit> continuation) {
        return ((FlowExKt$throttleLatest$1) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (!this.$firstRun.compareAndSet(true, false)) {
                long j11 = this.$timeout;
                this.label = 1;
                if (DelayKt.m90351c(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
