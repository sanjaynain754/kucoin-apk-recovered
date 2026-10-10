package com.kubi.assets.alpha;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.dialog.AlphaNetworkDialog;
import com.kubi.assets.entity.AlphaAssetEntity;
import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.assets.entity.AlphaTopTokenInfo;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41016c;
import p569qq.C43841b;
import p637ta.C44809l0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AlphaFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0014J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J2\u0010%\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010'2\u0018\b\u0002\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u001c\u0018\u00010)H\u0002J\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010,\u001a\u00020\u001cH\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010-\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020/0.8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/alpha/AlphaContract$UIState;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentAlphaBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentAlphaBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/alpha/AlphaAssetAdapter;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "setNetworkTitleAndIcon", "it", "Lcom/kubi/assets/entity/AlphaChainInfo;", "showChainListDialog", "chainList", "", "onCloseCallback", "Lkotlin/Function1;", "onAssetsGet", "myAssetEntity", "onRefresh", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/assets/alpha/AlphaFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n147#2,16:257\n49#3:273\n65#3,16:274\n93#3,3:290\n135#4,2:293\n1563#5:295\n1634#5,3:296\n1#6:299\n*S KotlinDebug\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/assets/alpha/AlphaFragment\n*L\n58#1:257,16\n104#1:273\n104#1:274,16\n104#1:290,3\n127#1:293,2\n217#1:295\n217#1:296,3\n*E\n"})
public final class AlphaFragment extends SimpleStateFragment<UIState> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f16430U = C45681e.m100799e(this, new Function1<AlphaFragment, C44809l0>() { // from class: com.kubi.assets.alpha.AlphaFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44809l0 invoke(@NotNull AlphaFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44809l0.m99138a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44809l0, Unit>() { // from class: com.kubi.assets.alpha.AlphaFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44809l0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44809l0 c44809l0) {
            invoke(c44809l0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final AlphaAssetAdapter f16431V = new AlphaAssetAdapter();

    /* JADX INFO: renamed from: W */
    @Nullable
    public AssetV2OverviewEntity f16432W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f16433X;

    /* JADX INFO: renamed from: Y */
    public boolean f16434Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f16429a0 = {Reflection.property1(new PropertyReference1Impl(AlphaFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentAlphaBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f16428Z = new Companion(null);

    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/alpha/AlphaFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AlphaFragment newInstance() {
            return new AlphaFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AlphaFragment.kt\ncom/kubi/assets/alpha/AlphaFragment\n*L\n1#1,97:1\n78#2:98\n71#3:99\n105#4,4:100\n*E\n"})
    public static final class C9462a implements TextWatcher {
        public C9462a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            KuCheckBox kuCheckBox;
            AlphaFragment alphaFragment = AlphaFragment.this;
            C44809l0 c44809l0M15282E3 = alphaFragment.m15282E3();
            alphaFragment.sendIntent(new AlphaContract$UiIntent.HideSmallOrFilter(C27025c.m66566d((c44809l0M15282E3 == null || (kuCheckBox = c44809l0M15282E3.f100337d) == null) ? null : Boolean.valueOf(kuCheckBox.isChecked())), StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaFragment$bindState$2 */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/AlphaAssetEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaFragment$bindState$2", m90122f = "AlphaFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C94642 extends SuspendLambda implements Function2<List<? extends AlphaAssetEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AlphaAssetEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AlphaAssetEntity>) list, continuation);
        }

        public C94642(Continuation<? super C94642> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94642 c94642 = AlphaFragment.this.new C94642(continuation);
            c94642.L$0 = obj;
            return c94642;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AlphaAssetEntity> list, Continuation<? super Unit> continuation) {
            return ((C94642) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AlphaFragment alphaFragment = AlphaFragment.this;
                C44809l0 c44809l0M15282E3 = alphaFragment.m15282E3();
                Editable text = null;
                boolean zM66566d = C27025c.m66566d((c44809l0M15282E3 == null || (kuCheckBox = c44809l0M15282E3.f100337d) == null) ? null : Boxing.boxBoolean(kuCheckBox.isChecked()));
                C44809l0 c44809l0M15282E4 = alphaFragment.m15282E3();
                if (c44809l0M15282E4 != null && (assetSearchView = c44809l0M15282E4.f100346m) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
                    text = etSearchView.getText();
                }
                alphaFragment.sendIntent(new AlphaContract$UiIntent.HideSmallOrFilter(zM66566d, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaFragment$bindState$4 */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/assets/entity/AlphaAssetEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaFragment$bindState$4", m90122f = "AlphaFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C94664 extends SuspendLambda implements Function2<List<? extends AlphaAssetEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AlphaAssetEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AlphaAssetEntity>) list, continuation);
        }

        public C94664(Continuation<? super C94664> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94664 c94664 = AlphaFragment.this.new C94664(continuation);
            c94664.L$0 = obj;
            return c94664;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AlphaAssetEntity> list, Continuation<? super Unit> continuation) {
            return ((C94664) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Group group;
            AlphaRecommendView alphaRecommendView;
            RecyclerView recyclerView;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                AlphaFragment alphaFragment = AlphaFragment.this;
                alphaFragment.f16431V.m15250k(list, AlphaFragment.m15253B3(alphaFragment).getFilterKeywords());
                C44809l0 c44809l0M15282E3 = alphaFragment.m15282E3();
                if (c44809l0M15282E3 != null && (recyclerView = c44809l0M15282E3.f100345l) != null) {
                    ViewExtKt.m66594y(recyclerView);
                }
                C44809l0 c44809l0M15282E4 = alphaFragment.m15282E3();
                if (c44809l0M15282E4 != null && (alphaRecommendView = c44809l0M15282E4.f100335b) != null) {
                    ViewExtKt.m66577h(alphaRecommendView);
                }
                C44809l0 c44809l0M15282E5 = alphaFragment.m15282E3();
                if (c44809l0M15282E5 != null && (group = c44809l0M15282E5.f100340g) != null) {
                    ViewExtKt.m66594y(group);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaFragment$bindState$6 */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaFragment$bindState$6", m90122f = "AlphaFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C94686 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C94686(Continuation<? super C94686> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94686 c94686 = AlphaFragment.this.new C94686(continuation);
            c94686.Z$0 = ((Boolean) obj).booleanValue();
            return c94686;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C94686) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Group group;
            AlphaRecommendView alphaRecommendView;
            RecyclerView recyclerView;
            AlphaHeaderView alphaHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44809l0 c44809l0M15282E3 = AlphaFragment.this.m15282E3();
            ShowHideTextView.m54778d(c44809l0M15282E3 != null ? c44809l0M15282E3.f100341h : null, z11);
            C44809l0 c44809l0M15282E4 = AlphaFragment.this.m15282E3();
            if (c44809l0M15282E4 != null && (alphaHeaderView = c44809l0M15282E4.f100341h) != null && (accountInfoHeader = alphaHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AlphaFragment.this.f16431V.m15251l(z11);
            AlphaFragment.this.f16431V.notifyDataSetChanged();
            C44809l0 c44809l0M15282E5 = AlphaFragment.this.m15282E3();
            if (c44809l0M15282E5 != null && (recyclerView = c44809l0M15282E5.f100345l) != null) {
                ViewExtKt.m66594y(recyclerView);
            }
            C44809l0 c44809l0M15282E6 = AlphaFragment.this.m15282E3();
            if (c44809l0M15282E6 != null && (alphaRecommendView = c44809l0M15282E6.f100335b) != null) {
                ViewExtKt.m66577h(alphaRecommendView);
            }
            C44809l0 c44809l0M15282E7 = AlphaFragment.this.m15282E3();
            if (c44809l0M15282E7 != null && (group = c44809l0M15282E7.f100340g) != null) {
                ViewExtKt.m66594y(group);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaFragment$bindState$8 */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/assets/entity/AlphaTopTokenInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaFragment$bindState$8", m90122f = "AlphaFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C94708 extends SuspendLambda implements Function2<List<? extends AlphaTopTokenInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AlphaTopTokenInfo> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AlphaTopTokenInfo>) list, continuation);
        }

        public C94708(Continuation<? super C94708> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94708 c94708 = AlphaFragment.this.new C94708(continuation);
            c94708.L$0 = obj;
            return c94708;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AlphaTopTokenInfo> list, Continuation<? super Unit> continuation) {
            return ((C94708) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Group group;
            AlphaRecommendView alphaRecommendView;
            RecyclerView recyclerView;
            AlphaRecommendView alphaRecommendView2;
            List<AlphaTopTokenInfo> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                AlphaFragment alphaFragment = AlphaFragment.this;
                C44809l0 c44809l0M15282E3 = alphaFragment.m15282E3();
                if (c44809l0M15282E3 != null && (alphaRecommendView2 = c44809l0M15282E3.f100335b) != null) {
                    alphaRecommendView2.m15299c(list);
                }
                C44809l0 c44809l0M15282E4 = alphaFragment.m15282E3();
                if (c44809l0M15282E4 != null && (recyclerView = c44809l0M15282E4.f100345l) != null) {
                    ViewExtKt.m66577h(recyclerView);
                }
                C44809l0 c44809l0M15282E5 = alphaFragment.m15282E3();
                if (c44809l0M15282E5 != null && (alphaRecommendView = c44809l0M15282E5.f100335b) != null) {
                    ViewExtKt.m66594y(alphaRecommendView);
                }
                C44809l0 c44809l0M15282E6 = alphaFragment.m15282E3();
                if (c44809l0M15282E6 != null && (group = c44809l0M15282E6.f100340g) != null) {
                    ViewExtKt.m66577h(group);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m15263M3(AlphaFragment alphaFragment, View view, int i11, int i12, int i13, int i14) {
        C44809l0 c44809l0M15282E3;
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        if (Math.abs(i12 - i14) <= 20 || (c44809l0M15282E3 = alphaFragment.m15282E3()) == null || (assetSearchView = c44809l0M15282E3.f100346m) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) {
            return;
        }
        KeyboardUtils.m6034f(etSearchView);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m15283R3(AlphaChainInfo alphaChainInfo) {
        BaseTextView baseTextView;
        ImageView imageView;
        BaseTextView baseTextView2;
        ImageView imageView2;
        ImageView imageView3;
        if ((alphaChainInfo != null ? alphaChainInfo.getDisplayChain() : null) == null) {
            C44809l0 c44809l0M15282E3 = m15282E3();
            if (c44809l0M15282E3 != null && (imageView3 = c44809l0M15282E3.f100342i) != null) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                C27046k.m66701p(imageView3, C27046k.m66699n(mContext, R$color.c_text));
            }
            C44809l0 c44809l0M15282E4 = m15282E3();
            if (c44809l0M15282E4 != null && (imageView2 = c44809l0M15282E4.f100342i) != null) {
                imageView2.setImageResource(R$drawable.ic2_allnetwork_16);
            }
            C44809l0 c44809l0M15282E5 = m15282E3();
            if (c44809l0M15282E5 == null || (baseTextView2 = c44809l0M15282E5.f100348o) == null) {
                return;
            }
            baseTextView2.setText(getString(R$string.asset_alpha_all));
            return;
        }
        C44809l0 c44809l0M15282E6 = m15282E3();
        if (c44809l0M15282E6 != null && (imageView = c44809l0M15282E6.f100342i) != null) {
            imageView.clearColorFilter();
        }
        Context context = getContext();
        String chainIcon = alphaChainInfo.getChainIcon();
        if (chainIcon == null) {
            chainIcon = "";
        }
        C44809l0 c44809l0M15282E7 = m15282E3();
        C24277v.m58540e(context, chainIcon, c44809l0M15282E7 != null ? c44809l0M15282E7.f100342i : null);
        C44809l0 c44809l0M15282E8 = m15282E3();
        if (c44809l0M15282E8 == null || (baseTextView = c44809l0M15282E8.f100348o) == null) {
            return;
        }
        baseTextView.setText(alphaChainInfo.getDisplayChain());
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        ImageView imageView;
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        KuCheckBox kuCheckBox;
        DashTextView dashTextView;
        NestedScrollView nestedScrollView;
        AssetSearchView assetSearchView2;
        ClearEditText etSearchView2;
        AlphaHeaderView alphaHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AlphaHeaderView alphaHeaderView2;
        super.initView();
        C44809l0 c44809l0M15282E3 = m15282E3();
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(c44809l0M15282E3 != null ? c44809l0M15282E3.f100339f : null);
        this.f16433X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44809l0 c44809l0M15282E4 = m15282E3();
        if (c44809l0M15282E4 != null && (alphaHeaderView2 = c44809l0M15282E4.f100341h) != null) {
            alphaHeaderView2.m15291d(this);
        }
        this.f16431V.setEmptyView(View.inflate(getContext(), R$layout.view_empty, null));
        C44809l0 c44809l0M15282E5 = m15282E3();
        if (c44809l0M15282E5 != null && (recyclerView2 = c44809l0M15282E5.f100345l) != null) {
            recyclerView2.setAdapter(this.f16431V);
        }
        this.f16431V.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.alpha.h
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                AlphaFragment.m15256F3(this.f16452a, baseQuickAdapter, view, i11);
            }
        });
        C44809l0 c44809l0M15282E6 = m15282E3();
        if (c44809l0M15282E6 != null && (recyclerView = c44809l0M15282E6.f100345l) != null) {
            recyclerView.setItemAnimator(null);
        }
        C44809l0 c44809l0M15282E7 = m15282E3();
        if (c44809l0M15282E7 != null && (kuCoinRefreshLayout = c44809l0M15282E7.f100347n) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.alpha.j
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AlphaFragment.m15261K3(this.f16454b, interfaceC38162f);
                }
            });
        }
        C44809l0 c44809l0M15282E8 = m15282E3();
        if (c44809l0M15282E8 != null && (alphaHeaderView = c44809l0M15282E8.f100341h) != null && (accountInfoHeader = alphaHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.alpha.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AlphaFragment.m15262L3(this.f16455b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44809l0 c44809l0M15282E9 = m15282E3();
        if (c44809l0M15282E9 != null && (assetSearchView2 = c44809l0M15282E9.f100346m) != null && (etSearchView2 = assetSearchView2.getEtSearchView()) != null) {
            etSearchView2.m54480h(C5275i0.m6236a(12.0f));
        }
        C44809l0 c44809l0M15282E10 = m15282E3();
        if (c44809l0M15282E10 != null && (nestedScrollView = c44809l0M15282E10.f100344k) != null) {
            nestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.kubi.assets.alpha.l
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    AlphaFragment.m15263M3(this.f16456a, view, i11, i12, i13, i14);
                }
            });
        }
        C44809l0 c44809l0M15282E11 = m15282E3();
        if (c44809l0M15282E11 != null && (dashTextView = c44809l0M15282E11.f100338e) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.alpha.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaFragment.m15264N3(this.f16457b);
                }
            }, 1, null);
        }
        C44809l0 c44809l0M15282E12 = m15282E3();
        if (c44809l0M15282E12 != null && (kuCheckBox = c44809l0M15282E12.f100337d) != null) {
            kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.alpha.n
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AlphaFragment.m15265O3(this.f16458b, compoundButton, z11);
                }
            });
        }
        C44809l0 c44809l0M15282E13 = m15282E3();
        if (c44809l0M15282E13 != null && (assetSearchView = c44809l0M15282E13.f100346m) != null && (etSearchView = assetSearchView.getEtSearchView()) != null) {
            etSearchView.addTextChangedListener(new C9462a());
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.alpha.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaFragment.m15266P3(this.f16459b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.alpha.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlphaFragment.m15257G3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.alpha.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaFragment.m15258H3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.alpha.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlphaFragment.m15259I3(function2, obj);
            }
        }));
        C44809l0 c44809l0M15282E14 = m15282E3();
        if (c44809l0M15282E14 != null) {
            ImageView ivAll = c44809l0M15282E14.f100342i;
            Intrinsics.checkNotNullExpressionValue(ivAll, "ivAll");
            BaseTextView tvAll = c44809l0M15282E14.f100348o;
            Intrinsics.checkNotNullExpressionValue(tvAll, "tvAll");
            C27046k.m66681D(new View[]{ivAll, tvAll}, new Function0() { // from class: com.kubi.assets.alpha.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaFragment.m15260J3(this.f16453b);
                }
            });
        }
        C44809l0 c44809l0M15282E15 = m15282E3();
        if (c44809l0M15282E15 == null || (imageView = c44809l0M15282E15.f100342i) == null) {
            return;
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        C27046k.m66701p(imageView, C27046k.m66699n(mContext, R$color.c_text));
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m15255D3(AlphaFragment alphaFragment, AlphaChainInfo alphaChainInfo) {
        alphaFragment.sendIntent(new AlphaContract$UiIntent.SelectNetwork(alphaChainInfo));
        alphaFragment.m15283R3(alphaChainInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m15256F3(AlphaFragment alphaFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Long currencySeq;
        List<AlphaAssetEntity> data = alphaFragment.f16431V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        AlphaAssetEntity alphaAssetEntity = (AlphaAssetEntity) CollectionsKt.getOrNull(data, i11);
        if (alphaAssetEntity == null || (currencySeq = alphaAssetEntity.getCurrencySeq()) == null) {
            return;
        }
        long jLongValue = currencySeq.longValue();
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/alphaKline?tokenBridgeId=" + jLongValue + "&subTab=holding", false, null, 6, null);
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m15260J3(AlphaFragment alphaFragment) {
        alphaFragment.sendIntent(AlphaContract$UiIntent.GetNetworkList.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m15261K3(AlphaFragment alphaFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alphaFragment.onShow();
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m15262L3(AlphaFragment alphaFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        alphaFragment.sendIntent(new AlphaContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m15264N3(AlphaFragment alphaFragment) {
        AssetsHelper.m19148y(AssetsHelper.f18684a, alphaFragment, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m15265O3(AlphaFragment alphaFragment, CompoundButton compoundButton, boolean z11) {
        AssetSearchView assetSearchView;
        ClearEditText etSearchView;
        C44809l0 c44809l0M15282E3 = alphaFragment.m15282E3();
        alphaFragment.sendIntent(new AlphaContract$UiIntent.HideSmallOrFilter(z11, StringsKt.trim((CharSequence) String.valueOf((c44809l0M15282E3 == null || (assetSearchView = c44809l0M15282E3.f100346m) == null || (etSearchView = assetSearchView.getEtSearchView()) == null) ? null : etSearchView.getText())).toString(), true));
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m15266P3(AlphaFragment alphaFragment, Boolean bool) {
        alphaFragment.f16431V.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final C44809l0 m15282E3() {
        return (C44809l0) this.f16430U.getValue(this, f16429a0[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C9474b) {
            m15284S3(((UIState) getState()).getNetworkList(), new Function1() { // from class: com.kubi.assets.alpha.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlphaFragment.m15255D3(this.f16451b, (AlphaChainInfo) obj);
                }
            });
            return;
        }
        if (singleEvent instanceof SingleEvent.C19247c) {
            C44809l0 c44809l0M15282E3 = m15282E3();
            if (c44809l0M15282E3 != null && (kuCoinRefreshLayout = c44809l0M15282E3.f100347n) != null) {
                kuCoinRefreshLayout.setRefreshing(false);
            }
            WrapperLoadingView wrapperLoadingView = this.f16433X;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_alpha;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF37691d0() {
        return this.f16434Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AlphaViewModel.class);
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        C44809l0 c44809l0M15282E3;
        AlphaHeaderView alphaHeaderView;
        this.f16432W = assetV2OverviewEntity;
        if (getContext() == null || !isShowing() || assetV2OverviewEntity == null || (c44809l0M15282E3 = m15282E3()) == null || (alphaHeaderView = c44809l0M15282E3.f100341h) == null) {
            return;
        }
        alphaHeaderView.m15292e(assetV2OverviewEntity);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f16434Y = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B3 */
    public static final /* synthetic */ UIState m15253B3(AlphaFragment alphaFragment) {
        return (UIState) alphaFragment.getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final void m15257G3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final Unit m15258H3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public static final void m15259I3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m15267Q3(AlphaFragment alphaFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44809l0 c44809l0M15282E3 = alphaFragment.m15282E3();
        if (c44809l0M15282E3 != null && (kuCoinRefreshLayout = c44809l0M15282E3.f100347n) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        alphaFragment.onShow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m15284S3(List<AlphaChainInfo> list, Function1<? super AlphaChainInfo, Unit> function1) {
        String displayChain;
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && !getChildFragmentManager().isStateSaved() && list != null) {
            boolean z11 = true;
            if (!list.isEmpty()) {
                AlphaChainInfo selectedNetwork = ((UIState) getState()).getSelectedNetwork();
                if (selectedNetwork != null) {
                    displayChain = selectedNetwork.getDisplayChain();
                } else {
                    displayChain = null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (AlphaChainInfo alphaChainInfo : list) {
                    arrayList.add(AlphaChainInfo.copy$default(alphaChainInfo, null, null, null, Intrinsics.areEqual(alphaChainInfo.getDisplayChain(), displayChain), 7, null));
                }
                List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                if (displayChain != null) {
                    z11 = false;
                }
                mutableList.add(0, new AlphaChainInfo(null, null, null, z11));
                AlphaNetworkDialog alphaNetworkDialog = new AlphaNetworkDialog();
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("data", new ArrayList<>(mutableList));
                alphaNetworkDialog.setArguments(bundle);
                alphaNetworkDialog.m15961n4(function1);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                alphaNetworkDialog.show(childFragmentManager, "AlphaNetworkDialog");
                C43841b.m96557d("B1depositpage_net_choose_load", "page_load_end", null, 4, null);
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.alpha.AlphaFragment.bindState.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setData((List) obj2);
            }
        }, new C94642(null));
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.alpha.AlphaFragment.bindState.3
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowList();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setShowList((List) obj2);
            }
        }, new C94664(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.alpha.AlphaFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C94686(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.alpha.AlphaFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRecommendList();
            }
        }, new C94708(null));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerView;
        AppBarLayout appBarLayout;
        C44809l0 c44809l0M15282E3 = m15282E3();
        if (c44809l0M15282E3 != null && (recyclerView = c44809l0M15282E3.f100345l) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44809l0 c44809l0M15282E4 = m15282E3();
            if (c44809l0M15282E4 != null) {
                appBarLayout = c44809l0M15282E4.f100336c;
            } else {
                appBarLayout = null;
            }
            assetsHelper.m19174t(recyclerView, appBarLayout, new Action() { // from class: com.kubi.assets.alpha.c
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AlphaFragment.m15267Q3(this.f16447b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        AlphaHeaderView alphaHeaderView;
        super.onShow();
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(AlphaContract$UiIntent.GetAlphaCoinList.INSTANCE);
        AssetV2OverviewEntity assetV2OverviewEntity = this.f16432W;
        if (assetV2OverviewEntity != null) {
            sendIntent(new AlphaContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
            C44809l0 c44809l0M15282E3 = m15282E3();
            if (c44809l0M15282E3 != null && (alphaHeaderView = c44809l0M15282E3.f100341h) != null) {
                alphaHeaderView.m15292e(assetV2OverviewEntity);
            }
        }
    }
}
