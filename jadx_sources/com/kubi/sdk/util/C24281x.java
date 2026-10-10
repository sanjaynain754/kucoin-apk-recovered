package com.kubi.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Proxy;
import android.net.ProxyInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.x */
/* JADX INFO: compiled from: IPAddressUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"getProxyIpAddress", "", "context", "Landroid/content/Context;", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24281x {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m58545a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
                ProxyInfo httpProxy = linkProperties != null ? linkProperties.getHttpProxy() : null;
                if (httpProxy != null) {
                    String host = httpProxy.getHost();
                    Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
                    return host;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            String property = System.getProperty("http.proxyHost");
            if (property != null && property.length() != 0) {
                return property;
            }
            String defaultHost = Proxy.getDefaultHost();
            return defaultHost != null ? defaultHost : "";
        } catch (Throwable unused2) {
            return "";
        }
    }
}
