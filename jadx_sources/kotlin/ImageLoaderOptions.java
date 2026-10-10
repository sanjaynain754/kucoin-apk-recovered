package kotlin;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b1.f, reason: from toString */
/* JADX INFO: compiled from: ImageLoaderOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, m90084d2 = {"Lb1/f;", "", "", "addLastModifiedToFileCacheKey", "launchInterceptorChainOnMainThread", "networkObserverEnabled", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "()Z", "b", "getLaunchInterceptorChainOnMainThread", "c", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class ImageLoaderOptions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean addLastModifiedToFileCacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean launchInterceptorChainOnMainThread;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean networkObserverEnabled;

    public ImageLoaderOptions() {
        this(false, false, false, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLoaderOptions)) {
            return false;
        }
        ImageLoaderOptions imageLoaderOptions = (ImageLoaderOptions) other;
        return this.addLastModifiedToFileCacheKey == imageLoaderOptions.addLastModifiedToFileCacheKey && this.launchInterceptorChainOnMainThread == imageLoaderOptions.launchInterceptorChainOnMainThread && this.networkObserverEnabled == imageLoaderOptions.networkObserverEnabled;
    }

    public ImageLoaderOptions(boolean z11, boolean z12, boolean z13) {
        this.addLastModifiedToFileCacheKey = z11;
        this.launchInterceptorChainOnMainThread = z12;
        this.networkObserverEnabled = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.addLastModifiedToFileCacheKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNetworkObserverEnabled() {
        return this.networkObserverEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z11 = this.addLastModifiedToFileCacheKey;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        boolean z12 = this.launchInterceptorChainOnMainThread;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.networkObserverEnabled;
        return i12 + (z13 ? 1 : z13);
    }

    @NotNull
    public String toString() {
        return "ImageLoaderOptions(addLastModifiedToFileCacheKey=" + this.addLastModifiedToFileCacheKey + ", launchInterceptorChainOnMainThread=" + this.launchInterceptorChainOnMainThread + ", networkObserverEnabled=" + this.networkObserverEnabled + ')';
    }

    public /* synthetic */ ImageLoaderOptions(boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13);
    }
}
