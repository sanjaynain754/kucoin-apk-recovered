package com.kubi.payment.fast.data.source;

import com.kubi.otc.entity.FastSymbol;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.payment.util.RepositoryExtKt;
import com.kubi.utils.C27099x;
import com.tencent.bugly.proguard.C33590cg;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: FastRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/otc/entity/FastSymbol;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.data.source.FastRepositoryImpl$loadTradingPairs$2", m90122f = "FastRepositoryImpl.kt", m90123i = {1, 1, 1, 1, 1}, m90124l = {52, 272}, m90125m = "invokeSuspend", m90126n = {"remoteResult", C33590cg.f69440j, "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nFastRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastRepositoryImpl.kt\ncom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,269:1\n196#2,3:270\n*S KotlinDebug\n*F\n+ 1 FastRepositoryImpl.kt\ncom/kubi/payment/fast/data/source/FastRepositoryImpl$loadTradingPairs$2\n*L\n65#1:270,3\n*E\n"})
public final class FastRepositoryImpl$loadTradingPairs$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AbstractC42878k<? extends FastSymbol>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FastRepositoryImpl this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<? extends FastSymbol>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super AbstractC42878k<FastSymbol>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastRepositoryImpl$loadTradingPairs$2(FastRepositoryImpl fastRepositoryImpl, Continuation<? super FastRepositoryImpl$loadTradingPairs$2> continuation) {
        super(2, continuation);
        this.this$0 = fastRepositoryImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastRepositoryImpl$loadTradingPairs$2(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<FastSymbol>> continuation) {
        return ((FastRepositoryImpl$loadTradingPairs$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC42878k abstractC42878k;
        FastSymbol fastSymbol;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    abstractC42878k = (AbstractC42878k) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            fastSymbol = (FastSymbol) obj;
            if (fastSymbol != null) {
                return new AbstractC42878k.Success(fastSymbol);
            }
            return abstractC42878k;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC41697j0 abstractC41697j0 = this.this$0.f38592b;
        FastRepositoryImpl$loadTradingPairs$2$remoteResult$1 fastRepositoryImpl$loadTradingPairs$2$remoteResult$1 = new FastRepositoryImpl$loadTradingPairs$2$remoteResult$1(this.this$0, null);
        this.label = 1;
        obj = RepositoryExtKt.m49806a(abstractC41697j0, fastRepositoryImpl$loadTradingPairs$2$remoteResult$1, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k2 = (AbstractC42878k) obj;
        if (abstractC42878k2 instanceof AbstractC42878k.Success) {
            C46392a.m102333p(PaymentStorageId.f40364a.m49834l(), C27099x.m66919i(((AbstractC42878k.Success) abstractC42878k2).m94040a(), false, 2, null));
            return abstractC42878k2;
        }
        String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49834l(), "");
        if (strM102326h.length() > 0) {
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C20505xbdde848c(strM102326h, null)), C42911a.m94120b());
            this.L$0 = abstractC42878k2;
            this.L$1 = SpillingKt.nullOutSpilledVariable(strM102326h);
            this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$3 = SpillingKt.nullOutSpilledVariable(strM102326h);
            this.I$0 = 0;
            this.label = 2;
            Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (objM90914f0 != coroutine_suspended) {
                abstractC42878k = abstractC42878k2;
                obj = objM90914f0;
                fastSymbol = (FastSymbol) obj;
                if (fastSymbol != null) {
                    return new AbstractC42878k.Success(fastSymbol);
                }
                return abstractC42878k;
            }
            return coroutine_suspended;
        }
        return abstractC42878k2;
    }
}
