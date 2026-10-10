package com.kubi.kumex.market.tradingArea.child;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.RecommendFragment;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.Log;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import dm.C36789k1;
import fm.C37570e;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavoriteDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0014J\u001e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014J\b\u0010\u0013\u001a\u00020\nH\u0004J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/child/DrawerListFragment;", "<init>", "()V", "addTime", "", "removeTime", "showLoading", "", "initObserver", "", "toDisplayList", "", "Lcom/kubi/kumex/market/ContractObject;", "lists", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "showEmptyView", "showContent", "showLogin", "showRecommend", "addDebounce", "removeDebounce", "getRecommendFragment", "Landroidx/fragment/app/Fragment;", "needShowLoading", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavoriteDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n774#2:221\n865#2,2:222\n1869#2,2:224\n1869#2,2:226\n2756#2:228\n1#3:229\n*S KotlinDebug\n*F\n+ 1 FavoriteDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment\n*L\n55#1:221\n55#1:222,2\n58#1:224,2\n63#1:226,2\n69#1:228\n69#1:229\n*E\n"})
public class FavoriteDrawerFragment extends DrawerListFragment {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f29517i0 = new Companion(null);

    /* JADX INFO: renamed from: f0 */
    public long f29518f0;

    /* JADX INFO: renamed from: g0 */
    public long f29519g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f29520h0 = true;

