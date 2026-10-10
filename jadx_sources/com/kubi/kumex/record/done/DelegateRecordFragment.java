package com.kubi.kumex.record.done;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.trade.submit.panel.tradeType.twap.z;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$string;
import com.kubi.kumex.record.DelegationRecordFragment;
import com.kubi.kumex.record.PageInfo;
import com.kubi.kumex.record.done.viewModel.DelegateRecordViewModel;
import com.kubi.kumex.record.done.viewModel.FiltersInfo;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36730a2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203di.AbstractC36711s;
import p203di.C36693a;
import p203di.C36699g;
import p203di.C36707o;
import p203di.C36712t;
import p761xh.C46198c;
import p761xh.C46203d1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DelegateRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00103\u001a\u000201H\u0002J\b\u00104\u001a\u000201H\u0002J\b\u00105\u001a\u000201H\u0002J\u0012\u00106\u001a\u0002072\b\b\u0001\u00108\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b%\u0010&¨\u0006:"}, m90084d2 = {"Lcom/kubi/kumex/record/done/DelegateRecordFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentDelegateRecordsBinding;", "contractFilter", "Lcom/kubi/futures/history/filter/ContractClickFilter;", "getContractFilter", "()Lcom/kubi/futures/history/filter/ContractClickFilter;", "contractFilter$delegate", "Lkotlin/Lazy;", "typeFilter", "Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfDelegation;", "getTypeFilter", "()Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfDelegation;", "typeFilter$delegate", "timeFilter", "Lcom/kubi/futures/history/filter/TimeClickFilter;", "getTimeFilter", "()Lcom/kubi/futures/history/filter/TimeClickFilter;", "timeFilter$delegate", "accountFilter", "Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "getAccountFilter", "()Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "accountFilter$delegate", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "pageInfos", "", "Lcom/kubi/kumex/record/PageInfo;", "delegateRecordViewModel", "Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "getDelegateRecordViewModel", "()Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "delegateRecordViewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initTimeFilter", "updateFilterInfo", "indexOf", "", "titleResId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegateRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegateRecordFragment.kt\ncom/kubi/kumex/record/done/DelegateRecordFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n106#2,15:195\n1563#3:210\n1634#3,3:211\n1563#3:214\n1634#3,3:215\n1563#3:218\n1634#3,3:219\n1#4:222\n*S KotlinDebug\n*F\n+ 1 DelegateRecordFragment.kt\ncom/kubi/kumex/record/done/DelegateRecordFragment\n*L\n77#1:195,15\n151#1:210\n151#1:211,3\n154#1:214\n154#1:215,3\n192#1:218\n192#1:219,3\n*E\n"})
public final class DelegateRecordFragment extends BaseFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f30165c0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    public C36730a2 f30166U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f30167V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.done.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegateRecordFragment.m35651v3(this.f30191b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f30168W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.done.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegateRecordFragment.m35638K3(this.f30192b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f30169X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.done.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegateRecordFragment.m35637J3(this.f30193b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f30170Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.done.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegateRecordFragment.m35650u3(this.f30194b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f30171Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.done.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegateRecordFragment.m35636I3(this.f30195b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public List<PageInfo> f30172a0 = new ArrayList();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f30173b0;

    /* JADX INFO: compiled from: DelegateRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/record/done/DelegateRecordFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/record/done/DelegateRecordFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DelegateRecordFragment newInstance(@Nullable Bundle bundle) {
            DelegateRecordFragment delegateRecordFragment = new DelegateRecordFragment();
            delegateRecordFragment.setArguments(bundle);
            return delegateRecordFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.DelegateRecordFragment$a */
    /* JADX INFO: compiled from: DelegateRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/record/done/DelegateRecordFragment$initView$6", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16661a extends ViewPager.SimpleOnPageChangeListener {
        public C16661a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C36730a2 c36730a2 = null;
            if (position == DelegateRecordFragment.this.m35631C3(R$string.kumex_order_twap)) {
                C36730a2 c36730a3 = DelegateRecordFragment.this.f30166U;
                if (c36730a3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c36730a3 = null;
                }
                BaseTextView typeFilter = c36730a3.f79692k;
                Intrinsics.checkNotNullExpressionValue(typeFilter, "typeFilter");
                C27046k.m66700o(typeFilter);
                C36730a2 c36730a4 = DelegateRecordFragment.this.f30166U;
                if (c36730a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c36730a2 = c36730a4;
                }
                View divider1 = c36730a2.f79686e;
                Intrinsics.checkNotNullExpressionValue(divider1, "divider1");
                C27046k.m66700o(divider1);
                return;
            }
            C36730a2 c36730a5 = DelegateRecordFragment.this.f30166U;
            if (c36730a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a5 = null;
            }
            BaseTextView typeFilter2 = c36730a5.f79692k;
            Intrinsics.checkNotNullExpressionValue(typeFilter2, "typeFilter");
            C27046k.m66685H(typeFilter2);
            C36730a2 c36730a6 = DelegateRecordFragment.this.f30166U;
            if (c36730a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c36730a2 = c36730a6;
            }
            View divider2 = c36730a2.f79686e;
            Intrinsics.checkNotNullExpressionValue(divider2, "divider1");
            C27046k.m66685H(divider2);
        }
    }

    private final void initView() {
        C36730a2 c36730a2 = null;
        if (IUnifyAccountService.f53155a.get().mo64991e()) {
            C36730a2 c36730a3 = this.f30166U;
            if (c36730a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a3 = null;
            }
            BaseTextView accountFilter = c36730a3.f79683b;
            Intrinsics.checkNotNullExpressionValue(accountFilter, "accountFilter");
            ViewExtKt.m66594y(accountFilter);
            C36730a2 c36730a4 = this.f30166U;
            if (c36730a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a4 = null;
            }
            View accountFilterDivider = c36730a4.f79684c;
            Intrinsics.checkNotNullExpressionValue(accountFilterDivider, "accountFilterDivider");
            ViewExtKt.m66594y(accountFilterDivider);
        } else {
            C36730a2 c36730a5 = this.f30166U;
            if (c36730a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a5 = null;
            }
            BaseTextView accountFilter2 = c36730a5.f79683b;
            Intrinsics.checkNotNullExpressionValue(accountFilter2, "accountFilter");
            ViewExtKt.m66577h(accountFilter2);
            C36730a2 c36730a6 = this.f30166U;
            if (c36730a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a6 = null;
            }
            View accountFilterDivider2 = c36730a6.f79684c;
            Intrinsics.checkNotNullExpressionValue(accountFilterDivider2, "accountFilterDivider");
            ViewExtKt.m66577h(accountFilterDivider2);
        }
        String strM35653z3 = m35653z3();
        if (strM35653z3 != null) {
            m35652x3().m82177k(strM35653z3);
        }
        m35655D3();
        m35652x3().m82174e(new Function0() { // from class: com.kubi.kumex.record.done.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegateRecordFragment.m35633F3(this.f30184b);
            }
        });
        AbstractC36711s.m82222h(m35654B3(), null, new Function0() { // from class: com.kubi.kumex.record.done.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegateRecordFragment.m35634G3(this.f30189b);
            }
        }, 1, null);
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        C36693a c36693aM35657w3 = m35657w3();
        MultiBizType multiBizType = MultiBizType.UNIFIED;
        if (multiBizTypeMo4515x != multiBizType) {
            multiBizType = MultiBizType.CLASSIC;
        }
        c36693aM35657w3.m82228g(multiBizType.getValue(), new Function0() { // from class: com.kubi.kumex.record.done.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegateRecordFragment.m35635H3(this.f30190b);
            }
        });
        m35658y3().m35716p().setValue(new FiltersInfo(m35653z3(), m35654B3().getF79626c(), new C46198c(R$id.threeMonth), multiBizTypeMo4515x));
        this.f30172a0.add(new PageInfo(getStringRes(R$string.delegation_history, new Object[0]), DelegationRecordFragment.f29892b0.newInstance(getArguments())));
        if (z.a()) {
            this.f30172a0.add(new PageInfo(getStringRes(R$string.kumex_order_twap, new Object[0]), TwapDelegationRecordFragment.f30177Z.newInstance(getArguments())));
        }
        if (this.f30172a0.size() == 1) {
            C36730a2 c36730a7 = this.f30166U;
            if (c36730a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a7 = null;
            }
            SlidingTabLayout tabLayout = c36730a7.f79690i;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            C27046k.m66700o(tabLayout);
        } else {
            C36730a2 c36730a8 = this.f30166U;
            if (c36730a8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c36730a8 = null;
            }
            SlidingTabLayout tabLayout2 = c36730a8.f79690i;
            Intrinsics.checkNotNullExpressionValue(tabLayout2, "tabLayout");
            C27046k.m66685H(tabLayout2);
        }
        ArrayList arrayList = new ArrayList();
        List<PageInfo> list = this.f30172a0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PageInfo) it.next()).getFragment());
        }
        arrayList.addAll(arrayList2);
        C36730a2 c36730a9 = this.f30166U;
        if (c36730a9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a9 = null;
        }
        CustomViewPager customViewPager = c36730a9.f79693l;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        List<PageInfo> list2 = this.f30172a0;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((PageInfo) it2.next()).getTitle());
        }
        customViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList3));
        C36730a2 c36730a10 = this.f30166U;
        if (c36730a10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a10 = null;
        }
        c36730a10.f79693l.setOffscreenPageLimit(arrayList.size() - 1);
        C36730a2 c36730a11 = this.f30166U;
        if (c36730a11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a11 = null;
        }
        c36730a11.f79690i.setNeedBold(true);
        C36730a2 c36730a12 = this.f30166U;
        if (c36730a12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a12 = null;
        }
        SlidingTabLayout slidingTabLayout = c36730a12.f79690i;
        C36730a2 c36730a13 = this.f30166U;
        if (c36730a13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a13 = null;
        }
        slidingTabLayout.setViewPager(c36730a13.f79693l);
        C36730a2 c36730a14 = this.f30166U;
        if (c36730a14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a14 = null;
        }
        c36730a14.f79693l.setCurrentItem(0);
        C36730a2 c36730a15 = this.f30166U;
        if (c36730a15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36730a2 = c36730a15;
        }
        c36730a2.f79693l.addOnPageChangeListener(new C16661a());
    }

    /* JADX INFO: renamed from: A3 */
    private final C36707o m35630A3() {
        return (C36707o) this.f30169X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public final int m35631C3(@StringRes int i11) {
        List<PageInfo> list = this.f30172a0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PageInfo) it.next()).getTitle());
        }
        return arrayList.indexOf(getString(i11));
    }

    /* JADX INFO: renamed from: J3 */
    public static final C36707o m35637J3(DelegateRecordFragment delegateRecordFragment) {
        C36730a2 c36730a2 = delegateRecordFragment.f30166U;
        if (c36730a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a2 = null;
        }
        BaseTextView timeFilter = c36730a2.f79691j;
        Intrinsics.checkNotNullExpressionValue(timeFilter, "timeFilter");
        View line = c36730a2.f79688g;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        return new C36707o(timeFilter, line, true);
    }

    /* JADX INFO: renamed from: K3 */
    public static final C36712t m35638K3(DelegateRecordFragment delegateRecordFragment) {
        C36730a2 c36730a2 = delegateRecordFragment.f30166U;
        if (c36730a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a2 = null;
        }
        BaseTextView typeFilter = c36730a2.f79692k;
        Intrinsics.checkNotNullExpressionValue(typeFilter, "typeFilter");
        View line = c36730a2.f79688g;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        return new C36712t(typeFilter, line, delegateRecordFragment.m35657w3());
    }

    /* JADX INFO: renamed from: u3 */
    public static final C36693a m35650u3(DelegateRecordFragment delegateRecordFragment) {
        C36730a2 c36730a2 = delegateRecordFragment.f30166U;
        if (c36730a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a2 = null;
        }
        BaseTextView accountFilter = c36730a2.f79683b;
        Intrinsics.checkNotNullExpressionValue(accountFilter, "accountFilter");
        View line = c36730a2.f79688g;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        return new C36693a(accountFilter, line);
    }

    /* JADX INFO: renamed from: v3 */
    public static final C36699g m35651v3(DelegateRecordFragment delegateRecordFragment) {
        C36730a2 c36730a2 = delegateRecordFragment.f30166U;
        if (c36730a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a2 = null;
        }
        BaseTextView contractFilterTv = c36730a2.f79685d;
        Intrinsics.checkNotNullExpressionValue(contractFilterTv, "contractFilterTv");
        View line = c36730a2.f79688g;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        return new C36699g(contractFilterTv, line);
    }

    /* JADX INFO: renamed from: x3 */
    private final C36699g m35652x3() {
        return (C36699g) this.f30167V.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    private final String m35653z3() {
        return (String) this.f30171Z.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public final C36712t m35654B3() {
        return (C36712t) this.f30168W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36730a2 c36730a2M82310c = C36730a2.m82310c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36730a2M82310c, "inflate(...)");
        this.f30166U = c36730a2M82310c;
        if (c36730a2M82310c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36730a2M82310c = null;
        }
        ConstraintLayout root = c36730a2M82310c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: renamed from: w3 */
    public final C36693a m35657w3() {
        return (C36693a) this.f30170Y.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final DelegateRecordViewModel m35658y3() {
        return (DelegateRecordViewModel) this.f30173b0.getValue();
    }

    public DelegateRecordFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.kumex.record.done.DelegateRecordFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.done.DelegateRecordFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f30173b0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DelegateRecordViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.done.DelegateRecordFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.done.DelegateRecordFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.done.DelegateRecordFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m35632E3(DelegateRecordFragment delegateRecordFragment) {
        delegateRecordFragment.m35656L3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m35633F3(DelegateRecordFragment delegateRecordFragment) {
        delegateRecordFragment.m35656L3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m35634G3(DelegateRecordFragment delegateRecordFragment) {
        delegateRecordFragment.m35656L3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m35635H3(DelegateRecordFragment delegateRecordFragment) {
        Object next;
        Iterator<T> it = delegateRecordFragment.m35654B3().mo65317d().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((C46203d1.a.TradeTypeIndex) next).getType(), delegateRecordFragment.m35654B3().getF79626c()));
        if (next == null) {
            delegateRecordFragment.m35654B3().m82230m(null);
        }
        delegateRecordFragment.m35656L3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final String m35636I3(DelegateRecordFragment delegateRecordFragment) {
        Bundle arguments = delegateRecordFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m35655D3() {
        m35630A3().m82211h(new Function0() { // from class: com.kubi.kumex.record.done.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegateRecordFragment.m35632E3(this.f30196b);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            long jM56268q = RouteExKt.m56268q(arguments, "startTime");
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                long jM56268q2 = RouteExKt.m56268q(arguments2, "endTime");
                if (jM56268q < jM56268q2) {
                    m35630A3().m82214n(jM56268q, jM56268q2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final void m35656L3() {
        m35658y3().m35716p().setValue(new FiltersInfo(m35652x3().getF79596c(), m35654B3().getF79626c(), m35630A3().getF79618d(), m35657w3().m82165s()));
    }
}
