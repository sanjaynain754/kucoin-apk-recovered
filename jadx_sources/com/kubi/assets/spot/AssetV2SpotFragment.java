package com.kubi.assets.spot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.C11351z0;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$layout;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.data.coin.AccountType;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
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
import jb0.InterfaceC40373g;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p402kf.C41016c;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44903y3;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2SpotFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 A2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001AB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010(\u001a\u00020)H\u0014J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0015J\b\u00102\u001a\u00020+H\u0016J\u0010\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u001aH\u0014J\b\u00105\u001a\u00020+H\u0015J\u0010\u00106\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0014J\b\u00109\u001a\u00020+H\u0016J\u0012\u0010:\u001a\u00020+2\b\u0010;\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010<\u001a\u00020+H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010!0 X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020#0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040>8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, m90084d2 = {"Lcom/kubi/assets/spot/AssetV2SpotFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/spot/AssetV2SpotContract$UiIntent;", "Lcom/kubi/assets/spot/AssetV2SpotContract$UIState;", "Lcom/kubi/assets/spot/AssetV2SpotViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2SpotBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2SpotBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "adapter", "Lcom/kubi/assets/spot/AssetV2SpotAdapter;", "getAdapter", "()Lcom/kubi/assets/spot/AssetV2SpotAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "rateMap", "", "", "productsMap", "Lcom/kubi/assets/entity/EarnAccountItem;", "getProductsMap", "()Ljava/util/Map;", "setProductsMap", "(Ljava/util/Map;)V", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initView", "lazyLoad", "onViewHideOrShowToggle", TIMPushProvider.f75062n, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onRefresh", "onAssetsGet", "myAssetEntity", "sendFetchSpotPnlOverviewIntent", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SpotFragment.kt\ncom/kubi/assets/spot/AssetV2SpotFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,283:1\n147#2,16:284\n158#3,2:300\n158#3,2:322\n49#4:302\n65#4,16:303\n93#4,3:319\n135#5,2:324\n*S KotlinDebug\n*F\n+ 1 AssetV2SpotFragment.kt\ncom/kubi/assets/spot/AssetV2SpotFragment\n*L\n70#1:284,16\n91#1:300,2\n147#1:322,2\n142#1:302\n142#1:303,16\n142#1:319,3\n175#1:324,2\n*E\n"})
public final class AssetV2SpotFragment extends BaseStateFragment<AssetV2SpotContract$UiIntent, UIState, AssetV2SpotViewModel> implements SwipeRefreshLayout.OnRefreshListener, AssetV2Fragment.InterfaceC9449a {

    /* JADX INFO: renamed from: V */
    @Nullable
    public WrapperLoadingView f18814V;

    /* JADX INFO: renamed from: X */
    @Nullable
    public AssetV2OverviewEntity f18816X;

