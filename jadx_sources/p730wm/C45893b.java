package p730wm;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import com.tencent.bugly.proguard.C33820nf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wm.b */
/* JADX INFO: compiled from: TPSLSubSignShowInputFilter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/utils/inputfilter/TPSLSubSignShowInputFilter;", "Landroid/text/InputFilter;", "editText", "Landroid/widget/EditText;", "<init>", "(Landroid/widget/EditText;)V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45893b implements InputFilter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final EditText f103363a;

    public C45893b(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f103363a = editText;
    }

    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
        if (this.f103363a.isFocused() && Intrinsics.areEqual(String.valueOf(source), "") && Intrinsics.areEqual(String.valueOf(dest), C33820nf.f71144W)) {
            return C33820nf.f71144W;
        }
        return null;
    }
}
