package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter;

import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.widget.SNSCardRadioButton;
import com.sumsub.sns.databinding.C28326F;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32541m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32570f extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f66429g = 0;

    /* JADX INFO: renamed from: a */
    public final C32567c f66430a;

    /* JADX INFO: renamed from: b */
    public final C28326F f66431b;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69072a(Object obj, int i11) {
        m71179a((AbstractC32550p) obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m71179a(final AbstractC32550p abstractC32550p) {
        if (abstractC32550p instanceof C32541m) {
            C32541m c32541m = (C32541m) abstractC32550p;
            AbstractC28458h.m69341a(this.f66431b.f57645e, c32541m.f66383e);
            AbstractC28458h.m69341a(this.f66431b.f57644d, c32541m.f66384f);
            SNSCardRadioButton sNSCardRadioButton = this.f66431b.f57643c;
            sNSCardRadioButton.setOnCheckedChangeListener(null);
            sNSCardRadioButton.setChecked(c32541m.f66385g);
            sNSCardRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    C32570f.m71178a(this.f66436b, abstractC32550p, compoundButton, z11);
                }
            });
            if (c32541m.f66382d == null) {
                this.f66431b.f57642b.setVisibility(8);
                return;
            }
            this.f66431b.f57642b.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(this.itemView.getContext(), c32541m.f66382d));
            this.f66431b.f57642b.setVisibility(0);
        }
    }

    public C32570f(ConstraintLayout constraintLayout, C32567c c32567c) {
        super(constraintLayout);
        this.f66430a = c32567c;
        this.f66431b = C28326F.m69249a(constraintLayout);
    }

    /* JADX INFO: renamed from: a */
    public static final void m71178a(C32570f c32570f, AbstractC32550p abstractC32550p, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            c32570f.f66430a.invoke(Integer.valueOf(c32570f.getAdapterPosition()), abstractC32550p);
        }
    }
}
