package com.kubi.margin.market;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$color;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.LeverSymbol;
import com.kubi.margin.entity.LeverSymbolMarket;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36918i0;
import p569qq.C43852m;
import p698vp.C45618h;
import p739ww.C45938b;
import p768xo.InterfaceC46305f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: MarginToggleSymbolsFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010(\u001a\u00020\fH\u0014J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020*H\u0002J\u001c\u00100\u001a\u00020*2\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0302H\u0002J\u000e\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u0012J\u0012\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u000108H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0016\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010#\u001a\u0012\u0012\u0004\u0012\u00020$0 j\b\u0012\u0004\u0012\u00020$`\"¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001e\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00120 j\b\u0012\u0004\u0012\u00020\u0012`\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/margin/market/MarginToggleSymbolsFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/margin/market/MarginSymbolsFragment$SearchTextChangeListener;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentToggleSymbolsBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentToggleSymbolsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItemBean$delegate", "isMarket", "", "()Z", "isMarket$delegate", "tradeListAdapter", "Lcom/kubi/margin/market/MarginSymbolsListAdapter;", "getTradeListAdapter", "()Lcom/kubi/margin/market/MarginSymbolsListAdapter;", "tradeListAdapter$delegate", "tabFragments", "Ljava/util/ArrayList;", "Lcom/kubi/margin/market/MarginToggleSymbolsListFragment;", "Lkotlin/collections/ArrayList;", "leverSymbolList", "Lcom/kubi/margin/entity/LeverSymbolMarket;", "getLeverSymbolList", "()Ljava/util/ArrayList;", "totalTradeItemList", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleLever", "getLeverSymbolListData", "consumer", "Lio/reactivex/functions/Consumer;", "", "updateFavor", "item", "onSearchTextChange", "text", "", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,321:1\n147#2,16:322\n1#3:338\n32#4:339\n23#4,2:347\n774#5:340\n865#5,2:341\n160#6,4:343\n*S KotlinDebug\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment\n*L\n53#1:322,16\n256#1:339\n269#1:347,2\n146#1:340\n146#1:341,2\n259#1:343,4\n*E\n"})
public final class MarginToggleSymbolsFragment extends OldBaseFragment implements MarginSymbolsFragment.InterfaceC17778a {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginToggleSymbolsFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentToggleSymbolsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final InterfaceC24293a binding$delegate = C45681e.m100799e(this, new Function1<MarginToggleSymbolsFragment, C36918i0>() { // from class: com.kubi.margin.market.MarginToggleSymbolsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36918i0 invoke(@NotNull MarginToggleSymbolsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36918i0.m82704a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36918i0, Unit>() { // from class: com.kubi.margin.market.MarginToggleSymbolsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36918i0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36918i0 c36918i0) {
            invoke(c36918i0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: tradeType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tradeType = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginToggleSymbolsFragment.tradeType_delegate$lambda$1(this.f33282b));
        }
    });

    /* JADX INFO: renamed from: tradeItemBean$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tradeItemBean = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.i1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsFragment.tradeItemBean_delegate$lambda$2(this.f33287b);
        }
    });

    /* JADX INFO: renamed from: isMarket$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isMarket = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.j1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginToggleSymbolsFragment.isMarket_delegate$lambda$3(this.f33353b));
        }
    });

    /* JADX INFO: renamed from: tradeListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tradeListAdapter = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.k1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsFragment.tradeListAdapter_delegate$lambda$4(this.f33358b);
        }
    });

    @NotNull
    private final ArrayList<MarginToggleSymbolsListFragment> tabFragments = new ArrayList<>();

    @NotNull
    private final ArrayList<LeverSymbolMarket> leverSymbolList = new ArrayList<>();

    @NotNull
    private final ArrayList<TradeItemBean> totalTradeItemList = new ArrayList<>();

    /* JADX INFO: compiled from: MarginToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/margin/market/MarginToggleSymbolsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/MarginToggleSymbolsFragment;", "tradeType", "", "isMarket", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ MarginToggleSymbolsFragment newInstance$default(Companion companion, int i11, boolean z11, TradeItemBean tradeItemBean, int i12, Object obj) {
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
        public final MarginToggleSymbolsFragment newInstance(int tradeType, boolean isMarket, @Nullable TradeItemBean tradeItemBean) {
            MarginToggleSymbolsFragment marginToggleSymbolsFragment = new MarginToggleSymbolsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BaseFragment.FRAGMENT_BACK, R$color.c_overlay);
            bundle.putInt("tradeType", tradeType);
            bundle.putBoolean("isMarket", isMarket);
            bundle.putParcelable("tradeItemBean", tradeItemBean);
            marginToggleSymbolsFragment.setArguments(bundle);
            return marginToggleSymbolsFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17780a extends TypeToken<List<? extends LeverSymbolMarket>> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsFragment$b */
    /* JADX INFO: compiled from: MarginToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/market/MarginToggleSymbolsFragment$handleLever$1$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17781b extends C24223c1 {
        public C17781b() {
            super(null, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            SlidingTabLayout slidingTabLayout;
            SlidingTabLayout slidingTabLayout2;
            super.accept(th2);
            C36918i0 binding = MarginToggleSymbolsFragment.this.getBinding();
            if (binding != null && (slidingTabLayout2 = binding.f81737d) != null) {
                slidingTabLayout2.setCurrentTab(0);
            }
            C36918i0 binding2 = MarginToggleSymbolsFragment.this.getBinding();
            if (binding2 != null && (slidingTabLayout = binding2.f81737d) != null) {
                slidingTabLayout.m55291w();
            }
            MarginToggleSymbolsFragment.this.showContent();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsFragment$c */
    /* JADX INFO: compiled from: MarginToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/market/MarginToggleSymbolsFragment$onViewCreated$4", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment$onViewCreated$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class C17782c extends C45938b {
        public C17782c() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            RtlViewPager rtlViewPager;
            super.mo18273b(i11);
            if (MarginToggleSymbolsFragment.this.isMarket() && i11 == 1) {
                C43852m.m96591c("B4candle", ExifInterface.TAG_CONTRAST, null, null, 12, null);
            }
            C36918i0 binding = MarginToggleSymbolsFragment.this.getBinding();
            if (binding != null && (rtlViewPager = binding.f81738e) != null) {
                int currentItem = rtlViewPager.getCurrentItem();
                MarginToggleSymbolsFragment marginToggleSymbolsFragment = MarginToggleSymbolsFragment.this;
                MarginToggleSymbolsListFragment marginToggleSymbolsListFragment = (MarginToggleSymbolsListFragment) CollectionsKt.getOrNull(marginToggleSymbolsFragment.tabFragments, currentItem);
                if (marginToggleSymbolsListFragment != null) {
                    C27032f.m66615f(marginToggleSymbolsFragment, marginToggleSymbolsListFragment);
                }
            }
            MarginToggleSymbolsListFragment marginToggleSymbolsListFragment2 = (MarginToggleSymbolsListFragment) CollectionsKt.getOrNull(MarginToggleSymbolsFragment.this.tabFragments, i11);
            if (marginToggleSymbolsListFragment2 != null) {
                C27032f.m66627r(MarginToggleSymbolsFragment.this, marginToggleSymbolsListFragment2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsFragment$onSearchTextChange$1 */
    /* JADX INFO: compiled from: MarginToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.market.MarginToggleSymbolsFragment$onSearchTextChange$1", m90122f = "MarginToggleSymbolsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nMarginToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment$onSearchTextChange$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,321:1\n774#2:322\n865#2,2:323\n1374#2:325\n1460#2,5:326\n774#2:331\n865#2,2:332\n1617#2,9:334\n1869#2:343\n1870#2:346\n1626#2:347\n774#2:348\n865#2,2:349\n1056#2:351\n1#3:344\n1#3:345\n19#4,2:352\n*S KotlinDebug\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment$onSearchTextChange$1\n*L\n295#1:322\n295#1:323,2\n296#1:325\n296#1:326,5\n299#1:331\n299#1:332,2\n304#1:334,9\n304#1:343\n304#1:346\n304#1:347\n306#1:348\n306#1:349,2\n312#1:351\n304#1:345\n315#1:352,2\n*E\n"})
    public static final class C177831 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filterKey;
        int label;

        /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsFragment$onSearchTextChange$1$a */
        /* JADX INFO: compiled from: Comparisons.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment$onSearchTextChange$1\n*L\n1#1,328:1\n313#2:329\n*E\n"})
        public static final class a<T> implements Comparator {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f33220b;

            public a(String str) {
                this.f33220b = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                String showSymbol = ((TradeItemBean) t11).getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                Integer numValueOf = Integer.valueOf(StringsKt.indexOf((CharSequence) showSymbol, this.f33220b, 0, true));
                String showSymbol2 = ((TradeItemBean) t12).getShowSymbol();
                Intrinsics.checkNotNullExpressionValue(showSymbol2, "getShowSymbol(...)");
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(StringsKt.indexOf((CharSequence) showSymbol2, this.f33220b, 0, true)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C177831(String str, Continuation<? super C177831> continuation) {
            super(2, continuation);
            this.$filterKey = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginToggleSymbolsFragment.this.new C177831(this.$filterKey, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C177831) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final void m38855f(MarginToggleSymbolsFragment marginToggleSymbolsFragment, List list) {
            marginToggleSymbolsFragment.getTradeListAdapter().replaceData(list);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objPrevious;
            Boolean boolBoxBoolean;
            boolean z11;
            boolean zIsWholeMargin;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                int tradeType = MarginToggleSymbolsFragment.this.getTradeType();
                if (tradeType != 1 && tradeType != 2) {
                    ArrayList arrayList2 = MarginToggleSymbolsFragment.this.totalTradeItemList;
                    String str = this.$filterKey;
                    arrayList = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        String showSymbol = ((TradeItemBean) obj2).getShowSymbol();
                        Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                        if (StringsKt.contains((CharSequence) showSymbol, (CharSequence) str, true)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    ArrayList<LeverSymbolMarket> leverSymbolList = MarginToggleSymbolsFragment.this.getLeverSymbolList();
                    MarginToggleSymbolsFragment marginToggleSymbolsFragment = MarginToggleSymbolsFragment.this;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : leverSymbolList) {
                        LeverSymbolMarket leverSymbolMarket = (LeverSymbolMarket) obj3;
                        if (marginToggleSymbolsFragment.getTradeType() == 2) {
                            zIsWholeMargin = leverSymbolMarket.isSingleMargin();
                        } else {
                            zIsWholeMargin = leverSymbolMarket.isWholeMargin();
                        }
                        if (zIsWholeMargin) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(arrayList4, C27024b.m66560c(((LeverSymbolMarket) it.next()).getSymbols()));
                    }
                    String str2 = this.$filterKey;
                    ArrayList<LeverSymbol> arrayList5 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    while (true) {
                        Boolean boolBoxBoolean2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        LeverSymbol leverSymbol = (LeverSymbol) next;
                        String symbolCode = leverSymbol.getSymbolCode();
                        if (symbolCode != null) {
                            boolBoxBoolean = Boxing.boxBoolean(StringsKt.contains((CharSequence) symbolCode, (CharSequence) str2, true));
                        } else {
                            boolBoxBoolean = null;
                        }
                        if (!C27025c.m66566d(boolBoxBoolean)) {
                            String symbolName = leverSymbol.getSymbolName();
                            if (symbolName != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(StringsKt.contains((CharSequence) symbolName, (CharSequence) str2, true));
                            }
                            if (!C27025c.m66566d(boolBoxBoolean2)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            arrayList5.add(next);
                        }
                    }
                    MarginToggleSymbolsFragment marginToggleSymbolsFragment2 = MarginToggleSymbolsFragment.this;
                    ArrayList arrayList6 = new ArrayList();
                    for (LeverSymbol leverSymbol2 : arrayList5) {
                        ArrayList arrayList7 = marginToggleSymbolsFragment2.totalTradeItemList;
                        ListIterator listIterator = arrayList7.listIterator(arrayList7.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                            } else {
                                objPrevious = null;
                                break;
                            }
                        } while (!Intrinsics.areEqual(((TradeItemBean) objPrevious).getSymbol(), leverSymbol2.getSymbolCode()));
                        TradeItemBean tradeItemBean = (TradeItemBean) objPrevious;
                        if (tradeItemBean != null) {
                            arrayList6.add(tradeItemBean);
                        }
                    }
                    arrayList = arrayList6;
                }
                final List listSortedWith = CollectionsKt.sortedWith(arrayList, new a(this.$filterKey));
                final MarginToggleSymbolsFragment marginToggleSymbolsFragment3 = MarginToggleSymbolsFragment.this;
                C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.margin.market.m1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MarginToggleSymbolsFragment.C177831.m38855f(marginToggleSymbolsFragment3, listSortedWith);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsFragment$updateFavor$1 */
    /* JADX INFO: compiled from: MarginToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.market.MarginToggleSymbolsFragment$updateFavor$1", m90122f = "MarginToggleSymbolsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nMarginToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment$updateFavor$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1869#2,2:322\n*S KotlinDebug\n*F\n+ 1 MarginToggleSymbolsFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsFragment$updateFavor$1\n*L\n279#1:322,2\n*E\n"})
    public static final class C177861 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ TradeItemBean $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C177861(TradeItemBean tradeItemBean, Continuation<? super C177861> continuation) {
            super(2, continuation);
            this.$item = tradeItemBean;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginToggleSymbolsFragment.this.new C177861(this.$item, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C177861) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<TradeItemBean> arrayList = MarginToggleSymbolsFragment.this.totalTradeItemList;
                TradeItemBean tradeItemBean = this.$item;
                for (TradeItemBean tradeItemBean2 : arrayList) {
                    if (Intrinsics.areEqual(tradeItemBean2.getSymbol(), tradeItemBean.getSymbol())) {
                        tradeItemBean2.setFavor(tradeItemBean.isFavor());
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C36918i0 getBinding() {
        return (C36918i0) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void getLeverSymbolListData(final Consumer<List<LeverSymbolMarket>> consumer) {
        final String strM102326h = C46392a.m102326h(C45618h.f102740a.m100722j(), "");
        if (!TextUtils.isEmpty(strM102326h)) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.margin.market.f1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginToggleSymbolsFragment.getLeverSymbolListData$lambda$15(strM102326h, consumer);
                }
            });
        }
        addSubscription(((InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class)).m102080P().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.margin.market.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                MarginToggleSymbolsFragment.getLeverSymbolListData$lambda$16(this.f33277b, consumer, (List) obj);
            }
        }, new C24223c1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLeverSymbolListData$lambda$15(String str, Consumer consumer) throws Exception {
        Object objM66914d;
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(str, new C17780a().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        List list = (List) objM66914d;
        if (list != null && !list.isEmpty()) {
            consumer.accept(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLeverSymbolListData$lambda$16(MarginToggleSymbolsFragment marginToggleSymbolsFragment, Consumer consumer, List list) throws Exception {
        C46392a.m102333p(C45618h.f102740a.m100722j(), C27099x.m66919i(list, false, 2, null));
        if (marginToggleSymbolsFragment.leverSymbolList.isEmpty()) {
            consumer.accept(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginSymbolsListAdapter getTradeListAdapter() {
        return (MarginSymbolsListAdapter) this.tradeListAdapter.getValue();
    }

    private final void handleLever() {
        getLeverSymbolListData(new Consumer() { // from class: com.kubi.margin.market.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsFragment.handleLever$lambda$14(this.f33256b, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleLever$lambda$14(final MarginToggleSymbolsFragment marginToggleSymbolsFragment, List list) {
        RtlViewPager rtlViewPager;
        SlidingTabLayout slidingTabLayout;
        RtlViewPager rtlViewPager2;
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        marginToggleSymbolsFragment.leverSymbolList.clear();
        ArrayList<LeverSymbolMarket> arrayList = marginToggleSymbolsFragment.leverSymbolList;
        Intrinsics.checkNotNull(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            LeverSymbolMarket leverSymbolMarket = (LeverSymbolMarket) obj;
            if ((marginToggleSymbolsFragment.getTradeType() == 1 && leverSymbolMarket.isWholeMargin()) || (marginToggleSymbolsFragment.getTradeType() == 2 && leverSymbolMarket.isSingleMargin())) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        marginToggleSymbolsFragment.tabFragments.clear();
        final ArrayList arrayList3 = new ArrayList();
        int size = marginToggleSymbolsFragment.leverSymbolList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!TextUtils.isEmpty(marginToggleSymbolsFragment.leverSymbolList.get(i11).getMarketCode())) {
                marginToggleSymbolsFragment.tabFragments.add(MarginToggleSymbolsListFragment.Companion.newInstance$default(MarginToggleSymbolsListFragment.f33221g0, C27041f.m66668h(marginToggleSymbolsFragment.leverSymbolList.get(i11).getMarketCode()), marginToggleSymbolsFragment.getTradeType(), null, marginToggleSymbolsFragment.getTradeItemBean(), 4, null));
                arrayList3.add(C27041f.m66668h(marginToggleSymbolsFragment.leverSymbolList.get(i11).getMarketName()));
            }
        }
        ArrayList<MarginToggleSymbolsListFragment> arrayList4 = marginToggleSymbolsFragment.tabFragments;
        MarginToggleSymbolsListFragment.Companion companion = MarginToggleSymbolsListFragment.f33221g0;
        arrayList4.add(0, MarginToggleSymbolsListFragment.Companion.newInstance$default(companion, "favor", marginToggleSymbolsFragment.getTradeType(), null, marginToggleSymbolsFragment.getTradeItemBean(), 4, null));
        arrayList3.add(0, marginToggleSymbolsFragment.getString(R$string.favorites));
        if (marginToggleSymbolsFragment.isMarket()) {
            ArrayList<MarginToggleSymbolsListFragment> arrayList5 = marginToggleSymbolsFragment.tabFragments;
            int tradeType = marginToggleSymbolsFragment.getTradeType();
            TradeItemBean tradeItemBean = marginToggleSymbolsFragment.getTradeItemBean();
            arrayList5.add(1, companion.newInstance("relation", tradeType, (tradeItemBean == null || (symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getBaseCurrency(), marginToggleSymbolsFragment.getTradeItemBean()));
            int i12 = R$string.market_currency_placeholder;
            TradeItemBean tradeItemBean2 = marginToggleSymbolsFragment.getTradeItemBean();
            arrayList3.add(1, marginToggleSymbolsFragment.getString(i12, C27041f.m66668h((tradeItemBean2 == null || (symbolInfoEntity = tradeItemBean2.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity.getBaseCurrencyName())));
        }
        FragmentManager childFragmentManager = marginToggleSymbolsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C27103z c27103z = new C27103z(childFragmentManager, marginToggleSymbolsFragment.tabFragments, arrayList3);
        C36918i0 binding = marginToggleSymbolsFragment.getBinding();
        if (binding != null && (rtlViewPager2 = binding.f81738e) != null) {
            rtlViewPager2.setAdapter(c27103z);
        }
        C36918i0 binding2 = marginToggleSymbolsFragment.getBinding();
        if (binding2 != null && (slidingTabLayout = binding2.f81737d) != null) {
            C36918i0 binding3 = marginToggleSymbolsFragment.getBinding();
            slidingTabLayout.setViewPager(binding3 != null ? binding3.f81738e : null);
        }
        C36918i0 binding4 = marginToggleSymbolsFragment.getBinding();
        if (binding4 != null && (rtlViewPager = binding4.f81738e) != null) {
            rtlViewPager.setOffscreenPageLimit(arrayList3.size());
        }
        Disposable disposableSubscribe = MarginTradeListModel.m39009d(new MarginTradeListModel(), "favor", false, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_slide_symbols", null, 0, 24, null).subscribe(new Consumer() { // from class: com.kubi.margin.market.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarginToggleSymbolsFragment.handleLever$lambda$14$lambda$13(this.f33263b, arrayList3, (List) obj2);
            }
        }, marginToggleSymbolsFragment.new C17781b());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, marginToggleSymbolsFragment.getDestroyDisposable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMarket() {
        return ((Boolean) this.isMarket.getValue()).booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final MarginToggleSymbolsFragment newInstance(int i11, boolean z11, @Nullable TradeItemBean tradeItemBean) {
        return INSTANCE.newInstance(i11, z11, tradeItemBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(MarginToggleSymbolsFragment marginToggleSymbolsFragment, List list) {
        marginToggleSymbolsFragment.totalTradeItemList.clear();
        marginToggleSymbolsFragment.totalTradeItemList.addAll(list);
        marginToggleSymbolsFragment.getTradeListAdapter().replaceData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginSymbolsListAdapter tradeListAdapter_delegate$lambda$4(MarginToggleSymbolsFragment marginToggleSymbolsFragment) {
        return new MarginSymbolsListAdapter(marginToggleSymbolsFragment, marginToggleSymbolsFragment.getTradeType(), null, marginToggleSymbolsFragment.isMarket(), null, 16, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_toggle_symbols;
    }

    @NotNull
    public final ArrayList<LeverSymbolMarket> getLeverSymbolList() {
        return this.leverSymbolList;
    }

    @NotNull
    public final TradeItemBean getTradeItemBean() {
        return (TradeItemBean) this.tradeItemBean.getValue();
    }

    public final int getTradeType() {
        return ((Number) this.tradeType.getValue()).intValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RtlViewPager rtlViewPager;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        SlidingTabLayout slidingTabLayout4;
        SlidingTabLayout slidingTabLayout5;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36918i0 binding = getBinding();
        if (binding != null && (recyclerView = binding.f81736c) != null) {
            recyclerView.setAdapter(getTradeListAdapter());
        }
        MarginSymbolsListAdapter tradeListAdapter = getTradeListAdapter();
        PagerAdapter adapter = null;
        View viewInflate = getLayoutInflater().inflate(R$layout.view_empty, (ViewGroup) null);
        viewInflate.setBackgroundResource(R$color.c_bulletLayer);
        tradeListAdapter.setEmptyView(viewInflate);
        C37890n.f85269a.mo85594g(new Consumer() { // from class: com.kubi.margin.market.l1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsFragment.onViewCreated$lambda$6(this.f33362b, (List) obj);
            }
        }, true);
        C36918i0 binding2 = getBinding();
        if (binding2 != null && (slidingTabLayout5 = binding2.f81737d) != null) {
            slidingTabLayout5.setIndicatorStyle(2);
        }
        C36918i0 binding3 = getBinding();
        if (binding3 != null && (slidingTabLayout4 = binding3.f81737d) != null) {
            slidingTabLayout4.setTabMinHeight(C5275i0.m6236a(25.0f));
        }
        C36918i0 binding4 = getBinding();
        if (binding4 != null && (slidingTabLayout3 = binding4.f81737d) != null) {
            slidingTabLayout3.setUnderlineHeight(0.0f);
        }
        C36918i0 binding5 = getBinding();
        if (binding5 != null && (slidingTabLayout2 = binding5.f81737d) != null) {
            slidingTabLayout2.m55277C(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C36918i0 binding6 = getBinding();
        if (binding6 != null) {
            int tabCount = binding6.f81737d.getTabCount();
            for (int i11 = 0; i11 < tabCount; i11++) {
                TextView textViewM55289t = binding6.f81737d.m55289t(i11);
                ViewGroup.LayoutParams layoutParams = textViewM55289t.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = -1;
                layoutParams2.gravity = 16;
                textViewM55289t.setLayoutParams(layoutParams2);
            }
        }
        C36918i0 binding7 = getBinding();
        if (binding7 != null && (slidingTabLayout = binding7.f81737d) != null) {
            slidingTabLayout.setOnTabSelectListener(new C17782c());
        }
        C36918i0 binding8 = getBinding();
        if (binding8 != null && (rtlViewPager = binding8.f81738e) != null) {
            adapter = rtlViewPager.getAdapter();
        }
        if (adapter == null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            showLoadingView(C27046k.m66699n(mContext, R$color.c_bulletLayer), 17);
            handleLever();
        }
    }

    public final void updateFavor(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new C177861(item, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleLever$lambda$14$lambda$13(MarginToggleSymbolsFragment marginToggleSymbolsFragment, ArrayList arrayList, List list) {
        C36918i0 binding = marginToggleSymbolsFragment.getBinding();
        if (binding != null && binding.f81737d != null) {
            if (list != null) {
                if (arrayList.size() > 1) {
                    if (list.isEmpty()) {
                        binding.f81737d.setCurrentTab(1);
                    } else {
                        Object obj = null;
                        if (marginToggleSymbolsFragment.getTradeType() == 1) {
                            for (Object obj2 : list) {
                                if (((TradeItemBean) obj2).getSymbolInfoEntity().isMarginEnabled()) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            if (obj == null) {
                                binding.f81737d.setCurrentTab(1);
                            } else {
                                binding.f81737d.setCurrentTab(0);
                            }
                        } else {
                            for (Object obj3 : list) {
                                if (((TradeItemBean) obj3).getSymbolInfoEntity().isIsolatedMarginEnabled()) {
                                    obj = obj3;
                                    break;
                                }
                            }
                            if (obj == null) {
                                binding.f81737d.setCurrentTab(1);
                            } else {
                                binding.f81737d.setCurrentTab(0);
                            }
                        }
                    }
                } else {
                    binding.f81737d.setCurrentTab(0);
                }
            }
            binding.f81737d.m55291w();
            marginToggleSymbolsFragment.showContent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMarket_delegate$lambda$3(MarginToggleSymbolsFragment marginToggleSymbolsFragment) {
        Boolean boolValueOf;
        Bundle arguments = marginToggleSymbolsFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isMarket"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeItemBean tradeItemBean_delegate$lambda$2(MarginToggleSymbolsFragment marginToggleSymbolsFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marginToggleSymbolsFragment.getArguments();
        if (arguments != null) {
            tradeItemBean = (TradeItemBean) arguments.getParcelable("tradeItemBean");
        } else {
            tradeItemBean = null;
        }
        Intrinsics.checkNotNull(tradeItemBean);
        return tradeItemBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tradeType_delegate$lambda$1(MarginToggleSymbolsFragment marginToggleSymbolsFragment) {
        Integer numValueOf;
        Bundle arguments = marginToggleSymbolsFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    @Override // com.kubi.margin.market.MarginSymbolsFragment.InterfaceC17778a
    public void onSearchTextChange(@Nullable CharSequence text) {
        ViewSwitcher viewSwitcher;
        String string = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        C36918i0 binding = getBinding();
        if (binding != null && (viewSwitcher = binding.f81739f) != null) {
            viewSwitcher.setDisplayedChild(!TextUtils.isEmpty(string) ? 1 : 0);
        }
        if (!TextUtils.isEmpty(string)) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new C177831(string, null), 2, null);
        }
    }
}
