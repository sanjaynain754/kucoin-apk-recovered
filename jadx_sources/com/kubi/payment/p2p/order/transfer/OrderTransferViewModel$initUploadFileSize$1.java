package com.kubi.payment.p2p.order.transfer;

import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.p2p.data.entities.FileSizeResponse;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderTransferViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.transfer.OrderTransferViewModel$initUploadFileSize$1", m90122f = "OrderTransferViewModel.kt", m90123i = {}, m90124l = {245}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderTransferViewModel$initUploadFileSize$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderTransferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTransferViewModel$initUploadFileSize$1(OrderTransferViewModel orderTransferViewModel, Continuation<? super OrderTransferViewModel$initUploadFileSize$1> continuation) {
        super(2, continuation);
        this.this$0 = orderTransferViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTransferViewModel$initUploadFileSize$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderTransferViewModel$initUploadFileSize$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String typeCode;
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
            IP2PRepository iP2PRepository = this.this$0.f39893X;
            this.label = 1;
            obj = iP2PRepository.mo48490l0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            List list = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            MutableLiveData mutableLiveData = this.this$0.f39897b0;
            FileSizeResponse fileSizeResponse = (FileSizeResponse) CollectionsKt.firstOrNull(list);
            if (fileSizeResponse != null) {
                typeCode = fileSizeResponse.getTypeCode();
            } else {
                typeCode = null;
            }
            mutableLiveData.setValue(C27041f.m66669i(typeCode, "20"));
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
