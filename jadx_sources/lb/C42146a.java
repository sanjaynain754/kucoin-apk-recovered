package lb;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lb.a */
/* JADX INFO: compiled from: AssetViewUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"canTakeFocus", "", "Landroid/view/View;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42146a {
    /* JADX INFO: renamed from: a */
    public static final boolean m92484a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.isAttachedToWindow() && view.isFocusable() && view.isFocusableInTouchMode() && view.getVisibility() == 0 && view.isEnabled();
    }
}
