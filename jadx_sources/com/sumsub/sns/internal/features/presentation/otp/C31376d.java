package com.sumsub.sns.internal.features.presentation.otp;

import android.view.View;
import androidx.core.os.BundleKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31376d implements SNSPinView.OnTextCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31382j f63575a;

    public C31376d(C31382j c31382j) {
        this.f63575a = c31382j;
    }

    @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.OnTextCompleteListener
    public final boolean onTextComplete(String str) {
        C31389q c31389q = (C31389q) this.f63575a.f63583a.getValue();
        c31389q.getClass();
        Logger.DefaultImpls.v$default(C33272c.f67812a, c31389q.m70703e(), "onCodeCompleted", null, 4, null);
        Pair pairM90091to = TuplesKt.m90091to("result_key_code", str);
        C28936t c28936t = c31389q.f63615c;
        KProperty kProperty = C31389q.f63612d[0];
        c31389q.finishWithResult(10, BundleKt.bundleOf(pairM90091to, TuplesKt.m90091to("result_key_timestamp", Long.valueOf(((Number) c28936t.m69705a()).longValue()))));
        SNSPinView sNSPinViewM70701f = this.f63575a.m70701f();
        if (sNSPinViewM70701f == null) {
            return true;
        }
        AbstractC28458h.m69339a((View) sNSPinViewM70701f);
        return true;
    }
}
