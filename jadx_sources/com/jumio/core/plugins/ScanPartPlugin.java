package com.jumio.core.plugins;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.Controller;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u00042\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/plugins/ScanPartPlugin;", "Lcom/jumio/core/plugins/Plugin;", "getScanPart", "Lcom/jumio/core/scanpart/ScanPart;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/models/ScanPartModel;", "controller", "Lcom/jumio/core/Controller;", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioCredential;", "scanPartModel", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/core/scanpart/ScanPart;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ScanPartPlugin extends Plugin {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isApplicableFor(@NotNull ScanPartPlugin scanPartPlugin, @NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
            return ScanPartPlugin.super.isApplicableFor(controller, scanPartModel);
        }

        @Deprecated
        public static boolean isPreloaded(@NotNull ScanPartPlugin scanPartPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return ScanPartPlugin.super.isPreloaded(controller);
        }

        @Deprecated
        public static boolean isUsable(@NotNull ScanPartPlugin scanPartPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return ScanPartPlugin.super.isUsable(controller);
        }

        @Deprecated
        public static void preload(@NotNull ScanPartPlugin scanPartPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            ScanPartPlugin.super.preload(controller);
        }

        @Deprecated
        public static void unload(@NotNull ScanPartPlugin scanPartPlugin) {
            ScanPartPlugin.super.unload();
        }
    }

    @NotNull
    <T extends ScanPartModel> ScanPart<?> getScanPart(@NotNull Controller controller, @NotNull JumioCredential credential, @NotNull T scanPartModel, @NotNull JumioScanPartInterface scanPartInterface);
}
