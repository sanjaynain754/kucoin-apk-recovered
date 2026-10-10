package com.tencent.rmonitor.common.network.ssl;

import com.tencent.bugly.proguard.C33597d2;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.UrlMeta;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/common/network/ssl/RMonitorNameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "verify", "", "hostname", "", "session", "Ljavax/net/ssl/SSLSession;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class RMonitorNameVerifier implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String hostname, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            URL url = new URL(C33597d2.m72768b());
            URL url2 = new URL("https://h.trace.qq.com/kv");
            UrlMeta urlMeta = BaseInfo.urlMeta;
            return Intrinsics.areEqual(hostname, url.getHost()) || Intrinsics.areEqual(hostname, url2.getHost()) || Intrinsics.areEqual(hostname, new URL(urlMeta.rmonitorDomain).getHost()) || Intrinsics.areEqual(hostname, new URL(urlMeta.getAttaUrl()).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }
}