    /* JADX INFO: renamed from: Y */
    public boolean f18817Y;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f18812c0 = {Reflection.property1(new PropertyReference1Impl(AssetV2SpotFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2SpotBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f18811b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18813U = C45681e.m100799e(this, new Function1<AssetV2SpotFragment, C44903y3>() { // from class: com.kubi.assets.spot.AssetV2SpotFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44903y3 invoke(@NotNull AssetV2SpotFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44903y3.m99330a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44903y3, Unit>() { // from class: com.kubi.assets.spot.AssetV2SpotFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44903y3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44903y3 c44903y3) {
            invoke(c44903y3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18815W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.spot.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2SpotFragment.m19397F3(this.f18888b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Map<String, String> f18818Z = new HashMap();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public Map<String, EarnAccountItem> f18819a0 = new HashMap();

    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/spot/AssetV2SpotFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/assets/spot/AssetV2SpotFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetV2SpotFragment newInstance() {
            return new AssetV2SpotFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AssetV2SpotFragment.kt\ncom/kubi/assets/spot/AssetV2SpotFragment\n*L\n1#1,97:1\n78#2:98\n71#3:99\n143#4,4:100\n*E\n"})
    public static final class C11012a implements TextWatcher {
        public C11012a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            KuCheckBox kuCheckBox;
            AssetV2SpotFragment assetV2SpotFragment = AssetV2SpotFragment.this;
            C44903y3 c44903y3M19427H3 = assetV2SpotFragment.m19427H3();
            assetV2SpotFragment.sendIntent(new AssetV2SpotContract$UiIntent.HideSmallOrFilter(C27025c.m66566d((c44903y3M19427H3 == null || (kuCheckBox = c44903y3M19427H3.f101178c) == null) ? null : Boolean.valueOf(kuCheckBox.isChecked())), StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$b */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11013b implements Function0<Unit> {
        public C11013b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m19429a() {
            AssetV2SpotFragment.this.sendIntent(AssetV2SpotContract$UiIntent.FetchProducts.INSTANCE);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m19429a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/AccountItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$10", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1101510 extends SuspendLambda implements Function2<List<? extends AccountItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: h */
        public static final Unit m19432h() {
            C43841b.m96557d("B5TradeAccount_account_detail_load", "page_load_end", null, 4, null);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AccountItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AccountItemEntity>) list, continuation);
        }

        public C1101510(Continuation<? super C1101510> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m19433i(AssetV2SpotFragment assetV2SpotFragment) {
            assetV2SpotFragment.sendIntent(AssetV2SpotContract$UiIntent.FetchProducts.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1101510 c1101510 = AssetV2SpotFragment.this.new C1101510(continuation);
            c1101510.L$0 = obj;
            return c1101510;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AccountItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C1101510) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
                final AssetV2SpotFragment assetV2SpotFragment = AssetV2SpotFragment.this;
                assetV2SpotFragment.m19426G3().m19391y(list, AssetV2SpotFragment.m19395D3(assetV2SpotFragment).getFilterKeywords());
                assetV2SpotFragment.runOnUiThread(new Function0() { // from class: com.kubi.assets.spot.x
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetV2SpotFragment.C1101510.m19432h();
                    }
                });
                C24129b.m58033e(SiteVisibleConfigKey.Financing, new Function0() { // from class: com.kubi.assets.spot.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetV2SpotFragment.C1101510.m19433i(assetV2SpotFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$12 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "products", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EarnAccountItem;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$12", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetV2SpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SpotFragment.kt\ncom/kubi/assets/spot/AssetV2SpotFragment$bindState$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n1869#2,2:284\n*S KotlinDebug\n*F\n+ 1 AssetV2SpotFragment.kt\ncom/kubi/assets/spot/AssetV2SpotFragment$bindState$12\n*L\n219#1:284,2\n*E\n"})
    public static final class C1101712 extends SuspendLambda implements Function2<ArrayList<EarnAccountItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m19435g() {
            C43841b.m96557d("B1mainAccount_account_detail_load", "page_load_end", null, 4, null);
            return Unit.INSTANCE;
        }

        public C1101712(Continuation<? super C1101712> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1101712 c1101712 = AssetV2SpotFragment.this.new C1101712(continuation);
            c1101712.L$0 = obj;
            return c1101712;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EarnAccountItem> arrayList, Continuation<? super Unit> continuation) {
            return ((C1101712) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetV2SpotFragment assetV2SpotFragment = AssetV2SpotFragment.this;
                for (EarnAccountItem earnAccountItem : arrayList) {
                    String str = (String) assetV2SpotFragment.f18818Z.get(earnAccountItem.getCurrency());
                    String strM89946t = null;
                    double dM66646f = C27039d.m66646f(str != null ? DowngradeExKt.m66539i(str) : null);
                    String totalReturn = earnAccountItem.getTotalReturn();
                    if (dM66646f < C27039d.m66646f(totalReturn != null ? DowngradeExKt.m66539i(totalReturn) : null)) {
                        Map map = assetV2SpotFragment.f18818Z;
                        String currency = earnAccountItem.getCurrency();
                        String totalReturn2 = earnAccountItem.getTotalReturn();
                        if (totalReturn2 != null && (bigDecimalM66536f = DowngradeExKt.m66536f(totalReturn2)) != null) {
                            strM89946t = C41014a.m89946t(bigDecimalM66536f, null, 0, false, false, false, false, false, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
                        }
                        map.put(currency, C27041f.m66668h(strM89946t));
                    }
                    assetV2SpotFragment.m19428I3().put(earnAccountItem.getCurrency(), earnAccountItem);
                }
                assetV2SpotFragment.m19426G3().m19388D(assetV2SpotFragment.f18818Z);
                assetV2SpotFragment.m19426G3().m19387C(assetV2SpotFragment.m19428I3());
                assetV2SpotFragment.m19426G3().notifyDataSetChanged();
                assetV2SpotFragment.runOnUiThread(new Function0() { // from class: com.kubi.assets.spot.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetV2SpotFragment.C1101712.m19435g();
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$14 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AccountItemEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$14", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1101914 extends SuspendLambda implements Function2<ArrayList<AccountItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1101914(Continuation<? super C1101914> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1101914 c1101914 = AssetV2SpotFragment.this.new C1101914(continuation);
            c1101914.L$0 = obj;
            return c1101914;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AccountItemEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C1101914) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetSearchView assetSearchView;
            ClearEditText etSearchView;
            KuCheckBox kuCheckBox;
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                AssetV2SpotFragment assetV2SpotFragment = AssetV2SpotFragment.this;
                C44903y3 c44903y3M19427H3 = assetV2SpotFragment.m19427H3();
                Editable text = null;
                boolean zM66566d = C27025c.m66566d((c44903y3M19427H3 == null || (kuCheckBox = c44903y3M19427H3.f101178c) == null) ? null : Boxing.boxBoolean(kuCheckBox.isChecked()));
                C44903y3 c44903y3M19427H4 = assetV2SpotFragment.m19427H3();
                if (c44903y3M19427H4 != null && (assetSearchView = c44903y3M19427H4.f101182g) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                    text = etSearchView.getText();
                }
                assetV2SpotFragment.sendIntent(new AssetV2SpotContract$UiIntent.HideSmallOrFilter(zM66566d, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$2", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110202 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C110202(Continuation<? super C110202> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110202 c110202 = AssetV2SpotFragment.this.new C110202(continuation);
            c110202.Z$0 = ((Boolean) obj).booleanValue();
            return c110202;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C110202) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotAssetHeaderView spotAssetHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44903y3 c44903y3M19427H3 = AssetV2SpotFragment.this.m19427H3();
            ShowHideTextView.m54778d(c44903y3M19427H3 != null ? c44903y3M19427H3.f101183h : null, z11);
            C44903y3 c44903y3M19427H4 = AssetV2SpotFragment.this.m19427H3();
            if (c44903y3M19427H4 != null && (spotAssetHeaderView = c44903y3M19427H4.f101183h) != null && (accountInfoHeader = spotAssetHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AssetV2SpotFragment.this.m19426G3().m19385A(z11);
            AssetV2SpotFragment.this.m19426G3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$4", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110224 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C110224(Continuation<? super C110224> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110224 c110224 = AssetV2SpotFragment.this.new C110224(continuation);
            c110224.Z$0 = ((Boolean) obj).booleanValue();
            return c110224;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C110224) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KuCheckBox kuCheckBox;
            KuCheckBox kuCheckBox2;
            KuCheckBox kuCheckBox3;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44903y3 c44903y3M19427H3 = AssetV2SpotFragment.this.m19427H3();
            if (((c44903y3M19427H3 == null || (kuCheckBox3 = c44903y3M19427H3.f101178c) == null) ? null : kuCheckBox3.getTag()) == null) {
                C44903y3 c44903y3M19427H4 = AssetV2SpotFragment.this.m19427H3();
                if (c44903y3M19427H4 != null && (kuCheckBox2 = c44903y3M19427H4.f101178c) != null) {
                    kuCheckBox2.setTag(Boxing.boxBoolean(true));
                }
                C44903y3 c44903y3M19427H5 = AssetV2SpotFragment.this.m19427H3();
                if (c44903y3M19427H5 != null && (kuCheckBox = c44903y3M19427H5.f101178c) != null) {
                    kuCheckBox.setChecked(z11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$6", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110246 extends SuspendLambda implements Function2<CovertFromCoin, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CovertFromCoin covertFromCoin, Continuation<? super Unit> continuation) {
            return ((C110246) create(covertFromCoin, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C110246(Continuation<? super C110246> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110246 c110246 = AssetV2SpotFragment.this.new C110246(continuation);
            c110246.L$0 = obj;
            return c110246;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotAssetHeaderView spotAssetHeaderView;
            CovertFromCoin covertFromCoin = (CovertFromCoin) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44903y3 c44903y3M19427H3 = AssetV2SpotFragment.this.m19427H3();
            if (c44903y3M19427H3 != null && (spotAssetHeaderView = c44903y3M19427H3.f101183h) != null) {
                spotAssetHeaderView.m19486t(covertFromCoin);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetV2SpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "overview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotFragment$bindState$8", m90122f = "AssetV2SpotFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110268 extends SuspendLambda implements Function2<SpotAccountOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotAccountOverviewEntity spotAccountOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C110268) create(spotAccountOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C110268(Continuation<? super C110268> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110268 c110268 = AssetV2SpotFragment.this.new C110268(continuation);
            c110268.L$0 = obj;
            return c110268;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotAssetHeaderView spotAssetHeaderView;
            SpotAccountOverviewEntity spotAccountOverviewEntity = (SpotAccountOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44903y3 c44903y3M19427H3 = AssetV2SpotFragment.this.m19427H3();
            if (c44903y3M19427H3 != null && (spotAssetHeaderView = c44903y3M19427H3.f101183h) != null) {
                spotAssetHeaderView.m19482j(spotAccountOverviewEntity);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(AssetV2SpotContract$UiIntent.FetchSpotAssetsList.INSTANCE);
        C24129b.m58033e(SiteVisibleConfigKey.Convert, new Function0() { // from class: com.kubi.assets.spot.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotFragment.m19409U3(this.f18892b);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public static final AssetV2SpotAdapter m19397F3(AssetV2SpotFragment assetV2SpotFragment) {
        return new AssetV2SpotAdapter(assetV2SpotFragment);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m19402N3(AssetV2SpotFragment assetV2SpotFragment) {
        C43852m.m96591c("B5TradeAccount", "convert", "2", null, 8, null);
        IAssetsCenterService.f16464a.get().mo15348n(assetV2SpotFragment.getContext(), AccountType.TRADE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m19403O3(AssetV2SpotFragment assetV2SpotFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetV2SpotFragment.sendIntent(new AssetV2SpotContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m19404P3(AssetV2SpotFragment assetV2SpotFragment) {
        assetV2SpotFragment.sendIntent(AssetV2SpotContract$UiIntent.FetchSpotAssetsList.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m19405Q3(AssetV2SpotFragment assetV2SpotFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetV2SpotFragment.lazyLoad();
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m19406R3(AssetV2SpotFragment assetV2SpotFragment) {
        AssetsHelper.m19148y(AssetsHelper.f18684a, assetV2SpotFragment, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m19407S3(AssetV2SpotFragment assetV2SpotFragment, CompoundButton compoundButton, boolean z11) {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        C44903y3 c44903y3M19427H3 = assetV2SpotFragment.m19427H3();
        assetV2SpotFragment.sendIntent(new AssetV2SpotContract$UiIntent.HideSmallOrFilter(z11, StringsKt.trim((CharSequence) String.valueOf((c44903y3M19427H3 == null || (assetSearchView = c44903y3M19427H3.f101182g) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) ? null : etSearchView.getText())).toString(), true));
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m19408T3() {
        C43852m.m96591c("B5TradeAccount", "searchCoin", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m19409U3(AssetV2SpotFragment assetV2SpotFragment) {
        assetV2SpotFragment.sendIntent(AssetV2SpotContract$UiIntent.FetchCovertCoinInfo.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public final AssetV2SpotAdapter m19426G3() {
        return (AssetV2SpotAdapter) this.f18815W.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final C44903y3 m19427H3() {
        return (C44903y3) this.f18813U.getValue(this, f18812c0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: I3 */
    public final Map<String, EarnAccountItem> m19428I3() {
        return this.f18819a0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C110202(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideSmallSwitch());
            }
        }, new C110224(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiConvertInfo();
            }
        }, new C110246(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSpotPnlOverview();
            }
        }, new C110268(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiSpotAssetsShowList();
            }
        }, new C1101510(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getProductsSourceList();
            }
        }, new C1101712(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.spot.AssetV2SpotFragment.bindState.13
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSpotAssetsSourceList();
            }
        }, new C1101914(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44903y3 c44903y3M19427H3 = m19427H3();
        if (c44903y3M19427H3 == null || c44903y3M19427H3.f101184i == null || !(singleEvent instanceof SingleEvent.C19247c)) {
            return;
        }
        C44903y3 c44903y3M19427H4 = m19427H3();
        if (c44903y3M19427H4 != null && (kuCoinRefreshLayout = c44903y3M19427H4.f101184i) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        WrapperLoadingView wrapperLoadingView = this.f18814V;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_assetv2_spot;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18817Y() {
        return this.f18817Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetV2SpotViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetV2SpotViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new AssetV2SpotFragment$onViewCreated$$inlined$bindFlowEvent$1(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        SpotAssetHeaderView spotAssetHeaderView;
        this.f18816X = assetV2OverviewEntity;
        if (getContext() == null || !isShowing() || assetV2OverviewEntity == null) {
            return;
        }
        C44903y3 c44903y3M19427H3 = m19427H3();
        if (c44903y3M19427H3 != null && (spotAssetHeaderView = c44903y3M19427H3.f101183h) != null) {
            spotAssetHeaderView.m19481i(assetV2OverviewEntity);
        }
        m19411W3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18817Y = z11;
    }

    public AssetV2SpotFragment() {
        setPageId("B5TradeAccount");
    }

    /* JADX INFO: renamed from: D3 */
    public static final /* synthetic */ UIState m19395D3(AssetV2SpotFragment assetV2SpotFragment) {
        return assetV2SpotFragment.getState();
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m19398J3(AssetV2SpotFragment assetV2SpotFragment, Boolean bool) {
        assetV2SpotFragment.m19426G3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final void m19399K3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m19400L3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m19401M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m19410V3(AssetV2SpotFragment assetV2SpotFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44903y3 c44903y3M19427H3 = assetV2SpotFragment.m19427H3();
        if (c44903y3M19427H3 != null && (kuCoinRefreshLayout = c44903y3M19427H3.f101184i) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        assetV2SpotFragment.lazyLoad();
    }

    /* JADX INFO: renamed from: W3 */
    private final void m19411W3() {
        if (C11351z0.m20196k()) {
            sendIntent(AssetV2SpotContract$UiIntent.FetchSpotPnlOverview.INSTANCE);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        CoordinatorLayout coordinatorLayout;
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        AssetSearchView assetSearchView2;
        KuCheckBox kuCheckBox;
        DashTextView dashTextView;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView2;
        AssetSearchView assetSearchView3;
        ClearEditText etSearchView2;
        RecyclerView recyclerView3;
        SpotAssetHeaderView spotAssetHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        SpotAssetHeaderView spotAssetHeaderView2;
        C44903y3 c44903y3M19427H3 = m19427H3();
        if (c44903y3M19427H3 != null) {
            coordinatorLayout = c44903y3M19427H3.f101180e;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f18814V = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44903y3 c44903y3M19427H4 = m19427H3();
        if (c44903y3M19427H4 != null && (spotAssetHeaderView2 = c44903y3M19427H4.f101183h) != null) {
            spotAssetHeaderView2.m19480h(this);
        }
        C44903y3 c44903y3M19427H5 = m19427H3();
        if (c44903y3M19427H5 != null && (spotAssetHeaderView = c44903y3M19427H5.f101183h) != null && (accountInfoHeader = spotAssetHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.spot.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetV2SpotFragment.m19403O3(this.f18886b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        m19426G3().m19386B(new Function0() { // from class: com.kubi.assets.spot.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotFragment.m19404P3(this.f18894b);
            }
        });
        C44903y3 c44903y3M19427H6 = m19427H3();
        if (c44903y3M19427H6 != null && (recyclerView3 = c44903y3M19427H6.f101181f) != null) {
            recyclerView3.setAdapter(m19426G3());
        }
        AssetV2SpotAdapter assetV2SpotAdapterM19426G3 = m19426G3();
        int i11 = R$layout.view_empty;
        C44903y3 c44903y3M19427H7 = m19427H3();
        if (c44903y3M19427H7 != null) {
            recyclerView = c44903y3M19427H7.f101181f;
        } else {
            recyclerView = null;
        }
        assetV2SpotAdapterM19426G3.setEmptyView(i11, recyclerView);
        C44903y3 c44903y3M19427H8 = m19427H3();
        if (c44903y3M19427H8 != null && (assetSearchView3 = c44903y3M19427H8.f101182g) != null && (etSearchView2 = assetSearchView3.getEtSearchView()) != null) {
            etSearchView2.m54480h(C5275i0.m6236a(12.0f));
        }
        C44903y3 c44903y3M19427H9 = m19427H3();
        if (c44903y3M19427H9 != null && (recyclerView2 = c44903y3M19427H9.f101181f) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()) { // from class: com.kubi.assets.spot.AssetV2SpotFragment.initView.3
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public int scrollVerticallyBy(int dy2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    C44903y3 c44903y3M19427H10;
                    AssetSearchView assetSearchView4;
                    ClearEditText etSearchView3;
                    if (Math.abs(dy2) > 20 && (c44903y3M19427H10 = AssetV2SpotFragment.this.m19427H3()) != null && (assetSearchView4 = c44903y3M19427H10.f101182g) != null && (etSearchView3 = assetSearchView4.getEtSearchView()) != null) {
                        KeyboardUtils.m6034f(etSearchView3);
                    }
                    return super.scrollVerticallyBy(dy2, recycler, state);
                }
            });
        }
        C44903y3 c44903y3M19427H10 = m19427H3();
        if (c44903y3M19427H10 != null && (kuCoinRefreshLayout = c44903y3M19427H10.f101184i) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.spot.q
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetV2SpotFragment.m19405Q3(this.f18895b, interfaceC38162f);
                }
            });
        }
        C44903y3 c44903y3M19427H11 = m19427H3();
        if (c44903y3M19427H11 != null && (dashTextView = c44903y3M19427H11.f101179d) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.spot.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2SpotFragment.m19406R3(this.f18896b);
                }
            }, 1, null);
        }
        C44903y3 c44903y3M19427H12 = m19427H3();
        if (c44903y3M19427H12 != null && (kuCheckBox = c44903y3M19427H12.f101178c) != null) {
            kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.spot.s
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetV2SpotFragment.m19407S3(this.f18898b, compoundButton, z11);
                }
            });
        }
        C44903y3 c44903y3M19427H13 = m19427H3();
        if (c44903y3M19427H13 != null && (assetSearchView2 = c44903y3M19427H13.f101182g) != null) {
            assetSearchView2.setShowInputCallBack(new Action() { // from class: com.kubi.assets.spot.t
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2SpotFragment.m19408T3();
                }
            });
        }
        C44903y3 c44903y3M19427H14 = m19427H3();
        if (c44903y3M19427H14 != null && (assetSearchView = c44903y3M19427H14.f101182g) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
            etSearchView.addTextChangedListener(new C11012a());
        }
        if (C12573b.f21598a.m23696a()) {
            "event_overview_custom_order".length();
        }
        C12572a.m23692a(this, true, new AssetV2SpotFragment$initView$$inlined$bindFlowEvent$1("event_overview_custom_order", null, this));
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.spot.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SpotFragment.m19398J3(this.f18899b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.spot.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2SpotFragment.m19399K3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.spot.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SpotFragment.m19400L3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.spot.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2SpotFragment.m19401M3(function2, obj);
            }
        }));
        C44903y3 c44903y3M19427H15 = m19427H3();
        if (c44903y3M19427H15 != null && (baseTextView2 = c44903y3M19427H15.f101188m) != null) {
            AssetExKt.m15138z(baseTextView2, C24129b.m58030b(SiteVisibleConfigKey.MarginKcsConvert));
        }
        C44903y3 c44903y3M19427H16 = m19427H3();
        if (c44903y3M19427H16 != null && (baseTextView = c44903y3M19427H16.f101188m) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.spot.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2SpotFragment.m19402N3(this.f18893b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerView;
        AppBarLayout appBarLayout;
        C44903y3 c44903y3M19427H3 = m19427H3();
        if (c44903y3M19427H3 != null && (recyclerView = c44903y3M19427H3.f101181f) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44903y3 c44903y3M19427H4 = m19427H3();
            if (c44903y3M19427H4 != null) {
                appBarLayout = c44903y3M19427H4.f101177b;
            } else {
                appBarLayout = null;
            }
            assetsHelper.m19174t(recyclerView, appBarLayout, new Action() { // from class: com.kubi.assets.spot.m
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2SpotFragment.m19410V3(this.f18890b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43841b.m96557d("B5TradeAccount_account_detail_load", "page_load_start", null, 4, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        AssetV2OverviewEntity assetV2OverviewEntity;
        SpotAssetHeaderView spotAssetHeaderView;
        super.onViewHideOrShowToggle(show);
        if (show && (assetV2OverviewEntity = this.f18816X) != null) {
            sendIntent(new AssetV2SpotContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
            C44903y3 c44903y3M19427H3 = m19427H3();
            if (c44903y3M19427H3 != null && (spotAssetHeaderView = c44903y3M19427H3.f101183h) != null) {
                spotAssetHeaderView.m19481i(assetV2OverviewEntity);
            }
            m19411W3();
        }
    }
}
