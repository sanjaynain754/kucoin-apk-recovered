package m70;

import android.text.InputFilter;
import android.text.Spanned;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: m70.c0 */
/* JADX INFO: compiled from: NoSpaceInputFilter.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/view/NoSpaceInputFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42449c0 implements InputFilter {
    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
        if (source == null) {
            return null;
        }
        String strReplace = new Regex("\\s").replace(source.subSequence(start, end).toString(), "");
        if (Intrinsics.areEqual(strReplace, source.subSequence(start, end).toString())) {
            return null;
        }
        return strReplace;
    }
}
