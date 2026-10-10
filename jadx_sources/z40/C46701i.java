package z40;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.tradingbotkit.entity.CurrencyBalanceEntity;
import com.kubi.tradingbotkit.entity.CurrencyBalanceSocketEntity;
import com.kubi.tradingbotkit.exeption.BotMessage;
import com.kubi.tradingbotkit.model.CurrencyBalanceModel;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import q50.C43633a;
import q50.C43634b;

/* JADX INFO: renamed from: z40.i */
/* JADX INFO: compiled from: SocketObserver.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0002J@\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u0015j\b\u0012\u0004\u0012\u00020\u0010`\u00160\u000b2\"\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00190\u0018j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0019`\u001aJL\u0010\u001b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c0\u0018j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c`\u001a0\u000b2\"\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d0\u0018j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d`\u001aR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/socket/SocketObserver;", "", "<init>", "()V", "tradingBotSocket", "Lcom/kubi/tradingbotkit/business/socket/ITradingBotSocket;", "getTradingBotSocket", "()Lcom/kubi/tradingbotkit/business/socket/ITradingBotSocket;", "tradingBotSocket$delegate", "Lkotlin/Lazy;", "getAccountBalance", "Lio/reactivex/Observable;", "Lcom/kubi/tradingbotkit/model/CurrencyBalanceModel;", "quoteCode", "", "getSymbolPrice", "Lcom/kubi/tradingbotkit/model/FuturesGridSymbolPriceModel;", "symbol", "cover2PriceModel", "t1", "getSymbolsPrice", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hashMap", "Ljava/util/HashMap;", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "Lkotlin/collections/HashMap;", "getStrategyListPrice", "Ljava/math/BigDecimal;", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketObserver.kt\ncom/kubi/tradingbotkit/business/socket/SocketObserver\n+ 2 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,288:1\n51#2,2:289\n1869#3,2:291\n1869#3,2:293\n58#4,6:295\n64#4,2:302\n58#4,6:304\n64#4,2:311\n58#4,6:313\n64#4,2:320\n58#4,6:322\n64#4,2:329\n58#4,6:331\n64#4,2:338\n58#4,6:340\n64#4,2:347\n58#4,6:349\n64#4,2:356\n58#4,6:358\n64#4,2:365\n58#4,6:367\n64#4,2:374\n126#5:301\n126#5:310\n126#5:319\n126#5:328\n126#5:337\n126#5:346\n126#5:355\n126#5:364\n126#5:373\n*S KotlinDebug\n*F\n+ 1 SocketObserver.kt\ncom/kubi/tradingbotkit/business/socket/SocketObserver\n*L\n55#1:289,2\n182#1:291,2\n234#1:293,2\n85#1:295,6\n85#1:302,2\n89#1:304,6\n89#1:311,2\n122#1:313,6\n122#1:320,2\n124#1:322,6\n124#1:329,2\n127#1:331,6\n127#1:338,2\n129#1:340,6\n129#1:347,2\n205#1:349,6\n205#1:356,2\n263#1:358,6\n263#1:365,2\n271#1:367,6\n271#1:374,2\n85#1:301\n89#1:310\n122#1:319\n124#1:328\n127#1:337\n129#1:346\n205#1:355\n263#1:364\n271#1:373\n*E\n"})
public final class C46701i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f104537a = LazyKt.lazy(new Function0() { // from class: z40.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C46701i.m102945p();
        }
    });

    /* JADX INFO: renamed from: z40.i$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class a extends TypeToken<CurrencyBalanceEntity> {
    }

    /* JADX INFO: renamed from: z40.i$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<CurrencyBalanceSocketEntity> {
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m102939i(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat") || Intrinsics.areEqual("/account/balance", it.getTopic());
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m102940j(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m102941k(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objOpt = new JSONObject(C27041f.m66668h(it.getData())).opt(FirebaseAnalytics.Param.CURRENCY);
        Object objOpt2 = new JSONObject(C27041f.m66668h(it.getData())).opt("relationEvent");
        return Intrinsics.areEqual(it.getSource(), "heartbeat") || (Intrinsics.areEqual("/account/balance", it.getTopic()) && Intrinsics.areEqual(objOpt, str) && (Intrinsics.areEqual(objOpt2, "trade.hold") || Intrinsics.areEqual(objOpt2, "trade.setted") || Intrinsics.areEqual(objOpt2, "trade.transfer") || Intrinsics.areEqual(objOpt2, "trade.other")));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m102942l(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public static final CurrencyBalanceModel m102943m(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        Object objM66914d = null;
        if (Intrinsics.areEqual(s11.getSource(), "heartbeat")) {
            if (s11.getData() != null && !TextUtils.isEmpty(s11.getData())) {
                try {
                    String data = s11.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new a().getType());
                } catch (Throwable unused) {
                }
            }
            return new C43633a().m96029a((CurrencyBalanceEntity) objM66914d);
        }
        if (s11.getData() != null && !TextUtils.isEmpty(s11.getData())) {
            try {
                String data2 = s11.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new b().getType());
            } catch (Throwable unused2) {
            }
        }
        return new C43634b().m96030a((CurrencyBalanceSocketEntity) objM66914d);
    }

    /* JADX INFO: renamed from: n */
    public static final CurrencyBalanceModel m102944n(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (CurrencyBalanceModel) function1.invoke(p11);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Observable<CurrencyBalanceModel> m102946h(@NotNull final String quoteCode) {
        Intrinsics.checkNotNullParameter(quoteCode, "quoteCode");
        if (quoteCode.length() == 0) {
            C43846g.m96568c(new BotMessage("SocketObserver：quoteCode is empty", "v1/account/currency-balance", false, 4, null), null, 2, null);
        }
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(m102947o().m102931f("TRADE", quoteCode), "/account/balance"), companion.unsubscribe(m102947o().m102931f("TRADE", quoteCode), "/account/balance"), null, false, null, 20, null);
        final Function1 function1 = new Function1() { // from class: z40.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C46701i.m102939i((Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: z40.c
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C46701i.m102940j(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: z40.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C46701i.m102941k(quoteCode, (Message) obj));
            }
        };
        Observable<Message> observableFilter2 = observableFilter.filter(new Predicate() { // from class: z40.e
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C46701i.m102942l(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: z40.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46701i.m102943m((Message) obj);
            }
        };
        Observable map = observableFilter2.map(new Function() { // from class: z40.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C46701i.m102944n(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC46693a m102947o() {
        Object value = this.f104537a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC46693a) value;
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC46693a m102945p() {
        return (InterfaceC46693a) C42597a.m93390f().create(InterfaceC46693a.class);
    }
}
