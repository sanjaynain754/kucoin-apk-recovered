package com.kubi.payment.fasttradev2;

import com.kubi.payment.util.PaymentStorageId;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadFiatCouponInfo$1", m90122f = "FastTradeViewModel.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, m90124l = {751, 711, 717}, m90125m = "invokeSuspend", m90126n = {"expireTimeObj", "this_$iv", "json$iv", "$i$f$fromJsonOrNull", "expireTimeObj", "pair", "frequency", "lastShowTime", "expireTimeObj"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "F$0", "J$0", "L$0"})
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,748:1\n196#2,3:749\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadFiatCouponInfo$1\n*L\n705#1:749,3\n*E\n"})
public final class FastTradeViewModel$loadFiatCouponInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    float F$0;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$loadFiatCouponInfo$1(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$loadFiatCouponInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$loadFiatCouponInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$loadFiatCouponInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00cd A[PHI: r1
      0x00cd: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:13:0x0053, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:
    
        if (r4.m47291R0(r10) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
    
        if (r11.m47291R0(r10) == r0) goto L28;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strM102326h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            strM102326h = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49825c(), "");
            if (strM102326h.length() > 0) {
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C20694xbf8bb667(strM102326h, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj != coroutine_suspended) {
                }
            } else {
                FastTradeViewModel fastTradeViewModel = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            float fFloatValue = ((Number) pair.getFirst()).floatValue() * 3600000;
            long jLongValue = ((Number) pair.getSecond()).longValue();
            if (System.currentTimeMillis() - jLongValue > fFloatValue) {
                FastTradeViewModel fastTradeViewModel2 = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                this.L$1 = SpillingKt.nullOutSpilledVariable(pair);
                this.L$2 = null;
                this.F$0 = fFloatValue;
                this.J$0 = jLongValue;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
        FastTradeViewModel fastTradeViewModel3 = this.this$0;
        this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        return coroutine_suspended;
    }
}
