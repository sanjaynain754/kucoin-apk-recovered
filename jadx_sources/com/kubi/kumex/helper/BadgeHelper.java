package com.kubi.kumex.helper;

import android.annotation.SuppressLint;
import android.view.View;
import com.kubi.assets.C11351z0;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.HashSet;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import zw.C46932c;
import zw.InterfaceC46930a;

/* JADX INFO: renamed from: com.kubi.kumex.helper.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BadgeHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\f\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/helper/BadgeHelper;", "", "<init>", "()V", "WELFARE_COUPONS_DOT", "", "PNL_ANALYZE_DOT", "set", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "checkMoreBadge", "", "fragment", "Lcom/kubi/kumex/trade/FuturesFragment;", "setMoreBadge", "isWelfareCouponsDot", "", "time", "", "isPnlAnalyzeDot", "hideWelfareCouponsDot", "Lcom/kubi/sdk/BaseFragment;", "hidePnlAnalyzeDot", "putDotKey", "key", "clearAndRefreshRedDot", "removeDotKey", "findExistRedDotView", "Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;", "isSupportBonus", "isSupportPnlAnalyze", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nBadgeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeHelper.kt\ncom/kubi/kumex/helper/BadgeHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,138:1\n84#2:139\n84#2:140\n75#2,2:141\n126#2,2:143\n*S KotlinDebug\n*F\n+ 1 BadgeHelper.kt\ncom/kubi/kumex/helper/BadgeHelper\n*L\n68#1:139\n90#1:140\n91#1:141,2\n96#1:143,2\n*E\n"})
public final class BadgeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BadgeHelper f29249a = new BadgeHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashSet<String> f29250b = new HashSet<>();

    /* JADX INFO: renamed from: p */
    public final boolean m33969p() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m33959g(FuturesWelfareComposeEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f29249a.m33972s(C27039d.m66652l(it.getLatestRewardTime()));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m33960h(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m33961i(FuturesFragment futuresFragment, FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        f29249a.m33975v(futuresFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m33963l(FuturesFragment futuresFragment) {
        f29250b.clear();
        BadgeHelper badgeHelper = f29249a;
        QBadgeView qBadgeViewM33966m = badgeHelper.m33966m(futuresFragment);
        if (qBadgeViewM33966m != null) {
            qBadgeViewM33966m.mo55424a(false);
        }
        badgeHelper.m33964f(futuresFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m33964f(@NotNull final FuturesFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (m33970q()) {
            Observable<FuturesWelfareComposeEntity> observableObserveOn = RepositoryServiceLocator.f19236a.m20292k().mo100575v().observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.kumex.helper.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BadgeHelper.m33959g((FuturesWelfareComposeEntity) obj));
                }
            };
            Observable<FuturesWelfareComposeEntity> observableFilter = observableObserveOn.filter(new Predicate() { // from class: com.kubi.kumex.helper.b
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return BadgeHelper.m33960h(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.kumex.helper.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BadgeHelper.m33961i(fragment, (FuturesWelfareComposeEntity) obj);
                }
            };
            Disposable disposableSubscribe = observableFilter.subscribe(new Consumer() { // from class: com.kubi.kumex.helper.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BadgeHelper.m33962j(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, fragment.getDestroyDisposable());
            if (m33971r() && m33969p()) {
                m33975v(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m33965k(@NotNull final FuturesFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kumex.helper.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BadgeHelper.m33963l(fragment);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final QBadgeView m33966m(BaseFragment baseFragment) {
        View viewFindViewById = baseFragment.findViewById(R$id.more);
        Object tag = viewFindViewById != null ? viewFindViewById.getTag(R$id.kumex_more) : null;
        if (tag instanceof QBadgeView) {
            return (QBadgeView) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m33967n(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C46392a.m102328k(C46894j.f104736a.m103266e0(), false);
        m33974u(fragment, "pnl_analyze");
    }

    /* JADX INFO: renamed from: o */
    public final void m33968o(@NotNull BaseFragment fragment, long j11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C46894j c46894j = C46894j.f104736a;
        if (j11 > C46392a.m102324f(c46894j.m103261Z(), 0L)) {
            C46392a.m102330m(c46894j.m103261Z(), j11);
        }
        m33974u(fragment, "welfare_coupons");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m33970q() {
        return BrokerConfig.f19211a.m20201d().mo20231S0().contains("bonus");
    }

    /* JADX INFO: renamed from: r */
    public final boolean m33971r() {
        return BrokerConfig.f19211a.m20201d().mo20231S0().contains("pnlAnalyze") && C11351z0.m20196k();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m33972s(long j11) {
        if (j11 <= C46392a.m102324f(C46894j.f104736a.m103261Z(), 0L) || !BrokerConfig.f19211a.m20201d().mo20229O()) {
            return false;
        }
        m33973t("welfare_coupons");
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m33973t(String str) {
        f29250b.add(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m33974u(BaseFragment baseFragment, String str) {
        QBadgeView qBadgeViewM33966m;
        HashSet<String> hashSet = f29250b;
        hashSet.remove(str);
        if (!hashSet.isEmpty() || (qBadgeViewM33966m = m33966m(baseFragment)) == null) {
            return;
        }
        qBadgeViewM33966m.mo55424a(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m33975v(FuturesFragment futuresFragment) {
        InterfaceC46930a interfaceC46930a;
        View viewFindViewById = futuresFragment.findViewById(R$id.more);
        if (viewFindViewById == null) {
            return;
        }
        InterfaceC46930a interfaceC46930aM33966m = m33966m(futuresFragment);
        if (interfaceC46930aM33966m == null) {
            interfaceC46930a = interfaceC46930aM33966m;
            InterfaceC46930a interfaceC46930aMo55431h = C46932c.m103404a(new QBadgeView(futuresFragment.getContext())).m55421D(8.0f, true).mo55431h(8388661);
            interfaceC46930aMo55431h.mo55429f(viewFindViewById);
            interfaceC46930a = interfaceC46930aMo55431h;
        }
        interfaceC46930a = interfaceC46930aM33966m;
        viewFindViewById.setTag(R$id.kumex_more, interfaceC46930a);
        interfaceC46930a.mo55425b(-1);
    }

    /* JADX INFO: renamed from: j */
    public static final void m33962j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
