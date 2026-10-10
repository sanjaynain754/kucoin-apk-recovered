package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;

/* JADX INFO: loaded from: classes23.dex */
public class RequestOptionConfig implements ReadableConfig {
    static final String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    private Config mConfig;

    public static class Builder {
        private MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m2068a(Builder builder, Config config, Config.Option option) {
            builder.mMutableOptionsBundle.insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        public static Builder from(final Config config) {
            final Builder builder = new Builder();
            config.findOptions("camera2.captureRequest.option.", new Config.OptionMatcher() { // from class: androidx.camera.extensions.internal.p
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(Config.Option option) {
                    return RequestOptionConfig.Builder.m2068a(this.f1898a, config, option);
                }
            });
            return builder;
        }

        public RequestOptionConfig build() {
            return new RequestOptionConfig(OptionsBundle.from(this.mMutableOptionsBundle));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> Builder setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(RequestOptionConfig.createOptionFromKey(key), valuet);
            return this;
        }
    }

    private RequestOptionConfig(Config config) {
        this.mConfig = config;
    }

    @VisibleForTesting
    public static Config.Option<Object> createOptionFromKey(CaptureRequest.Key<?> key) {
        return Config.Option.create("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return this.mConfig;
    }
}
