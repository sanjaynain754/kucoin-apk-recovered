package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.core.analytics.Screen;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31098k0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62882a;

    public C31098k0(InterfaceC41635f interfaceC41635f, C31120v0 c31120v0) {
        this.f62882a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31096j0 c31096j0;
        if (continuation instanceof C31096j0) {
            c31096j0 = (C31096j0) continuation;
            int i11 = c31096j0.f62879b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31096j0.f62879b = i11 - Integer.MIN_VALUE;
            } else {
                c31096j0 = new C31096j0(this, continuation);
            }
        } else {
            c31096j0 = new C31096j0(this, continuation);
        }
        Object obj2 = c31096j0.f62878a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31096j0.f62879b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f62882a;
            KProperty[] kPropertyArr = C31120v0.f62914w;
            Screen screen = ((InterfaceC31123x) obj) instanceof C31111r ? Screen.ProofOfAddressFormScreen : Screen.ProofOfAddressScreen;
            c31096j0.f62879b = 1;
            if (interfaceC41635f.emit(screen, c31096j0) == coroutine_suspended) {
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
