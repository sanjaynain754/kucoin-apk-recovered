package p730wm;

import android.text.InputFilter;
import android.text.Spanned;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wm.c */
/* JADX INFO: compiled from: ValuePredicateInputFilter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/utils/inputfilter/ValuePredicateInputFilter;", "Landroid/text/InputFilter;", "predicate", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45894c implements InputFilter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function1<String, Boolean> f103364a;

    /* JADX WARN: Multi-variable type inference failed */
    public C45894c(@NotNull Function1<? super String, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f103364a = predicate;
    }

    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
        String strValueOf = String.valueOf(dest);
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = strValueOf.substring(0, dstart);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append((Object) source);
        String strSubstring2 = strValueOf.substring(dend);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        if (this.f103364a.invoke(sb2.toString()).booleanValue()) {
            return "";
        }
        return null;
    }
}
