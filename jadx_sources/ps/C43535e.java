package ps;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;
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

/* JADX INFO: renamed from: ps.e */
/* JADX INFO: compiled from: MaxValueInputFilter.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/numeric/filter/MaxValueInputFilter;", "Landroid/text/InputFilter;", "max", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "groupingSeparator", "", "getGroupingSeparator", "()C", "groupingSeparator$delegate", "Lkotlin/Lazy;", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "extractRawNumber", "", "text", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43535e implements InputFilter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BigDecimal f96073a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final StringBuilder f96074b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f96075c;

    /* JADX INFO: renamed from: d */
    public static final char m95803d() {
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
        String string = sb2.toString();
        if (string.length() == 0 || Intrinsics.areEqual(string, C33978va.f72339h)) {
            return null;
        }
        try {
            if (new BigDecimal(m95804b(string)).compareTo(this.f96073a) > 0) {
                return "";
            }
            return null;
        } catch (NumberFormatException unused) {
        }
    }

    public C43535e(@NotNull BigDecimal max) {
        Intrinsics.checkNotNullParameter(max, "max");
        this.f96073a = max;
        this.f96074b = new StringBuilder(32);
        this.f96075c = LazyKt.lazy(new Function0() { // from class: ps.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Character.valueOf(C43535e.m95803d());
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final char m95805c() {
        return ((Character) this.f96075c.getValue()).charValue();
    }

    /* JADX INFO: renamed from: b */
    public final String m95804b(String str) {
        if (!StringsKt.contains$default((CharSequence) str, m95805c(), false, 2, (Object) null)) {
            return str;
        }
        this.f96074b.setLength(0);
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != m95805c()) {
                this.f96074b.append(cCharAt);
            }
        }
        String string = this.f96074b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
