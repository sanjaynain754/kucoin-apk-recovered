package p802ym;

import com.kubi.router.core.Router;
import com.kubi.sdk.web.util.C24335h;
import e10.InterfaceC37044c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import x00.C45980e;

/* JADX INFO: renamed from: ym.c */
/* JADX INFO: compiled from: WebNativePathInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kweb/router/WebNativePathInterceptor;", "Lcom/kubi/sdk/web/spi/IWebUrlInterceptor;", "<init>", "()V", "intercept", "", "urlInfo", "Lcom/kubi/sdk/web/config/WebUriInfo;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46548c implements InterfaceC37044c {
    @Override // e10.InterfaceC37044c
    /* JADX INFO: renamed from: a */
    public boolean mo65690a(@NotNull C45980e urlInfo) {
        Intrinsics.checkNotNullParameter(urlInfo, "urlInfo");
        String strM58888g = C24335h.f48569a.m58888g(urlInfo.getUrl(), "nativePath");
        if (strM58888g == null || strM58888g.length() == 0) {
            return false;
        }
        C44128b.m97266j("WebUrlMapper", strM58888g);
        Router.f46192a.m56184f(strM58888g).m4048k();
        return true;
    }
}
