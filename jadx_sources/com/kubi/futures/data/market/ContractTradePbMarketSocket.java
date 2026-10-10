package com.kubi.futures.data.market;

import android.os.Parcelable;
import android.text.TextUtils;
import com.futures.market.protobuf.AggL2DeptData;
import com.futures.tradebiz.core.model.p063pb.TradeStatisticsPb;
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
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ContractTradePbMarketSocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/data/market/ContractTradePbMarketSocket;", "Lcom/kubi/futures/data/market/ContractTradeMarketSocket;", "marketApi", "Lcom/kubi/futures/data/market/IMarketApi;", "<init>", "(Lcom/kubi/futures/data/market/IMarketApi;)V", "tradePbSocketApi", "Lcom/kubi/futures/data/market/ITradePbSocketApi;", "getTradePbSocketApi", "()Lcom/kubi/futures/data/market/ITradePbSocketApi;", "tradePbSocketApi$delegate", "Lkotlin/Lazy;", "isHit", "", "observeTicker", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "symbol", "", "observeBook", "Lcom/kubi/kumex/logic/book/BookEntity;", "precision", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractTradePbMarketSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractTradePbMarketSocket.kt\ncom/kubi/futures/data/market/ContractTradePbMarketSocket\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n49#2:86\n51#2:90\n49#2:91\n51#2:95\n46#3:87\n51#3:89\n46#3:92\n51#3:94\n105#4:88\n105#4:93\n58#5,6:96\n64#5,2:103\n58#5,6:105\n64#5,2:112\n58#5,6:114\n64#5,2:121\n126#6:102\n126#6:111\n126#6:120\n1#7:123\n*S KotlinDebug\n*F\n+ 1 ContractTradePbMarketSocket.kt\ncom/kubi/futures/data/market/ContractTradePbMarketSocket\n*L\n69#1:86\n69#1:90\n79#1:91\n79#1:95\n69#1:87\n69#1:89\n79#1:92\n79#1:94\n69#1:88\n79#1:93\n61#1:96,6\n61#1:103,2\n62#1:105,6\n62#1:112,2\n63#1:114,6\n63#1:121,2\n61#1:102\n62#1:111\n63#1:120\n*E\n"})
public final class ContractTradePbMarketSocket implements ContractTradeMarketSocket {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IMarketApi f22678a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f22679b;

    /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12941a extends TypeToken<TickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12942b extends TypeToken<WsTickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12943c extends TypeToken<WsPriceEntity> {
    }

