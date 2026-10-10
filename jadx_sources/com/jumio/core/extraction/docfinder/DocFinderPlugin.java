package com.jumio.core.extraction.docfinder;

import androidx.annotation.Keep;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.Controller;
import com.jumio.core.MobileContext;
import com.jumio.core.cdn.CDNEncryptedEntry;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay;
import com.jumio.core.models.DocfinderSettingsModel;
import com.jumio.core.models.ExtractionModeModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.TimeoutModel;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.ExtractionPlugin;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/DocFinderPlugin;", "Lcom/jumio/core/plugins/ExtractionPlugin;", "<init>", "()V", "version", "", "getVersion", "()Ljava/lang/String;", "isUsable", "", "controller", "Lcom/jumio/core/Controller;", "preload", "", "getExtractionClient", "Lcom/jumio/core/extraction/ExtractionClient;", "getOverlay", "Lcom/jumio/core/overlay/Overlay;", "mobileContext", "Lcom/jumio/core/MobileContext;", "isPreloaded", "Companion", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocFinderPlugin implements ExtractionPlugin {

    @NotNull
    public static final String CLASSIFIER_MODEL = "classifierOnDeviceV2";

    @NotNull
    public static final String CORNER_DETECTION_MODEL = "docfinderModel";

    @NotNull
    private final String version = "4.17.0 (1)";

    @Override // com.jumio.core.plugins.ExtractionPlugin
    @NotNull
    public ExtractionClient getExtractionClient(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new DocFinderClient(controller.getF13601b(), controller.getF13607h(), (DocfinderSettingsModel) controller.getF13603d().get(DocfinderSettingsModel.class), null, null, 24, null);
    }

    @Override // com.jumio.core.plugins.ExtractionPlugin
    @NotNull
    public Overlay getOverlay(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "mobileContext");
        return new DocFinderOverlay(mobileContext);
    }

    @Override // com.jumio.core.plugins.Plugin
    @NotNull
    public String getVersion() {
        return this.version;
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isPreloaded(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return ((CDNFeatureModel) controller.getF13603d().get(CDNFeatureModel.class)).has(CORNER_DETECTION_MODEL, CLASSIFIER_MODEL);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isUsable(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        boolean zHas = ((CDNFeatureModel) controller.getF13603d().get(CDNFeatureModel.class)).has(CORNER_DETECTION_MODEL);
        if (!zHas) {
            Analytics.INSTANCE.add(MobileEvents.misc$default("docFinderModelNotAvailable", null, 2, null));
        }
        return zHas && ((ExtractionModeModel) controller.getF13603d().get(ExtractionModeModel.class)).getDocFinderEnabled();
    }

    @Override // com.jumio.core.plugins.Plugin
    public void preload(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        super.preload(controller);
        TimeoutModel timeoutModel = (TimeoutModel) controller.getF13603d().get(TimeoutModel.class);
        CDNFeatureModel cDNFeatureModel = (CDNFeatureModel) controller.getF13603d().get(CDNFeatureModel.class);
        CDNFeatureModel.load$default(cDNFeatureModel, CORNER_DETECTION_MODEL, timeoutModel.getCdn(), null, 4, null);
        CDNEncryptedEntry cDNEncryptedEntry = cDNFeatureModel.get(CORNER_DETECTION_MODEL);
        if (cDNEncryptedEntry != null && cDNEncryptedEntry.isAssetFile()) {
            Analytics.INSTANCE.add(MobileEvents.misc$default("docFinderInBundle", null, 2, null));
        }
        CDNFeatureModel.load$default(cDNFeatureModel, CLASSIFIER_MODEL, timeoutModel.getCdn(), null, 4, null);
        CDNEncryptedEntry cDNEncryptedEntry2 = cDNFeatureModel.get(CLASSIFIER_MODEL);
        if (cDNEncryptedEntry2 == null || !cDNEncryptedEntry2.isAssetFile()) {
            return;
        }
        Analytics.INSTANCE.add(MobileEvents.misc$default("classifierOnDeviceInBundle", null, 2, null));
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isApplicableFor(@NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
        return super.isApplicableFor(controller, scanPartModel);
    }

    @Override // com.jumio.core.plugins.Plugin
    public void unload() {
        super.unload();
    }
}
