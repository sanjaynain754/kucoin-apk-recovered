package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.DoNotOptimize;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PreverificationHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@DoNotOptimize
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/imagepipeline/platform/PreverificationHelper;", "", "<init>", "()V", "shouldUseHardwareBitmapConfig", "", "config", "Landroid/graphics/Bitmap$Config;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PreverificationHelper {
    @DoNotOptimize
    @TargetApi(26)
    public final boolean shouldUseHardwareBitmapConfig(@Nullable Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            return true;
        }
        return false;
    }
}
