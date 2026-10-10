package com.kubi.payment.p2p.order;

import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.utils.extensions.C27041f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$initPayType$1", m90122f = "OrderDetailViewModel.kt", m90123i = {1, 2, 2}, m90124l = {429, 430, 435}, m90125m = "invokeSuspend", m90126n = {"payTypeList", "payTypeList", "payTypeTemplateList"}, m90127s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nOrderDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel$initPayType$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n1208#2,2:562\n1236#2,4:564\n*S KotlinDebug\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel$initPayType$1\n*L\n431#1:562,2\n431#1:564,4\n*E\n"})
public final class OrderDetailViewModel$initPayType$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$initPayType$1(OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$initPayType$1> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$initPayType$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderDetailViewModel$initPayType$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[LOOP:1: B:19:0x006d->B:21:0x0073, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r3.m48797z0(r10) == r0) goto L24;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Map map;
        LinkedHashMap linkedHashMap;
        String payTypeCode;
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
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    map = (Map) obj;
                    OrderDetailViewModel orderDetailViewModel = this.this$0;
                    linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (Object obj2 : list) {
                        PayTypeEntity payTypeEntity = (PayTypeEntity) obj2;
                        payTypeEntity.setTemplate((List) map.get(payTypeEntity.getTypeCode()));
                        linkedHashMap.put(C27041f.m66668h(payTypeEntity.getTypeCode()), obj2);
                    }
                    orderDetailViewModel.f39739f0 = linkedHashMap;
                    OrderDetailViewModel orderDetailViewModel2 = this.this$0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(map);
                    this.label = 3;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            OrderDetailViewModel orderDetailViewModel3 = this.this$0;
            List<AdPayType> listM48785e0 = orderDetailViewModel3.m48785e0();
            AdPayType adPayType = null;
            Object obj3 = null;
            if (listM48785e0 != null) {
                OrderDetailViewModel orderDetailViewModel4 = this.this$0;
                for (Object obj4 : listM48785e0) {
                    String payTypeCode2 = ((AdPayType) obj4).getPayTypeCode();
                    OrderDetailInfo f39744k0 = orderDetailViewModel4.getF39744k0();
                    if (f39744k0 != null) {
                        payTypeCode = f39744k0.getPayTypeCode();
                    } else {
                        payTypeCode = null;
                    }
                    if (Intrinsics.areEqual(payTypeCode2, payTypeCode)) {
                        obj3 = obj4;
                        break;
                    }
                }
                adPayType = (AdPayType) obj3;
                if (adPayType == null) {
                    adPayType = (AdPayType) CollectionsKt.firstOrNull((List) listM48785e0);
                }
            }
            orderDetailViewModel3.m48762H0(adPayType);
            this.this$0.f39734a0.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        OrderDetailViewModel orderDetailViewModel5 = this.this$0;
        this.label = 1;
        obj = orderDetailViewModel5.m48783c0(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        list = (List) obj;
        OrderDetailViewModel orderDetailViewModel6 = this.this$0;
        this.L$0 = list;
        this.label = 2;
        obj = orderDetailViewModel6.m48784d0(this);
        if (obj != coroutine_suspended) {
            map = (Map) obj;
            OrderDetailViewModel orderDetailViewModel7 = this.this$0;
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            while (r5.hasNext()) {
                PayTypeEntity payTypeEntity2 = (PayTypeEntity) obj2;
                payTypeEntity2.setTemplate((List) map.get(payTypeEntity2.getTypeCode()));
                linkedHashMap.put(C27041f.m66668h(payTypeEntity2.getTypeCode()), obj2);
            }
            orderDetailViewModel7.f39739f0 = linkedHashMap;
            OrderDetailViewModel orderDetailViewModel8 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(list);
            this.L$1 = SpillingKt.nullOutSpilledVariable(map);
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
