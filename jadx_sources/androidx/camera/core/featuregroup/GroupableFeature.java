package androidx.camera.core.featuregroup;

import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalSessionConfig;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature;
import androidx.camera.core.impl.CameraInfoInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GroupableFeature.kt */
/* JADX INFO: loaded from: classes23.dex */
@ExperimentalSessionConfig
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\f\u0010\u0014\u001a\u00020\t*\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058aX \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Landroidx/camera/core/featuregroup/GroupableFeature;", "", "<init>", "()V", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal$camera_core_release", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureType", "", "getFeatureType", "()I", "featureType$delegate", "Lkotlin/Lazy;", "isSupportedIndividually", "", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "sessionConfig", "Landroidx/camera/core/SessionConfig;", "toFeatureType", "FeatureType", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class GroupableFeature {
    public static final int FEATURE_TYPE_DYNAMIC_RANGE = 0;
    public static final int FEATURE_TYPE_FPS_RANGE = 1;
    public static final int FEATURE_TYPE_IMAGE_FORMAT = 3;
    public static final int FEATURE_TYPE_VIDEO_STABILIZATION = 2;

    @JvmField
    @NotNull
    public static final GroupableFeature FPS_60;

    @JvmField
    @NotNull
    public static final GroupableFeature HDR_HLG10;

    @JvmField
    @NotNull
    public static final GroupableFeature IMAGE_ULTRA_HDR;

    @JvmField
    @NotNull
    public static final GroupableFeature PREVIEW_STABILIZATION;

    /* JADX INFO: renamed from: featureType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy featureType = LazyKt.lazy(new Function0() { // from class: androidx.camera.core.featuregroup.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(GroupableFeature.featureType_delegate$lambda$0(this.f1588b));
        }
    });

    /* JADX INFO: compiled from: GroupableFeature.kt */
    @Target({ElementType.TYPE_USE})
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Landroidx/camera/core/featuregroup/GroupableFeature$FeatureType;", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FeatureType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: getFeatureTypeInternal$camera_core_release */
    public abstract FeatureTypeInternal getFeatureTypeInternal();

    /* JADX INFO: compiled from: GroupableFeature.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureTypeInternal.values().length];
            try {
                iArr[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        DynamicRange HLG_10_BIT = DynamicRange.HLG_10_BIT;
        Intrinsics.checkNotNullExpressionValue(HLG_10_BIT, "HLG_10_BIT");
        HDR_HLG10 = new DynamicRangeFeature(HLG_10_BIT);
        FPS_60 = new FpsRangeFeature(60, 60);
        PREVIEW_STABILIZATION = new VideoStabilizationFeature(VideoStabilizationFeature.StabilizationMode.PREVIEW);
        IMAGE_ULTRA_HDR = new ImageFormatFeature(1);
    }

    private final int toFeatureType(FeatureTypeInternal featureTypeInternal) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[featureTypeInternal.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getFeatureType() {
        return ((Number) this.featureType.getValue()).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isSupportedIndividually(@NotNull CameraInfoInternal cameraInfoInternal, @NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public GroupableFeature() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int featureType_delegate$lambda$0(GroupableFeature groupableFeature) {
        return groupableFeature.toFeatureType(groupableFeature.getFeatureTypeInternal());
    }
}
