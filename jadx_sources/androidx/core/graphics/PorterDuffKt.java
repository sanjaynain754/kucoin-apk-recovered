package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PorterDuff.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0086\b¨\u0006\u0007"}, m90084d2 = {"toColorFilter", "Landroid/graphics/PorterDuffColorFilter;", "Landroid/graphics/PorterDuff$Mode;", "color", "", "toXfermode", "Landroid/graphics/PorterDuffXfermode;", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PorterDuffKt {
    @NotNull
    public static final PorterDuffColorFilter toColorFilter(@NotNull PorterDuff.Mode mode, int i11) {
        return new PorterDuffColorFilter(i11, mode);
    }

    @NotNull
    public static final PorterDuffXfermode toXfermode(@NotNull PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
