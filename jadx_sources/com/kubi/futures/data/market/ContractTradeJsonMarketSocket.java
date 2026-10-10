package com.kubi.futures.data.market;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.kucoin.manager.ContractTradeSocketConfig;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.market.model.WsPriceEntity;
import com.kubi.kumex.data.market.model.WsQuotesEntity;
import com.kubi.kumex.data.market.model.WsTickerEntity;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.DowngradeExKt;
import er.C37237b;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.data.market.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ContractTradeJsonMarketSocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/futures/data/market/ContractTradeJsonMarketSocket;", "Lcom/kubi/futures/data/market/ContractTradeMarketSocket;", "marketSocket", "Lcom/kubi/futures/data/market/IMarketSocket;", "marketApi", "Lcom/kubi/futures/data/market/IMarketApi;", "<init>", "(Lcom/kubi/futures/data/market/IMarketSocket;Lcom/kubi/futures/data/market/IMarketApi;)V", "isHit", "", "observeTicker", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "symbol", "", "observeBook", "Lcom/kubi/kumex/logic/book/BookEntity;", "precision", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractTradeJsonMarketSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractTradeJsonMarketSocket.kt\ncom/kubi/futures/data/market/ContractTradeJsonMarketSocket\n+ 2 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n58#2,6:91\n64#2,2:98\n58#2,6:100\n64#2,2:107\n58#2,6:109\n64#2,2:116\n58#2,6:118\n64#2,2:125\n126#3:97\n126#3:106\n126#3:115\n126#3:124\n1#4:127\n*S KotlinDebug\n*F\n+ 1 ContractTradeJsonMarketSocket.kt\ncom/kubi/futures/data/market/ContractTradeJsonMarketSocket\n*L\n61#1:91,6\n61#1:98,2\n62#1:100,6\n62#1:107,2\n63#1:109,6\n63#1:116,2\n64#1:118,6\n64#1:125,2\n61#1:97\n62#1:106\n63#1:115\n64#1:124\n*E\n"})
public final class ContractTradeJsonMarketSocket implements ContractTradeMarketSocket {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IMarketSocket f22718a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final IMarketApi f22719b;

    /* JADX INFO: renamed from: com.kubi.futures.data.market.i$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class a extends TypeToken<TickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.i$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<WsTickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.i$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class c extends TypeToken<WsQuotesEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.i$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class d extends TypeToken<WsPriceEntity> {
    }

    public ContractTradeJsonMarketSocket(@NotNull IMarketSocket marketSocket, @NotNull IMarketApi marketApi) {
        Intrinsics.checkNotNullParameter(marketSocket, "marketSocket");
        Intrinsics.checkNotNullParameter(marketApi, "marketApi");
        this.f22718a = marketSocket;
        this.f22719b = marketApi;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m24841l(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m24842m(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static final BookEntity m24843n(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13019z.m24882i(it, str);
    }

    /* JADX INFO: renamed from: o */
    public static final BookEntity m24844o(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BookEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m24845p(String str, String str2, String str3, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str)) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str2)) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str3) && Intrinsics.areEqual(it.getSubject(), "funding.rate");
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m24846q(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public static final ObservableSource m24847r(String str, String str2, Message it) {
        Parcelable parcelable;
        Observable observableJust;
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new a().getType());
                } catch (Throwable unused) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        } else if (Intrinsics.areEqual(it.getTopic(), str)) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data2 = it.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x2 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data2, new b().getType());
                } catch (Throwable unused2) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        } else if (Intrinsics.areEqual(it.getTopic(), str2)) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data3 = it.getData();
                    Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x3 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data3, new c().getType());
                } catch (Throwable unused3) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        } else {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data4 = it.getData();
                    Intrinsics.checkNotNull(data4, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x4 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data4, new d().getType());
                } catch (Throwable unused4) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        }
        return (parcelable == null || (observableJust = Observable.just(parcelable)) == null) ? Observable.empty() : observableJust;
    }

    /* JADX INFO: renamed from: s */
    public static final ObservableSource m24848s(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    @Override // com.kubi.futures.data.market.ContractTradeMarketSocket
    @NotNull
    /* JADX INFO: renamed from: a */
    public Observable<BookEntity> mo24719a(@NotNull final String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final String strM66551u = DowngradeExKt.m66551u("/contractMarket/level2Depth50:%s", new Object[]{symbol + '_' + i11}, null, 2, null);
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(this.f22718a.m24861b(symbol, 50, i11), strM66551u), companion.unsubscribe(this.f22718a.m24861b(symbol, 50, i11), strM66551u), null, false, C37237b.m83279b(), 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ContractTradeJsonMarketSocket.m24841l(strM66551u, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.futures.data.market.f
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ContractTradeJsonMarketSocket.m24842m(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable observableM66399m = FlowableCompatKt.m66399m(observableFilter);
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractTradeJsonMarketSocket.m24843n(symbol, (Message) obj);
            }
        };
        Observable<BookEntity> map = observableM66399m.map(new Function() { // from class: com.kubi.futures.data.market.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ContractTradeJsonMarketSocket.m24844o(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.kubi.futures.data.market.ContractTradeMarketSocket
    @NotNull
    /* JADX INFO: renamed from: b */
    public Observable<TickerEntity> mo24720b(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final String strM66551u = DowngradeExKt.m66551u("/contractMarket/ticker:%s", new Object[]{symbol}, null, 2, null);
        final String strM66551u2 = DowngradeExKt.m66551u("/contractMarket/snapshotV3:%s", new Object[]{symbol}, null, 2, null);
        final String strM66551u3 = DowngradeExKt.m66551u("/contract/instrument:%s", new Object[]{symbol}, null, 2, null);
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(this.f22719b.mo24809i(symbol), strM66551u, strM66551u2, strM66551u3), companion.unsubscribe(this.f22719b.mo24809i(symbol), strM66551u, strM66551u2, strM66551u3), null, false, C37237b.m83279b(), 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ContractTradeJsonMarketSocket.m24845p(strM66551u, strM66551u2, strM66551u3, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.futures.data.market.b
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ContractTradeJsonMarketSocket.m24846q(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractTradeJsonMarketSocket.m24847r(strM66551u, strM66551u2, (Message) obj);
            }
        };
        Observable<R> observableFlatMap = observableFilter.flatMap(new Function() { // from class: com.kubi.futures.data.market.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ContractTradeJsonMarketSocket.m24848s(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return C13019z.m24880g(observableFlatMap);
    }

    @Override // com.kubi.futures.data.market.ContractTradeMarketSocket
    /* JADX INFO: renamed from: c */
    public boolean mo24721c() {
        return !ContractTradeSocketConfig.f28114a.m32566a();
    }
}
