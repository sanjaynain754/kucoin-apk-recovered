package androidx.camera.core.internal;

import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StreamSpecQueryResult.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Landroidx/camera/core/internal/StreamSpecQueryResult;", "", "streamSpecs", "", "Landroidx/camera/core/UseCase;", "Landroidx/camera/core/impl/StreamSpec;", "maxSupportedFrameRate", "", "<init>", "(Ljava/util/Map;I)V", "getStreamSpecs", "()Ljava/util/Map;", "getMaxSupportedFrameRate", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class StreamSpecQueryResult {
    private final int maxSupportedFrameRate;

    @NotNull
    private final Map<UseCase, StreamSpec> streamSpecs;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamSpecQueryResult)) {
            return false;
        }
        StreamSpecQueryResult streamSpecQueryResult = (StreamSpecQueryResult) other;
        return Intrinsics.areEqual(this.streamSpecs, streamSpecQueryResult.streamSpecs) && this.maxSupportedFrameRate == streamSpecQueryResult.maxSupportedFrameRate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult(@NotNull Map<UseCase, ? extends StreamSpec> streamSpecs, int i11) {
        Intrinsics.checkNotNullParameter(streamSpecs, "streamSpecs");
        this.streamSpecs = streamSpecs;
        this.maxSupportedFrameRate = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamSpecQueryResult copy$default(StreamSpecQueryResult streamSpecQueryResult, Map map, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = streamSpecQueryResult.streamSpecs;
        }
        if ((i12 & 2) != 0) {
            i11 = streamSpecQueryResult.maxSupportedFrameRate;
        }
        return streamSpecQueryResult.copy(map, i11);
    }

    @NotNull
    public final Map<UseCase, StreamSpec> component1() {
        return this.streamSpecs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    @NotNull
    public final Map<UseCase, StreamSpec> getStreamSpecs() {
        return this.streamSpecs;
    }

    public int hashCode() {
        return (this.streamSpecs.hashCode() * 31) + Integer.hashCode(this.maxSupportedFrameRate);
    }

    @NotNull
    public String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.streamSpecs + ", maxSupportedFrameRate=" + this.maxSupportedFrameRate + ')';
    }

    @NotNull
    public final StreamSpecQueryResult copy(@NotNull Map<UseCase, ? extends StreamSpec> streamSpecs, int maxSupportedFrameRate) {
        Intrinsics.checkNotNullParameter(streamSpecs, "streamSpecs");
        return new StreamSpecQueryResult(streamSpecs, maxSupportedFrameRate);
    }

    public /* synthetic */ StreamSpecQueryResult(Map map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? MapsKt.emptyMap() : map, (i12 & 2) != 0 ? Integer.MAX_VALUE : i11);
    }
}
