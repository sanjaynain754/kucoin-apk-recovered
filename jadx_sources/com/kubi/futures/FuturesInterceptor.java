package com.kubi.futures;

import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.blankj.utilcode.util.C5258a;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashSet;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p830zf.InterfaceC46814o;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/FuturesInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "sets", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "openRnFuturesKline", "proceedOpenFutures", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesInterceptor.kt\ncom/kubi/futures/FuturesInterceptor\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,103:1\n17#2,2:104\n*S KotlinDebug\n*F\n+ 1 FuturesInterceptor.kt\ncom/kubi/futures/FuturesInterceptor\n*L\n47#1:104,2\n*E\n"})
public final class FuturesInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HashSet<String> f22523a;

    /* JADX INFO: renamed from: com.kubi.futures.FuturesInterceptor$a */
    /* JADX INFO: compiled from: FuturesInterceptor.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/FuturesInterceptor$proceedOpenFutures$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onStop", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12821a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41775x1 f22524b;

        public C12821a(InterfaceC41775x1 interfaceC41775x1) {
            this.f22524b = interfaceC41775x1;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterfaceC41775x1.a.m91377a(this.f22524b, null, 1, null);
        }
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46814o.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46814o) objM56186h).m103145a(chain, this.f22523a);
        }
        Uri uri = chain.getPostcard().getUri();
        String str = C27041f.m66668h(uri.getHost()) + C27041f.m66668h(uri.getPath());
        if (Intrinsics.areEqual(str, "open/contract")) {
            return m24432c(chain);
        }
        return Intrinsics.areEqual(str, "kumex/market") ? m24431a(chain) : chain.mo103413a(chain.getPostcard());
    }

    public FuturesInterceptor() {
        HashSet<String> hashSet = new HashSet<>();
        this.f22523a = hashSet;
        hashSet.add("kumex/trade");
        hashSet.add("open/contract");
        hashSet.add("kumex/welfare");
        hashSet.add("kumex/settlement/record");
        hashSet.add("kumex/contract/record");
        hashSet.add("kumex/market");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24431a(InterfaceC46935a interfaceC46935a) {
        C4400a postcard = interfaceC46935a.getPostcard();
        if (IQuoteFacadeService.m50675t(IQuoteFacadeService.f41383a.get(), postcard.getBundle().getString("symbol"), SearchCategory$Companion.FUTURES, null, 4, null)) {
            return true;
        }
        return interfaceC46935a.mo103413a(postcard);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24432c(InterfaceC46935a interfaceC46935a) {
        BaseActivity baseActivity;
        C4400a postcard = interfaceC46935a.getPostcard();
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof BaseActivity) {
            baseActivity = (BaseActivity) activityM6125h;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            baseActivity.getLifecycle().addObserver(new C12821a(C41696j.m91104d(C41713n0.m91126b(), null, null, new FuturesInterceptor$proceedOpenFutures$job$1(baseActivity, postcard, interfaceC46935a, null), 3, null)));
            return true;
        }
        return true;
    }
}
