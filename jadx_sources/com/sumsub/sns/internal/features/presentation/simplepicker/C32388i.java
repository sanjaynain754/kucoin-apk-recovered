package com.sumsub.sns.internal.features.presentation.simplepicker;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.databinding.C28324D;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32388i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f65974g = 0;

    /* JADX INFO: renamed from: a */
    public final C28324D f65975a;

    /* JADX INFO: renamed from: b */
    public final Function1 f65976b;

    /* JADX INFO: renamed from: a */
    public final void m71110a(final C32387h c32387h) {
        this.f65975a.f57636b.setText(c32387h.f65973b);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.simplepicker.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C32388i.m71109a(this.f65979b, c32387h, view);
            }
        });
    }

    public C32388i(C28324D c28324d, Function1 function1) {
        Integer num;
        C28955c c28955c;
        super(c28324d.f57635a);
        this.f65975a = c28324d;
        this.f65976b = function1;
        SNSSubtitle2TextView sNSSubtitle2TextView = c28324d.f57635a;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.LIST_SELECTED_ITEM_BACKGROUND;
            boolean zM69346a = AbstractC28458h.m69346a(sNSSubtitle2TextView.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                Drawable background = sNSSubtitle2TextView.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    rippleDrawable.setColor(ColorStateList.valueOf(iIntValue));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m71109a(C32388i c32388i, C32387h c32387h, View view) {
        c32388i.f65976b.invoke(c32387h);
    }
}
