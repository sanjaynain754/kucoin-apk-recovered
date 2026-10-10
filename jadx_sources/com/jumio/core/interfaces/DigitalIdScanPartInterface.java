package com.jumio.core.interfaces;

import android.net.Uri;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.views.JumioAnimationView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/interfaces/DigitalIdScanPartInterface;", "Lcom/jumio/core/interfaces/ScanPartInterface;", "Lcom/jumio/core/interfaces/DeepLinkConsumerInterface;", "Lcom/jumio/core/interfaces/WebVerificationInterface;", "thirdPartyVerificationStarted", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface DigitalIdScanPartInterface {
    /* synthetic */ void cancel();

    boolean consume(@NotNull Uri uri);

    /* synthetic */ void fallback(@NotNull JumioFallbackReason jumioFallbackReason);

    /* synthetic */ void finish();

    @NotNull
    String getBaseUrl();

    /* synthetic */ void getHelpAnimation(@NotNull JumioAnimationView jumioAnimationView);

    @NotNull
    String getHtml();

    /* synthetic */ void retry(@NotNull JumioRetryReason jumioRetryReason);

    /* synthetic */ void setBaseUrl(@NotNull String str);

    /* synthetic */ void setHtml(@NotNull String str);

    /* synthetic */ void start();

    void thirdPartyVerificationStarted();
}
