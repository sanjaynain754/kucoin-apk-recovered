package com.kubi.payment.p2p.order.transfer;

import androidx.media3.extractor.p021ts.PsExtractor;
import com.kubi.otc.entity.AdPayType;
import com.kubi.payment.flutter.upload.UploadHelper;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderTransferViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.transfer.OrderTransferViewModel$uploadPayVoucher$1", m90122f = "OrderTransferViewModel.kt", m90123i = {}, m90124l = {PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderTransferViewModel$uploadPayVoucher$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $paths;
    int label;
    final /* synthetic */ OrderTransferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTransferViewModel$uploadPayVoucher$1(List<String> list, OrderTransferViewModel orderTransferViewModel, Continuation<? super OrderTransferViewModel$uploadPayVoucher$1> continuation) {
        super(2, continuation);
        this.$paths = list;
        this.this$0 = orderTransferViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTransferViewModel$uploadPayVoucher$1(this.$paths, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderTransferViewModel$uploadPayVoucher$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String id2;
        AdPayType currentPayType;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            UploadHelper uploadHelper = UploadHelper.f39536a;
            List<String> list = this.$paths;
            this.label = 1;
            obj = uploadHelper.m48220b(list, "ku_otc_payment", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List<String> list2 = (List) obj;
        if (list2 != null && !list2.isEmpty()) {
            OrderTransferViewModel orderTransferViewModel = this.this$0;
            TransferOrderInfo f39904i0 = orderTransferViewModel.getF39904i0();
            if (f39904i0 != null && (currentPayType = f39904i0.getCurrentPayType()) != null) {
                id2 = currentPayType.getId();
            } else {
                id2 = null;
            }
            orderTransferViewModel.m49012F(C27041f.m66668h(id2), list2);
        } else {
            this.this$0.f39895Z.setValue(Boxing.boxBoolean(true));
            this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
