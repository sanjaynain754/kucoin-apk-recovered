package ps;

import android.text.InputFilter;
import android.text.Spanned;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ps.c */
/* JADX INFO: compiled from: MaxIntegerDigitsFilter.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/numeric/filter/MaxIntegerDigitsFilter;", "Landroid/text/InputFilter;", "maxDigits", "", "<init>", "(I)V", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "decimalSeparator", "", "getDecimalSeparator", "()C", "decimalSeparator$delegate", "Lkotlin/Lazy;", "groupingSeparator", "getGroupingSeparator", "groupingSeparator$delegate", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "extractRawNumber", "", "text", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43533c implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final int f96069a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final StringBuilder f96070b = new StringBuilder(32);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f96071c = LazyKt.lazy(new Function0() { // from class: ps.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Character.valueOf(C43533c.m95797c());
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f96072d = LazyKt.lazy(new Function0() { // from class: ps.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Character.valueOf(C43533c.m95798g());
        }
    });

    /* JADX INFO: renamed from: c */
    public static final char m95797c() {
        NumberFormat numberFormatM92646k = C42180b.m92646k(null, 1, null);
        Intrinsics.checkNotNull(numberFormatM92646k, "null cannot be cast to non-null type java.text.DecimalFormat");
        return ((DecimalFormat) numberFormatM92646k).getDecimalFormatSymbols().getDecimalSeparator();
    }

    /* JADX INFO: renamed from: g */
    public static final char m95798g() {
        NumberFormat numberFormatM92646k = C42180b.m92646k(null, 1, null);
        Intrinsics.checkNotNull(numberFormatM92646k, "null cannot be cast to non-null type java.text.DecimalFormat");
        return ((DecimalFormat) numberFormatM92646k).getDecimalFormatSymbols().getGroupingSeparator();
    }

    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) dest, 0, dstart);
        sb2.append(source, start, end);
        sb2.append((CharSequence) dest, dend, dest != null ? dest.length() : 0);
        if (StringsKt.substringBefore$default(m95799d(sb2.toString()), m95800e(), (String) null, 2, (Object) null).length() > this.f96069a) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final char m95800e() {
        return ((Character) this.f96071c.getValue()).charValue();
    }

    /* JADX INFO: renamed from: f */
    public final char m95801f() {
        return ((Character) this.f96072d.getValue()).charValue();
    }

    public C43533c(int i11) {
        this.f96069a = i11;
    }

    /* JADX INFO: renamed from: d */
    public final String m95799d(String str) {
        if (!StringsKt.contains$default((CharSequence) str, m95801f(), false, 2, (Object) null)) {
            return str;
        }
        this.f96070b.setLength(0);
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != m95801f()) {
                this.f96070b.append(cCharAt);
            }
        }
        String string = this.f96070b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
