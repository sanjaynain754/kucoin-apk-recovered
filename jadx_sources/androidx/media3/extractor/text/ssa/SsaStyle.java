package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;

    @Nullable
    @ColorInt
    public final Integer outlineColor;

    @Nullable
    @ColorInt
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    public static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;

        @Nullable
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i11 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF position = parsePosition(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(str2);
                    if (alignmentOverride != -1) {
                        i11 = alignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i11, pointF);
        }

        @Nullable
        private static PointF parsePosition(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.m2959i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(strGroup2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }

        private Overrides(int i11, @Nullable PointF pointF) {
            this.alignment = i11;
            this.position = pointF;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private static boolean isValidBorderStyle(int i11) {
        return i11 == 1 || i11 == 3;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int i11 = Integer.parseInt(str);
            return i11 == 1 || i11 == -1;
        } catch (NumberFormatException e11) {
            Log.m2962w(TAG, "Failed to parse boolean value: '" + str + "'", e11);
            return false;
        }
    }

    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
        @Nullable
        public static Format fromFormatLine(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < strArrSplit.length; i22++) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i22].trim());
                lowerCase.getClass();
                switch (lowerCase) {
                    case "italic":
                        i17 = i22;
                        break;
                    case "underline":
                        i18 = i22;
                        break;
                    case "strikeout":
                        i19 = i22;
                        break;
                    case "primarycolour":
                        i13 = i22;
                        break;
                    case "bold":
                        i16 = i22;
                        break;
                    case "name":
                        i11 = i22;
                        break;
                    case "fontsize":
                        i15 = i22;
                        break;
                    case "borderstyle":
                        i21 = i22;
                        break;
                    case "alignment":
                        i12 = i22;
                        break;
                    case "outlinecolour":
                        i14 = i22;
                        break;
                }
            }
            if (i11 != -1) {
                return new Format(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, strArrSplit.length);
            }
            return null;
        }

        private Format(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            this.nameIndex = i11;
            this.alignmentIndex = i12;
            this.primaryColorIndex = i13;
            this.outlineColorIndex = i14;
            this.fontSizeIndex = i15;
            this.boldIndex = i16;
            this.italicIndex = i17;
            this.underlineIndex = i18;
            this.strikeoutIndex = i19;
            this.borderStyleIndex = i21;
            this.length = i22;
        }
    }

    @Nullable
    public static SsaStyle fromStyleLine(String str, Format format) {
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = format.length;
        if (length != i11) {
            Log.m2961w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[format.nameIndex].trim();
            int i12 = format.alignmentIndex;
            int alignment = i12 != -1 ? parseAlignment(strArrSplit[i12].trim()) : -1;
            int i13 = format.primaryColorIndex;
            Integer color = i13 != -1 ? parseColor(strArrSplit[i13].trim()) : null;
            int i14 = format.outlineColorIndex;
            Integer color2 = i14 != -1 ? parseColor(strArrSplit[i14].trim()) : null;
            int i15 = format.fontSizeIndex;
            float fontSize = i15 != -1 ? parseFontSize(strArrSplit[i15].trim()) : -3.4028235E38f;
            int i16 = format.boldIndex;
            boolean z11 = false;
            boolean z12 = true;
            if (i16 != -1 && parseBooleanValue(strArrSplit[i16].trim())) {
                z11 = true;
            }
            int i17 = format.italicIndex;
            if (i17 == -1 || !parseBooleanValue(strArrSplit[i17].trim())) {
                z12 = false;
            }
            int i18 = format.underlineIndex;
            if (i18 == -1 || !parseBooleanValue(strArrSplit[i18].trim())) {
                z12 = false;
            }
            int i19 = format.strikeoutIndex;
            boolean z13 = i19 != -1 && parseBooleanValue(strArrSplit[i19].trim());
            int i21 = format.borderStyleIndex;
            return new SsaStyle(strTrim, alignment, color, color2, fontSize, z11, z12, z12, z13, i21 != -1 ? parseBorderStyle(strArrSplit[i21].trim()) : -1);
        } catch (RuntimeException e11) {
            Log.m2962w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e11);
            return null;
        }
    }

    @Nullable
    @ColorInt
    public static Integer parseColor(String str) {
        try {
            long j11 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.checkArgument(j11 <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j11 >> 24) & 255) ^ 255), Ints.checkedCast(j11 & 255), Ints.checkedCast((j11 >> 8) & 255), Ints.checkedCast((j11 >> 16) & 255)));
        } catch (IllegalArgumentException e11) {
            Log.m2962w(TAG, "Failed to parse color expression: '" + str + "'", e11);
            return null;
        }
    }

    private SsaStyle(String str, int i11, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f11, boolean z11, boolean z12, boolean z13, boolean z14, int i12) {
        this.name = str;
        this.alignment = i11;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f11;
        this.bold = z11;
        this.italic = z12;
        this.underline = z13;
        this.strikeout = z14;
        this.borderStyle = i12;
    }

    private static boolean isValidAlignment(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int i11 = Integer.parseInt(str.trim());
            if (isValidAlignment(i11)) {
                return i11;
            }
        } catch (NumberFormatException unused) {
        }
        Log.m2961w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int parseBorderStyle(String str) {
        try {
            int i11 = Integer.parseInt(str.trim());
            if (isValidBorderStyle(i11)) {
                return i11;
            }
        } catch (NumberFormatException unused) {
        }
        Log.m2961w(TAG, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e11) {
            Log.m2962w(TAG, "Failed to parse font size: '" + str + "'", e11);
            return -3.4028235E38f;
        }
    }
}
