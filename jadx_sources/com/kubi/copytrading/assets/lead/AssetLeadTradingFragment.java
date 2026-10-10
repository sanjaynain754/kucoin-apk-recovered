package com.kubi.copytrading.assets.lead;

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
import androidx.fragment.app.FragmentManager;
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
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.assets.AssetCopyTradingMainFragment;
import com.kubi.copytrading.assets.CopyTradingViewModel;
import com.kubi.copytrading.assets.LeadTraderTrialFundStatus;
import com.kubi.copytrading.assets.LeadTraderUsedTrialEntity;
import com.kubi.copytrading.assets.LeadTradingPositionEntity;
import com.kubi.copytrading.assets.LeaderTraderAccountInfoEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
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
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385jy.C40820a;
import p402kf.C41014a;
import p429lf.C42180b;
import p532pc.C43434c;
import p532pc.C43438g;
import p532pc.C43439h;
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

/* JADX INFO: compiled from: AssetLeadTradingFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0002J\b\u00109\u001a\u000204H\u0002J\b\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0002J\b\u0010<\u001a\u000204H\u0002J\b\u0010=\u001a\u000204H\u0002J\b\u0010>\u001a\u000204H\u0002J\u0010\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020AH\u0003J\b\u0010B\u001a\u000204H\u0016J\b\u0010C\u001a\u000204H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\u001d\u0010&\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b(\u0010)¨\u0006E"}, m90084d2 = {"Lcom/kubi/copytrading/assets/lead/AssetLeadTradingFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "copyTradingViewModel", "Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "getCopyTradingViewModel", "()Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "copyTradingViewModel$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;", "getMAdapter", "()Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;", "mAdapter$delegate", "binding", "Lcom/kubi/copytrading/databinding/FragmentAssetCopyTradingBinding;", "getBinding", "()Lcom/kubi/copytrading/databinding/FragmentAssetCopyTradingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "headerBinding", "Lcom/kubi/copytrading/databinding/ViewLeadTradingHeaderBinding;", "getHeaderBinding", "()Lcom/kubi/copytrading/databinding/ViewLeadTradingHeaderBinding;", "headerBinding$delegate", "headerAccountInfoView", "Lcom/kubi/assets/IAssetAccountView;", "getHeaderAccountInfoView", "()Lcom/kubi/assets/IAssetAccountView;", "headerAccountInfoView$delegate", "footerBinding", "Lcom/kubi/copytrading/databinding/ViewLeadTradingFooterBinding;", "getFooterBinding", "()Lcom/kubi/copytrading/databinding/ViewLeadTradingFooterBinding;", "footerBinding$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObs", "setFooterLoading", "setFooterLoadFailed", "setFooterEmptyUsdt", "setFooterEmptyOrders", "checkUIState", "initView", "initFooterView", "setHeaderInitialData", "bindHeaderData", "data", "Lcom/kubi/copytrading/assets/LeaderTraderAccountInfoEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onRefresh", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetLeadTradingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetLeadTradingFragment.kt\ncom/kubi/copytrading/assets/lead/AssetLeadTradingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,349:1\n106#2,15:350\n147#3,16:365\n147#3,16:381\n147#3,16:397\n1#4:413\n126#5,2:414\n*S KotlinDebug\n*F\n+ 1 AssetLeadTradingFragment.kt\ncom/kubi/copytrading/assets/lead/AssetLeadTradingFragment\n*L\n60#1:350,15\n64#1:365,16\n65#1:381,16\n73#1:397,16\n244#1:414,2\n*E\n"})
public final class AssetLeadTradingFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    public boolean f19867U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f19868V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f19869W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f19870X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f19871Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f19872Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f19873a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f19866c0 = {Reflection.property1(new PropertyReference1Impl(AssetLeadTradingFragment.class, "binding", "getBinding()Lcom/kubi/copytrading/databinding/FragmentAssetCopyTradingBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AssetLeadTradingFragment.class, "headerBinding", "getHeaderBinding()Lcom/kubi/copytrading/databinding/ViewLeadTradingHeaderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AssetLeadTradingFragment.class, "footerBinding", "getFooterBinding()Lcom/kubi/copytrading/databinding/ViewLeadTradingFooterBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f19865b0 = new Companion(null);

    /* JADX INFO: compiled from: AssetLeadTradingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/copytrading/assets/lead/AssetLeadTradingFragment$Companion;", "", "<init>", "()V", "ASSET_DEFAULT_PLACEHOLDER", "", "newInstance", "Lcom/kubi/copytrading/assets/lead/AssetLeadTradingFragment;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetLeadTradingFragment newInstance() {
            return new AssetLeadTradingFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$a */
    /* JADX INFO: compiled from: AssetLeadTradingFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11484a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f19874b;

        public C11484a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f19874b = function;
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
            return this.f19874b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19874b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m20769H3(LeadTraderUsedTrialEntity leadTraderUsedTrialEntity) {
        CopyTradingConfig.f19710a.m20593H(leadTraderUsedTrialEntity.getId(), "lead");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    private final C43434c m20772K3() {
        return (C43434c) this.f19870X.getValue(this, f19866c0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    private final CopyTradingViewModel m20773L3() {
        return (CopyTradingViewModel) this.f19868V.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    private final IAssetAccountView m20774N3() {
        return (IAssetAccountView) this.f19872Z.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public static final IAssetAccountView m20775Q3(AssetLeadTradingFragment assetLeadTradingFragment) {
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        Context contextRequireContext = assetLeadTradingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return iAssetsCenterService.mo15360z(contextRequireContext);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m20779U3(AssetLeadTradingFragment assetLeadTradingFragment, Pair pair) {
        List listEmptyList;
        if (pair != null) {
            AssetLeadTradingAdapter assetLeadTradingAdapterM20823P3 = assetLeadTradingFragment.m20823P3();
            List list = (List) pair.getSecond();
            if (list == null || (listEmptyList = CollectionsKt.toMutableList((Collection) list)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            assetLeadTradingAdapterM20823P3.replaceData(listEmptyList);
        }
        assetLeadTradingFragment.m20770I3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m20781W3(AssetLeadTradingFragment assetLeadTradingFragment, LeaderTraderAccountInfoEntity leaderTraderAccountInfoEntity) {
        if (leaderTraderAccountInfoEntity != null) {
            assetLeadTradingFragment.m20820G3(leaderTraderAccountInfoEntity);
        }
        assetLeadTradingFragment.m20770I3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m20782X3(AssetLeadTradingFragment assetLeadTradingFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetLeadTradingFragment.onRefresh();
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m20783Y3(AssetLeadTradingFragment assetLeadTradingFragment) {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "copyLeadSwitch", null, 8, null);
        Fragment parentFragment = assetLeadTradingFragment.getParentFragment();
        AssetCopyTradingMainFragment assetCopyTradingMainFragment = parentFragment instanceof AssetCopyTradingMainFragment ? (AssetCopyTradingMainFragment) parentFragment : null;
        if (assetCopyTradingMainFragment != null) {
            assetCopyTradingMainFragment.m20642m3(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m20784Z3() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "help", null, 8, null);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, CopyTradingConfig.f19710a.m20600q(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m20785a4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "totalPnl", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("myLeading");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m20786b4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "unrealizedPnl", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("myLeading");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final Unit m20787c4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "totalProfitShare", null, 8, null);
        CopyTradingConfig.f19710a.m20592G(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m20788d4(AssetLeadTradingFragment assetLeadTradingFragment) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.copytd_total_profit_tips_content).m54162S4(R$string.i_know, null);
        FragmentManager childFragmentManager = assetLeadTradingFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "tvProfitLabel");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m20789e4(AssetLeadTradingFragment assetLeadTradingFragment) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.copytd_un_profit_share_tips_content).m54162S4(R$string.i_know, null);
        FragmentManager childFragmentManager = assetLeadTradingFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "tvUnProfitShareLabel");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public static final Unit m20790f4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "unrealizedProfitShare", null, 8, null);
        CopyTradingConfig.f19710a.m20592G(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public static final Unit m20791g4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "leadTradeButton", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("myLeading");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m20792h4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", "guiding", "goLead", null, 8, null);
        CopyTradingConfig.f19710a.m20594J();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m20793i4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", TtmlNode.TAG_HEAD, "transferButton", null, 8, null);
        CopyTradingConfig.m20575D(CopyTradingConfig.f19710a, null, null, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m20795j4() {
        C43852m.m96591c("B20CopyTradeFuturesAssetsLead", "guiding", "transfer", null, 8, null);
        CopyTradingConfig.m20575D(CopyTradingConfig.f19710a, null, null, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m20797k4(AssetLeadTradingFragment assetLeadTradingFragment, Boolean bool) {
        StorageId<Boolean> storageIdMo15354t = IAssetsCenterService.f16464a.get().mo15354t();
        Intrinsics.checkNotNull(bool);
        C46392a.m102328k(storageIdMo15354t, bool.booleanValue());
        assetLeadTradingFragment.m20773L3().m20649C().setValue(bool);
    }

    /* JADX INFO: renamed from: l4 */
    public static final AssetLeadTradingAdapter m20799l4() {
        return new AssetLeadTradingAdapter();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: G3 */
    public final void m20820G3(LeaderTraderAccountInfoEntity leaderTraderAccountInfoEntity) {
        String str;
        StringBuilder sb2;
        int i11;
        String strM92640e;
        BigDecimal bigDecimalAbs;
        BigDecimal bigDecimalAbs2;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C43439h c43439hM20822O3 = m20822O3();
        if (c43439hM20822O3 != null) {
            String noNullCurrency = leaderTraderAccountInfoEntity.getNoNullCurrency();
            int iMo15349o = IAssetsCenterService.f16464a.get().mo15349o(noNullCurrency);
            C43439h c43439hM20822O4 = m20822O3();
            if (c43439hM20822O4 != null && (baseTextView2 = c43439hM20822O4.f95960p) != null) {
                baseTextView2.setText(getString(R$string.copytd_total_pnl, noNullCurrency));
            }
            C43439h c43439hM20822O5 = m20822O3();
            if (c43439hM20822O5 != null && (baseTextView = c43439hM20822O5.f95963s) != null) {
                baseTextView.setText(getString(R$string.copytd_total_unpnl, noNullCurrency));
            }
            C43439h c43439hM20822O6 = m20822O3();
            if (c43439hM20822O6 != null && (dashTextView2 = c43439hM20822O6.f95961q) != null) {
                dashTextView2.setText(getString(R$string.copytd_total_profit, noNullCurrency));
            }
            C43439h c43439hM20822O7 = m20822O3();
            if (c43439hM20822O7 != null && (dashTextView = c43439hM20822O7.f95966v) != null) {
                dashTextView.setText(getString(R$string.copytd_un_profit_share, noNullCurrency));
            }
            IAssetAccountView iAssetAccountViewM20774N3 = m20774N3();
            BigDecimal totalAssets = leaderTraderAccountInfoEntity.getTotalAssets();
            String strM66669i = C27041f.m66669i(totalAssets != null ? C42180b.m92640e(totalAssets, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--");
            BigDecimal totalAssets2 = leaderTraderAccountInfoEntity.getTotalAssets();
            iAssetAccountViewM20774N3.mo19953a(noNullCurrency, strM66669i, C27041f.m66669i(totalAssets2 != null ? C41014a.m89950x(C41014a.m89940n(totalAssets2, noNullCurrency), null, null, 0, false, true, false, true, 47, null) : null, "--"));
            final LeadTraderUsedTrialEntity leadTraderUsedTrial = leaderTraderAccountInfoEntity.getLeadTraderUsedTrial();
            boolean z11 = (leadTraderUsedTrial != null ? leadTraderUsedTrial.getStatusEnum() : null) == LeadTraderTrialFundStatus.ING;
            if (z11) {
                m20774N3().setCopyTradingWalletTagAmountText(C42828b.m93910k(String.valueOf(leadTraderUsedTrial.getAmount()), "USDT", null, 2, null));
                m20774N3().setCopyTradingWalletTagOnClick(new Function0() { // from class: com.kubi.copytrading.assets.lead.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetLeadTradingFragment.m20769H3(leadTraderUsedTrial);
                    }
                });
            } else {
                m20774N3().setCopyTradingWalletTagAmountText(null);
                m20774N3().setCopyTradingWalletTagOnClick(null);
            }
            m20774N3().setCopyTradingWalletTagVisible(z11);
            ShowHideTextView showHideTextView = c43439hM20822O3.f95959o;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            BigDecimal bigDecimalM89922G = C41014a.m89922G(leaderTraderAccountInfoEntity.getTotalPnl(), null, 1, null);
            int i12 = R$color.c_text;
            showHideTextView.setTextColor(C22890g.m54280e(contextRequireContext, bigDecimalM89922G, i12));
            ShowHideTextView showHideTextView2 = c43439hM20822O3.f95959o;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C27039d.m66644d(leaderTraderAccountInfoEntity.getTotalPnl()));
            BigDecimal totalPnl = leaderTraderAccountInfoEntity.getTotalPnl();
            if (totalPnl != null) {
                sb2 = sb3;
                i11 = i12;
                str = "requireContext(...)";
                strM92640e = C42180b.m92640e(totalPnl, null, iMo15349o, false, false, false, 2, null, 93, null);
            } else {
                str = "requireContext(...)";
                sb2 = sb3;
                i11 = i12;
                strM92640e = null;
            }
            sb2.append(C27041f.m66669i(strM92640e, "--"));
            showHideTextView2.setText(sb2.toString());
            ShowHideTextView showHideTextView3 = c43439hM20822O3.f95958n;
            BigDecimal totalPnl2 = leaderTraderAccountInfoEntity.getTotalPnl();
            showHideTextView3.setText(C27041f.m66669i((totalPnl2 == null || (bigDecimalAbs2 = totalPnl2.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs2, noNullCurrency), null, null, 0, false, true, false, true, 47, null), "--"));
            ShowHideTextView showHideTextView4 = c43439hM20822O3.f95965u;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, str);
            showHideTextView4.setTextColor(C22890g.m54280e(contextRequireContext2, C41014a.m89922G(leaderTraderAccountInfoEntity.getUnrealizedPnl(), null, 1, null), i11));
            ShowHideTextView showHideTextView5 = c43439hM20822O3.f95965u;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C27039d.m66644d(leaderTraderAccountInfoEntity.getUnrealizedPnl()));
            BigDecimal unrealizedPnl = leaderTraderAccountInfoEntity.getUnrealizedPnl();
            sb4.append(C27041f.m66669i(unrealizedPnl != null ? C42180b.m92640e(unrealizedPnl, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            showHideTextView5.setText(sb4.toString());
            ShowHideTextView showHideTextView6 = c43439hM20822O3.f95964t;
            BigDecimal unrealizedPnl2 = leaderTraderAccountInfoEntity.getUnrealizedPnl();
            showHideTextView6.setText(C27041f.m66669i((unrealizedPnl2 == null || (bigDecimalAbs = unrealizedPnl2.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, noNullCurrency), null, null, 0, false, true, false, true, 47, null), "--"));
            ShowHideTextView showHideTextView7 = c43439hM20822O3.f95962r;
            BigDecimal cumulativeProfitSharingAmount = leaderTraderAccountInfoEntity.getCumulativeProfitSharingAmount();
            showHideTextView7.setText(C27041f.m66669i(cumulativeProfitSharingAmount != null ? C42180b.m92640e(cumulativeProfitSharingAmount, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            ShowHideTextView showHideTextView8 = c43439hM20822O3.f95967w;
            BigDecimal unrealizedProfitSharingAmount = leaderTraderAccountInfoEntity.getUnrealizedProfitSharingAmount();
            showHideTextView8.setText(C27041f.m66669i(unrealizedProfitSharingAmount != null ? C42180b.m92640e(unrealizedProfitSharingAmount, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final C43438g m20821M3() {
        return (C43438g) this.f19873a0.getValue(this, f19866c0[2]);
    }

    /* JADX INFO: renamed from: O3 */
    public final C43439h m20822O3() {
        return (C43439h) this.f19871Y.getValue(this, f19866c0[1]);
    }

    /* JADX INFO: renamed from: P3 */
    public final AssetLeadTradingAdapter m20823P3() {
        return (AssetLeadTradingAdapter) this.f19869W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f19867U;
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
        m20778T3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f19867U = z11;
    }

    public AssetLeadTradingFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.copytrading.assets.lead.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetLeadTradingFragment.m20771J3(this.f19884b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewModels$default$1
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
        this.f19868V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CopyTradingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewModels$default$4
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
        this.f19869W = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.assets.lead.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetLeadTradingFragment.m20799l4();
            }
        });
        this.f19870X = C45681e.m100799e(this, new Function1<AssetLeadTradingFragment, C43434c>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43434c invoke(@NotNull AssetLeadTradingFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C43434c.m95629a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C43434c, Unit>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C43434c it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43434c c43434c) {
                invoke(c43434c);
                return Unit.INSTANCE;
            }
        });
        this.f19871Y = C45681e.m100799e(this, new Function1<AssetLeadTradingFragment, C43439h>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewBindingFragment$4
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43439h invoke(@NotNull AssetLeadTradingFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                View viewInflate = LayoutInflater.from(this.this$0.requireContext()).inflate(R$layout.view_lead_trading_header, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return C43439h.m95639a(viewInflate);
            }

            {
                super(1);
            }
        }, new Function1<C43439h, Unit>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewBindingFragment$3
            public final void invoke(@NotNull C43439h it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43439h c43439h) {
                invoke(c43439h);
                return Unit.INSTANCE;
            }
        });
        this.f19872Z = LazyKt.lazy(new Function0() { // from class: com.kubi.copytrading.assets.lead.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetLeadTradingFragment.m20775Q3(this.f19885b);
            }
        });
        this.f19873a0 = C45681e.m100799e(this, new Function1<AssetLeadTradingFragment, C43438g>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewBindingFragment$6
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43438g invoke(@NotNull AssetLeadTradingFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                View viewInflate = LayoutInflater.from(this.this$0.requireContext()).inflate(R$layout.view_lead_trading_footer, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return C43438g.m95637a(viewInflate);
            }

            {
                super(1);
            }
        }, new Function1<C43438g, Unit>() { // from class: com.kubi.copytrading.assets.lead.AssetLeadTradingFragment$special$$inlined$viewBindingFragment$5
            public final void invoke(@NotNull C43438g it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43438g c43438g) {
                invoke(c43438g);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    private final void m20770I3() {
        BaseTextView baseTextView;
        BigDecimal totalAssets;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView4;
        FrameLayout root;
        BaseTextView baseTextView5;
        FrameLayout root2;
        Pair<Boolean, List<LeadTradingPositionEntity>> value = m20773L3().m20647A().getValue();
        C43438g c43438gM20821M3 = m20821M3();
        if (c43438gM20821M3 != null && (root2 = c43438gM20821M3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        if (value == null) {
            C43439h c43439hM20822O3 = m20822O3();
            if (c43439hM20822O3 != null && (baseTextView5 = c43439hM20822O3.f95955k) != null) {
                ViewExtKt.m66577h(baseTextView5);
            }
            m20809q4();
            return;
        }
        if (value.getFirst().booleanValue()) {
            List<LeadTradingPositionEntity> second = value.getSecond();
            if (second != null && !second.isEmpty()) {
                C43438g c43438gM20821M4 = m20821M3();
                if (c43438gM20821M4 != null && (root = c43438gM20821M4.getRoot()) != null) {
                    ViewExtKt.m66577h(root);
                }
                C43439h c43439hM20822O4 = m20822O3();
                if (c43439hM20822O4 != null && (baseTextView4 = c43439hM20822O4.f95955k) != null) {
                    ViewExtKt.m66594y(baseTextView4);
                    return;
                }
                return;
            }
            C43438g c43438gM20821M5 = m20821M3();
            if (c43438gM20821M5 != null && (appCompatImageView = c43438gM20821M5.f95944g) != null) {
                ViewExtKt.m66577h(appCompatImageView);
            }
            LeaderTraderAccountInfoEntity value2 = m20773L3().m20658y().getValue();
            if (value2 != null) {
                totalAssets = value2.getTotalAssets();
            } else {
                totalAssets = null;
            }
            if (totalAssets != null && C41014a.m89919D(totalAssets)) {
                C43439h c43439hM20822O5 = m20822O3();
                if (c43439hM20822O5 != null && (baseTextView3 = c43439hM20822O5.f95955k) != null) {
                    ViewExtKt.m66577h(baseTextView3);
                }
                m20805o4();
                return;
            }
            C43439h c43439hM20822O6 = m20822O3();
            if (c43439hM20822O6 != null && (baseTextView2 = c43439hM20822O6.f95955k) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
            m20803n4();
            return;
        }
        C43439h c43439hM20822O7 = m20822O3();
        if (c43439hM20822O7 != null && (baseTextView = c43439hM20822O7.f95955k) != null) {
            ViewExtKt.m66594y(baseTextView);
        }
        m20807p4();
    }

    /* JADX INFO: renamed from: J3 */
    public static final ViewModelStoreOwner m20771J3(AssetLeadTradingFragment assetLeadTradingFragment) {
        Fragment parentFragment = assetLeadTradingFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return assetLeadTradingFragment;
    }

    /* JADX INFO: renamed from: R3 */
    private final void m20776R3() {
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
        m20809q4();
        C43438g c43438gM20821M3 = m20821M3();
        if (c43438gM20821M3 != null && (c40820a5 = c43438gM20821M3.f95943f) != null && (imageView3 = c40820a5.f90679b) != null) {
            imageView3.setImageResource(R$drawable.ic2_common_system_maintain);
        }
        C43438g c43438gM20821M4 = m20821M3();
        if (c43438gM20821M4 != null && (c40820a4 = c43438gM20821M4.f95943f) != null && (textView2 = c40820a4.f90680c) != null) {
            textView2.setText(getString(R$string.load_failed_click_retry));
        }
        C43438g c43438gM20821M5 = m20821M3();
        LinearLayout.LayoutParams layoutParams2 = null;
        if (c43438gM20821M5 != null && (c40820a3 = c43438gM20821M5.f95943f) != null && (imageView2 = c40820a3.f90679b) != null) {
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
        C43438g c43438gM20821M6 = m20821M3();
        if (c43438gM20821M6 != null && (c40820a2 = c43438gM20821M6.f95943f) != null && (imageView = c40820a2.f90679b) != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        C43438g c43438gM20821M7 = m20821M3();
        if (c43438gM20821M7 != null && (c40820a = c43438gM20821M7.f95943f) != null && (textView = c40820a.f90680c) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20777S3(this.f19882b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m20777S3(AssetLeadTradingFragment assetLeadTradingFragment) {
        assetLeadTradingFragment.m20773L3().m20653t();
        assetLeadTradingFragment.m20809q4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    private final void m20778T3() {
        m20773L3().m20658y().observe(getViewLifecycleOwner(), new C11484a(new Function1() { // from class: com.kubi.copytrading.assets.lead.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetLeadTradingFragment.m20781W3(this.f19875b, (LeaderTraderAccountInfoEntity) obj);
            }
        }));
        m20773L3().m20647A().observe(getViewLifecycleOwner(), new C11484a(new Function1() { // from class: com.kubi.copytrading.assets.lead.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetLeadTradingFragment.m20779U3(this.f19880b, (Pair) obj);
            }
        }));
        m20773L3().m20649C().observe(getViewLifecycleOwner(), new C11484a(new Function1() { // from class: com.kubi.copytrading.assets.lead.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetLeadTradingFragment.m20780V3(this.f19883b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m20780V3(AssetLeadTradingFragment assetLeadTradingFragment, Boolean bool) {
        ConstraintLayout root;
        C43439h c43439hM20822O3 = assetLeadTradingFragment.m20822O3();
        if (c43439hM20822O3 != null) {
            root = c43439hM20822O3.getRoot();
        } else {
            root = null;
        }
        Intrinsics.checkNotNull(bool);
        ShowHideTextView.m54778d(root, bool.booleanValue());
        IAssetAccountView.m20180c(assetLeadTradingFragment.m20774N3(), null, bool, 1, null);
        assetLeadTradingFragment.m20823P3().m20762j(bool.booleanValue());
        assetLeadTradingFragment.m20823P3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    private final void initView() {
        KcSecondaryButton kcSecondaryButton;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        KcPrimaryButton kcPrimaryButton;
        ConstraintLayout constraintLayout;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        ConstraintLayout constraintLayout2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ImageView imageView;
        BaseTextView baseTextView;
        FrameLayout frameLayout;
        RecyclerView recyclerView;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        m20811r4();
        C43434c c43434cM20772K3 = m20772K3();
        if (c43434cM20772K3 != null && (kuCoinRefreshLayout = c43434cM20772K3.f95898c) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.copytrading.assets.lead.v
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetLeadTradingFragment.m20782X3(this.f19887b, interfaceC38162f);
                }
            });
        }
        C43434c c43434cM20772K4 = m20772K3();
        if (c43434cM20772K4 != null && (recyclerView = c43434cM20772K4.f95897b) != null) {
            recyclerView.setAdapter(m20823P3());
        }
        AssetLeadTradingAdapter assetLeadTradingAdapterM20823P3 = m20823P3();
        C43439h c43439hM20822O3 = m20822O3();
        Intrinsics.checkNotNull(c43439hM20822O3);
        assetLeadTradingAdapterM20823P3.addHeaderView(c43439hM20822O3.getRoot());
        AssetLeadTradingAdapter assetLeadTradingAdapterM20823P4 = m20823P3();
        C43438g c43438gM20821M3 = m20821M3();
        Intrinsics.checkNotNull(c43438gM20821M3);
        assetLeadTradingAdapterM20823P4.addFooterView(c43438gM20821M3.getRoot());
        C43439h c43439hM20822O4 = m20822O3();
        if (c43439hM20822O4 != null && (frameLayout = c43439hM20822O4.f95946b) != null) {
            frameLayout.addView(m20774N3().getView(), -1, -2);
        }
        C43439h c43439hM20822O5 = m20822O3();
        if (c43439hM20822O5 != null && (baseTextView = c43439hM20822O5.f95956l) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20783Y3(this.f19877b);
                }
            }, 1, null);
        }
        C43439h c43439hM20822O6 = m20822O3();
        if (c43439hM20822O6 != null && (imageView = c43439hM20822O6.f95949e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20784Z3();
                }
            }, 1, null);
        }
        C43439h c43439hM20822O7 = m20822O3();
        if (c43439hM20822O7 != null && (linearLayout2 = c43439hM20822O7.f95950f) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20785a4();
                }
            }, 1, null);
        }
        C43439h c43439hM20822O8 = m20822O3();
        if (c43439hM20822O8 != null && (linearLayout = c43439hM20822O8.f95953i) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20786b4();
                }
            }, 1, null);
        }
        C43439h c43439hM20822O9 = m20822O3();
        if (c43439hM20822O9 != null && (constraintLayout2 = c43439hM20822O9.f95951g) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20787c4();
                }
            }, 1, null);
        }
        C43439h c43439hM20822O10 = m20822O3();
        if (c43439hM20822O10 != null && (dashTextView2 = c43439hM20822O10.f95961q) != null) {
            C27046k.m66711z(dashTextView2, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20788d4(this.f19878b);
                }
            }, 1, null);
        }
        C43439h c43439hM20822O11 = m20822O3();
        if (c43439hM20822O11 != null && (dashTextView = c43439hM20822O11.f95966v) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20789e4(this.f19879b);
                }
            }, 1, null);
        }
        C43439h c43439hM20822O12 = m20822O3();
        if (c43439hM20822O12 != null && (constraintLayout = c43439hM20822O12.f95954j) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20790f4();
                }
            }, 1, null);
        }
        C43439h c43439hM20822O13 = m20822O3();
        if (c43439hM20822O13 != null && (kcPrimaryButton = c43439hM20822O13.f95947c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20791g4();
                }
            }, 1, null);
        }
        C43438g c43438gM20821M4 = m20821M3();
        if (c43438gM20821M4 != null && (kcSecondaryButton3 = c43438gM20821M4.f95939b) != null) {
            C27046k.m66711z(kcSecondaryButton3, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20792h4();
                }
            }, 1, null);
        }
        C43439h c43439hM20822O14 = m20822O3();
        if (c43439hM20822O14 != null && (kcSecondaryButton2 = c43439hM20822O14.f95948d) != null) {
            C27046k.m66711z(kcSecondaryButton2, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20793i4();
                }
            }, 1, null);
        }
        C43438g c43438gM20821M5 = m20821M3();
        if (c43438gM20821M5 != null && (kcSecondaryButton = c43438gM20821M5.f95940c) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetLeadTradingFragment.m20795j4();
                }
            }, 1, null);
        }
        m20776R3();
        m20774N3().mo19955d(this, "B20CopyTradeFuturesAssetsLead");
        IAssetAccountView.m20180c(m20774N3(), new Consumer() { // from class: com.kubi.copytrading.assets.lead.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetLeadTradingFragment.m20797k4(this.f19876b, (Boolean) obj);
            }
        }, null, 2, null);
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m20801m4(AssetLeadTradingFragment assetLeadTradingFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C43434c c43434cM20772K3 = assetLeadTradingFragment.m20772K3();
        if (c43434cM20772K3 != null && (kuCoinRefreshLayout = c43434cM20772K3.f95898c) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    private final void m20803n4() {
        LinearLayoutCompat linearLayoutCompat;
        ShapeLinearLayout shapeLinearLayout;
        AppCompatImageView appCompatImageView;
        C40820a c40820a;
        LinearLayout root;
        FrameLayout root2;
        C43438g c43438gM20821M3 = m20821M3();
        if (c43438gM20821M3 != null && (root2 = c43438gM20821M3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43438g c43438gM20821M4 = m20821M3();
        if (c43438gM20821M4 != null && (c40820a = c43438gM20821M4.f95943f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C43438g c43438gM20821M5 = m20821M3();
        if (c43438gM20821M5 != null && (appCompatImageView = c43438gM20821M5.f95944g) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43438g c43438gM20821M6 = m20821M3();
        if (c43438gM20821M6 != null && (shapeLinearLayout = c43438gM20821M6.f95942e) != null) {
            ViewExtKt.m66577h(shapeLinearLayout);
        }
        C43438g c43438gM20821M7 = m20821M3();
        if (c43438gM20821M7 != null && (linearLayoutCompat = c43438gM20821M7.f95941d) != null) {
            ViewExtKt.m66594y(linearLayoutCompat);
        }
    }

    /* JADX INFO: renamed from: o4 */
    private final void m20805o4() {
        ShapeLinearLayout shapeLinearLayout;
        LinearLayoutCompat linearLayoutCompat;
        AppCompatImageView appCompatImageView;
        C40820a c40820a;
        LinearLayout root;
        FrameLayout root2;
        C43438g c43438gM20821M3 = m20821M3();
        if (c43438gM20821M3 != null && (root2 = c43438gM20821M3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43438g c43438gM20821M4 = m20821M3();
        if (c43438gM20821M4 != null && (c40820a = c43438gM20821M4.f95943f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C43438g c43438gM20821M5 = m20821M3();
        if (c43438gM20821M5 != null && (appCompatImageView = c43438gM20821M5.f95944g) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43438g c43438gM20821M6 = m20821M3();
        if (c43438gM20821M6 != null && (linearLayoutCompat = c43438gM20821M6.f95941d) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C43438g c43438gM20821M7 = m20821M3();
        if (c43438gM20821M7 != null && (shapeLinearLayout = c43438gM20821M7.f95942e) != null) {
            ViewExtKt.m66594y(shapeLinearLayout);
        }
    }

    /* JADX INFO: renamed from: p4 */
    private final void m20807p4() {
        C40820a c40820a;
        LinearLayout root;
        AppCompatImageView appCompatImageView;
        ShapeLinearLayout shapeLinearLayout;
        LinearLayoutCompat linearLayoutCompat;
        FrameLayout root2;
        C43438g c43438gM20821M3 = m20821M3();
        if (c43438gM20821M3 != null && (root2 = c43438gM20821M3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43438g c43438gM20821M4 = m20821M3();
        if (c43438gM20821M4 != null && (linearLayoutCompat = c43438gM20821M4.f95941d) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C43438g c43438gM20821M5 = m20821M3();
        if (c43438gM20821M5 != null && (shapeLinearLayout = c43438gM20821M5.f95942e) != null) {
            ViewExtKt.m66577h(shapeLinearLayout);
        }
        C43438g c43438gM20821M6 = m20821M3();
        if (c43438gM20821M6 != null && (appCompatImageView = c43438gM20821M6.f95944g) != null) {
            ViewExtKt.m66577h(appCompatImageView);
        }
        C43438g c43438gM20821M7 = m20821M3();
        if (c43438gM20821M7 != null && (c40820a = c43438gM20821M7.f95943f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
    }

    /* JADX INFO: renamed from: q4 */
    private final void m20809q4() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C40820a c40820a;
        LinearLayout root;
        ShapeLinearLayout shapeLinearLayout;
        LinearLayoutCompat linearLayoutCompat;
        FrameLayout root2;
        C43438g c43438gM20821M3 = m20821M3();
        if (c43438gM20821M3 != null && (root2 = c43438gM20821M3.getRoot()) != null) {
            ViewExtKt.m66594y(root2);
        }
        C43438g c43438gM20821M4 = m20821M3();
        if (c43438gM20821M4 != null && (linearLayoutCompat = c43438gM20821M4.f95941d) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C43438g c43438gM20821M5 = m20821M3();
        if (c43438gM20821M5 != null && (shapeLinearLayout = c43438gM20821M5.f95942e) != null) {
            ViewExtKt.m66577h(shapeLinearLayout);
        }
        C43438g c43438gM20821M6 = m20821M3();
        if (c43438gM20821M6 != null && (c40820a = c43438gM20821M6.f95943f) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C43438g c43438gM20821M7 = m20821M3();
        if (c43438gM20821M7 != null && (appCompatImageView2 = c43438gM20821M7.f95944g) != null) {
            ViewExtKt.m66594y(appCompatImageView2);
        }
        C43438g c43438gM20821M8 = m20821M3();
        if (c43438gM20821M8 != null && (appCompatImageView = c43438gM20821M8.f95944g) != null) {
            C11352b.m20197a(appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: r4 */
    private final void m20811r4() {
        DashTextView dashTextView;
        DashTextView dashTextView2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C43439h c43439hM20822O3 = m20822O3();
        if (c43439hM20822O3 != null && (baseTextView2 = c43439hM20822O3.f95960p) != null) {
            baseTextView2.setText(getString(R$string.copytd_total_pnl, "--"));
        }
        C43439h c43439hM20822O4 = m20822O3();
        if (c43439hM20822O4 != null && (baseTextView = c43439hM20822O4.f95963s) != null) {
            baseTextView.setText(getString(R$string.copytd_total_unpnl, "--"));
        }
        C43439h c43439hM20822O5 = m20822O3();
        if (c43439hM20822O5 != null && (dashTextView2 = c43439hM20822O5.f95961q) != null) {
            dashTextView2.setText(getString(R$string.copytd_total_profit, "--"));
        }
        C43439h c43439hM20822O6 = m20822O3();
        if (c43439hM20822O6 != null && (dashTextView = c43439hM20822O6.f95966v) != null) {
            dashTextView.setText(getString(R$string.copytd_un_profit_share, "--"));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m20773L3().m20652s();
        m20773L3().m20653t();
        BaseFragment.runOnUiThread$default(this, new Function0() { // from class: com.kubi.copytrading.assets.lead.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetLeadTradingFragment.m20801m4(this.f19886b);
            }
        }, 1000L, null, 4, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        onRefresh();
    }
}
