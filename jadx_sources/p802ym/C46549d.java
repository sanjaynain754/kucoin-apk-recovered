package p802ym;

import com.kubi.monitor.TechnologyEvent;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27041f;
import e10.InterfaceC37044c;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x00.C45980e;

/* JADX INFO: renamed from: ym.d */
/* JADX INFO: compiled from: WebUrlMapperInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kweb/router/WebUrlMapperInterceptor;", "Lcom/kubi/sdk/web/spi/IWebUrlInterceptor;", "<init>", "()V", "intercept", "", "urlInfo", "Lcom/kubi/sdk/web/config/WebUriInfo;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebUrlMapperInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebUrlMapperInterceptor.kt\ncom/kubi/kweb/router/WebUrlMapperInterceptor\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,84:1\n71#2,4:85\n*S KotlinDebug\n*F\n+ 1 WebUrlMapperInterceptor.kt\ncom/kubi/kweb/router/WebUrlMapperInterceptor\n*L\n71#1:85,4\n*E\n"})
public final class C46549d implements InterfaceC37044c {
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    @Override // e10.InterfaceC37044c
    /* JADX INFO: renamed from: a */
    public boolean mo65690a(@NotNull C45980e urlInfo) {
        String str;
        Intrinsics.checkNotNullParameter(urlInfo, "urlInfo");
        if (urlInfo.m101437c("assets")) {
            str = "account/asset";
        } else if (urlInfo.m101437c("assets/bonus/rewards")) {
            str = "welfare/other";
        } else if (urlInfo.m101437c("assets/bonus/loans")) {
            str = "lever/target/lend";
        } else if (urlInfo.m101437c("assets/coin/*")) {
            str = "account/deposit?coin=" + C27041f.m66668h(urlInfo.m101435a(2));
        } else if (urlInfo.m101437c("assets/withdraw/*")) {
            str = "account/withdraw?coin=" + C27041f.m66668h(urlInfo.m101435a(2));
        } else if (urlInfo.m101437c("otc/buy/**")) {
            str = "otc?mode=0&type=0";
        } else if (urlInfo.m101437c("otc/sell/**")) {
            str = "otc?mode=1&type=0";
        } else if (urlInfo.m101437c("trade/*")) {
            String strM101435a = urlInfo.m101435a(1);
            if (strM101435a == null) {
                str = "kumex/trade";
            } else {
                str = "kumex/trade?symbol=" + strM101435a;
            }
        } else if (urlInfo.m101437c("futures/trade/*")) {
            String strM101435a2 = urlInfo.m101435a(2);
            if (strM101435a2 == null || strM101435a2.length() == 0) {
                str = "kumex/trade";
            } else {
                str = "kumex/trade?symbol=" + strM101435a2;
            }
        } else {
            str = null;
        }
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "web_url_match");
        eventParametersBuilderAcquire.m42393d("path", str == null ? "" : str);
        String string = urlInfo.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        eventParametersBuilderAcquire.m42393d("url", string);
        TechnologyEvent.m42388d("kucoin_webview", eventParametersBuilderAcquire);
        if (str == null || str.length() == 0) {
            return false;
        }
        C43840a.m96550d("web handle to " + str, "kweb");
        Router.f46192a.m56184f(str).m4048k();
        return true;
    }
}
