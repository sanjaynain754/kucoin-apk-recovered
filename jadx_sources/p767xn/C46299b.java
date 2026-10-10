package p767xn;

import android.os.Bundle;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.lite.R$string;
import com.kubi.lite.api.ILiteService;
import com.kubi.lite.tab.ui.LiteMainActivity;
import com.kubi.p110rn.Constants;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.mode.AppMode;
import com.kubi.utils.ToastCompat;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: xn.b */
/* JADX INFO: compiled from: LiteRouteInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/lite/interceptor/LiteRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "isLiteHome", "postcard", "Lcom/kubi/router/model/Postcard;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46299b implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (!m102052a(postcard)) {
            return chain.mo103413a(postcard);
        }
        ILiteService.Companion companion = ILiteService.f32003a;
        if (!companion.get().mo37530a()) {
            ToastCompat.m66437C(R$string.kc_lite_not_support);
            return false;
        }
        Bundle bundle = postcard.getBundle();
        bundle.putString("flutterInitialRoute", C23767n.m56884h(postcard, false, 1, null));
        C44128b.m97266j("LiteTag", "postcard.toFlutterRoute()=" + C23767n.m56884h(postcard, false, 1, null));
        AppMode.INSTANCE.updateCurrentMode(AppMode.Lite);
        companion.get().mo37532c();
        LiteMainActivity.Companion.launch$default(LiteMainActivity.f32101w, bundle, false, true, 2, null);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102052a(C4400a c4400a) {
        String strM56216G = RouteExKt.m56216G(c4400a.getUri());
        if (Intrinsics.areEqual(strM56216G, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER)) {
            String queryParameter = c4400a.getUri().getQueryParameter("route");
            if (queryParameter == null || !StringsKt.startsWith$default(queryParameter, "lite/home", false, 2, (Object) null)) {
                return false;
            }
            return true;
        }
        if (!Intrinsics.areEqual(strM56216G, "krn/router")) {
            return false;
        }
        return Intrinsics.areEqual(c4400a.getUri().getQueryParameter(Constants.BIZ), "litehome");
    }
}
