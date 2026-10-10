package com.kubi.unify.utils;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyCoroutineScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.utils.UnifyCoroutineScopeKt$launchAndCollectLatestIn$1", m90122f = "UnifyCoroutineScope.kt", m90123i = {0}, m90124l = {45}, m90125m = "invokeSuspend", m90126n = {"$i$a$-runCatching-UnifyCoroutineScopeKt$launchAndCollectLatestIn$1$1"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nUnifyCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyCoroutineScope.kt\ncom/kubi/unify/utils/UnifyCoroutineScopeKt$launchAndCollectLatestIn$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class UnifyCoroutineScopeKt$launchAndCollectLatestIn$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ InterfaceC41634e<T> $this_launchAndCollectLatestIn;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnifyCoroutineScopeKt$launchAndCollectLatestIn$1(InterfaceC41634e<? extends T> interfaceC41634e, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super UnifyCoroutineScopeKt$launchAndCollectLatestIn$1> continuation) {
        super(2, continuation);
        this.$this_launchAndCollectLatestIn = interfaceC41634e;
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyCoroutineScopeKt$launchAndCollectLatestIn$1(this.$this_launchAndCollectLatestIn, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyCoroutineScopeKt$launchAndCollectLatestIn$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41634e<T> interfaceC41634e = this.$this_launchAndCollectLatestIn;
                Function2<T, Continuation<? super Unit>, Object> function2 = this.$action;
                Result.Companion companion = Result.INSTANCE;
                this.I$0 = 0;
                this.label = 1;
                if (C41636g.m90925l(interfaceC41634e, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
            C44128b.m97263g("[unifyAccount]", thM103847exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
