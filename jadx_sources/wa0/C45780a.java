package wa0;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wa0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C45780a {
    @Dimension(unit = 1)
    /* JADX INFO: renamed from: a */
    public static final int m101101a(@NotNull Context context, @Dimension(unit = 0) float f11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (f11 * context.getResources().getDisplayMetrics().density);
    }

    @ColorInt
    /* JADX INFO: renamed from: b */
    public static final int m101102b(@NotNull Context context, @AttrRes int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return ContextCompat.getColor(context, typedValue.resourceId);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m101103c(@NotNull Context context, @NotNull String resKey) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        String string = context.getResources().getString(context.getResources().getIdentifier(resKey, TypedValues.Custom.S_STRING, context.getPackageName()));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(reso…, \"string\", packageName))");
        return string;
    }

    @ColorInt
    /* JADX INFO: renamed from: d */
    public static final int m101104d(@NotNull Context context, @ColorRes int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ResourcesCompat.getColor(context.getResources(), i11, context.getTheme());
    }
}
