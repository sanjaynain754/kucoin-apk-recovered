package com.kubi.sdk.util;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.adapter.DiffAdapterIssue;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.util.FlowExtKt$asSafeLiveData$1", m90122f = "FlowExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\ncom/kubi/sdk/util/FlowExtKt$asSafeLiveData$1\n+ 2 DiffAdapterIssue.kt\ncom/kubi/sdk/adapter/DiffAdapterIssueKt\n*L\n1#1,17:1\n46#2,2:18\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\ncom/kubi/sdk/util/FlowExtKt$asSafeLiveData$1\n*L\n15#1:18,2\n*E\n"})
public final class FlowExtKt$asSafeLiveData$1<T> extends SuspendLambda implements Function3<InterfaceC41635f<? super T>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public FlowExtKt$asSafeLiveData$1(Continuation<? super FlowExtKt$asSafeLiveData$1> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super T> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        FlowExtKt$asSafeLiveData$1 flowExtKt$asSafeLiveData$1 = new FlowExtKt$asSafeLiveData$1(continuation);
        flowExtKt$asSafeLiveData$1.L$0 = th2;
        return flowExtKt$asSafeLiveData$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97263g("SafeLiveData", th2);
        C43846g.m96568c(new DiffAdapterIssue(th2, "SafeLiveData", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }
}
