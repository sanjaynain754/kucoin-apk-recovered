package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28882c;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28883d;
import com.sumsub.sns.internal.features.presentation.camera.C30796x;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30726v implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62073a;

    public C30726v(InterfaceC41635f interfaceC41635f) {
        this.f62073a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30725u c30725u;
        String str;
        if (continuation instanceof C30725u) {
            c30725u = (C30725u) continuation;
            int i11 = c30725u.f62071b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30725u.f62071b = i11 - Integer.MIN_VALUE;
            } else {
                c30725u = new C30725u(this, continuation);
            }
        } else {
            c30725u = new C30725u(this, continuation);
        }
        Object obj2 = c30725u.f62070a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30725u.f62071b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62073a;
            AbstractC28885f abstractC28885f = (AbstractC28885f) obj;
            if (abstractC28885f == null) {
                str = null;
            } else if (abstractC28885f instanceof C28883d) {
                Object obj3 = ((C28883d) abstractC28885f).f58730b.get("title");
                if (obj3 instanceof String) {
                    str = (String) obj3;
                } else {
                    str = null;
                }
            } else if (abstractC28885f instanceof C28882c) {
                str = ((C28882c) abstractC28885f).f58725a;
            } else {
                str = null;
            }
            C30796x c30796x = new C30796x(str);
            c30725u.f62071b = 1;
            if (interfaceC41635f.emit(c30796x, c30725u) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
