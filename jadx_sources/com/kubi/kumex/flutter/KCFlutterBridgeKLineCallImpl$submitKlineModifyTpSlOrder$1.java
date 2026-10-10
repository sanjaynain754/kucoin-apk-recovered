package com.kubi.kumex.flutter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.trade.PositionHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p402kf.C41014a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCallImpl.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.flutter.KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1", m90122f = "KCFlutterBridgeKLineCallImpl.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {1061, 1064}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull", "tpslData", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeKLineCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeKLineCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1058:1\n196#2,3:1059\n196#2,3:1062\n808#3,11:1065\n1#4:1076\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeKLineCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1\n*L\n981#1:1059,3\n983#1:1062,3\n1027#1:1065,11\n*E\n"})
public final class KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $modifyTpSlOrderInfo;
    final /* synthetic */ String $positionInfo;
    final /* synthetic */ String $targetPrice;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KCFlutterBridgeKLineCallImpl this$0;

    /* JADX INFO: renamed from: g */
    public static final Unit m33740g(Ref.BooleanRef booleanRef, final Function2 function2, final PositionEntity positionEntity, final OrderEntity orderEntity, final BigDecimal bigDecimal, final int i11, final FragmentActivity fragmentActivity) {
        booleanRef.element = true;
        fragmentActivity.runOnUiThread(new Runnable() { // from class: com.kubi.kumex.flutter.p
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1.m33741h(fragmentActivity, function2, positionEntity, orderEntity, bigDecimal, i11);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, String str2, KCFlutterBridgeKLineCallImpl kCFlutterBridgeKLineCallImpl, String str3, Continuation<? super KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1> continuation) {
        super(2, continuation);
        this.$modifyTpSlOrderInfo = str;
        this.$callback = function2;
        this.$positionInfo = str2;
        this.this$0 = kCFlutterBridgeKLineCallImpl;
        this.$targetPrice = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1(this.$modifyTpSlOrderInfo, this.$callback, this.$positionInfo, this.this$0, this.$targetPrice, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m33741h(FragmentActivity fragmentActivity, Function2 function2, PositionEntity positionEntity, OrderEntity orderEntity, BigDecimal bigDecimal, int i11) {
        Function2 function3;
        Exception exc;
        Object next;
        try {
            List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                try {
                    if (obj instanceof BaseFragment) {
                        arrayList.add(obj);
                    }
                } catch (Exception e11) {
                    exc = e11;
                    function3 = function2;
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    BaseFragment baseFragment = (BaseFragment) next;
                    if (baseFragment.isShowing() && baseFragment.isAdded()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BaseFragment baseFragment2 = (BaseFragment) next;
            if (baseFragment2 == null) {
                function2.invoke(Boolean.FALSE, new ProtocolException("no visible fragment host", null, null, false, 14, null));
                return;
            }
            PositionHelper positionHelper = PositionHelper.f30771a;
            BigDecimal scale = bigDecimal.setScale(i11, RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            function3 = function2;
            try {
                positionHelper.m36462E(baseFragment2, positionEntity, orderEntity, scale, function3);
                return;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            function3 = function2;
        }
        exc = e;
        Boolean bool = Boolean.FALSE;
        String message = exc.getMessage();
        if (message == null) {
            message = "submitKlineModifyTpSlOrder error";
        }
        function3.invoke(bool, new ProtocolException(message, exc, null, false, 12, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0119 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001c, B:32:0x00de, B:34:0x0119, B:37:0x0134, B:39:0x014d, B:41:0x0151, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:49:0x016d, B:51:0x0184, B:54:0x018e, B:56:0x0194, B:59:0x019c, B:61:0x01a2, B:68:0x01b5, B:70:0x01bb, B:73:0x01c2, B:75:0x01d5, B:76:0x01ed, B:63:0x01a8, B:65:0x01ae, B:78:0x0206, B:80:0x021f, B:82:0x0238, B:84:0x0251, B:14:0x0037, B:28:0x00ac, B:17:0x003e, B:19:0x0046, B:21:0x005f, B:23:0x0067, B:25:0x0080), top: B:92:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0134 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001c, B:32:0x00de, B:34:0x0119, B:37:0x0134, B:39:0x014d, B:41:0x0151, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:49:0x016d, B:51:0x0184, B:54:0x018e, B:56:0x0194, B:59:0x019c, B:61:0x01a2, B:68:0x01b5, B:70:0x01bb, B:73:0x01c2, B:75:0x01d5, B:76:0x01ed, B:63:0x01a8, B:65:0x01ae, B:78:0x0206, B:80:0x021f, B:82:0x0238, B:84:0x0251, B:14:0x0037, B:28:0x00ac, B:17:0x003e, B:19:0x0046, B:21:0x005f, B:23:0x0067, B:25:0x0080), top: B:92:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x014d A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001c, B:32:0x00de, B:34:0x0119, B:37:0x0134, B:39:0x014d, B:41:0x0151, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:49:0x016d, B:51:0x0184, B:54:0x018e, B:56:0x0194, B:59:0x019c, B:61:0x01a2, B:68:0x01b5, B:70:0x01bb, B:73:0x01c2, B:75:0x01d5, B:76:0x01ed, B:63:0x01a8, B:65:0x01ae, B:78:0x0206, B:80:0x021f, B:82:0x0238, B:84:0x0251, B:14:0x0037, B:28:0x00ac, B:17:0x003e, B:19:0x0046, B:21:0x005f, B:23:0x0067, B:25:0x0080), top: B:92:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001c, B:32:0x00de, B:34:0x0119, B:37:0x0134, B:39:0x014d, B:41:0x0151, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:49:0x016d, B:51:0x0184, B:54:0x018e, B:56:0x0194, B:59:0x019c, B:61:0x01a2, B:68:0x01b5, B:70:0x01bb, B:73:0x01c2, B:75:0x01d5, B:76:0x01ed, B:63:0x01a8, B:65:0x01ae, B:78:0x0206, B:80:0x021f, B:82:0x0238, B:84:0x0251, B:14:0x0037, B:28:0x00ac, B:17:0x003e, B:19:0x0046, B:21:0x005f, B:23:0x0067, B:25:0x0080), top: B:92:0x000a }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final OrderEntity orderEntity;
        final PositionEntity positionEntity;
        String str;
        ContractEntity contractEntityM84661b;
        final int iM66651k;
        final BigDecimal bigDecimalM11724a;
        String id2;
        String symbol;
        String symbol2;
        String stopPriceType;
        final Ref.BooleanRef booleanRef;
        BigDecimal tickSize;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Integer numBoxInt = null;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        OrderEntity orderEntity2 = (OrderEntity) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        orderEntity = orderEntity2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                positionEntity = (PositionEntity) obj;
                C44128b.m97259c(this.this$0.getF29027a(), "modifyTpSlOrderInfo: " + orderEntity);
                C44128b.m97259c(this.this$0.getF29027a(), "positionInfo: " + this.$positionInfo);
                if (orderEntity == null) {
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("tpslData parse failed", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                if (positionEntity == null) {
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("position parse failed", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                str = this.$targetPrice;
                if (str != null && str.length() != 0) {
                    contractEntityM84661b = C37569d.m84661b(positionEntity);
                    if (contractEntityM84661b != null && (tickSize = contractEntityM84661b.getTickSize()) != null) {
                        numBoxInt = Boxing.boxInt(C41014a.m89952z(tickSize));
                    }
                    iM66651k = C27039d.m66651k(numBoxInt, 2);
                    bigDecimalM11724a = C6447a.m11724a(new BigDecimal(this.$targetPrice).setScale(iM66651k, RoundingMode.DOWN));
                    if (bigDecimalM11724a != null && bigDecimalM11724a.compareTo(BigDecimal.ZERO) > 0) {
                        id2 = orderEntity.getId();
                        if (id2 != null && !StringsKt.isBlank(id2)) {
                            symbol = orderEntity.getSymbol();
                            if ((symbol == null && !StringsKt.isBlank(symbol)) || ((symbol2 = positionEntity.getSymbol()) != null && !StringsKt.isBlank(symbol2))) {
                                stopPriceType = orderEntity.getStopPriceType();
                                if (stopPriceType != null && !StringsKt.isBlank(stopPriceType)) {
                                    booleanRef = new Ref.BooleanRef();
                                    final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
                                    C42899b.m94073c(new Function1() { // from class: com.kubi.kumex.flutter.o
                                        @Override // p852kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1.m33740g(booleanRef, function2, positionEntity, orderEntity, bigDecimalM11724a, iM66651k, (FragmentActivity) obj2);
                                        }
                                    });
                                    if (!booleanRef.element) {
                                        this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("top activity not found", null, null, false, 14, null));
                                    }
                                    return Unit.INSTANCE;
                                }
                                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("stopPriceType is empty", null, null, false, 14, null));
                                return Unit.INSTANCE;
                            }
                            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("symbol is empty", null, null, false, 14, null));
                            return Unit.INSTANCE;
                        }
                        this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("orderId is empty", null, null, false, 14, null));
                        return Unit.INSTANCE;
                    }
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("targetPrice is invalid", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("targetPrice is empty", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (StringsKt.isBlank(this.$modifyTpSlOrderInfo)) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("modifyTpSlOrderInfo is empty", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            if (StringsKt.isBlank(this.$positionInfo)) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("positionInfo is empty", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            C27099x c27099x = C27099x.f54458a;
            String str2 = this.$modifyTpSlOrderInfo;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C15974xb130bd5b(str2, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            OrderEntity orderEntity3 = (OrderEntity) obj;
            C27099x c27099x2 = C27099x.f54458a;
            String str3 = this.$positionInfo;
            InterfaceC41634e interfaceC41634eM90890N2 = C41636g.m90890N(C41636g.m90887K(new C15975xb130bd5c(str3, null)), C42911a.m94120b());
            this.L$0 = orderEntity3;
            this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x2);
            this.L$2 = SpillingKt.nullOutSpilledVariable(str3);
            this.I$0 = 0;
            this.label = 2;
            Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N2, this);
            if (objM90914f0 != coroutine_suspended) {
                orderEntity = orderEntity3;
                obj = objM90914f0;
                positionEntity = (PositionEntity) obj;
                C44128b.m97259c(this.this$0.getF29027a(), "modifyTpSlOrderInfo: " + orderEntity);
                C44128b.m97259c(this.this$0.getF29027a(), "positionInfo: " + this.$positionInfo);
                if (orderEntity == null) {
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("tpslData parse failed", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                if (positionEntity == null) {
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("position parse failed", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                str = this.$targetPrice;
                if (str != null) {
                    contractEntityM84661b = C37569d.m84661b(positionEntity);
                    if (contractEntityM84661b != null) {
                        numBoxInt = Boxing.boxInt(C41014a.m89952z(tickSize));
                    }
                    iM66651k = C27039d.m66651k(numBoxInt, 2);
                    bigDecimalM11724a = C6447a.m11724a(new BigDecimal(this.$targetPrice).setScale(iM66651k, RoundingMode.DOWN));
                    if (bigDecimalM11724a != null) {
                        id2 = orderEntity.getId();
                        if (id2 != null) {
                            symbol = orderEntity.getSymbol();
                            if (symbol == null) {
                            }
                            stopPriceType = orderEntity.getStopPriceType();
                            if (stopPriceType != null) {
                                booleanRef = new Ref.BooleanRef();
                                final Function2 function3 = this.$callback;
                                C42899b.m94073c(new Function1() { // from class: com.kubi.kumex.flutter.o
                                    @Override // p852kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1.m33740g(booleanRef, function3, positionEntity, orderEntity, bigDecimalM11724a, iM66651k, (FragmentActivity) obj2);
                                    }
                                });
                                if (!booleanRef.element) {
                                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("top activity not found", null, null, false, 14, null));
                                }
                                return Unit.INSTANCE;
                            }
                            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("stopPriceType is empty", null, null, false, 14, null));
                            return Unit.INSTANCE;
                        }
                        this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("orderId is empty", null, null, false, 14, null));
                        return Unit.INSTANCE;
                    }
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("targetPrice is invalid", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("targetPrice is empty", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            C44128b.m97261e(this.this$0.getF29027a(), "showModifyTpslPanel error: " + e11.getMessage());
            Function2<Boolean, ProtocolException, Unit> function4 = this.$callback;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            String message = e11.getMessage();
            if (message == null) {
                message = "showModifyTpslPanel error";
            }
            function4.invoke(boolBoxBoolean, new ProtocolException(message, e11, null, false, 12, null));
        }
    }
}
