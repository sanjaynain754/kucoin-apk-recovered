package b60;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.kubi.assets.AssetRnBundle;
import com.kubi.assets.AssetRnRouteConfig;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24271s1;
import com.kubi.transfer.TransferFragment;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import il.C38661c;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: b60.b */
/* JADX INFO: compiled from: TransferRouteInterceptor.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/transfer/interceptor/TransferRouteInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferRouteInterceptor.kt\ncom/kubi/transfer/interceptor/TransferRouteInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class C4499b extends C38661c {
    /* JADX INFO: renamed from: d */
    public static final Unit m4303d(String str, String str2, String str3, String str4, String str5, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Bundle bundleM66717a = new C27051h().m66724h("coin", str).m66724h(TypedValues.TransitionType.S_TO, str2).m66724h("from", str3).m66724h("to_symbol", str4).m66717a();
        if (str5 != null) {
            Intrinsics.checkNotNull(bundleM66717a);
            C24271s1.m58529a(bundleM66717a, str5);
        }
        Unit unit = Unit.INSTANCE;
        companion.launch(it, TransferFragment.class, bundleM66717a);
        return Unit.INSTANCE;
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!IUserService.a.get().c()) {
            return super.mo4304b(chain);
        }
        Bundle bundle = chain.getPostcard().getBundle();
        final String strM66668h = C27041f.m66668h(bundle.getString("spm"));
        final String strM66668h2 = C27041f.m66668h(RouteExKt.m56284y(bundle, "coin"));
        final String strM66668h3 = C27041f.m66668h(RouteExKt.m56284y(bundle, TypedValues.TransitionType.S_TO));
        final String strM66668h4 = C27041f.m66668h(RouteExKt.m56284y(bundle, "from"));
        final String strM66668h5 = C27041f.m66668h(RouteExKt.m56284y(bundle, "to_symbol"));
        if (!C4500c.m4307c()) {
            C42899b.m94073c(new Function1() { // from class: b60.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4499b.m4303d(strM66668h2, strM66668h3, strM66668h4, strM66668h5, strM66668h, (FragmentActivity) obj);
                }
            });
            return true;
        }
        AssetRnBundle assetRnBundleM20185b = AssetRnRouteConfig.f19197a.m20185b(C4500c.m4306b());
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, assetRnBundleM20185b.getBiz()).m4038a("entry", "main").m4038a(Constants.COMPONENT, assetRnBundleM20185b.getComponent()).m4038a("needLogin", Boolean.TRUE).m4038a("route", "AssetsTransferPage?from=" + strM66668h4 + "&to=" + strM66668h3 + "&coin=" + strM66668h2 + "&symbol=" + strM66668h5 + "&spm=" + strM66668h).m4048k();
        return true;
    }
}
