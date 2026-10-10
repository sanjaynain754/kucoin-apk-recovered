package com.kubi.home.main.refresh;

import android.content.Context;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.C11352b;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$anim;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.PullRefreshConfigEntity;
import com.kubi.home.exception.HomeException;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.wrapper.RefreshHeaderWrapper;
import dj.C36719d;
import fj.C37529l;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import java.lang.reflect.Type;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p294gz.C38057a;
import p569qq.C43846g;
import p569qq.C43852m;
import p830zf.InterfaceC46820r;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import y70.C46392a;

/* JADX INFO: compiled from: HomePullRefresh.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0012\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u0013J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/home/main/refresh/HomePullRefresh;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "homeNavigation", "Landroid/view/ViewGroup;", "refreshLayout", "Lcom/kubi/resources/widget/KuCoinRefreshLayout;", "<init>", "(Lcom/kubi/sdk/BaseFragment;Landroid/view/ViewGroup;Lcom/kubi/resources/widget/KuCoinRefreshLayout;)V", "mRefreshKernel", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "adConfig", "Lcom/kubi/home/entity/PullRefreshConfigEntity;", "refreshBinding", "Lcom/kubi/home/databinding/HomeLayoutPullRefreshBinding;", "onTriggerTwoLevel", "", "onCreate", "", "fetchTwoLevelConfig", "handleOnMoving", "percent", "", "isDragging", "handleStateChanged", "newState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "openTwoLevelRoute", "vibrate", "milliseconds", "", "safeCloseHeader", "isAutoShow", "checkAutoShowTwoLevel", "enableBizControl", "enableRemoteConfig", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomePullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePullRefresh.kt\ncom/kubi/home/main/refresh/HomePullRefresh\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,304:1\n47#2,2:305\n47#2,2:307\n17#3,2:309\n35#4,4:311\n39#4:317\n44#5,2:315\n126#6,2:318\n*S KotlinDebug\n*F\n+ 1 HomePullRefresh.kt\ncom/kubi/home/main/refresh/HomePullRefresh\n*L\n120#1:305,2\n244#1:307,2\n284#1:309,2\n294#1:311,4\n294#1:317\n294#1:315,2\n279#1:318,2\n*E\n"})
public final class HomePullRefresh {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f25791i = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseFragment f25792a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ViewGroup f25793b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KuCoinRefreshLayout f25794c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC38161e f25795d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public PullRefreshConfigEntity f25796e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public C37529l f25797f;

    /* JADX INFO: renamed from: g */
    public boolean f25798g;

    /* JADX INFO: renamed from: h */
    public boolean f25799h;

    /* JADX INFO: compiled from: HomePullRefresh.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/main/refresh/HomePullRefresh$Companion;", "", "<init>", "()V", "DURATION_DELAY_SHOW_MAX_TIME", "", "DURATION_AUTO_SHOW_TIME", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.refresh.HomePullRefresh$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C14639b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: t */
    public static final void m29427t(HomePullRefresh homePullRefresh) {
        homePullRefresh.f25799h = false;
        homePullRefresh.m29431G();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m29428y(float f11, HomePullRefresh homePullRefresh, boolean z11) {
        InterfaceC38161e interfaceC38161e;
        homePullRefresh.f25793b.setAlpha(1 - RangesKt.coerceAtMost(2 * f11, 1.0f));
        if (z11) {
            if (f11 >= 1.3f && homePullRefresh.f25796e != null && homePullRefresh.m29434u()) {
                InterfaceC38161e interfaceC38161e2 = homePullRefresh.f25795d;
                if (interfaceC38161e2 != null) {
                    interfaceC38161e2.mo68574g(RefreshState.ReleaseToTwoLevel);
                }
                if (!homePullRefresh.f25798g) {
                    homePullRefresh.f25798g = true;
                    m29407K(homePullRefresh, 0L, 1, null);
                }
            } else if (f11 >= 1.0f && (interfaceC38161e = homePullRefresh.f25795d) != null) {
                interfaceC38161e.mo68574g(RefreshState.ReleaseToRefresh);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.kubi.home.main.refresh.HomePullRefresh$a */
    /* JADX INFO: compiled from: HomePullRefresh.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C14638a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.ReleaseToRefresh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RefreshState.ReleaseToTwoLevel.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RefreshState.TwoLevelReleased.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HomePullRefresh(@NotNull BaseFragment fragment, @NotNull ViewGroup homeNavigation, @NotNull KuCoinRefreshLayout refreshLayout) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(homeNavigation, "homeNavigation");
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        this.f25792a = fragment;
        this.f25793b = homeNavigation;
        this.f25794c = refreshLayout;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m29401A(HomePullRefresh homePullRefresh, RefreshState refreshState) {
        C37529l c37529l = homePullRefresh.f25797f;
        if (c37529l == null) {
            return Unit.INSTANCE;
        }
        switch (C14638a.$EnumSwitchMapping$0[refreshState.ordinal()]) {
            case 1:
            case 2:
                homePullRefresh.f25798g = false;
                BaseTextView tvTips = c37529l.f83364f;
                Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
                C27046k.m66685H(tvTips);
                c37529l.f83364f.setText(R$string.home_pull_to_refresh);
                ImageView ivArrow = c37529l.f83360b;
                Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                C27046k.m66700o(ivArrow);
                AppCompatImageView loading = c37529l.f83363e;
                Intrinsics.checkNotNullExpressionValue(loading, "loading");
                ViewExtKt.m66577h(loading);
                ImageView ivIcon = c37529l.f83361c;
                Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
                C27046k.m66703r(ivIcon);
                break;
            case 3:
                homePullRefresh.f25798g = false;
                BaseTextView tvTips2 = c37529l.f83364f;
                Intrinsics.checkNotNullExpressionValue(tvTips2, "tvTips");
                C27046k.m66685H(tvTips2);
                c37529l.f83364f.setText(R$string.home_release_to_refresh);
                ImageView ivArrow2 = c37529l.f83360b;
                Intrinsics.checkNotNullExpressionValue(ivArrow2, "ivArrow");
                C27046k.m66700o(ivArrow2);
                AppCompatImageView loading2 = c37529l.f83363e;
                Intrinsics.checkNotNullExpressionValue(loading2, "loading");
                C27046k.m66685H(loading2);
                C11352b.m20197a(c37529l.f83363e);
                ImageView ivIcon2 = c37529l.f83361c;
                Intrinsics.checkNotNullExpressionValue(ivIcon2, "ivIcon");
                C27046k.m66703r(ivIcon2);
                homePullRefresh.m29432J(50L);
                break;
            case 4:
                BaseTextView tvTips3 = c37529l.f83364f;
                Intrinsics.checkNotNullExpressionValue(tvTips3, "tvTips");
                C27046k.m66703r(tvTips3);
                break;
            case 5:
                BaseTextView tvTips4 = c37529l.f83364f;
                Intrinsics.checkNotNullExpressionValue(tvTips4, "tvTips");
                C27046k.m66685H(tvTips4);
                BaseTextView baseTextView = c37529l.f83364f;
                PullRefreshConfigEntity pullRefreshConfigEntity = homePullRefresh.f25796e;
                String descText = pullRefreshConfigEntity != null ? pullRefreshConfigEntity.getDescText() : null;
                if (descText == null) {
                    descText = "";
                }
                baseTextView.setText(descText);
                ImageView ivArrow3 = c37529l.f83360b;
                Intrinsics.checkNotNullExpressionValue(ivArrow3, "ivArrow");
                C27046k.m66685H(ivArrow3);
                AppCompatImageView loading3 = c37529l.f83363e;
                Intrinsics.checkNotNullExpressionValue(loading3, "loading");
                ViewExtKt.m66577h(loading3);
                ImageView ivIcon3 = c37529l.f83361c;
                Intrinsics.checkNotNullExpressionValue(ivIcon3, "ivIcon");
                C27046k.m66685H(ivIcon3);
                break;
            case 6:
                InterfaceC38161e interfaceC38161e = homePullRefresh.f25795d;
                if (interfaceC38161e != null) {
                    interfaceC38161e.mo68572e(false);
                }
                homePullRefresh.m29430E();
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m29402C(InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C12572a.m23695d("com.kubi.home.event.HomeEvent:pullRefresh", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m29403D(HomePullRefresh homePullRefresh) {
        homePullRefresh.f25794c.setEnableRefresh(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m29405H(HomePullRefresh homePullRefresh) {
        if (!homePullRefresh.f25799h) {
            final KuCoinRefreshLayout kuCoinRefreshLayout = homePullRefresh.f25794c;
            C22912t.m54416n(kuCoinRefreshLayout, new Runnable() { // from class: com.kubi.home.main.refresh.g
                @Override // java.lang.Runnable
                public final void run() {
                    HomePullRefresh.m29406I(kuCoinRefreshLayout);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m29407K(HomePullRefresh homePullRefresh, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 100;
        }
        homePullRefresh.m29432J(j11);
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m29408L(HomePullRefresh homePullRefresh, long j11) {
        Context context = homePullRefresh.f25792a.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        Object systemService = context.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(j11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m29430E() {
        PullRefreshConfigEntity pullRefreshConfigEntity = this.f25796e;
        String jumpUrl = pullRefreshConfigEntity != null ? pullRefreshConfigEntity.getJumpUrl() : null;
        if (jumpUrl == null || jumpUrl.length() == 0) {
            m29431G();
            return false;
        }
        try {
            boolean zM4048k = Router.f46192a.m56184f(jumpUrl).m4038a("spm", C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "pullDownBiz", "1")).m4048k();
            if (!zM4048k) {
                m29431G();
                return zM4048k;
            }
            FragmentActivity activity = this.f25792a.getActivity();
            if (activity != null) {
                activity.overridePendingTransition(R$anim.home_two_level_in, R$anim.home_fake_no);
            }
            C22912t.m54417o(this.f25794c, new Runnable() { // from class: com.kubi.home.main.refresh.j
                @Override // java.lang.Runnable
                public final void run() {
                    HomePullRefresh.m29404F(this.f25813b);
                }
            }, 500L);
            C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, "pullDownBiz", null, null, 12, null);
            return zM4048k;
        } catch (Throwable th2) {
            m29431G();
            C43846g.m96568c(new HomeException(th2, "HomePullRefresh", false, null, 8, null), null, 2, null);
            return false;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m29431G() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomePullRefresh.m29405H(this.f25803b);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m29432J(final long j11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomePullRefresh.m29408L(this.f25810b, j11);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m29433r() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomePullRefresh.m29426s(this.f25804b);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final boolean m29434u() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46820r.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46820r) objM56186h).m103148a();
        }
        return C24129b.m58030b(SiteVisibleConfigKey.KucoinPay) && C38057a.f85671a.m85928a(C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "pullDownBiz", null, 4, null), true);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m29435v() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C14639b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("home_pulldown", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: x */
    public final void m29437x(final float f11, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomePullRefresh.m29428y(f11, this, z11);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m29438z(final RefreshState refreshState) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomePullRefresh.m29401A(this.f25801b, refreshState);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static final void m29404F(HomePullRefresh homePullRefresh) {
        homePullRefresh.m29431G();
    }

    /* JADX INFO: renamed from: I */
    public static final void m29406I(KuCoinRefreshLayout kuCoinRefreshLayout) {
        kuCoinRefreshLayout.closeHeaderOrFooter();
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m29426s(final HomePullRefresh homePullRefresh) {
        if (homePullRefresh.m29434u() && homePullRefresh.m29435v()) {
            homePullRefresh.f25799h = true;
            InterfaceC38161e interfaceC38161e = homePullRefresh.f25795d;
            if (interfaceC38161e != null) {
                interfaceC38161e.mo68574g(RefreshState.ReleaseToTwoLevel);
            }
            InterfaceC38161e interfaceC38161e2 = homePullRefresh.f25795d;
            if (interfaceC38161e2 != null) {
                interfaceC38161e2.mo68568a(C27040e.m66658b(150));
            }
            C22912t.m54417o(homePullRefresh.f25794c, new Runnable() { // from class: com.kubi.home.main.refresh.i
                @Override // java.lang.Runnable
                public final void run() {
                    HomePullRefresh.m29427t(this.f25812b);
                }
            }, 1000L);
            C46392a.m102328k(C36719d.f79632a.m82268m(), true);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m29429B() {
        try {
            if (!m29435v()) {
                this.f25794c.setEnableRefresh(false);
                return;
            }
            this.f25797f = C37529l.m84521c(LayoutInflater.from(this.f25794c.getContext()), this.f25794c, false);
            KuCoinRefreshLayout kuCoinRefreshLayout = this.f25794c;
            kuCoinRefreshLayout.setEnableRefresh(true);
            kuCoinRefreshLayout.setDragRate(0.9f);
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.home.main.refresh.d
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    HomePullRefresh.m29402C(interfaceC38162f);
                }
            });
            C37529l c37529l = this.f25797f;
            Intrinsics.checkNotNull(c37529l);
            final ConstraintLayout root = c37529l.getRoot();
            kuCoinRefreshLayout.setRefreshHeader(new RefreshHeaderWrapper(root) { // from class: com.kubi.home.main.refresh.HomePullRefresh$onCreate$1$2
                @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, hb0.InterfaceC38157a
                public void onInitialized(InterfaceC38161e kernel, int i11, int i12) {
                    Intrinsics.checkNotNullParameter(kernel, "kernel");
                    super.onInitialized(kernel, i11, i12);
                    this.f25800e.f25795d = kernel;
                }

                @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, jb0.InterfaceC40375i
                public void onStateChanged(InterfaceC38162f refreshLayout, RefreshState oldState, RefreshState newState) {
                    Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
                    Intrinsics.checkNotNullParameter(oldState, "oldState");
                    Intrinsics.checkNotNullParameter(newState, "newState");
                    super.onStateChanged(refreshLayout, oldState, newState);
                    this.f25800e.m29438z(newState);
                    C4988a.m5287b("[HomePullRefresh]onStateChanged=>oldState=" + oldState.name() + ",newState=" + newState.name(), null, 1, null);
                }

                @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, hb0.InterfaceC38157a
                public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
                    super.onMoving(isDragging, percent, offset, height, maxDragHeight);
                    this.f25800e.m29437x(percent, isDragging);
                    C4988a.m5287b("[HomePullRefresh]onMoving=>isDragging=" + isDragging + ",percent=" + percent, null, 1, null);
                }
            });
        } catch (Throwable th2) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.refresh.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomePullRefresh.m29403D(this.f25805b);
                }
            });
            C43846g.m96568c(new HomeException(th2, "HomePullRefresh", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m29436w() {
        if (m29434u() && m29435v()) {
            LifecycleOwnerKt.getLifecycleScope(this.f25792a).launchWhenStarted(new HomePullRefresh$fetchTwoLevelConfig$1(this, null));
        }
    }
}
