package p437lp;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.margin.exception.MarginMessage;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p346ip.C40158c;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: lp.b */
/* JADX INFO: compiled from: RouterMarginInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/margin/router/RouterMarginInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "upgradeTables", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouterMarginInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterMarginInterceptor.kt\ncom/kubi/margin/router/RouterMarginInterceptor\n+ 2 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n*L\n1#1,121:1\n48#2,2:122\n48#2,2:124\n*S KotlinDebug\n*F\n+ 1 RouterMarginInterceptor.kt\ncom/kubi/margin/router/RouterMarginInterceptor\n*L\n94#1:122,2\n98#1:124,2\n*E\n"})
public final class C42291b implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HashMap<String, String> f93781a;

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        String str = "1";
        if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "lever/borrow/record/payed")) {
            Bundle bundle = postcard.getBundle();
            String string = postcard.getBundle().getString("type");
            bundle.putString("positionType", (string != null && string.hashCode() == 49 && string.equals("1")) ? "isolated" : "cross");
        }
        if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "margin/kline")) {
            Bundle bundle2 = postcard.getBundle();
            String string2 = bundle2.getString("tradeType");
            if (string2 == null || string2.length() == 0) {
                String string3 = bundle2.getString("positionType");
                if (string3 != null && string3.hashCode() == 575780121 && string3.equals("isolated")) {
                    str = "2";
                }
            } else {
                str = string2;
            }
            bundle2.putString("tradeType", str);
        }
        if (this.f93781a.containsKey(RouteExKt.m56216G(postcard.getUri()))) {
            Uri uri = Uri.parse(postcard.getUri().getScheme() + "://" + this.f93781a.get(RouteExKt.m56216G(postcard.getUri())));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            postcard = new C4400a(uri, postcard.getBundle());
        }
        if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "margin/orders")) {
            Object objM56239b0 = RouteExKt.m56239b0(postcard.getBundle(), "activity");
            if (objM56239b0 == null) {
                objM56239b0 = BaseFragmentActivity.class;
            }
            postcard = postcard.m4038a("activity", objM56239b0);
        }
        String strM56284y = RouteExKt.m56284y(postcard.getBundle(), "trade_type");
        if (strM56284y != null) {
            C43846g.m96568c(new MarginMessage("trade_type发现&" + postcard.getUri(), "RouteProtocolInterceptor", false, 4, null), null, 2, null);
            postcard.getBundle().putString("tradeType", strM56284y);
        }
        String strM56284y2 = RouteExKt.m56284y(postcard.getBundle(), "from_symbol");
        if (strM56284y2 != null) {
            C43846g.m96568c(new MarginMessage("from_symbol发现&" + postcard.getUri(), "RouteProtocolInterceptor", false, 4, null), null, 2, null);
            postcard.getBundle().putString("fromSymbol", strM56284y2);
        }
        if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "margin/kline")) {
            String string4 = postcard.getBundle().getString("tradeType");
            Integer intOrNull = string4 != null ? StringsKt.toIntOrNull(string4) : null;
            if (IQuoteFacadeService.f41383a.get().mo50699b(postcard.getBundle().getString("symbol"), ViewProps.MARGIN, (intOrNull != null && intOrNull.intValue() == 2) ? "MARGIN_ISOLATED_TRADE" : "MARGIN_TRADE")) {
                return true;
            }
        }
        return new C40158c().mo4304b(chain);
    }

    public C42291b() {
        HashMap<String, String> map = new HashMap<>();
        map.put("lever/borrow/record/payed", "margin/orders");
        map.put("lever/borrow", "lever/borrow-repay");
        this.f93781a = map;
    }
}
