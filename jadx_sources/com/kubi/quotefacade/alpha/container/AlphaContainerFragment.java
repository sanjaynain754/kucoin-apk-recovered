package com.kubi.quotefacade.alpha.container;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bv.C4653b;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.alpha.AlphaCurrent;
import com.kubi.quotefacade.alpha.AlphaMarketTab3SortABTest;
import com.kubi.quotefacade.alpha.list.AlphaListFragment;
import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.AlphaMenuModel;
import com.kubi.quotefacade.entity.AlphaNetworks;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.helper.ChainSortHelper;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.widget.MsgView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025av.C4390a;
import p208dr.InterfaceC36952a;
import p274fx.C37727a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AlphaContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001F\u0018\u0000 h2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00100\u001a\u00020 H\u0014J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u000202H\u0002J\b\u00108\u001a\u000202H\u0003J\b\u00109\u001a\u00020\fH\u0002J\u0018\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\fH\u0003J\u0018\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u000202H\u0014J\u0010\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020DH\u0014J\b\u0010H\u001a\u000202H\u0002J\u0010\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020 H\u0002J\b\u0010K\u001a\u000202H\u0002J\b\u0010L\u001a\u000202H\u0002J\b\u0010M\u001a\u000202H\u0002J\u0018\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u0013H\u0002J\b\u0010Q\u001a\u000202H\u0002J\b\u0010R\u001a\u000202H\u0002J\n\u0010S\u001a\u0004\u0018\u00010TH\u0002J\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010X\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010YH\u0002J\b\u0010Z\u001a\u000202H\u0002J\b\u0010[\u001a\u000202H\u0002J\b\u0010\\\u001a\u000202H\u0002J\u0012\u0010]\u001a\u0002022\b\b\u0002\u0010^\u001a\u00020\fH\u0002J\n\u0010_\u001a\u0004\u0018\u00010`H\u0002J\b\u0010a\u001a\u00020bH\u0002J\b\u0010c\u001a\u00020\fH\u0002J\b\u0010d\u001a\u00020\fH\u0002J\b\u0010e\u001a\u000202H\u0016J\b\u0010f\u001a\u000202H\u0016J\b\u0010g\u001a\u000202H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u0012\u0012\u0004\u0012\u00020)0%j\b\u0012\u0004\u0012\u00020)`'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0010\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0004\n\u0002\u0010G¨\u0006i"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentAlphaContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentAlphaContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "value", "", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "alphaType", "", "getAlphaType", "()Ljava/lang/String;", "alphaType$delegate", "Lkotlin/Lazy;", "currentParams", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "getCurrentParams", "()Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "currentParams$delegate", "alphaMenuEntity", "Lcom/kubi/quotefacade/entity/AlphaMenuModel;", "indexOfNewTab", "", "NETWORK_ALL", "mSortHelper", "Lcom/kubi/quotefacade/helper/ChainSortHelper;", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "menuList", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "ondoTabAdded", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initSort", "initViewPager", "shouldShowOndoTab", "setupViewPagerTabs", "adapter", "Lcom/kubi/resources/widget/viewpager2/ViewPager2Adapter;", "includeOndoTab", "addTab", "titleResId", "menu", "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onPageChangeCallback", "com/kubi/quotefacade/alpha/container/AlphaContainerFragment$onPageChangeCallback$1", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerFragment$onPageChangeCallback$1;", "onTabChanged", "tipsNewCoinCount", "count", "refreshNewCount", "getNewCunt", "applyDefaultTradingVolumeSortIfNeeded", "refreshBySort", "sortName", "sortSide", "refreshTimeView", "refreshNetwork", "getDefaultNetwork", "Lcom/kubi/quotefacade/entity/AlphaNetworks;", "alertTimePeriodChoose", "alertNetworkChoose", "updateCurrectKeyword", "getCurrectNetworks", "", "alertFilter", "refreshFilterIcon", "refreshDynamicSort", "notifyCurrentFragmentRefresh", "changeToAll", "currentFragment", "Lcom/kubi/quotefacade/alpha/list/AlphaListFragment;", "currentTabDefaultSortItem", "Lcom/kubi/quotefacade/constant/ChainSortItemEnum;", "currentTabIsNew", "isPremium", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onDestroyView", "track", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaContainerFragment.kt\ncom/kubi/quotefacade/alpha/container/AlphaContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,509:1\n147#2,16:510\n153#3,7:526\n93#4,4:533\n93#4,4:537\n84#5:541\n1#6:542\n774#7:543\n865#7,2:544\n295#7,2:546\n360#7,7:548\n*S KotlinDebug\n*F\n+ 1 AlphaContainerFragment.kt\ncom/kubi/quotefacade/alpha/container/AlphaContainerFragment\n*L\n67#1:510,16\n180#1:526,7\n188#1:533,4\n201#1:537,4\n284#1:541\n333#1:543\n333#1:544,2\n219#1:546,2\n350#1:548,7\n*E\n"})
public final class AlphaContainerFragment extends SimpleStateFragment<AlphaContainerContract$UIState> {

    /* JADX INFO: renamed from: X */
    @Nullable
    public AlphaMenuModel f41165X;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public ChainSortHelper f41168a0;

