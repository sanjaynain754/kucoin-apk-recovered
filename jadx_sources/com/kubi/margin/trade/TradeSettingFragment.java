package com.kubi.margin.trade;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.view.TradeSettingOptionGroupView;
import com.kubi.margin.view.TradeSettingOptionItemView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utaspot.api.IUtaSpotService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p206dp.C36948x0;
import p402kf.C41016c;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TradeSettingFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u00020\u000bH\u0002J\b\u00109\u001a\u000204H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0013\u0010\u0015R!\u0010\u0017\u001a\u00020\u00188@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b&\u0010\rR\u001b\u0010(\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b)\u0010\rR\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b1\u0010.¨\u0006;"}, m90084d2 = {"Lcom/kubi/margin/trade/TradeSettingFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "fragmentTradeSettingBinding", "Lcom/kubi/margin/databinding/FragmentTradeSettingBinding;", "getFragmentTradeSettingBinding", "()Lcom/kubi/margin/databinding/FragmentTradeSettingBinding;", "fragmentTradeSettingBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromType", "", "getFromType", "()Ljava/lang/String;", "fromType$delegate", "Lkotlin/Lazy;", "spm", "getSpm", "spm$delegate", "isGrid", "", "()Z", "isGrid$delegate", "tradeSettingViewModel", "Lcom/kubi/margin/trade/TradeSettingViewModel;", "getTradeSettingViewModel$MarginLib_googleRelease$annotations", "getTradeSettingViewModel$MarginLib_googleRelease", "()Lcom/kubi/margin/trade/TradeSettingViewModel;", "tradeSettingViewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "startString", "getStartString", "startString$delegate", "endString", "getEndString", "endString$delegate", "tradePanelPositionImgStart", "", "getTradePanelPositionImgStart", "()I", "tradePanelPositionImgStart$delegate", "tradePanelPositionImgEnd", "getTradePanelPositionImgEnd", "tradePanelPositionImgEnd$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "setPanelAndPositionDesc", "buildPanelDescStr", "initViewModels", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSettingFragment.kt\ncom/kubi/margin/trade/TradeSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,226:1\n147#2,16:227\n106#3,15:243\n536#4:258\n521#4,6:259\n126#5:265\n153#5,3:266\n*S KotlinDebug\n*F\n+ 1 TradeSettingFragment.kt\ncom/kubi/margin/trade/TradeSettingFragment\n*L\n44#1:227,16\n59#1:243,15\n147#1:258\n147#1:259,6\n149#1:265\n149#1:266,3\n*E\n"})
public final class TradeSettingFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33700U = C45681e.m100799e(this, new Function1<TradeSettingFragment, C36948x0>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36948x0 invoke(@NotNull TradeSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36948x0.m82765a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36948x0, Unit>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36948x0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36948x0 c36948x0) {
            invoke(c36948x0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33701V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.d5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSettingFragment.m39938x3(this.f33745b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33702W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.g5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSettingFragment.m39921Q3(this.f33928b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33703X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.h5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeSettingFragment.m39920O3(this.f33935b));
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33704Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33705Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f33706a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f33707b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f33708c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f33699e0 = {Reflection.property1(new PropertyReference1Impl(TradeSettingFragment.class, "fragmentTradeSettingBinding", "getFragmentTradeSettingBinding()Lcom/kubi/margin/databinding/FragmentTradeSettingBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f33698d0 = new Companion(null);

    /* JADX INFO: compiled from: TradeSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/margin/trade/TradeSettingFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.TradeSettingFragment$a */
    /* JADX INFO: compiled from: TradeSettingFragment.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/trade/TradeSettingFragment$initViews$1$1$1", "Lcom/kubi/margin/view/TradeSettingOptionGroupView$OnItemSelectedListener;", "onItemSelected", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/margin/view/TradeSettingOptionItemView;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18172a implements TradeSettingOptionGroupView.InterfaceC18595b {
        public C18172a() {
        }

        @Override // com.kubi.margin.view.TradeSettingOptionGroupView.InterfaceC18595b
        /* JADX INFO: renamed from: a */
        public void mo39950a(TradeSettingOptionItemView view) throws JSONException {
            Intrinsics.checkNotNullParameter(view, "view");
            TradeSettingFragment.this.m39944F3().m40346r(view.getF34268c());
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.TradeSettingFragment$b */
    /* JADX INFO: compiled from: TradeSettingFragment.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/trade/TradeSettingFragment$initViews$1$2$1", "Lcom/kubi/margin/view/TradeSettingOptionGroupView$OnItemSelectedListener;", "onItemSelected", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/margin/view/TradeSettingOptionItemView;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18173b implements TradeSettingOptionGroupView.InterfaceC18595b {
        public C18173b() {
        }

        @Override // com.kubi.margin.view.TradeSettingOptionGroupView.InterfaceC18595b
        /* JADX INFO: renamed from: a */
        public void mo39950a(TradeSettingOptionItemView view) throws JSONException {
            Intrinsics.checkNotNullParameter(view, "view");
            TradeSettingFragment.this.m39944F3().m40345q(view.getF34268c());
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.TradeSettingFragment$c */
    /* JADX INFO: compiled from: TradeSettingFragment.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18174c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33711b;

        public C18174c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33711b = function;
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
            return this.f33711b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33711b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m39918L3(final TradeSettingFragment tradeSettingFragment) {
        ConcurrentSkipListMap<String, FiatCurrencyEntity> currencyUnitMap = C41016c.f91251h;
        Intrinsics.checkNotNullExpressionValue(currencyUnitMap, "currencyUnitMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, FiatCurrencyEntity> entry : currencyUnitMap.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "CNY")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            FiatCurrencyEntity fiatCurrencyEntity = (FiatCurrencyEntity) entry2.getValue();
            String icon = null;
            String strValueOf = String.valueOf(fiatCurrencyEntity != null ? fiatCurrencyEntity.getName() : null);
            boolean zAreEqual = Intrinsics.areEqual(C41016c.m89965c(), entry2.getKey());
            FiatCurrencyEntity fiatCurrencyEntity2 = (FiatCurrencyEntity) entry2.getValue();
            if (fiatCurrencyEntity2 != null) {
                icon = fiatCurrencyEntity2.getIcon();
            }
            arrayList.add(new SelectEntity(null, strValueOf, null, null, icon, null, null, null, null, false, zAreEqual, null, 3053, null));
        }
        DialogFragmentHelper dialogFragmentHelperM59007e0 = BottomSheetDialogHelper.f48599a.m59007e0(arrayList, new BiConsumer() { // from class: com.kubi.margin.trade.f5
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                TradeSettingFragment.m39919M3(this.f33922b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        });
        FragmentManager childFragmentManager = tradeSettingFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM59007e0.show(childFragmentManager, "currency_unit_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final String m39939A3() {
        return (String) this.f33701V.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public final String m39940B3() {
        return (String) this.f33702W.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    public final String m39941C3() {
        return (String) this.f33705Z.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final int m39942D3() {
        return ((Number) this.f33708c0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: E3 */
    public final int m39943E3() {
        return ((Number) this.f33707b0.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: F3 */
    public final TradeSettingViewModel m39944F3() {
        return (TradeSettingViewModel) this.f33704Y.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final boolean m39945N3() {
        return ((Boolean) this.f33703X.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_trade_setting, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m39917K3();
        m39913G3();
    }

    /* JADX INFO: renamed from: v3 */
    public final String m39947v3() {
        StringBuilder sb2 = new StringBuilder();
        String str = MultiLanguageManager.m56980j() ? "、" : ", ";
        if (C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            sb2.append(getString(R$string.futures));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            if (sb2.length() > 0) {
                sb2.append(str);
            }
            sb2.append(getString(R$string.margin));
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Spot)) {
            if (sb2.length() > 0) {
                sb2.append(str);
            }
            sb2.append(getString(R$string.spot));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: y3 */
    public final String m39948y3() {
        return (String) this.f33706a0.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final C36948x0 m39949z3() {
        return (C36948x0) this.f33700U.getValue(this, f33699e0[0]);
    }

    public TradeSettingFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewModels$default$2
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
        this.f33704Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TradeSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.trade.TradeSettingFragment$special$$inlined$viewModels$default$5
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
        this.f33705Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.i5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSettingFragment.m39922R3(this.f33940b);
            }
        });
        this.f33706a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.j5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSettingFragment.m39937w3(this.f33946b);
            }
        });
        this.f33707b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.k5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(TradeSettingFragment.m39924T3());
            }
        });
        this.f33708c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.l5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(TradeSettingFragment.m39923S3());
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    private final void m39913G3() {
        m39944F3().m40344p().observe(getViewLifecycleOwner(), new C18174c(new Function1() { // from class: com.kubi.margin.trade.n5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSettingFragment.m39914H3(this.f33973b, (Integer) obj);
            }
        }));
        m39944F3().m40343o().observe(getViewLifecycleOwner(), new C18174c(new Function1() { // from class: com.kubi.margin.trade.o5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSettingFragment.m39915I3(this.f33978b, (Integer) obj);
            }
        }));
        m39944F3().m40342n().observe(getViewLifecycleOwner(), new C18174c(new Function1() { // from class: com.kubi.margin.trade.e5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSettingFragment.m39916J3(this.f33879b, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m39914H3(TradeSettingFragment tradeSettingFragment, Integer num) {
        TradeSettingOptionGroupView tradeSettingOptionGroupView;
        C36948x0 c36948x0M39949z3 = tradeSettingFragment.m39949z3();
        if (c36948x0M39949z3 != null && (tradeSettingOptionGroupView = c36948x0M39949z3.f82049f) != null) {
            Intrinsics.checkNotNull(num);
            tradeSettingOptionGroupView.m40713d(num.intValue(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m39915I3(TradeSettingFragment tradeSettingFragment, Integer num) {
        TradeSettingOptionGroupView tradeSettingOptionGroupView;
        C36948x0 c36948x0M39949z3 = tradeSettingFragment.m39949z3();
        if (c36948x0M39949z3 != null && (tradeSettingOptionGroupView = c36948x0M39949z3.f82047d) != null) {
            Intrinsics.checkNotNull(num);
            tradeSettingOptionGroupView.m40713d(num.intValue(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m39916J3(TradeSettingFragment tradeSettingFragment, String str) {
        BaseTextView baseTextView;
        C36948x0 c36948x0M39949z3 = tradeSettingFragment.m39949z3();
        if (c36948x0M39949z3 != null && (baseTextView = c36948x0M39949z3.f82054k) != null) {
            baseTextView.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    private final void m39917K3() {
        ViewGroup viewGroup;
        C36948x0 c36948x0M39949z3 = m39949z3();
        if (c36948x0M39949z3 != null) {
            if (C27025c.m66566d(Boolean.valueOf(m39945N3()))) {
                ConstraintLayout tradePanelPositionLayout = c36948x0M39949z3.f82050g;
                Intrinsics.checkNotNullExpressionValue(tradePanelPositionLayout, "tradePanelPositionLayout");
                ViewExtKt.m66577h(tradePanelPositionLayout);
            } else {
                ConstraintLayout tradePanelPositionLayout2 = c36948x0M39949z3.f82050g;
                Intrinsics.checkNotNullExpressionValue(tradePanelPositionLayout2, "tradePanelPositionLayout");
                ViewExtKt.m66594y(tradePanelPositionLayout2);
            }
            c36948x0M39949z3.f82054k.setText(C41016c.m89965c());
            TradeSettingOptionGroupView tradeSettingOptionGroupView = c36948x0M39949z3.f82049f;
            tradeSettingOptionGroupView.setItems(CollectionsKt.listOf((Object[]) new TradeSettingOptionGroupView.ItemConfig[]{new TradeSettingOptionGroupView.ItemConfig(0, m39943E3(), m39941C3()), new TradeSettingOptionGroupView.ItemConfig(1, m39942D3(), m39948y3())}));
            tradeSettingOptionGroupView.setOnItemSelectedListener(new C18172a());
            TradeSettingOptionGroupView tradeSettingOptionGroupView2 = c36948x0M39949z3.f82047d;
            int i11 = R$drawable.bmargin_chart_at_top;
            String string = getString(R$string.on_top);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            TradeSettingOptionGroupView.ItemConfig itemConfig = new TradeSettingOptionGroupView.ItemConfig(0, i11, string);
            int i12 = R$drawable.bmargin_chart_at_bottom;
            String string2 = getString(R$string.on_bottom);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            TradeSettingOptionGroupView.ItemConfig itemConfig2 = new TradeSettingOptionGroupView.ItemConfig(1, i12, string2);
            int i13 = R$drawable.bmargin_chart_hide;
            String string3 = getString(R$string.undisplay);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            tradeSettingOptionGroupView2.setItems(CollectionsKt.listOf((Object[]) new TradeSettingOptionGroupView.ItemConfig[]{itemConfig, itemConfig2, new TradeSettingOptionGroupView.ItemConfig(2, i13, string3)}));
            tradeSettingOptionGroupView2.setOnItemSelectedListener(new C18173b());
            FrameLayout flCurrency = c36948x0M39949z3.f82045b;
            Intrinsics.checkNotNullExpressionValue(flCurrency, "flCurrency");
            C27046k.m66711z(flCurrency, 0L, new Function0() { // from class: com.kubi.margin.trade.m5
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeSettingFragment.m39918L3(this.f33967b);
                }
            }, 1, null);
        }
        IUtaSpotService iUtaSpotService = IUtaSpotService.f54014a.get();
        View view = getView();
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R$id.unifyDoubleCheckContainer);
        } else {
            viewGroup = null;
        }
        iUtaSpotService.mo65992e(viewGroup, m39939A3(), m39940B3());
        m39946P3();
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m39919M3(TradeSettingFragment tradeSettingFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws JSONException {
        tradeSettingFragment.m39944F3().m40348t(interfaceC24339a.getLabel().toString());
    }

    /* JADX INFO: renamed from: O3 */
    public static final boolean m39920O3(TradeSettingFragment tradeSettingFragment) {
        Bundle arguments = tradeSettingFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56250h(arguments, "isGrid");
        }
        if (!Intrinsics.areEqual(tradeSettingFragment.m39939A3(), "spotGrid") && !Intrinsics.areEqual(tradeSettingFragment.m39939A3(), "futuresGrid")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final String m39921Q3(TradeSettingFragment tradeSettingFragment) {
        String strM56284y;
        Bundle arguments = tradeSettingFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "spm");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: R3 */
    public static final String m39922R3(TradeSettingFragment tradeSettingFragment) {
        int i11;
        if (C5303w0.m6511a()) {
            i11 = R$string.on_right;
        } else {
            i11 = R$string.on_left;
        }
        return tradeSettingFragment.getString(i11);
    }

    /* JADX INFO: renamed from: S3 */
    public static final int m39923S3() {
        if (C5303w0.m6511a()) {
            return R$drawable.bmargin_trade_at_left;
        }
        return R$drawable.bmargin_trade_at_right;
    }

    /* JADX INFO: renamed from: T3 */
    public static final int m39924T3() {
        if (C5303w0.m6511a()) {
            return R$drawable.bmargin_trade_at_right;
        }
        return R$drawable.bmargin_trade_at_left;
    }

    /* JADX INFO: renamed from: w3 */
    public static final String m39937w3(TradeSettingFragment tradeSettingFragment) {
        int i11;
        if (C5303w0.m6511a()) {
            i11 = R$string.on_left;
        } else {
            i11 = R$string.on_right;
        }
        return tradeSettingFragment.getString(i11);
    }

    /* JADX INFO: renamed from: x3 */
    public static final String m39938x3(TradeSettingFragment tradeSettingFragment) {
        String strM56284y;
        Bundle arguments = tradeSettingFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fromType");
        } else {
            strM56284y = null;
        }
        return C27041f.m66669i(strM56284y, SearchCategory$Companion.SPOT);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m39946P3() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        String strM39947v3 = m39947v3();
        if (TextUtils.isEmpty(strM39947v3)) {
            C36948x0 c36948x0M39949z3 = m39949z3();
            if (c36948x0M39949z3 != null && (baseTextView6 = c36948x0M39949z3.f82056m) != null) {
                baseTextView6.setVisibility(4);
            }
            C36948x0 c36948x0M39949z4 = m39949z3();
            if (c36948x0M39949z4 != null && (baseTextView5 = c36948x0M39949z4.f82053j) != null) {
                baseTextView5.setVisibility(4);
                return;
            }
            return;
        }
        C36948x0 c36948x0M39949z5 = m39949z3();
        if (c36948x0M39949z5 != null && (baseTextView4 = c36948x0M39949z5.f82056m) != null) {
            baseTextView4.setVisibility(0);
        }
        C36948x0 c36948x0M39949z6 = m39949z3();
        if (c36948x0M39949z6 != null && (baseTextView3 = c36948x0M39949z6.f82053j) != null) {
            baseTextView3.setVisibility(0);
        }
        String stringRes = getStringRes(R$string.kc_trade_setting_active, strM39947v3);
        C36948x0 c36948x0M39949z7 = m39949z3();
        if (c36948x0M39949z7 != null && (baseTextView2 = c36948x0M39949z7.f82056m) != null) {
            baseTextView2.setText(stringRes);
        }
        C36948x0 c36948x0M39949z8 = m39949z3();
        if (c36948x0M39949z8 != null && (baseTextView = c36948x0M39949z8.f82053j) != null) {
            baseTextView.setText(stringRes);
        }
    }
}
