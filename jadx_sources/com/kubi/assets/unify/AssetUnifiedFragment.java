package com.kubi.assets.unify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.cpiz.android.bubbleview.C5392c;
import com.cpiz.android.bubbleview.C5393d;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.assets.entity.UnifiedAccountOverview;
import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.assets.entity.UnifiedOverviewEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.unify.dialog.UnifiedTradeHistoryDialog;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p402kf.C41016c;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44747d2;
import p637ta.C44847q3;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
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
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AssetUnifiedFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 S2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001SB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010,\u001a\u00020-H\u0014J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020/H\u0016J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0015J\u0012\u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u00109\u001a\u00020/H\u0015J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0014J\b\u0010=\u001a\u00020/H\u0016J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u0012\u0010@\u001a\u00020/2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\b\u0010C\u001a\u00020/H\u0002J\b\u0010D\u001a\u00020/H\u0002J\b\u0010E\u001a\u00020/H\u0002J\b\u0010F\u001a\u00020/H\u0002J\u0010\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u000201H\u0002J\b\u0010I\u001a\u00020'H\u0002J\b\u0010J\u001a\u00020'H\u0002J\u0010\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020'H\u0002J\b\u0010M\u001a\u00020/H\u0002J\b\u0010N\u001a\u00020/H\u0002J\b\u0010O\u001a\u00020/H\u0002J\b\u0010P\u001a\u00020/H\u0002J\b\u0010Q\u001a\u00020/H\u0003J\b\u0010R\u001a\u00020/H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020!0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006T"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UiIntent;", "Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;", "Lcom/kubi/assets/unify/AssetUnifiedViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "binding", "Lcom/kubi/assets/databinding/FragmentAssetUnifiedBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetUnifiedBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "adapter", "Lcom/kubi/assets/unify/AssetUnifiedAdapter;", "getAdapter", "()Lcom/kubi/assets/unify/AssetUnifiedAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "rateMap", "", "", "productsMap", "Lcom/kubi/assets/entity/EarnAccountItem;", "marginGuideWindow", "Lcom/cpiz/android/bubbleview/BubblePopupWindow;", "marginGuideAutoDismissJob", "Lkotlinx/coroutines/Job;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initView", "onAssetsGet", "myAssetEntity", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onRefresh", "reloadData", "sendFetchUnifiedPnlOverviewIntent", "updateOverviewDataInfo", "overviewData", "Lcom/kubi/assets/entity/UnifiedAccountOverview;", "initHeaderView", "initFilterAssetListUI", "initMarginEntrance", "showMarginGuideIfNeeded", "showMarginGuidePopup", "anchor", "updateMarginFeatureAvailability", "isMarginFeatureAvailable", "dismissMarginGuide", "markShown", "scheduleMarginGuideAutoDismiss", "clearMarginGuideWindow", "cancelMarginGuideAutoDismiss", "openUnifyMarginDialog", "initAssetListUI", "reportPageExposure", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetUnifiedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetUnifiedFragment.kt\ncom/kubi/assets/unify/AssetUnifiedFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,478:1\n147#2,16:479\n158#3,2:495\n158#3,2:520\n49#4:497\n65#4,16:498\n93#4,3:514\n136#5:517\n126#5,2:518\n*S KotlinDebug\n*F\n+ 1 AssetUnifiedFragment.kt\ncom/kubi/assets/unify/AssetUnifiedFragment\n*L\n77#1:479,16\n103#1:495,2\n462#1:520,2\n316#1:497\n316#1:498,16\n316#1:514,3\n337#1:517\n406#1:518,2\n*E\n"})
public final class AssetUnifiedFragment extends BaseStateFragment<AssetUnifiedContract$UiIntent, UIState, AssetUnifiedViewModel> implements SwipeRefreshLayout.OnRefreshListener, AssetV2Fragment.InterfaceC9449a {

    /* JADX INFO: renamed from: V */
    @Nullable
    public WrapperLoadingView f18921V;

