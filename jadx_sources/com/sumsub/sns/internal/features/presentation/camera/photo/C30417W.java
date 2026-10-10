package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.text.Spanned;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30417W implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f61209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Spanned f61210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CharSequence f61211c;

    public C30417W(InterfaceC41634e interfaceC41634e, Spanned spanned, String str) {
        this.f61209a = interfaceC41634e;
        this.f61210b = spanned;
        this.f61211c = str;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f61209a.collect(new C30416V(interfaceC41635f, this.f61210b, this.f61211c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
