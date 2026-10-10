package com.kubi.kumex.trade.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.trade.menu.p092vm.CampaignActivityViewModel;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36778i2;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p569qq.C43852m;
import p667um.C45263a;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CampaignFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u001fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/CampaignFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesMoreCampaignBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesMoreCampaignBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "campaignActivityViewModel", "Lcom/kubi/kumex/trade/menu/vm/CampaignActivityViewModel;", "getCampaignActivityViewModel", "()Lcom/kubi/kumex/trade/menu/vm/CampaignActivityViewModel;", "campaignActivityViewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/kumex/data/platform/model/Article;", "Lio/chad/library/adapter/base/BaseViewHolder;", "curPage", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "initObservers", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCampaignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignFragment.kt\ncom/kubi/kumex/trade/menu/CampaignFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,156:1\n147#2,16:157\n106#3,15:173\n*S KotlinDebug\n*F\n+ 1 CampaignFragment.kt\ncom/kubi/kumex/trade/menu/CampaignFragment\n*L\n40#1:157,16\n45#1:173,15\n*E\n"})
public final class CampaignFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f30564Y = {Reflection.property1(new PropertyReference1Impl(CampaignFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesMoreCampaignBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f30565U = C45681e.m100799e(this, new Function1<CampaignFragment, C36778i2>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36778i2 invoke(@NotNull CampaignFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36778i2.m82414a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36778i2, Unit>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36778i2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36778i2 c36778i2) {
            invoke(c36778i2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f30566V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public BaseQuickAdapter<Article, BaseViewHolder> f30567W;

    /* JADX INFO: renamed from: X */
    public int f30568X;

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.CampaignFragment$a */
    /* JADX INFO: compiled from: CampaignFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16907a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f30569b;

        public C16907a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30569b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f30569b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30569b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.CampaignFragment$initView$2 */
    /* JADX INFO: compiled from: CampaignFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/trade/menu/CampaignFragment$initView$2", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/kumex/data/platform/model/Article;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "article", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C169082 extends BaseQuickAdapter<Article, BaseViewHolder> {
        public C169082(int i11) {
            super(i11);
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder helper, final Article article) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(article, "article");
            helper.setText(R$id.titleTv, article.getTitle());
            helper.setText(R$id.timeTv, C42179a.m92633f(C27039d.m66652l(article.getFirstPublishAt()) * ((long) 1000), null, false, false, null, 15, null));
            View itemView = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            final CampaignFragment campaignFragment = CampaignFragment.this;
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.kumex.trade.menu.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CampaignFragment.C169082.m36327i(article, campaignFragment);
                }
            }, 1, null);
            RoundImageView roundImageView = (RoundImageView) helper.getView(R$id.activityIv);
            C46341d c46341dM102152b = C46338a.m102152b(roundImageView);
            List<String> images = article.getImages();
            C46340c<Drawable> c46340cMo6634v = c46341dM102152b.mo6634v(images != null ? (String) CollectionsKt.firstOrNull((List) images) : null);
            int i11 = R$drawable.bkumex_img_placeholder_80_8r;
            c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(roundImageView);
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m36327i(Article article, CampaignFragment campaignFragment) {
            String str;
            C43852m.m96591c(C17060n0.m36552b(), "Futures_Campaign", "2", null, 8, null);
            C37304a c37304a = C37304a.f82764a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(HostManager.a.e());
            sb2.append("/announcement");
            sb2.append(article.getPath());
            sb2.append("?theme=");
            if (DayNightThemeManager.f28592a.m33187l()) {
                str = "light";
            } else {
                str = "dark";
            }
            sb2.append(str);
            sb2.append("&appNeedLang=true");
            InterfaceC37766r.a.m85190a(c37304a, sb2.toString(), null, null, null, null, null, null, 126, null);
            campaignFragment.getParentFragmentManager().setFragmentResult("key_dismiss_dialog", BundleKt.bundleOf());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m36306B3(CampaignFragment campaignFragment, View view) {
        campaignFragment.f30568X = 1;
        campaignFragment.m36325t3().m36391i(campaignFragment.f30568X, MultiLanguageManager.f46811g.getLocalString());
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m36319v3(CampaignFragment campaignFragment, List list) {
        BaseQuickAdapter<Article, BaseViewHolder> baseQuickAdapter = campaignFragment.f30567W;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.addData(list);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_futures_more_campaign, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m36318u3();
    }

    /* JADX INFO: renamed from: s3 */
    public final C36778i2 m36324s3() {
        return (C36778i2) this.f30565U.getValue(this, f30564Y[0]);
    }

    /* JADX INFO: renamed from: t3 */
    public final CampaignActivityViewModel m36325t3() {
        return (CampaignActivityViewModel) this.f30566V.getValue();
    }

    public CampaignFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewModels$default$2
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
        this.f30566V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CampaignActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.trade.menu.CampaignFragment$special$$inlined$viewModels$default$5
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
        this.f30568X = 1;
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m36305A3(final CampaignFragment campaignFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showFailView$default(campaignFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.trade.menu.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CampaignFragment.m36306B3(this.f30620b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m36307C3(CampaignFragment campaignFragment, Boolean bool) {
        if (bool.booleanValue()) {
            campaignFragment.f30568X--;
            BaseQuickAdapter<Article, BaseViewHolder> baseQuickAdapter = campaignFragment.f30567W;
            if (baseQuickAdapter != null) {
                baseQuickAdapter.loadMoreFail();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m36308D3(CampaignFragment campaignFragment) {
        CampaignActivityViewModel campaignActivityViewModelM36325t3 = campaignFragment.m36325t3();
        int i11 = campaignFragment.f30568X + 1;
        campaignFragment.f30568X = i11;
        campaignActivityViewModelM36325t3.m36391i(i11, MultiLanguageManager.f46811g.getLocalString());
    }

    private final void initView() {
        C36778i2 c36778i2M36324s3 = m36324s3();
        if (c36778i2M36324s3 != null) {
            c36778i2M36324s3.f80257b.setLayoutManager(new LinearLayoutManager(getContext()));
            Context context = getContext();
            if (context != null) {
                c36778i2M36324s3.f80257b.addItemDecoration(new C45263a(context));
            }
            C169082 c169082 = new C169082(R$layout.bkumex_item_futures_campaign_activity);
            this.f30567W = c169082;
            c169082.setLoadMoreView(new C23057g1());
            BaseQuickAdapter<Article, BaseViewHolder> baseQuickAdapter = this.f30567W;
            if (baseQuickAdapter != null) {
                baseQuickAdapter.bindToRecyclerView(c36778i2M36324s3.f80257b);
            }
            BaseQuickAdapter<Article, BaseViewHolder> baseQuickAdapter2 = this.f30567W;
            if (baseQuickAdapter2 != null) {
                baseQuickAdapter2.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.kumex.trade.menu.a
                    @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
                    public final void onLoadMoreRequested() {
                        CampaignFragment.m36308D3(this.f30580a);
                    }
                }, c36778i2M36324s3.f80257b);
            }
        }
    }

    /* JADX INFO: renamed from: u3 */
    private final void m36318u3() {
        m36325t3().m36396r().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36320w3(this.f30613b, (Boolean) obj);
            }
        }));
        m36325t3().m36397s().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36321x3(this.f30614b, (Boolean) obj);
            }
        }));
        m36325t3().m36393o().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36322y3(this.f30615b, (Boolean) obj);
            }
        }));
        m36325t3().m36398t().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36323z3(this.f30616b, (Boolean) obj);
            }
        }));
        m36325t3().m36394p().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36305A3(this.f30617b, (Boolean) obj);
            }
        }));
        m36325t3().m36395q().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36307C3(this.f30618b, (Boolean) obj);
            }
        }));
        m36325t3().m36392n().observe(getViewLifecycleOwner(), new C16907a(new Function1() { // from class: com.kubi.kumex.trade.menu.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CampaignFragment.m36319v3(this.f30619b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m36320w3(CampaignFragment campaignFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showLoadingView$default(campaignFragment, 0, 0, 3, null);
        } else {
            campaignFragment.showContentView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m36321x3(CampaignFragment campaignFragment, Boolean bool) {
        BaseQuickAdapter<Article, BaseViewHolder> baseQuickAdapter;
        if (!bool.booleanValue() && (baseQuickAdapter = campaignFragment.f30567W) != null) {
            baseQuickAdapter.loadMoreComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m36322y3(CampaignFragment campaignFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showEmptyView$default(campaignFragment, 0, 0, (View.OnClickListener) null, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m36323z3(CampaignFragment campaignFragment, Boolean bool) {
        BaseQuickAdapter<Article, BaseViewHolder> baseQuickAdapter;
        if (bool.booleanValue() && (baseQuickAdapter = campaignFragment.f30567W) != null) {
            baseQuickAdapter.loadMoreEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m36325t3().m36391i(this.f30568X, MultiLanguageManager.f46811g.getLocalString());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g(C17060n0.m36552b(), "Futures_Campaign", "1", null, 8, null);
    }
}
