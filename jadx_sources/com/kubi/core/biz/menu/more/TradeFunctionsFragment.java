package com.kubi.core.biz.menu.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.MenuItem;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.tradebase.BizType;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import v30.C45388j;
import w00.C45681e;

/* JADX INFO: compiled from: TradeFunctionsFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010#\u001a\u00020\tH\u0002J\u0016\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m90084d2 = {"Lcom/kubi/core/biz/menu/more/TradeFunctionsFragment;", "Lcom/kubi/sdk/BaseFragment;", "menuItems", "", "Lcom/kubi/resources/MenuItem;", "bizType", "Lcom/kubi/tradebase/BizType;", "onItemClicked", "Lkotlin/Function0;", "", "<init>", "(Ljava/util/List;Lcom/kubi/tradebase/BizType;Lkotlin/jvm/functions/Function0;)V", "getMenuItems", "()Ljava/util/List;", "getBizType", "()Lcom/kubi/tradebase/BizType;", "getOnItemClicked", "()Lkotlin/jvm/functions/Function0;", "binding", "Lcom/kubi/tradecorebiz/databinding/BkucoinTradeFunctionsFragmentBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkucoinTradeFunctionsFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "updateItemDot", "id", "", "showDot", "", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeFunctionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFunctionsFragment.kt\ncom/kubi/core/biz/menu/more/TradeFunctionsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n143#2,20:124\n1869#3,2:144\n*S KotlinDebug\n*F\n+ 1 TradeFunctionsFragment.kt\ncom/kubi/core/biz/menu/more/TradeFunctionsFragment\n*L\n51#1:124,20\n115#1:144,2\n*E\n"})
public final class TradeFunctionsFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @Nullable
    public final List<MenuItem> f20511U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public final BizType f20512V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public final Function0<Unit> f20513W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f20514X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f20510Z = {Reflection.property1(new PropertyReference1Impl(TradeFunctionsFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkucoinTradeFunctionsFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f20509Y = new Companion(null);

    /* JADX INFO: compiled from: TradeFunctionsFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/core/biz/menu/more/TradeFunctionsFragment$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/core/biz/menu/more/TradeFunctionsFragment;", "menuItems", "", "Lcom/kubi/resources/MenuItem;", "bizType", "Lcom/kubi/tradebase/BizType;", "onItemClicked", "Lkotlin/Function0;", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TradeFunctionsFragment create$default(Companion companion, List list, BizType bizType, Function0 function0, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                function0 = null;
            }
            return companion.create(list, bizType, function0);
        }

        @NotNull
        public final TradeFunctionsFragment create(@NotNull List<MenuItem> menuItems, @NotNull BizType bizType, @Nullable Function0<Unit> onItemClicked) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            Intrinsics.checkNotNullParameter(bizType, "bizType");
            return new TradeFunctionsFragment(menuItems, bizType, onItemClicked);
        }
    }

    public TradeFunctionsFragment() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ TradeFunctionsFragment(List list, BizType bizType, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bizType, (i11 & 4) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: j3 */
    public final C45388j m21983j3() {
        return (C45388j) this.f20514X.getValue(this, f20510Z[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: k3 */
    public final Function0<Unit> m21984k3() {
        return this.f20513W;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_trade_functions_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21982l3();
    }

    public TradeFunctionsFragment(@Nullable List<MenuItem> list, @Nullable BizType bizType, @Nullable Function0<Unit> function0) {
        this.f20511U = list;
        this.f20512V = bizType;
        this.f20513W = function0;
        this.f20514X = C45681e.m100799e(this, new Function1<TradeFunctionsFragment, C45388j>() { // from class: com.kubi.core.biz.menu.more.TradeFunctionsFragment$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45388j invoke(@NotNull TradeFunctionsFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45388j.m100310a(fragment.requireView());
            }
        }, new Function1<C45388j, Unit>() { // from class: com.kubi.core.biz.menu.more.TradeFunctionsFragment$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C45388j it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45388j c45388j) {
                invoke(c45388j);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    /* JADX INFO: renamed from: l3 */
    private final void m21982l3() {
        String lowerCase;
        String strName;
        C45388j c45388jM21983j3 = m21983j3();
        if (c45388jM21983j3 != null) {
            c45388jM21983j3.f102154b.setLayoutManager(new GridLayoutManager(getContext(), 4));
            c45388jM21983j3.f102154b.setAdapter(new TradeFunctionsFragment$initViews$1$adapter$1(this, R$layout.item_grid_menu_view, this.f20511U));
            IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
            FrameLayout frameLayout = c45388jM21983j3.f102155c;
            BizType bizType = this.f20512V;
            if (bizType != null && (strName = bizType.name()) != null) {
                lowerCase = strName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    lowerCase = SearchCategory$Companion.SPOT;
                }
            } else {
                lowerCase = SearchCategory$Companion.SPOT;
            }
            iUnifyAccountService.mo64997m(frameLayout, lowerCase, this.f20513W);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final void m21985m3(int i11, boolean z11) {
        RecyclerView.Adapter adapter;
        List<MenuItem> data;
        RecyclerView recyclerView;
        C45388j c45388jM21983j3 = m21983j3();
        BaseQuickAdapter baseQuickAdapter = null;
        if (c45388jM21983j3 != null && (recyclerView = c45388jM21983j3.f102154b) != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof BaseQuickAdapter) {
            baseQuickAdapter = (BaseQuickAdapter) adapter;
        }
        if (baseQuickAdapter != null && (data = baseQuickAdapter.getData()) != null) {
            for (MenuItem menuItem : data) {
                if (menuItem.getId() == i11) {
                    menuItem.m54363g(z11);
                    baseQuickAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setNeedLoadingView(false);
    }
}
