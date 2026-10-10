package com.kubi.widget.web.startup;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [Ssg] */
/* JADX INFO: compiled from: KWebParallelPrepareRunner.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Ssg", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.startup.KWebParallelPrepareRunner$run$1$1$ssg$1", m90122f = "KWebParallelPrepareRunner.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KWebParallelPrepareRunner$run$1$1$ssg$1<Ssg> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Ssg>, Object> {
    final /* synthetic */ Function0<Ssg> $prepareSsg;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KWebParallelPrepareRunner$run$1$1$ssg$1(Function0<? extends Ssg> function0, Continuation<? super KWebParallelPrepareRunner$run$1$1$ssg$1> continuation) {
        super(2, continuation);
        this.$prepareSsg = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KWebParallelPrepareRunner$run$1$1$ssg$1(this.$prepareSsg, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Ssg> continuation) {
        return ((KWebParallelPrepareRunner$run$1$1$ssg$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.$prepareSsg.invoke();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
