package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i11, @Nullable int[] iArr) {
        ImmutableIntArray immutableIntArrayM13644of;
        this.majorBrand = i11;
        if (iArr != null) {
            immutableIntArrayM13644of = ImmutableIntArray.copyOf(iArr);
        } else {
            immutableIntArrayM13644of = ImmutableIntArray.m13644of();
        }
        this.compatibleBrands = immutableIntArrayM13644of;
    }
}
