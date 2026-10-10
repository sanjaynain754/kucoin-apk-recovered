package com.sumsub.sns.internal.features.presentation;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Constants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/ServerDrivenNavigationConfiguration;", "", "<init>", "()V", "value", "", Constants.ENABLE_DISABLE, "isEnabled$idensic_mobile_sdk_aar_defaultRelease", "()Z", "setEnabled", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ServerDrivenNavigationConfiguration {

    @NotNull
    public static final ServerDrivenNavigationConfiguration INSTANCE = new ServerDrivenNavigationConfiguration();
    private static boolean isEnabled;

    public final boolean isEnabled$idensic_mobile_sdk_aar_defaultRelease() {
        return isEnabled;
    }

    public final void setEnabled(boolean isEnabled2) {
        isEnabled = isEnabled2;
    }

    private ServerDrivenNavigationConfiguration() {
    }
}
