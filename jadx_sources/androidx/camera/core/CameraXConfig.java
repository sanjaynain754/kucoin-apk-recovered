package androidx.camera.core;

import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import com.tencent.bugly.proguard.C33820nf;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraXConfig implements TargetConfig<CameraX> {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int CAMERAX_CONFIG_IMPL_TYPE_CAMERA_CAMERA2 = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int CAMERAX_CONFIG_IMPL_TYPE_PIPE = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int CAMERAX_CONFIG_IMPL_TYPE_UNKNOWN = -1;

    /* JADX INFO: renamed from: DEFAULT_OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING */
    static final long f1556x3a2e682e = -1;
    static final Config.Option<CameraSelector> OPTION_AVAILABLE_CAMERAS_LIMITER;
    static final Config.Option<Long> OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING;

    @OptIn(markerClass = {ExperimentalRetryPolicy.class})
    static final Config.Option<RetryPolicy> OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY;
    static final Config.Option<Integer> OPTION_CONFIG_IMPL_TYPE;
    static final Config.Option<Integer> OPTION_MIN_LOGGING_LEVEL;
    static final Config.Option<QuirkSettings> OPTION_QUIRK_SETTINGS;
    static final Config.Option<Boolean> OPTION_REPEATING_STREAM_FORCED;
    private final OptionsBundle mConfig;
    static final Config.Option<CameraFactory.Provider> OPTION_CAMERA_FACTORY_PROVIDER = Config.Option.create("camerax.core.appConfig.cameraFactoryProvider", CameraFactory.Provider.class);
    static final Config.Option<CameraDeviceSurfaceManager.Provider> OPTION_DEVICE_SURFACE_MANAGER_PROVIDER = Config.Option.create("camerax.core.appConfig.deviceSurfaceManagerProvider", CameraDeviceSurfaceManager.Provider.class);
    static final Config.Option<UseCaseConfigFactory.Provider> OPTION_USECASE_CONFIG_FACTORY_PROVIDER = Config.Option.create("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.Provider.class);
    static final Config.Option<Executor> OPTION_CAMERA_EXECUTOR = Config.Option.create("camerax.core.appConfig.cameraExecutor", Executor.class);
    static final Config.Option<Handler> OPTION_SCHEDULER_HANDLER = Config.Option.create("camerax.core.appConfig.schedulerHandler", Handler.class);

    public static final class Builder implements TargetConfig.Builder<CameraX, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
            this(MutableOptionsBundle.create());
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(CameraX.class)) {
                setTargetClass(CameraX.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public static Builder fromConfig(CameraXConfig cameraXConfig) {
            return new Builder(MutableOptionsBundle.from((Config) cameraXConfig));
        }

        public CameraXConfig build() {
            return new CameraXConfig(OptionsBundle.from(this.mMutableConfig));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(Class<CameraX> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + C33820nf.f71144W + UUID.randomUUID());
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setAvailableCamerasLimiter(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_AVAILABLE_CAMERAS_LIMITER, cameraSelector);
            return this;
        }

        public Builder setCameraExecutor(Executor executor) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CAMERA_EXECUTOR, executor);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCameraFactoryProvider(CameraFactory.Provider provider) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER, provider);
            return this;
        }

        public Builder setCameraOpenRetryMaxTimeoutInMillisWhileResuming(long j11) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING, Long.valueOf(j11));
            return this;
        }

        @ExperimentalRetryPolicy
        public Builder setCameraProviderInitRetryPolicy(RetryPolicy retryPolicy) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY, retryPolicy);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setConfigImplType(int i11) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_CONFIG_IMPL_TYPE, Integer.valueOf(i11));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDeviceSurfaceManagerProvider(CameraDeviceSurfaceManager.Provider provider) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, provider);
            return this;
        }

        public Builder setMinimumLoggingLevel(@IntRange(from = 3, m1553to = 6) int i11) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, Integer.valueOf(i11));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setQuirkSettings(QuirkSettings quirkSettings) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_QUIRK_SETTINGS, quirkSettings);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setRepeatingStreamForced(boolean z11) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_REPEATING_STREAM_FORCED, Boolean.valueOf(z11));
            return this;
        }

        public Builder setSchedulerHandler(Handler handler) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_SCHEDULER_HANDLER, handler);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setUseCaseConfigFactoryProvider(UseCaseConfigFactory.Provider provider) {
            getMutableConfig().insertOption(CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER, provider);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImplType {
    }

    public interface Provider {
        CameraXConfig getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        OPTION_MIN_LOGGING_LEVEL = Config.Option.create("camerax.core.appConfig.minimumLoggingLevel", cls);
        OPTION_AVAILABLE_CAMERAS_LIMITER = Config.Option.create("camerax.core.appConfig.availableCamerasLimiter", CameraSelector.class);
        OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING = Config.Option.create("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY = Config.Option.create("camerax.core.appConfig.cameraProviderInitRetryPolicy", RetryPolicy.class);
        OPTION_QUIRK_SETTINGS = Config.Option.create("camerax.core.appConfig.quirksSettings", QuirkSettings.class);
        OPTION_CONFIG_IMPL_TYPE = Config.Option.create("camerax.core.appConfig.configImplType", cls);
        OPTION_REPEATING_STREAM_FORCED = Config.Option.create("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    public CameraSelector getAvailableCamerasLimiter(CameraSelector cameraSelector) {
        return (CameraSelector) this.mConfig.retrieveOption(OPTION_AVAILABLE_CAMERAS_LIMITER, cameraSelector);
    }

    public Executor getCameraExecutor(Executor executor) {
        return (Executor) this.mConfig.retrieveOption(OPTION_CAMERA_EXECUTOR, executor);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory.Provider getCameraFactoryProvider(CameraFactory.Provider provider) {
        return (CameraFactory.Provider) this.mConfig.retrieveOption(OPTION_CAMERA_FACTORY_PROVIDER, provider);
    }

    public long getCameraOpenRetryMaxTimeoutInMillisWhileResuming() {
        return ((Long) this.mConfig.retrieveOption(OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING, -1L)).longValue();
    }

    @ExperimentalRetryPolicy
    public RetryPolicy getCameraProviderInitRetryPolicy() {
        RetryPolicy retryPolicy = (RetryPolicy) this.mConfig.retrieveOption(OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY, RetryPolicy.DEFAULT);
        Objects.requireNonNull(retryPolicy);
        return retryPolicy;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Config getConfig() {
        return this.mConfig;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getConfigImplType() {
        return ((Integer) this.mConfig.retrieveOption(OPTION_CONFIG_IMPL_TYPE, -1)).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager.Provider getDeviceSurfaceManagerProvider(CameraDeviceSurfaceManager.Provider provider) {
        return (CameraDeviceSurfaceManager.Provider) this.mConfig.retrieveOption(OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, provider);
    }

    public int getMinimumLoggingLevel() {
        return ((Integer) this.mConfig.retrieveOption(OPTION_MIN_LOGGING_LEVEL, 3)).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public QuirkSettings getQuirkSettings() {
        return (QuirkSettings) this.mConfig.retrieveOption(OPTION_QUIRK_SETTINGS, null);
    }

    public Handler getSchedulerHandler(Handler handler) {
        return (Handler) this.mConfig.retrieveOption(OPTION_SCHEDULER_HANDLER, handler);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory.Provider getUseCaseConfigFactoryProvider(UseCaseConfigFactory.Provider provider) {
        return (UseCaseConfigFactory.Provider) this.mConfig.retrieveOption(OPTION_USECASE_CONFIG_FACTORY_PROVIDER, provider);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRepeatingStreamForced() {
        return ((Boolean) this.mConfig.retrieveOption(OPTION_REPEATING_STREAM_FORCED, Boolean.TRUE)).booleanValue();
    }

    public CameraXConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }
}
