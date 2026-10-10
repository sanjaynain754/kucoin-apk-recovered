package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i;
import com.sumsub.sns.internal.core.presentation.bottomsheet.C28717a;
import com.sumsub.sns.internal.core.presentation.bottomsheet.C28720d;
import com.sumsub.sns.internal.core.presentation.bottomsheet.InterfaceC28719c;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31717n extends AbstractC28725i {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty[] f64415s = {AbstractC28118g.m69077a(C31717n.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31717n.class, "tvBody", "getTvBody()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31717n.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0)};

    /* JADX INFO: renamed from: k */
    public final Function0 f64416k;

    /* JADX INFO: renamed from: l */
    public final Function0 f64417l;

    /* JADX INFO: renamed from: m */
    public final String f64418m;

    /* JADX INFO: renamed from: n */
    public final String f64419n;

    /* JADX INFO: renamed from: o */
    public final C28717a f64420o;

    /* JADX INFO: renamed from: p */
    public final C28778k f64421p;

    /* JADX INFO: renamed from: q */
    public final C28778k f64422q;

    /* JADX INFO: renamed from: r */
    public final C28778k f64423r;

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: a */
    public final View mo69543a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R$layout.sns_ekyc_instructions_bottom_sheet, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[PHI: r2
      0x0025: PHI (r2v3 com.sumsub.sns.internal.core.presentation.bottomsheet.d) = 
      (r2v2 com.sumsub.sns.internal.core.presentation.bottomsheet.d)
      (r2v8 com.sumsub.sns.internal.core.presentation.bottomsheet.d)
     binds: [B:3:0x0007, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final void m70851a(C31717n c31717n, View view) {
        AbstractC28725i.m69541a(c31717n, Control.ConfirmButton);
        C28720d c28720d = c31717n.f58412e;
        if (c28720d != null) {
            c28720d.dismiss();
        } else {
            FragmentManager childFragmentManager = c31717n.f58549a.getChildFragmentManager();
            childFragmentManager.executePendingTransactions();
            Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(c31717n.mo69549n());
            c28720d = fragmentFindFragmentByTag instanceof C28720d ? (C28720d) fragmentFindFragmentByTag : null;
            if (c28720d != null) {
                c28720d.dismiss();
            } else {
                c31717n.m69608b("Bottom sheet is dismissed");
            }
        }
        c31717n.f64417l.invoke();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f64418m;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: n */
    public final String mo69549n() {
        return this.f64419n;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: o */
    public final InterfaceC28719c mo69550o() {
        return this.f64420o;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: p */
    public final void mo69551p() {
        C31540b c31540b = (C31540b) this.f64416k.invoke();
        if (c31540b == null) {
            C28720d c28720d = this.f58412e;
            if (c28720d != null) {
                c28720d.dismiss();
                return;
            }
            FragmentManager childFragmentManager = this.f58549a.getChildFragmentManager();
            childFragmentManager.executePendingTransactions();
            Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(mo69549n());
            C28720d c28720d2 = fragmentFindFragmentByTag instanceof C28720d ? (C28720d) fragmentFindFragmentByTag : null;
            if (c28720d2 != null) {
                c28720d2.dismiss();
                return;
            } else {
                m69608b("Bottom sheet is dismissed");
                return;
            }
        }
        C28778k c28778k = this.f64421p;
        KProperty[] kPropertyArr = f64415s;
        TextView textView = (TextView) c28778k.getValue(this, kPropertyArr[0]);
        if (textView != null) {
            textView.setText(c31540b.f64039a);
        }
        TextView textView2 = (TextView) this.f64422q.getValue(this, kPropertyArr[1]);
        if (textView2 != null) {
            textView2.setText(c31540b.f64040b);
        }
        TextView textView3 = (TextView) this.f64422q.getValue(this, kPropertyArr[1]);
        if (textView3 != null) {
            CharSequence charSequence = c31540b.f64040b;
            textView3.setVisibility((charSequence == null || StringsKt.isBlank(charSequence)) ? 8 : 0);
        }
        Button button = (Button) this.f64423r.getValue(this, kPropertyArr[2]);
        if (button != null) {
            button.setText(c31540b.f64041c);
        }
        Button button2 = (Button) this.f64423r.getValue(this, kPropertyArr[2]);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31717n.m70851a(this.f64443b, view);
                }
            });
        }
    }

    public C31717n(C31715m c31715m, Function0 function0, Function0 function1) {
        super(c31715m);
        this.f64416k = function0;
        this.f64417l = function1;
        this.f64418m = "SNSEkycInstructionsBottomSheet";
        this.f64419n = "SNSEkycInstructionsBottomSheet";
        this.f64420o = new C28717a(Popup.EkycConfirmationPopup);
        this.f64421p = m69548b(R$id.sns_ekyc_instructions_title);
        this.f64422q = m69548b(R$id.sns_ekyc_instructions_body);
        this.f64423r = m69548b(R$id.sns_ekyc_instructions_button);
    }
}
