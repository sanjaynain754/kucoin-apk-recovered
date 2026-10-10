package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import kotlinx.coroutines.C41696j;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31690o implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31696u f64310a;

    public C31690o(C31696u c31696u) {
        this.f64310a = c31696u;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        if (charSequence != null) {
            C31675M c31675m = (C31675M) this.f64310a.f64318a.getValue();
            String string = charSequence.toString();
            c31675m.getClass();
            C41696j.m91104d(ViewModelKt.getViewModelScope(c31675m), null, null, new C31670H(c31675m, string, null), 3, null);
            C31696u c31696u = this.f64310a;
            TextView textView = (TextView) c31696u.f64323f.getValue(c31696u, C31696u.f64317j[3]);
            if (textView != null) {
                textView.setVisibility(8);
            }
            SNSPinView sNSPinViewM70803f = this.f64310a.m70803f();
            if (sNSPinViewM70803f != null) {
                sNSPinViewM70803f.setError(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
