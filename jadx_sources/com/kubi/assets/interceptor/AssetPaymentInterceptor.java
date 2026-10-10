package com.kubi.assets.interceptor;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetRnBundle;
import com.kubi.assets.AssetRnRouteConfig;
import com.kubi.assets.dialog.payment.AssetMultiPaymentDialog;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27041f;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import il.C38661c;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.interceptor.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetPaymentInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/interceptor/AssetPaymentInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "openRnFullScreen", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetPaymentInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetPaymentInterceptor.kt\ncom/kubi/assets/interceptor/AssetPaymentInterceptor\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,64:1\n19#2,2:65\n*S KotlinDebug\n*F\n+ 1 AssetPaymentInterceptor.kt\ncom/kubi/assets/interceptor/AssetPaymentInterceptor\n*L\n32#1:65,2\n*E\n"})
public final class AssetPaymentInterceptor extends C38661c {
    /* JADX INFO: renamed from: e */
    public static final Unit m17443e(final AssetPaymentInterceptor assetPaymentInterceptor, final InterfaceC46935a interfaceC46935a, final FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.interceptor.e
            @Override // java.lang.Runnable
            public final void run() {
                AssetPaymentInterceptor.m17444f(this.f17795b, interfaceC46935a, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m17444f(AssetPaymentInterceptor assetPaymentInterceptor, InterfaceC46935a interfaceC46935a, FragmentActivity fragmentActivity) {
        if (AssetRemoteConfig.f18903a.m19572o()) {
            assetPaymentInterceptor.m17445g(interfaceC46935a);
            return;
        }
        AssetMultiPaymentDialog assetMultiPaymentDialog = new AssetMultiPaymentDialog();
        assetMultiPaymentDialog.setArguments(interfaceC46935a.getPostcard().getBundle());
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        assetMultiPaymentDialog.show(supportFragmentManager, "");
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!AssetsDepend.f18689a.m19189j().c()) {
            return super.mo4304b(chain);
        }
        if (AssetsHelper.f18684a.m19169m()) {
            return true;
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.interceptor.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetPaymentInterceptor.m17443e(this.f17793b, chain, (FragmentActivity) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m17445g(InterfaceC46935a interfaceC46935a) {
        Bundle bundle = interfaceC46935a.getPostcard().getBundle();
        String strM66669i = C27041f.m66669i(RouteExKt.m56285z(bundle, "type", FastQuoteModel.PAY_RECHARGE), FastQuoteModel.PAY_RECHARGE);
        String strM66668h = C27041f.m66668h(bundle.getString(DropFrameTable.COLUMN_SCENE));
        String strM66668h2 = C27041f.m66668h(bundle.getString("spm"));
        AssetRnBundle assetRnBundleM20185b = AssetRnRouteConfig.f19197a.m20185b(AssetRemoteConfig.f18903a.m19573p());
        C4400a c4400aM4038a = Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, assetRnBundleM20185b.getBiz()).m4038a("entry", "main").m4038a(Constants.COMPONENT, assetRnBundleM20185b.getComponent());
        Boolean bool = Boolean.TRUE;
        c4400aM4038a.m4038a("needLogin", bool).m4038a("transparent", bool).m4038a("route", "AssetsPaymentMethodFullPage?business=" + strM66669i + "&scene=" + strM66668h + "&spmId=" + strM66668h2).m4048k();
    }
}
