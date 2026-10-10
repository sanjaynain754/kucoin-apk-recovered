package com.sumsub.sns.internal.features.presentation.camera.video;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.features.presentation.preview.selfie.AbstractC31959s;
import java.io.File;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30759C extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f62146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30763G f62147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30759C(File file, C30763G c30763g, Continuation continuation) {
        super(2, continuation);
        this.f62146b = file;
        this.f62147c = c30763g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30759C(this.f62146b, this.f62147c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30759C(this.f62146b, this.f62147c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62145a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC31959s.m70965a("onRecordingStarted: " + this.f62146b.getName());
            this.f62145a = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C30763G c30763g = this.f62147c;
        String str = c30763g.f62158f;
        if (str != null) {
            AbstractC28073M0.updateState$default(c30763g, false, new C30758B(str, null), 1, null);
        }
        return Unit.INSTANCE;
    }
}
