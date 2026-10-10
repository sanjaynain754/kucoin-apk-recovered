package com.kubi.payment.p2p.order.transfer;

import com.jumio.analytics.MobileEvents;
import com.kubi.otc.entity.AdPayType;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.utils.C27099x;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderTransferViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.transfer.OrderTransferViewModel$initPayTypeMap$1", m90122f = "OrderTransferViewModel.kt", m90123i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, m90124l = {265, 316, MobileEvents.EVENTTYPE_PERFORMANCE}, m90125m = "invokeSuspend", m90126n = {"currentPayType", "currentPayType", "jsonPayType", "this_$iv", "json$iv", "$i$f$fromJsonOrNull", "currentPayType", "jsonPayType", "payMap", "reservedFields", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
@SourceDebugExtension({"SMAP\nOrderTransferViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderTransferViewModel.kt\ncom/kubi/payment/p2p/order/transfer/OrderTransferViewModel$initPayTypeMap$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,313:1\n196#2,3:314\n196#2,3:317\n*S KotlinDebug\n*F\n+ 1 OrderTransferViewModel.kt\ncom/kubi/payment/p2p/order/transfer/OrderTransferViewModel$initPayTypeMap$1\n*L\n267#1:314,3\n273#1:317,3\n*E\n"})
public final class OrderTransferViewModel$initPayTypeMap$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ OrderTransferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTransferViewModel$initPayTypeMap$1(OrderTransferViewModel orderTransferViewModel, Continuation<? super OrderTransferViewModel$initPayTypeMap$1> continuation) {
        super(2, continuation);
        this.this$0 = orderTransferViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTransferViewModel$initPayTypeMap$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderTransferViewModel$initPayTypeMap$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
    
        if (r12 == r0) goto L40;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdPayType currentPayType;
        AdPayType adPayType;
        String str;
        AdPayType adPayType2;
        Map<? extends String, ? extends Object> mapEmptyMap;
        TransferOrderInfo f39904i0;
        String reservedFields;
        AdPayType currentPayType2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    str = (String) this.L$1;
                    adPayType2 = (AdPayType) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mapEmptyMap = (Map) obj;
                    if (mapEmptyMap == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    this.this$0.m49022R().putAll(mapEmptyMap);
                    f39904i0 = this.this$0.getF39904i0();
                    if (f39904i0 == null && (currentPayType2 = f39904i0.getCurrentPayType()) != null) {
                        reservedFields = currentPayType2.getReservedFields();
                    } else {
                        reservedFields = null;
                    }
                    if (reservedFields != null && reservedFields.length() != 0) {
                        C27099x c27099x = C27099x.f54458a;
                        InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C21181x9737b673(reservedFields, null)), C42911a.m94120b());
                        this.L$0 = SpillingKt.nullOutSpilledVariable(adPayType2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(mapEmptyMap);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(reservedFields);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(c27099x);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(reservedFields);
                        this.I$0 = 0;
                        this.label = 3;
                        obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                    }
                    this.this$0.f39894Y.setValue(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
            } else {
                adPayType = (AdPayType) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Map<? extends String, ? extends Object> mapEmptyMap2 = (Map) obj;
            if (mapEmptyMap2 == null) {
                mapEmptyMap2 = MapsKt.emptyMap();
            }
            this.this$0.m49022R().putAll(mapEmptyMap2);
            this.this$0.f39894Y.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        TransferOrderInfo f39904i1 = this.this$0.getF39904i0();
        if (f39904i1 != null && (currentPayType = f39904i1.getCurrentPayType()) != null) {
            OrderTransferViewModel orderTransferViewModel = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(currentPayType);
            this.label = 1;
            Object objM49033d0 = orderTransferViewModel.m49033d0(currentPayType, this);
            if (objM49033d0 != coroutine_suspended) {
                adPayType = currentPayType;
                obj = objM49033d0;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        String str2 = (String) obj;
        this.this$0.m49022R().clear();
        C27099x c27099x2 = C27099x.f54458a;
        InterfaceC41634e interfaceC41634eM90890N2 = C41636g.m90890N(C41636g.m90887K(new C21180x9737b672(str2, null)), C42911a.m94120b());
        this.L$0 = SpillingKt.nullOutSpilledVariable(adPayType);
        this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
        this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x2);
        this.L$3 = SpillingKt.nullOutSpilledVariable(str2);
        this.I$0 = 0;
        this.label = 2;
        Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N2, this);
        if (objM90914f0 != coroutine_suspended) {
            AdPayType adPayType3 = adPayType;
            str = str2;
            obj = objM90914f0;
            adPayType2 = adPayType3;
            mapEmptyMap = (Map) obj;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            this.this$0.m49022R().putAll(mapEmptyMap);
            f39904i0 = this.this$0.getF39904i0();
            if (f39904i0 == null) {
                reservedFields = null;
            } else {
                reservedFields = null;
            }
            if (reservedFields != null) {
                C27099x c27099x3 = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N3 = C41636g.m90890N(C41636g.m90887K(new C21181x9737b673(reservedFields, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(adPayType2);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.L$2 = SpillingKt.nullOutSpilledVariable(mapEmptyMap);
                this.L$3 = SpillingKt.nullOutSpilledVariable(reservedFields);
                this.L$4 = SpillingKt.nullOutSpilledVariable(c27099x3);
                this.L$5 = SpillingKt.nullOutSpilledVariable(reservedFields);
                this.I$0 = 0;
                this.label = 3;
                obj = C41636g.m90914f0(interfaceC41634eM90890N3, this);
            }
            this.this$0.f39894Y.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
