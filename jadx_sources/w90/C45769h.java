package w90;

import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: w90.h */
/* JADX INFO: compiled from: ISO6709LocationParser.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45769h {

    /* JADX INFO: renamed from: a */
    public final Pattern f103200a = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)");

    @Nullable
    /* JADX INFO: renamed from: a */
    public float[] m101062a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f103200a.matcher(str);
        if (matcher.find() && matcher.groupCount() == 2) {
            try {
                return new float[]{Float.parseFloat(matcher.group(1)), Float.parseFloat(matcher.group(2))};
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