    /* JADX INFO: renamed from: d0 */
    public boolean f41171d0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f41161g0 = {Reflection.property1(new PropertyReference1Impl(AlphaContainerFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentAlphaContainerBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f41160f0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41162U = C45681e.m100799e(this, new Function1<AlphaContainerFragment, C4653b>() { // from class: com.kubi.quotefacade.alpha.container.AlphaContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4653b invoke(@NotNull AlphaContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4653b.m4618a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4653b, Unit>() { // from class: com.kubi.quotefacade.alpha.container.AlphaContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4653b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4653b c4653b) {
            invoke(c4653b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f41163V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.container.w0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaContainerFragment.m50451o4(this.f41250b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f41164W = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.container.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaContainerFragment.m50463t4(this.f41252b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public final int f41166Y = 1;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final String f41167Z = TtmlNode.COMBINE_ALL;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final ArrayList<CharSequence> f41169b0 = new ArrayList<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final ArrayList<AlphaMenu> f41170c0 = new ArrayList<>();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final C21609b f41172e0 = new C21609b();

    /* JADX INFO: compiled from: AlphaContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerFragment;", "alphaType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final AlphaContainerFragment instance(@NotNull String alphaType) {
            Intrinsics.checkNotNullParameter(alphaType, "alphaType");
            AlphaContainerFragment alphaContainerFragment = new AlphaContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("type", alphaType);
            alphaContainerFragment.setArguments(bundle);
            return alphaContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.container.AlphaContainerFragment$b */
    /* JADX INFO: compiled from: AlphaContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/alpha/container/AlphaContainerFragment$onPageChangeCallback$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21609b extends ViewPager2.OnPageChangeCallback {
        public C21609b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            AlphaContainerFragment.this.m50476R4();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView */
    public boolean getF18817Y() {
        return false;
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.container.AlphaContainerFragment$a */
    /* JADX INFO: compiled from: AlphaContainerFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C21608a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlphaMenu.values().length];
            try {
                iArr[AlphaMenu.CAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlphaMenu.HOLDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlphaMenu.TXCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m50391E4(ChainSortHelper chainSortHelper, final AlphaContainerFragment alphaContainerFragment) {
        chainSortHelper.m52087v(new Function2() { // from class: com.kubi.quotefacade.alpha.container.r0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlphaContainerFragment.m50393F4(this.f41237b, (String) obj, (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m50393F4(AlphaContainerFragment alphaContainerFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        alphaContainerFragment.m50477Y4(sortName, sortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m50395G4(ChainSortHelper chainSortHelper, final AlphaContainerFragment alphaContainerFragment) {
        chainSortHelper.m52086u(new Function2() { // from class: com.kubi.quotefacade.alpha.container.q0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlphaContainerFragment.m50397H4(this.f41235b, (String) obj, (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m50397H4(AlphaContainerFragment alphaContainerFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        alphaContainerFragment.m50477Y4(sortName, sortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m50399I4(ChainSortHelper chainSortHelper, final AlphaContainerFragment alphaContainerFragment) {
        chainSortHelper.m52085t(new Function2() { // from class: com.kubi.quotefacade.alpha.container.o0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlphaContainerFragment.m50401J4(this.f41231b, (String) obj, (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m50401J4(AlphaContainerFragment alphaContainerFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        alphaContainerFragment.m50477Y4(sortName, sortSide);
        return Unit.INSTANCE;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: K4 */
    private final void m50403K4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50405L4(this.f41177b);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m50409O4(AlphaContainerFragment alphaContainerFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        alphaContainerFragment.m50475N4(z11);
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m50418T4(final AlphaContainerFragment alphaContainerFragment, C4653b c4653b, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        if (AlphaMarketTab3SortABTest.INSTANCE.isDefaultSortByTradingVolume()) {
            ChainSortHelper chainSortHelper = alphaContainerFragment.f41168a0;
            if (chainSortHelper != null) {
                chainSortHelper.m52074e(new Function2() { // from class: com.kubi.quotefacade.alpha.container.p0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AlphaContainerFragment.m50420U4(this.f41233b, (String) obj, (String) obj2);
                    }
                });
            }
        } else if (Intrinsics.areEqual(sortName, ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP.getConstSortType()) || Intrinsics.areEqual(sortName, ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS.getConstSortType()) || Intrinsics.areEqual(sortName, ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT.getConstSortType())) {
            alphaContainerFragment.m50499z4().m50358m(C4390a.m4002a(sortName));
            c4653b.f4228g.f4418b.performClick();
            alphaContainerFragment.m50499z4().m50359n("desc");
        } else {
            alphaContainerFragment.m50499z4().m50358m("");
            alphaContainerFragment.m50499z4().m50359n("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m50420U4(AlphaContainerFragment alphaContainerFragment, String volumeSortName, String volumeSortSide) {
        Intrinsics.checkNotNullParameter(volumeSortName, "volumeSortName");
        Intrinsics.checkNotNullParameter(volumeSortSide, "volumeSortSide");
        alphaContainerFragment.m50477Y4(volumeSortName, volumeSortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m50437g4(final AlphaContainerFragment alphaContainerFragment, ChainFilterData data) {
        AlphaListFragment alphaListFragmentM50489s4;
        TimeSelectedEnum timeSelectedEnumFindEnumByConstTag;
        Intrinsics.checkNotNullParameter(data, "data");
        alphaContainerFragment.m50499z4().m50354i(data);
        String orderByRange = data.getOrderByRange();
        if (orderByRange != null && (timeSelectedEnumFindEnumByConstTag = TimeSelectedEnum.INSTANCE.findEnumByConstTag(orderByRange)) != null) {
            alphaContainerFragment.m50499z4().m50360o(timeSelectedEnumFindEnumByConstTag);
            alphaContainerFragment.m50485i5();
        }
        ChainSortItemEnum chainSortItemEnumFindEnumBySortType = ChainSortItemEnum.INSTANCE.findEnumBySortType(C27041f.m66668h(data.getChainSortType()));
        boolean z11 = false;
        if (chainSortItemEnumFindEnumBySortType != null) {
            z11 = alphaContainerFragment.m50499z4().getF41152g() != chainSortItemEnumFindEnumBySortType;
            alphaContainerFragment.m50499z4().m50355j(chainSortItemEnumFindEnumBySortType);
            ChainSortHelper chainSortHelper = alphaContainerFragment.f41168a0;
            if (chainSortHelper != null) {
                chainSortHelper.m52083r(chainSortItemEnumFindEnumBySortType.getConstSortType(), new Function2() { // from class: com.kubi.quotefacade.alpha.container.n0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AlphaContainerFragment.m50438h4(this.f41229b, (String) obj, (String) obj2);
                    }
                });
            }
            alphaContainerFragment.m50479c5();
            alphaContainerFragment.m50478a5();
            if (!z11 && (alphaListFragmentM50489s4 = alphaContainerFragment.m50489s4()) != null) {
                alphaListFragmentM50489s4.m50634f4();
            }
        }
        alphaContainerFragment.m50475N4(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m50438h4(AlphaContainerFragment alphaContainerFragment, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        alphaContainerFragment.m50499z4().m50358m("");
        alphaContainerFragment.m50499z4().m50359n("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m50445m4(final AlphaContainerFragment alphaContainerFragment) {
        AlphaContainerDialog alphaContainerDialog = AlphaContainerDialog.f41156a;
        FragmentManager childFragmentManager = alphaContainerFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alphaContainerDialog.m50378n(childFragmentManager, alphaContainerFragment.m50499z4(), new Function0() { // from class: com.kubi.quotefacade.alpha.container.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50448n4(this.f41222b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Fragment m50446m5(AlphaContainerFragment alphaContainerFragment, int i11) {
        return AlphaListFragment.f41294j0.instance(alphaContainerFragment.m50495w4(), AlphaMenu.ALL);
    }

    /* JADX INFO: renamed from: n5 */
    public static final Fragment m50449n5(AlphaContainerFragment alphaContainerFragment, int i11) {
        return AlphaListFragment.f41294j0.instance(alphaContainerFragment.m50495w4(), AlphaMenu.NEW);
    }

    /* JADX INFO: renamed from: o5 */
    public static final Fragment m50452o5(AlphaContainerFragment alphaContainerFragment, int i11) {
        return AlphaListFragment.f41294j0.instance(alphaContainerFragment.m50495w4(), AlphaMenu.ONDO);
    }

    /* JADX INFO: renamed from: p5 */
    public static final Fragment m50454p5(AlphaContainerFragment alphaContainerFragment, int i11) {
        return AlphaListFragment.f41294j0.instance(alphaContainerFragment.m50495w4(), AlphaMenu.CAP);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m50456q4(final AlphaContainerFragment alphaContainerFragment) {
        if (!AlphaMarketTab3SortABTest.INSTANCE.isDefaultSortByTradingVolume()) {
            return Unit.INSTANCE;
        }
        ChainSortHelper chainSortHelper = alphaContainerFragment.f41168a0;
        if (chainSortHelper != null) {
            chainSortHelper.m52074e(new Function2() { // from class: com.kubi.quotefacade.alpha.container.l0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlphaContainerFragment.m50459r4(this.f41225b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q5 */
    public static final Fragment m50457q5(AlphaContainerFragment alphaContainerFragment, int i11) {
        return AlphaListFragment.f41294j0.instance(alphaContainerFragment.m50495w4(), AlphaMenu.HOLDERS);
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m50459r4(AlphaContainerFragment alphaContainerFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        alphaContainerFragment.m50477Y4(sortName, sortSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final Fragment m50460r5(AlphaContainerFragment alphaContainerFragment, int i11) {
        return AlphaListFragment.f41294j0.instance(alphaContainerFragment.m50495w4(), AlphaMenu.TXCOUNT);
    }

    /* JADX INFO: renamed from: t4 */
    public static final AlphaCurrent.a m50463t4(AlphaContainerFragment alphaContainerFragment) {
        return AlphaCurrent.f41143a.m50343a(alphaContainerFragment.m50495w4());
    }

    /* JADX INFO: renamed from: B4 */
    public final void m50472B4() {
        if (System.currentTimeMillis() - C46392a.m102324f(QuoteKV.f42044a.m52044d(), 0L) > 86400000) {
            sendIntent(new AlphaContainerContract$UiIntent.FetchNewData(m50495w4()));
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m50473C4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50389D4(this.f41249b);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public final void m50475N4(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50411P4(this.f41247b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public final void m50476R4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50416S4(this.f41246b);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m50477Y4(final String str, final String str2) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50429Z4(this.f41243b, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public final void m50478a5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50432b5(this.f41227b);
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final void m50479c5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50434d5(this.f41239b);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final void m50480d4(int i11, AlphaMenu alphaMenu) {
        this.f41169b0.add(getString(i11));
        this.f41170c0.add(alphaMenu);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C21611a) {
            C21611a c21611a = (C21611a) singleEvent;
            this.f41165X = c21611a.getF41176a();
            if (c21611a.getF41176a().getShowOndoTab() && m50474M4() && !this.f41171d0) {
                C4653b c4653bM50497x4 = m50497x4();
                RecyclerView.Adapter adapter = (c4653bM50497x4 == null || (viewPager2 = c4653bM50497x4.f4227f) == null) ? null : viewPager2.getAdapter();
                C37727a c37727a = adapter instanceof C37727a ? (C37727a) adapter : null;
                if (c37727a != null) {
                    m50486k5(c37727a, true);
                }
            }
            m50496w5();
            m50482e5();
            m50409O4(this, false, 1, null);
        }
        if (singleEvent instanceof C21614b) {
            m50483g5();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m50481e4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50435f4(this.f41253b);
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public final void m50482e5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50436f5(this.f41241b);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final void m50483g5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50439h5(this.f41228b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_alpha_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AlphaContainerVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AlphaContainerVM.class);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m50484i4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50440j4(this.f41256b);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public final void m50485i5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50441j5(this.f41182b);
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: k5 */
    public final void m50486k5(final C37727a c37727a, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50443l5(this.f41178b, c37727a, z11);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final void m50487l4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50445m4(this.f41242b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C4653b c4653bM50497x4 = m50497x4();
        if (c4653bM50497x4 == null) {
            return;
        }
        m50485i5();
        BaseTextView tvTime = c4653bM50497x4.f4226e;
        Intrinsics.checkNotNullExpressionValue(tvTime, "tvTime");
        C27046k.m66710y(tvTime, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50422V4(this.f41226b);
            }
        });
        AppCompatImageView ivFilterNetwork = c4653bM50497x4.f4225d;
        Intrinsics.checkNotNullExpressionValue(ivFilterNetwork, "ivFilterNetwork");
        C27046k.m66710y(ivFilterNetwork, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50424W4(this.f41251b);
            }
        });
        m50473C4();
        AppCompatImageView ivFilterInfo = c4653bM50497x4.f4224c;
        Intrinsics.checkNotNullExpressionValue(ivFilterInfo, "ivFilterInfo");
        C27046k.m66710y(ivFilterInfo, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50426X4(this.f41215b);
            }
        });
        m50403K4();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m50488p4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50456q4(this.f41188b);
            }
        });
    }

    /* JADX INFO: renamed from: t5 */
    public final void m50491t5(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50465u5(this.f41254b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final ChainSortItemEnum m50492u4() {
        ViewPager2 viewPager2;
        ArrayList<AlphaMenu> arrayList = this.f41170c0;
        C4653b c4653bM50497x4 = m50497x4();
        AlphaMenu alphaMenu = (AlphaMenu) CollectionsKt.getOrNull(arrayList, (c4653bM50497x4 == null || (viewPager2 = c4653bM50497x4.f4227f) == null) ? 0 : viewPager2.getCurrentItem());
        int i11 = alphaMenu == null ? -1 : C21608a.$EnumSwitchMapping$0[alphaMenu.ordinal()];
        if (i11 == 1) {
            return ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP;
        }
        if (i11 != 2) {
            return i11 != 3 ? ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE : ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT;
        }
        return ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS;
    }

    /* JADX INFO: renamed from: w4 */
    public final String m50495w4() {
        return (String) this.f41163V.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final C4653b m50497x4() {
        return (C4653b) this.f41162U.getValue(this, f41161g0[0]);
    }

    /* JADX INFO: renamed from: z4 */
    public final AlphaCurrent.a m50499z4() {
        return (AlphaCurrent.a) this.f41164W.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m50389D4(final AlphaContainerFragment alphaContainerFragment) {
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        LinearLayoutCompat llSort = c4653bM50497x4.f4228g.f4426j;
        Intrinsics.checkNotNullExpressionValue(llSort, "llSort");
        final ChainSortHelper chainSortHelper = new ChainSortHelper(llSort);
        alphaContainerFragment.f41168a0 = chainSortHelper;
        c4653bM50497x4.f4228g.f4428l.setText(alphaContainerFragment.getString(ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getResourceId()));
        LinearLayout llAmount = c4653bM50497x4.f4228g.f4424h;
        Intrinsics.checkNotNullExpressionValue(llAmount, "llAmount");
        C27046k.m66710y(llAmount, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50399I4(chainSortHelper, alphaContainerFragment);
            }
        });
        LinearLayout flPrice = c4653bM50497x4.f4228g.f4419c;
        Intrinsics.checkNotNullExpressionValue(flPrice, "flPrice");
        C27046k.m66710y(flPrice, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50391E4(chainSortHelper, alphaContainerFragment);
            }
        });
        LinearLayout flChangeRate = c4653bM50497x4.f4228g.f4418b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        C27046k.m66710y(flChangeRate, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50395G4(chainSortHelper, alphaContainerFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m50405L4(AlphaContainerFragment alphaContainerFragment) {
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        c4653bM50497x4.f4223b.setNeedBold(true);
        FragmentManager childFragmentManager = alphaContainerFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = alphaContainerFragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        C37727a c37727a = new C37727a(childFragmentManager, lifecycle);
        c4653bM50497x4.f4227f.setAdapter(c37727a);
        c4653bM50497x4.f4227f.setOffscreenPageLimit(1);
        alphaContainerFragment.m50486k5(c37727a, alphaContainerFragment.m50490s5());
        c4653bM50497x4.f4227f.registerOnPageChangeCallback(alphaContainerFragment.f41172e0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m50411P4(AlphaContainerFragment alphaContainerFragment, boolean z11) {
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        if (z11 && c4653bM50497x4.f4227f.getCurrentItem() != 0) {
            c4653bM50497x4.f4227f.setCurrentItem(0, false);
        } else {
            AlphaListFragment alphaListFragmentM50489s4 = alphaContainerFragment.m50489s4();
            if (alphaListFragmentM50489s4 != null) {
                alphaListFragmentM50489s4.m50629R4();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m50413Q4(AlphaContainerFragment alphaContainerFragment) {
        ViewPager2 viewPager2;
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 != null && (viewPager2 = c4653bM50497x4.f4227f) != null) {
            viewPager2.unregisterOnPageChangeCallback(alphaContainerFragment.f41172e0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m50416S4(final AlphaContainerFragment alphaContainerFragment) throws JSONException {
        String externalChain;
        final C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        if (alphaContainerFragment.m50474M4()) {
            if (alphaContainerFragment.m50499z4().getF41149d() != null) {
                List<AlphaNetworks> listM50498y4 = alphaContainerFragment.m50498y4();
                Object obj = null;
                if (listM50498y4 != null) {
                    for (Object obj2 : listM50498y4) {
                        String externalChain2 = ((AlphaNetworks) obj2).getExternalChain();
                        AlphaNetworks f41149d = alphaContainerFragment.m50499z4().getF41149d();
                        if (f41149d != null) {
                            externalChain = f41149d.getExternalChain();
                        } else {
                            externalChain = null;
                        }
                        if (Intrinsics.areEqual(externalChain2, externalChain)) {
                            obj = obj2;
                            break;
                        }
                    }
                    obj = (AlphaNetworks) obj;
                }
                if (obj == null) {
                    alphaContainerFragment.m50499z4().m50357l(alphaContainerFragment.m50471A4());
                }
            }
            alphaContainerFragment.m50482e5();
        }
        alphaContainerFragment.m50496w5();
        alphaContainerFragment.m50499z4().m50355j(alphaContainerFragment.m50492u4());
        ChainSortItemEnum f41152g = alphaContainerFragment.m50499z4().getF41152g();
        c4653bM50497x4.f4228g.f4428l.setText(alphaContainerFragment.getString(f41152g.getResourceId()));
        ChainSortHelper chainSortHelper = alphaContainerFragment.f41168a0;
        if (chainSortHelper != null) {
            chainSortHelper.m52084s(f41152g.getConstSortType());
        }
        ChainSortHelper chainSortHelper2 = alphaContainerFragment.f41168a0;
        if (chainSortHelper2 != null) {
            chainSortHelper2.m52083r(f41152g.getConstSortType(), new Function2() { // from class: com.kubi.quotefacade.alpha.container.h0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return AlphaContainerFragment.m50418T4(this.f41212b, c4653bM50497x4, (String) obj3, (String) obj4);
                }
            });
        }
        ChainFilterData f41153h = alphaContainerFragment.m50499z4().getF41153h();
        f41153h.setOrderByRange(alphaContainerFragment.m50499z4().getF41148c().getConstTimeTag());
        f41153h.setChainSortType(f41152g.getConstSortType());
        alphaContainerFragment.m50478a5();
        AlphaListFragment alphaListFragmentM50489s4 = alphaContainerFragment.m50489s4();
        if (alphaListFragmentM50489s4 != null) {
            alphaListFragmentM50489s4.m50634f4();
        }
        alphaContainerFragment.m50494v5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m50422V4(AlphaContainerFragment alphaContainerFragment) {
        alphaContainerFragment.m50487l4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m50424W4(AlphaContainerFragment alphaContainerFragment) {
        alphaContainerFragment.m50484i4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m50426X4(AlphaContainerFragment alphaContainerFragment) {
        alphaContainerFragment.m50481e4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m50429Z4(AlphaContainerFragment alphaContainerFragment, String str, String str2) {
        alphaContainerFragment.m50499z4().m50358m(C4390a.m4002a(str));
        alphaContainerFragment.m50499z4().m50359n(str2);
        if (alphaContainerFragment.m50474M4() && alphaContainerFragment.m50493v4() && Intrinsics.areEqual(alphaContainerFragment.m50499z4().getF41151f(), "")) {
            alphaContainerFragment.m50499z4().m50358m("");
        }
        m50409O4(alphaContainerFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m50432b5(AlphaContainerFragment alphaContainerFragment) {
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        if (alphaContainerFragment.m50499z4().getF41152g() == ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY) {
            c4653bM50497x4.f4228g.f4421e.setVisibility(8);
            c4653bM50497x4.f4228g.f4418b.setEnabled(false);
        } else {
            c4653bM50497x4.f4228g.f4421e.setVisibility(0);
            c4653bM50497x4.f4228g.f4418b.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m50434d5(AlphaContainerFragment alphaContainerFragment) {
        boolean z11;
        int i11;
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        if (alphaContainerFragment.m50499z4().getF41152g() != alphaContainerFragment.m50492u4()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AppCompatImageView appCompatImageView = c4653bM50497x4.f4224c;
        if (z11) {
            i11 = R$color.brandGreen;
        } else {
            i11 = R$color.c_icon;
        }
        appCompatImageView.setColorFilter(alphaContainerFragment.getColorRes(i11), PorterDuff.Mode.SRC_ATOP);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m50435f4(final AlphaContainerFragment alphaContainerFragment) {
        alphaContainerFragment.m50474M4();
        AlphaContainerDialog.f41156a.m50379q(LifecycleOwnerKt.getLifecycleScope(alphaContainerFragment), "alpha", alphaContainerFragment.m50499z4().getF41153h(), new Function1() { // from class: com.kubi.quotefacade.alpha.container.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerFragment.m50437g4(this.f41217b, (ChainFilterData) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m50436f5(AlphaContainerFragment alphaContainerFragment) {
        AppCompatImageView appCompatImageView;
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 != null && (appCompatImageView = c4653bM50497x4.f4225d) != null) {
            AlphaNetworks f41149d = alphaContainerFragment.m50499z4().getF41149d();
            String lowerCase = null;
            if (f41149d == null) {
                f41149d = alphaContainerFragment.m50471A4();
                if (f41149d != null) {
                    alphaContainerFragment.m50499z4().m50357l(f41149d);
                } else {
                    f41149d = null;
                }
                if (f41149d == null) {
                    return Unit.INSTANCE;
                }
            }
            String externalChain = f41149d.getExternalChain();
            if (externalChain != null) {
                lowerCase = externalChain.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            if (Intrinsics.areEqual(lowerCase, alphaContainerFragment.f41167Z)) {
                appCompatImageView.setImageResource(R$mipmap.quote_ic_network_all);
            } else {
                C24277v.m58540e(appCompatImageView.getContext(), C27041f.m66668h(f41149d.getChainIcon()), appCompatImageView);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m50439h5(AlphaContainerFragment alphaContainerFragment) {
        AlphaMenuModel alphaMenuModel;
        Integer newCount;
        if (alphaContainerFragment.getView() != null && alphaContainerFragment.m50474M4()) {
            if (!alphaContainerFragment.m50493v4() && (alphaMenuModel = alphaContainerFragment.f41165X) != null && (newCount = alphaMenuModel.getNewCount()) != null) {
                alphaContainerFragment.m50491t5(newCount.intValue());
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m50440j4(final AlphaContainerFragment alphaContainerFragment) {
        Integer num;
        String externalChain;
        List<AlphaNetworks> listM50498y4 = alphaContainerFragment.m50498y4();
        AlphaNetworks f41149d = alphaContainerFragment.m50499z4().getF41149d();
        if (f41149d == null) {
            f41149d = alphaContainerFragment.m50471A4();
        }
        int iIntValue = 0;
        if (listM50498y4 != null) {
            Iterator<AlphaNetworks> it = listM50498y4.iterator();
            int i11 = 0;
            while (true) {
                num = null;
                if (it.hasNext()) {
                    String externalChain2 = it.next().getExternalChain();
                    if (f41149d != null) {
                        externalChain = f41149d.getExternalChain();
                    } else {
                        externalChain = null;
                    }
                    if (Intrinsics.areEqual(externalChain2, externalChain)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i11);
            if (numValueOf.intValue() >= 0) {
                num = numValueOf;
            }
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        if (listM50498y4 != null) {
            AlphaContainerDialog alphaContainerDialog = AlphaContainerDialog.f41156a;
            FragmentManager childFragmentManager = alphaContainerFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alphaContainerDialog.m50377i(childFragmentManager, iIntValue, listM50498y4, new Function1() { // from class: com.kubi.quotefacade.alpha.container.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlphaContainerFragment.m50442k4(this.f41193b, (AlphaNetworks) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m50441j5(AlphaContainerFragment alphaContainerFragment) {
        BaseTextView baseTextView;
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 != null && (baseTextView = c4653bM50497x4.f4226e) != null) {
            baseTextView.setText(alphaContainerFragment.getString(alphaContainerFragment.m50499z4().getF41148c().getResourceId()));
        }
        alphaContainerFragment.m50499z4().getF41153h().setOrderByRange(alphaContainerFragment.m50499z4().getF41148c().getConstTimeTag());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m50442k4(AlphaContainerFragment alphaContainerFragment, AlphaNetworks alphaNetworks) {
        alphaContainerFragment.m50499z4().m50357l(alphaNetworks);
        alphaContainerFragment.m50482e5();
        m50409O4(alphaContainerFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ad  */
    /* JADX INFO: renamed from: l5 */
    public static final Unit m50443l5(final AlphaContainerFragment alphaContainerFragment, C37727a c37727a, boolean z11) {
        int iCoerceAtMost;
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        int currentItem = c4653bM50497x4.f4227f.getCurrentItem();
        AlphaMenu alphaMenu = (AlphaMenu) CollectionsKt.getOrNull(alphaContainerFragment.f41170c0, currentItem);
        c37727a.clear();
        alphaContainerFragment.f41169b0.clear();
        alphaContainerFragment.f41170c0.clear();
        alphaContainerFragment.f41171d0 = z11;
        alphaContainerFragment.m50480d4(R$string.market_alpha_tab_all, AlphaMenu.ALL);
        c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.alpha.container.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerFragment.m50446m5(this.f41230b, ((Integer) obj).intValue());
            }
        });
        if (alphaContainerFragment.m50474M4()) {
            alphaContainerFragment.m50480d4(R$string.market_alpha_tab_newcoin, AlphaMenu.NEW);
            c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.alpha.container.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlphaContainerFragment.m50449n5(this.f41232b, ((Integer) obj).intValue());
                }
            });
        }
        if (z11) {
            alphaContainerFragment.m50480d4(R$string.market_alpha_ondo_coin_tab, AlphaMenu.ONDO);
            c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.alpha.container.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlphaContainerFragment.m50452o5(this.f41234b, ((Integer) obj).intValue());
                }
            });
        }
        alphaContainerFragment.m50480d4(R$string.quote_chain_filter_marmarket_value, AlphaMenu.CAP);
        c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.alpha.container.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerFragment.m50454p5(this.f41236b, ((Integer) obj).intValue());
            }
        });
        alphaContainerFragment.m50480d4(R$string.quote_chain_filter_hold_adr, AlphaMenu.HOLDERS);
        c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.alpha.container.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerFragment.m50457q5(this.f41238b, ((Integer) obj).intValue());
            }
        });
        alphaContainerFragment.m50480d4(R$string.quote_chain_filter_trade, AlphaMenu.TXCOUNT);
        c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.alpha.container.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerFragment.m50460r5(this.f41240b, ((Integer) obj).intValue());
            }
        });
        c4653bM50497x4.f4223b.m55601z(c4653bM50497x4.f4227f, alphaContainerFragment.f41169b0);
        if (alphaMenu != null) {
            Integer numValueOf = Integer.valueOf(alphaContainerFragment.f41170c0.indexOf(alphaMenu));
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iCoerceAtMost = numValueOf.intValue();
            } else {
                iCoerceAtMost = RangesKt.coerceAtMost(currentItem, alphaContainerFragment.f41169b0.size() - 1);
            }
        } else {
            iCoerceAtMost = RangesKt.coerceAtMost(currentItem, alphaContainerFragment.f41169b0.size() - 1);
        }
        c4653bM50497x4.f4227f.setCurrentItem(iCoerceAtMost, false);
        alphaContainerFragment.m50488p4();
        c37727a.m85031k(alphaContainerFragment.f41169b0);
        c4653bM50497x4.f4223b.m55597u();
        MsgView msgViewM55592p = c4653bM50497x4.f4223b.m55592p(alphaContainerFragment.f41166Y);
        if (msgViewM55592p != null) {
            msgViewM55592p.setBackgroundColor(alphaContainerFragment.getColorRes(R$color.primary60));
            msgViewM55592p.setIsWidthHeightEqual(true);
            msgViewM55592p.setStrokeColor(0);
            msgViewM55592p.setTextColor(alphaContainerFragment.getColorRes(R$color.c_text));
            msgViewM55592p.setTextSize(10.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m50448n4(AlphaContainerFragment alphaContainerFragment) {
        alphaContainerFragment.m50485i5();
        m50409O4(alphaContainerFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final String m50451o4(AlphaContainerFragment alphaContainerFragment) {
        String string;
        Bundle arguments = alphaContainerFragment.getArguments();
        if (arguments != null && (string = arguments.getString("type")) != null) {
            return string;
        }
        return "alpha_premium";
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m50465u5(AlphaContainerFragment alphaContainerFragment, int i11) {
        C4653b c4653bM50497x4 = alphaContainerFragment.m50497x4();
        if (c4653bM50497x4 == null) {
            return Unit.INSTANCE;
        }
        if (!alphaContainerFragment.m50474M4()) {
            return Unit.INSTANCE;
        }
        if (i11 <= 0) {
            c4653bM50497x4.f4223b.m55595s(alphaContainerFragment.f41166Y);
        } else {
            c4653bM50497x4.f4223b.m55580A(alphaContainerFragment.f41166Y, i11);
            c4653bM50497x4.f4223b.m55600y(alphaContainerFragment.f41166Y, 0.0f, C27040e.m66657a(2.0f));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final AlphaNetworks m50471A4() {
        String lowerCase;
        List<AlphaNetworks> listM50498y4 = m50498y4();
        AlphaNetworks alphaNetworks = null;
        if (listM50498y4 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM50498y4) {
                String externalChain = ((AlphaNetworks) obj).getExternalChain();
                if (externalChain != null) {
                    lowerCase = externalChain.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                if (Intrinsics.areEqual(lowerCase, this.f41167Z)) {
                    arrayList.add(obj);
                }
            }
            alphaNetworks = (AlphaNetworks) CollectionsKt.firstOrNull((List) arrayList);
        }
        C44128b.m97266j(getTAG(), "getDefaultNetwork: " + alphaNetworks);
        return alphaNetworks;
    }

    /* JADX INFO: renamed from: M4 */
    public final boolean m50474M4() {
        return Intrinsics.areEqual(m50495w4(), "alpha_premium");
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:alpha_hide_new_count".length();
        }
        C12572a.m23692a(this, false, new C21610xc6838142("com.kubi.home.feed.QuoteEvent:alpha_hide_new_count", null, this));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerFragment.m50413Q4(this.f41257b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (this.f41165X == null) {
            sendIntent(new AlphaContainerContract$UiIntent.FetchMenuData(m50495w4()));
        }
        m50472B4();
    }

    /* JADX INFO: renamed from: s4 */
    public final AlphaListFragment m50489s4() {
        C4653b c4653bM50497x4;
        C37727a c37727a;
        Fragment fragmentM85028h;
        if (getView() == null || (c4653bM50497x4 = m50497x4()) == null) {
            return null;
        }
        int currentItem = c4653bM50497x4.f4227f.getCurrentItem();
        RecyclerView.Adapter adapter = c4653bM50497x4.f4227f.getAdapter();
        if (adapter instanceof C37727a) {
            c37727a = (C37727a) adapter;
        } else {
            c37727a = null;
        }
        if (c37727a != null) {
            fragmentM85028h = c37727a.m85028h(currentItem);
        } else {
            fragmentM85028h = null;
        }
        if (!(fragmentM85028h instanceof AlphaListFragment)) {
            return null;
        }
        return (AlphaListFragment) fragmentM85028h;
    }

    /* JADX INFO: renamed from: s5 */
    public final boolean m50490s5() {
        AlphaMenuModel alphaMenuModel;
        if (m50474M4() && (alphaMenuModel = this.f41165X) != null && alphaMenuModel.getShowOndoTab()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m50493v4() {
        ViewPager2 viewPager2;
        C4653b c4653bM50497x4 = m50497x4();
        if (c4653bM50497x4 == null || (viewPager2 = c4653bM50497x4.f4227f) == null || viewPager2.getCurrentItem() != this.f41166Y) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: v5 */
    public final void m50494v5() throws JSONException {
        String str;
        String displayChain;
        if (m50474M4()) {
            str = "hot";
        } else {
            str = "chain";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", m50499z4().getF41147b());
        jSONObject.put("timeFilter", m50499z4().getF41148c());
        AlphaNetworks f41149d = m50499z4().getF41149d();
        if (f41149d != null) {
            displayChain = f41149d.getDisplayChain();
        } else {
            displayChain = null;
        }
        jSONObject.put("chooseNetwork", displayChain);
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B5marketAlpha", str, "thirdTab", jSONObject);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m50496w5() {
        String categoryChainarea;
        String categoryHighlightsAll;
        String categoryHighlightsNew;
        if (m50474M4()) {
            if (m50493v4()) {
                AlphaMenuModel alphaMenuModel = this.f41165X;
                if (alphaMenuModel != null && (categoryHighlightsNew = alphaMenuModel.getCategoryHighlightsNew()) != null) {
                    m50499z4().m50356k(categoryHighlightsNew);
                    return;
                }
                return;
            }
            AlphaMenuModel alphaMenuModel2 = this.f41165X;
            if (alphaMenuModel2 != null && (categoryHighlightsAll = alphaMenuModel2.getCategoryHighlightsAll()) != null) {
                m50499z4().m50356k(categoryHighlightsAll);
                return;
            }
            return;
        }
        AlphaMenuModel alphaMenuModel3 = this.f41165X;
        if (alphaMenuModel3 != null && (categoryChainarea = alphaMenuModel3.getCategoryChainarea()) != null) {
            m50499z4().m50356k(categoryChainarea);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final List<AlphaNetworks> m50498y4() {
        if (m50474M4() && m50493v4()) {
            AlphaMenuModel alphaMenuModel = this.f41165X;
            if (alphaMenuModel == null) {
                return null;
            }
            return alphaMenuModel.getNetworksNew();
        }
        AlphaMenuModel alphaMenuModel2 = this.f41165X;
        if (alphaMenuModel2 == null) {
            return null;
        }
        return alphaMenuModel2.getNetworksAll();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
    }
}
