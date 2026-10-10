package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.N0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40070N0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ MirrorType f89134a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f89135b;

    public C40070N0(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C40070N0 c40070n0 = new C40070N0((Continuation) obj3);
        c40070n0.f89134a = (MirrorType) obj;
        c40070n0.f89135b = zBooleanValue;
        return c40070n0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MirrorType mirrorType = this.f89134a;
        boolean z11 = this.f89135b;
        int i11 = AbstractC40068M0.f89133a[mirrorType.ordinal()];
        boolean z12 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z12 = false;
            }
        } else if (!z11) {
            z12 = false;
        }
        return Boxing.boxBoolean(z12);
    }
}
