package com.tencent.bugly.common.reporter.upload;

import java.net.URL;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/BaseUpload;", "", "()V", "getProtocol", "", "url", "Ljava/net/URL;", "request", "", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class BaseUpload {
    public static final int PROTOCOL_HTTP = 0;
    public static final int PROTOCOL_HTTPS = 1;

    public final int getProtocol(@Nullable URL url) {
        if (url != null) {
            return !Intrinsics.areEqual(url.getProtocol(), "http") ? 1 : 0;
        }
        return 1;
    }

    public abstract void request();
}
