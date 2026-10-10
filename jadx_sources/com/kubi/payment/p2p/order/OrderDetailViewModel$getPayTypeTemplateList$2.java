package com.kubi.payment.p2p.order;

import com.kubi.otc.entity.PayTemplate;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.function.language.MultiLanguageManager;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "", "", "Lcom/kubi/otc/entity/PayTemplate;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeTemplateList$2", m90122f = "OrderDetailViewModel.kt", m90123i = {0, 0, 0}, m90124l = {562}, m90125m = "invokeSuspend", m90126n = {"language", "isRefresh", "$i$f$suspendCancellableCoroutine"}, m90127s = {"L$0", "Z$0", "I$0"})
@SourceDebugExtension({"SMAP\nOrderDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel$getPayTypeTemplateList$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,561:1\n426#2,11:562\n*S KotlinDebug\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel$getPayTypeTemplateList$2\n*L\n513#1:562,11\n*E\n"})
public final class OrderDetailViewModel$getPayTypeTemplateList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Map<String, ? extends List<? extends PayTemplate>>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeTemplateList$2$a */
    /* JADX INFO: compiled from: OrderDetailViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21097a<T1, T2> implements BiConsumer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f39756b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC41708m<Map<String, ? extends List<PayTemplate>>> f39757c;

        /* JADX WARN: Multi-variable type inference failed */
        public C21097a(String str, InterfaceC41708m<? super Map<String, ? extends List<PayTemplate>>> interfaceC41708m) {
            this.f39756b = str;
            this.f39757c = interfaceC41708m;
        }

        @Override // io.reactivex.functions.BiConsumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean bool, Map<String, ? extends List<PayTemplate>> map) {
            C46392a.m102333p(PaymentStorageId.f40364a.m49841s(), this.f39756b);
            this.f39757c.resumeWith(Result.m103844constructorimpl(map));
        }
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, ? extends List<? extends PayTemplate>>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super Map<String, ? extends List<PayTemplate>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$getPayTypeTemplateList$2(OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$getPayTypeTemplateList$2> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$getPayTypeTemplateList$2(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, ? extends List<PayTemplate>>> continuation) {
        return ((OrderDetailViewModel$getPayTypeTemplateList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String localString = MultiLanguageManager.f46811g.getLocalString();
        boolean zAreEqual = Intrinsics.areEqual(localString, C46392a.m102326h(PaymentStorageId.f40364a.m49841s(), ""));
        OrderDetailViewModel orderDetailViewModel = this.this$0;
        this.L$0 = localString;
        this.L$1 = orderDetailViewModel;
        this.Z$0 = zAreEqual;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        InterfaceC23686g interfaceC23686g = orderDetailViewModel.f39742i0;
        if (interfaceC23686g != null) {
            C20143e.m45240f(interfaceC23686g, new C21097a(localString, c41716o), zAreEqual);
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
