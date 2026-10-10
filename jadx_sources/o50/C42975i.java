package o50;

import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: o50.i */
/* JADX INFO: compiled from: StyledTextExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, m90084d2 = {"textColorStyleToEnd", "", "Lcom/kubi/utils/StyledText;", "originString", "", "color", "", "textColorStyle", "textColorStyleInt", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42975i {
    /* JADX INFO: renamed from: a */
    public static final void m94380a(@NotNull C27096v0 c27096v0, @NotNull String originString, @ColorRes int i11) {
        Intrinsics.checkNotNullParameter(c27096v0, "<this>");
        Intrinsics.checkNotNullParameter(originString, "originString");
        c27096v0.setSpan(new ForegroundColorSpan(ContextCompat.getColor(C27017c.f54310a.m66513b(), i11)), StringsKt.lastIndexOf$default((CharSequence) c27096v0, originString, 0, false, 6, (Object) null), StringsKt.lastIndexOf$default((CharSequence) c27096v0, originString, 0, false, 6, (Object) null) + originString.length(), 18);
    }

    /* JADX INFO: renamed from: b */
    public static final void m94381b(@NotNull C27096v0 c27096v0, @NotNull String originString, int i11) {
        Intrinsics.checkNotNullParameter(c27096v0, "<this>");
        Intrinsics.checkNotNullParameter(originString, "originString");
        c27096v0.setSpan(new ForegroundColorSpan(i11), StringsKt.lastIndexOf$default((CharSequence) c27096v0, originString, 0, false, 6, (Object) null), StringsKt.lastIndexOf$default((CharSequence) c27096v0, originString, 0, false, 6, (Object) null) + originString.length(), 18);
    }
}
