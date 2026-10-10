package com.jumio.core.extraction.manual;

import androidx.annotation.Keep;
import com.jumio.core.Controller;
import com.jumio.core.MobileContext;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.overlay.JVisionOverlay;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.ExtractionPlugin;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/extraction/manual/ManualPicturePlugin;", "Lcom/jumio/core/plugins/ExtractionPlugin;", "<init>", "()V", "version", "", "getVersion", "()Ljava/lang/String;", "getExtractionClient", "Lcom/jumio/core/extraction/ExtractionClient;", "controller", "Lcom/jumio/core/Controller;", "getOverlay", "Lcom/jumio/core/overlay/Overlay;", "mobileContext", "Lcom/jumio/core/MobileContext;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nManualPicturePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualPicturePlugin.kt\ncom/jumio/core/extraction/manual/ManualPicturePlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class ManualPicturePlugin implements ExtractionPlugin {

    @NotNull
    private final String version = "4.17.0 (1)";

    @Override // com.jumio.core.plugins.ExtractionPlugin
    @NotNull
    public ExtractionClient getExtractionClient(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new ManualPictureClient(controller.getF13601b(), controller.getF13607h(), null, 4, null);
    }

    @Override // com.jumio.core.plugins.ExtractionPlugin
    @NotNull
    public Overlay getOverlay(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "mobileContext");
        JVisionOverlay jVisionOverlay = new JVisionOverlay(mobileContext);
        jVisionOverlay.useCenterCrop = true;
        return jVisionOverlay;
    }

    @Override // com.jumio.core.plugins.Plugin
    @NotNull
    public String getVersion() {
        return this.version;
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isApplicableFor(@NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
        return super.isApplicableFor(controller, scanPartModel);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isPreloaded(@NotNull Controller controller) {
        return super.isPreloaded(controller);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isUsable(@NotNull Controller controller) {
        return super.isUsable(controller);
    }

    @Override // com.jumio.core.plugins.Plugin
    public void preload(@NotNull Controller controller) {
        super.preload(controller);
    }

    @Override // com.jumio.core.plugins.Plugin
    public void unload() {
        super.unload();
    }
}
