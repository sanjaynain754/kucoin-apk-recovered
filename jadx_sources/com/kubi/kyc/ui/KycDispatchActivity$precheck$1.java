package com.kubi.kyc.ui;

import com.kubi.kyc.R$string;
import com.kubi.kyc.data.KycPrecheckData;
import com.kubi.kyc.data.KycPrecheckRepository;
import com.kubi.kyc.exception.KycException;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import p507on.AbstractC43158a;
import p507on.C43159b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KycDispatchActivity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.ui.KycDispatchActivity$precheck$1", m90122f = "KycDispatchActivity.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKycDispatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycDispatchActivity.kt\ncom/kubi/kyc/ui/KycDispatchActivity$precheck$1\n+ 2 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n*L\n1#1,142:1\n44#2,2:143\n*S KotlinDebug\n*F\n+ 1 KycDispatchActivity.kt\ncom/kubi/kyc/ui/KycDispatchActivity$precheck$1\n*L\n87#1:143,2\n*E\n"})
public final class KycDispatchActivity$precheck$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ KycDispatchActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycDispatchActivity$precheck$1(KycDispatchActivity kycDispatchActivity, Continuation<? super KycDispatchActivity$precheck$1> continuation) {
        super(2, continuation);
        this.this$0 = kycDispatchActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycDispatchActivity$precheck$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KycDispatchActivity$precheck$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C43159b c43159b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c43159b = (C43159b) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.this$0.showLoadingDialog();
                C43159b c43159b2 = C43159b.f95317a;
                KycPrecheckRepository kycPrecheckRepositoryM36882e0 = this.this$0.m36882e0();
                this.L$0 = c43159b2;
                this.label = 1;
                Object objM36781e = kycPrecheckRepositoryM36882e0.m36781e(this);
                if (objM36781e == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c43159b = c43159b2;
                obj = objM36781e;
            }
            AbstractC43158a abstractC43158aM94755a = c43159b.m94755a((KycPrecheckData) obj);
            if (!this.this$0.isFinishing()) {
                this.this$0.m36883f0(abstractC43158aM94755a);
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            BaseActivity.hideLoadingDialog$default(this.this$0, false, 1, null);
            return unit;
        } catch (Throwable th2) {
            try {
                C43846g.m96568c(new KycException(th2, "KycDispatchActivity", false, null, 8, null), null, 2, null);
                ToastCompat.m66437C(R$string.common_network_error);
                this.this$0.finish();
            } finally {
                BaseActivity.hideLoadingDialog$default(this.this$0, false, 1, null);
            }
        }
    }
}
