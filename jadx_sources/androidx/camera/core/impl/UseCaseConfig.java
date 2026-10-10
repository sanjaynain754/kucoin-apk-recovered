package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.UseCase;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.internal.TargetConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, ImageInputConfig {
    public static final Config.Option<UseCaseConfigFactory.CaptureType> OPTION_CAPTURE_TYPE;
    public static final Config.Option<Boolean> OPTION_HIGH_RESOLUTION_DISABLED;
    public static final Config.Option<Boolean> OPTION_IS_STRICT_FRAME_RATE_REQUIRED;
    public static final Config.Option<Integer> OPTION_PREVIEW_STABILIZATION_MODE;
    public static final Config.Option<Integer> OPTION_SESSION_TYPE;
    public static final Config.Option<StreamUseCase> OPTION_STREAM_USE_CASE;
    public static final Config.Option<Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY;
    public static final Config.Option<TakePictureManager.Provider> OPTION_TAKE_PICTURE_MANAGER_PROVIDER;
    public static final Config.Option<Range<Integer>> OPTION_TARGET_FRAME_RATE;
    public static final Config.Option<Integer> OPTION_VIDEO_STABILIZATION_MODE;
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED;
    public static final Config.Option<SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = Config.Option.create("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    public static final Config.Option<CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = Config.Option.create("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class);
    public static final Config.Option<SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class);
    public static final Config.Option<CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class);

    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T> {
        C getUseCaseConfig();

        B setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

        B setCaptureType(UseCaseConfigFactory.CaptureType captureType);

        B setDefaultCaptureConfig(CaptureConfig captureConfig);

        B setDefaultSessionConfig(SessionConfig sessionConfig);

        B setHighResolutionDisabled(boolean z11);

        B setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

        B setStreamUseCase(StreamUseCase streamUseCase);

        B setSurfaceOccupancyPriority(int i11);

        B setZslDisabled(boolean z11);
    }

    default CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    default CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
        return (CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    default SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
        return (SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    default SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    default int getSessionType(int i11) {
        return ((Integer) retrieveOption(OPTION_SESSION_TYPE, Integer.valueOf(i11))).intValue();
    }

    default int getSurfaceOccupancyPriority(int i11) {
        return ((Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i11))).intValue();
    }

    default Range<Integer> getTargetFrameRate(Range<Integer> range) {
        return (Range) retrieveOption(OPTION_TARGET_FRAME_RATE, range);
    }

    static {
        Class cls = Integer.TYPE;
        OPTION_SURFACE_OCCUPANCY_PRIORITY = Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", cls);
        OPTION_SESSION_TYPE = Config.Option.create("camerax.core.useCase.sessionType", cls);
        OPTION_TARGET_FRAME_RATE = Config.Option.create("camerax.core.useCase.targetFrameRate", Range.class);
        OPTION_IS_STRICT_FRAME_RATE_REQUIRED = Config.Option.create("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        Class cls2 = Boolean.TYPE;
        OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.useCase.zslDisabled", cls2);
        OPTION_HIGH_RESOLUTION_DISABLED = Config.Option.create("camerax.core.useCase.highResolutionDisabled", cls2);
        OPTION_CAPTURE_TYPE = Config.Option.create("camerax.core.useCase.captureType", UseCaseConfigFactory.CaptureType.class);
        OPTION_PREVIEW_STABILIZATION_MODE = Config.Option.create("camerax.core.useCase.previewStabilizationMode", cls);
        OPTION_VIDEO_STABILIZATION_MODE = Config.Option.create("camerax.core.useCase.videoStabilizationMode", cls);
        OPTION_TAKE_PICTURE_MANAGER_PROVIDER = Config.Option.create("camerax.core.useCase.takePictureManagerProvider", TakePictureManager.Provider.class);
        OPTION_STREAM_USE_CASE = Config.Option.create("camerax.core.useCase.streamUseCase", StreamUseCase.class);
    }

    default CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return (CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    default UseCaseConfigFactory.CaptureType getCaptureType() {
        return (UseCaseConfigFactory.CaptureType) retrieveOption(OPTION_CAPTURE_TYPE);
    }

    default CaptureConfig getDefaultCaptureConfig() {
        return (CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    default SessionConfig getDefaultSessionConfig() {
        return (SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG);
    }

    default int getPreviewStabilizationMode() {
        return ((Integer) retrieveOption(OPTION_PREVIEW_STABILIZATION_MODE, 0)).intValue();
    }

    default SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return (SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER);
    }

    default int getSessionType() {
        return ((Integer) retrieveOption(OPTION_SESSION_TYPE)).intValue();
    }

    default StreamUseCase getStreamUseCase() {
        StreamUseCase streamUseCase = (StreamUseCase) retrieveOption(OPTION_STREAM_USE_CASE, StreamUseCase.DEFAULT);
        Objects.requireNonNull(streamUseCase);
        return streamUseCase;
    }

    default int getSurfaceOccupancyPriority() {
        return ((Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    default TakePictureManager.Provider getTakePictureManagerProvider() {
        TakePictureManager.Provider provider = (TakePictureManager.Provider) retrieveOption(OPTION_TAKE_PICTURE_MANAGER_PROVIDER, new TakePictureManager.Provider() { // from class: androidx.camera.core.impl.UseCaseConfig.1
            @Override // androidx.camera.core.imagecapture.TakePictureManager.Provider
            public TakePictureManager newInstance(ImageCaptureControl imageCaptureControl) {
                return new TakePictureManagerImpl(imageCaptureControl);
            }
        });
        Objects.requireNonNull(provider);
        return provider;
    }

    default Range<Integer> getTargetFrameRate() {
        return (Range) retrieveOption(OPTION_TARGET_FRAME_RATE);
    }

    default int getVideoStabilizationMode() {
        return ((Integer) retrieveOption(OPTION_VIDEO_STABILIZATION_MODE, 0)).intValue();
    }

    default boolean hasTargetFrameRate() {
        return containsOption(OPTION_TARGET_FRAME_RATE);
    }

    default boolean isHighResolutionDisabled(boolean z11) {
        return ((Boolean) retrieveOption(OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z11))).booleanValue();
    }

    default boolean isStrictFrameRateRequired() {
        Boolean bool = (Boolean) retrieveOption(OPTION_IS_STRICT_FRAME_RATE_REQUIRED, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default boolean isZslDisabled(boolean z11) {
        return ((Boolean) retrieveOption(OPTION_ZSL_DISABLED, Boolean.valueOf(z11))).booleanValue();
    }
}
