package p816z0;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.size.Size;
import coil.size.SizeResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z0.a, reason: from toString */
/* JADX INFO: compiled from: RealSizeResolver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lz0/a;", "Lcoil/size/SizeResolver;", "Lcoil/size/Size;", "size", "<init>", "(Lcoil/size/Size;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/size/Size;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealSizeResolver implements SizeResolver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Size size;

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof RealSizeResolver) && Intrinsics.areEqual(this.size, ((RealSizeResolver) other).size);
        }
        return true;
    }

    public int hashCode() {
        return this.size.hashCode();
    }

    @NotNull
    public String toString() {
        return "RealSizeResolver(size=" + this.size + ')';
    }

    public RealSizeResolver(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.size = size;
    }
}
