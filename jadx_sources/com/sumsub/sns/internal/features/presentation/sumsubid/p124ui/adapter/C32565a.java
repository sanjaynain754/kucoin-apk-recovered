package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter;

import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.widget.SNSCardCheckBox;
import com.sumsub.sns.databinding.C28325E;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32529i;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32565a extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f66422g = 0;

    /* JADX INFO: renamed from: a */
    public final C32566b f66423a;

    /* JADX INFO: renamed from: b */
    public final C28325E f66424b;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69072a(Object obj, int i11) {
        m71176a((AbstractC32550p) obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m71176a(final AbstractC32550p abstractC32550p) {
        if (abstractC32550p instanceof C32529i) {
            C32529i c32529i = (C32529i) abstractC32550p;
            this.f66424b.f57640d.setText(c32529i.f66355c);
            this.f66424b.f57639c.setText(c32529i.f66356d);
            SNSCardCheckBox sNSCardCheckBox = this.f66424b.f57638b;
            sNSCardCheckBox.setOnCheckedChangeListener(null);
            sNSCardCheckBox.setChecked(c32529i.f66357e);
            sNSCardCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.h
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    C32565a.m71175a(abstractC32550p, this, compoundButton, z11);
                }
            });
        }
    }

    public C32565a(ConstraintLayout constraintLayout, C32566b c32566b) {
        super(constraintLayout);
        this.f66423a = c32566b;
        this.f66424b = C28325E.m69248a(constraintLayout);
    }

    /* JADX INFO: renamed from: a */
    public static final void m71175a(AbstractC32550p abstractC32550p, C32565a c32565a, CompoundButton compoundButton, boolean z11) {
        ((C32529i) abstractC32550p).f66357e = z11;
        if (z11) {
            c32565a.f66423a.invoke(Integer.valueOf(c32565a.getAdapterPosition()), abstractC32550p);
        }
    }
}
