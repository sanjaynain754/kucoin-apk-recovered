package com.kubi.copytrading.assets.copy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.C11352b;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$color;
import com.kubi.copytrading.R$drawable;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.assets.AssetCopyTradingMainFragment;
import com.kubi.copytrading.assets.CopyTradingCopyAssetEntity;
import com.kubi.copytrading.assets.CopyTradingTraderEntity;
import com.kubi.copytrading.assets.CopyTradingViewModel;
import com.kubi.copytrading.assets.LeadTradingItemEntity;
import com.kubi.copytrading.assets.LeadTradingItemRequestEntity;
import com.kubi.copytrading.assets.SortRequestEntity;
import com.kubi.copytrading.view.CopyTradingUserAvatarView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.CopyTradingTrendView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import hb0.InterfaceC38162f;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385jy.C40820a;
import p402kf.C41014a;
import p429lf.C42180b;
import p532pc.C43434c;
import p532pc.C43436e;
import p532pc.C43437f;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: AssetCopyTradingFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0002J\b\u00109\u001a\u000204H\u0002J\b\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0002J\b\u0010<\u001a\u000204H\u0016J\u0010\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?H\u0003J&\u0010@\u001a\u0002042\u001c\u0010A\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020D\u0018\u00010C\u0018\u00010BH\u0002J\b\u0010E\u001a\u000204H\u0002J\b\u0010F\u001a\u000204H\u0002J\b\u0010G\u001a\u000204H\u0002J\b\u0010H\u001a\u000204H\u0002J\b\u0010I\u001a\u000204H\u0016J\b\u0010J\u001a\u000204H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020&X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006L"}, m90084d2 = {"Lcom/kubi/copytrading/assets/copy/AssetCopyTradingFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/copytrading/databinding/FragmentAssetCopyTradingBinding;", "getBinding", "()Lcom/kubi/copytrading/databinding/FragmentAssetCopyTradingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "copyTradingViewModel", "Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "getCopyTradingViewModel", "()Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "copyTradingViewModel$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;", "getMAdapter", "()Lcom/kubi/copytrading/assets/copy/AssetCopyTradingAdapter;", "mAdapter$delegate", "headerBinding", "Lcom/kubi/copytrading/databinding/ViewCopyTradingHeaderBinding;", "getHeaderBinding", "()Lcom/kubi/copytrading/databinding/ViewCopyTradingHeaderBinding;", "headerBinding$delegate", "headerAccountInfoView", "Lcom/kubi/assets/IAssetAccountView;", "getHeaderAccountInfoView", "()Lcom/kubi/assets/IAssetAccountView;", "headerAccountInfoView$delegate", "footerBinding", "Lcom/kubi/copytrading/databinding/ViewCopyTradingFooterBinding;", "getFooterBinding", "()Lcom/kubi/copytrading/databinding/ViewCopyTradingFooterBinding;", "footerBinding$delegate", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObs", "checkUIState", "fetchRecommend", "initView", "initFooterView", "setHeaderInitialData", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindHeaderData", "data", "Lcom/kubi/copytrading/assets/CopyTradingCopyAssetEntity;", "bindFooterRecommendView", "recommendListUiStatus", "Lkotlin/Pair;", "", "Lcom/kubi/copytrading/assets/LeadTradingItemEntity;", "setFooterLoading", "setFooterLoadFailed", "setFooterEmptyOrders", "setFooterEmptyUsdt", "onRefresh", "onDestroyView", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCopyTradingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCopyTradingFragment.kt\ncom/kubi/copytrading/assets/copy/AssetCopyTradingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,388:1\n147#2,16:389\n147#2,16:420\n147#2,16:436\n106#3,15:405\n1869#4:452\n1563#4:453\n1634#4,3:454\n1870#4:457\n1#5:458\n126#6,2:459\n*S KotlinDebug\n*F\n+ 1 AssetCopyTradingFragment.kt\ncom/kubi/copytrading/assets/copy/AssetCopyTradingFragment\n*L\n65#1:389,16\n70#1:420,16\n78#1:436,16\n66#1:405,15\n293#1:452\n324#1:453\n324#1:454,3\n293#1:457\n194#1:459,2\n*E\n"})
public final class AssetCopyTradingFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f19835U = C45681e.m100799e(this, new Function1<AssetCopyTradingFragment, C43434c>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43434c invoke(@NotNull AssetCopyTradingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43434c.m95629a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43434c, Unit>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43434c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43434c c43434c) {
            invoke(c43434c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f19836V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f19837W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f19838X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f19839Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f19840Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f19841a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f19834c0 = {Reflection.property1(new PropertyReference1Impl(AssetCopyTradingFragment.class, "binding", "getBinding()Lcom/kubi/copytrading/databinding/FragmentAssetCopyTradingBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AssetCopyTradingFragment.class, "headerBinding", "getHeaderBinding()Lcom/kubi/copytrading/databinding/ViewCopyTradingHeaderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AssetCopyTradingFragment.class, "footerBinding", "getFooterBinding()Lcom/kubi/copytrading/databinding/ViewCopyTradingFooterBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f19833b0 = new Companion(null);

    /* JADX INFO: compiled from: AssetCopyTradingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/copytrading/assets/copy/AssetCopyTradingFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/copytrading/assets/copy/AssetCopyTradingFragment;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetCopyTradingFragment newInstance() {
            return new AssetCopyTradingFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$a */
    /* JADX INFO: compiled from: AssetCopyTradingFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11458a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f19842b;

        public C11458a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f19842b = function;
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
            return this.f19842b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19842b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m20705D3(LeadTradingItemEntity leadTradingItemEntity) {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", "guiding", "traderDetail", null, 8, null);
        CopyTradingConfig.f19710a.m20591F(String.valueOf(C27039d.m66652l(leadTradingItemEntity.getLeadConfigId())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    private final CopyTradingViewModel m20707J3() {
        return (CopyTradingViewModel) this.f19836V.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public static final IAssetAccountView m20708O3(AssetCopyTradingFragment assetCopyTradingFragment) {
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        Context contextRequireContext = assetCopyTradingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return iAssetsCenterService.mo15360z(contextRequireContext);
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m20711S3(AssetCopyTradingFragment assetCopyTradingFragment, Pair pair) {
        List arrayList;
        if (pair != null) {
            AssetCopyTradingAdapter assetCopyTradingAdapterM20751N3 = assetCopyTradingFragment.m20751N3();
            List list = (List) pair.getSecond();
            if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
                arrayList = new ArrayList();
            }
            assetCopyTradingAdapterM20751N3.replaceData(arrayList);
        }
        assetCopyTradingFragment.m20745F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m20712T3(AssetCopyTradingFragment assetCopyTradingFragment, Pair pair) {
        if (pair != null) {
            assetCopyTradingFragment.m20743C3(pair);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m20714V3(AssetCopyTradingFragment assetCopyTradingFragment, CopyTradingCopyAssetEntity copyTradingCopyAssetEntity) {
        if (copyTradingCopyAssetEntity != null) {
            assetCopyTradingFragment.m20744E3(copyTradingCopyAssetEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m20715W3(AssetCopyTradingFragment assetCopyTradingFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetCopyTradingFragment.onRefresh();
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m20717Y3(AssetCopyTradingFragment assetCopyTradingFragment) {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_HEAD, "copyLeadSwitch", null, 8, null);
        Fragment parentFragment = assetCopyTradingFragment.getParentFragment();
        AssetCopyTradingMainFragment assetCopyTradingMainFragment = parentFragment instanceof AssetCopyTradingMainFragment ? (AssetCopyTradingMainFragment) parentFragment : null;
        if (assetCopyTradingMainFragment != null) {
            assetCopyTradingMainFragment.m20642m3(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m20718Z3() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_HEAD, "help", null, 8, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, CopyTradingConfig.f19710a.m20600q(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m20719a4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_HEAD, "totalPnl", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("myCopy");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m20720b4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_HEAD, "unrealizedPnl", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("myCopy");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m20721c4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", TtmlNode.TAG_HEAD, "copyTradeButton", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("copyHome");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m20722d4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsCopy", "guiding", "goCopy", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("copyHome");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m20723e4(AssetCopyTradingFragment assetCopyTradingFragment, Boolean bool) {
        StorageId<Boolean> storageIdMo15354t = IAssetsCenterService.f16464a.get().mo15354t();
        Intrinsics.checkNotNull(bool);
        C46392a.m102328k(storageIdMo15354t, bool.booleanValue());
        assetCopyTradingFragment.m20707J3().m20649C().setValue(bool);
    }

    /* JADX INFO: renamed from: f4 */
    public static final AssetCopyTradingAdapter m20724f4(AssetCopyTradingFragment assetCopyTradingFragment) {
        return new AssetCopyTradingAdapter(assetCopyTradingFragment);
    }

    /* JADX INFO: renamed from: C3 */
    public final void m20743C3(Pair<Boolean, ? extends List<LeadTradingItemEntity>> pair) {
        List<LeadTradingItemEntity> listTake;
        LinearLayoutCompat linearLayoutCompat;
        BigDecimal bigDecimalAbs;
        LinearLayoutCompat linearLayoutCompat2;
        if (pair == null) {
            m20756k4();
            return;
        }
        if (!pair.getFirst().booleanValue()) {
            m20755j4();
            return;
        }
        List<LeadTradingItemEntity> second = pair.getSecond();
        if (second == null || second.isEmpty()) {
            m20753h4();
            return;
        }
        m20754i4();
        C43436e c43436eM20748K3 = m20748K3();
        if (c43436eM20748K3 != null && (linearLayoutCompat2 = c43436eM20748K3.f95918c) != null) {
            linearLayoutCompat2.removeAllViews();
        }
        List<LeadTradingItemEntity> second2 = pair.getSecond();
        if (second2 == null || (listTake = CollectionsKt.take(second2, 2)) == null) {
            return;
        }
        for (final LeadTradingItemEntity leadTradingItemEntity : listTake) {
            String strM89950x = null;
            View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.view_copy_trading_guide, (ViewGroup) null);
            CopyTradingUserAvatarView copyTradingUserAvatarView = (CopyTradingUserAvatarView) viewInflate.findViewById(R$id.userAvatar);
            BaseTextView baseTextView = (BaseTextView) viewInflate.findViewById(R$id.userName);
            BaseTextView baseTextView2 = (BaseTextView) viewInflate.findViewById(R$id.userDesc);
            BaseTextView baseTextView3 = (BaseTextView) viewInflate.findViewById(R$id.tvPnlValue);
            BaseTextView baseTextView4 = (BaseTextView) viewInflate.findViewById(R$id.tvPnlLegal);
            CopyTradingTrendView copyTradingTrendView = (CopyTradingTrendView) viewInflate.findViewById(R$id.copyTrendView);
            copyTradingUserAvatarView.m20958b(leadTradingItemEntity.getAvatarUrl(), leadTradingItemEntity.getNickName());
            baseTextView.setText(C27041f.m66669i(leadTradingItemEntity.getNickName(), "--"));
            C27096v0 c27096v0 = new C27096v0();
            Object currentCopyUserCount = leadTradingItemEntity.getCurrentCopyUserCount();
            if (currentCopyUserCount == null) {
                currentCopyUserCount = "--";
            }
            C27096v0 c27096v0Append = c27096v0.append(currentCopyUserCount.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" /");
            Object maxCopyUserCount = leadTradingItemEntity.getMaxCopyUserCount();
            if (maxCopyUserCount == null) {
                maxCopyUserCount = "--";
            }
            sb2.append(maxCopyUserCount);
            baseTextView2.setText(c27096v0Append.m66905e(sb2.toString(), viewInflate.getResources().getColor(R$color.c_text30)));
            StringBuilder sb3 = new StringBuilder();
            BigDecimal thirtyDayPnlRatio = leadTradingItemEntity.getThirtyDayPnlRatio();
            String strM66644d = thirtyDayPnlRatio != null ? C27039d.m66644d(thirtyDayPnlRatio) : null;
            if (strM66644d == null) {
                strM66644d = "";
            }
            sb3.append(strM66644d);
            BigDecimal thirtyDayPnlRatio2 = leadTradingItemEntity.getThirtyDayPnlRatio();
            sb3.append(C42180b.m92649n(thirtyDayPnlRatio2 != null ? C42180b.m92642g(thirtyDayPnlRatio2, null, null, 0, false, false, false, 63, null) : null));
            String string = sb3.toString();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            baseTextView3.setTextColor(C22890g.m54282g(contextRequireContext, C27039d.m66656p(leadTradingItemEntity.getThirtyDayPnlRatio()), 0, 2, null));
            baseTextView3.setText(string);
            BigDecimal thirtyDayPnl = leadTradingItemEntity.getThirtyDayPnl();
            if (thirtyDayPnl != null && (bigDecimalAbs = thirtyDayPnl.abs()) != null) {
                strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, "USDT"), null, null, 0, false, true, false, true, 47, null);
            }
            baseTextView4.setText(String.valueOf(C27041f.m66669i(strM89950x, "--")));
            List<BigDecimal> totalPnlDate = leadTradingItemEntity.getTotalPnlDate();
            if (totalPnlDate == null) {
                totalPnlDate = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(totalPnlDate, 10));
            Iterator<T> it = totalPnlDate.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((BigDecimal) it.next()).floatValue()));
            }
            Context context = viewInflate.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CopyTradingTrendView.m54113d(copyTradingTrendView, arrayList, C22890g.m54281f(context, C27039d.m66647g(leadTradingItemEntity.getThirtyDayPnlRatio()) >= 0.0d), false, 4, null);
            Intrinsics.checkNotNull(viewInflate);
            C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20705D3(leadTradingItemEntity);
                }
            }, 1, null);
            C43436e c43436eM20748K4 = m20748K3();
            if (c43436eM20748K4 != null && (linearLayoutCompat = c43436eM20748K4.f95918c) != null) {
                linearLayoutCompat.addView(viewInflate);
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E3 */
    public final void m20744E3(CopyTradingCopyAssetEntity copyTradingCopyAssetEntity) {
        String str;
        StringBuilder sb2;
        int i11;
        String strM92640e;
        BigDecimal bigDecimalAbs;
        BigDecimal bigDecimalAbs2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C43437f c43437fM20750M3 = m20750M3();
        if (c43437fM20750M3 != null) {
            String noNullCurrency = copyTradingCopyAssetEntity.getNoNullCurrency();
            int iMo15349o = IAssetsCenterService.f16464a.get().mo15349o(noNullCurrency);
            C43437f c43437fM20750M4 = m20750M3();
            if (c43437fM20750M4 != null && (baseTextView2 = c43437fM20750M4.f95934l) != null) {
                baseTextView2.setText(getString(R$string.copytd_total_pnl, noNullCurrency));
            }
            C43437f c43437fM20750M5 = m20750M3();
            if (c43437fM20750M5 != null && (baseTextView = c43437fM20750M5.f95935m) != null) {
                baseTextView.setText(getString(R$string.copytd_total_unpnl, noNullCurrency));
            }
            IAssetAccountView iAssetAccountViewM20749L3 = m20749L3();
            BigDecimal totalAssets = copyTradingCopyAssetEntity.getTotalAssets();
            String strM66669i = C27041f.m66669i(totalAssets != null ? C42180b.m92640e(totalAssets, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--");
            BigDecimal totalAssets2 = copyTradingCopyAssetEntity.getTotalAssets();
            iAssetAccountViewM20749L3.mo19953a(noNullCurrency, strM66669i, C27041f.m66669i(totalAssets2 != null ? C41014a.m89950x(C41014a.m89940n(totalAssets2, noNullCurrency), null, null, 0, false, true, false, true, 47, null) : null, "--"));
            ShowHideTextView showHideTextView = c43437fM20750M3.f95933k;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            BigDecimal bigDecimalM89922G = C41014a.m89922G(copyTradingCopyAssetEntity.getTotalPnl(), null, 1, null);
            int i12 = R$color.c_text;
            showHideTextView.setTextColor(C22890g.m54280e(contextRequireContext, bigDecimalM89922G, i12));
            ShowHideTextView showHideTextView2 = c43437fM20750M3.f95933k;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C27039d.m66644d(copyTradingCopyAssetEntity.getTotalPnl()));
            BigDecimal totalPnl = copyTradingCopyAssetEntity.getTotalPnl();
            if (totalPnl != null) {
                i11 = i12;
                str = "requireContext(...)";
                sb2 = sb3;
                strM92640e = C42180b.m92640e(totalPnl, null, iMo15349o, false, false, false, 2, null, 93, null);
            } else {
                str = "requireContext(...)";
                sb2 = sb3;
                i11 = i12;
                strM92640e = null;
            }
            sb2.append(C27041f.m66669i(strM92640e, "--"));
            showHideTextView2.setText(sb2.toString());
            ShowHideTextView showHideTextView3 = c43437fM20750M3.f95932j;
            BigDecimal totalPnl2 = copyTradingCopyAssetEntity.getTotalPnl();
            showHideTextView3.setText(C27041f.m66669i((totalPnl2 == null || (bigDecimalAbs2 = totalPnl2.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs2, noNullCurrency), null, null, 0, false, true, false, true, 47, null), "--"));
            ShowHideTextView showHideTextView4 = c43437fM20750M3.f95937o;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, str);
            String strM89950x = null;
            showHideTextView4.setTextColor(C22890g.m54280e(contextRequireContext2, C41014a.m89922G(copyTradingCopyAssetEntity.getUnrealizedPnl(), null, 1, null), i11));
            ShowHideTextView showHideTextView5 = c43437fM20750M3.f95937o;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C27039d.m66644d(copyTradingCopyAssetEntity.getUnrealizedPnl()));
            BigDecimal unrealizedPnl = copyTradingCopyAssetEntity.getUnrealizedPnl();
            sb4.append(C27041f.m66669i(unrealizedPnl != null ? C42180b.m92640e(unrealizedPnl, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            showHideTextView5.setText(sb4.toString());
            ShowHideTextView showHideTextView6 = c43437fM20750M3.f95936n;
            BigDecimal unrealizedPnl2 = copyTradingCopyAssetEntity.getUnrealizedPnl();
            if (unrealizedPnl2 != null && (bigDecimalAbs = unrealizedPnl2.abs()) != null) {
                strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, noNullCurrency), null, null, 0, false, true, false, true, 47, null);
            }
            showHideTextView6.setText(C27041f.m66669i(strM89950x, "--"));
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m20746H3() {
        m20707J3().m20654u(new LeadTradingItemRequestEntity(1, 2, new SortRequestEntity("thirty_day_pnl_ratio", "DESC")));
    }

    /* JADX INFO: renamed from: I3 */
    public final C43434c m20747I3() {
        return (C43434c) this.f19835U.getValue(this, f19834c0[0]);
    }

    /* JADX INFO: renamed from: K3 */
    public final C43436e m20748K3() {
        return (C43436e) this.f19840Z.getValue(this, f19834c0[2]);
    }

    /* JADX INFO: renamed from: L3 */
    public final IAssetAccountView m20749L3() {
        return (IAssetAccountView) this.f19839Y.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final C43437f m20750M3() {
        return (C43437f) this.f19838X.getValue(this, f19834c0[1]);
    }

    /* JADX INFO: renamed from: N3 */
    public final AssetCopyTradingAdapter m20751N3() {
        return (AssetCopyTradingAdapter) this.f19837W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19841a0() {
        return this.f19841a0;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_asset_copy_trading, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m20710R3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f19841a0 = z11;
    }

    public AssetCopyTradingFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.copytrading.assets.copy.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingFragment.m20706G3(this.f19863b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewModels$default$1
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
        this.f19836V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CopyTradingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewModels$default$4
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
        this.f19837W = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.assets.copy.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingFragment.m20724f4(this.f19851b);
            }
        });
        this.f19838X = C45681e.m100799e(this, new Function1<AssetCopyTradingFragment, C43437f>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewBindingFragment$4
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43437f invoke(@NotNull AssetCopyTradingFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                View viewInflate = LayoutInflater.from(this.this$0.requireContext()).inflate(R$layout.view_copy_trading_header, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return C43437f.m95635a(viewInflate);
            }

            {
                super(1);
            }
        }, new Function1<C43437f, Unit>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewBindingFragment$3
            public final void invoke(@NotNull C43437f it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43437f c43437f) {
                invoke(c43437f);
                return Unit.INSTANCE;
            }
        });
        this.f19839Y = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.assets.copy.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingFragment.m20708O3(this.f19852b);
            }
        });
        this.f19840Z = C45681e.m100799e(this, new Function1<AssetCopyTradingFragment, C43436e>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewBindingFragment$6
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43436e invoke(@NotNull AssetCopyTradingFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                View viewInflate = LayoutInflater.from(this.this$0.requireContext()).inflate(R$layout.view_copy_trading_footer, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return C43436e.m95633a(viewInflate);
            }

            {
                super(1);
            }
        }, new Function1<C43436e, Unit>() { // from class: com.kubi.copytrading.assets.copy.AssetCopyTradingFragment$special$$inlined$viewBindingFragment$5
            public final void invoke(@NotNull C43436e it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43436e c43436e) {
                invoke(c43436e);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public static final ViewModelStoreOwner m20706G3(AssetCopyTradingFragment assetCopyTradingFragment) {
        Fragment parentFragment = assetCopyTradingFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return assetCopyTradingFragment;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m20709Q3(AssetCopyTradingFragment assetCopyTradingFragment) {
        Pair<Boolean, List<CopyTradingTraderEntity>> value = assetCopyTradingFragment.m20707J3().m20657x().getValue();
        if (value != null && !value.getFirst().booleanValue()) {
            assetCopyTradingFragment.m20707J3().m20651r();
        } else {
            assetCopyTradingFragment.m20746H3();
        }
        assetCopyTradingFragment.m20756k4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    private final void m20710R3() {
        m20707J3().m20656w().observe(getViewLifecycleOwner(), new C11458a(new Function1() { // from class: com.kubi.copytrading.assets.copy.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCopyTradingFragment.m20714V3(this.f19853b, (CopyTradingCopyAssetEntity) obj);
            }
        }));
        m20707J3().m20657x().observe(getViewLifecycleOwner(), new C11458a(new Function1() { // from class: com.kubi.copytrading.assets.copy.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCopyTradingFragment.m20711S3(this.f19854b, (Pair) obj);
            }
        }));
        m20707J3().m20648B().observe(getViewLifecycleOwner(), new C11458a(new Function1() { // from class: com.kubi.copytrading.assets.copy.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCopyTradingFragment.m20712T3(this.f19855b, (Pair) obj);
            }
        }));
        m20707J3().m20649C().observe(getViewLifecycleOwner(), new C11458a(new Function1() { // from class: com.kubi.copytrading.assets.copy.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCopyTradingFragment.m20713U3(this.f19856b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m20713U3(AssetCopyTradingFragment assetCopyTradingFragment, Boolean bool) {
        ConstraintLayout root;
        C43437f c43437fM20750M3 = assetCopyTradingFragment.m20750M3();
        if (c43437fM20750M3 != null) {
            root = c43437fM20750M3.getRoot();
        } else {
            root = null;
        }
        Intrinsics.checkNotNull(bool);
        ShowHideTextView.m54778d(root, bool.booleanValue());
        IAssetAccountView.m20180c(assetCopyTradingFragment.m20749L3(), null, bool, 1, null);
        assetCopyTradingFragment.m20751N3().m20701y(bool.booleanValue());
        assetCopyTradingFragment.m20751N3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m20716X3(AssetCopyTradingFragment assetCopyTradingFragment) {
        assetCopyTradingFragment.m20707J3().m20651r();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m20725g4(AssetCopyTradingFragment assetCopyTradingFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C43434c c43434cM20747I3 = assetCopyTradingFragment.m20747I3();
        if (c43434cM20747I3 != null && (kuCoinRefreshLayout = c43434cM20747I3.f95898c) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    private final void initView() {
        View view;
        LinearLayout linearLayout;
        View view2;
        LinearLayout linearLayout2;
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        ImageView imageView;
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat;
        RecyclerView recyclerView;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        m20757l4();
        C43434c c43434cM20747I3 = m20747I3();
        if (c43434cM20747I3 != null && (kuCoinRefreshLayout = c43434cM20747I3.f95898c) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.copytrading.assets.copy.f
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetCopyTradingFragment.m20715W3(this.f19850b, interfaceC38162f);
                }
            });
        }
        C43434c c43434cM20747I4 = m20747I3();
        if (c43434cM20747I4 != null && (recyclerView = c43434cM20747I4.f95897b) != null) {
            recyclerView.setAdapter(m20751N3());
        }
        AssetCopyTradingAdapter assetCopyTradingAdapterM20751N3 = m20751N3();
        C43437f c43437fM20750M3 = m20750M3();
        Intrinsics.checkNotNull(c43437fM20750M3);
        assetCopyTradingAdapterM20751N3.addHeaderView(c43437fM20750M3.getRoot());
        AssetCopyTradingAdapter assetCopyTradingAdapterM20751N4 = m20751N3();
        C43436e c43436eM20748K3 = m20748K3();
        Intrinsics.checkNotNull(c43436eM20748K3);
        assetCopyTradingAdapterM20751N4.addFooterView(c43436eM20748K3.getRoot());
        m20751N3().m20694A(new Function0() { // from class: com.kubi.copytrading.assets.copy.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingFragment.m20716X3(this.f19860b);
            }
        });
        C43437f c43437fM20750M4 = m20750M3();
        if (c43437fM20750M4 != null && (linearLayoutCompat = c43437fM20750M4.f95927e) != null) {
            linearLayoutCompat.addView(m20749L3().getView(), -1, -2);
        }
        C43437f c43437fM20750M5 = m20750M3();
        if (c43437fM20750M5 != null && (baseTextView = c43437fM20750M5.f95930h) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20717Y3(this.f19861b);
                }
            }, 1, null);
        }
        C43437f c43437fM20750M6 = m20750M3();
        if (c43437fM20750M6 != null && (imageView = c43437fM20750M6.f95925c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20718Z3();
                }
            }, 1, null);
        }
        C43437f c43437fM20750M7 = m20750M3();
        if (c43437fM20750M7 != null && (linearLayout4 = c43437fM20750M7.f95926d) != null) {
            C27046k.m66711z(linearLayout4, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20719a4();
                }
            }, 1, null);
        }
        C43437f c43437fM20750M8 = m20750M3();
        if (c43437fM20750M8 != null && (linearLayout3 = c43437fM20750M8.f95928f) != null) {
            C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20720b4();
                }
            }, 1, null);
        }
        C43437f c43437fM20750M9 = m20750M3();
        if (c43437fM20750M9 != null && (kcPrimaryButton = c43437fM20750M9.f95924b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20721c4();
                }
            }, 1, null);
        }
        C43436e c43436eM20748K4 = m20748K3();
        if (c43436eM20748K4 != null && (kcSecondaryButton = c43436eM20748K4.f95917b) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20722d4();
                }
            }, 1, null);
        }
        m20752P3();
        m20749L3().mo19955d(this, "B20CopyTradeFuturesAssetsCopy");
        IAssetAccountView.m20180c(m20749L3(), new Consumer() { // from class: com.kubi.copytrading.assets.copy.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetCopyTradingFragment.m20723e4(this.f19862b, (Boolean) obj);
            }
        }, null, 2, null);
        if (!CopyTradingConfig.f19710a.m20608y()) {
            C43437f c43437fM20750M10 = m20750M3();
            if (c43437fM20750M10 != null && (linearLayout2 = c43437fM20750M10.f95929g) != null) {
                ViewExtKt.m66577h(linearLayout2);
            }
            C43437f c43437fM20750M11 = m20750M3();
            if (c43437fM20750M11 != null && (view2 = c43437fM20750M11.f95931i) != null) {
                ViewExtKt.m66577h(view2);
                return;
            }
            return;
        }
        C43437f c43437fM20750M12 = m20750M3();
        if (c43437fM20750M12 != null && (linearLayout = c43437fM20750M12.f95929g) != null) {
            ViewExtKt.m66594y(linearLayout);
        }
        C43437f c43437fM20750M13 = m20750M3();
        if (c43437fM20750M13 != null && (view = c43437fM20750M13.f95931i) != null) {
            ViewExtKt.m66594y(view);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m20745F3() {
        FrameLayout root;
        Pair<Boolean, List<CopyTradingTraderEntity>> value = m20707J3().m20657x().getValue();
        if (value == null) {
            m20756k4();
            return;
        }
        if (value.getFirst().booleanValue()) {
            List<CopyTradingTraderEntity> second = value.getSecond();
            if (second != null && !second.isEmpty()) {
                C43436e c43436eM20748K3 = m20748K3();
                if (c43436eM20748K3 != null && (root = c43436eM20748K3.getRoot()) != null) {
                    ViewExtKt.m66577h(root);
                    return;
                }
                return;
            }
            m20746H3();
            return;
        }
        m20755j4();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m20752P3() {
        ViewGroup.LayoutParams layoutParams;
        C40820a c40820a;
        TextView textView;
        C40820a c40820a2;
        ImageView imageView;
        C40820a c40820a3;
        ImageView imageView2;
        C40820a c40820a4;
        TextView textView2;
        C40820a c40820a5;
        ImageView imageView3;
        m20756k4();
        C43436e c43436eM20748K3 = m20748K3();
        if (c43436eM20748K3 != null && (c40820a5 = c43436eM20748K3.f95921f) != null && (imageView3 = c40820a5.f90679b) != null) {
            imageView3.setImageResource(R$drawable.ic2_common_system_maintain);
        }
        C43436e c43436eM20748K4 = m20748K3();
        if (c43436eM20748K4 != null && (c40820a4 = c43436eM20748K4.f95921f) != null && (textView2 = c40820a4.f90680c) != null) {
            textView2.setText(getString(R$string.load_failed_click_retry));
        }
        C43436e c43436eM20748K5 = m20748K3();
        LinearLayout.LayoutParams layoutParams2 = null;
        if (c43436eM20748K5 != null && (c40820a3 = c43436eM20748K5.f95921f) != null && (imageView2 = c40820a3.f90679b) != null) {
            layoutParams = imageView2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        }
        if (layoutParams2 != null) {
            layoutParams2.topMargin = C27029c.m66603f(this, 30);
        }
        C43436e c43436eM20748K6 = m20748K3();
        if (c43436eM20748K6 != null && (c40820a2 = c43436eM20748K6.f95921f) != null && (imageView = c40820a2.f90679b) != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        C43436e c43436eM20748K7 = m20748K3();
        if (c43436eM20748K7 != null && (c40820a = c43436eM20748K7.f95921f) != null && (textView = c40820a.f90680c) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.copy.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCopyTradingFragment.m20709Q3(this.f19859b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m20753h4() {
        LinearLayoutCompat linearLayoutCompat;
        C40820a c40820a;
        LinearLayout root;
        AppCompatImageView appCompatImageView;
        ShapeLinearLayout shapeLinearLayout;
        FrameLayout root2;
        C43436e c43436eM20748K3 = m20748K3();
        if (c43436eM20748K3 != null && (root2 = c43436eM20748K3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43436e c43436eM20748K4 = m20748K3();
        if (c43436eM20748K4 != null && (shapeLinearLayout = c43436eM20748K4.f95920e) != null) {
            ViewExtKt.m66577h(shapeLinearLayout);
        }
        C43436e c43436eM20748K5 = m20748K3();
        if (c43436eM20748K5 != null && (appCompatImageView = c43436eM20748K5.f95922g) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43436e c43436eM20748K6 = m20748K3();
        if (c43436eM20748K6 != null && (c40820a = c43436eM20748K6.f95921f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C43436e c43436eM20748K7 = m20748K3();
        if (c43436eM20748K7 != null && (linearLayoutCompat = c43436eM20748K7.f95919d) != null) {
            ViewExtKt.m66594y(linearLayoutCompat);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m20754i4() {
        ShapeLinearLayout shapeLinearLayout;
        LinearLayoutCompat linearLayoutCompat;
        C40820a c40820a;
        LinearLayout root;
        AppCompatImageView appCompatImageView;
        FrameLayout root2;
        C43436e c43436eM20748K3 = m20748K3();
        if (c43436eM20748K3 != null && (root2 = c43436eM20748K3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43436e c43436eM20748K4 = m20748K3();
        if (c43436eM20748K4 != null && (appCompatImageView = c43436eM20748K4.f95922g) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43436e c43436eM20748K5 = m20748K3();
        if (c43436eM20748K5 != null && (c40820a = c43436eM20748K5.f95921f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C43436e c43436eM20748K6 = m20748K3();
        if (c43436eM20748K6 != null && (linearLayoutCompat = c43436eM20748K6.f95919d) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C43436e c43436eM20748K7 = m20748K3();
        if (c43436eM20748K7 != null && (shapeLinearLayout = c43436eM20748K7.f95920e) != null) {
            ViewExtKt.m66594y(shapeLinearLayout);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m20755j4() {
        C40820a c40820a;
        LinearLayout root;
        AppCompatImageView appCompatImageView;
        LinearLayoutCompat linearLayoutCompat;
        ShapeLinearLayout shapeLinearLayout;
        FrameLayout root2;
        C43436e c43436eM20748K3 = m20748K3();
        if (c43436eM20748K3 != null && (root2 = c43436eM20748K3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43436e c43436eM20748K4 = m20748K3();
        if (c43436eM20748K4 != null && (shapeLinearLayout = c43436eM20748K4.f95920e) != null) {
            ViewExtKt.m66577h(shapeLinearLayout);
        }
        C43436e c43436eM20748K5 = m20748K3();
        if (c43436eM20748K5 != null && (linearLayoutCompat = c43436eM20748K5.f95919d) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C43436e c43436eM20748K6 = m20748K3();
        if (c43436eM20748K6 != null && (appCompatImageView = c43436eM20748K6.f95922g) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43436e c43436eM20748K7 = m20748K3();
        if (c43436eM20748K7 != null && (c40820a = c43436eM20748K7.f95921f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20756k4() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C40820a c40820a;
        LinearLayout root;
        LinearLayoutCompat linearLayoutCompat;
        ShapeLinearLayout shapeLinearLayout;
        FrameLayout root2;
        C43436e c43436eM20748K3 = m20748K3();
        if (c43436eM20748K3 != null && (root2 = c43436eM20748K3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43436e c43436eM20748K4 = m20748K3();
        if (c43436eM20748K4 != null && (shapeLinearLayout = c43436eM20748K4.f95920e) != null) {
            ViewExtKt.m66577h(shapeLinearLayout);
        }
        C43436e c43436eM20748K5 = m20748K3();
        if (c43436eM20748K5 != null && (linearLayoutCompat = c43436eM20748K5.f95919d) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C43436e c43436eM20748K6 = m20748K3();
        if (c43436eM20748K6 != null && (c40820a = c43436eM20748K6.f95921f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C43436e c43436eM20748K7 = m20748K3();
        if (c43436eM20748K7 != null && (appCompatImageView2 = c43436eM20748K7.f95922g) != null) {
            ViewExtKt.m66594y(appCompatImageView2);
        }
        C43436e c43436eM20748K8 = m20748K3();
        if (c43436eM20748K8 != null && (appCompatImageView = c43436eM20748K8.f95922g) != null) {
            C11352b.m20197a(appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m20757l4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C43437f c43437fM20750M3 = m20750M3();
        if (c43437fM20750M3 != null && (baseTextView2 = c43437fM20750M3.f95934l) != null) {
            baseTextView2.setText(getString(R$string.copytd_total_pnl, "--"));
        }
        C43437f c43437fM20750M4 = m20750M3();
        if (c43437fM20750M4 != null && (baseTextView = c43437fM20750M4.f95935m) != null) {
            baseTextView.setText(getString(R$string.copytd_total_unpnl, "--"));
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m20751N3().m20700x();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m20707J3().m20650q();
        m20707J3().m20651r();
        BaseFragment.runOnUiThread$default(this, new Function0() { // from class: com.kubi.copytrading.assets.copy.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCopyTradingFragment.m20725g4(this.f19857b);
            }
        }, 1000L, null, 4, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        onRefresh();
    }
}
