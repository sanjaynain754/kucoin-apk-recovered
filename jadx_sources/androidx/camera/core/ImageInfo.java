package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes23.dex */
public interface ImageInfo {
    default int getFlashState() {
        return 0;
    }

    int getRotationDegrees();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    TagBundle getTagBundle();

    long getTimestamp();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    void populateExifData(ExifData.Builder builder);

    default Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }
}
