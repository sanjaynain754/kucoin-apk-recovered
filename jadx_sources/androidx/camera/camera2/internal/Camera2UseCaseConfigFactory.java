package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {
    final DisplayInfoManager mDisplayInfoManager;

    public Camera2UseCaseConfigFactory(Context context) {
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i11) {
        CaptureConfig.OptionUnpacker optionUnpacker;
        MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.setTemplateType(TemplateTypeUtil.getSessionConfigTemplateType(captureType, i11));
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, Camera2SessionOptionUnpacker.INSTANCE);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        builder2.setTemplateType(TemplateTypeUtil.getCaptureConfigTemplateType(captureType, i11));
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        Config.Option<CaptureConfig.OptionUnpacker> option = UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER;
        if (captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE) {
            optionUnpacker = ImageCaptureOptionUnpacker.INSTANCE;
        } else {
            optionUnpacker = Camera2CaptureOptionUnpacker.INSTANCE;
        }
        mutableOptionsBundleCreate.insertOption(option, optionUnpacker);
        if (captureType == UseCaseConfigFactory.CaptureType.PREVIEW) {
            mutableOptionsBundleCreate.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, this.mDisplayInfoManager.getPreviewSize());
        }
        mutableOptionsBundleCreate.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(this.mDisplayInfoManager.getMaxSizeDisplay(true).getRotation()));
        if (captureType == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE || captureType == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.TRUE);
        }
        return OptionsBundle.from(mutableOptionsBundleCreate);
    }
}
