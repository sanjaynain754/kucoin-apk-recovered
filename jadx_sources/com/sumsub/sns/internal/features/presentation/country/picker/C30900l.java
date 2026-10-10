package com.sumsub.sns.internal.features.presentation.country.picker;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30900l implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30897i f62424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountryPickerDialog f62425b;

    public C30900l(C30897i c30897i, CountryPickerDialog countryPickerDialog) {
        this.f62424a = c30897i;
        this.f62425b = countryPickerDialog;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f62424a.collect(new C30899k(interfaceC41635f, this.f62425b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
