package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28489r0;
import com.sumsub.sns.internal.core.common.C28477n0;
import com.sumsub.sns.internal.core.common.C28480o0;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.SNSEidExceptionReason;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31606b extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C31626i c31626i = (C31626i) this.receiver;
        if (zBooleanValue) {
            C31603a c31603a = C31626i.f64222k;
            c31626i.getClass();
        } else {
            C31583M0 c31583m0 = (C31583M0) c31626i.f64224a.getValue();
            AbstractC28489r0 abstractC28489r0M69348b = AbstractC28458h.m69348b(c31626i.requireContext());
            boolean z11 = Intrinsics.areEqual(abstractC28489r0M69348b, C28480o0.f58016b) || Intrinsics.areEqual(abstractC28489r0M69348b, C28477n0.f58014b);
            c31583m0.getClass();
            if (C33048a.f67454Q.m71434a()) {
                C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Skipping NFC check according to FF", null);
            } else if (z11) {
                C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "On NFC disabled", null);
                C41696j.m91104d(ViewModelKt.getViewModelScope(c31583m0), null, null, new C31659z0(c31583m0, null), 3, null);
            } else {
                C31583M0.m70762a(c31583m0, "NFC not supported", SNSEidExceptionReason.NFCNotAvailable, "sns_alert_nfcIsNotSupported", C31658z.f64262a, 20);
            }
        }
        return Unit.INSTANCE;
    }

    public C31606b(C31626i c31626i) {
        super(1, c31626i, C31626i.class, "onNfcStateChanged", "onNfcStateChanged(Z)V", 0);
    }
}
