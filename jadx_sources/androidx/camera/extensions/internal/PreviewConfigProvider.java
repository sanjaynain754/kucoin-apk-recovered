package androidx.camera.extensions.internal;

import androidx.camera.core.Preview;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.PreviewConfig;

/* JADX INFO: loaded from: classes23.dex */
public class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {
    private static final String TAG = "PreviewConfigProvider";
    private final VendorExtender mVendorExtender;

    @Override // androidx.camera.core.impl.ConfigProvider
    public PreviewConfig getConfig() {
        Preview.Builder builder = new Preview.Builder();
        updateBuilderConfig(builder, this.mVendorExtender);
        return builder.getUseCaseConfig();
    }

    public PreviewConfigProvider(VendorExtender vendorExtender) {
        this.mVendorExtender = vendorExtender;
    }

    public void updateBuilderConfig(Preview.Builder builder, VendorExtender vendorExtender) {
        builder.setSupportedResolutions(vendorExtender.getSupportedPreviewOutputResolutions());
        builder.setHighResolutionDisabled(true);
    }
}
