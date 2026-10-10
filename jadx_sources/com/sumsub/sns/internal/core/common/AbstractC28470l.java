package com.sumsub.sns.internal.core.common;

import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.C6184u;
import com.facebook.react.uimanager.C6185v;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28470l {
    /* JADX INFO: renamed from: a */
    public static final void m69370a(Drawable drawable, int i11) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            C6185v.m10570a();
            porterDuffColorFilter = C6184u.m10569a(i11, BlendMode.SRC_ATOP);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }
}
