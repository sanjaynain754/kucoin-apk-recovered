package com.kubi.kucoin.manager;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.s0 */
/* JADX INFO: compiled from: SpotMarketSocketAdapter.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001aJ\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007H\u0000\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n0\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n0\u0007H\u0000\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001H\u0002\u001a\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0000\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\rH\u0000\u001a\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0002\u001a\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e*\u0004\u0018\u00010\u001fH\u0002\u001a\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!*\u0004\u0018\u00010\u001fH\u0002\u001a\u0014\u0010#\u001a\u00020$*\u00020\u001f2\u0006\u0010%\u001a\u00020\u0010H\u0002¨\u0006&"}, m90084d2 = {"selectSpotMarketObservable", "Lio/reactivex/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "", "protobufEnabled", "", "protobufProvider", "Lkotlin/Function0;", "legacyProvider", "selectSpotMarketFlow", "Lkotlinx/coroutines/flow/Flow;", "filterNotNullObservable", "buildSpotLevel2Param", "", "symbol", "precision", "", "lowDevice", "parseSpotMatchJson", "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", JPushConstants.Analysis.KEY_JSON, "parseSpotCandleJson", "Lcom/kubi/kucoin/manager/SpotCandlePushEntity;", "parseSpotOrderBookJson", "Lcom/kubi/data/entity/OrderBookEntity;", "optLongCompat", "", "Lorg/json/JSONObject;", "name", "toStringList", "", "Lorg/json/JSONArray;", "toOrderBookLevels", "", "", "optDoubleCompat", "", "index", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotMarketSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotMarketSocketAdapter.kt\ncom/kubi/kucoin/manager/SpotMarketSocketAdapterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1068#3:232\n*S KotlinDebug\n*F\n+ 1 SpotMarketSocketAdapter.kt\ncom/kubi/kucoin/manager/SpotMarketSocketAdapterKt\n*L\n225#1:232\n*E\n"})
public final class C15527s0 {

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.s0$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotMarketSocketAdapter.kt\ncom/kubi/kucoin/manager/SpotMarketSocketAdapterKt\n*L\n1#1,328:1\n225#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(((double[]) t12)[0]), Double.valueOf(((double[]) t11)[0]));
        }
    }

    /* JADX INFO: renamed from: n */
    public static final List<double[]> m32682n(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i11);
            if (jSONArrayOptJSONArray != null) {
                listCreateListBuilder.add(new double[]{m32676h(jSONArrayOptJSONArray, 0), m32676h(jSONArrayOptJSONArray, 1)});
            }
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(CollectionsKt.build(listCreateListBuilder), new a()));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m32672d(@NotNull String symbol, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return C27041f.m66668h(symbol);
        }
        return C27041f.m66668h(symbol) + '_' + i11;
    }

    /* JADX INFO: renamed from: e */
    public static final <T> Observable<T> m32673e(Observable<T> observable) {
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.manager.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15527s0.m32674f(obj);
            }
        };
        Observable<T> observable2 = (Observable<T>) observable.flatMap(new Function() { // from class: com.kubi.kucoin.manager.r0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C15527s0.m32675g(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "flatMap(...)");
        return observable2;
    }

    /* JADX INFO: renamed from: f */
    public static final ObservableSource m32674f(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Observable observableJust = Observable.just(value);
        return observableJust != null ? observableJust : Observable.empty();
    }

    /* JADX INFO: renamed from: g */
    public static final ObservableSource m32675g(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final SpotMatchPushEntity m32678j(@NotNull String json) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(json);
            long jM32677i = m32677i(jSONObject, JPushConstants.Operation.KEY_SEQUENCE);
            String strOptString = jSONObject.optString("type");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = jSONObject.optString("symbol");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            String strOptString3 = jSONObject.optString("side");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            String strOptString4 = jSONObject.optString(FirebaseAnalytics.Param.PRICE);
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            String strOptString5 = jSONObject.optString("size");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            String strOptString6 = jSONObject.optString("tradeId");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
            String strOptString7 = jSONObject.optString("takerOrderId");
            Intrinsics.checkNotNullExpressionValue(strOptString7, "optString(...)");
            String strOptString8 = jSONObject.optString("makerOrderId");
            Intrinsics.checkNotNullExpressionValue(strOptString8, "optString(...)");
            objM103844constructorimpl = Result.m103844constructorimpl(new SpotMatchPushEntity(jM32677i, strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, strOptString7, strOptString8, m32677i(jSONObject, "time")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (SpotMatchPushEntity) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final OrderBookEntity m32679k(@NotNull String symbol, @NotNull String json) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(json);
            objM103844constructorimpl = Result.m103844constructorimpl(new OrderBookEntity(symbol, m32677i(jSONObject, JPushConstants.Operation.KEY_SEQUENCE), m32682n(jSONObject.optJSONArray("bids")), m32682n(jSONObject.optJSONArray("asks")), m32677i(jSONObject, "timestamp")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (OrderBookEntity) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final <T> InterfaceC41634e<T> m32680l(boolean z11, @NotNull Function0<? extends InterfaceC41634e<? extends T>> protobufProvider, @NotNull Function0<? extends InterfaceC41634e<? extends T>> legacyProvider) {
        Intrinsics.checkNotNullParameter(protobufProvider, "protobufProvider");
        Intrinsics.checkNotNullParameter(legacyProvider, "legacyProvider");
        return z11 ? protobufProvider.invoke() : legacyProvider.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final <T> Observable<T> m32681m(boolean z11, @NotNull Function0<? extends Observable<T>> protobufProvider, @NotNull Function0<? extends Observable<T>> legacyProvider) {
        Intrinsics.checkNotNullParameter(protobufProvider, "protobufProvider");
        Intrinsics.checkNotNullParameter(legacyProvider, "legacyProvider");
        return z11 ? protobufProvider.invoke() : legacyProvider.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static final double m32676h(JSONArray jSONArray, int i11) {
        String strOptString = jSONArray.optString(i11);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        Double doubleOrNull = StringsKt.toDoubleOrNull(strOptString);
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return jSONArray.optDouble(i11);
    }

    /* JADX INFO: renamed from: i */
    public static final long m32677i(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        Long longOrNull = StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return jSONObject.optLong(str);
    }
}
