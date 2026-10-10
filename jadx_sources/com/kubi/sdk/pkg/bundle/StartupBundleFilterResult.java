package com.kubi.sdk.pkg.bundle;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.r, reason: from toString */
/* JADX INFO: compiled from: StartupBundlePriority.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/r;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "retained", "skipped", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "()Ljava/util/List;", "b", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class StartupBundleFilterResult<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<T> retained;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<T> skipped;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartupBundleFilterResult)) {
            return false;
        }
        StartupBundleFilterResult startupBundleFilterResult = (StartupBundleFilterResult) other;
        return Intrinsics.areEqual(this.retained, startupBundleFilterResult.retained) && Intrinsics.areEqual(this.skipped, startupBundleFilterResult.skipped);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartupBundleFilterResult(@NotNull List<? extends T> retained, @NotNull List<? extends T> skipped) {
        Intrinsics.checkNotNullParameter(retained, "retained");
        Intrinsics.checkNotNullParameter(skipped, "skipped");
        this.retained = retained;
        this.skipped = skipped;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<T> m57681a() {
        return this.retained;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<T> m57682b() {
        return this.skipped;
    }

    public int hashCode() {
        return (this.retained.hashCode() * 31) + this.skipped.hashCode();
    }

    @NotNull
    public String toString() {
        return "StartupBundleFilterResult(retained=" + this.retained + ", skipped=" + this.skipped + ')';
    }
}
