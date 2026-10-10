package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30425b0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f61242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CharSequence f61243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CharSequence f61244c;

    public C30425b0(InterfaceC41635f interfaceC41635f, CharSequence charSequence, CharSequence charSequence2) {
        this.f61242a = interfaceC41635f;
        this.f61243b = charSequence;
        this.f61244c = charSequence2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30422a0 c30422a0;
        if (continuation instanceof C30422a0) {
            c30422a0 = (C30422a0) continuation;
            int i11 = c30422a0.f61238b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30422a0.f61238b = i11 - Integer.MIN_VALUE;
            } else {
                c30422a0 = new C30422a0(this, continuation);
            }
        } else {
            c30422a0 = new C30422a0(this, continuation);
        }
        Object obj2 = c30422a0.f61237a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30422a0.f61238b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f61242a;
            C30398C c30398c = new C30398C(this.f61243b, this.f61244c, (C30877b) obj);
            c30422a0.f61238b = 1;
            if (interfaceC41635f.emit(c30398c, c30422a0) == coroutine_suspended) {
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
