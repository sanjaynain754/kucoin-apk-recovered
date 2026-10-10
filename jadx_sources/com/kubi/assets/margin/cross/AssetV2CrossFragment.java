package com.kubi.assets.margin.cross;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$layout;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.data.coin.AccountType;
import com.kubi.event.api.C12572a;
import com.kubi.margin.api.entity.FundsInfo;
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
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import hb0.InterfaceC38162f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb0.InterfaceC40373g;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41016c;
import p569qq.C43852m;
import p637ta.C44861s3;
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

/* JADX INFO: compiled from: AssetV2CrossFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u00014B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0015J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001aH\u0014J\b\u0010'\u001a\u00020\"H\u0015J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0014J\u0012\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010-\u001a\u00020\"H\u0016J\b\u0010.\u001a\u0004\u0018\u00010/R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u0004018TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UIState;", "Lcom/kubi/assets/margin/cross/AssetV2CrossViewModel;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2CrossAccountBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2CrossAccountBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "adapter", "Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;", "getAdapter", "()Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "", "initView", "", "loadData", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onViewHideOrShowToggle", TIMPushProvider.f75062n, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onAssetsGet", "myAssetEntity", "onRefresh", "getLiabilityCurrency", "", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2CrossFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2CrossFragment.kt\ncom/kubi/assets/margin/cross/AssetV2CrossFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n147#2,16:223\n49#3:239\n65#3,16:240\n93#3,3:256\n135#4,2:259\n1#5:261\n*S KotlinDebug\n*F\n+ 1 AssetV2CrossFragment.kt\ncom/kubi/assets/margin/cross/AssetV2CrossFragment\n*L\n60#1:223,16\n109#1:239\n109#1:240,16\n109#1:256,3\n138#1:259,2\n*E\n"})
public final class AssetV2CrossFragment extends BaseStateFragment<AssetV2CrossContract$UiIntent, UIState, AssetV2CrossViewModel> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17989U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public WrapperLoadingView f17990V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17991W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public AssetV2OverviewEntity f17992X;

    /* JADX INFO: renamed from: Y */
    public boolean f17993Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f17988a0 = {Reflection.property1(new PropertyReference1Impl(AssetV2CrossFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2CrossAccountBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f17987Z = new Companion(null);

    /* JADX INFO: compiled from: AssetV2CrossFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetV2CrossFragment newInstance() {
            return new AssetV2CrossFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AssetV2CrossFragment.kt\ncom/kubi/assets/margin/cross/AssetV2CrossFragment\n*L\n1#1,97:1\n78#2:98\n71#3:99\n110#4,5:100\n*E\n"})
    public static final class C10378a implements TextWatcher {
        public C10378a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            KuCheckBox kuCheckBox;
            AssetV2CrossFragment assetV2CrossFragment = AssetV2CrossFragment.this;
            C44861s3 c44861s3M17834D3 = assetV2CrossFragment.m17834D3();
            assetV2CrossFragment.sendIntent(new AssetV2CrossContract$UiIntent.HideSmallOrFilter(C27025c.m66566d((c44861s3M17834D3 == null || (kuCheckBox = c44861s3M17834D3.f100787c) == null) ? null : Boolean.valueOf(kuCheckBox.isChecked())), StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetV2CrossFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/MarginPnlEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$10", m90122f = "AssetV2CrossFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1038010 extends SuspendLambda implements Function2<MarginPnlEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MarginPnlEntity marginPnlEntity, Continuation<? super Unit> continuation) {
            return ((C1038010) create(marginPnlEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1038010(Continuation<? super C1038010> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1038010 c1038010 = AssetV2CrossFragment.this.new C1038010(continuation);
            c1038010.L$0 = obj;
            return c1038010;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C44861s3 c44861s3M17834D3;
            AssetV2CrossHeaderView assetV2CrossHeaderView;
            MarginPnlHeaderView pnlViewHeader;
            MarginPnlEntity marginPnlEntity = (MarginPnlEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (marginPnlEntity != null && (c44861s3M17834D3 = AssetV2CrossFragment.this.m17834D3()) != null && (assetV2CrossHeaderView = c44861s3M17834D3.f100790f) != null && (pnlViewHeader = assetV2CrossHeaderView.getPnlViewHeader()) != null) {
                pnlViewHeader.m18050e(marginPnlEntity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetV2CrossFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$2", m90122f = "AssetV2CrossFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103812 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C103812(Continuation<? super C103812> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103812 c103812 = AssetV2CrossFragment.this.new C103812(continuation);
            c103812.Z$0 = ((Boolean) obj).booleanValue();
            return c103812;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C103812) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
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
            C44861s3 c44861s3M17834D3 = AssetV2CrossFragment.this.m17834D3();
            if (((c44861s3M17834D3 == null || (kuCheckBox3 = c44861s3M17834D3.f100787c) == null) ? null : kuCheckBox3.getTag()) == null) {
                C44861s3 c44861s3M17834D4 = AssetV2CrossFragment.this.m17834D3();
                if (c44861s3M17834D4 != null && (kuCheckBox2 = c44861s3M17834D4.f100787c) != null) {
                    kuCheckBox2.setTag(Boxing.boxBoolean(true));
                }
                C44861s3 c44861s3M17834D5 = AssetV2CrossFragment.this.m17834D3();
                if (c44861s3M17834D5 != null && (kuCheckBox = c44861s3M17834D5.f100787c) != null) {
                    kuCheckBox.setChecked(z11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetV2CrossFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/margin/api/entity/FundsInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$4", m90122f = "AssetV2CrossFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103834 extends SuspendLambda implements Function2<List<? extends FundsInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends FundsInfo> list, Continuation<? super Unit> continuation) {
            return invoke2((List<FundsInfo>) list, continuation);
        }

        public C103834(Continuation<? super C103834> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103834 c103834 = AssetV2CrossFragment.this.new C103834(continuation);
            c103834.L$0 = obj;
            return c103834;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<FundsInfo> list, Continuation<? super Unit> continuation) {
            return ((C103834) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetV2CrossFragment.this.m17833C3().replaceData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetV2CrossFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/margin/api/entity/FundsInfo;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$6", m90122f = "AssetV2CrossFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103856 extends SuspendLambda implements Function2<ArrayList<FundsInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C103856(Continuation<? super C103856> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103856 c103856 = AssetV2CrossFragment.this.new C103856(continuation);
            c103856.L$0 = obj;
            return c103856;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<FundsInfo> arrayList, Continuation<? super Unit> continuation) {
            return ((C103856) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetV2CrossFragment assetV2CrossFragment = AssetV2CrossFragment.this;
                C44861s3 c44861s3M17834D3 = assetV2CrossFragment.m17834D3();
                Editable text = null;
                boolean zM66566d = C27025c.m66566d((c44861s3M17834D3 == null || (kuCheckBox = c44861s3M17834D3.f100787c) == null) ? null : Boxing.boxBoolean(kuCheckBox.isChecked()));
                C44861s3 c44861s3M17834D4 = assetV2CrossFragment.m17834D3();
                if (c44861s3M17834D4 != null && (assetSearchView = c44861s3M17834D4.f100792h) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                    text = etSearchView.getText();
                }
                assetV2CrossFragment.sendIntent(new AssetV2CrossContract$UiIntent.HideSmallOrFilter(zM66566d, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetV2CrossFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossFragment$bindState$8", m90122f = "AssetV2CrossFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103878 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C103878(Continuation<? super C103878> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103878 c103878 = AssetV2CrossFragment.this.new C103878(continuation);
            c103878.Z$0 = ((Boolean) obj).booleanValue();
            return c103878;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C103878) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2CrossHeaderView assetV2CrossHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44861s3 c44861s3M17834D3 = AssetV2CrossFragment.this.m17834D3();
            ShowHideTextView.m54778d(c44861s3M17834D3 != null ? c44861s3M17834D3.f100790f : null, z11);
            C44861s3 c44861s3M17834D4 = AssetV2CrossFragment.this.m17834D3();
            if (c44861s3M17834D4 != null && (assetV2CrossHeaderView = c44861s3M17834D4.f100790f) != null && (accountInfoHeader = assetV2CrossHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AssetV2CrossFragment.this.m17833C3().m17805j(z11);
            AssetV2CrossFragment.this.m17833C3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final AssetV2CrossAdapter m17807B3(AssetV2CrossFragment assetV2CrossFragment) {
        return new AssetV2CrossAdapter(assetV2CrossFragment);
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m17810H3(AssetV2CrossFragment assetV2CrossFragment) {
        IAssetsCenterService.f16464a.get().mo15348n(assetV2CrossFragment.getContext(), AccountType.LEVER);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m17811I3(AssetV2CrossFragment assetV2CrossFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetV2CrossFragment.sendIntent(new AssetV2CrossContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m17812J3() {
        C43852m.m96591c("B4crossMarginAccount", FirebaseAnalytics.Event.SEARCH, null, null, 12, null);
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m17813K3(AssetV2CrossFragment assetV2CrossFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetV2CrossFragment.m17836P3();
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m17814L3(AssetV2CrossFragment assetV2CrossFragment) {
        AssetsHelper.f18684a.m19176x(assetV2CrossFragment, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m17815M3(AssetV2CrossFragment assetV2CrossFragment, CompoundButton compoundButton, boolean z11) {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        C44861s3 c44861s3M17834D3 = assetV2CrossFragment.m17834D3();
        assetV2CrossFragment.sendIntent(new AssetV2CrossContract$UiIntent.HideSmallOrFilter(z11, StringsKt.trim((CharSequence) String.valueOf((c44861s3M17834D3 == null || (assetSearchView = c44861s3M17834D3.f100792h) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) ? null : etSearchView.getText())).toString(), true));
        C43852m.m96591c("B4crossMarginAccount", "hideSmallBalances", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: C3 */
    public final AssetV2CrossAdapter m17833C3() {
        return (AssetV2CrossAdapter) this.f17991W.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final C44861s3 m17834D3() {
        return (C44861s3) this.f17989U.getValue(this, f17988a0[0]);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m17836P3() {
        if (AssetsDepend.f18689a.m19189j().d0().isHasOpenLever() && isShowing()) {
            C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
            sendIntent(AssetV2CrossContract$UiIntent.FetchCrossAssetsList.INSTANCE);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideSmallSwitch());
            }
        }, new C103812(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getUiCrossAssetsShowList();
            }
        }, new C103834(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCrossAssetsSourceList();
            }
        }, new C103856(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C103878(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getMarginPnlEntity();
            }
        }, new C1038010(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof SingleEvent.C19247c) {
            C44861s3 c44861s3M17834D3 = m17834D3();
            if (c44861s3M17834D3 != null && (kuCoinRefreshLayout = c44861s3M17834D3.f100793i) != null) {
                kuCoinRefreshLayout.setRefreshing(false);
            }
            WrapperLoadingView wrapperLoadingView = this.f17990V;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_assetv2_cross_account;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34284W() {
        return this.f17993Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetV2CrossViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetV2CrossViewModel.class);
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        C44861s3 c44861s3M17834D3;
        AssetV2CrossHeaderView assetV2CrossHeaderView;
        this.f17992X = assetV2OverviewEntity;
        if (getContext() != null && isShowing() && AssetsDepend.f18689a.m19189j().d0().isHasOpenLever()) {
            if (assetV2OverviewEntity != null && (c44861s3M17834D3 = m17834D3()) != null && (assetV2CrossHeaderView = c44861s3M17834D3.f100790f) != null) {
                assetV2CrossHeaderView.m17856k(assetV2OverviewEntity);
            }
            sendIntent(AssetV2CrossContract$UiIntent.FetchMarginPnl.INSTANCE);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17993Y = z11;
    }

    public AssetV2CrossFragment() {
        setPageId("B4crossMarginAccount");
        this.f17989U = C45681e.m100799e(this, new Function1<AssetV2CrossFragment, C44861s3>() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44861s3 invoke(@NotNull AssetV2CrossFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44861s3.m99246a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C44861s3, Unit>() { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C44861s3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44861s3 c44861s3) {
                invoke(c44861s3);
                return Unit.INSTANCE;
            }
        });
        this.f17991W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.cross.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2CrossFragment.m17807B3(this.f18019b);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m17808F3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final void m17809G3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m17816N3(AssetV2CrossFragment assetV2CrossFragment, Boolean bool) {
        assetV2CrossFragment.m17833C3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m17817O3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m17818Q3(AssetV2CrossFragment assetV2CrossFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44861s3 c44861s3M17834D3 = assetV2CrossFragment.m17834D3();
        if (c44861s3M17834D3 != null && (kuCoinRefreshLayout = c44861s3M17834D3.f100793i) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        assetV2CrossFragment.m17836P3();
    }

    @Nullable
    /* JADX INFO: renamed from: E3 */
    public final String m17835E3() {
        Object next;
        ArrayList<FundsInfo> crossAssetsSourceList = getState().getCrossAssetsSourceList();
        if (crossAssetsSourceList != null) {
            Iterator<T> it = crossAssetsSourceList.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (C27039d.m66647g(((FundsInfo) next).getLiability()) <= 0.0d);
            FundsInfo fundsInfo = (FundsInfo) next;
            if (fundsInfo != null) {
                return fundsInfo.getCurrency();
            }
        }
        return null;
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
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView;
        AssetSearchView assetSearchView2;
        RecyclerView recyclerView2;
        AssetSearchView assetSearchView3;
        ClearEditText etSearchView2;
        AssetV2CrossHeaderView assetV2CrossHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        AssetV2CrossHeaderView assetV2CrossHeaderView2;
        C44861s3 c44861s3M17834D3 = m17834D3();
        RecyclerView recyclerView3 = null;
        if (c44861s3M17834D3 != null) {
            coordinatorLayout = c44861s3M17834D3.f100789e;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f17990V = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44861s3 c44861s3M17834D4 = m17834D3();
        if (c44861s3M17834D4 != null && (assetV2CrossHeaderView2 = c44861s3M17834D4.f100790f) != null) {
            assetV2CrossHeaderView2.m17855j(this);
        }
        C44861s3 c44861s3M17834D5 = m17834D3();
        if (c44861s3M17834D5 != null && (assetV2CrossHeaderView = c44861s3M17834D5.f100790f) != null && (accountInfoHeader = assetV2CrossHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.margin.cross.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetV2CrossFragment.m17811I3(this.f18020b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44861s3 c44861s3M17834D6 = m17834D3();
        if (c44861s3M17834D6 != null && (assetSearchView3 = c44861s3M17834D6.f100792h) != null && (etSearchView2 = assetSearchView3.getEtSearchView()) != null) {
            etSearchView2.m54480h(C5275i0.m6236a(12.0f));
        }
        C44861s3 c44861s3M17834D7 = m17834D3();
        if (c44861s3M17834D7 != null && (recyclerView2 = c44861s3M17834D7.f100791g) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()) { // from class: com.kubi.assets.margin.cross.AssetV2CrossFragment.initView.2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public int scrollVerticallyBy(int dy2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    C44861s3 c44861s3M17834D8;
                    AssetSearchView assetSearchView4;
                    ClearEditText etSearchView3;
                    if (Math.abs(dy2) > 20 && (c44861s3M17834D8 = AssetV2CrossFragment.this.m17834D3()) != null && (assetSearchView4 = c44861s3M17834D8.f100792h) != null && (etSearchView3 = assetSearchView4.getEtSearchView()) != null) {
                        KeyboardUtils.m6034f(etSearchView3);
                    }
                    return super.scrollVerticallyBy(dy2, recycler, state);
                }
            });
        }
        C44861s3 c44861s3M17834D8 = m17834D3();
        if (c44861s3M17834D8 != null && (assetSearchView2 = c44861s3M17834D8.f100792h) != null) {
            assetSearchView2.setShowInputCallBack(new Action() { // from class: com.kubi.assets.margin.cross.g
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2CrossFragment.m17812J3();
                }
            });
        }
        C44861s3 c44861s3M17834D9 = m17834D3();
        if (c44861s3M17834D9 != null && (recyclerView = c44861s3M17834D9.f100791g) != null) {
            recyclerView.setAdapter(m17833C3());
        }
        AssetV2CrossAdapter assetV2CrossAdapterM17833C3 = m17833C3();
        int i11 = R$layout.view_empty;
        C44861s3 c44861s3M17834D10 = m17834D3();
        if (c44861s3M17834D10 != null) {
            recyclerView3 = c44861s3M17834D10.f100791g;
        }
        assetV2CrossAdapterM17833C3.setEmptyView(i11, recyclerView3);
        C44861s3 c44861s3M17834D11 = m17834D3();
        if (c44861s3M17834D11 != null && (kuCoinRefreshLayout = c44861s3M17834D11.f100793i) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.margin.cross.h
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetV2CrossFragment.m17813K3(this.f18021b, interfaceC38162f);
                }
            });
        }
        C44861s3 c44861s3M17834D12 = m17834D3();
        if (c44861s3M17834D12 != null && (dashTextView = c44861s3M17834D12.f100788d) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossFragment.m17814L3(this.f18022b);
                }
            }, 1, null);
        }
        C44861s3 c44861s3M17834D13 = m17834D3();
        if (c44861s3M17834D13 != null && (kuCheckBox = c44861s3M17834D13.f100787c) != null) {
            kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.margin.cross.j
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AssetV2CrossFragment.m17815M3(this.f18023b, compoundButton, z11);
                }
            });
        }
        C44861s3 c44861s3M17834D14 = m17834D3();
        if (c44861s3M17834D14 != null && (assetSearchView = c44861s3M17834D14.f100792h) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
            etSearchView.addTextChangedListener(new C10378a());
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.cross.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2CrossFragment.m17816N3(this.f18024b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.margin.cross.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2CrossFragment.m17817O3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.margin.cross.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2CrossFragment.m17808F3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.margin.cross.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2CrossFragment.m17809G3(function2, obj);
            }
        }));
        C44861s3 c44861s3M17834D15 = m17834D3();
        if (c44861s3M17834D15 != null && (baseTextView2 = c44861s3M17834D15.f100794j) != null) {
            AssetExKt.m15138z(baseTextView2, C24129b.m58030b(SiteVisibleConfigKey.MarginKcsConvert));
        }
        C44861s3 c44861s3M17834D16 = m17834D3();
        if (c44861s3M17834D16 != null && (baseTextView = c44861s3M17834D16.f100794j) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2CrossFragment.m17810H3(this.f18005b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        C44861s3 c44861s3M17834D3;
        RecyclerView recyclerView;
        AppBarLayout appBarLayout;
        if (isShowing() && (c44861s3M17834D3 = m17834D3()) != null && (recyclerView = c44861s3M17834D3.f100791g) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44861s3 c44861s3M17834D4 = m17834D3();
            if (c44861s3M17834D4 != null) {
                appBarLayout = c44861s3M17834D4.f100786b;
            } else {
                appBarLayout = null;
            }
            assetsHelper.m19174t(recyclerView, appBarLayout, new Action() { // from class: com.kubi.assets.margin.cross.b
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetV2CrossFragment.m17818Q3(this.f18002b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        AssetV2CrossHeaderView assetV2CrossHeaderView;
        if (getContext() != null && isShowing()) {
            super.onShow();
            m17836P3();
            AssetV2OverviewEntity assetV2OverviewEntity = this.f17992X;
            if (assetV2OverviewEntity != null) {
                sendIntent(new AssetV2CrossContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
                C44861s3 c44861s3M17834D3 = m17834D3();
                if (c44861s3M17834D3 != null && (assetV2CrossHeaderView = c44861s3M17834D3.f100790f) != null) {
                    assetV2CrossHeaderView.m17856k(assetV2OverviewEntity);
                }
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        super.onViewHideOrShowToggle(show);
        if (show) {
            sendIntent(AssetV2CrossContract$UiIntent.FetchMarginPnl.INSTANCE);
        }
    }
}
