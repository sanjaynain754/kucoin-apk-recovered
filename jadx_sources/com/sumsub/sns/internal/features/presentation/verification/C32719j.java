package com.sumsub.sns.internal.features.presentation.verification;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32719j implements SNSPinView.OnTextCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32730p f66930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32677B f66931b;

    public C32719j(C32730p c32730p, C32677B c32677b) {
        this.f66930a = c32730p;
        this.f66931b = c32677b;
    }

    @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.OnTextCompleteListener
    public final boolean onTextComplete(String str) {
        String str2;
        C32720j0 c32720j0 = (C32720j0) this.f66930a.f66979n.getValue();
        String str3 = this.f66931b.f66716h;
        int i11 = AbstractC32681F.f66733a[c32720j0.f66933a.ordinal()];
        if (i11 == 1) {
            str2 = "EMAIL_VERIFICATION";
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "PHONE_VERIFICATION";
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(c32720j0), null, null, new C32700Z(c32720j0, str2, null, c32720j0, str3, str), 3, null);
        SNSPinView sNSPinViewM71328j = this.f66930a.m71328j();
        if (sNSPinViewM71328j != null) {
            AbstractC28458h.m69339a((View) sNSPinViewM71328j);
        }
        return true;
    }
}
