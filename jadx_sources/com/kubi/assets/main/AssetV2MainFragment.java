package com.kubi.assets.main;

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
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$layout;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.assets.entity.MainRecommendData;
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
import p637ta.C44875u3;
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

/* JADX INFO: compiled from: AssetV2MainFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 <2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001<B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010$\u001a\u00020%H\u0014J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020'H\u0015J\b\u0010-\u001a\u00020'H\u0016J\b\u0010.\u001a\u00020'H\u0016J\u0010\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\u001fH\u0014J\b\u00101\u001a\u00020'H\u0015J\b\u00102\u001a\u00020'H\u0016J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u000205H\u0014J\u0012\u00106\u001a\u00020'2\b\u00107\u001a\u0004\u0018\u00010\u0016H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001d0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0004098TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m90084d2 = {"Lcom/kubi/assets/main/AssetV2MainFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;", "Lcom/kubi/assets/main/AssetV2MainContract$UIState;", "Lcom/kubi/assets/main/AssetV2MainViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2MainBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2MainBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/main/AssetV2MainAdapter;", "getAdapter", "()Lcom/kubi/assets/main/AssetV2MainAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "rateMap", "", "", "productsMap", "Lcom/kubi/assets/entity/EarnAccountItem;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "lazyLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onViewHideOrShowToggle", TIMPushProvider.f75062n, "bindState", "onRefresh", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onAssetsGet", "myAssetEntity", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2MainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainFragment.kt\ncom/kubi/assets/main/AssetV2MainFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n147#2,16:259\n158#3,2:275\n49#4:277\n65#4,16:278\n93#4,3:294\n135#5,2:297\n1#6:299\n*S KotlinDebug\n*F\n+ 1 AssetV2MainFragment.kt\ncom/kubi/assets/main/AssetV2MainFragment\n*L\n59#1:259,16\n84#1:275,2\n131#1:277\n131#1:278,16\n131#1:294,3\n163#1:297,2\n*E\n"})
public final class AssetV2MainFragment extends BaseStateFragment<AssetV2MainContract$UiIntent, UIState, AssetV2MainViewModel> implements SwipeRefreshLayout.OnRefreshListener, AssetV2Fragment.InterfaceC9449a {

    /* JADX INFO: renamed from: W */
    @Nullable
    public AssetV2OverviewEntity f17909W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f17910X;

    /* JADX INFO: renamed from: a0 */
    public boolean f17913a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f17906c0 = {Reflection.property1(new PropertyReference1Impl(AssetV2MainFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2MainBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f17905b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17907U = C45681e.m100799e(this, new Function1<AssetV2MainFragment, C44875u3>() { // from class: com.kubi.assets.main.AssetV2MainFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44875u3 invoke(@NotNull AssetV2MainFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44875u3.m99274a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44875u3, Unit>() { // from class: com.kubi.assets.main.AssetV2MainFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44875u3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44875u3 c44875u3) {
            invoke(c44875u3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17908V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.main.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2MainFragment.m17647E3(this.f17925b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Map<String, String> f17911Y = new HashMap();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public Map<String, EarnAccountItem> f17912Z = new HashMap();

    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/main/AssetV2MainFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/assets/main/AssetV2MainFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetV2MainFragment newInstance() {
            return new AssetV2MainFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AssetV2MainFragment.kt\ncom/kubi/assets/main/AssetV2MainFragment\n*L\n1#1,97:1\n78#2:98\n71#3:99\n132#4,5:100\n*E\n"})
    public static final class C10295a implements TextWatcher {
        public C10295a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            KuCheckBox kuCheckBox;
            AssetV2MainFragment assetV2MainFragment = AssetV2MainFragment.this;
            C44875u3 c44875u3M17674G3 = assetV2MainFragment.m17674G3();
            assetV2MainFragment.sendIntent(new AssetV2MainContract$UiIntent.HideSmallOrFilter(C27025c.m66566d((c44875u3M17674G3 == null || (kuCheckBox = c44875u3M17674G3.f100945c) == null) ? null : Boolean.valueOf(kuCheckBox.isChecked())), StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$b */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10296b implements Function0<Unit> {
        public C10296b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m17675a() {
            AssetV2MainFragment.this.sendIntent(AssetV2MainContract$UiIntent.FetchProducts.INSTANCE);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m17675a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AccountItemEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$10", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1029810 extends SuspendLambda implements Function2<ArrayList<AccountItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1029810(Continuation<? super C1029810> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m17677f(AssetV2MainFragment assetV2MainFragment) {
            assetV2MainFragment.sendIntent(AssetV2MainContract$UiIntent.FetchMainLendCrypto.INSTANCE);
            assetV2MainFragment.sendIntent(AssetV2MainContract$UiIntent.FetchProducts.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1029810 c1029810 = AssetV2MainFragment.this.new C1029810(continuation);
            c1029810.L$0 = obj;
            return c1029810;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AccountItemEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C1029810) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
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
                final AssetV2MainFragment assetV2MainFragment = AssetV2MainFragment.this;
                C24129b.m58033e(SiteVisibleConfigKey.Financing, new Function0() { // from class: com.kubi.assets.main.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetV2MainFragment.C1029810.m17677f(assetV2MainFragment);
                    }
                });
                C44875u3 c44875u3M17674G3 = assetV2MainFragment.m17674G3();
                Editable text = null;
                boolean zM66566d = C27025c.m66566d((c44875u3M17674G3 == null || (kuCheckBox = c44875u3M17674G3.f100945c) == null) ? null : Boxing.boxBoolean(kuCheckBox.isChecked()));
                C44875u3 c44875u3M17674G4 = assetV2MainFragment.m17674G3();
                if (c44875u3M17674G4 != null && (assetSearchView = c44875u3M17674G4.f100950h) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                    text = etSearchView.getText();
                }
                assetV2MainFragment.sendIntent(new AssetV2MainContract$UiIntent.HideSmallOrFilter(zM66566d, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$12 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "products", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EarnAccountItem;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$12", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetV2MainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainFragment.kt\ncom/kubi/assets/main/AssetV2MainFragment$bindState$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n1869#2,2:259\n*S KotlinDebug\n*F\n+ 1 AssetV2MainFragment.kt\ncom/kubi/assets/main/AssetV2MainFragment$bindState$12\n*L\n209#1:259,2\n*E\n"})
    public static final class C1030012 extends SuspendLambda implements Function2<ArrayList<EarnAccountItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: g */
        public static final Unit m17679g() {
            C43841b.m96557d("B1mainAccount_account_detail_load", "page_load_end", null, 4, null);
            return Unit.INSTANCE;
        }

        public C1030012(Continuation<? super C1030012> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1030012 c1030012 = AssetV2MainFragment.this.new C1030012(continuation);
            c1030012.L$0 = obj;
            return c1030012;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EarnAccountItem> arrayList, Continuation<? super Unit> continuation) {
            return ((C1030012) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetV2MainFragment assetV2MainFragment = AssetV2MainFragment.this;
                for (EarnAccountItem earnAccountItem : arrayList) {
                    String str = (String) assetV2MainFragment.f17911Y.get(earnAccountItem.getCurrency());
                    String strM89946t = null;
                    double dM66646f = C27039d.m66646f(str != null ? DowngradeExKt.m66539i(str) : null);
                    String totalReturn = earnAccountItem.getTotalReturn();
                    if (dM66646f < C27039d.m66646f(totalReturn != null ? DowngradeExKt.m66539i(totalReturn) : null)) {
                        Map map = assetV2MainFragment.f17911Y;
                        String currency = earnAccountItem.getCurrency();
                        String totalReturn2 = earnAccountItem.getTotalReturn();
                        if (totalReturn2 != null && (bigDecimalM66536f = DowngradeExKt.m66536f(totalReturn2)) != null) {
                            strM89946t = C41014a.m89946t(bigDecimalM66536f, null, 0, false, false, false, false, false, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
                        }
                        map.put(currency, C27041f.m66668h(strM89946t));
                    }
                    assetV2MainFragment.f17912Z.put(earnAccountItem.getCurrency(), earnAccountItem);
                }
                assetV2MainFragment.m17673F3().m17642q(assetV2MainFragment.f17911Y);
                assetV2MainFragment.m17673F3().m17641p(assetV2MainFragment.f17912Z);
                assetV2MainFragment.m17673F3().notifyDataSetChanged();
                assetV2MainFragment.runOnUiThread(new Function0() { // from class: com.kubi.assets.main.q
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetV2MainFragment.C1030012.m17679g();
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$14 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$14", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1030214 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C1030214(Continuation<? super C1030214> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1030214 c1030214 = AssetV2MainFragment.this.new C1030214(continuation);
            c1030214.Z$0 = ((Boolean) obj).booleanValue();
            return c1030214;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C1030214) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2MainHeaderView assetV2MainHeaderView;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44875u3 c44875u3M17674G3 = AssetV2MainFragment.this.m17674G3();
            if (c44875u3M17674G3 != null && (assetV2MainHeaderView = c44875u3M17674G3.f100948f) != null) {
                assetV2MainHeaderView.m17702w(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$2", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103032 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C103032(Continuation<? super C103032> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103032 c103032 = AssetV2MainFragment.this.new C103032(continuation);
            c103032.Z$0 = ((Boolean) obj).booleanValue();
            return c103032;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C103032) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2MainHeaderView assetV2MainHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44875u3 c44875u3M17674G3 = AssetV2MainFragment.this.m17674G3();
            ShowHideTextView.m54778d(c44875u3M17674G3 != null ? c44875u3M17674G3.f100948f : null, z11);
            C44875u3 c44875u3M17674G4 = AssetV2MainFragment.this.m17674G3();
            if (c44875u3M17674G4 != null && (assetV2MainHeaderView = c44875u3M17674G4.f100948f) != null && (accountInfoHeader = assetV2MainHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AssetV2MainFragment.this.m17673F3().m17640o(z11);
            AssetV2MainFragment.this.m17673F3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$4", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103054 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C103054(Continuation<? super C103054> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103054 c103054 = AssetV2MainFragment.this.new C103054(continuation);
            c103054.Z$0 = ((Boolean) obj).booleanValue();
            return c103054;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C103054) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
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
            C44875u3 c44875u3M17674G3 = AssetV2MainFragment.this.m17674G3();
            if (((c44875u3M17674G3 == null || (kuCheckBox3 = c44875u3M17674G3.f100945c) == null) ? null : kuCheckBox3.getTag()) == null) {
                C44875u3 c44875u3M17674G4 = AssetV2MainFragment.this.m17674G3();
                if (c44875u3M17674G4 != null && (kuCheckBox2 = c44875u3M17674G4.f100945c) != null) {
                    kuCheckBox2.setTag(Boxing.boxBoolean(true));
                }
                C44875u3 c44875u3M17674G5 = AssetV2MainFragment.this.m17674G3();
                if (c44875u3M17674G5 != null && (kuCheckBox = c44875u3M17674G5.f100945c) != null) {
                    kuCheckBox.setChecked(z11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/AccountItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$6", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103076 extends SuspendLambda implements Function2<List<? extends AccountItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AccountItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AccountItemEntity>) list, continuation);
        }

        public C103076(Continuation<? super C103076> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103076 c103076 = AssetV2MainFragment.this.new C103076(continuation);
            c103076.L$0 = obj;
            return c103076;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AccountItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C103076) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetV2MainFragment assetV2MainFragment = AssetV2MainFragment.this;
                assetV2MainFragment.m17673F3().m17639n(list, AssetV2MainFragment.m17645C3(assetV2MainFragment).getFilterKeywords());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetV2MainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/MainRecommendData;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainFragment$bindState$8", m90122f = "AssetV2MainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103098 extends SuspendLambda implements Function2<ArrayList<MainRecommendData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C103098(Continuation<? super C103098> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103098 c103098 = AssetV2MainFragment.this.new C103098(continuation);
            c103098.L$0 = obj;
            return c103098;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<MainRecommendData> arrayList, Continuation<? super Unit> continuation) {
            return ((C103098) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2MainHeaderView assetV2MainHeaderView;
            ArrayList<MainRecommendData> arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44875u3 c44875u3M17674G3 = AssetV2MainFragment.this.m17674G3();
            if (c44875u3M17674G3 != null && (assetV2MainHeaderView = c44875u3M17674G3.f100948f) != null) {
                assetV2MainHeaderView.m17703x(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(AssetV2MainContract$UiIntent.FetchMainAssetsList.INSTANCE);
        sendIntent(AssetV2MainContract$UiIntent.FetchKuCardStatus.INSTANCE);
    }

    /* JADX INFO: renamed from: E3 */
    public static final AssetV2MainAdapter m17647E3(AssetV2MainFragment assetV2MainFragment) {
        return new AssetV2MainAdapter(assetV2MainFragment);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m17651K3(AssetV2MainFragment assetV2MainFragment) {
        IAssetsCenterService.f16464a.get().mo15348n(assetV2MainFragment.getContext(), AccountType.MAIN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m17652L3(AssetV2MainFragment assetV2MainFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetV2MainFragment.sendIntent(new AssetV2MainContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m17653M3(AssetV2MainFragment assetV2MainFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetV2MainFragment.lazyLoad();
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m17654N3(AssetV2MainFragment assetV2MainFragment) {
        AssetsHelper.m19148y(AssetsHelper.f18684a, assetV2MainFragment, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m17655O3(AssetV2MainFragment assetV2MainFragment, CompoundButton compoundButton, boolean z11) {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        C44875u3 c44875u3M17674G3 = assetV2MainFragment.m17674G3();
        assetV2MainFragment.sendIntent(new AssetV2MainContract$UiIntent.HideSmallOrFilter(z11, StringsKt.trim((CharSequence) String.valueOf((c44875u3M17674G3 == null || (assetSearchView = c44875u3M17674G3.f100950h) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) ? null : etSearchView.getText())).toString(), true));
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m17656P3() {
        C43852m.m96591c("B1mainAccount", "searchCoin", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: F3 */
    public final AssetV2MainAdapter m17673F3() {
        return (AssetV2MainAdapter) this.f17908V.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final C44875u3 m17674G3() {
        return (C44875u3) this.f17907U.getValue(this, f17906c0[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C103032(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideSmallSwitch());
            }
        }, new C103054(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiMainAssetsShowList();
            }
        }, new C103076(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiRecommendCurrency();
            }
        }, new C103098(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getMainAssetsSourceList();
            }
        }, new C1029810(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getProductsSourceList();
            }
        }, new C1030012(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.main.AssetV2MainFragment.bindState.13
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getKuCardStatus());
            }
        }, new C1030214(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44875u3 c44875u3M17674G3 = m17674G3();
        if (c44875u3M17674G3 == null || (kuCoinRefreshLayout = c44875u3M17674G3.f100951i) == null || !(singleEvent instanceof SingleEvent.C19247c)) {
            return;
        }
        kuCoinRefreshLayout.setRefreshing(false);
        WrapperLoadingView wrapperLoadingView = this.f17910X;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_assetv2_main;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF17913a0() {
        return this.f17913a0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetV2MainViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetV2MainViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new AssetV2MainFragment$onViewCreated$$inlined$bindFlowEvent$1(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        C44875u3 c44875u3M17674G3;
        AssetV2MainHeaderView assetV2MainHeaderView;
        this.f17909W = assetV2OverviewEntity;
        if (getContext() == null || !isShowing() || assetV2OverviewEntity == null || (c44875u3M17674G3 = m17674G3()) == null || (assetV2MainHeaderView = c44875u3M17674G3.f100948f) == null) {
            return;
        }
        assetV2MainHeaderView.m17699k(assetV2OverviewEntity);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17913a0 = z11;
    }

    public AssetV2MainFragment() {
        setPageId("B1mainAccount");
    }

    /* JADX INFO: renamed from: C3 */
    public static final /* synthetic */ UIState m17645C3(AssetV2MainFragment assetV2MainFragment) {
        return assetV2MainFragment.getState();
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m17648H3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m17649I3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m17650J3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m17657Q3(AssetV2MainFragment assetV2MainFragment, Boolean bool) {
        assetV2MainFragment.m17673F3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m17658R3(AssetV2MainFragment assetV2MainFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44875u3 c44875u3M17674G3 = assetV2MainFragment.m17674G3();
        if (c44875u3M17674G3 != null && (kuCoinRefreshLayout = c44875u3M17674G3.f100951i) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        assetV2MainFragment.lazyLoad();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        CoordinatorLayout coordinatorLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        AssetSearchView assetSearchView2;
        KuCheckBox kuCheckBox;
        DashTextView dashTextView;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AssetSearchView assetSearchView3;
        ClearEditText etSearchView2;
        AssetV2MainHeaderView assetV2MainHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        AssetV2MainHeaderView assetV2MainHeaderView2;
        C44875u3 c44875u3M17674G3 = m17674G3();
        RecyclerView recyclerView3 = null;
        if (c44875u3M17674G3 != null) {
            coordinatorLayout = c44875u3M17674G3.f100947e;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f17910X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44875u3 c44875u3M17674G4 = m17674G3();
        if (c44875u3M17674G4 != null && (assetV2MainHeaderView2 = c44875u3M17674G4.f100948f) != null) {
            assetV2MainHeaderView2.m17698j(this);
        }
        C44875u3 c44875u3M17674G5 = m17674G3();
        if (c44875u3M17674G5 != null && (assetV2MainHeaderView = c44875u3M17674G5.f100948f) != null && (accountInfoHeader = assetV2MainHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.main.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetV2MainFragment.m17652L3(this.f17959b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44875u3 c44875u3M17674G6 = m17674G3();
        if (c44875u3M17674G6 != null && (assetSearchView3 = c44875u3M17674G6.f100950h) != null && (etSearchView2 = assetSearchView3.getEtSearchView()) != null) {
            etSearchView2.m54480h(C5275i0.m6236a(12.0f));
        }
        C44875u3 c44875u3M17674G7 = m17674G3();
        if (c44875u3M17674G7 != null && (recyclerView2 = c44875u3M17674G7.f100949g) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()) { // from class: com.kubi.assets.main.AssetV2MainFragment.initView.2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public int scrollVerticallyBy(int dy2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    C44875u3 c44875u3M17674G8;
                    AssetSearchView assetSearchView4;
                    ClearEditText etSearchView3;
                    if (Math.abs(dy2) > 20 && (c44875u3M17674G8 = AssetV2MainFragment.this.m17674G3()) != null && (assetSearchView4 = c44875u3M17674G8.f100950h) != null && (etSearchView3 = assetSearchView4.getEtSearchView()) != null) {
                        KeyboardUtils.m6034f(etSearchView3);
                    }
                    return super.scrollVerticallyBy(dy2, recycler, state);
                }
            });
        }
        C44875u3 c44875u3M17674G8 = m17674G3();
        if (c44875u3M17674G8 != null && (recyclerView = c44875u3M17674G8.f100949g) != null) {
            recyclerView.setAdapter(m17673F3());
        }
        AssetV2MainAdapter assetV2MainAdapterM17673F3 = m17673F3();
        int i11 = R$layout.view_empty;
        C44875u3 c44875u3M17674G9 = m17674G3();
        if (c44875u3M17674G9 != null) {
            recyclerView3 = c44875u3M17674G9.f100949g;
        }
        assetV2MainAdapterM17673F3.setEmptyView(i11, recyclerView3);
        C44875u3 c44875u3M17674G10 = m17674G3();
        if (c44875u3M17674G10 != null && (kuCoinRefreshLayout = c44875u3M17674G10.f100951i) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.main.i
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetV2MainFragment.m17653M3(this.f17961b, interfaceC38162f);
                }
            });
        }
        C44875u3 c44875u3M17674G11 = m17674G3();
        if (c44875u3M17674G11 != null && (dashTextView = c44875u3M17674G11.f100946d) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.main.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainFragment.m17654N3(this.f17963b);
                }
            }, 1, null);
        }
        C44875u3 c44875u3M17674G12 = m17674G3();
        if (c44875u3M17674G12 != null && (kuCheckBox = c44875u3M17674G12.f100945c) != null) {
            kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.main.k
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetV2MainFragment.m17655O3(this.f17965b, compoundButton, z11);
                }
            });
        }
        C44875u3 c44875u3M17674G13 = m17674G3();
        if (c44875u3M17674G13 != null && (assetSearchView2 = c44875u3M17674G13.f100950h) != null) {
            assetSearchView2.setShowInputCallBack(new Action() { // from class: com.kubi.assets.main.l
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2MainFragment.m17656P3();
                }
            });
        }
        C44875u3 c44875u3M17674G14 = m17674G3();
        if (c44875u3M17674G14 != null && (assetSearchView = c44875u3M17674G14.f100950h) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
            etSearchView.addTextChangedListener(new C10295a());
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.main.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2MainFragment.m17657Q3(this.f17966b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.main.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2MainFragment.m17648H3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.main.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2MainFragment.m17649I3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.main.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2MainFragment.m17650J3(function2, obj);
            }
        }));
        C44875u3 c44875u3M17674G15 = m17674G3();
        if (c44875u3M17674G15 != null && (baseTextView2 = c44875u3M17674G15.f100953k) != null) {
            AssetExKt.m15138z(baseTextView2, C24129b.m58030b(SiteVisibleConfigKey.MarginKcsConvert));
        }
        C44875u3 c44875u3M17674G16 = m17674G3();
        if (c44875u3M17674G16 != null && (baseTextView = c44875u3M17674G16.f100953k) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.main.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainFragment.m17651K3(this.f17954b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerView;
        AppBarLayout appBarLayout;
        C44875u3 c44875u3M17674G3 = m17674G3();
        if (c44875u3M17674G3 != null && (recyclerView = c44875u3M17674G3.f100949g) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44875u3 c44875u3M17674G4 = m17674G3();
            if (c44875u3M17674G4 != null) {
                appBarLayout = c44875u3M17674G4.f100944b;
            } else {
                appBarLayout = null;
            }
            assetsHelper.m19174t(recyclerView, appBarLayout, new Action() { // from class: com.kubi.assets.main.g
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2MainFragment.m17658R3(this.f17957b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43841b.m96557d("B1mainAccount_account_detail_load", "page_load_start", null, 4, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        AssetV2OverviewEntity assetV2OverviewEntity;
        AssetV2MainHeaderView assetV2MainHeaderView;
        super.onViewHideOrShowToggle(show);
        if (show && getContext() != null && (assetV2OverviewEntity = this.f17909W) != null) {
            sendIntent(new AssetV2MainContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
            C44875u3 c44875u3M17674G3 = m17674G3();
            if (c44875u3M17674G3 != null && (assetV2MainHeaderView = c44875u3M17674G3.f100948f) != null) {
                assetV2MainHeaderView.m17699k(assetV2OverviewEntity);
            }
        }
    }
}
