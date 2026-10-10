package com.jumio.core.toolkit;

import android.graphics.Bitmap;
import com.jumio.android.renderscript.Range2d;
import com.jumio.android.renderscript.Toolkit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/toolkit/DefaultToolkit;", "Lcom/jumio/core/toolkit/ToolkitInterface;", "<init>", "()V", "toolkit", "Lcom/jumio/android/renderscript/Toolkit;", "averageColor", "", "bitmap", "Landroid/graphics/Bitmap;", "restriction", "Lcom/jumio/android/renderscript/Range2d;", "standardDeviationFast", "", "close", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultToolkit implements ToolkitInterface {

    /* JADX INFO: renamed from: a */
    public final Toolkit f14576a = new Toolkit();

    @Override // com.jumio.core.toolkit.ToolkitInterface
    public int averageColor(@NotNull Bitmap bitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return this.f14576a.averageColor(bitmap, restriction);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f14576a.close();
    }

    @Override // com.jumio.core.toolkit.ToolkitInterface
    public double standardDeviationFast(@NotNull Bitmap bitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return this.f14576a.standardDeviationFast(bitmap, restriction);
    }
}
