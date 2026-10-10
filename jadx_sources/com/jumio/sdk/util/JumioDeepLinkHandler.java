package com.jumio.sdk.util;

import android.net.Uri;
import com.jumio.core.interfaces.DigitalIdScanPartInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/sdk/util/JumioDeepLinkHandler;", "", "<init>", "()V", "consumeForScanPart", "", "deepLink", "Landroid/net/Uri;", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioDeepLinkHandler {

    @NotNull
    public static final JumioDeepLinkHandler INSTANCE = new JumioDeepLinkHandler();

    public final boolean consumeForScanPart(@NotNull Uri deepLink, @NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        if (scanPart.getScanPart$jumio_core_release() instanceof DigitalIdScanPartInterface) {
            return ((DigitalIdScanPartInterface) scanPart.getScanPart$jumio_core_release()).consume(deepLink);
        }
        return false;
    }
}
