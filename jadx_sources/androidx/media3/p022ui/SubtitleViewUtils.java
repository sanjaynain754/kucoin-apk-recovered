package androidx.media3.p022ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.Assertions;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes34.dex */
final class SubtitleViewUtils {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3579a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m3580b(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    private SubtitleViewUtils() {
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new Predicate() { // from class: androidx.media3.ui.q0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.m3580b(obj);
                }
            });
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new Predicate() { // from class: androidx.media3.ui.r0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.m3579a(obj);
                }
            });
        }
    }

    private static void removeSpansIf(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float resolveTextSize(int i11, float f11, int i12, int i13) {
        float f12;
        if (f11 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -3.4028235E38f;
                }
                return f11;
            }
            f12 = i12;
        } else {
            f12 = i13;
        }
        return f11 * f12;
    }
}
