package com.kubi.payment.p2p.trade;

import com.kubi.payment.p2p.data.entities.TradePayMethodIcon;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: P2PTradeMarketViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.trade.P2PTradeMarketViewModel$loadPaymentMethodIcons$1", m90122f = "P2PTradeMarketViewModel.kt", m90123i = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3}, m90124l = {282, 342, 287, 293}, m90125m = "invokeSuspend", m90126n = {"dataJson", "this_$iv", "json$iv", "hasCache", "$i$f$fromJsonOrNull", "dataJson", "hasCache", "dataJson", DbParams.KEY_CHANNEL_RESULT, "response", "hasCache"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "I$0", "L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nP2PTradeMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketViewModel$loadPaymentMethodIcons$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,339:1\n196#2,3:340\n1222#3,2:343\n1252#3,4:345\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketViewModel$loadPaymentMethodIcons$1\n*L\n285#1:340,3\n290#1:343,2\n290#1:345,4\n*E\n"})
public final class P2PTradeMarketViewModel$loadPaymentMethodIcons$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ P2PTradeMarketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PTradeMarketViewModel$loadPaymentMethodIcons$1(P2PTradeMarketViewModel p2PTradeMarketViewModel, Continuation<? super P2PTradeMarketViewModel$loadPaymentMethodIcons$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PTradeMarketViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PTradeMarketViewModel$loadPaymentMethodIcons$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PTradeMarketViewModel$loadPaymentMethodIcons$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c A[LOOP:0: B:37:0x0106->B:39:0x010c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x014c  */
    /* JADX WARN: Code duplicated, block: B:45:0x014f  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0161  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        int i11;
        int i12;
        P2PTradeMarketViewModel p2PTradeMarketViewModel;
        Object objMo48491n0;
        int i13;
        String str2;
        Map mapEmptyMap;
        AbstractC42878k abstractC42878k;
        LinkedHashMap linkedHashMap;
        P2PTradeMarketViewModel p2PTradeMarketViewModel2;
        Map map;
        int i14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = this.label;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            i14 = this.I$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i13 = this.I$0;
                        str2 = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        abstractC42878k = (AbstractC42878k) obj;
                        if (abstractC42878k instanceof AbstractC42878k.Success) {
                            List<TradePayMethodIcon> list = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                            P2PTradeMarketViewModel p2PTradeMarketViewModel3 = this.this$0;
                            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                            for (TradePayMethodIcon tradePayMethodIcon : list) {
                                linkedHashMap.put(C27041f.m66668h(tradePayMethodIcon.getTypeCode()), C27041f.m66668h(tradePayMethodIcon.getIcon()));
                            }
                            p2PTradeMarketViewModel3.f40039i0 = linkedHashMap;
                            p2PTradeMarketViewModel2 = this.this$0;
                            map = p2PTradeMarketViewModel2.f40039i0;
                            this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(list);
                            this.I$0 = i13;
                            this.label = 4;
                            if (p2PTradeMarketViewModel2.m49340b0(map, this) != coroutine_suspended) {
                                i14 = i13;
                            }
                            return coroutine_suspended;
                        }
                        if (abstractC42878k instanceof AbstractC42878k.Error) {
                            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    i12 = this.I$0;
                    p2PTradeMarketViewModel = (P2PTradeMarketViewModel) this.L$3;
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mapEmptyMap = (Map) obj;
                    if (mapEmptyMap == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    p2PTradeMarketViewModel.f40039i0 = mapEmptyMap;
                    i11 = i12;
                    IP2PRepository iP2PRepository = this.this$0.f40028X;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i11;
                    this.label = 3;
                    objMo48491n0 = iP2PRepository.mo48491n0(this);
                    if (objMo48491n0 != coroutine_suspended) {
                        i13 = i11;
                        obj = objMo48491n0;
                        str2 = str;
                        abstractC42878k = (AbstractC42878k) obj;
                        if (abstractC42878k instanceof AbstractC42878k.Success) {
                            List<TradePayMethodIcon> list2 = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                            P2PTradeMarketViewModel p2PTradeMarketViewModel4 = this.this$0;
                            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                            while (r7.hasNext()) {
                                linkedHashMap.put(C27041f.m66668h(tradePayMethodIcon.getTypeCode()), C27041f.m66668h(tradePayMethodIcon.getIcon()));
                            }
                            p2PTradeMarketViewModel4.f40039i0 = linkedHashMap;
                            p2PTradeMarketViewModel2 = this.this$0;
                            map = p2PTradeMarketViewModel2.f40039i0;
                            this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(list2);
                            this.I$0 = i13;
                            this.label = 4;
                            if (p2PTradeMarketViewModel2.m49340b0(map, this) != coroutine_suspended) {
                                i14 = i13;
                            }
                        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
                            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (i14 == 0) {
                this.this$0.f40037g0.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        P2PTradeMarketViewModel p2PTradeMarketViewModel5 = this.this$0;
        this.label = 1;
        obj = p2PTradeMarketViewModel5.m49322I(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        str = (String) obj;
        if (str.length() > 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            IP2PRepository iP2PRepository2 = this.this$0.f40028X;
            this.L$0 = SpillingKt.nullOutSpilledVariable(str);
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i11;
            this.label = 3;
            objMo48491n0 = iP2PRepository2.mo48491n0(this);
            if (objMo48491n0 != coroutine_suspended) {
                i13 = i11;
                obj = objMo48491n0;
                str2 = str;
                abstractC42878k = (AbstractC42878k) obj;
                if (abstractC42878k instanceof AbstractC42878k.Success) {
                    List<TradePayMethodIcon> list3 = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                    P2PTradeMarketViewModel p2PTradeMarketViewModel6 = this.this$0;
                    linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                    while (r7.hasNext()) {
                        linkedHashMap.put(C27041f.m66668h(tradePayMethodIcon.getTypeCode()), C27041f.m66668h(tradePayMethodIcon.getIcon()));
                    }
                    p2PTradeMarketViewModel6.f40039i0 = linkedHashMap;
                    p2PTradeMarketViewModel2 = this.this$0;
                    map = p2PTradeMarketViewModel2.f40039i0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(list3);
                    this.I$0 = i13;
                    this.label = 4;
                    if (p2PTradeMarketViewModel2.m49340b0(map, this) != coroutine_suspended) {
                        i14 = i13;
                        if (i14 == 0) {
                            this.this$0.f40037g0.setValue(Boxing.boxBoolean(true));
                        }
                    }
                } else if (abstractC42878k instanceof AbstractC42878k.Error) {
                    this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        } else {
            P2PTradeMarketViewModel p2PTradeMarketViewModel7 = this.this$0;
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C21254x8fb1e29a(str, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(str);
            this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$2 = SpillingKt.nullOutSpilledVariable(str);
            this.L$3 = p2PTradeMarketViewModel7;
            this.I$0 = i11;
            this.I$1 = 0;
            this.label = 2;
            Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (objM90914f0 != coroutine_suspended) {
                i12 = i11;
                obj = objM90914f0;
                p2PTradeMarketViewModel = p2PTradeMarketViewModel7;
                mapEmptyMap = (Map) obj;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                p2PTradeMarketViewModel.f40039i0 = mapEmptyMap;
                i11 = i12;
                IP2PRepository iP2PRepository3 = this.this$0.f40028X;
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i11;
                this.label = 3;
                objMo48491n0 = iP2PRepository3.mo48491n0(this);
                if (objMo48491n0 != coroutine_suspended) {
                    i13 = i11;
                    obj = objMo48491n0;
                    str2 = str;
                    abstractC42878k = (AbstractC42878k) obj;
                    if (abstractC42878k instanceof AbstractC42878k.Success) {
                        List<TradePayMethodIcon> list4 = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                        P2PTradeMarketViewModel p2PTradeMarketViewModel8 = this.this$0;
                        linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
                        while (r7.hasNext()) {
                            linkedHashMap.put(C27041f.m66668h(tradePayMethodIcon.getTypeCode()), C27041f.m66668h(tradePayMethodIcon.getIcon()));
                        }
                        p2PTradeMarketViewModel8.f40039i0 = linkedHashMap;
                        p2PTradeMarketViewModel2 = this.this$0;
                        map = p2PTradeMarketViewModel2.f40039i0;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(list4);
                        this.I$0 = i13;
                        this.label = 4;
                        if (p2PTradeMarketViewModel2.m49340b0(map, this) != coroutine_suspended) {
                            i14 = i13;
                            if (i14 == 0) {
                                this.this$0.f40037g0.setValue(Boxing.boxBoolean(true));
                            }
                        }
                    } else if (abstractC42878k instanceof AbstractC42878k.Error) {
                        this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return coroutine_suspended;
    }
}
