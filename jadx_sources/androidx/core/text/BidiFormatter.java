package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes23.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    static final BidiFormatter DEFAULT_LTR_INSTANCE;
    static final BidiFormatter DEFAULT_RTL_INSTANCE;
    static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z11) {
            return z11 ? BidiFormatter.DEFAULT_RTL_INSTANCE : BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        private void initialize(boolean z11) {
            this.mIsRtlContext = z11;
            this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public BidiFormatter build() {
            return (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) ? getDefaultInstanceFromContext(this.mIsRtlContext) : new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }

        public Builder stereoReset(boolean z11) {
            if (z11) {
                this.mFlags |= 2;
                return this;
            }
            this.mFlags &= -3;
            return this;
        }

        public Builder(boolean z11) {
            initialize(z11);
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.isRtlLocale(locale));
        }
    }

    public static class DirectionalityEstimator {
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final CharSequence text;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];

        public int getEntryDir() {
            this.charIndex = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.charIndex < this.length && i11 == 0) {
                byte bDirTypeForward = dirTypeForward();
                if (bDirTypeForward != 0) {
                    if (bDirTypeForward == 1 || bDirTypeForward == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (bDirTypeForward != 9) {
                        switch (bDirTypeForward) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                continue;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                continue;
                            case 18:
                                i13--;
                                i12 = 0;
                                continue;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        break;
                    case 18:
                        i13++;
                        continue;
                    default:
                        continue;
                }
                i13--;
            }
            return 0;
        }

        static {
            for (int i11 = 0; i11 < DIR_TYPE_CACHE_SIZE; i11++) {
                DIR_TYPE_CACHE[i11] = Character.getDirectionality(i11);
            }
        }

        private static byte getCachedDirectionality(char c11) {
            return c11 < DIR_TYPE_CACHE_SIZE ? DIR_TYPE_CACHE[c11] : Character.getDirectionality(c11);
        }

        private byte skipEntityBackward() {
            char cCharAt;
            int i11 = this.charIndex;
            do {
                int i12 = this.charIndex;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i13 = i12 - 1;
                this.charIndex = i13;
                cCharAt = charSequence.charAt(i13);
                this.lastChar = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.charIndex = i11;
            this.lastChar = ';';
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char cCharAt;
            do {
                int i11 = this.charIndex;
                if (i11 >= this.length) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i11 + 1;
                cCharAt = charSequence.charAt(i11);
                this.lastChar = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte skipTagBackward() {
            char cCharAt;
            int i11 = this.charIndex;
            while (true) {
                int i12 = this.charIndex;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i13 = i12 - 1;
                this.charIndex = i13;
                char cCharAt2 = charSequence.charAt(i13);
                this.lastChar = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i14 = this.charIndex;
                        if (i14 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.text;
                        int i15 = i14 - 1;
                        this.charIndex = i15;
                        cCharAt = charSequence2.charAt(i15);
                        this.lastChar = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.charIndex = i11;
            this.lastChar = Typography.greater;
            return (byte) 13;
        }

        private byte skipTagForward() {
            char cCharAt;
            int i11 = this.charIndex;
            while (true) {
                int i12 = this.charIndex;
                if (i12 >= this.length) {
                    this.charIndex = i11;
                    this.lastChar = Typography.less;
                    return (byte) 13;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i12 + 1;
                char cCharAt2 = charSequence.charAt(i12);
                this.lastChar = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.charIndex;
                        if (i13 >= this.length) {
                            break;
                        }
                        CharSequence charSequence2 = this.text;
                        this.charIndex = i13 + 1;
                        cCharAt = charSequence2.charAt(i13);
                        this.lastChar = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        public byte dirTypeBackward() {
            char cCharAt = this.text.charAt(this.charIndex - 1);
            this.lastChar = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.charIndex--;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c11 = this.lastChar;
            if (c11 == '>') {
                return skipTagBackward();
            }
            return c11 == ';' ? skipEntityBackward() : cachedDirectionality;
        }

        public byte dirTypeForward() {
            char cCharAt = this.text.charAt(this.charIndex);
            this.lastChar = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.text, this.charIndex);
                this.charIndex += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.charIndex++;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c11 = this.lastChar;
            if (c11 == '<') {
                return skipTagForward();
            }
            return c11 == '&' ? skipEntityForward() : cachedDirectionality;
        }

        public int getExitDir() {
            this.charIndex = this.length;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                while (this.charIndex > 0) {
                    byte bDirTypeBackward = dirTypeBackward();
                    if (bDirTypeBackward == 0) {
                        if (i11 == 0) {
                            return -1;
                        }
                        if (i12 == 0) {
                        }
                    } else if (bDirTypeBackward == 1 || bDirTypeBackward == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                        if (i12 == 0) {
                        }
                    } else if (bDirTypeBackward != 9) {
                        switch (bDirTypeBackward) {
                            case 14:
                            case 15:
                                if (i12 == i11) {
                                    return -1;
                                }
                                i11--;
                                break;
                            case 16:
                            case 17:
                                if (i12 == i11) {
                                    return 1;
                                }
                                i11--;
                                break;
                            case 18:
                                i11++;
                                break;
                            default:
                                if (i12 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        public DirectionalityEstimator(CharSequence charSequence, boolean z11) {
            this.text = charSequence;
            this.isHtml = z11;
            this.length = charSequence.length();
        }
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z11) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, textDirectionHeuristicCompat, z11).toString();
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristicCompat;
        LRM_STRING = Character.toString(LRM);
        RLM_STRING = Character.toString(RLM);
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    private static int getEntryDir(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).getEntryDir();
    }

    private static int getExitDir(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).getExitDir();
    }

    public static BidiFormatter getInstance(boolean z11) {
        return new Builder(z11).build();
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z11) {
            spannableStringBuilder.append((CharSequence) markBefore(charSequence, zIsRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        if (zIsRtl != this.mIsRtlContext) {
            spannableStringBuilder.append(zIsRtl ? RLE : LRE);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(PDF);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) markAfter(charSequence, zIsRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        return spannableStringBuilder;
    }

    public BidiFormatter(boolean z11, int i11, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z11;
        this.mFlags = i11;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    public static boolean isRtlLocale(Locale locale) {
        if (TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1) {
            return true;
        }
        return false;
    }

    private String markAfter(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (!this.mIsRtlContext && (zIsRtl || getExitDir(charSequence) == 1)) {
            return LRM_STRING;
        }
        if (this.mIsRtlContext) {
            if (!zIsRtl || getExitDir(charSequence) == -1) {
                return RLM_STRING;
            }
            return "";
        }
        return "";
    }

    private String markBefore(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (!this.mIsRtlContext && (zIsRtl || getEntryDir(charSequence) == 1)) {
            return LRM_STRING;
        }
        if (this.mIsRtlContext) {
            if (!zIsRtl || getEntryDir(charSequence) == -1) {
                return RLM_STRING;
            }
            return "";
        }
        return "";
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, boolean z11) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, z11);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z11) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, z11);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, true);
    }
}
