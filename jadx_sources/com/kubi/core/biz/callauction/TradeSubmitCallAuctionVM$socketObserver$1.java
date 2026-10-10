package com.kubi.core.biz.callauction;

import af.C0296a;
import com.google.gson.reflect.TypeToken;
import com.kubi.core.spot.entity.OrderBook;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.mvi.common.C19241c;
import com.kubi.network.websocket.model.Message;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.sdk.websocket.WebSocketException;
import com.kubi.utils.C27099x;
import com.kubi.utils.ThemisUtils;
import g10.C37779j;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Request;
import p569qq.C43846g;
import p661ue.C45193a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeSubmitCallAuctionVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$socketObserver$1", m90122f = "TradeSubmitCallAuctionVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nTradeSubmitCallAuctionVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM$socketObserver$1\n+ 2 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n136#2,4:253\n140#2:258\n182#2:259\n1#3:257\n*S KotlinDebug\n*F\n+ 1 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM$socketObserver$1\n*L\n96#1:253,4\n96#1:258\n96#1:259\n96#1:257\n*E\n"})
public final class TradeSubmitCallAuctionVM$socketObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $inCallAuction;
    final /* synthetic */ int $precision;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ TradeSubmitCallAuctionVM this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$socketObserver$1$a */
    /* JADX INFO: compiled from: SocketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM$socketObserver$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n+ 8 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n50#2,7:246\n57#2,10:262\n57#2,10:282\n36#3:231\n36#3:239\n137#4,5:232\n137#4,5:240\n98#5,2:237\n105#5:245\n106#5,9:253\n115#5:281\n1#6:272\n44#7,8:273\n46#8,2:292\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3\n+ 2 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM$socketObserver$1\n*L\n141#1:224,7\n141#1:282,10\n145#1:231\n158#1:239\n145#1:232,5\n158#1:240,5\n178#1:292,2\n105#2:246,7\n105#2:262,10\n114#2:273,8\n*E\n"})
    public static final class C11798a implements Function1<Message, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f20298b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f20299c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TradeSubmitCallAuctionVM f20300d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f20301e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f20302f;

        /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$socketObserver$1$a$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3$invoke$lambda$6$lambda$4$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends TypeToken<OrderBookEntity> {
        }

        /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$socketObserver$1$a$b */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3$invoke$lambda$6$lambda$4$$inlined$convertToObj$2"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class b extends TypeToken<OrderBook> {
        }

        public C11798a(Function1 function1, String str, TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, String str2, String str3, TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM2) {
            this.f20298b = function1;
            this.f20299c = str;
            this.f20300d = tradeSubmitCallAuctionVM;
            this.f20301e = str2;
            this.f20302f = str3;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x013c  */
        /* JADX WARN: Code duplicated, block: B:57:0x016d A[Catch: all -> 0x0163, TryCatch #4 {all -> 0x0163, blocks: (B:62:0x01c8, B:45:0x0136, B:48:0x013e, B:50:0x0142, B:53:0x0165, B:54:0x0166, B:55:0x0167, B:57:0x016d, B:58:0x0172, B:44:0x012c, B:59:0x018a, B:61:0x01aa), top: B:84:0x002a }] */
        /* JADX WARN: Code duplicated, block: B:67:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:75:0x0210  */
        /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:75:0x0210, please report this as an issue */
        /* JADX INFO: renamed from: a */
        public final void m21623a(Message it) throws Throwable {
            boolean z11;
            boolean z12;
            Object objM103844constructorimpl;
            Throwable thM103847exceptionOrNullimpl;
            Throwable thM103847exceptionOrNullimpl2;
            Object objM66914d;
            Object objM66914d2;
            Object obj;
            Object objM103844constructorimpl2;
            Throwable thM103847exceptionOrNullimpl3;
            Throwable thM103847exceptionOrNullimpl4;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1 function1 = this.f20298b;
            String str = this.f20299c;
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z13 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    if (((Boolean) function1.invoke(it)).booleanValue()) {
                        String data = it.getData();
                        if (data == null) {
                            z11 = zM42528a;
                            z12 = z13;
                            objM66914d = null;
                        } else if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                            try {
                                C27099x c27099x = C27099x.f54458a;
                                objM66914d = C27099x.m66914d(data, new a().getType());
                            } catch (Throwable th2) {
                                C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                                objM66914d = null;
                            }
                            if (objM66914d != null) {
                                this.f20300d.m21603C0((OrderBookEntity) objM66914d, this.f20301e);
                                C44128b.m97259c("socket", "Topic->heartBeat->" + str + " 数据解析成功！");
                            } else {
                                C44128b.m97259c("socket", "Topic->heartBeat->" + str + " 数据解析失败！");
                                objM66914d = Unit.INSTANCE;
                            }
                            z11 = zM42528a;
                            z12 = z13;
                        } else {
                            try {
                                C27099x c27099x2 = C27099x.f54458a;
                                objM66914d2 = C27099x.m66914d(data, new b().getType());
                            } catch (Throwable th3) {
                                C43846g.m96569d(th3, "GsonUtils", null, 4, null);
                                objM66914d2 = null;
                            }
                            if (objM66914d2 != null) {
                                OrderBook orderBook = (OrderBook) objM66914d2;
                                boolean zM42528a2 = C19241c.f35620a.m42528a();
                                boolean z14 = !zM42528a2;
                                try {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    obj = objM66914d2;
                                    try {
                                        orderBook.setAsks(CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(orderBook.getAsks(), new C11799b())));
                                        OrderBookEntity orderBookEntity = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
                                        orderBookEntity.setSymbol(this.f20302f);
                                        z11 = zM42528a;
                                        z12 = z13;
                                        try {
                                            orderBookEntity.setSequence(orderBook.getSequence());
                                            orderBookEntity.setAsks(orderBook.getAsks());
                                            orderBookEntity.setBids(orderBook.getBids());
                                            C0296a.m1041c(this.f20300d.m21620z0(), orderBookEntity);
                                            objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Result.Companion companion3 = Result.INSTANCE;
                                            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        z11 = zM42528a;
                                        z12 = z13;
                                        Result.Companion companion4 = Result.INSTANCE;
                                        objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th));
                                        thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                                        if (thM103847exceptionOrNullimpl3 != null) {
                                            if (!zM42528a2) {
                                                throw thM103847exceptionOrNullimpl3;
                                            }
                                            throw thM103847exceptionOrNullimpl3;
                                        }
                                        thM103847exceptionOrNullimpl4 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                                        if (thM103847exceptionOrNullimpl4 != null) {
                                            C45193a.m99856c(thM103847exceptionOrNullimpl4, "TradeSubmitCallAuctionVM");
                                        }
                                        C44128b.m97259c("socket", "Topic->socket->" + str + " 数据解析成功！");
                                        objM66914d = obj;
                                        objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
                                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                        if (thM103847exceptionOrNullimpl != null) {
                                            if (!z11) {
                                                throw thM103847exceptionOrNullimpl;
                                            }
                                            throw thM103847exceptionOrNullimpl;
                                        }
                                        thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                        if (thM103847exceptionOrNullimpl2 != null) {
                                            C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
                                            C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【bindSocketHeartbeat发生错误】", thM103847exceptionOrNullimpl2);
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = objM66914d2;
                                }
                                thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                                if (thM103847exceptionOrNullimpl3 != null) {
                                    if (!zM42528a2 || (thM103847exceptionOrNullimpl3 instanceof CancellationException)) {
                                        throw thM103847exceptionOrNullimpl3;
                                    }
                                    C44128b.m97262f("crash_issue", "crash_issue->【mvi 发生错误:needCatch->" + z14 + (char) 12305, thM103847exceptionOrNullimpl3);
                                }
                                thM103847exceptionOrNullimpl4 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                                if (thM103847exceptionOrNullimpl4 != null) {
                                    C45193a.m99856c(thM103847exceptionOrNullimpl4, "TradeSubmitCallAuctionVM");
                                }
                                C44128b.m97259c("socket", "Topic->socket->" + str + " 数据解析成功！");
                                objM66914d = obj;
                            } else {
                                z11 = zM42528a;
                                z12 = z13;
                                C44128b.m97259c("socket", "Topic->socket->" + str + " 数据解析失败！");
                                objM66914d = Unit.INSTANCE;
                            }
                        }
                    } else {
                        z11 = zM42528a;
                        z12 = z13;
                        C44128b.m97259c("socket", "Topic->" + str + " 不满足过滤！");
                        objM66914d = Unit.INSTANCE;
                    }
                    objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
                } catch (Throwable th7) {
                    th = th7;
                    Result.Companion companion5 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th8) {
                th = th8;
                z11 = zM42528a;
                z12 = z13;
                Result.Companion companion6 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (!z11 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f("crash_issue", "crash_issue->【Socket 发生错误:needCatch->" + z12 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
                C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【bindSocketHeartbeat发生错误】", thM103847exceptionOrNullimpl2);
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Message message) throws Throwable {
            m21623a(message);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$socketObserver$1$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM$socketObserver$1\n*L\n1#1,328:1\n107#2:329\n*E\n"})
    public static final class C11799b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSubmitCallAuctionVM$socketObserver$1(TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, String str, int i11, boolean z11, Continuation<? super TradeSubmitCallAuctionVM$socketObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeSubmitCallAuctionVM;
        this.$symbol = str;
        this.$precision = i11;
        this.$inCallAuction = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeSubmitCallAuctionVM$socketObserver$1(this.this$0, this.$symbol, this.$precision, this.$inCallAuction, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeSubmitCallAuctionVM$socketObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m21622f(TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, Message message) {
        if (!Intrinsics.areEqual(message.getSource(), "heartbeat") && !Intrinsics.areEqual(message.getTopic(), tradeSubmitCallAuctionVM.getF20290X())) {
            return false;
        }
        return true;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM = this.this$0;
            tradeSubmitCallAuctionVM.m21609I0(tradeSubmitCallAuctionVM.m21602B0(tradeSubmitCallAuctionVM.m21617q0(this.$symbol, this.$precision)));
            if (this.$inCallAuction && SpotMarketSocketAdapter.f28144a.m32663Z(ThemisUtils.f54260a.m66413b())) {
                this.this$0.m21612N(this.$symbol);
                return Unit.INSTANCE;
            }
            if (!this.$inCallAuction && SpotMarketSocketAdapter.f28144a.m32664a0()) {
                this.this$0.m21613Z(this.$symbol, this.$precision);
                return Unit.INSTANCE;
            }
            String f20290x = this.this$0.getF20290X();
            Request f20296d0 = this.this$0.getF20296d0();
            final TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM2 = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.core.biz.callauction.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(TradeSubmitCallAuctionVM$socketObserver$1.m21622f(tradeSubmitCallAuctionVM2, (Message) obj2));
                }
            };
            TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM3 = this.this$0;
            String str = this.$symbol;
            SocketTask.Companion companion = SocketTask.f48571i;
            C37779j c37779j = new C37779j();
            c37779j.m85208e(f20296d0);
            companion.obtain(f20290x, tradeSubmitCallAuctionVM2, c37779j).m58912l(new C11798a(function1, f20290x, tradeSubmitCallAuctionVM3, str, str, tradeSubmitCallAuctionVM3));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
