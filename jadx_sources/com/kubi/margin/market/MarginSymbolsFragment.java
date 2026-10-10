package com.kubi.margin.market;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$color;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p206dp.C36916h0;
import p739ww.C45938b;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginSymbolsFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010&\u001a\u00020\u0010H\u0014J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010.\u001a\u00020(H\u0016J\b\u0010/\u001a\u00020(H\u0002J\b\u00100\u001a\u00020(H\u0002J\f\u00101\u001a\u00020(*\u000202H\u0002J\u0010\u00103\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R5\u0010\u001a\u001a\u001c\u0012\t\u0012\u00070\u001c¢\u0006\u0002\b\u001d0\u001bj\r\u0012\t\u0012\u00070\u001c¢\u0006\u0002\b\u001d`\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001f\u0010 R+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\u001bj\b\u0012\u0004\u0012\u00020#`\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b$\u0010 ¨\u00067"}, m90084d2 = {"Lcom/kubi/margin/market/MarginSymbolsFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentSymbolsBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentSymbolsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isMarket", "", "()Z", "isMarket$delegate", "Lkotlin/Lazy;", "initTradeType", "", "getInitTradeType", "()I", "initTradeType$delegate", "tradeType", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean$delegate", "tabTitleList", "Ljava/util/ArrayList;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlin/collections/ArrayList;", "getTabTitleList", "()Ljava/util/ArrayList;", "tabTitleList$delegate", "tabFragments", "Lcom/kubi/margin/market/MarginToggleSymbolsFragment;", "getTabFragments", "tabFragments$delegate", "getLayout", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "initTabFragment", "initEditSearch", "subscribeSearchTextChange", "Landroid/widget/TextView;", "getCurrentTradeType", "getCurrentPosition", "SearchTextChangeListener", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginSymbolsFragment.kt\ncom/kubi/margin/market/MarginSymbolsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n147#2,16:172\n1869#3,2:188\n*S KotlinDebug\n*F\n+ 1 MarginSymbolsFragment.kt\ncom/kubi/margin/market/MarginSymbolsFragment\n*L\n54#1:172,16\n152#1:188,2\n*E\n"})
public final class MarginSymbolsFragment extends OldBaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginSymbolsFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentSymbolsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final InterfaceC24293a binding$delegate = C45681e.m100799e(this, new Function1<MarginSymbolsFragment, C36916h0>() { // from class: com.kubi.margin.market.MarginSymbolsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36916h0 invoke(@NotNull MarginSymbolsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36916h0.m82701a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36916h0, Unit>() { // from class: com.kubi.margin.market.MarginSymbolsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36916h0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36916h0 c36916h0) {
            invoke(c36916h0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: isMarket$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isMarket = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.t0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginSymbolsFragment.isMarket_delegate$lambda$1(this.f33453b));
        }
    });

    /* JADX INFO: renamed from: initTradeType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initTradeType = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.u0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginSymbolsFragment.initTradeType_delegate$lambda$2(this.f33571b));
        }
    });
    private int tradeType = 1;

    /* JADX INFO: renamed from: tradeItemBean$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tradeItemBean = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.v0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginSymbolsFragment.tradeItemBean_delegate$lambda$3(this.f33575b);
        }
    });

    /* JADX INFO: renamed from: tabTitleList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabTitleList = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.w0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginSymbolsFragment.tabTitleList_delegate$lambda$4(this.f33579b);
        }
    });

    /* JADX INFO: renamed from: tabFragments$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabFragments = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginSymbolsFragment.tabFragments_delegate$lambda$5(this.f33584b);
        }
    });

    /* JADX INFO: compiled from: MarginSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/margin/market/MarginSymbolsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/MarginSymbolsFragment;", "tradeType", "", "isMarket", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ MarginSymbolsFragment newInstance$default(Companion companion, int i11, boolean z11, TradeItemBean tradeItemBean, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = 1;
            }
            if ((i12 & 2) != 0) {
                z11 = false;
            }
            if ((i12 & 4) != 0) {
                tradeItemBean = null;
            }
            return companion.newInstance(i11, z11, tradeItemBean);
        }

        @JvmStatic
        @NotNull
        public final MarginSymbolsFragment newInstance(int tradeType, boolean isMarket, @Nullable TradeItemBean tradeItemBean) {
            MarginSymbolsFragment marginSymbolsFragment = new MarginSymbolsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BaseFragment.FRAGMENT_BACK, R$color.c_overlay);
            bundle.putInt("tradeType", tradeType);
            bundle.putBoolean("isMarket", isMarket);
            bundle.putParcelable("tradeItemBean", tradeItemBean);
            marginSymbolsFragment.setArguments(bundle);
            return marginSymbolsFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginSymbolsFragment$a */
    /* JADX INFO: compiled from: MarginSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/market/MarginSymbolsFragment$SearchTextChangeListener;", "", "onSearchTextChange", "", "text", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC17778a {
        void onSearchTextChange(@Nullable CharSequence text);
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginSymbolsFragment$b */
    /* JADX INFO: compiled from: MarginSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/market/MarginSymbolsFragment$initTabFragment$2", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginSymbolsFragment.kt\ncom/kubi/margin/market/MarginSymbolsFragment$initTabFragment$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class C17779b extends C45938b {
        public C17779b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            RtlViewPager rtlViewPager;
            SlidingTabLayout slidingTabLayout;
            RtlViewPager rtlViewPager2;
            super.mo18273b(i11);
            C36916h0 binding = MarginSymbolsFragment.this.getBinding();
            if (binding != null && (rtlViewPager2 = binding.f81730e) != null) {
                int currentItem = rtlViewPager2.getCurrentItem();
                MarginSymbolsFragment marginSymbolsFragment = MarginSymbolsFragment.this;
                MarginToggleSymbolsFragment marginToggleSymbolsFragment = (MarginToggleSymbolsFragment) CollectionsKt.getOrNull(marginSymbolsFragment.getTabFragments(), currentItem);
                if (marginToggleSymbolsFragment != null) {
                    C27032f.m66615f(marginSymbolsFragment, marginToggleSymbolsFragment);
                }
            }
            C36916h0 binding2 = MarginSymbolsFragment.this.getBinding();
            if (binding2 != null && (slidingTabLayout = binding2.f81729d) != null) {
                slidingTabLayout.setCurrentTab(i11);
            }
            C36916h0 binding3 = MarginSymbolsFragment.this.getBinding();
            if (binding3 != null && (rtlViewPager = binding3.f81730e) != null) {
                rtlViewPager.setCurrentItem(i11);
            }
            MarginSymbolsFragment marginSymbolsFragment2 = MarginSymbolsFragment.this;
            marginSymbolsFragment2.tradeType = marginSymbolsFragment2.getCurrentTradeType(i11);
            MarginToggleSymbolsFragment marginToggleSymbolsFragment2 = (MarginToggleSymbolsFragment) CollectionsKt.getOrNull(MarginSymbolsFragment.this.getTabFragments(), i11);
            if (marginToggleSymbolsFragment2 != null) {
                C27032f.m66627r(MarginSymbolsFragment.this, marginToggleSymbolsFragment2);
            }
        }
    }

    private final int getCurrentPosition(int tradeType) {
        return (tradeType == 1 || tradeType != 2) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentTradeType(int tradeType) {
        return (tradeType == 0 || tradeType != 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C36916h0 getBinding() {
        return (C36916h0) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final int getInitTradeType() {
        return ((Number) this.initTradeType.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<MarginToggleSymbolsFragment> getTabFragments() {
        return (ArrayList) this.tabFragments.getValue();
    }

    private final ArrayList<String> getTabTitleList() {
        return (ArrayList) this.tabTitleList.getValue();
    }

    private final TradeItemBean getTradeItemBean() {
        return (TradeItemBean) this.tradeItemBean.getValue();
    }

    private final void initTabFragment() {
        RtlViewPager rtlViewPager;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        RtlViewPager rtlViewPager2;
        SlidingTabLayout slidingTabLayout3;
        RtlViewPager rtlViewPager3;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C27103z c27103z = new C27103z(childFragmentManager, getTabFragments(), getTabTitleList());
        C36916h0 binding = getBinding();
        if (binding != null && (rtlViewPager3 = binding.f81730e) != null) {
            rtlViewPager3.setAdapter(c27103z);
        }
        C36916h0 binding2 = getBinding();
        if (binding2 != null && (slidingTabLayout3 = binding2.f81729d) != null) {
            C36916h0 binding3 = getBinding();
            slidingTabLayout3.setViewPager(binding3 != null ? binding3.f81730e : null);
        }
        C36916h0 binding4 = getBinding();
        if (binding4 != null && (rtlViewPager2 = binding4.f81730e) != null) {
            rtlViewPager2.setOffscreenPageLimit(getTabFragments().size());
        }
        C36916h0 binding5 = getBinding();
        if (binding5 != null && (slidingTabLayout2 = binding5.f81729d) != null) {
            slidingTabLayout2.setOnTabSelectListener(new C17779b());
        }
        int currentPosition = getCurrentPosition(getInitTradeType());
        C36916h0 binding6 = getBinding();
        if (binding6 != null && (slidingTabLayout = binding6.f81729d) != null) {
            slidingTabLayout.setCurrentTab(currentPosition);
        }
        C36916h0 binding7 = getBinding();
        if (binding7 == null || (rtlViewPager = binding7.f81730e) == null) {
            return;
        }
        rtlViewPager.setCurrentItem(currentPosition);
    }

    private final boolean isMarket() {
        return ((Boolean) this.isMarket.getValue()).booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final MarginSymbolsFragment newInstance(int i11, boolean z11, @Nullable TradeItemBean tradeItemBean) {
        return INSTANCE.newInstance(i11, z11, tradeItemBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList tabFragments_delegate$lambda$5(MarginSymbolsFragment marginSymbolsFragment) {
        MarginToggleSymbolsFragment.Companion companion = MarginToggleSymbolsFragment.INSTANCE;
        return CollectionsKt.arrayListOf(companion.newInstance(1, marginSymbolsFragment.isMarket(), marginSymbolsFragment.getTradeItemBean()), companion.newInstance(2, marginSymbolsFragment.isMarket(), marginSymbolsFragment.getTradeItemBean()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList tabTitleList_delegate$lambda$4(MarginSymbolsFragment marginSymbolsFragment) {
        return CollectionsKt.arrayListOf(marginSymbolsFragment.getString(R$string.margin_cross_title), marginSymbolsFragment.getString(R$string.margin_isolated_title));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_symbols;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initTabFragment();
        initEditSearch();
    }

    private final void initEditSearch() {
        CharSequence charSequenceTrim;
        C36916h0 binding;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        ClearEditText clearEditText3;
        Editable text;
        ClearEditText clearEditText4;
        C36916h0 binding2 = getBinding();
        if (binding2 != null && (clearEditText4 = binding2.f81727b) != null) {
            subscribeSearchTextChange(clearEditText4);
        }
        C36916h0 binding3 = getBinding();
        Editable text2 = null;
        if (binding3 != null && (clearEditText3 = binding3.f81727b) != null && (text = clearEditText3.getText()) != null) {
            charSequenceTrim = StringsKt.trim(text);
        } else {
            charSequenceTrim = null;
        }
        if (charSequenceTrim != null && charSequenceTrim.length() != 0 && (binding = getBinding()) != null && (clearEditText = binding.f81727b) != null) {
            C36916h0 binding4 = getBinding();
            if (binding4 != null && (clearEditText2 = binding4.f81727b) != null) {
                text2 = clearEditText2.getText();
            }
            clearEditText.setText(text2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initTradeType_delegate$lambda$2(MarginSymbolsFragment marginSymbolsFragment) {
        Integer numValueOf;
        Bundle arguments = marginSymbolsFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMarket_delegate$lambda$1(MarginSymbolsFragment marginSymbolsFragment) {
        Boolean boolValueOf;
        Bundle arguments = marginSymbolsFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isMarket"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    private final void subscribeSearchTextChange(TextView textView) {
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(textView);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginSymbolsFragment.subscribeSearchTextChange$lambda$9(this.f33588b, (CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.margin.market.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginSymbolsFragment.subscribeSearchTextChange$lambda$11((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeSearchTextChange$lambda$11(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeSearchTextChange$lambda$9(MarginSymbolsFragment marginSymbolsFragment, CharSequence charSequence) {
        InterfaceC17778a interfaceC17778a;
        List<Fragment> fragments = marginSymbolsFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof InterfaceC17778a) {
                interfaceC17778a = (InterfaceC17778a) activityResultCaller;
            } else {
                interfaceC17778a = null;
            }
            if (interfaceC17778a != null) {
                interfaceC17778a.onSearchTextChange(charSequence);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeItemBean tradeItemBean_delegate$lambda$3(MarginSymbolsFragment marginSymbolsFragment) {
        Bundle arguments = marginSymbolsFragment.getArguments();
        if (arguments != null) {
            return (TradeItemBean) arguments.getParcelable("tradeItemBean");
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.tradeType = getInitTradeType();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        Editable text;
        C36916h0 binding;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        super.onHide();
        C36916h0 binding2 = getBinding();
        if (binding2 != null && (clearEditText2 = binding2.f81727b) != null) {
            text = clearEditText2.getText();
        } else {
            text = null;
        }
        if (!TextUtils.isEmpty(text) && (binding = getBinding()) != null && (clearEditText = binding.f81727b) != null) {
            clearEditText.setText("");
        }
    }
}
