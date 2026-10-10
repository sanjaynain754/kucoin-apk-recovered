package androidx.media3.p022ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.media3.common.util.Util;
import com.tencent.bugly.proguard.C33978va;

/* JADX INFO: loaded from: classes34.dex */
final class HtmlUtils {
    public static String cssAllClassDescendantsSelector(String str) {
        return C33978va.f72339h + str + ",." + str + " *";
    }

    private HtmlUtils() {
    }

    public static String toCssRgba(@ColorInt int i11) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11)), Double.valueOf(((double) Color.alpha(i11)) / 255.0d));
    }
}
