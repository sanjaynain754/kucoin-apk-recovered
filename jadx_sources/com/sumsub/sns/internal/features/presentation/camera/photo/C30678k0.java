package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.domain.C30314u;
import com.sumsub.sns.internal.features.domain.C30318v;
import com.sumsub.sns.internal.features.domain.C30332x;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30678k0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f61995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30736v0 f61996b;

    public C30678k0(InterfaceC41635f interfaceC41635f, C30736v0 c30736v0) {
        this.f61995a = interfaceC41635f;
        this.f61996b = c30736v0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r11.emit(r10, r0) == r1) goto L26;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C30676j0 c30676j0;
        InterfaceC41635f interfaceC41635f;
        C30318v c30318v;
        InterfaceC41635f interfaceC41635f2;
        if (continuation instanceof C30676j0) {
            c30676j0 = (C30676j0) continuation;
            int i11 = c30676j0.f61990b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30676j0.f61990b = i11 - Integer.MIN_VALUE;
            } else {
                c30676j0 = new C30676j0(this, continuation);
            }
        } else {
            c30676j0 = new C30676j0(this, continuation);
        }
        Object obj2 = c30676j0.f61989a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30676j0.f61990b;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f2 = c30676j0.f61991c;
                ResultKt.throwOnFailure(obj2);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        interfaceC41635f = this.f61995a;
        C30877b c30877b = (C30877b) obj;
        if (c30877b != null) {
            C30736v0 c30736v0 = this.f61996b;
            C30332x c30332x = c30736v0.f62093f;
            C30314u c30314u = new C30314u(c30877b.f62373a, c30736v0.f62088a);
            c30676j0.f61991c = interfaceC41635f;
            c30676j0.f61990b = 1;
            Object objM70191a = c30332x.m70191a(c30314u, c30676j0);
            if (objM70191a != coroutine_suspended) {
                obj2 = objM70191a;
                interfaceC41635f2 = interfaceC41635f;
            }
        } else {
            c30318v = null;
            c30676j0.f61991c = null;
            c30676j0.f61990b = 2;
        }
        return coroutine_suspended;
        C30318v c30318v2 = (C30318v) obj2;
        interfaceC41635f = interfaceC41635f2;
        c30318v = c30318v2;
        c30676j0.f61991c = null;
        c30676j0.f61990b = 2;
    }
}
