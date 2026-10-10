package com.kubi.kumex.utils;

import android.widget.TextView;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kumex.utils.w */
/* JADX INFO: compiled from: NullOrEmptyTransformerSafe.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\u00020\u0007*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0007¨\u0006\n"}, m90084d2 = {"bigDecimalOrDefault", "Ljava/math/BigDecimal;", "", "default", "bigDecimalOrNull", "Landroid/widget/TextView;", "intOrNull", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "intOrDefault", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17071w {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final BigDecimal m36621c(@Nullable TextView textView) {
        CharSequence text;
        CharSequence text2;
        String string;
        if (textView == null || (text = textView.getText()) == null || text.length() == 0 || (text2 = textView.getText()) == null || (string = text2.toString()) == null) {
            return null;
        }
        return StringsKt.toBigDecimalOrNull(string);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m36619a(@Nullable String str, @NotNull BigDecimal bigDecimal) {
        BigDecimal bigDecimalOrNull;
        Intrinsics.checkNotNullParameter(bigDecimal, "default");
        return (str == null || str.length() == 0 || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str)) == null) ? bigDecimal : bigDecimalOrNull;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BigDecimal m36620b(String str, BigDecimal ZERO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        return m36619a(str, ZERO);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final BigDecimal m36622d(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return StringsKt.toBigDecimalOrNull(str);
    }
}
