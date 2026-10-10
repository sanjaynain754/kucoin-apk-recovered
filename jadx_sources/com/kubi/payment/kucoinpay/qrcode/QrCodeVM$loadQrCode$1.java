package com.kubi.payment.kucoinpay.qrcode;

import com.kubi.otc.api.IOtcService;
import com.kubi.payment.kucoinpay.data.entities.QrCode;
import com.kubi.payment.kucoinpay.data.source.IKuCoinPayRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrCodeVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.kucoinpay.qrcode.QrCodeVM$loadQrCode$1", m90122f = "QrCodeVM.kt", m90123i = {}, m90124l = {33}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QrCodeVM$loadQrCode$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ QrCodeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeVM$loadQrCode$1(QrCodeVM qrCodeVM, String str, String str2, Continuation<? super QrCodeVM$loadQrCode$1> continuation) {
        super(2, continuation);
        this.this$0 = qrCodeVM;
        this.$content = str;
        this.$source = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QrCodeVM$loadQrCode$1(this.this$0, this.$content, this.$source, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QrCodeVM$loadQrCode$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            C43841b.m96557d("B7kucoinpay_loading", "click_start_btn", null, 4, null);
            IKuCoinPayRepository iKuCoinPayRepository = this.this$0.f39593Z;
            String str = this.$content;
            this.label = 1;
            obj = iKuCoinPayRepository.mo48311e0(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f39594a0.setValue((QrCode.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.f39594a0.setValue(new QrCode.Response(null, null));
            if (Intrinsics.areEqual(IOtcService.Companion.SOURCE_FROM_H5, this.$source)) {
                this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C43841b.m96557d("B7kucoinpay_loading", "data_load_finish", null, 4, null);
        return Unit.INSTANCE;
    }
}
