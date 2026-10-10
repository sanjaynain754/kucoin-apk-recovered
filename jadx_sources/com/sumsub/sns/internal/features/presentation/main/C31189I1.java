package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.fisherman.FishermanSDK;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.SNSCompleteHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.internal.features.domain.fisherman.C30182f;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.I1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31189I1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SNSCompletionResult f63056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31189I1(C31243a2 c31243a2, SNSCompletionResult sNSCompletionResult, Continuation continuation) {
        super(2, continuation);
        this.f63055b = c31243a2;
        this.f63056c = sNSCompletionResult;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31189I1(this.f63055b, this.f63056c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31189I1(this.f63055b, this.f63056c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63054a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f63054a = 1;
            if (DelayKt.m90350b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f63055b.fireEvent(new C31264g(this.f63056c));
        try {
            SNSMobileSDK sNSMobileSDK = SNSMobileSDK.INSTANCE;
            SNSCompleteHandler completeHandler = sNSMobileSDK.getCompleteHandler();
            if (completeHandler != null) {
                completeHandler.onComplete(this.f63056c, sNSMobileSDK.getState());
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel2", message, e11);
        }
        SNSMobileSDK.INSTANCE.shutdown();
        C30182f c30182f = this.f63055b.f63222e;
        c30182f.getClass();
        C33272c.f67816e.f67810a.mo68955d("Fisherman", "Closing Fisherman SDK", null);
        FishermanSDK fishermanSDK = c30182f.f60665e;
        if (fishermanSDK != null) {
            fishermanSDK.close();
        }
        c30182f.f60665e = null;
        return Unit.INSTANCE;
    }
}
