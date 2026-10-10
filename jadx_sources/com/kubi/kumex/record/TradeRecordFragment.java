package com.kubi.kumex.record;

import am.HistoryTradeRecordParams;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.kumex.trade.CommonDecoration;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageFragment;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36797l3;
import hb0.InterfaceC38162f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203di.AbstractC36711s;
import p203di.C36693a;
import p203di.C36699g;
import p203di.C36707o;
import p203di.C36713u;
import p761xh.C46203d1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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

/* JADX INFO: compiled from: TradeRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00102\u001a\u000200H\u0002J\b\u00103\u001a\u000200H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000200H\u0002J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020&*\b\u0012\u0004\u0012\u00020<0&H\u0002J(\u0010=\u001a\u00020>2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010#R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, m90084d2 = {"Lcom/kubi/kumex/record/TradeRecordFragment;", "Lcom/kubi/sdk/BasePageFragment;", "", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentTradeRecordBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentTradeRecordBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "contractFilter", "Lcom/kubi/futures/history/filter/ContractClickFilter;", "getContractFilter", "()Lcom/kubi/futures/history/filter/ContractClickFilter;", "contractFilter$delegate", "timeFilter", "Lcom/kubi/futures/history/filter/TimeClickFilter;", "getTimeFilter", "()Lcom/kubi/futures/history/filter/TimeClickFilter;", "timeFilter$delegate", "typeFilter", "Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfTrade;", "getTypeFilter", "()Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfTrade;", "typeFilter$delegate", "accountFilter", "Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "getAccountFilter", "()Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "accountFilter$delegate", "lastPageEntity", "Lcom/kubi/sdk/PageEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "refresh", "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "fetchPageData", "page", "", "size", "initListener", "toDisplayList", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "buildFetchParams", "Lcom/kubi/kumex/data/assets/model/HistoryTradeRecordParams;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeRecordFragment.kt\ncom/kubi/kumex/record/TradeRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n147#2,16:248\n1563#3:264\n1634#3,3:265\n1#4:268\n*S KotlinDebug\n*F\n+ 1 TradeRecordFragment.kt\ncom/kubi/kumex/record/TradeRecordFragment\n*L\n45#1:248,16\n190#1:264\n190#1:265,3\n*E\n"})
public final class TradeRecordFragment extends BasePageFragment<Object> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f29929X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29930Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f29931Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f29932a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f29933b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f29934c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public PageEntity<Object> f29935d0;

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f29928f0 = {Reflection.property1(new PropertyReference1Impl(TradeRecordFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentTradeRecordBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f29927e0 = new Companion(null);

    /* JADX INFO: compiled from: TradeRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/record/TradeRecordFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/record/TradeRecordFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TradeRecordFragment newInstance(@Nullable Bundle bundle) {
            TradeRecordFragment tradeRecordFragment = new TradeRecordFragment();
            tradeRecordFragment.setArguments(bundle);
            return tradeRecordFragment;
        }
    }

    public TradeRecordFragment() {
        super(false, 1, null);
        this.f29929X = C45681e.m100799e(this, new Function1<TradeRecordFragment, C36797l3>() { // from class: com.kubi.kumex.record.TradeRecordFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36797l3 invoke(@NotNull TradeRecordFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36797l3.m82455a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36797l3, Unit>() { // from class: com.kubi.kumex.record.TradeRecordFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36797l3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36797l3 c36797l3) {
                invoke(c36797l3);
                return Unit.INSTANCE;
            }
        });
        this.f29930Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.j1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRecordFragment.m35285Y3(this.f30297b);
            }
        });
        this.f29931Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.l1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRecordFragment.m35273K3(this.f30304b);
            }
        });
        this.f29932a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRecordFragment.m35286Z3(this.f30307b);
            }
        });
        this.f29933b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.n1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRecordFragment.m35288b4(this.f30310b);
            }
        });
        this.f29934c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRecordFragment.m35272I3(this.f30312b);
            }
        });
    }

    @Override // com.kubi.sdk.BasePageFragment
    /* JADX INFO: renamed from: B0 */
    public void mo25620B0() {
        this.f29935d0 = null;
        super.mo25620B0();
    }

    /* JADX INFO: renamed from: J3 */
    public final HistoryTradeRecordParams m35292J3(int i11, int i12, PageEntity<Object> pageEntity) {
        int iM66650j = C27039d.m66650j(pageEntity != null ? Integer.valueOf(pageEntity.getOffset()) : null);
        int iM66650j2 = C27039d.m66650j(pageEntity != null ? Integer.valueOf(pageEntity.getTrialOffset()) : null);
        C36707o c36707oM35277P3 = m35277P3();
        Long lValueOf = c36707oM35277P3 != null ? Long.valueOf(c36707oM35277P3.m82209f()) : null;
        C36707o c36707oM35277P4 = m35277P3();
        Long lValueOf2 = c36707oM35277P4 != null ? Long.valueOf(c36707oM35277P4.m82208e()) : null;
        C36699g c36699gM35275N3 = m35275N3();
        String f79596c = c36699gM35275N3 != null ? c36699gM35275N3.getF79596c() : null;
        C36713u c36713uM35294Q3 = m35294Q3();
        return new HistoryTradeRecordParams(c36713uM35294Q3 != null ? c36713uM35294Q3.getF79626c() : null, f79596c, null, i12, i11, iM66650j, lValueOf, lValueOf2, iM66650j2, 4, null);
    }

    /* JADX INFO: renamed from: L3 */
    private final C36693a m35274L3() {
        return (C36693a) this.f29934c0.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    private final C36699g m35275N3() {
        return (C36699g) this.f29931Z.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    private final String m35276O3() {
        return (String) this.f29930Y.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    private final C36707o m35277P3() {
        return (C36707o) this.f29932a0.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    private final void m35278R3() {
        final C36797l3 c36797l3M35293M3;
        C36699g c36699gM35275N3;
        Context context = getContext();
        if (context == null || (c36797l3M35293M3 = m35293M3()) == null) {
            return;
        }
        c36797l3M35293M3.f80491h.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.p1
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                TradeRecordFragment.m35279S3(this.f30322b, c36797l3M35293M3, interfaceC38162f);
            }
        });
        c36797l3M35293M3.f80490g.setAdapter(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), CommonFootObject.class, CommonFootObjectProxy.class, null, null, 12, null), TradeRecordObject.class, TradeRecordObjectProxy.class, null, null, 12, null).m57045a(new TradeItemCallback()));
        RecyclerView list = c36797l3M35293M3.f80490g;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        c36797l3M35293M3.f80490g.addItemDecoration(new CommonDecoration(0, 0, (int) C27025c.m66565c(context, 16), (int) C27025c.m66565c(context, 16), 3, null));
        c36797l3M35293M3.f80490g.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        HorizontalScrollView scrollView = c36797l3M35293M3.f80492i;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        C27046k.m66684G(scrollView, true);
        String strM35276O3 = m35276O3();
        if (strM35276O3 != null && (c36699gM35275N3 = m35275N3()) != null) {
            c36699gM35275N3.m82177k(strM35276O3);
        }
        C36707o c36707oM35277P3 = m35277P3();
        if (c36707oM35277P3 != null) {
            c36707oM35277P3.m82211h(new Function0() { // from class: com.kubi.kumex.record.q1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeRecordFragment.m35281U3(this.f30325b);
                }
            });
        }
        C36699g c36699gM35275N4 = m35275N3();
        if (c36699gM35275N4 != null) {
            c36699gM35275N4.m82174e(new Function0() { // from class: com.kubi.kumex.record.r1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeRecordFragment.m35282V3(this.f30330b);
                }
            });
        }
        C36713u c36713uM35294Q3 = m35294Q3();
        if (c36713uM35294Q3 != null) {
            AbstractC36711s.m82222h(c36713uM35294Q3, null, new Function0() { // from class: com.kubi.kumex.record.s1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeRecordFragment.m35283W3(this.f30334b);
                }
            }, 1, null);
        }
        C36693a c36693aM35274L3 = m35274L3();
        if (c36693aM35274L3 != null) {
            MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
            MultiBizType multiBizType = MultiBizType.UNIFIED;
            if (multiBizTypeMo4515x != multiBizType) {
                multiBizType = MultiBizType.CLASSIC;
            }
            c36693aM35274L3.m82228g(multiBizType.getValue(), new Function0() { // from class: com.kubi.kumex.record.t1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeRecordFragment.m35284X3(this.f30338b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m35279S3(final TradeRecordFragment tradeRecordFragment, final C36797l3 c36797l3, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradeRecordFragment.mo25620B0();
        BaseFragment.runOnUiThread$default(tradeRecordFragment, new Function0() { // from class: com.kubi.kumex.record.k1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRecordFragment.m35280T3(this.f30299b, c36797l3);
            }
        }, 1000L, null, 4, null);
    }

    private final void initView() {
        View view;
        BaseTextView baseTextView;
        View view2;
        BaseTextView baseTextView2;
        if (IUnifyAccountService.f53155a.get().mo64991e()) {
            C36797l3 c36797l3M35293M3 = m35293M3();
            if (c36797l3M35293M3 != null && (baseTextView2 = c36797l3M35293M3.f80485b) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
            C36797l3 c36797l3M35293M4 = m35293M3();
            if (c36797l3M35293M4 == null || (view2 = c36797l3M35293M4.f80486c) == null) {
                return;
            }
            ViewExtKt.m66594y(view2);
            return;
        }
        C36797l3 c36797l3M35293M5 = m35293M3();
        if (c36797l3M35293M5 != null && (baseTextView = c36797l3M35293M5.f80485b) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C36797l3 c36797l3M35293M6 = m35293M3();
        if (c36797l3M35293M6 == null || (view = c36797l3M35293M6.f80486c) == null) {
            return;
        }
        ViewExtKt.m66577h(view);
    }

    /* JADX INFO: renamed from: M3 */
    public final C36797l3 m35293M3() {
        return (C36797l3) this.f29929X.getValue(this, f29928f0[0]);
    }

    /* JADX INFO: renamed from: Q3 */
    public final C36713u m35294Q3() {
        return (C36713u) this.f29933b0.getValue();
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public PageEntity<Object> mo24546o3(int i11, int i12) {
        MultiBizType multiBizTypeM82165s;
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        C36693a c36693aM35274L3 = m35274L3();
        if (c36693aM35274L3 == null || (multiBizTypeM82165s = c36693aM35274L3.m82165s()) == null) {
            multiBizTypeM82165s = MultiBizType.CLASSIC;
        }
        PageEntity<Object> pageEntityM35287a4 = m35287a4(multiBizFacadeManager.m20272m(multiBizTypeM82165s).mo83053O0(m35292J3(i11, i12, this.f29935d0)));
        this.f29935d0 = pageEntityM35287a4;
        return pageEntityM35287a4;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_trade_record, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m35278R3();
    }

    /* JADX INFO: renamed from: I3 */
    public static final C36693a m35272I3(TradeRecordFragment tradeRecordFragment) {
        C36797l3 c36797l3M35293M3 = tradeRecordFragment.m35293M3();
        if (c36797l3M35293M3 != null) {
            BaseTextView accountFilter = c36797l3M35293M3.f80485b;
            Intrinsics.checkNotNullExpressionValue(accountFilter, "accountFilter");
            View line = c36797l3M35293M3.f80489f;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36693a(accountFilter, line);
        }
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static final C36699g m35273K3(TradeRecordFragment tradeRecordFragment) {
        C36797l3 c36797l3M35293M3 = tradeRecordFragment.m35293M3();
        if (c36797l3M35293M3 != null) {
            BaseTextView contractFilter = c36797l3M35293M3.f80487d;
            Intrinsics.checkNotNullExpressionValue(contractFilter, "contractFilter");
            View line = c36797l3M35293M3.f80489f;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36699g(contractFilter, line);
        }
        return null;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m35280T3(TradeRecordFragment tradeRecordFragment, C36797l3 c36797l3) {
        if (tradeRecordFragment.getView() != null) {
            c36797l3.f80491h.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m35281U3(TradeRecordFragment tradeRecordFragment) {
        tradeRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m35282V3(TradeRecordFragment tradeRecordFragment) {
        tradeRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m35283W3(TradeRecordFragment tradeRecordFragment) {
        tradeRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m35284X3(TradeRecordFragment tradeRecordFragment) {
        C46203d1.a.TradeTypeIndex tradeTypeIndex;
        C36713u c36713uM35294Q3;
        List<C46203d1.a.TradeTypeIndex> listMo65317d;
        Object next;
        String type;
        String f79626c;
        C36713u c36713uM35294Q4 = tradeRecordFragment.m35294Q3();
        if (c36713uM35294Q4 != null && (listMo65317d = c36713uM35294Q4.mo65317d()) != null) {
            Iterator<T> it = listMo65317d.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    type = ((C46203d1.a.TradeTypeIndex) next).getType();
                    C36713u c36713uM35294Q5 = tradeRecordFragment.m35294Q3();
                    if (c36713uM35294Q5 != null) {
                        f79626c = c36713uM35294Q5.getF79626c();
                    } else {
                        f79626c = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(type, f79626c));
            tradeTypeIndex = (C46203d1.a.TradeTypeIndex) next;
        } else {
            tradeTypeIndex = null;
        }
        if (tradeTypeIndex == null && (c36713uM35294Q3 = tradeRecordFragment.m35294Q3()) != null) {
            c36713uM35294Q3.m82230m(null);
        }
        tradeRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final String m35285Y3(TradeRecordFragment tradeRecordFragment) {
        Bundle arguments = tradeRecordFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final C36707o m35286Z3(TradeRecordFragment tradeRecordFragment) {
        C36797l3 c36797l3M35293M3 = tradeRecordFragment.m35293M3();
        if (c36797l3M35293M3 != null) {
            BaseTextView timeFilter = c36797l3M35293M3.f80493j;
            Intrinsics.checkNotNullExpressionValue(timeFilter, "timeFilter");
            View line = c36797l3M35293M3.f80489f;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36707o(timeFilter, line, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: a4 */
    private final PageEntity<Object> m35287a4(PageEntity<TradeRecordEntity> pageEntity) {
        List listM66560c = C27024b.m66560c(pageEntity.getItems());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
        Iterator it = listM66560c.iterator();
        while (it.hasNext()) {
            arrayList.add(new TradeRecordObject((TradeRecordEntity) it.next()));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList != null && !mutableList.isEmpty() && !pageEntity.getHasNext()) {
            mutableList.add(new CommonFootObject(null, 1, null));
        }
        return new PageEntity<>(mutableList, pageEntity.getHasNext(), pageEntity.getContext(), pageEntity.getOffset(), pageEntity.getTrialOffset(), null, 32, null);
    }

    /* JADX INFO: renamed from: b4 */
    public static final C36713u m35288b4(TradeRecordFragment tradeRecordFragment) {
        C36797l3 c36797l3M35293M3 = tradeRecordFragment.m35293M3();
        if (c36797l3M35293M3 != null) {
            BaseTextView typeFilter = c36797l3M35293M3.f80494k;
            Intrinsics.checkNotNullExpressionValue(typeFilter, "typeFilter");
            View line = c36797l3M35293M3.f80489f;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36713u(typeFilter, line, tradeRecordFragment.m35274L3());
        }
        return null;
    }

    @Override // com.kubi.sdk.BasePageFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public RecyclerView mo24547s3() {
        C36797l3 c36797l3M35293M3 = m35293M3();
        if (c36797l3M35293M3 != null) {
            return c36797l3M35293M3.f80490g;
        }
        return null;
    }
}
