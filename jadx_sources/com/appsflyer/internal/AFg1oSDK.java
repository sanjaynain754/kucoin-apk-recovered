package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1oSDK implements AFg1uSDK {

    @NotNull
    private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1uSDK
    @NotNull
    public final Map<String, String> AFAdRevenueData(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getMonetizationNetwork.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i11 = resources.getConfiguration().screenLayout & 15;
            this.getMonetizationNetwork.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.getMonetizationNetwork.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.getMonetizationNetwork.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getMonetizationNetwork.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getMonetizationNetwork.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getMonetizationNetwork.put("size", String.valueOf(i11));
        }
        return this.getMonetizationNetwork;
    }
}
