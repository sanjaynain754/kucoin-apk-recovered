package com.kubi.assets.knb;

import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.rate.CurrencyPrice;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ExchangeRateHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\f*\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/knb/ExchangeRateHelper;", "", "<init>", "()V", "mApi", "Lcom/kubi/assets/knb/KnbApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/assets/knb/KnbApi;", "mApi$delegate", "Lkotlin/Lazy;", "CURRENT_CURRENCY", "", FirebaseAnalytics.Param.PRICE, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getCurrentCurrencyConfig", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentCurrencyUsdValue", FirebaseAnalytics.Param.CURRENCY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nExchangeRateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExchangeRateHelper.kt\ncom/kubi/assets/knb/ExchangeRateHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class ExchangeRateHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ExchangeRateHelper f17844a = new ExchangeRateHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f17845b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.knb.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeRateHelper.m17512e();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static HashMap<String, Double> f17846c = new HashMap<>();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m17513b(@NotNull Continuation<? super Unit> continuation) {
        ExchangeRateHelper$getCurrentCurrencyConfig$1 exchangeRateHelper$getCurrentCurrencyConfig$1;
        HashMap<String, Double> mapM89968f;
        HashMap<String, Double> mapM89968f2;
        if (continuation instanceof ExchangeRateHelper$getCurrentCurrencyConfig$1) {
            exchangeRateHelper$getCurrentCurrencyConfig$1 = (ExchangeRateHelper$getCurrentCurrencyConfig$1) continuation;
            int i11 = exchangeRateHelper$getCurrentCurrencyConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                exchangeRateHelper$getCurrentCurrencyConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                exchangeRateHelper$getCurrentCurrencyConfig$1 = new ExchangeRateHelper$getCurrentCurrencyConfig$1(this, continuation);
            }
        } else {
            exchangeRateHelper$getCurrentCurrencyConfig$1 = new ExchangeRateHelper$getCurrentCurrencyConfig$1(this, continuation);
        }
        Object objM42830k = exchangeRateHelper$getCurrentCurrencyConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = exchangeRateHelper$getCurrentCurrencyConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            if (!Intrinsics.areEqual("USD", C41016c.m89965c()) || (mapM89968f = C41016c.m89968f()) == null || mapM89968f.isEmpty()) {
                InterfaceC41634e<CurrencyPrice> interfaceC41634eM17537a = m17515d().m17537a("USD");
                exchangeRateHelper$getCurrentCurrencyConfig$1.label = 1;
                objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17537a, exchangeRateHelper$getCurrentCurrencyConfig$1);
                if (objM42830k == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                mapM89968f2 = C41016c.m89968f();
                Intrinsics.checkNotNull(mapM89968f2);
            }
            f17846c = mapM89968f2;
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM42830k);
        CurrencyPrice currencyPrice = (CurrencyPrice) objM42830k;
        if (currencyPrice == null || (mapM89968f2 = currencyPrice.getPrice()) == null) {
            mapM89968f2 = new HashMap<>();
        }
        f17846c = mapM89968f2;
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m17514c(@Nullable String str, @Nullable String str2) {
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalM11724a;
        Double d11 = f17846c.get(str2);
        String plainString = null;
        if (d11 != null) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(d11.doubleValue()));
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
            if (bigDecimalM66536f != null) {
                bigDecimalMultiply = bigDecimalM66536f.multiply(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                bigDecimalMultiply = null;
            }
            if (bigDecimalMultiply != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimalMultiply)) != null) {
                plainString = bigDecimalM11724a.toPlainString();
            }
        }
        return plainString == null ? "" : plainString;
    }

    /* JADX INFO: renamed from: d */
    public final KnbApi m17515d() {
        return (KnbApi) f17845b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static final KnbApi m17512e() {
        return (KnbApi) C42597a.m93387c().create(KnbApi.class);
    }
}