    public ContractTradePbMarketSocket(@NotNull IMarketApi marketApi) {
        Intrinsics.checkNotNullParameter(marketApi, "marketApi");
        this.f22678a = marketApi;
        this.f22679b = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractTradePbMarketSocket.m24718n();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m24714j(String str, String str2, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str)) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str2) && Intrinsics.areEqual(it.getSubject(), "funding.rate");
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m24715k(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public static final ObservableSource m24716l(String str, Message it) {
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
                    objM66914d = C27099x.m66914d(data, new C12941a().getType());
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
                    objM66914d = C27099x.m66914d(data2, new C12942b().getType());
                } catch (Throwable unused2) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        } else {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data3 = it.getData();
                    Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x3 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data3, new C12943c().getType());
                } catch (Throwable unused3) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        }
        return (parcelable == null || (observableJust = Observable.just(parcelable)) == null) ? Observable.empty() : observableJust;
    }

    /* JADX INFO: renamed from: m */
    public static final ObservableSource m24717m(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    @Override // com.kubi.futures.data.market.ContractTradeMarketSocket
    @NotNull
    /* JADX INFO: renamed from: a */
    public Observable<BookEntity> mo24719a(@NotNull final String symbol, int i11) {
        final InterfaceC41634e interfaceC41634eM90881E;
        Observable observableM91206c;
        Observable<BookEntity> observableM66399m;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC41634e<AggL2DeptData> interfaceC41634eM24868b = m24722i().m24868b(DowngradeExKt.m66551u("/contractMarket/level2Depth50PB:%s", new Object[]{symbol + '_' + i11}, null, 2, null));
        if (interfaceC41634eM24868b != null && (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM24868b)) != null && (observableM91206c = RxConvertKt.m91206c(new InterfaceC41634e<BookEntity>() { // from class: com.kubi.futures.data.market.ContractTradePbMarketSocket$observeBook$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$observeBook$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ContractTradePbMarketSocket.kt\ncom/kubi/futures/data/market/ContractTradePbMarketSocket\n*L\n1#1,49:1\n50#2:50\n79#3:51\n*E\n"})
            public static final class C129442<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f22682b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f22683c;

                /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$observeBook$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.futures.data.market.ContractTradePbMarketSocket$observeBook$$inlined$map$1$2", m90122f = "ContractTradePbMarketSocket.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C129442.this.emit(null, this);
                    }
                }

                public C129442(InterfaceC41635f interfaceC41635f, String str) {
                    this.f22682b = interfaceC41635f;
                    this.f22683c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f22682b;
                        BookEntity bookEntityM24851b = C12996n1.m24851b((AggL2DeptData) obj, this.f22683c);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(bookEntityM24851b, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super BookEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C129442(interfaceC41635f, symbol), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C42911a.m94120b())) != null && (observableM66399m = FlowableCompatKt.m66399m(observableM91206c)) != null) {
            return observableM66399m;
        }
        Observable<BookEntity> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    @Override // com.kubi.futures.data.market.ContractTradeMarketSocket
    @NotNull
    /* JADX INFO: renamed from: b */
    public Observable<TickerEntity> mo24720b(@NotNull String symbol) {
        Observable observableEmpty;
        final InterfaceC41634e interfaceC41634eM90881E;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final String strM66551u = DowngradeExKt.m66551u("/contractMarket/ticker:%s", new Object[]{symbol}, null, 2, null);
        final String strM66551u2 = DowngradeExKt.m66551u("/contract/instrument:%s", new Object[]{symbol}, null, 2, null);
        String strM66551u3 = DowngradeExKt.m66551u("/contractMarket/snapshotV3PB:%s", new Object[]{symbol}, null, 2, null);
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(this.f22678a.mo24809i(symbol), strM66551u, strM66551u2), companion.unsubscribe(this.f22678a.mo24809i(symbol), strM66551u, strM66551u2), null, false, C37237b.m83279b(), 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ContractTradePbMarketSocket.m24714j(strM66551u, strM66551u2, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.futures.data.market.l
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ContractTradePbMarketSocket.m24715k(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractTradePbMarketSocket.m24716l(strM66551u, (Message) obj);
            }
        };
        ObservableSource observableSourceFlatMap = observableFilter.flatMap(new Function() { // from class: com.kubi.futures.data.market.n
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ContractTradePbMarketSocket.m24717m(function2, obj);
            }
        });
        InterfaceC41634e<TradeStatisticsPb> interfaceC41634eM24867a = m24722i().m24867a(strM66551u3);
        if (interfaceC41634eM24867a == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM24867a)) == null || (observableEmpty = RxConvertKt.m91206c(new InterfaceC41634e<Object>() { // from class: com.kubi.futures.data.market.ContractTradePbMarketSocket$observeTicker$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$observeTicker$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ContractTradePbMarketSocket.kt\ncom/kubi/futures/data/market/ContractTradePbMarketSocket\n*L\n1#1,49:1\n50#2:50\n69#3:51\n*E\n"})
            public static final class C129452<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f22685b;

                /* JADX INFO: renamed from: com.kubi.futures.data.market.ContractTradePbMarketSocket$observeTicker$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.futures.data.market.ContractTradePbMarketSocket$observeTicker$$inlined$map$1$2", m90122f = "ContractTradePbMarketSocket.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C129452.this.emit(null, this);
                    }
                }

                public C129452(InterfaceC41635f interfaceC41635f) {
                    this.f22685b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f22685b;
                        WsQuotesEntity wsQuotesEntityM24853d = C12996n1.m24853d((TradeStatisticsPb) obj);
                        Intrinsics.checkNotNull(wsQuotesEntityM24853d, "null cannot be cast to non-null type kotlin.Any");
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(wsQuotesEntityM24853d, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Object> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C129452(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C42911a.m94120b())) == null) {
            observableEmpty = Observable.empty();
        }
        Observable observableMerge = Observable.merge(observableSourceFlatMap, observableEmpty);
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return C13019z.m24880g(observableMerge);
    }

    @Override // com.kubi.futures.data.market.ContractTradeMarketSocket
    /* JADX INFO: renamed from: c */
    public boolean mo24721c() {
        return ContractTradeSocketConfig.f28114a.m32566a();
    }

    /* JADX INFO: renamed from: i */
    public final ITradePbSocketApi m24722i() {
        return (ITradePbSocketApi) this.f22679b.getValue();
    }

    /* JADX INFO: renamed from: n */
    public static final ITradePbSocketApi m24718n() {
        return C12996n1.m24850a();
    }
}
