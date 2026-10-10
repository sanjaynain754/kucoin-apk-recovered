package androidx.camera.extensions.internal;

import android.text.TextUtils;
import com.google.auto.value.AutoValue;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class Version implements Comparable<Version> {
    public static final Version VERSION_1_0 = create(1, 0, 0, "");
    public static final Version VERSION_1_1 = create(1, 1, 0, "");
    public static final Version VERSION_1_2 = create(1, 2, 0, "");
    public static final Version VERSION_1_3 = create(1, 3, 0, "");
    public static final Version VERSION_1_4 = create(1, 4, 0, "");
    public static final Version VERSION_1_5 = create(1, 5, 0, "");
    private static final Pattern VERSION_STRING_PATTERN = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    public abstract String getDescription();

    public abstract int getMajor();

    public abstract int getMinor();

    public abstract int getPatch();

    public static Version create(int i11, int i12, int i13, String str) {
        return new AutoValue_Version(i11, i12, i13, str);
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        return createBigInteger(this).compareTo(createBigInteger(version));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return Integer.valueOf(getMajor()).equals(Integer.valueOf(version.getMajor())) && Integer.valueOf(getMinor()).equals(Integer.valueOf(version.getMinor())) && Integer.valueOf(getPatch()).equals(Integer.valueOf(version.getPatch()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(getMajor() + C33978va.f72339h + getMinor() + C33978va.f72339h + getPatch());
        if (!TextUtils.isEmpty(getDescription())) {
            sb2.append(C33820nf.f71144W + getDescription());
        }
        return sb2.toString();
    }

    private static BigInteger createBigInteger(Version version) {
        return BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(BigInteger.valueOf(version.getMinor())).shiftLeft(32).or(BigInteger.valueOf(version.getPatch()));
    }

    public static Version parse(String str) {
        String strGroup;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = VERSION_STRING_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int i11 = Integer.parseInt(matcher.group(1));
        int i12 = Integer.parseInt(matcher.group(2));
        int i13 = Integer.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            strGroup = matcher.group(4);
        } else {
            strGroup = "";
        }
        return create(i11, i12, i13, strGroup);
    }

    public int compareTo(int i11) {
        return compareTo(i11, 0);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(getMajor()), Integer.valueOf(getMinor()), Integer.valueOf(getPatch()));
    }

    public int compareTo(int i11, int i12) {
        if (getMajor() == i11) {
            return Integer.compare(getMinor(), i12);
        }
        return Integer.compare(getMajor(), i11);
    }
}
