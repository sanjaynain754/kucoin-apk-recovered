package com.sumsub.sns.internal.features.presentation.camera.video;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.repository.cache.C29951a;
import com.sumsub.sns.internal.features.data.repository.cache.C29952b;
import com.sumsub.sns.internal.features.domain.C30302o;
import com.sumsub.sns.internal.features.presentation.preview.selfie.AbstractC31959s;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import java.util.UUID;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30789v extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30763G f62206a;

    /* JADX INFO: renamed from: b */
    public int f62207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30763G f62208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30789v(C30763G c30763g, Continuation continuation) {
        super(2, continuation);
        this.f62208c = c30763g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30789v(this.f62208c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30789v(this.f62208c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30763G c30763g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62207b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c30763g = this.f62206a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = UUID.randomUUID() + ".mp4";
                AbstractC31959s.m70965a("File name is " + str);
                C30763G c30763g2 = this.f62208c;
                C30302o c30302o = c30763g2.f62153a;
                this.f62206a = c30763g2;
                this.f62207b = 1;
                C29952b c29952b = c30302o.f60900a;
                c29952b.getClass();
                obj = C41686h.m91049g(C41782z0.m91392b(), new C29951a(c29952b, str, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c30763g = c30763g2;
            }
            c30763g.f62159g = (File) obj;
            C30763G c30763g3 = this.f62208c;
            c30763g3.fireEvent(new C30778k(c30763g3.f62159g));
        } catch (Exception e11) {
            C33272c.f67816e.f67810a.mo68955d("SumSubVideoSelfie", "An error while creating new video selfie file...", e11);
            AbstractC28052C.finish$default(this.f62208c, null, null, null, null, 15, null);
        }
        return Unit.INSTANCE;
    }
}
