package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Drawable.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, m90084d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n37#2,31:119\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119,31\n*E\n"})
public final class DrawableKt {
    @NotNull
    public static final Bitmap toBitmap(@NotNull Drawable drawable, @Px int i11, @Px int i12, @Nullable Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i11 == bitmapDrawable.getBitmap().getWidth() && i12 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i11, i12, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, config);
        drawable.setBounds(0, 0, i11, i12);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i13, i14, i15, i16);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i11, i12, config);
    }

    @Nullable
    public static final Bitmap toBitmapOrNull(@NotNull Drawable drawable, @Px int i11, @Px int i12, @Nullable Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return toBitmap(drawable, i11, i12, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i11, i12, config);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = drawable.getBounds().left;
        }
        if ((i15 & 2) != 0) {
            i12 = drawable.getBounds().top;
        }
        if ((i15 & 4) != 0) {
            i13 = drawable.getBounds().right;
        }
        if ((i15 & 8) != 0) {
            i14 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i11, i12, i13, i14);
    }

    public static final void updateBounds(@NotNull Drawable drawable, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        drawable.setBounds(i11, i12, i13, i14);
    }
}
