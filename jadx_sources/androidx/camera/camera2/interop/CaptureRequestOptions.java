package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalCamera2Interop
public class CaptureRequestOptions implements ReadableConfig {
    private final Config mConfig;

    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {
        private final MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Builder from(final Config config) {
            final Builder builder = new Builder();
            config.findOptions(Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new Config.OptionMatcher() { // from class: androidx.camera.camera2.interop.i
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(Config.Option option) {
                    return CaptureRequestOptions.Builder.m1838a(this.f1554a, config, option);
                }
            });
            return builder;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public CaptureRequestOptions build() {
            return new CaptureRequestOptions(OptionsBundle.from(this.mMutableOptionsBundle));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m1838a(Builder builder, Config config, Config.Option option) {
            builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> Builder clearCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
            this.mMutableOptionsBundle.removeOption(Camera2ImplConfig.createCaptureRequestOption(key));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> Builder setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), null);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Config getConfig() {
        return this.mConfig;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public CaptureRequestOptions(Config config) {
        this.mConfig = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public <ValueT> ValueT getCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return (ValueT) this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
    }
}
