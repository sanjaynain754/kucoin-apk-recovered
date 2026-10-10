package com.kubi.payment.fast.common.helper;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.payment.fast.data.entities.TradeConfig;
import com.kubi.payment.fast.data.source.remote.FastWebService;
import com.kubi.utils.extensions.C27025c;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TradeLimitHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/fast/common/helper/TradeLimitHelper;", "", "<init>", "()V", "flowApi", "Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "kotlin.jvm.PlatformType", "getFlowApi", "()Lcom/kubi/payment/fast/data/source/remote/FastWebService;", "flowApi$delegate", "Lkotlin/Lazy;", "isLimit", "", "legal", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeLimitHelper {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f38576b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f38577a = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fast.common.helper.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeLimitHelper.m46372b();
        }
    });

    /* JADX INFO: compiled from: TradeLimitHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/common/helper/TradeLimitHelper$Companion;", "", "<init>", "()V", "LOCK_24_HOURS", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: c */
    public final FastWebService m46373c() {
        return (FastWebService) this.f38577a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m46374d(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        TradeLimitHelper$isLimit$1 tradeLimitHelper$isLimit$1;
        if (continuation instanceof TradeLimitHelper$isLimit$1) {
            tradeLimitHelper$isLimit$1 = (TradeLimitHelper$isLimit$1) continuation;
            int i11 = tradeLimitHelper$isLimit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeLimitHelper$isLimit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeLimitHelper$isLimit$1 = new TradeLimitHelper$isLimit$1(this, continuation);
            }
        } else {
            tradeLimitHelper$isLimit$1 = new TradeLimitHelper$isLimit$1(this, continuation);
        }
        Object objM42830k = tradeLimitHelper$isLimit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeLimitHelper$isLimit$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e<TradeConfig> interfaceC41634eM46504o = m46373c().m46504o(str, "LOCK_24_HOURS");
            tradeLimitHelper$isLimit$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            tradeLimitHelper$isLimit$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM46504o, tradeLimitHelper$isLimit$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        TradeConfig tradeConfig = (TradeConfig) objM42830k;
        return Boxing.boxBoolean(C27025c.m66566d(tradeConfig != null ? Boxing.boxBoolean(tradeConfig.isLockLimit()) : null));
    }

    /* JADX INFO: renamed from: b */
    public static final FastWebService m46372b() {
        return (FastWebService) C42597a.m93387c().create(FastWebService.class);
    }
}
