package o50;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: o50.g */
/* JADX INFO: compiled from: SpannableExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¨\u0006\r"}, m90084d2 = {"addSpan", "", "text", "what", "", "flags", "", "setSpan", "getSpannableString", "Landroid/text/SpannableString;", "", "find", "color", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpannableExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExt.kt\ncom/kubi/tradingbotkit/ext/SpannableExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n12883#2,3:87\n13472#2:93\n13473#2:95\n1803#3,3:90\n1869#3,2:96\n1#4:94\n*S KotlinDebug\n*F\n+ 1 SpannableExt.kt\ncom/kubi/tradingbotkit/ext/SpannableExtKt\n*L\n32#1:87,3\n61#1:93\n61#1:95\n35#1:90,3\n64#1:96,2\n*E\n"})
public final class C42973g {
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CharSequence m94368a(@NotNull CharSequence charSequence, @NotNull CharSequence text, @Nullable Object obj, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        if (obj instanceof Object[]) {
            for (Object obj2 : (Object[]) obj) {
                text = m94371d(text, obj2, i11);
            }
        } else if (obj instanceof List) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                text = m94371d(text, it.next(), i11);
            }
        } else {
            text = m94371d(text, obj, i11);
        }
        SpannableStringBuilder spannableStringBuilderAppend = charSequence instanceof SpannableStringBuilder ? ((SpannableStringBuilder) charSequence).append(text) : new SpannableStringBuilder(charSequence).append(text);
        Intrinsics.checkNotNull(spannableStringBuilderAppend);
        return spannableStringBuilderAppend;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CharSequence m94369b(CharSequence charSequence, CharSequence charSequence2, Object obj, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            obj = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 33;
        }
        return m94368a(charSequence, charSequence2, obj, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SpannableString m94370c(@NotNull String str, @NotNull String find, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(find, "find");
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, find, 0, false, 6, (Object) null);
        spannableString.setSpan(new ForegroundColorSpan(i11), iIndexOf$default, find.length() + iIndexOf$default, 17);
        return spannableString;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final CharSequence m94371d(@NotNull CharSequence charSequence, @Nullable Object obj, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (obj instanceof Object[]) {
            for (Object obj2 : (Object[]) obj) {
                spannableString.setSpan(obj2, 0, spannableString.length(), i11);
            }
        } else {
            if (!(obj instanceof List)) {
                spannableString.setSpan(obj, 0, spannableString.length(), i11);
                return spannableString;
            }
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                spannableString.setSpan(it.next(), 0, spannableString.length(), i11);
            }
        }
        return spannableString;
    }
}
