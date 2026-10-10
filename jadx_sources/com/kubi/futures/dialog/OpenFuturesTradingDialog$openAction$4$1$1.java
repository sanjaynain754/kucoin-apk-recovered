package com.kubi.futures.dialog;

import androidx.fragment.app.FragmentManager;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.tradebase.business.kyc.KycGuideHandler;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.tradebase.business.kyc.NoticeDetailEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OpenFuturesTradingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.dialog.OpenFuturesTradingDialog$openAction$4$1$1", m90122f = "OpenFuturesTradingDialog.kt", m90123i = {}, m90124l = {264}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OpenFuturesTradingDialog$openAction$4$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $extraBlockId;
    final /* synthetic */ FragmentManager $supportFragmentManager;
    int label;
    final /* synthetic */ OpenFuturesTradingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFuturesTradingDialog$openAction$4$1$1(OpenFuturesTradingDialog openFuturesTradingDialog, FragmentManager fragmentManager, String str, Continuation<? super OpenFuturesTradingDialog$openAction$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = openFuturesTradingDialog;
        this.$supportFragmentManager = fragmentManager;
        this.$extraBlockId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenFuturesTradingDialog$openAction$4$1$1(this.this$0, this.$supportFragmentManager, this.$extraBlockId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OpenFuturesTradingDialog$openAction$4$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenFuturesTradingDialog$openAction$4$1$1 openFuturesTradingDialog$openAction$4$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                openFuturesTradingDialog$openAction$4$1$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            KycViewModel kycViewModelM25141F4 = this.this$0.m25141F4();
            this.label = 1;
            openFuturesTradingDialog$openAction$4$1$1 = this;
            obj = KycViewModel.m63179p(kycViewModelM25141F4, "KYC_LIMIT", null, null, openFuturesTradingDialog$openAction$4$1$1, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        NoticeDetailEntity noticeDetailEntity = (NoticeDetailEntity) obj;
        if (noticeDetailEntity != null) {
            FragmentManager fragmentManager = openFuturesTradingDialog$openAction$4$1$1.$supportFragmentManager;
            String str = openFuturesTradingDialog$openAction$4$1$1.$extraBlockId;
            OpenFuturesTradingDialog openFuturesTradingDialog = openFuturesTradingDialog$openAction$4$1$1.this$0;
            KycGuideHandler.f51552a.m63199j(noticeDetailEntity, fragmentManager, C17060n0.m36552b(), str);
            openFuturesTradingDialog.m25169A4();
            openFuturesTradingDialog.dismiss();
        } else {
            KycGuideHandler.f51552a.m63199j(null, openFuturesTradingDialog$openAction$4$1$1.$supportFragmentManager, C17060n0.m36552b(), openFuturesTradingDialog$openAction$4$1$1.$extraBlockId);
            Unit unit = Unit.INSTANCE;
            OpenFuturesTradingDialog openFuturesTradingDialog2 = openFuturesTradingDialog$openAction$4$1$1.this$0;
            openFuturesTradingDialog2.m25169A4();
            openFuturesTradingDialog2.dismiss();
        }
        return Unit.INSTANCE;
    }
}
