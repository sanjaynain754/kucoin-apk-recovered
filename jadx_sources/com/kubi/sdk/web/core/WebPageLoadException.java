package com.kubi.sdk.web.core;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebCoreException.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/sdk/web/core/WebPageLoadException;", "Lcom/kubi/sdk/web/core/WebCoreMessage;", "message", "", "(Ljava/lang/String;)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WebPageLoadException extends WebCoreMessage {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebPageLoadException(@NotNull String message) {
        super(message, "", false, 4, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
