package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.databinding.C28327G;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32547o;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.adapter.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32571g extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f66432g = 0;

    /* JADX INFO: renamed from: a */
    public final C28327G f66433a;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final void mo69072a(Object obj, int i11) {
        C28955c c28955c;
        AbstractC32550p abstractC32550p = (AbstractC32550p) obj;
        if (abstractC32550p instanceof C32547o) {
            C32547o c32547o = (C32547o) abstractC32550p;
            String str = c32547o.f66393a;
            if (str != null) {
                ImageView imageView = this.f66433a.f57647b;
                Context context = this.itemView.getContext();
                C28468k0 c28468k0 = C28468k0.f57983a;
                imageView.setImageDrawable(c28468k0.getIconHandler().onResolveIcon(context, str));
                SNSJsonCustomization customization = c28468k0.getCustomization();
                Integer num = null;
                SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
                C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
                if (c28966p != null) {
                    SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
                    boolean zM69346a = AbstractC28458h.m69346a(this.itemView.getResources().getConfiguration());
                    Map map = c28966p.f58877c;
                    if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                        num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
                    }
                    if (num != null) {
                        this.f66433a.f57647b.setImageTintList(ColorStateList.valueOf(num.intValue()));
                    }
                }
            }
            this.f66433a.f57648c.setText(c32547o.f66394b);
        }
    }

    public C32571g(View view) {
        super(view);
        int i11 = R$id.sns_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.sns_title;
            SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(view, i11);
            if (sNSSubtitle1TextView != null) {
                this.f66433a = new C28327G((LinearLayout) view, imageView, sNSSubtitle1TextView);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }
}
