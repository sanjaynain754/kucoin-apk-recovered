package com.jumio.core.network;

import android.annotation.SuppressLint;
import com.jumio.core.Injected;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/network/TrustManagerInterface;", "Ljavax/net/ssl/X509TrustManager;", "hostname", "", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "keyPinning", "Lkotlin/Function0;", "", "getKeyPinning", "()Lkotlin/jvm/functions/Function0;", "setKeyPinning", "(Lkotlin/jvm/functions/Function0;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CustomX509TrustManager"})
public interface TrustManagerInterface extends X509TrustManager {
    @NotNull
    String getHostname();

    @NotNull
    Function0<Boolean> getKeyPinning();

    void setHostname(@NotNull String str);

    void setKeyPinning(@NotNull Function0<Boolean> function0);
}
