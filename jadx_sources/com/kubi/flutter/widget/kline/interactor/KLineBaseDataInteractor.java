package com.kubi.flutter.widget.kline.interactor;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.CandleListKt$Dsl;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.OrderList;
import com.kubi.flutter.proto.kline.OrderListKt$Dsl;
import com.kubi.flutter.widget.kline.C12802p;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineCdnRange;
import com.kubi.flutter.widget.kline.utils.DynamicObservable;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.utils.C27099x;
import er.C37237b;
import er.InterfaceC37236a;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineBaseDataInteractor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 12\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0016H\u0004J\f\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0002J\f\u0010\u0017\u001a\u00020\u0006*\u00020\u0018H\u0002J!\u0010\u0019\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0003\u0010\u001c\u001a\u00020\u001bH$¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\bH$J\b\u0010\u001f\u001a\u00020 H\u0014J \u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH$J,\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH¤@¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0014J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0007\u001a\u00020\u000fH¤@¢\u0006\u0002\u0010\u0010J$\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000bH¤@¢\u0006\u0002\u0010\u0012J\u0014\u0010,\u001a\u00020**\u00020-2\u0006\u0010.\u001a\u00020/H$J\u0014\u00100\u001a\u00020**\u00020-2\u0006\u0010.\u001a\u00020/H$¨\u00063"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "<init>", "()V", "bindDataPushFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/flutter/proto/kline/CandleList;", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "loadCdnData", "previousTime", "", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadActiveOrderData", "Lcom/kubi/flutter/proto/kline/OrderList;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHistoryOrderData", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toCandles", "", "Lcom/kubi/flutter/proto/kline/CandleItem;", "Lcom/kubi/network/websocket/model/Message;", "toCandleList", "Lcom/kubi/kucoin/manager/SpotCandlePushEntity;", "toCandleItem", "", "", "source", "([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "getTopic", "useSpotMarketCandleAdapter", "", "buildKlineRequest", "Lokhttp3/Request;", "begin", "end", "fetchCdnKlineList", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSocketClient", "Lcom/kubi/network/api/IWebSocketClient;", "fetchActiveOrderList", "Lcom/kubi/flutter/proto/kline/OrderItem;", "fetchHistoryOrderList", "toActiveOrderItem", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", Constants.BIZ, "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "toHistoryOrderItem", "Companion", "WsCandlesEntity", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineBaseDataInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CandleListKt.kt\ncom/kubi/flutter/proto/kline/CandleListKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 OrderListKt.kt\ncom/kubi/flutter/proto/kline/OrderListKtKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 9 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n*L\n1#1,225:1\n774#2:226\n865#2,2:227\n1056#2:229\n1056#2:232\n1068#2:235\n1563#2:247\n1634#2,3:248\n774#2:261\n865#2,2:262\n1056#2:264\n774#2:274\n865#2,2:275\n8#3:230\n8#3:265\n8#3:267\n8#3:279\n1#4:231\n1#4:234\n1#4:237\n1#4:260\n1#4:266\n1#4:268\n1#4:273\n1#4:280\n8#5:233\n8#5:236\n58#6,6:238\n64#6,2:245\n58#6,6:251\n64#6,2:258\n126#7:244\n126#7:257\n37#8:269\n36#8,3:270\n8#9:277\n8#9:278\n*S KotlinDebug\n*F\n+ 1 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n*L\n103#1:226\n103#1:227,2\n104#1:229\n113#1:232\n125#1:235\n139#1:247\n139#1:248,3\n143#1:261\n143#1:262,2\n143#1:264\n153#1:274\n153#1:275,2\n106#1:230\n146#1:265\n152#1:267\n82#1:279\n106#1:231\n114#1:234\n126#1:237\n146#1:266\n152#1:268\n82#1:280\n114#1:233\n126#1:236\n139#1:238,6\n139#1:245,2\n141#1:251,6\n141#1:258,2\n139#1:244\n141#1:257\n153#1:269\n153#1:270,3\n62#1:277\n72#1:278\n*E\n"})
public abstract class KLineBaseDataInteractor implements IKLineDataInteractor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f22456a = new Companion(null);

    /* JADX INFO: compiled from: KLineBaseDataInteractor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$Companion;", "", "<init>", "()V", "TAG", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: KLineBaseDataInteractor.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$WsCandlesEntity;", "", "subject", "", "symbol", KlineFlutterMiniConstants.PROP_CANDLES, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getCandles", "()[Ljava/lang/String;", "setCandles", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class WsCandlesEntity {

        @NotNull
        private String[] candles;

        @NotNull
        private String subject;

        @NotNull
        private String symbol;

        public WsCandlesEntity(@NotNull String subject, @NotNull String symbol, @NotNull String[] candles) {
            Intrinsics.checkNotNullParameter(subject, "subject");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(candles, "candles");
            this.subject = subject;
            this.symbol = symbol;
            this.candles = candles;
        }

        @NotNull
        public final String[] getCandles() {
            return this.candles;
        }

        @NotNull
        public final String getSubject() {
            return this.subject;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        public final void setCandles(@NotNull String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "<set-?>");
            this.candles = strArr;
        }

        public final void setSubject(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.subject = str;
        }

        public final void setSymbol(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.symbol = str;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n*L\n1#1,328:1\n113#2:329\n*E\n"})
    public static final class C12771a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((OrderItem) t11).getTime()), Long.valueOf(((OrderItem) t12).getTime()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n*L\n1#1,328:1\n104#2:329\n*E\n"})
    public static final class C12772b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((CandleItem) t11).getTime()), Long.valueOf(((CandleItem) t12).getTime()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n*L\n1#1,328:1\n125#2:329\n*E\n"})
    public static final class C12773c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((OrderItem) t12).getTime()), Long.valueOf(((OrderItem) t11).getTime()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12774d extends TypeToken<ArrayList<String[]>> {
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12775e extends TypeToken<WsCandlesEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n*L\n1#1,328:1\n143#2:329\n*E\n"})
    public static final class C12776f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((CandleItem) t11).getTime()), Long.valueOf(((CandleItem) t12).getTime()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public abstract Request mo24306q(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, long j12);

    @Nullable
    /* JADX INFO: renamed from: r */
    public abstract Object mo24307r(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super List<OrderItem>> continuation);

    @Nullable
    /* JADX INFO: renamed from: s */
    public abstract Object mo24308s(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, long j12, @NotNull Continuation<? super List<CandleItem>> continuation);

    @Nullable
    /* JADX INFO: renamed from: t */
    public abstract Object mo24309t(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super List<OrderItem>> continuation);

    @NotNull
    /* JADX INFO: renamed from: v */
    public abstract String mo24311v(@NotNull IKLineDataInteractor.DataParam dataParam);

    @NotNull
    /* JADX INFO: renamed from: z */
    public abstract CandleItem mo24312z(@NotNull String[] strArr, @NotNull String str);

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ CandleItem m24289A(KLineBaseDataInteractor kLineBaseDataInteractor, String[] strArr, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCandleItem");
        }
        if ((i11 & 1) != 0) {
            str = "heartbeat";
        }
        return kLineBaseDataInteractor.mo24312z(strArr, str);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m24298m(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m24299n(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public static final CandleList m24300o(KLineBaseDataInteractor kLineBaseDataInteractor, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CandleListKt$Dsl.Companion companion = CandleListKt$Dsl.f22079b;
        CandleList.C12644b c12644bNewBuilder = CandleList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12644bNewBuilder, "newBuilder(...)");
        CandleListKt$Dsl candleListKt$Dsl_create = companion._create(c12644bNewBuilder);
        candleListKt$Dsl_create.m23916b(candleListKt$Dsl_create.m23917c(), kLineBaseDataInteractor.m24305B(it));
        candleListKt$Dsl_create.m23918d(Intrinsics.areEqual(it.getSource(), "socket") ? CandleList.UpdateType.UPDATE_BY_PUSH : CandleList.UpdateType.UPDATE_BY_PULL);
        return candleListKt$Dsl_create.m23915a();
    }

    /* JADX INFO: renamed from: p */
    public static final CandleList m24301p(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (CandleList) function1.invoke(p11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Object m24302w(KLineBaseDataInteractor kLineBaseDataInteractor, IKLineDataInteractor.OrderParam orderParam, Continuation<? super OrderList> continuation) {
        KLineBaseDataInteractor$loadActiveOrderData$1 kLineBaseDataInteractor$loadActiveOrderData$1;
        if (continuation instanceof KLineBaseDataInteractor$loadActiveOrderData$1) {
            kLineBaseDataInteractor$loadActiveOrderData$1 = (KLineBaseDataInteractor$loadActiveOrderData$1) continuation;
            int i11 = kLineBaseDataInteractor$loadActiveOrderData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineBaseDataInteractor$loadActiveOrderData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineBaseDataInteractor$loadActiveOrderData$1 = new KLineBaseDataInteractor$loadActiveOrderData$1(kLineBaseDataInteractor, continuation);
            }
        } else {
            kLineBaseDataInteractor$loadActiveOrderData$1 = new KLineBaseDataInteractor$loadActiveOrderData$1(kLineBaseDataInteractor, continuation);
        }
        Object objMo24307r = kLineBaseDataInteractor$loadActiveOrderData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineBaseDataInteractor$loadActiveOrderData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo24307r);
            kLineBaseDataInteractor$loadActiveOrderData$1.L$0 = SpillingKt.nullOutSpilledVariable(kLineBaseDataInteractor);
            kLineBaseDataInteractor$loadActiveOrderData$1.L$1 = SpillingKt.nullOutSpilledVariable(orderParam);
            kLineBaseDataInteractor$loadActiveOrderData$1.label = 1;
            objMo24307r = kLineBaseDataInteractor.mo24307r(orderParam, kLineBaseDataInteractor$loadActiveOrderData$1);
            if (objMo24307r == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo24307r);
        }
        List listSortedWith = CollectionsKt.sortedWith((Iterable) objMo24307r, new C12771a());
        OrderListKt$Dsl.Companion companion = OrderListKt$Dsl.f22154b;
        OrderList.C12691b c12691bNewBuilder = OrderList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12691bNewBuilder, "newBuilder(...)");
        OrderListKt$Dsl orderListKt$Dsl_create = companion._create(c12691bNewBuilder);
        orderListKt$Dsl_create.m23988b(orderListKt$Dsl_create.m23989c(), listSortedWith);
        orderListKt$Dsl_create.m23990d(OrderList.OrderType.ORDER_ACTIVE);
        return orderListKt$Dsl_create.m23987a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Object m24303x(KLineBaseDataInteractor kLineBaseDataInteractor, IKLineDataInteractor.DataParam dataParam, long j11, Continuation<? super CandleList> continuation) {
        KLineBaseDataInteractor$loadCdnData$1 kLineBaseDataInteractor$loadCdnData$1;
        KLineBaseDataInteractor kLineBaseDataInteractor2;
        KLineCdnRange kLineCdnRange;
        IKLineDataInteractor.DataParam dataParam2;
        if (continuation instanceof KLineBaseDataInteractor$loadCdnData$1) {
            kLineBaseDataInteractor$loadCdnData$1 = (KLineBaseDataInteractor$loadCdnData$1) continuation;
            int i11 = kLineBaseDataInteractor$loadCdnData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineBaseDataInteractor$loadCdnData$1.label = i11 - Integer.MIN_VALUE;
                kLineBaseDataInteractor2 = kLineBaseDataInteractor;
            } else {
                kLineBaseDataInteractor2 = kLineBaseDataInteractor;
                kLineBaseDataInteractor$loadCdnData$1 = new KLineBaseDataInteractor$loadCdnData$1(kLineBaseDataInteractor2, continuation);
            }
        } else {
            kLineBaseDataInteractor2 = kLineBaseDataInteractor;
            kLineBaseDataInteractor$loadCdnData$1 = new KLineBaseDataInteractor$loadCdnData$1(kLineBaseDataInteractor2, continuation);
        }
        KLineBaseDataInteractor$loadCdnData$1 kLineBaseDataInteractor$loadCdnData$2 = kLineBaseDataInteractor$loadCdnData$1;
        Object obj = kLineBaseDataInteractor$loadCdnData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineBaseDataInteractor$loadCdnData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(dataParam.getType(), j11);
            KLineRealTimeLog.f22494a.m24393a("fetchCdnKlineList,symbol=" + dataParam.getSymbol() + ",type=" + dataParam.getType().getType() + ",begin=" + kLineCdnRangeM24368c.getBegin() + ",end=" + kLineCdnRangeM24368c.getEnd());
            long begin = kLineCdnRangeM24368c.getBegin();
            long end = kLineCdnRangeM24368c.getEnd();
            kLineBaseDataInteractor$loadCdnData$2.L$0 = SpillingKt.nullOutSpilledVariable(kLineBaseDataInteractor2);
            kLineBaseDataInteractor$loadCdnData$2.L$1 = dataParam;
            kLineBaseDataInteractor$loadCdnData$2.L$2 = kLineCdnRangeM24368c;
            kLineBaseDataInteractor$loadCdnData$2.J$0 = j11;
            kLineBaseDataInteractor$loadCdnData$2.label = 1;
            Object objMo24308s = kLineBaseDataInteractor2.mo24308s(dataParam, begin, end, kLineBaseDataInteractor$loadCdnData$2);
            if (objMo24308s == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objMo24308s;
            kLineCdnRange = kLineCdnRangeM24368c;
            dataParam2 = dataParam;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kLineCdnRange = (KLineCdnRange) kLineBaseDataInteractor$loadCdnData$2.L$2;
            dataParam2 = (IKLineDataInteractor.DataParam) kLineBaseDataInteractor$loadCdnData$2.L$1;
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((CandleItem) obj2).getTime() != 0) {
                arrayList.add(obj2);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new C12772b());
        KLineRealTimeLog.f22494a.m24393a("fetchCdnKlineList,symbol=" + dataParam2.getSymbol() + ",type=" + dataParam2.getType().getType() + ",begin=" + kLineCdnRange.getBegin() + ",end=" + kLineCdnRange.getEnd() + ",list=" + listSortedWith.size());
        CandleListKt$Dsl.Companion companion = CandleListKt$Dsl.f22079b;
        CandleList.C12644b c12644bNewBuilder = CandleList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12644bNewBuilder, "newBuilder(...)");
        CandleListKt$Dsl candleListKt$Dsl_create = companion._create(c12644bNewBuilder);
        candleListKt$Dsl_create.m23916b(candleListKt$Dsl_create.m23917c(), listSortedWith);
        candleListKt$Dsl_create.m23918d(CandleList.UpdateType.LOAD_PAGE);
        return candleListKt$Dsl_create.m23915a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Object m24304y(KLineBaseDataInteractor kLineBaseDataInteractor, IKLineDataInteractor.OrderParam orderParam, long j11, Continuation<? super OrderList> continuation) {
        KLineBaseDataInteractor$loadHistoryOrderData$1 kLineBaseDataInteractor$loadHistoryOrderData$1;
        if (continuation instanceof KLineBaseDataInteractor$loadHistoryOrderData$1) {
            kLineBaseDataInteractor$loadHistoryOrderData$1 = (KLineBaseDataInteractor$loadHistoryOrderData$1) continuation;
            int i11 = kLineBaseDataInteractor$loadHistoryOrderData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineBaseDataInteractor$loadHistoryOrderData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineBaseDataInteractor$loadHistoryOrderData$1 = new KLineBaseDataInteractor$loadHistoryOrderData$1(kLineBaseDataInteractor, continuation);
            }
        } else {
            kLineBaseDataInteractor$loadHistoryOrderData$1 = new KLineBaseDataInteractor$loadHistoryOrderData$1(kLineBaseDataInteractor, continuation);
        }
        Object objMo24309t = kLineBaseDataInteractor$loadHistoryOrderData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineBaseDataInteractor$loadHistoryOrderData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo24309t);
            KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(orderParam.getType(), j11);
            long begin = kLineCdnRangeM24368c.getBegin();
            kLineBaseDataInteractor$loadHistoryOrderData$1.L$0 = SpillingKt.nullOutSpilledVariable(kLineBaseDataInteractor);
            kLineBaseDataInteractor$loadHistoryOrderData$1.L$1 = SpillingKt.nullOutSpilledVariable(orderParam);
            kLineBaseDataInteractor$loadHistoryOrderData$1.L$2 = SpillingKt.nullOutSpilledVariable(kLineCdnRangeM24368c);
            kLineBaseDataInteractor$loadHistoryOrderData$1.J$0 = j11;
            kLineBaseDataInteractor$loadHistoryOrderData$1.label = 1;
            objMo24309t = kLineBaseDataInteractor.mo24309t(orderParam, begin, kLineBaseDataInteractor$loadHistoryOrderData$1);
            if (objMo24309t == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo24309t);
        }
        List listSortedWith = CollectionsKt.sortedWith((Iterable) objMo24309t, new C12773c());
        OrderListKt$Dsl.Companion companion = OrderListKt$Dsl.f22154b;
        OrderList.C12691b c12691bNewBuilder = OrderList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12691bNewBuilder, "newBuilder(...)");
        OrderListKt$Dsl orderListKt$Dsl_create = companion._create(c12691bNewBuilder);
        orderListKt$Dsl_create.m23988b(orderListKt$Dsl_create.m23989c(), listSortedWith);
        orderListKt$Dsl_create.m23990d(OrderList.OrderType.ORDER_HISTORY);
        return orderListKt$Dsl_create.m23987a();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final List<CandleItem> m24305B(@NotNull Message message) {
        Collection collectionEmptyList;
        String[] candles;
        CandleItem candleItemMo24312z;
        Intrinsics.checkNotNullParameter(message, "<this>");
        Object objM66914d = null;
        if (Intrinsics.areEqual(message.getSource(), "heartbeat")) {
            if (message.getData() != null && !TextUtils.isEmpty(message.getData())) {
                try {
                    String data = message.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C12774d().getType());
                } catch (Throwable unused) {
                }
            }
            ArrayList arrayList = (ArrayList) objM66914d;
            if (arrayList != null) {
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    collectionEmptyList.add(mo24312z((String[]) it.next(), message.getSource()));
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
        } else {
            if (message.getData() != null && !TextUtils.isEmpty(message.getData())) {
                try {
                    String data2 = message.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x2 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data2, new C12775e().getType());
                } catch (Throwable unused2) {
                }
            }
            WsCandlesEntity wsCandlesEntity = (WsCandlesEntity) objM66914d;
            if (wsCandlesEntity == null || (candles = wsCandlesEntity.getCandles()) == null || (candleItemMo24312z = mo24312z(candles, message.getSource())) == null || (collectionEmptyList = CollectionsKt.listOf(candleItemMo24312z)) == null) {
                collectionEmptyList = CollectionsKt.emptyList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionEmptyList) {
            if (((CandleItem) obj).getTime() != 0) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList2, new C12776f());
    }

    @Override // com.kubi.flutter.widget.kline.IKLineDataInteractor
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<CandleList> mo24271b(@NotNull final IKLineDataInteractor.DataParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        final String strMo24311v = mo24311v(param);
        final Function0 function0 = new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KLineBaseDataInteractor.m24296k(param, this, strMo24311v);
            }
        };
        final AtomicReference atomicReference = new AtomicReference(function0.invoke());
        final AtomicReference atomicReference2 = new AtomicReference(new KLineCdnRange(0L, 0L));
        DynamicObservable dynamicObservable = new DynamicObservable(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KLineBaseDataInteractor.m24297l(param, atomicReference2, atomicReference, function0);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.flutter.widget.kline.interactor.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KLineBaseDataInteractor.m24298m(strMo24311v, (Message) obj));
            }
        };
        Observable<Message> observableFilter = dynamicObservable.filter(new Predicate() { // from class: com.kubi.flutter.widget.kline.interactor.f
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KLineBaseDataInteractor.m24299n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.flutter.widget.kline.interactor.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KLineBaseDataInteractor.m24300o(this.f22473b, (Message) obj);
            }
        };
        ObservableSource map = observableFilter.map(new Function() { // from class: com.kubi.flutter.widget.kline.interactor.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KLineBaseDataInteractor.m24301p(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return RxConvertKt.m91205b(map);
    }

    /* JADX INFO: renamed from: k */
    public static final C19406c m24296k(IKLineDataInteractor.DataParam dataParam, KLineBaseDataInteractor kLineBaseDataInteractor, String str) {
        KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(dataParam.getType(), System.currentTimeMillis() / ((long) 1000));
        Request requestMo24306q = kLineBaseDataInteractor.mo24306q(dataParam, kLineCdnRangeM24368c.getBegin(), kLineCdnRangeM24368c.getEnd());
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        return new C19406c(companion.subscribe(requestMo24306q, str), companion.unsubscribe(requestMo24306q, str), null, false, kLineBaseDataInteractor.mo24310u(), 12, null);
    }

    /* JADX INFO: renamed from: l */
    public static final Observable m24297l(IKLineDataInteractor.DataParam dataParam, AtomicReference atomicReference, AtomicReference atomicReference2, Function0 function0) {
        KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(dataParam.getType(), System.currentTimeMillis() / ((long) 1000));
        if (!Intrinsics.areEqual(atomicReference.get(), kLineCdnRangeM24368c)) {
            atomicReference.set(kLineCdnRangeM24368c);
            atomicReference2.set(function0.invoke());
        }
        Object obj = atomicReference2.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Observable) obj;
    }

    @Override // com.kubi.flutter.widget.kline.IKLineDataInteractor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo24270a(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, @NotNull Continuation<? super CandleList> continuation) {
        return m24303x(this, dataParam, j11, continuation);
    }

    @Override // com.kubi.flutter.widget.kline.IKLineDataInteractor
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo24272c(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super OrderList> continuation) {
        return m24302w(this, orderParam, continuation);
    }

    @Override // com.kubi.flutter.widget.kline.IKLineDataInteractor
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo24273d(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super OrderList> continuation) {
        return m24304y(this, orderParam, j11, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public InterfaceC37236a mo24310u() {
        return C37237b.m83278a();
    }
}
