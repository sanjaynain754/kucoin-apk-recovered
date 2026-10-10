package com.kubi.user.protocol.text;

import e10.InterfaceC37044c;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import x00.C45980e;

/* JADX INFO: renamed from: com.kubi.user.protocol.text.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HttpUrlInterceptor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/protocol/text/HttpUrlInterceptor;", "Lcom/kubi/sdk/web/spi/IWebUrlInterceptor;", "<init>", "()V", "intercept", "", "urlInfo", "Lcom/kubi/sdk/web/config/WebUriInfo;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HttpUrlInterceptor implements InterfaceC37044c {
    @Override // e10.InterfaceC37044c
    /* JADX INFO: renamed from: a */
    public boolean mo65690a(@NotNull C45980e urlInfo) {
        Intrinsics.checkNotNullParameter(urlInfo, "urlInfo");
        String string = urlInfo.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!StringsKt.startsWith$default(string, "http://", false, 2, (Object) null) && !StringsKt.startsWith$default(string, "https://", false, 2, (Object) null)) {
            return false;
        }
        InterfaceC37766r.a.m85190a(C37304a.f82764a, string, null, null, null, null, null, null, 126, null);
        return true;
    }
}