    /* JADX INFO: compiled from: FavoriteDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment;", "type", "", "tradingAreaName", "", "sortName", "sortType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ FavoriteDrawerFragment newInstance$default(Companion companion, int i11, String str, String str2, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            return companion.newInstance(i11, str, str2, i12);
        }

        @NotNull
        public final FavoriteDrawerFragment newInstance(int type, @NotNull String tradingAreaName, @Nullable String sortName, int sortType) {
            Intrinsics.checkNotNullParameter(tradingAreaName, "tradingAreaName");
            FavoriteDrawerFragment favoriteDrawerFragment = new FavoriteDrawerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            bundle.putString("data", tradingAreaName);
            bundle.putString("data_2", sortName);
            bundle.putInt("data_3", sortType);
            favoriteDrawerFragment.setArguments(bundle);
            return favoriteDrawerFragment;
        }
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m34608w5(FavoriteDrawerFragment favoriteDrawerFragment, Boolean bool) {
        favoriteDrawerFragment.f29520h0 = true;
        if (favoriteDrawerFragment.isShowing()) {
            favoriteDrawerFragment.getVisibleDisposable().clear();
            favoriteDrawerFragment.m34543C4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A5 */
    public static final Unit m34596A5() {
        IUserService.O(KuMexDepend.f30378a.m35905g(), (Map) null, (IRedirect) null, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Boolean m34604s5(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(RepositoryServiceLocator.f19236a.m20288g().mo24976A().isEmpty());
    }

    /* JADX INFO: renamed from: t5 */
    public static final Boolean m34605t5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: u5 */
    public static final boolean m34606u5(Boolean last, Boolean current) {
        Intrinsics.checkNotNullParameter(last, "last");
        Intrinsics.checkNotNullParameter(current, "current");
        return Intrinsics.areEqual(last, current);
    }

    /* JADX INFO: renamed from: v5 */
    public static final boolean m34607v5(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    /* JADX INFO: renamed from: A4 */
    public void mo33764A4() {
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        log.m36617c(tag, "showEmptyView");
        getVisibleDisposable().clear();
        WrapperLoadingView wrapperLoadingViewM34555d4 = m34555d4();
        if (wrapperLoadingViewM34555d4 != null) {
            wrapperLoadingViewM34555d4.showContent();
        }
        if (KuMexDepend.f30378a.m35905g().c()) {
            m34610B5();
        } else {
            m34614z5();
        }
    }

    /* JADX INFO: renamed from: B5 */
    public final void m34610B5() {
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        log.m36617c(tag, "showRecommend start");
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 == null) {
            return;
        }
        LinearLayout flContainer = c36789k1M34590S4.f80386c;
        Intrinsics.checkNotNullExpressionValue(flContainer, "flContainer");
        int childCount = flContainer.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = flContainer.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            C27046k.m66700o(childAt);
        }
        int i12 = R$id.drawer_recommend_container;
        View viewFindViewById = flContainer.findViewById(i12);
        Fragment fragmentM34612r5 = m34612r5();
        if (viewFindViewById != null) {
            Log log2 = Log.f30813a;
            String tag2 = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
            log2.m36617c(tag2, "showRecommend recommendContainer not null");
            C27046k.m66685H(viewFindViewById);
            return;
        }
        Log log3 = Log.f30813a;
        String tag3 = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag3, "<get-TAG>(...)");
        log3.m36617c(tag3, "showRecommend recommendContainer null");
        flContainer.addView(getLayoutInflater().inflate(R$layout.bkumex_drawer_recommend, (ViewGroup) flContainer, false));
        if (fragmentM34612r5 != null) {
            String tag4 = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag4, "<get-TAG>(...)");
            log3.m36617c(tag4, "showRecommend recommendFragment not null");
            C27032f.m66622m(this, fragmentM34612r5);
        }
        if (m34611q5()) {
            String tag5 = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag5, "<get-TAG>(...)");
            log3.m36617c(tag5, "showRecommend recommendFragment add");
            getChildFragmentManager().beginTransaction().add(i12, RecommendFragment.Companion.newInstance$default(RecommendFragment.f29402Z, false, null, 2, null), "DrawerRecommendFragment").commitNowAllowingStateLoss();
        }
    }

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment, com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public List<? extends ContractObject> mo33759E4(@NotNull List<QuotesEntity> lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        ArrayList arrayList = new ArrayList();
        if (KuMexDepend.f30378a.m35905g().c()) {
            ArrayList arrayList2 = new ArrayList();
            for (QuotesEntity quotesEntity : lists) {
                arrayList.add(new ContractObject(0, quotesEntity));
                arrayList2.add(C27041f.m66668h(quotesEntity.getSymbol()));
            }
            RepositoryServiceLocator.f19236a.m20288g().mo24983J(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : lists) {
                QuotesEntity quotesEntity2 = (QuotesEntity) obj;
                SymbolConfig symbolConfigMo24996X = RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(quotesEntity2.getSymbol()));
                if (C27025c.m66566d(symbolConfigMo24996X != null ? C37570e.m84689d(symbolConfigMo24996X, C27041f.m66668h(quotesEntity2.getSymbol())) : null)) {
                    arrayList3.add(obj);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(new ContractObject(0, (QuotesEntity) it.next()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ContractObject) it2.next()).m34388i(getF29503V());
        }
        return arrayList;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    /* JADX INFO: renamed from: g4 */
    public boolean mo34558g4() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View viewFindViewById = null;
        if (KuMexDepend.f30378a.m35905g().c()) {
            C36789k1 c36789k1M34590S4 = m34590S4();
            if (c36789k1M34590S4 != null && (linearLayout2 = c36789k1M34590S4.f80386c) != null) {
                viewFindViewById = linearLayout2.findViewById(R$id.drawer_recommend_container);
            }
            return viewFindViewById == null;
        }
        C36789k1 c36789k1M34590S5 = m34590S4();
        if (c36789k1M34590S5 != null && (linearLayout = c36789k1M34590S5.f80386c) != null) {
            viewFindViewById = linearLayout.findViewById(R$id.drawer_login_container);
        }
        return viewFindViewById == null;
    }

    /* JADX INFO: renamed from: z5 */
    public final void m34614z5() {
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        log.m36617c(tag, "showLogin start");
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 == null) {
            return;
        }
        LinearLayout flContainer = c36789k1M34590S4.f80386c;
        Intrinsics.checkNotNullExpressionValue(flContainer, "flContainer");
        int childCount = flContainer.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = flContainer.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            C27046k.m66700o(childAt);
        }
        View viewFindViewById = flContainer.findViewById(R$id.drawer_login_container);
        if (viewFindViewById == null) {
            Log log2 = Log.f30813a;
            String tag2 = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
            log2.m36617c(tag2, "showLogin loginContainer null");
            View viewInflate = getLayoutInflater().inflate(R$layout.bkumex_drawer_login, (ViewGroup) flContainer, false);
            Intrinsics.checkNotNull(viewInflate);
            View viewFindViewById2 = viewInflate.findViewById(R$id.login);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavoriteDrawerFragment.m34596A5();
                }
            }, 1, null);
            flContainer.addView(viewInflate);
        } else {
            Log log3 = Log.f30813a;
            String tag3 = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag3, "<get-TAG>(...)");
            log3.m36617c(tag3, "showLogin loginContainer not null");
            C27046k.m66685H(viewFindViewById);
        }
        if (isShowing()) {
            getVisibleDisposable().clear();
        }
        Fragment fragmentM34612r5 = m34612r5();
        if (!m34613y5() || fragmentM34612r5 == null) {
            return;
        }
        Log log4 = Log.f30813a;
        String tag4 = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag4, "<get-TAG>(...)");
        log4.m36617c(tag4, "showLogin recommend not null");
        C27032f.m66622m(this, fragmentM34612r5);
    }

    /* JADX INFO: renamed from: x5 */
    public static final void m34609x5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment
    /* JADX INFO: renamed from: Y4 */
    public void mo34591Y4() {
        super.mo34591Y4();
        Flowable<Map<String, SymbolConfig>> flowableMo24988P = RepositoryServiceLocator.f19236a.m20288g().mo24988P();
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavoriteDrawerFragment.m34604s5((Map) obj);
            }
        };
        Flowable<R> map = flowableMo24988P.map(new Function() { // from class: com.kubi.kumex.market.tradingArea.child.h0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FavoriteDrawerFragment.m34605t5(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: com.kubi.kumex.market.tradingArea.child.i0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(FavoriteDrawerFragment.m34606u5((Boolean) obj, (Boolean) obj2));
            }
        };
        Flowable flowableObserveOn = map.distinctUntilChanged((BiPredicate<? super R, ? super R>) new BiPredicate() { // from class: com.kubi.kumex.market.tradingArea.child.j0
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return FavoriteDrawerFragment.m34607v5(function2, obj, obj2);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavoriteDrawerFragment.m34608w5(this.f29543b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavoriteDrawerFragment.m34609x5(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: q5 */
    public final boolean m34611q5() {
        boolean z11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f29518f0 >= 3000) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f29518f0 = jCurrentTimeMillis;
        }
        return z11;
    }

    /* JADX INFO: renamed from: r5 */
    public final Fragment m34612r5() {
        return getChildFragmentManager().findFragmentByTag("DrawerFavoriteChild");
    }

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment, com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    public void showContent() {
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 != null) {
            WrapperLoadingView wrapperLoadingViewM34555d4 = m34555d4();
            if (wrapperLoadingViewM34555d4 != null) {
                wrapperLoadingViewM34555d4.showContent();
            }
            LinearLayout flContainer = c36789k1M34590S4.f80386c;
            Intrinsics.checkNotNullExpressionValue(flContainer, "flContainer");
            int childCount = flContainer.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = flContainer.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                C27046k.m66685H(childAt);
            }
            Fragment fragmentM34612r5 = m34612r5();
            if (m34613y5() && fragmentM34612r5 != null) {
                C27032f.m66622m(this, fragmentM34612r5);
            }
            View viewFindViewById = flContainer.findViewById(R$id.drawer_login_container);
            if (viewFindViewById != null) {
                flContainer.removeView(viewFindViewById);
            }
            View viewFindViewById2 = flContainer.findViewById(R$id.drawer_recommend_container);
            if (viewFindViewById2 != null) {
                flContainer.removeView(viewFindViewById2);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final boolean m34613y5() {
        boolean z11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f29519g0 >= 3000) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f29519g0 = jCurrentTimeMillis;
        }
        return z11;
    }
}
