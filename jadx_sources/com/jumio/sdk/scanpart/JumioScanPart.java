package com.jumio.sdk.scanpart;

import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.views.JumioAnimationView;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/sdk/scanpart/JumioScanPart;", "Ljava/io/Serializable;", "scanPart", "Lcom/jumio/core/scanpart/ScanPart;", "<init>", "(Lcom/jumio/core/scanpart/ScanPart;)V", "getScanPart$jumio_core_release", "()Lcom/jumio/core/scanpart/ScanPart;", "isValid", "", "hasFallback", "getHasFallback", "()Z", "scanMode", "Lcom/jumio/sdk/enums/JumioScanMode;", "getScanMode", "()Lcom/jumio/sdk/enums/JumioScanMode;", "start", "", "retry", "reason", "Lcom/jumio/sdk/retry/JumioRetryReason;", "fallback", "cancel", "finish", "getHelpAnimation", "animationView", "Lcom/jumio/sdk/views/JumioAnimationView;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioScanPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioScanPart.kt\ncom/jumio/sdk/scanpart/JumioScanPart\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n15#2,5:117\n15#2,5:122\n15#2,5:127\n15#2,5:132\n15#2,5:137\n15#2,5:142\n15#2,5:148\n1#3:147\n*S KotlinDebug\n*F\n+ 1 JumioScanPart.kt\ncom/jumio/sdk/scanpart/JumioScanPart\n*L\n48#1:117,5\n60#1:122,5\n71#1:127,5\n82#1:132,5\n83#1:137,5\n96#1:142,5\n112#1:148,5\n*E\n"})
public final class JumioScanPart implements Serializable {

    /* JADX INFO: renamed from: a */
    public final ScanPart f14746a;

    /* JADX INFO: renamed from: b */
    public boolean f14747b;

    public JumioScanPart(@NotNull ScanPart<?> scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        this.f14746a = scanPart;
        this.f14747b = true;
    }

    public final void cancel() throws SDKNotConfiguredException {
        if (!this.f14747b) {
            throw new SDKNotConfiguredException("This part can not be used anymore");
        }
        if (!this.f14746a.isCancelable()) {
            throw new SDKNotConfiguredException("This part is not cancelable at the moment");
        }
        this.f14746a.cancel();
        this.f14746a.getF14542b().cancelScanPart$jumio_core_release(this);
        this.f14747b = false;
    }

    public final void fallback() throws SDKNotConfiguredException {
        if (!this.f14747b) {
            throw new SDKNotConfiguredException("This part can not be used anymore");
        }
        this.f14746a.fallback(JumioFallbackReason.USER_ACTION);
    }

    public final void finish() throws SDKNotConfiguredException {
        if (!this.f14747b) {
            throw new SDKNotConfiguredException("This part can not be used anymore");
        }
        if (!this.f14746a.getF14548h()) {
            throw new IllegalArgumentException("This part is not yet finished");
        }
        this.f14746a.finish();
        this.f14746a.getF14542b().finishScanPart$jumio_core_release(this);
        this.f14747b = false;
    }

    public final boolean getHasFallback() {
        return this.f14746a.getHasFallback();
    }

    @Deprecated(message = "Deprecated as of Jumio SDK 4.13.0")
    public final void getHelpAnimation(@NotNull JumioAnimationView animationView) throws SDKNotConfiguredException {
        Intrinsics.checkNotNullParameter(animationView, "animationView");
        if (!this.f14747b) {
            throw new SDKNotConfiguredException("This part can not be used anymore");
        }
        this.f14746a.getHelpAnimation(animationView);
    }

    @NotNull
    public final JumioScanMode getScanMode() {
        return this.f14746a.getScanMode();
    }

    @NotNull
    public final ScanPart<?> getScanPart$jumio_core_release() {
        return this.f14746a;
    }

    public final void retry(@NotNull JumioRetryReason reason) throws SDKNotConfiguredException {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!this.f14747b) {
            throw new SDKNotConfiguredException("This part can not be used anymore");
        }
        this.f14746a.retry(reason);
    }

    public final void start() throws SDKNotConfiguredException {
        if (!this.f14747b) {
            throw new SDKNotConfiguredException("This part can not be used anymore");
        }
        this.f14746a.start();
    }
}
