package com.sumsub.sns.internal.features.presentation.country.picker;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.collections.SetsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30880B implements InterfaceC30906r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30893e f62378a;

    /* JADX INFO: renamed from: b */
    public final C30905q f62379b = new C30905q(false);

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f62380c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w f62381d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CountryPickerDialog f62382e;

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    /* JADX INFO: renamed from: a */
    public final void mo70505a(C30891d c30891d) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f62382e), null, null, new C30914z(this, c30891d, this.f62382e, null), 3, null);
    }

    public C30880B(CountryPickerDialog countryPickerDialog, InterfaceC30893e interfaceC30893e) {
        this.f62382e = countryPickerDialog;
        this.f62378a = interfaceC30893e;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f62380c = interfaceC41669nM91009a;
        this.f62381d = C41636g.m90916g0(C41636g.m90930n0(C41636g.m90881E(interfaceC41669nM91009a), new C30879A(null)), LifecycleOwnerKt.getLifecycleScope(countryPickerDialog), SharingStarted.INSTANCE.getEagerly(), SetsKt.emptySet());
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    /* JADX INFO: renamed from: a */
    public final InterfaceC41634e mo70504a() {
        return C41636g.m90889M(null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    public final C30905q getConfig() {
        return this.f62379b;
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    /* JADX INFO: renamed from: b */
    public final void mo70506b() {
    }
}
