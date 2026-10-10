package com.sumsub.sns.internal.features.presentation.country;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sumsub.sns.internal.core.common.AbstractC28423V;
import com.sumsub.sns.internal.core.common.C28468k0;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30878c {
    /* JADX INFO: renamed from: a */
    public static final Drawable m70503a(C30877b c30877b, Context context) {
        Set set = AbstractC28423V.f57933a;
        String str = c30877b.f62373a;
        Locale locale = (Locale) ((Map) AbstractC28423V.f57934b.getValue()).get(str);
        String country = locale != null ? locale.getCountry() : null;
        if (country != null) {
            str = country;
        }
        return C28468k0.f57983a.getIconHandler().onResolveIcon(context, "Flag/" + str.toLowerCase(Locale.ROOT));
    }
}
