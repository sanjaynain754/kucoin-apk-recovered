package com.jumio.liveness;

import com.facebook.AuthenticationTokenClaims;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkflowConfigurations.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/jumio/liveness/PhotinusConfigurations;", "", AuthenticationTokenClaims.JSON_KEY_NONCE, "", "hardwareLatency", "", "<init>", "(Ljava/lang/String;I)V", "getNonce", "()Ljava/lang/String;", "getHardwareLatency", "()I", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PhotinusConfigurations {
    private final int hardwareLatency;

    @NotNull
    private final String nonce;

    public PhotinusConfigurations(@NotNull String nonce, int i11) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        this.nonce = nonce;
        this.hardwareLatency = i11;
    }

    public final int getHardwareLatency() {
        return this.hardwareLatency;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }
}
