package com.jumio.sdk.handler;

import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.handler.CheckHandler;
import com.jumio.core.views.CheckView;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.views.JumioRejectView;
import com.tencent.qcloud.tuicore.TUIConstants;
import jumio.core.InterfaceC40671h3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/sdk/handler/JumioRejectHandler;", "Lcom/jumio/core/handler/CheckHandler;", "Lcom/jumio/core/interfaces/RejectInterface;", "<init>", "()V", "renderPart", "", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/jumio/sdk/views/JumioRejectView;", "retake", "isValidForScanStep", "", "scanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "isValidForScanStep$jumio_core_release", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRejectHandler extends CheckHandler<InterfaceC40671h3> {
    @Override // com.jumio.core.handler.CheckHandler
    public boolean isValidForScanStep$jumio_core_release(@Nullable JumioScanStep scanStep) {
        return scanStep != null && scanStep == JumioScanStep.REJECT_VIEW;
    }

    public final void renderPart(@NotNull JumioCredentialPart credentialPart, @NotNull JumioRejectView view) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(view, "view");
        renderPart(credentialPart, (CheckView<?>) view);
    }

    public final void retake() {
        InterfaceC40671h3 checkInterface = getCheckInterface();
        if (checkInterface != null) {
            checkInterface.reject();
        }
        Analytics.INSTANCE.add(MobileEvents.userAction$default("reject", null, null, 6, null));
    }
}
