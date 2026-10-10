package androidx.camera.extensions.internal.compat.workaround;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Quirk;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;
import androidx.camera.extensions.internal.compat.quirk.EnsurePostviewFormatEquivalenceQuirk;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PostviewFormatValidator.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;", "", "<init>", "()V", "quirk", "Landroidx/camera/core/impl/Quirk;", "getPostviewFormatSelector", "Landroidx/camera/core/impl/CameraConfig$PostviewFormatSelector;", "camera-extensions_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PostviewFormatValidator {

    @Nullable
    private final Quirk quirk = DeviceQuirks.get(EnsurePostviewFormatEquivalenceQuirk.class);

    @NotNull
    public final CameraConfig.PostviewFormatSelector getPostviewFormatSelector() {
        if (this.quirk != null) {
            return new CameraConfig.PostviewFormatSelector() { // from class: androidx.camera.extensions.internal.compat.workaround.c
                @Override // androidx.camera.core.impl.CameraConfig.PostviewFormatSelector
                public final int select(int i11, List list) {
                    return PostviewFormatValidator.getPostviewFormatSelector$lambda$1$lambda$0(i11, list);
                }
            };
        }
        CameraConfig.PostviewFormatSelector DEFAULT_POSTVIEW_FORMAT_SELECTOR = CameraConfig.DEFAULT_POSTVIEW_FORMAT_SELECTOR;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_POSTVIEW_FORMAT_SELECTOR, "DEFAULT_POSTVIEW_FORMAT_SELECTOR");
        return DEFAULT_POSTVIEW_FORMAT_SELECTOR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getPostviewFormatSelector$lambda$1$lambda$0(int i11, List supportedPostviewFormats) {
        Intrinsics.checkNotNullParameter(supportedPostviewFormats, "supportedPostviewFormats");
        if (supportedPostviewFormats.contains(Integer.valueOf(i11))) {
            return i11;
        }
        return 0;
    }
}
