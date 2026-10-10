package com.appsflyer.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1vSDK {
    public final String[] getRevenue;

    public AFb1vSDK(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null && patternCompile.matcher(str).matches()) {
                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                } else {
                    AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
                }
            }
            if (arrayList.contains(TtmlNode.COMBINE_ALL)) {
                this.getRevenue = new String[]{TtmlNode.COMBINE_ALL};
                return;
            } else if (!arrayList.isEmpty()) {
                this.getRevenue = (String[]) arrayList.toArray(new String[0]);
                return;
            } else {
                this.getRevenue = null;
                return;
            }
        }
        this.getRevenue = null;
    }
}
