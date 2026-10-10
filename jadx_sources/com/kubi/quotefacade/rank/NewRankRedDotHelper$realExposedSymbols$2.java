package com.kubi.quotefacade.rank;

import com.kubi.quotefacade.entity.RankEntity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: NewRankRedDotHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.NewRankRedDotHelper$realExposedSymbols$2", m90122f = "NewRankRedDotHelper.kt", m90123i = {0, 0, 1}, m90124l = {178, 118}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "exposedSymbols"}, m90127s = {"L$0", "I$0", "L$0"})
@SourceDebugExtension({"SMAP\nNewRankRedDotHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper$realExposedSymbols$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n116#2,8:173\n125#2,2:183\n1869#3,2:181\n*S KotlinDebug\n*F\n+ 1 NewRankRedDotHelper.kt\ncom/kubi/quotefacade/rank/NewRankRedDotHelper$realExposedSymbols$2\n*L\n112#1:173,8\n112#1:183,2\n113#1:181,2\n*E\n"})
public final class NewRankRedDotHelper$realExposedSymbols$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RankEntity> $symbols;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRankRedDotHelper$realExposedSymbols$2(List<RankEntity> list, Continuation<? super NewRankRedDotHelper$realExposedSymbols$2> continuation) {
        super(2, continuation);
        this.$symbols = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewRankRedDotHelper$realExposedSymbols$2(this.$symbols, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NewRankRedDotHelper$realExposedSymbols$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r1.m52647p(r8, r7) == r0) goto L23;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<RankEntity> list;
        InterfaceC44082a interfaceC44082a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list = (List) this.L$1;
                    interfaceC44082a = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC44082a interfaceC44082a2 = NewRankRedDotHelper.f42391d;
            list = this.$symbols;
            this.L$0 = interfaceC44082a2;
            this.L$1 = list;
            this.I$0 = 0;
            this.label = 1;
            if (interfaceC44082a2.mo91344d(null, this) != coroutine_suspended) {
                interfaceC44082a = interfaceC44082a2;
            }
            return coroutine_suspended;
            for (RankEntity rankEntity : list) {
                ConcurrentHashMap concurrentHashMap = NewRankRedDotHelper.f42392e;
                String exposeKey = rankEntity.getExposeKey();
                Intrinsics.checkNotNull(exposeKey);
                Long openingTime = rankEntity.getOpeningTime();
                Intrinsics.checkNotNull(openingTime);
                concurrentHashMap.put(exposeKey, openingTime);
            }
            Map map = MapsKt.toMap(NewRankRedDotHelper.f42392e);
            interfaceC44082a.mo91345e(null);
            NewRankRedDotHelper newRankRedDotHelper = NewRankRedDotHelper.f42388a;
            this.L$0 = SpillingKt.nullOutSpilledVariable(map);
            this.L$1 = null;
            this.label = 2;
        } catch (Throwable th2) {
            interfaceC44082a.mo91345e(null);
            throw th2;
        }
    }
}
