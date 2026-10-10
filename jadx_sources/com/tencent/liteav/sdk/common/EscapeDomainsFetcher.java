package com.tencent.liteav.sdk.common;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.SoLoader;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class EscapeDomainsFetcher {
    public static final int ESCAPE_DOMAIN_TYPE_DRM_KEY = 4;
    public static final int ESCAPE_DOMAIN_TYPE_LICENSE = 1;
    public static final int ESCAPE_DOMAIN_TYPE_PLAY_CGI = 0;
    public static final int ESCAPE_DOMAIN_TYPE_REPORT = 3;
    public static final int ESCAPE_DOMAIN_TYPE_UPLOAD_SIGNAL = 2;

    private static native List<String> nativeGetEscapeDomains(int i11, int i12);

    static {
        SoLoader.loadAllLibraries();
    }

    public static List<String> getEscapeDomains(int i11, int i12) {
        return nativeGetEscapeDomains(i11, i12);
    }
}
