package com.sumsub.sns.internal.core.domain;

import androidx.annotation.Keep;
import com.sumsub.sns.internal.core.common.C28468k0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;", "", "<init>", "()V", "muteVideoIdent", "", "getMuteVideoIdent", "()Z", "setMuteVideoIdent", "(Z)V", "brakeToken", "getBrakeToken", "setBrakeToken", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSDebugConstants {

    @NotNull
    public static final SNSDebugConstants INSTANCE = new SNSDebugConstants();
    private static boolean brakeToken;
    private static boolean muteVideoIdent;

    public final boolean getBrakeToken() {
        return C28468k0.f57988f && brakeToken;
    }

    public final boolean getMuteVideoIdent() {
        return C28468k0.f57988f && muteVideoIdent;
    }

    public final void setBrakeToken(boolean z11) {
        brakeToken = z11;
    }

    public final void setMuteVideoIdent(boolean z11) {
        muteVideoIdent = z11;
    }

    private SNSDebugConstants() {
    }
}
