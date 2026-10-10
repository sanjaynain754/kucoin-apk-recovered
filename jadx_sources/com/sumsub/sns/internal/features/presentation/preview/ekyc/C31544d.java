package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29503S;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31544d implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31715m f64049a;

    public C31544d(C31715m c31715m) {
        this.f64049a = c31715m;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        C29456A0 c29456a0;
        C29503S c29503s;
        C31707h0 c31707h0 = (C31707h0) this.f64049a.f64393a.getValue();
        if (charSequence == null) {
            c31707h0.getClass();
        } else {
            InterfaceC28147s interfaceC28147sCurrentState = c31707h0.currentState();
            C31736z c31736z = interfaceC28147sCurrentState instanceof C31736z ? (C31736z) interfaceC28147sCurrentState : null;
            if (c31736z != null && (c29456a0 = c31736z.f64468f) != null && (c29503s = c29456a0.f59446e) != null) {
                int length = charSequence.length();
                Integer num = c29503s.f59523a;
                if (num != null && length == num.intValue()) {
                    InterfaceC41775x1 interfaceC41775x1 = c31707h0.f64370p;
                    if (interfaceC41775x1 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                    }
                    c31707h0.m70814a((Function1) new C31523K(c31707h0, c31736z.f64468f, charSequence, null));
                }
            }
        }
        TextView textViewM70845n = this.f64049a.m70845n();
        if (textViewM70845n != null) {
            textViewM70845n.setText((CharSequence) null);
        }
        SNSPinView sNSPinViewM70846o = this.f64049a.m70846o();
        if (sNSPinViewM70846o != null) {
            sNSPinViewM70846o.setError(false);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
