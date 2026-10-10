package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.databinding.C28328H;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32535k;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32569e extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f66427g = 0;

    /* JADX INFO: renamed from: a */
    public final C28328H f66428a;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final void mo69072a(Object obj, int i11) {
        AbstractC32550p abstractC32550p = (AbstractC32550p) obj;
        if (abstractC32550p instanceof C32535k) {
            C32535k c32535k = (C32535k) abstractC32550p;
            this.f66428a.f57651c.setText(c32535k.f66366a);
            this.f66428a.f57650b.setText(c32535k.f66367b);
        }
    }

    public C32569e(View view) {
        super(view);
        int i11 = R$id.sns_subtitle;
        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(view, i11);
        if (sNSSubtitle2TextView != null) {
            i11 = R$id.sns_title;
            SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(view, i11);
            if (sNSH1TextView != null) {
                this.f66428a = new C28328H((LinearLayout) view, sNSSubtitle2TextView, sNSH1TextView);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }
}
