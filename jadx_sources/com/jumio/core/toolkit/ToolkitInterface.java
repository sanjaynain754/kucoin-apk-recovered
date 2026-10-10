package com.jumio.core.toolkit;

import android.graphics.Bitmap;
import com.jumio.android.renderscript.Range2d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\u000bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/toolkit/ToolkitInterface;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "averageColor", "", "bitmap", "Landroid/graphics/Bitmap;", "restriction", "Lcom/jumio/android/renderscript/Range2d;", "standardDeviationFast", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ToolkitInterface extends AutoCloseable {
    int averageColor(@NotNull Bitmap bitmap, @Nullable Range2d restriction);

    double standardDeviationFast(@NotNull Bitmap bitmap, @Nullable Range2d restriction);

    static /* synthetic */ int averageColor$default(ToolkitInterface toolkitInterface, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: averageColor");
        }
        if ((i11 & 2) != 0) {
            range2d = null;
        }
        return toolkitInterface.averageColor(bitmap, range2d);
    }

    static /* synthetic */ double standardDeviationFast$default(ToolkitInterface toolkitInterface, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: standardDeviationFast");
        }
        if ((i11 & 2) != 0) {
            range2d = null;
        }
        return toolkitInterface.standardDeviationFast(bitmap, range2d);
    }
}
