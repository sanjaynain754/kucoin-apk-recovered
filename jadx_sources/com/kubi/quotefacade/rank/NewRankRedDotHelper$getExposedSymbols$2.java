package com.kubi.quotefacade.rank;

import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: NewRankRedDotHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.NewRankRedDotHelper$getExposedSymbols$2", m90122f = "NewRankRedDotHelper.kt", m90123i = {0, 0}, m90124l = {178}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nNewRankRedDotHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper$getExposedSymbols$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,172:1\n116#2,11:173\n*S KotlinDebug\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper$getExposedSymbols$2\n*L\n130#1:173,11\n*E\n"})
public final class NewRankRedDotHelper$getExposedSymbols$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Map<String, ? extends Long>>, Object> {
    int I$0;
    Object L$0;
    int label;

    public NewRankRedDotHelper$getExposedSymbols$2(Continuation<? super NewRankRedDotHelper$getExposedSymbols$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, ? extends Long>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super Map<String, Long>>) continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewRankRedDotHelper$getExposedSymbols$2(continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, Long>> continuation) {
        return ((NewRankRedDotHelper$getExposedSymbols$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC44082a interfaceC44082a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC44082a = (InterfaceC44082a) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC44082a interfaceC44082a2 = NewRankRedDotHelper.f42391d;
            this.L$0 = interfaceC44082a2;
            this.I$0 = 0;
            this.label = 1;
            if (interfaceC44082a2.mo91344d(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC44082a = interfaceC44082a2;
        }
        try {
            NewRankRedDotHelper.f42388a.m52643k();
            return MapsKt.toMap(NewRankRedDotHelper.f42392e);
        } finally {
            interfaceC44082a.mo91345e(null);
        }
    }
}
