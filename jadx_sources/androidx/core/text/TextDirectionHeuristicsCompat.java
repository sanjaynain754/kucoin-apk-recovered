package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true);
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    public interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i11, int i12);
    }

    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        public abstract boolean defaultIsRtl();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i11, int i12) {
            return isRtl(CharBuffer.wrap(cArr), i11, i12);
        }

        private boolean doCheck(CharSequence charSequence, int i11, int i12) {
            int iCheckRtl = this.mAlgorithm.checkRtl(charSequence, i11, i12);
            if (iCheckRtl == 0) {
                return true;
            }
            if (iCheckRtl != 1) {
                return defaultIsRtl();
            }
            return false;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(CharSequence charSequence, int i11, int i12) {
            if (charSequence == null || i11 < 0 || i12 < 0 || charSequence.length() - i12 < i11) {
                throw new IllegalArgumentException();
            }
            return this.mAlgorithm == null ? defaultIsRtl() : doCheck(charSequence, i11, i12);
        }

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }
    }

    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }

        public TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z11) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z11;
        }
    }

    public static int isRtlText(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int isRtlTextOrFormat(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    public static class AnyStrong implements TextDirectionAlgorithm {
        static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
        private final boolean mLookForRtl;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int iIsRtlText = TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charSequence.charAt(i11)));
                if (iIsRtlText != 0) {
                    if (iIsRtlText != 1) {
                        continue;
                    } else if (!this.mLookForRtl) {
                        return 1;
                    }
                    i11++;
                    z11 = z11;
                } else if (this.mLookForRtl) {
                    return 0;
                }
                z11 = true;
                i11++;
                z11 = z11;
            }
            if (z11) {
                return this.mLookForRtl ? 1 : 0;
            }
            return 2;
        }

        private AnyStrong(boolean z11) {
            this.mLookForRtl = z11;
        }
    }

    public static class FirstStrong implements TextDirectionAlgorithm {
        static final FirstStrong INSTANCE = new FirstStrong();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int iIsRtlTextOrFormat = 2;
            while (i11 < i13 && iIsRtlTextOrFormat == 2) {
                iIsRtlTextOrFormat = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return iIsRtlTextOrFormat;
        }

        private FirstStrong() {
        }
    }

    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

        public TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public boolean defaultIsRtl() {
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.INSTANCE;
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(firstStrong, false);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(firstStrong, true);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    private TextDirectionHeuristicsCompat() {
    }
}