    /* JADX INFO: renamed from: X */
    @Nullable
    public AssetV2OverviewEntity f18923X;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public C5392c f18926a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public InterfaceC41775x1 f18927b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f18928c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f18919e0 = {Reflection.property1(new PropertyReference1Impl(AssetUnifiedFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetUnifiedBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f18918d0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18920U = C45681e.m100799e(this, new Function1<AssetUnifiedFragment, C44847q3>() { // from class: com.kubi.assets.unify.AssetUnifiedFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44847q3 invoke(@NotNull AssetUnifiedFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44847q3.m99219a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44847q3, Unit>() { // from class: com.kubi.assets.unify.AssetUnifiedFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44847q3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44847q3 c44847q3) {
            invoke(c44847q3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18922W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetUnifiedFragment.m19625P3(this.f19032b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Map<String, String> f18924Y = new HashMap();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public Map<String, EarnAccountItem> f18925Z = new HashMap();

    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "MARGIN_GUIDE_POPUP_PADDING_DP", "", "MARGIN_GUIDE_ARROW_GAP_DP", "MARGIN_GUIDE_ARROW_MIN_DELTA_DP", "newInstance", "Lcom/kubi/assets/unify/AssetUnifiedFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetUnifiedFragment newInstance() {
            return new AssetUnifiedFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AssetUnifiedFragment.kt\ncom/kubi/assets/unify/AssetUnifiedFragment\n*L\n1#1,97:1\n78#2:98\n71#3:99\n317#4,4:100\n*E\n"})
    public static final class C11111a implements TextWatcher {
        public C11111a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            AppCompatCheckBox appCompatCheckBox;
            AssetUnifiedFragment assetUnifiedFragment = AssetUnifiedFragment.this;
            C44847q3 c44847q3M19662U3 = assetUnifiedFragment.m19662U3();
            assetUnifiedFragment.sendIntent(new AssetUnifiedContract$UiIntent.HideSmallOrFilter(C27025c.m66566d((c44847q3M19662U3 == null || (appCompatCheckBox = c44847q3M19662U3.f100682c) == null) ? null : Boolean.valueOf(appCompatCheckBox.isChecked())), StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$b */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11112b implements Function0<Unit> {
        public C11112b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m19676a() {
            AssetUnifiedFragment.this.sendIntent(AssetUnifiedContract$UiIntent.FetchProducts.INSTANCE);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m19676a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$10", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1111410 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C1111410(Continuation<? super C1111410> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1111410 c1111410 = AssetUnifiedFragment.this.new C1111410(continuation);
            c1111410.Z$0 = ((Boolean) obj).booleanValue();
            return c1111410;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C1111410) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppCompatCheckBox appCompatCheckBox;
            AppCompatCheckBox appCompatCheckBox2;
            AppCompatCheckBox appCompatCheckBox3;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44847q3 c44847q3M19662U3 = AssetUnifiedFragment.this.m19662U3();
            if (((c44847q3M19662U3 == null || (appCompatCheckBox3 = c44847q3M19662U3.f100684e) == null) ? null : appCompatCheckBox3.getTag()) == null) {
                C44847q3 c44847q3M19662U4 = AssetUnifiedFragment.this.m19662U3();
                if (c44847q3M19662U4 != null && (appCompatCheckBox2 = c44847q3M19662U4.f100684e) != null) {
                    appCompatCheckBox2.setTag(Boxing.boxBoolean(true));
                }
                C44847q3 c44847q3M19662U5 = AssetUnifiedFragment.this.m19662U3();
                if (c44847q3M19662U5 != null && (appCompatCheckBox = c44847q3M19662U5.f100684e) != null) {
                    appCompatCheckBox.setChecked(z11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$12 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$12", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1111612 extends SuspendLambda implements Function2<List<? extends UnifiedAssetsEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UnifiedAssetsEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<UnifiedAssetsEntity>) list, continuation);
        }

        public C1111612(Continuation<? super C1111612> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1111612 c1111612 = AssetUnifiedFragment.this.new C1111612(continuation);
            c1111612.L$0 = obj;
            return c1111612;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UnifiedAssetsEntity> list, Continuation<? super Unit> continuation) {
            return ((C1111612) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                AssetUnifiedFragment.this.m19661T3().replaceData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$14 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "products", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EarnAccountItem;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$14", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetUnifiedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetUnifiedFragment.kt\ncom/kubi/assets/unify/AssetUnifiedFragment$bindState$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,478:1\n1869#2,2:479\n*S KotlinDebug\n*F\n+ 1 AssetUnifiedFragment.kt\ncom/kubi/assets/unify/AssetUnifiedFragment$bindState$14\n*L\n191#1:479,2\n*E\n"})
    public static final class C1111814 extends SuspendLambda implements Function2<ArrayList<EarnAccountItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1111814(Continuation<? super C1111814> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1111814 c1111814 = AssetUnifiedFragment.this.new C1111814(continuation);
            c1111814.L$0 = obj;
            return c1111814;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EarnAccountItem> arrayList, Continuation<? super Unit> continuation) {
            return ((C1111814) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimalM66536f;
            ArrayList<EarnAccountItem> arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                AssetUnifiedFragment assetUnifiedFragment = AssetUnifiedFragment.this;
                for (EarnAccountItem earnAccountItem : arrayList) {
                    String str = (String) assetUnifiedFragment.f18924Y.get(earnAccountItem.getCurrency());
                    String strM89946t = null;
                    double dM66646f = C27039d.m66646f(str != null ? DowngradeExKt.m66539i(str) : null);
                    String totalReturn = earnAccountItem.getTotalReturn();
                    if (dM66646f < C27039d.m66646f(totalReturn != null ? DowngradeExKt.m66539i(totalReturn) : null)) {
                        Map map = assetUnifiedFragment.f18924Y;
                        String currency = earnAccountItem.getCurrency();
                        String totalReturn2 = earnAccountItem.getTotalReturn();
                        if (totalReturn2 != null && (bigDecimalM66536f = DowngradeExKt.m66536f(totalReturn2)) != null) {
                            strM89946t = C41014a.m89946t(bigDecimalM66536f, null, 0, false, false, false, false, false, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
                        }
                        map.put(currency, C27041f.m66668h(strM89946t));
                    }
                    assetUnifiedFragment.f18925Z.put(earnAccountItem.getCurrency(), earnAccountItem);
                }
                assetUnifiedFragment.m19661T3().m19607H(assetUnifiedFragment.f18924Y);
                assetUnifiedFragment.m19661T3().m19606G(assetUnifiedFragment.f18925Z);
                assetUnifiedFragment.m19661T3().notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$16 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$16", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1112016 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super Unit> continuation) {
            return invoke2((Set<String>) set, continuation);
        }

        public C1112016(Continuation<? super C1112016> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1112016 c1112016 = AssetUnifiedFragment.this.new C1112016(continuation);
            c1112016.L$0 = obj;
            return c1112016;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<String> set, Continuation<? super Unit> continuation) {
            return ((C1112016) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set<String> set = (Set) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetUnifiedFragment.this.m19661T3().m19604E(set);
            AssetUnifiedFragment.this.m19661T3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$18 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$18", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1112218 extends SuspendLambda implements Function2<ArrayList<UnifiedAssetsEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1112218(Continuation<? super C1112218> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m19678f(AssetUnifiedFragment assetUnifiedFragment) {
            assetUnifiedFragment.sendIntent(AssetUnifiedContract$UiIntent.FetchProducts.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1112218 c1112218 = AssetUnifiedFragment.this.new C1112218(continuation);
            c1112218.L$0 = obj;
            return c1112218;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<UnifiedAssetsEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C1112218) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetSearchView assetSearchView;
            ClearEditText etSearchView;
            AppCompatCheckBox appCompatCheckBox;
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                final AssetUnifiedFragment assetUnifiedFragment = AssetUnifiedFragment.this;
                C24129b.m58033e(SiteVisibleConfigKey.Financing, new Function0() { // from class: com.kubi.assets.unify.c0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetUnifiedFragment.C1112218.m19678f(assetUnifiedFragment);
                    }
                });
                C44847q3 c44847q3M19662U3 = assetUnifiedFragment.m19662U3();
                Editable text = null;
                boolean zM66566d = C27025c.m66566d((c44847q3M19662U3 == null || (appCompatCheckBox = c44847q3M19662U3.f100682c) == null) ? null : Boxing.boxBoolean(appCompatCheckBox.isChecked()));
                C44847q3 c44847q3M19662U4 = assetUnifiedFragment.m19662U3();
                if (c44847q3M19662U4 != null && (assetSearchView = c44847q3M19662U4.f100689j) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                    text = etSearchView.getText();
                }
                assetUnifiedFragment.sendIntent(new AssetUnifiedContract$UiIntent.HideSmallOrFilter(zM66566d, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/UnifiedAccountOverview;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$2", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111232 extends SuspendLambda implements Function2<UnifiedAccountOverview, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifiedAccountOverview unifiedAccountOverview, Continuation<? super Unit> continuation) {
            return ((C111232) create(unifiedAccountOverview, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C111232(Continuation<? super C111232> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111232 c111232 = AssetUnifiedFragment.this.new C111232(continuation);
            c111232.L$0 = obj;
            return c111232;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifyAssetHeaderView unifyAssetHeaderView;
            UnifyAssetHeaderView unifyAssetHeaderView2;
            UnifiedAccountOverview unifiedAccountOverview = (UnifiedAccountOverview) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String currency = unifiedAccountOverview != null ? unifiedAccountOverview.getCurrency() : null;
            AssetV2OverviewEntity assetV2OverviewEntity = AssetUnifiedFragment.this.f18923X;
            if (Intrinsics.areEqual(currency, assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null)) {
                AssetUnifiedFragment.this.m19675z4(unifiedAccountOverview);
                C44847q3 c44847q3M19662U3 = AssetUnifiedFragment.this.m19662U3();
                if (c44847q3M19662U3 != null && (unifyAssetHeaderView2 = c44847q3M19662U3.f100687h) != null) {
                    unifyAssetHeaderView2.m19752m(unifiedAccountOverview);
                }
                C44847q3 c44847q3M19662U4 = AssetUnifiedFragment.this.m19662U3();
                if (c44847q3M19662U4 != null && (unifyAssetHeaderView = c44847q3M19662U4.f100687h) != null) {
                    unifyAssetHeaderView.m19753n(unifiedAccountOverview);
                }
            }
            WrapperLoadingView wrapperLoadingView = AssetUnifiedFragment.this.f18921V;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/UnifiedOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$4", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111254 extends SuspendLambda implements Function2<UnifiedOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifiedOverviewEntity unifiedOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C111254) create(unifiedOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C111254(Continuation<? super C111254> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111254 c111254 = AssetUnifiedFragment.this.new C111254(continuation);
            c111254.L$0 = obj;
            return c111254;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifyAssetHeaderView unifyAssetHeaderView;
            UnifiedOverviewEntity unifiedOverviewEntity = (UnifiedOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44847q3 c44847q3M19662U3 = AssetUnifiedFragment.this.m19662U3();
            if (c44847q3M19662U3 != null && (unifyAssetHeaderView = c44847q3M19662U3.f100687h) != null) {
                unifyAssetHeaderView.m19754o(unifiedOverviewEntity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$6", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111276 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C111276(Continuation<? super C111276> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111276 c111276 = AssetUnifiedFragment.this.new C111276(continuation);
            c111276.Z$0 = ((Boolean) obj).booleanValue();
            return c111276;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C111276) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifyAssetHeaderView unifyAssetHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44847q3 c44847q3M19662U3 = AssetUnifiedFragment.this.m19662U3();
            ShowHideTextView.m54778d(c44847q3M19662U3 != null ? c44847q3M19662U3.f100687h : null, z11);
            C44847q3 c44847q3M19662U4 = AssetUnifiedFragment.this.m19662U3();
            if (c44847q3M19662U4 != null && (unifyAssetHeaderView = c44847q3M19662U4.f100687h) != null && (accountInfoHeader = unifyAssetHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AssetUnifiedFragment.this.m19661T3().m19602C(z11);
            AssetUnifiedFragment.this.m19661T3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetUnifiedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedFragment$bindState$8", m90122f = "AssetUnifiedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111298 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C111298(Continuation<? super C111298> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111298 c111298 = AssetUnifiedFragment.this.new C111298(continuation);
            c111298.Z$0 = ((Boolean) obj).booleanValue();
            return c111298;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C111298) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppCompatCheckBox appCompatCheckBox;
            AppCompatCheckBox appCompatCheckBox2;
            AppCompatCheckBox appCompatCheckBox3;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44847q3 c44847q3M19662U3 = AssetUnifiedFragment.this.m19662U3();
            if (((c44847q3M19662U3 == null || (appCompatCheckBox3 = c44847q3M19662U3.f100682c) == null) ? null : appCompatCheckBox3.getTag()) == null) {
                C44847q3 c44847q3M19662U4 = AssetUnifiedFragment.this.m19662U3();
                if (c44847q3M19662U4 != null && (appCompatCheckBox2 = c44847q3M19662U4.f100682c) != null) {
                    appCompatCheckBox2.setTag(Boxing.boxBoolean(true));
                }
                C44847q3 c44847q3M19662U5 = AssetUnifiedFragment.this.m19662U3();
                if (c44847q3M19662U5 != null && (appCompatCheckBox = c44847q3M19662U5.f100682c) != null) {
                    appCompatCheckBox.setChecked(z11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m19660S3(false);
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: w4 */
    public final void m19673w4(View view) {
        m19660S3(false);
        C44747d2 c44747d2M99007c = C44747d2.m99007c(LayoutInflater.from(view.getContext()));
        c44747d2M99007c.getRoot().setVisibility(0);
        Intrinsics.checkNotNullExpressionValue(c44747d2M99007c, "apply(...)");
        final C5392c c5392c = new C5392c(c44747d2M99007c.getRoot(), c44747d2M99007c.getRoot());
        this.f18926a0 = c5392c;
        c5392c.m7078l(C5275i0.m6236a(0.0f));
        c5392c.m7074h(RangesKt.coerceAtLeast(view.getWidth() / 2, C5275i0.m6236a(12.0f)));
        c5392c.m7076j(false);
        c5392c.m7077k(false);
        c5392c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.kubi.assets.unify.r
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                AssetUnifiedFragment.m19655x4(this.f19045b, c5392c);
            }
        });
        c5392c.m7081o(view, new C5393d(UnifyCustomMarginEntrance.f19056a.m19891b(C5303w0.m6511a()), 1), 0, C5275i0.m6236a(2.0f));
        m19670s4();
    }

    /* JADX INFO: renamed from: P3 */
    public static final AssetUnifiedAdapter m19625P3(AssetUnifiedFragment assetUnifiedFragment) {
        return new AssetUnifiedAdapter(assetUnifiedFragment);
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m19626W3(AssetUnifiedFragment assetUnifiedFragment) {
        assetUnifiedFragment.sendIntent(AssetUnifiedContract$UiIntent.FetchAssetsList.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m19631c4(AssetUnifiedFragment assetUnifiedFragment, CompoundButton compoundButton, boolean z11) {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        C44847q3 c44847q3M19662U3 = assetUnifiedFragment.m19662U3();
        assetUnifiedFragment.sendIntent(new AssetUnifiedContract$UiIntent.HideSmallOrFilter(z11, StringsKt.trim((CharSequence) String.valueOf((c44847q3M19662U3 == null || (assetSearchView = c44847q3M19662U3.f100689j) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) ? null : etSearchView.getText())).toString(), true));
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m19633e4(AssetUnifiedFragment assetUnifiedFragment, CompoundButton compoundButton, boolean z11) {
        assetUnifiedFragment.sendIntent(new AssetUnifiedContract$UiIntent.ShowInDebt(z11, true));
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m19634f4() {
        C43852m.m96591c("B5UnifyTrading", "searchCoin", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m19635g4(AssetUnifiedFragment assetUnifiedFragment) {
        AssetsHelper.m19148y(AssetsHelper.f18684a, assetUnifiedFragment, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final void m19636i4(AssetUnifiedFragment assetUnifiedFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetUnifiedFragment.sendIntent(new AssetUnifiedContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m19637j4(AssetUnifiedFragment assetUnifiedFragment) {
        DialogFragmentHelper dialogFragmentHelperNewInstance = UnifiedTradeHistoryDialog.f19012r0.newInstance();
        FragmentManager childFragmentManager = assetUnifiedFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance.show(childFragmentManager, "AssetUnifiedFragment");
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m19640m4(AssetUnifiedFragment assetUnifiedFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetUnifiedFragment.m19646q4();
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m19655x4(AssetUnifiedFragment assetUnifiedFragment, C5392c c5392c) {
        if (assetUnifiedFragment.f18926a0 == c5392c) {
            assetUnifiedFragment.m19659R3();
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m19658Q3() {
        InterfaceC41775x1 interfaceC41775x1 = this.f18927b0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f18927b0 = null;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m19660S3(boolean z11) {
        C5392c c5392c = this.f18926a0;
        m19659R3();
        if (c5392c != null) {
            c5392c.dismiss();
        }
        if (z11) {
            C46392a.m102328k(C42153h.f93593a.m92506J(), true);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final AssetUnifiedAdapter m19661T3() {
        return (AssetUnifiedAdapter) this.f18922W.getValue();
    }

    /* JADX INFO: renamed from: U3 */
    public final C44847q3 m19662U3() {
        return (C44847q3) this.f18920U.getValue(this, f18919e0[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getOverviewData();
            }
        }, new C111232(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUnifiedPnlOverview();
            }
        }, new C111254(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C111276(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideSmallSwitch());
            }
        }, new C111298(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsShowInDebt());
            }
        }, new C1111410(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiAssetsShowList();
            }
        }, new C1111612(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.13
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getProductsSourceList();
            }
        }, new C1111814(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.15
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getMarginCurrencySet();
            }
        }, new C1112016(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.unify.AssetUnifiedFragment.bindState.17
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getOriginAssetsSourceList();
            }
        }, new C1112218(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 == null || c44847q3M19662U3.f100690k == null || !(singleEvent instanceof SingleEvent.C19247c)) {
            return;
        }
        C44847q3 c44847q3M19662U4 = m19662U3();
        if (c44847q3M19662U4 != null && (kuCoinRefreshLayout = c44847q3M19662U4.f100690k) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        WrapperLoadingView wrapperLoadingView = this.f18921V;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_asset_unified;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18928c0() {
        return this.f18928c0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetUnifiedViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetUnifiedViewModel.class);
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m19667n4() {
        return UnifyCustomMarginEntrance.f19056a.m19890a(IUnifyAccountService.f53155a.get().mo64979C(), AssetRemoteConfig.f18903a.m19578u());
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new AssetUnifiedFragment$onViewCreated$$inlined$bindFlowEvent$1(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    /* JADX INFO: renamed from: p4 */
    public final void m19668p4() {
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "asset_next").m4038a(Constants.COMPONENT, "kc_asset_next_rn").m4038a("entry", "main").m4038a("isDebug", Boolean.FALSE).m4038a("route", "AssetsUnifiedMarginCurrencyPage").m4048k();
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        UnifyAssetHeaderView unifyAssetHeaderView;
        if (assetV2OverviewEntity == null) {
            return;
        }
        this.f18923X = assetV2OverviewEntity;
        if (getContext() == null || !isShowing()) {
            return;
        }
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null && (unifyAssetHeaderView = c44847q3M19662U3.f100687h) != null) {
            unifyAssetHeaderView.m19751l(this.f18923X);
        }
        sendIntent(new AssetUnifiedContract$UiIntent.FetchUnifiedOverviewData(assetV2OverviewEntity.getBaseCurrency()));
        m19671t4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m19669r4() {
        C43852m.m96595g("B5UnifyTrading", "AssertsHome", null, null, 12, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18928c0 = z11;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m19671t4() {
        if (AssetRemoteConfig.f18903a.m19568k()) {
            sendIntent(AssetUnifiedContract$UiIntent.FetchUnifiedPnlOverview.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m19675z4(UnifiedAccountOverview unifiedAccountOverview) {
        UnifyAssetHeaderView unifyAssetHeaderView;
        sendIntent(new AssetUnifiedContract$UiIntent.HideOrShowNumber(C11200j.f19030a.m19887a()));
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 == null || (unifyAssetHeaderView = c44847q3M19662U3.f100687h) == null) {
            return;
        }
        unifyAssetHeaderView.m19752m(unifiedAccountOverview);
    }

    public AssetUnifiedFragment() {
        setPageId("B5UnifyTrading");
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m19627X3(AssetUnifiedFragment assetUnifiedFragment, Boolean bool) {
        assetUnifiedFragment.m19661T3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m19628Y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m19629Z3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m19630a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m19632d4(AssetUnifiedFragment assetUnifiedFragment) {
        AppCompatCheckBox appCompatCheckBox;
        C44847q3 c44847q3M19662U3 = assetUnifiedFragment.m19662U3();
        if (c44847q3M19662U3 != null && (appCompatCheckBox = c44847q3M19662U3.f100684e) != null) {
            appCompatCheckBox.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m19638l4(AssetUnifiedFragment assetUnifiedFragment) {
        if (!assetUnifiedFragment.m19667n4()) {
            return Unit.INSTANCE;
        }
        assetUnifiedFragment.m19660S3(true);
        assetUnifiedFragment.m19668p4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m19643o4(AssetUnifiedFragment assetUnifiedFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44847q3 c44847q3M19662U3 = assetUnifiedFragment.m19662U3();
        if (c44847q3M19662U3 != null && (kuCoinRefreshLayout = c44847q3M19662U3.f100690k) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        assetUnifiedFragment.m19646q4();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m19646q4() {
        String baseCurrency;
        boolean zM19674y4 = m19674y4();
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(AssetUnifiedContract$UiIntent.FetchAssetsList.INSTANCE);
        if (zM19674y4) {
            sendIntent(AssetUnifiedContract$UiIntent.FetchMarginCurrencyList.INSTANCE);
        }
        AssetV2OverviewEntity assetV2OverviewEntity = this.f18923X;
        if (assetV2OverviewEntity != null) {
            baseCurrency = assetV2OverviewEntity.getBaseCurrency();
        } else {
            baseCurrency = null;
        }
        sendIntent(new AssetUnifiedContract$UiIntent.FetchUnifiedOverviewData(baseCurrency));
        m19671t4();
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m19652v4(AssetUnifiedFragment assetUnifiedFragment) {
        BaseTextView baseTextView;
        C44847q3 c44847q3M19662U3 = assetUnifiedFragment.m19662U3();
        if (c44847q3M19662U3 != null) {
            baseTextView = c44847q3M19662U3.f100691l;
        } else {
            baseTextView = null;
        }
        if (assetUnifiedFragment.isShowing() && baseTextView != null && baseTextView.isShown() && assetUnifiedFragment.f18926a0 == null) {
            assetUnifiedFragment.m19673w4(baseTextView);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m19659R3() {
        m19658Q3();
        this.f18926a0 = null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: V3 */
    public final void m19663V3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        AssetUnifiedAdapter assetUnifiedAdapterM19661T3 = m19661T3();
        int i11 = R$layout.view_empty;
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null) {
            recyclerView = c44847q3M19662U3.f100688i;
        } else {
            recyclerView = null;
        }
        assetUnifiedAdapterM19661T3.setEmptyView(i11, recyclerView);
        m19661T3().m19605F(new Function0() { // from class: com.kubi.assets.unify.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedFragment.m19626W3(this.f18948b);
            }
        });
        C44847q3 c44847q3M19662U4 = m19662U3();
        if (c44847q3M19662U4 != null && (recyclerView3 = c44847q3M19662U4.f100688i) != null) {
            recyclerView3.setAdapter(m19661T3());
        }
        C44847q3 c44847q3M19662U5 = m19662U3();
        if (c44847q3M19662U5 != null && (recyclerView2 = c44847q3M19662U5.f100688i) != null) {
            final Context contextRequireContext = requireContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(contextRequireContext) { // from class: com.kubi.assets.unify.AssetUnifiedFragment$initAssetListUI$2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public int scrollVerticallyBy(int dy2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    C44847q3 c44847q3M19662U6;
                    AssetSearchView assetSearchView;
                    ClearEditText etSearchView;
                    if (Math.abs(dy2) > 20 && (c44847q3M19662U6 = this.f18931b.m19662U3()) != null && (assetSearchView = c44847q3M19662U6.f100689j) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                        KeyboardUtils.m6034f(etSearchView);
                    }
                    return super.scrollVerticallyBy(dy2, recycler, state);
                }
            });
        }
        if (C12573b.f21598a.m23696a()) {
            "event_overview_custom_order".length();
        }
        C12572a.m23692a(this, true, new AssetUnifiedFragment$initAssetListUI$$inlined$bindFlowEvent$1("event_overview_custom_order", null, this));
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedFragment.m19627X3(this.f19034b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.unify.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetUnifiedFragment.m19628Y3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.unify.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedFragment.m19629Z3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.unify.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetUnifiedFragment.m19630a4(function2, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m19664b4() {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        AssetSearchView assetSearchView2;
        AssetSearchView assetSearchView3;
        ClearEditText etSearchView2;
        AppCompatCheckBox appCompatCheckBox;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        AppCompatCheckBox appCompatCheckBox2;
        DashTextView dashTextView3;
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null && (dashTextView3 = c44847q3M19662U3.f100683d) != null) {
            C27046k.m66711z(dashTextView3, 0L, new Function0() { // from class: com.kubi.assets.unify.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetUnifiedFragment.m19635g4(this.f19054b);
                }
            }, 1, null);
        }
        C44847q3 c44847q3M19662U4 = m19662U3();
        if (c44847q3M19662U4 != null && (appCompatCheckBox2 = c44847q3M19662U4.f100682c) != null) {
            appCompatCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.unify.x
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetUnifiedFragment.m19631c4(this.f19055b, compoundButton, z11);
                }
            });
        }
        C44847q3 c44847q3M19662U5 = m19662U3();
        if (c44847q3M19662U5 != null && (dashTextView2 = c44847q3M19662U5.f100692m) != null) {
            dashTextView2.setNeedDash(false);
        }
        C44847q3 c44847q3M19662U6 = m19662U3();
        if (c44847q3M19662U6 != null && (dashTextView = c44847q3M19662U6.f100692m) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.unify.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetUnifiedFragment.m19632d4(this.f19057b);
                }
            }, 1, null);
        }
        C44847q3 c44847q3M19662U7 = m19662U3();
        if (c44847q3M19662U7 != null && (appCompatCheckBox = c44847q3M19662U7.f100684e) != null) {
            appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.unify.z
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetUnifiedFragment.m19633e4(this.f19059b, compoundButton, z11);
                }
            });
        }
        m19666k4();
        C44847q3 c44847q3M19662U8 = m19662U3();
        if (c44847q3M19662U8 != null && (assetSearchView3 = c44847q3M19662U8.f100689j) != null && (etSearchView2 = assetSearchView3.getEtSearchView()) != null) {
            etSearchView2.m54480h(C5275i0.m6236a(12.0f));
        }
        C44847q3 c44847q3M19662U9 = m19662U3();
        if (c44847q3M19662U9 != null && (assetSearchView2 = c44847q3M19662U9.f100689j) != null) {
            assetSearchView2.setShowInputCallBack(new Action() { // from class: com.kubi.assets.unify.a0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetUnifiedFragment.m19634f4();
                }
            });
        }
        C44847q3 c44847q3M19662U10 = m19662U3();
        if (c44847q3M19662U10 != null && (assetSearchView = c44847q3M19662U10.f100689j) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
            etSearchView.addTextChangedListener(new C11111a());
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m19665h4() {
        UnifyAssetHeaderView unifyAssetHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        UnifyAssetHeaderView unifyAssetHeaderView2;
        AccountInfoHeaderView accountInfoHeader2;
        UnifyAssetHeaderView unifyAssetHeaderView3;
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null && (unifyAssetHeaderView3 = c44847q3M19662U3.f100687h) != null) {
            unifyAssetHeaderView3.m19750k(this);
        }
        C44847q3 c44847q3M19662U4 = m19662U3();
        if (c44847q3M19662U4 != null && (unifyAssetHeaderView2 = c44847q3M19662U4.f100687h) != null && (accountInfoHeader2 = unifyAssetHeaderView2.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader2, new Consumer() { // from class: com.kubi.assets.unify.p
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetUnifiedFragment.m19636i4(this.f19041b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44847q3 c44847q3M19662U5 = m19662U3();
        if (c44847q3M19662U5 != null && (unifyAssetHeaderView = c44847q3M19662U5.f100687h) != null && (accountInfoHeader = unifyAssetHeaderView.getAccountInfoHeader()) != null) {
            AccountInfoHeaderView.m19940y(accountInfoHeader, new Action() { // from class: com.kubi.assets.unify.q
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetUnifiedFragment.m19637j4(this.f19043b);
                }
            }, null, R$drawable.ic2_history_20, GravityCompat.END, 0, null, false, false, 242, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        CoordinatorLayout coordinatorLayout;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null) {
            coordinatorLayout = c44847q3M19662U3.f100685f;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f18921V = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44847q3 c44847q3M19662U4 = m19662U3();
        if (c44847q3M19662U4 != null && (kuCoinRefreshLayout = c44847q3M19662U4.f100690k) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.unify.t
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetUnifiedFragment.m19640m4(this.f19050b, interfaceC38162f);
                }
            });
        }
        m19665h4();
        m19664b4();
        m19663V3();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19666k4() {
        BaseTextView baseTextView;
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null && (baseTextView = c44847q3M19662U3.f100691l) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.unify.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetUnifiedFragment.m19638l4(this.f19048b);
                }
            }, 1, null);
        }
        m19674y4();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerView;
        AppBarLayout appBarLayout;
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null && (recyclerView = c44847q3M19662U3.f100688i) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44847q3 c44847q3M19662U4 = m19662U3();
            if (c44847q3M19662U4 != null) {
                appBarLayout = c44847q3M19662U4.f100681b;
            } else {
                appBarLayout = null;
            }
            assetsHelper.m19174t(recyclerView, appBarLayout, new Action() { // from class: com.kubi.assets.unify.v
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetUnifiedFragment.m19643o4(this.f19053b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43841b.m96557d("B5TradeAccount_account_detail_load", "page_load_start", null, 4, null);
        m19646q4();
        m19669r4();
        m19672u4();
    }

    /* JADX INFO: renamed from: s4 */
    public final void m19670s4() {
        m19658Q3();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f18927b0 = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AssetUnifiedFragment$scheduleMarginGuideAutoDismiss$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: u4 */
    public final void m19672u4() {
        C44847q3 c44847q3M19662U3;
        BaseTextView baseTextView;
        if (isShowing()) {
            if (UnifyCustomMarginEntrance.f19056a.m19892c(m19667n4(), C46392a.m102322d(C42153h.f93593a.m92506J(), false)) && this.f18926a0 == null && (c44847q3M19662U3 = m19662U3()) != null && (baseTextView = c44847q3M19662U3.f100691l) != null) {
                baseTextView.post(new Runnable() { // from class: com.kubi.assets.unify.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AssetUnifiedFragment.m19652v4(this.f19051b);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final boolean m19674y4() {
        BaseTextView baseTextView;
        int i11;
        boolean zM19667n4 = m19667n4();
        C44847q3 c44847q3M19662U3 = m19662U3();
        if (c44847q3M19662U3 != null && (baseTextView = c44847q3M19662U3.f100691l) != null) {
            if (zM19667n4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView.setVisibility(i11);
        }
        if (m19661T3().getF18915m() != zM19667n4) {
            m19661T3().m19603D(zM19667n4);
            m19661T3().notifyDataSetChanged();
        }
        if (!zM19667n4) {
            m19660S3(false);
        }
        return zM19667n4;
    }
}
