package com.kubi.futures.history;

import am.HistoryProfitParams;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.share.PositionPnlShare;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.record.CommonFootObject;
import com.kubi.kumex.record.CommonFootObjectProxy;
import com.kubi.kumex.record.ProfitDetailFragment;
import com.kubi.kumex.record.ProfitDiffCallBack;
import com.kubi.kumex.record.ProfitRecordObject;
import com.kubi.kumex.record.ProfitRecordObjectProxy;
import com.kubi.kumex.trade.CommonDecoration;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageFragment;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36879z2;
import hb0.InterfaceC38162f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203di.C36693a;
import p203di.C36699g;
import p203di.C36707o;
import p595rg.InterfaceC44074b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PnlHistoryFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020*H\u0016J$\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00107\u001a\u0002082\u0006\u00109\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010:\u001a\u000208H\u0002J\u0010\u0010 \u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010>\u001a\u000208H\u0002J\b\u0010?\u001a\u000208H\u0016J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020&*\b\u0012\u0004\u0012\u00020A0&H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010#R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/futures/history/PnlHistoryFragment;", "Lcom/kubi/sdk/BasePageFragment;", "", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentPnlHistoryBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentPnlHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "contractFilter", "Lcom/kubi/futures/history/filter/ContractClickFilter;", "getContractFilter", "()Lcom/kubi/futures/history/filter/ContractClickFilter;", "contractFilter$delegate", "Lkotlin/Lazy;", "timeFilter", "Lcom/kubi/futures/history/filter/TimeClickFilter;", "getTimeFilter", "()Lcom/kubi/futures/history/filter/TimeClickFilter;", "timeFilter$delegate", "accountFilter", "Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "getAccountFilter", "()Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "accountFilter$delegate", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", FirebaseAnalytics.Event.SHARE, "Lcom/kubi/futures/share/PositionPnlShare;", "getShare", "()Lcom/kubi/futures/share/PositionPnlShare;", "share$delegate", "lastPageEntity", "Lcom/kubi/sdk/PageEntity;", "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "getItemKey", "", "it", "fetchPageData", "page", "size", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "data", "Lcom/kubi/kumex/record/ProfitRecordObject;", "navigationDetailsPage", "initTimeFilter", "refresh", "toDisplayList", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPnlHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PnlHistoryFragment.kt\ncom/kubi/futures/history/PnlHistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n147#2,16:248\n1563#3:264\n1634#3,3:265\n*S KotlinDebug\n*F\n+ 1 PnlHistoryFragment.kt\ncom/kubi/futures/history/PnlHistoryFragment\n*L\n54#1:248,16\n229#1:264\n229#1:265,3\n*E\n"})
public final class PnlHistoryFragment extends BasePageFragment<Object> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f23087X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f23088Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f23089Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f23090a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f23091b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f23092c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public PageEntity<Object> f23093d0;

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f23086f0 = {Reflection.property1(new PropertyReference1Impl(PnlHistoryFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentPnlHistoryBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f23085e0 = new Companion(null);

    /* JADX INFO: compiled from: PnlHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/history/PnlHistoryFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/history/PnlHistoryFragment;", "argument", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PnlHistoryFragment newInstance(@Nullable Bundle argument) {
            PnlHistoryFragment pnlHistoryFragment = new PnlHistoryFragment();
            if (argument != null) {
                pnlHistoryFragment.setArguments(argument);
            }
            return pnlHistoryFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.history.PnlHistoryFragment$a */
    /* JADX INFO: compiled from: PnlHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/history/PnlHistoryFragment$initView$adapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/record/ProfitRecordObject;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13214a implements ItemCallBack<ProfitRecordObject> {
        public C13214a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, ProfitRecordObject data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            if (view.getId() == R$id.share) {
                PnlHistoryFragment.this.m25624Y3(data);
            } else {
                PnlHistoryFragment.this.m25623V3(data);
            }
        }
    }

    public PnlHistoryFragment() {
        super(false);
        this.f23087X = C45681e.m100799e(this, new Function1<PnlHistoryFragment, C36879z2>() { // from class: com.kubi.futures.history.PnlHistoryFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36879z2 invoke(@NotNull PnlHistoryFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36879z2.m82627a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36879z2, Unit>() { // from class: com.kubi.futures.history.PnlHistoryFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36879z2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36879z2 c36879z2) {
                invoke(c36879z2);
                return Unit.INSTANCE;
            }
        });
        this.f23088Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.history.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnlHistoryFragment.m25603K3(this.f23097b);
            }
        });
        this.f23089Z = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.history.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnlHistoryFragment.m25616b4(this.f23098b);
            }
        });
        this.f23090a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.history.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnlHistoryFragment.m25602J3(this.f23099b);
            }
        });
        this.f23091b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.history.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnlHistoryFragment.m25615a4(this.f23100b);
            }
        });
        this.f23092c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.history.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnlHistoryFragment.m25614Z3();
            }
        });
    }

    @Override // com.kubi.sdk.BasePageFragment
    /* JADX INFO: renamed from: B0 */
    public void mo25620B0() {
        this.f23093d0 = null;
        super.mo25620B0();
    }

    /* JADX INFO: renamed from: L3 */
    private final C36693a m25604L3() {
        return (C36693a) this.f23090a0.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    private final C36699g m25605N3() {
        return (C36699g) this.f23088Y.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    private final String m25606P3() {
        return (String) this.f23091b0.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final C36707o m25607Q3() {
        return (C36707o) this.f23089Z.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m25610T3(final PnlHistoryFragment pnlHistoryFragment, final C36879z2 c36879z2, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        pnlHistoryFragment.mo25620B0();
        BaseFragment.runOnUiThread$default(pnlHistoryFragment, new Function0() { // from class: com.kubi.futures.history.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnlHistoryFragment.m25611U3(this.f23106b, c36879z2);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final PositionPnlShare m25614Z3() {
        return new PositionPnlShare();
    }

    private final void initView() {
        final C36879z2 c36879z2M25621M3 = m25621M3();
        if (c36879z2M25621M3 == null) {
            return;
        }
        if (IUnifyAccountService.f53155a.get().mo64991e()) {
            BaseTextView accountFilter = c36879z2M25621M3.f81407b;
            Intrinsics.checkNotNullExpressionValue(accountFilter, "accountFilter");
            ViewExtKt.m66594y(accountFilter);
            View accountFilterDivider = c36879z2M25621M3.f81408c;
            Intrinsics.checkNotNullExpressionValue(accountFilterDivider, "accountFilterDivider");
            ViewExtKt.m66594y(accountFilterDivider);
        } else {
            BaseTextView accountFilter2 = c36879z2M25621M3.f81407b;
            Intrinsics.checkNotNullExpressionValue(accountFilter2, "accountFilter");
            ViewExtKt.m66577h(accountFilter2);
            View accountFilterDivider2 = c36879z2M25621M3.f81408c;
            Intrinsics.checkNotNullExpressionValue(accountFilterDivider2, "accountFilterDivider");
            ViewExtKt.m66577h(accountFilterDivider2);
        }
        c36879z2M25621M3.f81412g.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.futures.history.h
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                PnlHistoryFragment.m25610T3(this.f23103b, c36879z2M25621M3, interfaceC38162f);
            }
        });
        c36879z2M25621M3.f81411f.setAdapter(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), CommonFootObject.class, CommonFootObjectProxy.class, null, null, 12, null), ProfitRecordObject.class, ProfitRecordObjectProxy.class, new C13214a(), null, 8, null).m57045a(new ProfitDiffCallBack()));
        RecyclerView list = c36879z2M25621M3.f81411f;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        c36879z2M25621M3.f81411f.addItemDecoration(new CommonDecoration(0, 0, C27029c.m66603f(this, 16), C27029c.m66603f(this, 16), 3, null));
        c36879z2M25621M3.f81411f.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
    }

    /* JADX INFO: renamed from: M3 */
    public final C36879z2 m25621M3() {
        return (C36879z2) this.f23087X.getValue(this, f23086f0[0]);
    }

    /* JADX INFO: renamed from: O3 */
    public final PositionPnlShare m25622O3() {
        return (PositionPnlShare) this.f23092c0.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m25623V3(ProfitRecordObject profitRecordObject) {
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        companion.launch(contextRequireContext, ProfitDetailFragment.class, BundleKt.bundleOf(TuplesKt.m90091to("data", profitRecordObject.getF29936a())));
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public PageEntity<Object> mo24546o3(int i11, int i12) {
        MultiBizType multiBizTypeM82165s;
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        C36693a c36693aM25604L3 = m25604L3();
        if (c36693aM25604L3 == null || (multiBizTypeM82165s = c36693aM25604L3.m82165s()) == null) {
            multiBizTypeM82165s = MultiBizType.CLASSIC;
        }
        InterfaceC44074b interfaceC44074bM20272m = multiBizFacadeManager.m20272m(multiBizTypeM82165s);
        C36699g c36699gM25605N3 = m25605N3();
        String f79596c = c36699gM25605N3 != null ? c36699gM25605N3.getF79596c() : null;
        C36707o c36707oM25607Q3 = m25607Q3();
        Long lValueOf = c36707oM25607Q3 != null ? Long.valueOf(c36707oM25607Q3.m82209f()) : null;
        C36707o c36707oM25607Q4 = m25607Q3();
        Long lValueOf2 = c36707oM25607Q4 != null ? Long.valueOf(c36707oM25607Q4.m82208e()) : null;
        PageEntity<Object> pageEntity = this.f23093d0;
        int iM66650j = C27039d.m66650j(pageEntity != null ? Integer.valueOf(pageEntity.getOffset()) : null);
        PageEntity<Object> pageEntity2 = this.f23093d0;
        PageEntity<Object> pageEntityM25625c4 = m25625c4(interfaceC44074bM20272m.mo83052K0(new HistoryProfitParams(f79596c, null, i12, iM66650j, lValueOf, lValueOf2, Integer.valueOf(C27039d.m66650j(pageEntity2 != null ? Integer.valueOf(pageEntity2.getTrialOffset()) : null)), 2, null)));
        this.f23093d0 = pageEntityM25625c4;
        return pageEntityM25625c4;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_pnl_history, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C36699g c36699gM25605N3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String strM25606P3 = m25606P3();
        if (strM25606P3 != null && (c36699gM25605N3 = m25605N3()) != null) {
            c36699gM25605N3.m82177k(strM25606P3);
        }
        C36699g c36699gM25605N4 = m25605N3();
        if (c36699gM25605N4 != null) {
            c36699gM25605N4.m82174e(new Function0() { // from class: com.kubi.futures.history.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PnlHistoryFragment.m25612W3(this.f23095b);
                }
            });
        }
        C36693a c36693aM25604L3 = m25604L3();
        if (c36693aM25604L3 != null) {
            MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
            MultiBizType multiBizType = MultiBizType.UNIFIED;
            if (multiBizTypeMo4515x != multiBizType) {
                multiBizType = MultiBizType.CLASSIC;
            }
            c36693aM25604L3.m82228g(multiBizType.getValue(), new Function0() { // from class: com.kubi.futures.history.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PnlHistoryFragment.m25613X3(this.f23096b);
                }
            });
        }
        m25608R3();
        initView();
    }

    @Override // com.kubi.sdk.BasePageFragment
    /* JADX INFO: renamed from: r3 */
    public int mo25626r3(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ProfitRecordObject) {
            return C27039d.m66650j(((ProfitRecordObject) it).getF29936a().getOffset());
        }
        return -1;
    }

    /* JADX INFO: renamed from: J3 */
    public static final C36693a m25602J3(PnlHistoryFragment pnlHistoryFragment) {
        C36879z2 c36879z2M25621M3 = pnlHistoryFragment.m25621M3();
        if (c36879z2M25621M3 != null) {
            BaseTextView accountFilter = c36879z2M25621M3.f81407b;
            Intrinsics.checkNotNullExpressionValue(accountFilter, "accountFilter");
            View line = c36879z2M25621M3.f81410e;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36693a(accountFilter, line);
        }
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static final C36699g m25603K3(PnlHistoryFragment pnlHistoryFragment) {
        C36879z2 c36879z2M25621M3 = pnlHistoryFragment.m25621M3();
        if (c36879z2M25621M3 != null) {
            BaseTextView contract = c36879z2M25621M3.f81409d;
            Intrinsics.checkNotNullExpressionValue(contract, "contract");
            View line = c36879z2M25621M3.f81410e;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36699g(contract, line);
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    private final void m25608R3() {
        C36707o c36707oM25607Q3;
        C36707o c36707oM25607Q4 = m25607Q3();
        if (c36707oM25607Q4 != null) {
            c36707oM25607Q4.m82211h(new Function0() { // from class: com.kubi.futures.history.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PnlHistoryFragment.m25609S3(this.f23105b);
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            long jM56268q = RouteExKt.m56268q(arguments, "startTime");
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                long jM56268q2 = RouteExKt.m56268q(arguments2, "endTime");
                if (jM56268q < jM56268q2 && (c36707oM25607Q3 = m25607Q3()) != null) {
                    c36707oM25607Q3.m82214n(jM56268q, jM56268q2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m25609S3(PnlHistoryFragment pnlHistoryFragment) {
        pnlHistoryFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m25611U3(PnlHistoryFragment pnlHistoryFragment, C36879z2 c36879z2) {
        if (pnlHistoryFragment.getView() != null) {
            c36879z2.f81412g.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m25612W3(PnlHistoryFragment pnlHistoryFragment) {
        pnlHistoryFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m25613X3(PnlHistoryFragment pnlHistoryFragment) {
        pnlHistoryFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final String m25615a4(PnlHistoryFragment pnlHistoryFragment) {
        Bundle arguments = pnlHistoryFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public static final C36707o m25616b4(PnlHistoryFragment pnlHistoryFragment) {
        C36879z2 c36879z2M25621M3 = pnlHistoryFragment.m25621M3();
        if (c36879z2M25621M3 != null) {
            BaseTextView time = c36879z2M25621M3.f81414i;
            Intrinsics.checkNotNullExpressionValue(time, "time");
            View line = c36879z2M25621M3.f81410e;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36707o(time, line, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m25624Y3(ProfitRecordObject profitRecordObject) {
        PositionPnlShare.m26542p(m25622O3(), this, profitRecordObject.getF29936a(), null, 4, null);
    }

    /* JADX INFO: renamed from: c4 */
    public final PageEntity<Object> m25625c4(PageEntity<ProfitRecordEntity> pageEntity) {
        MultiBizType multiBizTypeM82165s;
        C36693a c36693aM25604L3 = m25604L3();
        if (c36693aM25604L3 == null || (multiBizTypeM82165s = c36693aM25604L3.m82165s()) == null) {
            multiBizTypeM82165s = MultiBizType.CLASSIC;
        }
        List<ProfitRecordEntity> listM66560c = C27024b.m66560c(pageEntity.getItems());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
        for (ProfitRecordEntity profitRecordEntity : listM66560c) {
            profitRecordEntity.setMultiBizType(multiBizTypeM82165s);
            arrayList.add(new ProfitRecordObject(profitRecordEntity));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList != null && !mutableList.isEmpty() && !pageEntity.getHasNext()) {
            mutableList.add(new CommonFootObject(null, 1, null));
        }
        return new PageEntity<>(mutableList, pageEntity.getHasNext(), pageEntity.getContext(), pageEntity.getOffset(), pageEntity.getTrialOffset(), null, 32, null);
    }

    @Override // com.kubi.sdk.BasePageFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public RecyclerView mo24547s3() {
        C36879z2 c36879z2M25621M3 = m25621M3();
        if (c36879z2M25621M3 != null) {
            return c36879z2M25621M3.f81411f;
        }
        return null;
    }
}
