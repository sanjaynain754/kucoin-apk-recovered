package com.kubi.share.lib.lifecycle;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.share.api.entity.PageTextConfigEntity;
import com.kubi.share.api.entity.ShareReferralEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import w10.C45696a;
import y10.InterfaceC46364a;

/* JADX INFO: compiled from: ShareMainActLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.lifecycle.ShareMainActLifecycleKt$refreshReferral$1", m90122f = "ShareMainActLifecycle.kt", m90123i = {0, 1}, m90124l = {87, 90}, m90125m = "invokeSuspend", m90126n = {"shareApi", "shareApi"}, m90127s = {"L$0", "L$0"})
public final class ShareMainActLifecycleKt$refreshReferral$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public ShareMainActLifecycleKt$refreshReferral$1(Continuation<? super ShareMainActLifecycleKt$refreshReferral$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareMainActLifecycleKt$refreshReferral$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ShareMainActLifecycleKt$refreshReferral$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r12 == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC46364a interfaceC46364a;
        ShareMainActLifecycleKt$refreshReferral$1 shareMainActLifecycleKt$refreshReferral$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC46364a = (InterfaceC46364a) this.L$0;
                ResultKt.throwOnFailure(obj);
                shareMainActLifecycleKt$refreshReferral$1 = this;
            }
            ShareReferralEntity shareReferralEntity = (ShareReferralEntity) ((C19334f) obj).m42846a();
            if (shareReferralEntity != null) {
                C45696a.m100873c(shareReferralEntity);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC46364a = (InterfaceC46364a) RetrofitFlowExKt.m42820a(InterfaceC46364a.class);
        InterfaceC41634e interfaceC41634eM102250d = InterfaceC46364a.m102250d(interfaceC46364a, null, null, 3, null);
        this.L$0 = interfaceC46364a;
        this.label = 1;
        obj = RetrofitFlowExKt.m42826g(interfaceC41634eM102250d, false, null, this, 2, null);
        shareMainActLifecycleKt$refreshReferral$1 = this;
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        PageTextConfigEntity pageTextConfigEntity = (PageTextConfigEntity) ((C19334f) obj).m42846a();
        if (pageTextConfigEntity != null) {
            C45696a.m100874d(pageTextConfigEntity);
        }
        InterfaceC41634e<ShareReferralEntity> interfaceC41634eM102253c = interfaceC46364a.m102253c();
        shareMainActLifecycleKt$refreshReferral$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC46364a);
        shareMainActLifecycleKt$refreshReferral$1.label = 2;
        obj = RetrofitFlowExKt.m42826g(interfaceC41634eM102253c, false, null, shareMainActLifecycleKt$refreshReferral$1, 2, null);
    }
}
