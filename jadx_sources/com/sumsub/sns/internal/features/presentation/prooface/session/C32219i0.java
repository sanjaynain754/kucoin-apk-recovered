package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.network.prooface.C29888c;
import com.sumsub.sns.internal.features.data.network.prooface.C29889d;
import com.sumsub.sns.internal.features.data.network.prooface.C29890e;
import com.sumsub.sns.internal.features.data.network.prooface.C29891f;
import com.sumsub.sns.internal.features.data.network.prooface.C29892g;
import com.sumsub.sns.internal.features.data.network.prooface.C29893h;
import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import com.sumsub.sns.internal.features.data.network.prooface.C29895j;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32219i0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32239r0 f65635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Liveness3dFaceRepository$LivenessRepositoryResult f65636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32219i0(C32239r0 c32239r0, Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, Continuation continuation) {
        super(2, continuation);
        this.f65635b = c32239r0;
        this.f65636c = liveness3dFaceRepository$LivenessRepositoryResult;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32219i0(this.f65635b, this.f65636c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32219i0(this.f65635b, this.f65636c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (r5.mo71051a(r1, r4) == r0) goto L43;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC32150D0 c32255z0;
        Object objEmit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65634a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C32208e1 c32208e1 = this.f65635b.f65690h;
        Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult = this.f65636c;
        this.f65634a = 1;
        c32208e1.getClass();
        if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29894i) {
            c32255z0 = new C32253y0((C29894i) liveness3dFaceRepository$LivenessRepositoryResult);
        } else if (liveness3dFaceRepository$LivenessRepositoryResult instanceof C29890e) {
            c32255z0 = new C32255z0(((C29890e) liveness3dFaceRepository$LivenessRepositoryResult).f59991a);
        } else if (Intrinsics.areEqual(liveness3dFaceRepository$LivenessRepositoryResult, C29888c.f59989a)) {
            c32255z0 = C32146B0.f65437a;
        } else {
            if (!(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29893h) && !(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29891f) && !(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29889d) && !(liveness3dFaceRepository$LivenessRepositoryResult instanceof C29895j) && !Intrinsics.areEqual(liveness3dFaceRepository$LivenessRepositoryResult, C29892g.f59993a)) {
                throw new NoWhenBranchMatchedException();
            }
            c32255z0 = null;
        }
        if (c32255z0 == null || (objEmit = c32208e1.f65603a.emit(c32255z0, this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        if (objEmit != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC32204d0 interfaceC32204d0 = this.f65635b.f65687e;
        Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult2 = this.f65636c;
        this.f65634a = 2;
    }
}
