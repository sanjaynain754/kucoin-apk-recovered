package p575qw;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5303w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qw.e */
/* JADX INFO: compiled from: ViewExt.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, m90084d2 = {"getDrawableRes", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View;", "drawableRes", "", "clearArbLineSpacing", "", "Landroid/widget/TextView;", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43884e {
    /* JADX INFO: renamed from: a */
    public static final void m96656a(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (!C5303w0.m6511a() || Build.VERSION.SDK_INT < 28) {
            return;
        }
        textView.setFallbackLineSpacing(false);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Drawable m96657b(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return ContextCompat.getDrawable(view.getContext(), i11);
    }
}
