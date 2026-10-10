package com.jumio.core.plugins;

import com.jumio.core.Controller;
import com.jumio.core.MobileContext;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.overlay.Overlay;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/plugins/ExtractionPlugin;", "Lcom/jumio/core/plugins/Plugin;", "getExtractionClient", "Lcom/jumio/core/extraction/ExtractionClient;", "controller", "Lcom/jumio/core/Controller;", "getOverlay", "Lcom/jumio/core/overlay/Overlay;", "mobileContext", "Lcom/jumio/core/MobileContext;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ExtractionPlugin extends Plugin {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isApplicableFor(@NotNull ExtractionPlugin extractionPlugin, @NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
            return ExtractionPlugin.super.isApplicableFor(controller, scanPartModel);
        }

        @Deprecated
        public static boolean isPreloaded(@NotNull ExtractionPlugin extractionPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return ExtractionPlugin.super.isPreloaded(controller);
        }

        @Deprecated
        public static boolean isUsable(@NotNull ExtractionPlugin extractionPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return ExtractionPlugin.super.isUsable(controller);
        }

        @Deprecated
        public static void preload(@NotNull ExtractionPlugin extractionPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            ExtractionPlugin.super.preload(controller);
        }

        @Deprecated
        public static void unload(@NotNull ExtractionPlugin extractionPlugin) {
            ExtractionPlugin.super.unload();
        }
    }

    @NotNull
    ExtractionClient getExtractionClient(@NotNull Controller controller);

    @NotNull
    Overlay getOverlay(@NotNull MobileContext mobileContext);
}
