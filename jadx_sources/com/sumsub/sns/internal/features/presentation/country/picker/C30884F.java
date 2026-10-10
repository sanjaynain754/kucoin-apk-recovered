package com.sumsub.sns.internal.features.presentation.country.picker;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSCheckBox;
import com.sumsub.sns.core.widget.SNSFlagView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.databinding.C28336a;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.presentation.country.AbstractC30878c;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30884F extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f62392g = 0;

    /* JADX INFO: renamed from: a */
    public final C30889c f62393a;

    /* JADX INFO: renamed from: b */
    public final boolean f62394b;

    /* JADX INFO: renamed from: c */
    public final SNSSubtitle2TextView f62395c;

    /* JADX INFO: renamed from: d */
    public final SNSFlagView f62396d;

    /* JADX INFO: renamed from: e */
    public final SNSCheckBox f62397e;

    /* JADX INFO: renamed from: a */
    public final void m70510a(final C30877b c30877b, boolean z11) {
        this.f62395c.setText(c30877b.f62374b);
        this.f62396d.setImageDrawable(AbstractC30878c.m70503a(c30877b, this.itemView.getContext()));
        this.f62397e.setVisibility(this.f62394b ? 0 : 8);
        this.f62397e.setChecked(z11);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.country.picker.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C30884F.m70509a(this.f62401b, c30877b, view);
            }
        });
    }

    public C30884F(C28336a c28336a, C30889c c30889c, boolean z11) {
        Integer num;
        C28955c c28955c;
        super(c28336a.f57687a);
        this.f62393a = c30889c;
        this.f62394b = z11;
        this.f62395c = c28336a.f57690d;
        this.f62396d = c28336a.f57688b;
        this.f62397e = c28336a.f57689c;
        ConstraintLayout constraintLayout = c28336a.f57687a;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.LIST_SELECTED_ITEM_BACKGROUND;
            boolean zM69346a = AbstractC28458h.m69346a(constraintLayout.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                Drawable background = constraintLayout.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    rippleDrawable.setColor(ColorStateList.valueOf(iIntValue));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70509a(C30884F c30884f, C30877b c30877b, View view) {
        SNSCheckBox sNSCheckBox = c30884f.f62397e;
        sNSCheckBox.setChecked(!sNSCheckBox.isChecked());
        c30884f.f62393a.invoke(c30877b);
    }
}
