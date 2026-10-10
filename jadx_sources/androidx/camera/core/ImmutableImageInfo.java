package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ImmutableImageInfo implements ImageInfo {
    @Override // androidx.camera.core.ImageInfo
    public abstract int getFlashState();

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    public abstract Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    public abstract TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    public static ImageInfo create(TagBundle tagBundle, long j11, int i11, Matrix matrix, int i12) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j11, i11, matrix, i12);
    }

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}
