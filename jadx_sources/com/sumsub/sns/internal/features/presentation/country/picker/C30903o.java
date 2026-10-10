package com.sumsub.sns.internal.features.presentation.country.picker;

import androidx.lifecycle.LifecycleOwnerKt;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30903o implements InterfaceC30906r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30894f f62432a;

    /* JADX INFO: renamed from: b */
    public final C30905q f62433b = new C30905q(true);

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f62434c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w f62435d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CountryPickerDialog f62436e;

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    /* JADX INFO: renamed from: a */
    public final void mo70505a(C30891d c30891d) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f62436e), null, null, new C30901m(this, c30891d, null), 3, null);
    }

    public C30903o(CountryPickerDialog countryPickerDialog, SNSApplicantDataMultipleCountrySelectionFieldView.C282561 c282561) {
        this.f62436e = countryPickerDialog;
        this.f62432a = c282561;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f62434c = interfaceC41669nM91009a;
        this.f62435d = C41636g.m90916g0(C41636g.m90930n0(C41636g.m90881E(interfaceC41669nM91009a), new C30902n(null)), LifecycleOwnerKt.getLifecycleScope(countryPickerDialog), SharingStarted.INSTANCE.getEagerly(), SetsKt.emptySet());
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    /* JADX INFO: renamed from: a */
    public final InterfaceC41634e mo70504a() {
        return new C30900l(new C30897i(this.f62435d), this.f62436e);
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    /* JADX INFO: renamed from: b */
    public final void mo70506b() {
        InterfaceC30894f interfaceC30894f = this.f62432a;
        if (interfaceC30894f != null) {
            interfaceC30894f.onItemsSelected(CollectionsKt.toList((Iterable) this.f62435d.getValue()));
        }
        this.f62436e.dismiss();
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30906r
    public final C30905q getConfig() {
        return this.f62433b;
    }
}
