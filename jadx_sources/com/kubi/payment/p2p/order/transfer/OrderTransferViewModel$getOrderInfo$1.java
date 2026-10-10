package com.kubi.payment.p2p.order.transfer;

import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.payment.p2p.trade.MerchantQualificationDialog;
import com.kubi.payment.p2p.widget.P2PViewChatCardEntrance;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderTransferViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.transfer.OrderTransferViewModel$getOrderInfo$1", m90122f = "OrderTransferViewModel.kt", m90123i = {}, m90124l = {131}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderTransferViewModel$getOrderInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $refreshTime;
    int label;
    final /* synthetic */ OrderTransferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTransferViewModel$getOrderInfo$1(OrderTransferViewModel orderTransferViewModel, boolean z11, Continuation<? super OrderTransferViewModel$getOrderInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = orderTransferViewModel;
        this.$refreshTime = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTransferViewModel$getOrderInfo$1(this.this$0, this.$refreshTime, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderTransferViewModel$getOrderInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String id2;
        String letter;
        String nickName;
        Boolean boolIsMerchant;
        MerchantQualificationDialog.MerchantQualification merchantQualification;
        boolean z11;
        Integer goldMerchant;
        Integer foxKingMerchant;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Boolean online = null;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            IP2PRepository iP2PRepository = this.this$0.f39893X;
            TransferOrderInfo f39904i0 = this.this$0.getF39904i0();
            if (f39904i0 != null) {
                id2 = f39904i0.getId();
            } else {
                id2 = null;
            }
            String strM66668h = C27041f.m66668h(id2);
            this.label = 1;
            obj = iP2PRepository.mo48485f0(strM66668h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            OrderDetailInfo orderDetailInfo = (OrderDetailInfo) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            long jM66652l = C27039d.m66652l(orderDetailInfo.getAutoCancelOrderExpire());
            this.this$0.f39902g0 = jM66652l;
            if (this.$refreshTime && this.this$0.f39902g0 > 0) {
                this.this$0.m49032b0(jM66652l);
            }
            this.this$0.f39899d0.setValue(Boxing.boxBoolean(Intrinsics.areEqual(orderDetailInfo.getStatus(), OrderDetailInfo.ORDER_STATUS_CANCELED)));
            MutableLiveData mutableLiveData = this.this$0.f39907l0;
            OrderDetailInfo.OpUserInfo opUserInfo = orderDetailInfo.getOpUserInfo();
            if (opUserInfo != null) {
                letter = opUserInfo.getLetter();
            } else {
                letter = null;
            }
            OrderDetailInfo.OpUserInfo opUserInfo2 = orderDetailInfo.getOpUserInfo();
            if (opUserInfo2 != null) {
                nickName = opUserInfo2.getNickName();
            } else {
                nickName = null;
            }
            OrderDetailInfo.OpUserInfo opUserInfo3 = orderDetailInfo.getOpUserInfo();
            if (opUserInfo3 != null) {
                boolIsMerchant = opUserInfo3.isMerchant();
            } else {
                boolIsMerchant = null;
            }
            if (C27025c.m66566d(boolIsMerchant)) {
                OrderDetailInfo.OpUserInfo opUserInfo4 = orderDetailInfo.getOpUserInfo();
                if (opUserInfo4 != null && (foxKingMerchant = opUserInfo4.getFoxKingMerchant()) != null && foxKingMerchant.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
                OrderDetailInfo.OpUserInfo opUserInfo5 = orderDetailInfo.getOpUserInfo();
                if (opUserInfo5 == null || (goldMerchant = opUserInfo5.getGoldMerchant()) == null || goldMerchant.intValue() != 1) {
                    z12 = false;
                }
                merchantQualification = new MerchantQualificationDialog.MerchantQualification(null, null, boolBoxBoolean, Boxing.boxBoolean(z12), 3, null);
            } else {
                merchantQualification = null;
            }
            Integer numBoxInt = Boxing.boxInt(orderDetailInfo.getUnreadMsgCount());
            OrderDetailInfo.OpUserInfo opUserInfo6 = orderDetailInfo.getOpUserInfo();
            if (opUserInfo6 != null) {
                online = opUserInfo6.getOnline();
            }
            mutableLiveData.setValue(new P2PViewChatCardEntrance.P2PChatCardEntranceInfo(letter, nickName, merchantQualification, numBoxInt, online));
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
