package qa0;

import android.content.res.Resources;
import android.util.TypedValue;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qa0.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C43679d {
    /* JADX INFO: renamed from: a */
    public static final int m96139a(float f11, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return (int) TypedValue.applyDimension(1, f11, resources.getDisplayMetrics());
    }
}
