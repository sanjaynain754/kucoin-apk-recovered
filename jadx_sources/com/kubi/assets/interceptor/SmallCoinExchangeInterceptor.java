package com.kubi.assets.interceptor;

import androidx.fragment.app.FragmentActivity;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.utils.extensions.C27041f;
import il.C38661c;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.interceptor.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SmallCoinExchangeInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/interceptor/SmallCoinExchangeInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSmallCoinExchangeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallCoinExchangeInterceptor.kt\ncom/kubi/assets/interceptor/SmallCoinExchangeInterceptor\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,66:1\n19#2,2:67\n19#2,2:69\n*S KotlinDebug\n*F\n+ 1 SmallCoinExchangeInterceptor.kt\ncom/kubi/assets/interceptor/SmallCoinExchangeInterceptor\n*L\n36#1:67,2\n44#1:69,2\n*E\n"})
public final class SmallCoinExchangeInterceptor extends C38661c {
    /* JADX INFO: renamed from: g */
    public static final Unit m17456g(final String str, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.interceptor.u
            @Override // java.lang.Runnable
            public final void run() {
                SmallCoinExchangeInterceptor.m17457h(str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m17457h(String str) {
        AssetsHelper.f18684a.m19171p(str);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17458i(final String str, final FragmentActivity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.interceptor.t
            @Override // java.lang.Runnable
            public final void run() {
                SmallCoinExchangeInterceptor.m17459j(ctx, str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m17459j(FragmentActivity fragmentActivity, String str) {
        IAssetsCenterService.f16464a.get().mo15348n(fragmentActivity, C10245w.m17461b(str));
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!AssetsDepend.f18689a.m19189j().c()) {
            return super.mo4304b(chain);
        }
        final String strM66668h = C27041f.m66668h(chain.getPostcard().getBundle().getString("accountType"));
        if (AssetRemoteConfig.f18903a.m19576s()) {
            C42899b.m94073c(new Function1() { // from class: com.kubi.assets.interceptor.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SmallCoinExchangeInterceptor.m17456g(strM66668h, (FragmentActivity) obj);
                }
            });
            return true;
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.interceptor.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmallCoinExchangeInterceptor.m17458i(strM66668h, (FragmentActivity) obj);
            }
        });
        return true;
    }
}
