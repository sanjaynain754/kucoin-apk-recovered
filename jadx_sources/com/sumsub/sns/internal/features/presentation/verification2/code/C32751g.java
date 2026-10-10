package com.sumsub.sns.internal.features.presentation.verification2.code;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.databinding.C28355t;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32820d;
import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32751g implements SNSPinView.OnTextCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32759o f67009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28355t f67010b;

    public C32751g(C32759o c32759o, C28355t c28355t) {
        this.f67009a = c32759o;
        this.f67010b = c28355t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.OnTextCompleteListener
    public final boolean onTextComplete(String str) {
        String str2;
        C32767w c32767w = (C32767w) this.f67009a.f67021a.getValue();
        InterfaceC32823g interfaceC32823g = (InterfaceC32823g) ((C32814J) c32767w.f67059a).f67152h.f67175b.getValue();
        if (interfaceC32823g instanceof C32820d) {
            str2 = ((C32820d) interfaceC32823g).f67163b;
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (str3 != null) {
            c32767w.showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(c32767w), C41782z0.m91392b(), null, new C32764t(c32767w, null, c32767w, str3, str), 2, null);
        }
        AbstractC28458h.m69339a((View) this.f67010b.f57793c);
        return true;
    }
}
