package com.kubi.sdk.web.core;

import com.kubi.monitor.BaseIssueException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebCoreException.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/web/core/WebCoreMessage;", "Lcom/kubi/monitor/BaseIssueException;", "msg", "", "source", "ignore", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class WebCoreMessage extends BaseIssueException {
    public /* synthetic */ WebCoreMessage(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebCoreMessage(@NotNull String msg, @NotNull String source, boolean z11) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        String str = String.format("lib|kweb|%s|ignore=%s", Arrays.copyOf(new Object[]{source, Boolean.valueOf(z11)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        super(str, msg);
    }
}
