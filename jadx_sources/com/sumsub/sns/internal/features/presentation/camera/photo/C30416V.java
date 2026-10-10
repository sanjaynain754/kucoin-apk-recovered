package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.text.Spanned;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30416V implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f61206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Spanned f61207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CharSequence f61208c;

    public C30416V(InterfaceC41635f interfaceC41635f, Spanned spanned, CharSequence charSequence) {
        this.f61206a = interfaceC41635f;
        this.f61207b = spanned;
        this.f61208c = charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30415U c30415u;
        if (continuation instanceof C30415U) {
            c30415u = (C30415U) continuation;
            int i11 = c30415u.f61204b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30415u.f61204b = i11 - Integer.MIN_VALUE;
            } else {
                c30415u = new C30415U(this, continuation);
            }
        } else {
            c30415u = new C30415U(this, continuation);
        }
        Object obj2 = c30415u.f61203a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30415u.f61204b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f61206a;
            C30735v c30735v = new C30735v(this.f61207b, new C30679l(this.f61208c, ((C30400E) obj) != null));
            c30415u.f61204b = 1;
            if (interfaceC41635f.emit(c30735v, c30415u) == coroutine_suspended) {
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
