package com.kubi.assets.margin.isolated;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$layout;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.assets.margin.AssetV2MarginFragment;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.data.coin.AccountType;
import com.kubi.event.api.C12572a;
import com.kubi.margin.api.entity.MarginPosition;
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
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import hb0.InterfaceC38162f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;
import jb0.InterfaceC40373g;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41016c;
import p569qq.C43852m;
import p637ta.C44868t3;
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

/* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u00014B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0015J\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001aJ\b\u0010&\u001a\u00020\"H\u0016J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u001aH\u0014J\b\u0010)\u001a\u00020\"H\u0015J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0014J\u0012\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010/\u001a\u00020\"H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u0004018TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2IsolatedAccountBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2IsolatedAccountBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "adapter", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedAdapter;", "getAdapter", "()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "", "initView", "", "loadData", "updateCrossTabVisibility", ViewProps.HIDDEN, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onViewHideOrShowToggle", TIMPushProvider.f75062n, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onAssetsGet", "myAssetEntity", "onRefresh", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2IsolatedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2IsolatedFragment.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n147#2,16:225\n49#3:241\n65#3,16:242\n93#3,3:258\n135#4,2:261\n1#5:263\n*S KotlinDebug\n*F\n+ 1 AssetV2IsolatedFragment.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedFragment\n*L\n56#1:225,16\n109#1:241\n109#1:242,16\n109#1:258,3\n146#1:261,2\n*E\n"})
public final class AssetV2IsolatedFragment extends BaseStateFragment<AssetV2IsolatedContract$UiIntent, UIState, AssetV2IsolatedViewModel> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: V */
    @Nullable
    public WrapperLoadingView f18039V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public AssetV2OverviewEntity f18040W;

    /* JADX INFO: renamed from: Y */
    public boolean f18042Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f18037a0 = {Reflection.property1(new PropertyReference1Impl(AssetV2IsolatedFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2IsolatedAccountBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f18036Z = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18038U = C45681e.m100799e(this, new Function1<AssetV2IsolatedFragment, C44868t3>() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44868t3 invoke(@NotNull AssetV2IsolatedFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44868t3.m99260a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44868t3, Unit>() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44868t3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44868t3 c44868t3) {
            invoke(c44868t3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18041X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.isolated.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2IsolatedFragment.m17911B3(this.f18055b);
        }
    });

    /* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetV2IsolatedFragment newInstance() {
            return new AssetV2IsolatedFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AssetV2IsolatedFragment.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedFragment\n*L\n1#1,97:1\n78#2:98\n71#3:99\n110#4,5:100\n*E\n"})
    public static final class C10441a implements TextWatcher {
        public C10441a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            KuCheckBox kuCheckBox;
            AssetV2IsolatedFragment assetV2IsolatedFragment = AssetV2IsolatedFragment.this;
            C44868t3 c44868t3M17938D3 = assetV2IsolatedFragment.m17938D3();
            assetV2IsolatedFragment.sendIntent(new AssetV2IsolatedContract$UiIntent.HideSmallOrFilter(C27025c.m66566d((c44868t3M17938D3 == null || (kuCheckBox = c44868t3M17938D3.f100879c) == null) ? null : Boolean.valueOf(kuCheckBox.isChecked())), StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/MarginPnlEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$10", m90122f = "AssetV2IsolatedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1044310 extends SuspendLambda implements Function2<MarginPnlEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MarginPnlEntity marginPnlEntity, Continuation<? super Unit> continuation) {
            return ((C1044310) create(marginPnlEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1044310(Continuation<? super C1044310> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1044310 c1044310 = AssetV2IsolatedFragment.this.new C1044310(continuation);
            c1044310.L$0 = obj;
            return c1044310;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C44868t3 c44868t3M17938D3;
            AssetV2IsolatedHeaderView assetV2IsolatedHeaderView;
            MarginPnlHeaderView pnlViewHeader;
            MarginPnlEntity marginPnlEntity = (MarginPnlEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (marginPnlEntity != null && (c44868t3M17938D3 = AssetV2IsolatedFragment.this.m17938D3()) != null && (assetV2IsolatedHeaderView = c44868t3M17938D3.f100882f) != null && (pnlViewHeader = assetV2IsolatedHeaderView.getPnlViewHeader()) != null) {
                pnlViewHeader.m18050e(marginPnlEntity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$2", m90122f = "AssetV2IsolatedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C104442 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C104442(Continuation<? super C104442> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104442 c104442 = AssetV2IsolatedFragment.this.new C104442(continuation);
            c104442.Z$0 = ((Boolean) obj).booleanValue();
            return c104442;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C104442) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
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
            C44868t3 c44868t3M17938D3 = AssetV2IsolatedFragment.this.m17938D3();
            if (((c44868t3M17938D3 == null || (kuCheckBox3 = c44868t3M17938D3.f100879c) == null) ? null : kuCheckBox3.getTag()) == null) {
                C44868t3 c44868t3M17938D4 = AssetV2IsolatedFragment.this.m17938D3();
                if (c44868t3M17938D4 != null && (kuCheckBox2 = c44868t3M17938D4.f100879c) != null) {
                    kuCheckBox2.setTag(Boxing.boxBoolean(true));
                }
                C44868t3 c44868t3M17938D5 = AssetV2IsolatedFragment.this.m17938D3();
                if (c44868t3M17938D5 != null && (kuCheckBox = c44868t3M17938D5.f100879c) != null) {
                    kuCheckBox.setChecked(z11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/margin/api/entity/MarginPosition;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$4", m90122f = "AssetV2IsolatedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C104464 extends SuspendLambda implements Function2<List<? extends MarginPosition>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarginPosition> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarginPosition>) list, continuation);
        }

        public C104464(Continuation<? super C104464> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104464 c104464 = AssetV2IsolatedFragment.this.new C104464(continuation);
            c104464.L$0 = obj;
            return c104464;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarginPosition> list, Continuation<? super Unit> continuation) {
            return ((C104464) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetV2IsolatedFragment.this.m17937C3().replaceData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/margin/api/entity/MarginPosition;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$6", m90122f = "AssetV2IsolatedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C104486 extends SuspendLambda implements Function2<List<? extends MarginPosition>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarginPosition> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarginPosition>) list, continuation);
        }

        public C104486(Continuation<? super C104486> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104486 c104486 = AssetV2IsolatedFragment.this.new C104486(continuation);
            c104486.L$0 = obj;
            return c104486;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarginPosition> list, Continuation<? super Unit> continuation) {
            return ((C104486) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetSearchView assetSearchView;
            ClearEditText etSearchView;
            KuCheckBox kuCheckBox;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                AssetV2IsolatedFragment assetV2IsolatedFragment = AssetV2IsolatedFragment.this;
                C44868t3 c44868t3M17938D3 = assetV2IsolatedFragment.m17938D3();
                Editable text = null;
                boolean zM66566d = C27025c.m66566d((c44868t3M17938D3 == null || (kuCheckBox = c44868t3M17938D3.f100879c) == null) ? null : Boxing.boxBoolean(kuCheckBox.isChecked()));
                C44868t3 c44868t3M17938D4 = assetV2IsolatedFragment.m17938D3();
                if (c44868t3M17938D4 != null && (assetSearchView = c44868t3M17938D4.f100884h) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                    text = etSearchView.getText();
                }
                assetV2IsolatedFragment.sendIntent(new AssetV2IsolatedContract$UiIntent.HideSmallOrFilter(zM66566d, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetV2IsolatedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedFragment$bindState$8", m90122f = "AssetV2IsolatedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C104508 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C104508(Continuation<? super C104508> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104508 c104508 = AssetV2IsolatedFragment.this.new C104508(continuation);
            c104508.Z$0 = ((Boolean) obj).booleanValue();
            return c104508;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C104508) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2IsolatedHeaderView assetV2IsolatedHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44868t3 c44868t3M17938D3 = AssetV2IsolatedFragment.this.m17938D3();
            ShowHideTextView.m54778d(c44868t3M17938D3 != null ? c44868t3M17938D3.f100882f : null, z11);
            C44868t3 c44868t3M17938D4 = AssetV2IsolatedFragment.this.m17938D3();
            if (c44868t3M17938D4 != null && (assetV2IsolatedHeaderView = c44868t3M17938D4.f100882f) != null && (accountInfoHeader = assetV2IsolatedHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AssetV2IsolatedFragment.this.m17937C3().m17909j(z11);
            AssetV2IsolatedFragment.this.m17937C3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final AssetV2IsolatedAdapter m17911B3(AssetV2IsolatedFragment assetV2IsolatedFragment) {
        return new AssetV2IsolatedAdapter(assetV2IsolatedFragment);
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m17914G3(AssetV2IsolatedFragment assetV2IsolatedFragment) {
        IAssetsCenterService.f16464a.get().mo15348n(assetV2IsolatedFragment.getContext(), AccountType.LEVER);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m17915H3(AssetV2IsolatedFragment assetV2IsolatedFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetV2IsolatedFragment.sendIntent(new AssetV2IsolatedContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m17916I3(AssetV2IsolatedFragment assetV2IsolatedFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetV2IsolatedFragment.m17939O3();
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m17917J3() {
        C43852m.m96591c("B4isolatedMarginAccount", FirebaseAnalytics.Event.SEARCH, null, null, 12, null);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m17918K3(AssetV2IsolatedFragment assetV2IsolatedFragment) {
        AssetsHelper.f18684a.m19176x(assetV2IsolatedFragment, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m17919L3(AssetV2IsolatedFragment assetV2IsolatedFragment, CompoundButton compoundButton, boolean z11) {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        C44868t3 c44868t3M17938D3 = assetV2IsolatedFragment.m17938D3();
        assetV2IsolatedFragment.sendIntent(new AssetV2IsolatedContract$UiIntent.HideSmallOrFilter(z11, StringsKt.trim((CharSequence) String.valueOf((c44868t3M17938D3 == null || (assetSearchView = c44868t3M17938D3.f100884h) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) ? null : etSearchView.getText())).toString(), true));
        C43852m.m96591c("B4isolatedMarginAccount", "hideSmallBalances", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: C3 */
    public final AssetV2IsolatedAdapter m17937C3() {
        return (AssetV2IsolatedAdapter) this.f18041X.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final C44868t3 m17938D3() {
        return (C44868t3) this.f18038U.getValue(this, f18037a0[0]);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m17939O3() {
        if (AssetsDepend.f18689a.m19189j().d0().isHasOpenLever() && isShowing()) {
            C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
            sendIntent(AssetV2IsolatedContract$UiIntent.FetchIsolatedAssetsList.INSTANCE);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideSmallSwitch());
            }
        }, new C104442(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiIsolatedAssetsShowList();
            }
        }, new C104464(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getIsolatedAssetsSourceList();
            }
        }, new C104486(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C104508(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getMarginPnlEntity();
            }
        }, new C1044310(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof SingleEvent.C19247c) {
            C44868t3 c44868t3M17938D3 = m17938D3();
            if (c44868t3M17938D3 != null && (kuCoinRefreshLayout = c44868t3M17938D3.f100885i) != null) {
                kuCoinRefreshLayout.setRefreshing(false);
            }
            WrapperLoadingView wrapperLoadingView = this.f18039V;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_assetv2_isolated_account;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34289W() {
        return this.f18042Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetV2IsolatedViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetV2IsolatedViewModel.class);
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        C44868t3 c44868t3M17938D3;
        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView;
        this.f18040W = assetV2OverviewEntity;
        if (getContext() != null && isShowing() && AssetsDepend.f18689a.m19189j().d0().isHasOpenLever()) {
            if (assetV2OverviewEntity != null && (c44868t3M17938D3 = m17938D3()) != null && (assetV2IsolatedHeaderView = c44868t3M17938D3.f100882f) != null) {
                assetV2IsolatedHeaderView.m17960k(assetV2OverviewEntity);
            }
            sendIntent(AssetV2IsolatedContract$UiIntent.FetchMarginPnl.INSTANCE);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18042Y = z11;
    }

    public AssetV2IsolatedFragment() {
        setPageId("B4isolatedMarginAccount");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final Unit m17912E3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final void m17913F3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m17920M3(AssetV2IsolatedFragment assetV2IsolatedFragment, Boolean bool) {
        assetV2IsolatedFragment.m17937C3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final void m17921N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m17922P3(AssetV2IsolatedFragment assetV2IsolatedFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44868t3 c44868t3M17938D3 = assetV2IsolatedFragment.m17938D3();
        if (c44868t3M17938D3 != null && (kuCoinRefreshLayout = c44868t3M17938D3.f100885i) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        assetV2IsolatedFragment.m17939O3();
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m17940Q3(boolean z11) {
        C44868t3 c44868t3M17938D3;
        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView;
        if (isAdded() && getView() != null && (c44868t3M17938D3 = m17938D3()) != null && (assetV2IsolatedHeaderView = c44868t3M17938D3.f100882f) != null) {
            assetV2IsolatedHeaderView.m17962v(z11);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        CoordinatorLayout coordinatorLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        KuCheckBox kuCheckBox;
        DashTextView dashTextView;
        AssetSearchView assetSearchView2;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AssetSearchView assetSearchView3;
        ClearEditText etSearchView2;
        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView2;
        C44868t3 c44868t3M17938D3 = m17938D3();
        RecyclerView recyclerView3 = null;
        if (c44868t3M17938D3 != null) {
            coordinatorLayout = c44868t3M17938D3.f100881e;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f18039V = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44868t3 c44868t3M17938D4 = m17938D3();
        if (c44868t3M17938D4 != null && (assetV2IsolatedHeaderView2 = c44868t3M17938D4.f100882f) != null) {
            assetV2IsolatedHeaderView2.m17959j(this);
        }
        C44868t3 c44868t3M17938D5 = m17938D3();
        if (c44868t3M17938D5 != null && (assetV2IsolatedHeaderView = c44868t3M17938D5.f100882f) != null && (accountInfoHeader = assetV2IsolatedHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.margin.isolated.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetV2IsolatedFragment.m17915H3(this.f18085b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44868t3 c44868t3M17938D6 = m17938D3();
        if (c44868t3M17938D6 != null && (assetSearchView3 = c44868t3M17938D6.f100884h) != null && (etSearchView2 = assetSearchView3.getEtSearchView()) != null) {
            etSearchView2.m54480h(C5275i0.m6236a(12.0f));
        }
        C44868t3 c44868t3M17938D7 = m17938D3();
        if (c44868t3M17938D7 != null && (recyclerView2 = c44868t3M17938D7.f100883g) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()) { // from class: com.kubi.assets.margin.isolated.AssetV2IsolatedFragment.initView.2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public int scrollVerticallyBy(int dy2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    C44868t3 c44868t3M17938D8;
                    AssetSearchView assetSearchView4;
                    ClearEditText etSearchView3;
                    if (Math.abs(dy2) > 20 && (c44868t3M17938D8 = AssetV2IsolatedFragment.this.m17938D3()) != null && (assetSearchView4 = c44868t3M17938D8.f100884h) != null && (etSearchView3 = assetSearchView4.getEtSearchView()) != null) {
                        KeyboardUtils.m6034f(etSearchView3);
                    }
                    return super.scrollVerticallyBy(dy2, recycler, state);
                }
            });
        }
        C44868t3 c44868t3M17938D8 = m17938D3();
        if (c44868t3M17938D8 != null && (recyclerView = c44868t3M17938D8.f100883g) != null) {
            recyclerView.setAdapter(m17937C3());
        }
        AssetV2IsolatedAdapter assetV2IsolatedAdapterM17937C3 = m17937C3();
        int i11 = R$layout.view_empty;
        C44868t3 c44868t3M17938D9 = m17938D3();
        if (c44868t3M17938D9 != null) {
            recyclerView3 = c44868t3M17938D9.f100883g;
        }
        assetV2IsolatedAdapterM17937C3.setEmptyView(i11, recyclerView3);
        C44868t3 c44868t3M17938D10 = m17938D3();
        if (c44868t3M17938D10 != null && (kuCoinRefreshLayout = c44868t3M17938D10.f100885i) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.margin.isolated.f
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetV2IsolatedFragment.m17916I3(this.f18087b, interfaceC38162f);
                }
            });
        }
        C44868t3 c44868t3M17938D11 = m17938D3();
        if (c44868t3M17938D11 != null && (assetSearchView2 = c44868t3M17938D11.f100884h) != null) {
            assetSearchView2.setShowInputCallBack(new Action() { // from class: com.kubi.assets.margin.isolated.g
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2IsolatedFragment.m17917J3();
                }
            });
        }
        C44868t3 c44868t3M17938D12 = m17938D3();
        if (c44868t3M17938D12 != null && (dashTextView = c44868t3M17938D12.f100880d) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedFragment.m17918K3(this.f18090b);
                }
            }, 1, null);
        }
        C44868t3 c44868t3M17938D13 = m17938D3();
        if (c44868t3M17938D13 != null && (kuCheckBox = c44868t3M17938D13.f100879c) != null) {
            kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.margin.isolated.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetV2IsolatedFragment.m17919L3(this.f18092b, compoundButton, z11);
                }
            });
        }
        C44868t3 c44868t3M17938D14 = m17938D3();
        if (c44868t3M17938D14 != null && (assetSearchView = c44868t3M17938D14.f100884h) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
            etSearchView.addTextChangedListener(new C10441a());
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.isolated.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2IsolatedFragment.m17920M3(this.f18094b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.margin.isolated.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2IsolatedFragment.m17921N3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.margin.isolated.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2IsolatedFragment.m17912E3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.margin.isolated.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2IsolatedFragment.m17913F3(function2, obj);
            }
        }));
        C44868t3 c44868t3M17938D15 = m17938D3();
        if (c44868t3M17938D15 != null && (baseTextView2 = c44868t3M17938D15.f100886j) != null) {
            AssetExKt.m15138z(baseTextView2, C24129b.m58030b(SiteVisibleConfigKey.MarginKcsConvert));
        }
        C44868t3 c44868t3M17938D16 = m17938D3();
        if (c44868t3M17938D16 != null && (baseTextView = c44868t3M17938D16.f100886j) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2IsolatedFragment.m17914G3(this.f18058b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        C44868t3 c44868t3M17938D3;
        RecyclerView recyclerView;
        AppBarLayout appBarLayout;
        if (isShowing() && (c44868t3M17938D3 = m17938D3()) != null && (recyclerView = c44868t3M17938D3.f100883g) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44868t3 c44868t3M17938D4 = m17938D3();
            if (c44868t3M17938D4 != null) {
                appBarLayout = c44868t3M17938D4.f100878b;
            } else {
                appBarLayout = null;
            }
            assetsHelper.m19174t(recyclerView, appBarLayout, new Action() { // from class: com.kubi.assets.margin.isolated.d
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2IsolatedFragment.m17922P3(this.f18059b);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        AssetV2MarginFragment assetV2MarginFragment;
        boolean z11;
        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView;
        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView2;
        if (getContext() != null && isShowing()) {
            super.onShow();
            m17939O3();
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof AssetV2MarginFragment) {
                assetV2MarginFragment = (AssetV2MarginFragment) parentFragment;
            } else {
                assetV2MarginFragment = null;
            }
            if (assetV2MarginFragment != null) {
                z11 = true;
                if (!assetV2MarginFragment.getF17983Z()) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            C44868t3 c44868t3M17938D3 = m17938D3();
            if (c44868t3M17938D3 != null && (assetV2IsolatedHeaderView2 = c44868t3M17938D3.f100882f) != null) {
                assetV2IsolatedHeaderView2.m17962v(z11);
            }
            AssetV2OverviewEntity assetV2OverviewEntity = this.f18040W;
            if (assetV2OverviewEntity != null) {
                sendIntent(new AssetV2IsolatedContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
                C44868t3 c44868t3M17938D4 = m17938D3();
                if (c44868t3M17938D4 != null && (assetV2IsolatedHeaderView = c44868t3M17938D4.f100882f) != null) {
                    assetV2IsolatedHeaderView.m17960k(assetV2OverviewEntity);
                }
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        super.onViewHideOrShowToggle(show);
        if (show) {
            sendIntent(AssetV2IsolatedContract$UiIntent.FetchMarginPnl.INSTANCE);
        }
    }
}
