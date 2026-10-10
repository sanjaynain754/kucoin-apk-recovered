package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ColorDrawable.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0086\b¨\u0006\u0004"}, m90084d2 = {"toDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ColorDrawableKt {
    @NotNull
    public static final ColorDrawable toDrawable(@ColorInt int i11) {
        return new ColorDrawable(i11);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorDrawable toDrawable(@NotNull Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
