package com.jumio.liveness;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.core.Controller;
import com.jumio.core.MobileContext;
import com.jumio.core.cdn.CDNEncryptedEntry;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.TimeoutModel;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.ExtractionPlugin;
import com.jumio.core.plugins.ScanPartPlugin;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioFaceCredential;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import jumio.liveness.C40772A;
import jumio.liveness.C40780I;
import jumio.liveness.C40809z;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J;\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002H\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m90084d2 = {"Lcom/jumio/liveness/LivenessPlugin;", "Lcom/jumio/core/plugins/ExtractionPlugin;", "Lcom/jumio/core/plugins/ScanPartPlugin;", "<init>", "()V", "preload", "", "controller", "Lcom/jumio/core/Controller;", "getExtractionClient", "Lcom/jumio/core/extraction/ExtractionClient;", "getOverlay", "Lcom/jumio/core/overlay/Overlay;", "mobileContext", "Lcom/jumio/core/MobileContext;", "getScanPart", "Lcom/jumio/core/scanpart/ScanPart;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/models/ScanPartModel;", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioCredential;", "scanPartModel", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/core/scanpart/ScanPart;", "version", "", "getVersion", "()Ljava/lang/String;", "isPreloaded", "", "Companion", "jumio-liveness_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LivenessPlugin implements ExtractionPlugin, ScanPartPlugin {

    @NotNull
    public static final String LIVENESS_ASSETS = "livenessAssets";

    @NotNull
    private final String version = "4.17.0 (1)";

    @Override // com.jumio.core.plugins.ExtractionPlugin
    @NotNull
    public ExtractionClient getExtractionClient(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new C40809z(controller.getF13601b(), controller.getF13607h(), (LivenessSettingsModel) controller.getF13603d().get(LivenessSettingsModel.class));
    }

    @Override // com.jumio.core.plugins.ExtractionPlugin
    @NotNull
    public Overlay getOverlay(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "mobileContext");
        return new C40772A(mobileContext);
    }

    @Override // com.jumio.core.plugins.ScanPartPlugin
    @NotNull
    public <T extends ScanPartModel> ScanPart<?> getScanPart(@NotNull Controller controller, @NotNull JumioCredential credential, @NotNull T scanPartModel, @NotNull JumioScanPartInterface scanPartInterface) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        if (!(credential instanceof JumioFaceCredential)) {
            throw new IllegalArgumentException("Credential needs to be instance of JumioFaceCredential");
        }
        if (scanPartModel instanceof LivenessScanPartModel) {
            return new C40780I(controller, (JumioFaceCredential) credential, (LivenessScanPartModel) scanPartModel, scanPartInterface);
        }
        throw new IllegalArgumentException("ScanPartModel needs to be instance of LivenessScanPartModel");
    }

    @Override // com.jumio.core.plugins.Plugin
    @NotNull
    public String getVersion() {
        return this.version;
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isPreloaded(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return ((CDNFeatureModel) controller.getF13603d().get(CDNFeatureModel.class)).has(LIVENESS_ASSETS);
    }

    @Override // com.jumio.core.plugins.Plugin
    public void preload(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        super.preload(controller);
        Log.m14474i("LivenessPlugin", "Preloading LivenessPlugin");
        CDNFeatureModel cDNFeatureModel = (CDNFeatureModel) controller.getF13603d().get(CDNFeatureModel.class);
        CDNFeatureModel.load$default(cDNFeatureModel, LIVENESS_ASSETS, ((TimeoutModel) controller.getF13603d().get(TimeoutModel.class)).getCdn(), null, 4, null);
        CDNEncryptedEntry cDNEncryptedEntry = cDNFeatureModel.get(LIVENESS_ASSETS);
        if (cDNEncryptedEntry == null || !cDNEncryptedEntry.isAssetFile()) {
            return;
        }
        Analytics.INSTANCE.add(MobileEvents.misc$default("livenessAssetsInBundle", null, 2, null));
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isApplicableFor(@NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
        return super.isApplicableFor(controller, scanPartModel);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isUsable(@NotNull Controller controller) {
        return super.isUsable(controller);
    }

    @Override // com.jumio.core.plugins.Plugin
    public void unload() {
        super.unload();
    }
}
