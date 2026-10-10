package androidx.camera.core.featuregroup.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.streamsharing.StreamSharing;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UseCaseType.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u001f\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0017"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/UseCaseType;", "", "surfaceClass", "Ljava/lang/Class;", "defaultImageFormat", "", "<init>", "(Ljava/lang/String;ILjava/lang/Class;I)V", "getSurfaceClass", "()Ljava/lang/Class;", "getDefaultImageFormat", "()I", "PREVIEW", "IMAGE_CAPTURE", "VIDEO_CAPTURE", "STREAM_SHARING", "UNDEFINED", "getImageFormat", "imageCaptureFormat", "(Ljava/lang/Integer;)I", "toString", "", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public enum UseCaseType {
    PREVIEW(SurfaceHolder.class, 34),
    IMAGE_CAPTURE(null, 256),
    VIDEO_CAPTURE(MediaCodec.class, 34),
    STREAM_SHARING(SurfaceTexture.class, 34),
    UNDEFINED(null, 34);

    private final int defaultImageFormat;

    @Nullable
    private final Class<?> surfaceClass;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: UseCaseType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0007J\u0010\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0007H\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\b\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\u0006H\u0002J\f\u0010\u000f\u001a\u00020\f*\u00020\u0006H\u0002J\f\u0010\u0010\u001a\u00020\f*\u00020\u0006H\u0002J\f\u0010\u0011\u001a\u00020\f*\u00020\u0006H\u0002¨\u0006\u0012"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/UseCaseType$Companion;", "", "<init>", "()V", "getFeatureGroupUseCaseType", "Landroidx/camera/core/featuregroup/impl/UseCaseType;", "Landroidx/camera/core/UseCase;", "Landroidx/camera/core/impl/UseCaseConfig;", "getAppConfiguredGroupableFeatureType", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getAppConfiguredGroupableFeatureType$camera_core_release", "isConfiguredToUseCaseByApp", "", "useCase", "isDynamicRangeConfiguredByApp", "isFpsRangeConfiguredByApp", "isStabilizationModeConfiguredByApp", "isImageFormatConfiguredByApp", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUseCaseType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UseCaseType.kt\nandroidx/camera/core/featuregroup/impl/UseCaseType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final UseCaseType getFeatureGroupUseCaseType(@NotNull UseCase useCase) {
            Intrinsics.checkNotNullParameter(useCase, "<this>");
            if (useCase instanceof Preview) {
                return UseCaseType.PREVIEW;
            }
            if (useCase instanceof ImageCapture) {
                return UseCaseType.IMAGE_CAPTURE;
            }
            if (CameraUseCaseAdapter.isVideoCapture(useCase)) {
                return UseCaseType.VIDEO_CAPTURE;
            }
            return useCase instanceof StreamSharing ? UseCaseType.STREAM_SHARING : UseCaseType.UNDEFINED;
        }

        /* JADX INFO: compiled from: UseCaseType.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
                try {
                    iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[FeatureTypeInternal.values().length];
                try {
                    iArr2[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        private final boolean isConfiguredToUseCaseByApp(FeatureTypeInternal featureTypeInternal, UseCase useCase) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[featureTypeInternal.ordinal()];
            if (i11 == 1) {
                return isDynamicRangeConfiguredByApp(useCase);
            }
            if (i11 == 2) {
                return isFpsRangeConfiguredByApp(useCase);
            }
            if (i11 == 3) {
                return isStabilizationModeConfiguredByApp(useCase);
            }
            if (i11 == 4) {
                return isImageFormatConfiguredByApp(useCase);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Nullable
        public final FeatureTypeInternal getAppConfiguredGroupableFeatureType$camera_core_release(@NotNull UseCase useCase) {
            FeatureTypeInternal next;
            Intrinsics.checkNotNullParameter(useCase, "<this>");
            Iterator<FeatureTypeInternal> it = FeatureTypeInternal.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (UseCaseType.INSTANCE.isConfiguredToUseCaseByApp(next, useCase)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private final boolean isDynamicRangeConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().hasDynamicRange();
        }

        private final boolean isFpsRangeConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().hasTargetFrameRate();
        }

        private final boolean isImageFormatConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().containsOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT);
        }

        private final boolean isStabilizationModeConfiguredByApp(UseCase useCase) {
            if (!useCase.getAppConfig().containsOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE) && !useCase.getAppConfig().containsOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE)) {
                return false;
            }
            return true;
        }

        @JvmStatic
        @NotNull
        public final UseCaseType getFeatureGroupUseCaseType(@NotNull UseCaseConfig<?> useCaseConfig) {
            Intrinsics.checkNotNullParameter(useCaseConfig, "<this>");
            int i11 = WhenMappings.$EnumSwitchMapping$0[useCaseConfig.getCaptureType().ordinal()];
            if (i11 == 1) {
                return UseCaseType.IMAGE_CAPTURE;
            }
            if (i11 == 2) {
                return UseCaseType.PREVIEW;
            }
            if (i11 == 3) {
                return UseCaseType.VIDEO_CAPTURE;
            }
            if (i11 != 4) {
                return UseCaseType.UNDEFINED;
            }
            return UseCaseType.STREAM_SHARING;
        }
    }

    @JvmStatic
    @NotNull
    public static final UseCaseType getFeatureGroupUseCaseType(@NotNull UseCase useCase) {
        return INSTANCE.getFeatureGroupUseCaseType(useCase);
    }

    /* JADX INFO: compiled from: UseCaseType.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UseCaseType.values().length];
            try {
                iArr[UseCaseType.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UseCaseType.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UseCaseType.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UseCaseType.STREAM_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UseCaseType.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static EnumEntries<UseCaseType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final UseCaseType getFeatureGroupUseCaseType(@NotNull UseCaseConfig<?> useCaseConfig) {
        return INSTANCE.getFeatureGroupUseCaseType(useCaseConfig);
    }

    public static /* synthetic */ int getImageFormat$default(UseCaseType useCaseType, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getImageFormat");
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        return useCaseType.getImageFormat(num);
    }

    public final int getDefaultImageFormat() {
        return this.defaultImageFormat;
    }

    public final int getImageFormat(@Nullable Integer imageCaptureFormat) {
        return (this != IMAGE_CAPTURE || imageCaptureFormat == null) ? this.defaultImageFormat : imageCaptureFormat.intValue();
    }

    @Nullable
    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return "Preview";
        }
        if (i11 == 2) {
            return "ImageCapture";
        }
        if (i11 == 3) {
            return "VideoCapture";
        }
        if (i11 == 4) {
            return "StreamSharing";
        }
        if (i11 == 5) {
            return "Undefined";
        }
        throw new NoWhenBranchMatchedException();
    }

    UseCaseType(Class cls, int i11) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i11;
    }
}
