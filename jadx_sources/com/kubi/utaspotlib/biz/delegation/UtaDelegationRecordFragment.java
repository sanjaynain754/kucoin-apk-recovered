package com.kubi.utaspotlib.biz.delegation;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.biz.order.record.active.OpenOrdersRecordContract$UiIntent;
import com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment;
import com.kubi.core.biz.order.record.active.OpenOrdersRecordVM;
import com.kubi.core.utils.FlowExtKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$array;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.R$string;
import com.kubi.utaspotlib.biz.delegation.history.RnOrderHistoryFragment;
import com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229ed.C37134b;
import p569qq.C43852m;
import p739ww.C45938b;
import p827zc.AbstractC46753c;
import p827zc.InterfaceC46752b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import q70.C43657d;
import r70.C43942e;
import r70.C43943f;
import w00.C45681e;

/* JADX INFO: compiled from: UtaDelegationRecordFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0002\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00102\u001a\u00020)H\u0014J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u000204H\u0002J\b\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0002J\b\u0010<\u001a\u000204H\u0002J\n\u0010=\u001a\u0004\u0018\u00010>H\u0002J\b\u0010?\u001a\u000204H\u0002J\u000e\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020)J\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u001dR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u001dR\u001d\u0010%\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b&\u0010\u001dR\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b*\u0010+R\u001d\u0010-\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b/\u00100¨\u0006F"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/core/base/arch/repo/IRepoProvider;", "<init>", "()V", "binding", "Lcom/kubi/utaspotlib/databinding/UtaDelegationRecodFragmentBinding;", "getBinding", "()Lcom/kubi/utaspotlib/databinding/UtaDelegationRecodFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tabFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "bizRepoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getBizRepoProvider", "()Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "bizRepoProvider$delegate", "Lkotlin/Lazy;", "openOrdersDataVM", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordVM;", "getOpenOrdersDataVM", "()Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordVM;", "openOrdersDataVM$delegate", "mSymbol", "", "getMSymbol", "()Ljava/lang/String;", "mSymbol$delegate", "utaTradeType", "getUtaTradeType", "utaTradeType$delegate", "mFromSymbol", "getMFromSymbol", "mFromSymbol$delegate", "mSide", "getMSide", "mSide$delegate", "mIndex", "", "getMIndex", "()I", "mIndex$delegate", "unifyRecord", "Lcom/kubi/sdk/BaseFragment;", "getUnifyRecord", "()Lcom/kubi/sdk/BaseFragment;", "unifyRecord$delegate", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initTabFragments", "initTabsUI", "initSymbolUI", "subOrderSizeFlow", "getShowingOpenOrdersFragment", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordFragment;", "updateCancelAllBtnEnable", "trackPosition", ViewProps.POSITION, "getFragmentTitles", "", "", "Companion", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaDelegationRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaDelegationRecordFragment.kt\ncom/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n147#2,16:289\n106#3,15:305\n1#4:320\n808#5,11:321\n1869#5,2:332\n*S KotlinDebug\n*F\n+ 1 UtaDelegationRecordFragment.kt\ncom/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment\n*L\n55#1:289,16\n68#1:305,15\n188#1:321,11\n189#1:332,2\n*E\n"})
public final class UtaDelegationRecordFragment extends OldBaseFragment implements InterfaceC46752b {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f54099U = C45681e.m100799e(this, new Function1<UtaDelegationRecordFragment, C43657d>() { // from class: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43657d invoke(@NotNull UtaDelegationRecordFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43657d.m96074a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43657d, Unit>() { // from class: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43657d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43657d c43657d) {
            invoke(c43657d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ArrayList<Fragment> f54100V = new ArrayList<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f54101W = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtaDelegationRecordFragment.m66026x3(this.f54117b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f54102X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f54103Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f54104Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f54105a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f54106b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f54107c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f54108d0;

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f54098f0 = {Reflection.property1(new PropertyReference1Impl(UtaDelegationRecordFragment.class, "binding", "getBinding()Lcom/kubi/utaspotlib/databinding/UtaDelegationRecodFragmentBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f54097e0 = new Companion(null);

    /* JADX INFO: compiled from: UtaDelegationRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ \u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "symbol", "", "index", "", "utaTradeType", "newInstance", "Lcom/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final UtaDelegationRecordFragment newInstance(@Nullable String symbol, int index, @NotNull String utaTradeType) {
            Intrinsics.checkNotNullParameter(utaTradeType, "utaTradeType");
            UtaDelegationRecordFragment utaDelegationRecordFragment = new UtaDelegationRecordFragment();
            utaDelegationRecordFragment.setArguments(new C27051h().m66724h("symbol", symbol).m66724h("side", "").m66720d("index", index).m66724h("tradeType", utaTradeType).m66717a());
            return utaDelegationRecordFragment;
        }

        public final void start(@NotNull Context context, @Nullable String symbol, int index, @NotNull String utaTradeType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(utaTradeType, "utaTradeType");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.assets_coin_exchange), UtaDelegationRecordFragment.class.getName(), new C27051h().m66724h("symbol", symbol).m66724h("side", "").m66720d("index", index).m66724h("tradeType", utaTradeType).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$a */
    /* JADX INFO: compiled from: UtaDelegationRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment$initTabsUI$1$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26853a extends C45938b {
        public C26853a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            super.mo18273b(i11);
            UtaDelegationRecordFragment.this.m66034U3(i11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$b */
    /* JADX INFO: compiled from: UtaDelegationRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment$initTabsUI$1$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPageScrollStateChanged", "state", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26854b implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C43657d f54110b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UtaDelegationRecordFragment f54111c;

        public C26854b(C43657d c43657d, UtaDelegationRecordFragment utaDelegationRecordFragment) {
            this.f54110b = c43657d;
            this.f54111c = utaDelegationRecordFragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            BaseTextView tvCancel = this.f54110b.f96367f;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66700o(tvCancel);
            String strM66001D3 = this.f54111c.m66001D3();
            if (strM66001D3 == null || strM66001D3.length() == 0 || position >= 2) {
                CheckedTextView ctxCurrent = this.f54110b.f96363b;
                Intrinsics.checkNotNullExpressionValue(ctxCurrent, "ctxCurrent");
                C27046k.m66700o(ctxCurrent);
                View line = this.f54110b.f96366e;
                Intrinsics.checkNotNullExpressionValue(line, "line");
                C27046k.m66700o(line);
            } else {
                CheckedTextView ctxCurrent2 = this.f54110b.f96363b;
                Intrinsics.checkNotNullExpressionValue(ctxCurrent2, "ctxCurrent");
                C27046k.m66685H(ctxCurrent2);
                View line2 = this.f54110b.f96366e;
                Intrinsics.checkNotNullExpressionValue(line2, "line");
                C27046k.m66685H(line2);
            }
            this.f54111c.m66035W3();
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$c */
    /* JADX INFO: compiled from: UtaDelegationRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/utaspotlib/biz/delegation/UtaDelegationRecordFragment$openOrdersDataVM$2$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26855c implements ViewModelProvider.Factory {
        public C26855c() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tCast = modelClass.cast(new OpenOrdersRecordVM(UtaDelegationRecordFragment.this.mo66036p1()));
            Intrinsics.checkNotNullExpressionValue(tCast, "cast(...)");
            return tCast;
        }
    }

    /* JADX INFO: renamed from: A3 */
    private final String m65998A3() {
        return (String) this.f54105a0.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    private final int m65999B3() {
        return ((Number) this.f54107c0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: C3 */
    private final String m66000C3() {
        return (String) this.f54106b0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public final String m66001D3() {
        return (String) this.f54103Y.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    private final BaseFragment m66002G3() {
        return (BaseFragment) this.f54108d0.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m66003L3(C43657d c43657d, UtaDelegationRecordFragment utaDelegationRecordFragment) {
        c43657d.f96363b.toggle();
        utaDelegationRecordFragment.m66027E3().m22136A(new OpenOrdersRecordContract$UiIntent.OnlyCurrentSymbol(c43657d.f96363b.isChecked()));
        ArrayList<Fragment> arrayList = utaDelegationRecordFragment.f54100V;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof OpenOrdersRecordFragment) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((OpenOrdersRecordFragment) it.next()).mo15906F3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final ViewModelProvider.Factory m66010S3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        return utaDelegationRecordFragment.new C26855c();
    }

    /* JADX INFO: renamed from: V3 */
    public static final BaseFragment m66011V3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        return IUnifyAccountService.f53155a.get().mo64984H(utaDelegationRecordFragment.getArguments());
    }

    /* JADX INFO: renamed from: E3 */
    public final OpenOrdersRecordVM m66027E3() {
        return (OpenOrdersRecordVM) this.f54102X.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final String m66029H3() {
        return (String) this.f54104Z.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    public final void m66031J3() {
        OpenOrdersRecordFragment.Companion companion = OpenOrdersRecordFragment.f20577b0;
        this.f54100V.add(companion.newInstance(OrderLevelType.Normal.INSTANCE, m66001D3()));
        this.f54100V.add(companion.newInstance(OrderLevelType.Advanced.INSTANCE, m66001D3()));
        IUnifyAccountService.Companion companion2 = IUnifyAccountService.f53155a;
        this.f54100V.add(companion2.get().mo64980D() ? RnOrderHistoryFragment.f54123V.newInstance() : UtaDelegationHistoryContainerFragment.f54125W.newInstance(m65998A3(), m66000C3(), C27041f.m66668h(m66029H3())));
        BaseFragment baseFragmentMo64984H = companion2.get().mo64984H(getArguments());
        if (baseFragmentMo64984H != null) {
            this.f54100V.add(baseFragmentMo64984H);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m66034U3(int i11) {
        C43852m.m96591c("B5orderList", "orderType", String.valueOf(i11 + 1), null, 8, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.uta_delegation_recod_fragment;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m66031J3();
        m66032K3();
        m66030I3();
        m66033T3();
    }

    @Override // p827zc.InterfaceC46752b
    @NotNull
    /* JADX INFO: renamed from: p1 */
    public AbstractC46753c mo66036p1() {
        return (AbstractC46753c) this.f54101W.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final C43657d m66037y3() {
        return (C43657d) this.f54099U.getValue(this, f54098f0[0]);
    }

    public UtaDelegationRecordFragment() {
        Function0 function0 = new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationRecordFragment.m66010S3(this.f54119b);
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function2 = null;
        this.f54102X = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(OpenOrdersRecordVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
        this.f54103Y = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationRecordFragment.m66009R3(this.f54120b);
            }
        });
        this.f54104Z = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationRecordFragment.m66012X3(this.f54121b);
            }
        });
        this.f54105a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationRecordFragment.m66006O3(this.f54122b);
            }
        });
        this.f54106b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationRecordFragment.m66008Q3(this.f54156b);
            }
        });
        this.f54107c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(UtaDelegationRecordFragment.m66007P3(this.f54157b));
            }
        });
        this.f54108d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationRecordFragment.m66011V3(this.f54158b);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m66004M3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        final OpenOrdersRecordFragment openOrdersRecordFragmentM66028F3 = utaDelegationRecordFragment.m66028F3();
        if (openOrdersRecordFragmentM66028F3 != null) {
            C37134b.m83060c(openOrdersRecordFragmentM66028F3, openOrdersRecordFragmentM66028F3.m22115R3(), new DialogInterface.OnClickListener() { // from class: com.kubi.utaspotlib.biz.delegation.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    UtaDelegationRecordFragment.m66005N3(openOrdersRecordFragmentM66028F3, dialogInterface, i11);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m66005N3(OpenOrdersRecordFragment openOrdersRecordFragment, DialogInterface dialogInterface, int i11) {
        openOrdersRecordFragment.m22114O3();
    }

    /* JADX INFO: renamed from: O3 */
    public static final String m66006O3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        Bundle arguments = utaDelegationRecordFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("fromSymbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: P3 */
    public static final int m66007P3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        Integer numValueOf;
        Bundle arguments = utaDelegationRecordFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("index"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 0);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final String m66008Q3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        Bundle arguments = utaDelegationRecordFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("side");
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public static final String m66009R3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        Bundle arguments = utaDelegationRecordFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m66012X3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        Bundle arguments = utaDelegationRecordFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("tradeType", "SPOT");
        }
        return null;
    }

    /* JADX INFO: renamed from: x3 */
    public static final C43942e m66026x3(UtaDelegationRecordFragment utaDelegationRecordFragment) {
        if (Intrinsics.areEqual(utaDelegationRecordFragment.m66029H3(), "MARGIN")) {
            return new C43943f(utaDelegationRecordFragment.getArguments());
        }
        return new C43942e(utaDelegationRecordFragment.getArguments());
    }

    /* JADX INFO: renamed from: F3 */
    public final OpenOrdersRecordFragment m66028F3() {
        RtlViewPager rtlViewPager;
        C43657d c43657dM66037y3 = m66037y3();
        if (c43657dM66037y3 != null && (rtlViewPager = c43657dM66037y3.f96365d) != null) {
            Object orNull = CollectionsKt.getOrNull(this.f54100V, rtlViewPager.getCurrentItem());
            if (orNull instanceof OpenOrdersRecordFragment) {
                return (OpenOrdersRecordFragment) orNull;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I3 */
    public final void m66030I3() {
        String showSymbol;
        String str;
        CheckedTextView checkedTextView;
        int currentItem;
        CheckedTextView checkedTextView2;
        CheckedTextView checkedTextView3;
        RtlViewPager rtlViewPager;
        OpenOrdersRecordVM openOrdersRecordVMM66027E3 = m66027E3();
        String strM66001D3 = m66001D3();
        if (strM66001D3 == null) {
            strM66001D3 = "";
        }
        openOrdersRecordVMM66027E3.m22136A(new OpenOrdersRecordContract$UiIntent.InitCurrentSymbol(strM66001D3));
        C37890n c37890n = C37890n.f85269a;
        String strM66001D4 = m66001D3();
        if (strM66001D4 == null) {
            strM66001D4 = "";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(strM66001D4);
        if (symbolInfoEntityM85601B != null) {
            showSymbol = symbolInfoEntityM85601B.getShowSymbol();
        } else {
            showSymbol = null;
        }
        String strM66001D5 = m66001D3();
        if (strM66001D5 == null) {
            str = "";
        } else {
            str = strM66001D5;
        }
        String strM66669i = C27041f.m66669i(showSymbol, StringsKt.replace$default(str, C33820nf.f71144W, "/", false, 4, (Object) null));
        if (strM66669i.length() > 0) {
            C43657d c43657dM66037y3 = m66037y3();
            if (c43657dM66037y3 != null && (rtlViewPager = c43657dM66037y3.f96365d) != null) {
                currentItem = rtlViewPager.getCurrentItem();
            } else {
                currentItem = 0;
            }
            if (currentItem < 2) {
                C43657d c43657dM66037y4 = m66037y3();
                if (c43657dM66037y4 != null && (checkedTextView3 = c43657dM66037y4.f96363b) != null) {
                    checkedTextView3.setText(getString(R$string.show_current_symbol, strM66669i));
                }
                C43657d c43657dM66037y5 = m66037y3();
                if (c43657dM66037y5 != null && (checkedTextView2 = c43657dM66037y5.f96363b) != null) {
                    ViewExtKt.m66594y(checkedTextView2);
                    return;
                }
                return;
            }
        }
        C43657d c43657dM66037y6 = m66037y3();
        if (c43657dM66037y6 != null && (checkedTextView = c43657dM66037y6.f96363b) != null) {
            ViewExtKt.m66577h(checkedTextView);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public final void m66032K3() {
        String showSymbol;
        String str;
        final C43657d c43657dM66037y3 = m66037y3();
        if (c43657dM66037y3 != null) {
            RtlViewPager rtlViewPager = c43657dM66037y3.f96365d;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rtlViewPager.setAdapter(new C27103z(childFragmentManager, this.f54100V, m66038z3()));
            c43657dM66037y3.f96364c.setNeedBold(true);
            c43657dM66037y3.f96365d.setOffscreenPageLimit(this.f54100V.size() - 1);
            c43657dM66037y3.f96364c.setViewPager(c43657dM66037y3.f96365d);
            c43657dM66037y3.f96364c.setOnTabSelectListener(new C26853a());
            c43657dM66037y3.f96365d.addOnPageChangeListener(new C26854b(c43657dM66037y3, this));
            c43657dM66037y3.f96365d.setCurrentItem(m65999B3());
            CheckedTextView checkedTextView = c43657dM66037y3.f96363b;
            int i11 = R$string.show_current_symbol;
            C37890n c37890n = C37890n.f85269a;
            String strM66001D3 = m66001D3();
            if (strM66001D3 == null) {
                strM66001D3 = "";
            }
            SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(strM66001D3);
            if (symbolInfoEntityM85601B != null) {
                showSymbol = symbolInfoEntityM85601B.getShowSymbol();
            } else {
                showSymbol = null;
            }
            String strM66001D4 = m66001D3();
            if (strM66001D4 == null) {
                str = "";
            } else {
                str = strM66001D4;
            }
            checkedTextView.setText(getString(i11, C27041f.m66669i(showSymbol, StringsKt.replace$default(str, C33820nf.f71144W, "/", false, 4, (Object) null))));
            CheckedTextView ctxCurrent = c43657dM66037y3.f96363b;
            Intrinsics.checkNotNullExpressionValue(ctxCurrent, "ctxCurrent");
            C27046k.m66711z(ctxCurrent, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationRecordFragment.m66003L3(c43657dM66037y3, this);
                }
            }, 1, null);
            BaseTextView tvCancel = c43657dM66037y3.f96367f;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66711z(tvCancel, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationRecordFragment.m66004M3(this.f54116b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m66033T3() {
        FlowExtKt.m23401b(m66027E3().getStateFlow(), LifecycleOwnerKt.getLifecycleScope(this), new UtaDelegationRecordFragment$subOrderSizeFlow$1(this, null));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m66035W3() {
        int iM22117U3;
        BaseTextView baseTextView;
        OpenOrdersRecordFragment openOrdersRecordFragmentM66028F3 = m66028F3();
        boolean z11 = false;
        if (openOrdersRecordFragmentM66028F3 != null) {
            iM22117U3 = openOrdersRecordFragmentM66028F3.m22117U3();
        } else {
            iM22117U3 = 0;
        }
        if (iM22117U3 > 0) {
            z11 = true;
        }
        C43657d c43657dM66037y3 = m66037y3();
        if (c43657dM66037y3 != null && (baseTextView = c43657dM66037y3.f96367f) != null) {
            AssetExKt.m15138z(baseTextView, z11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public final List<CharSequence> m66038z3() {
        String[] stringArray = getResources().getStringArray(R$array.trade_core_delegation_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        List<CharSequence> mutableList = ArraysKt.toMutableList(stringArray);
        if (m66002G3() != null) {
            mutableList.add(getString(R$string.unify_borrow_label));
        }
        return mutableList;
    }
}
