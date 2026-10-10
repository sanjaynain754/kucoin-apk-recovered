package androidx.camera.core.internal;

import android.util.Range;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.media3.exoplayer.RendererCapabilities;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StreamSpecsCalculator.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016Jn\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Landroidx/camera/core/internal/StreamSpecsCalculator;", "", "setCameraDeviceSurfaceManager", "", "cameraDeviceSurfaceManager", "Landroidx/camera/core/impl/CameraDeviceSurfaceManager;", "calculateSuggestedStreamSpecs", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "cameraMode", "", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "newUseCases", "", "Landroidx/camera/core/UseCase;", "attachedUseCases", "cameraConfig", "Landroidx/camera/core/impl/CameraConfig;", "sessionType", "targetFrameRate", "Landroid/util/Range;", "isFeatureComboInvocation", "", "findMaxSupportedFrameRate", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface StreamSpecsCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmField
    @NotNull
    public static final StreamSpecsCalculator NO_OP_STREAM_SPECS_CALCULATOR = new StreamSpecsCalculator() { // from class: androidx.camera.core.internal.StreamSpecsCalculator$Companion$NO_OP_STREAM_SPECS_CALCULATOR$1
        @Override // androidx.camera.core.internal.StreamSpecsCalculator
        public StreamSpecQueryResult calculateSuggestedStreamSpecs(int cameraMode, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> newUseCases, List<? extends UseCase> attachedUseCases, CameraConfig cameraConfig, int sessionType, Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
            return new StreamSpecQueryResult(null, 0, 3, null);
        }
    };

    /* JADX INFO: compiled from: StreamSpecsCalculator.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jr\u0010\u0006\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0014\u001a\u00020\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0007R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0018"}, m90084d2 = {"Landroidx/camera/core/internal/StreamSpecsCalculator$Companion;", "", "<init>", "()V", "NO_OP_STREAM_SPECS_CALCULATOR", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "calculateSuggestedStreamSpecsCompat", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "cameraMode", "", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "newUseCases", "", "Landroidx/camera/core/UseCase;", "cameraConfig", "Landroidx/camera/core/impl/CameraConfig;", "isFeatureComboInvocation", "", "attachedUseCases", "sessionType", "targetFrameRate", "Landroid/util/Range;", "findMaxSupportedFrameRate", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i11, cameraInfoInternal, newUseCases, null, false, null, 0, null, false, 504, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StreamSpecQueryResult calculateSuggestedStreamSpecsCompat$default(Companion companion, StreamSpecsCalculator streamSpecsCalculator, int i11, CameraInfoInternal cameraInfoInternal, List list, CameraConfig cameraConfig, boolean z11, List list2, int i12, Range range, boolean z12, int i13, Object obj) {
            return companion.calculateSuggestedStreamSpecsCompat(streamSpecsCalculator, i11, cameraInfoInternal, list, (i13 & 8) != 0 ? CameraConfigs.defaultConfig() : cameraConfig, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i13 & 64) != 0 ? 0 : i12, (i13 & 128) != 0 ? StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED : range, (i13 & 256) != 0 ? false : z12);
        }

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull CameraConfig cameraConfig) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i11, cameraInfoInternal, newUseCases, cameraConfig, false, null, 0, null, false, 496, null);
        }

        private Companion() {
        }

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull CameraConfig cameraConfig, boolean z11) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i11, cameraInfoInternal, newUseCases, cameraConfig, z11, null, 0, null, false, TXVodDownloadDataSource.QUALITY_480P, null);
        }

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull CameraConfig cameraConfig, boolean z11, @NotNull List<? extends UseCase> attachedUseCases) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i11, cameraInfoInternal, newUseCases, cameraConfig, z11, attachedUseCases, 0, null, false, 448, null);
        }

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull CameraConfig cameraConfig, boolean z11, @NotNull List<? extends UseCase> attachedUseCases, int i12) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i11, cameraInfoInternal, newUseCases, cameraConfig, z11, attachedUseCases, i12, null, false, RendererCapabilities.DECODER_SUPPORT_MASK, null);
        }

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull CameraConfig cameraConfig, boolean z11, @NotNull List<? extends UseCase> attachedUseCases, int i12, @NotNull Range<Integer> targetFrameRate) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
            Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i11, cameraInfoInternal, newUseCases, cameraConfig, z11, attachedUseCases, i12, targetFrameRate, false, 256, null);
        }

        @JvmOverloads
        @NotNull
        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(@NotNull StreamSpecsCalculator streamSpecsCalculator, int i11, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull CameraConfig cameraConfig, boolean z11, @NotNull List<? extends UseCase> attachedUseCases, int i12, @NotNull Range<Integer> targetFrameRate, boolean z12) {
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
            Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
            return streamSpecsCalculator.calculateSuggestedStreamSpecs(i11, cameraInfoInternal, newUseCases, attachedUseCases, cameraConfig, i12, targetFrameRate, z11, z12);
        }
    }

    @NotNull
    StreamSpecQueryResult calculateSuggestedStreamSpecs(int cameraMode, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull List<? extends UseCase> newUseCases, @NotNull List<? extends UseCase> attachedUseCases, @NotNull CameraConfig cameraConfig, int sessionType, @NotNull Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ StreamSpecQueryResult calculateSuggestedStreamSpecs$default(StreamSpecsCalculator streamSpecsCalculator, int i11, CameraInfoInternal cameraInfoInternal, List list, List list2, CameraConfig cameraConfig, int i12, Range range, boolean z11, boolean z12, int i13, Object obj) {
        if (obj == null) {
            return streamSpecsCalculator.calculateSuggestedStreamSpecs(i11, cameraInfoInternal, list, (i13 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i13 & 16) != 0 ? CameraConfigs.defaultConfig() : cameraConfig, (i13 & 32) != 0 ? 0 : i12, (i13 & 64) != 0 ? StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED : range, (i13 & 128) != 0 ? false : z11, (i13 & 256) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSuggestedStreamSpecs");
    }

    default void setCameraDeviceSurfaceManager(@NotNull CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
    }
}
