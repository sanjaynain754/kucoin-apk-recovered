package com.kubi.assets.finance.coin;

import android.annotation.SuppressLint;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.assets.finance.IFinanceAsset;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44859s1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: FinanceCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0013J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0013H\u0014J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0014J\u0016\u0010&\u001a\u00020\u001d2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0013H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010'\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020)0(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/finance/coin/FinanceCoinFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/finance/coin/FinanceCoinContract$UIState;", "Lcom/kubi/assets/finance/IFinanceAsset;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetListBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/finance/coin/FinanceCoinAdapter;", "data", "", "Lcom/kubi/assets/entity/FinanceCoinEntity;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "initView", "", "autoClickItemAtPosition", FirebaseAnalytics.Param.CURRENCY, "", "isFirstItem", "onViewHideOrShowToggle", TIMPushProvider.f75062n, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "onHoldAsset", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onHideZeroListener", TIMPushProvider.f75063o, "onEyesChangedListener", ViewProps.VISIBLE, "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nFinanceCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCoinFragment.kt\ncom/kubi/assets/finance/coin/FinanceCoinFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,123:1\n147#2,16:124\n1#3:140\n135#4,2:141\n*S KotlinDebug\n*F\n+ 1 FinanceCoinFragment.kt\ncom/kubi/assets/finance/coin/FinanceCoinFragment\n*L\n32#1:124,16\n92#1:141,2\n*E\n"})
public final class FinanceCoinFragment extends SimpleStateFragment<UIState> implements IFinanceAsset, AssetV2OverviewAdapter.InterfaceC10586a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17424U = C45681e.m100799e(this, new Function1<FinanceCoinFragment, C44859s1>() { // from class: com.kubi.assets.finance.coin.FinanceCoinFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44859s1 invoke(@NotNull FinanceCoinFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44859s1.m99242a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44859s1, Unit>() { // from class: com.kubi.assets.finance.coin.FinanceCoinFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44859s1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44859s1 c44859s1) {
            invoke(c44859s1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final FinanceCoinAdapter f17425V = new FinanceCoinAdapter();

    /* JADX INFO: renamed from: W */
    @Nullable
    public List<FinanceCoinEntity> f17426W;

    /* JADX INFO: renamed from: X */
    public boolean f17427X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f17423Z = {Reflection.property1(new PropertyReference1Impl(FinanceCoinFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetListBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f17422Y = new Companion(null);

    /* JADX INFO: compiled from: FinanceCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/finance/coin/FinanceCoinFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/finance/coin/FinanceCoinFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FinanceCoinFragment newInstance() {
            return new FinanceCoinFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.coin.FinanceCoinFragment$bindState$2 */
    /* JADX INFO: compiled from: FinanceCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.coin.FinanceCoinFragment$bindState$2", m90122f = "FinanceCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99752 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C99752(Continuation<? super C99752> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99752 c99752 = FinanceCoinFragment.this.new C99752(continuation);
            c99752.Z$0 = ((Boolean) obj).booleanValue();
            return c99752;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C99752) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinanceCoinFragment.this.f17425V.m16771k(z11);
            FinanceCoinFragment.this.f17425V.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF17427X() {
        return this.f17427X;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FinanceCoinViewModel.class);
    }

    /* JADX INFO: renamed from: p3 */
    public final C44859s1 m16786p3() {
        return (C44859s1) this.f17424U.getValue(this, f17423Z[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17427X = z11;
    }

    @Override // com.kubi.assets.finance.IFinanceAsset
    /* JADX INFO: renamed from: y */
    public void mo16787y(@NotNull List<FinanceCoinEntity> data) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17426W = data;
        if (isShowing()) {
            C44859s1 c44859s1M16786p3 = m16786p3();
            if (c44859s1M16786p3 != null && (recyclerView = c44859s1M16786p3.f100772f) != null) {
                ViewExtKt.m66594y(recyclerView);
            }
            this.f17425V.replaceData(data);
        }
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        if (!isShowing()) {
            return;
        }
        this.f17425V.m16771k(z11);
        this.f17425V.notifyDataSetChanged();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.coin.FinanceCoinFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C99752(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        FrameLayout frameLayout;
        super.initView();
        C44859s1 c44859s1M16786p3 = m16786p3();
        if (c44859s1M16786p3 != null && (frameLayout = c44859s1M16786p3.f100770d) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        FinanceCoinAdapter financeCoinAdapter = this.f17425V;
        int i11 = R$layout.view_empty;
        C44859s1 c44859s1M16786p4 = m16786p3();
        if (c44859s1M16786p4 != null) {
            recyclerView = c44859s1M16786p4.f100772f;
        } else {
            recyclerView = null;
        }
        financeCoinAdapter.setEmptyView(i11, recyclerView);
        C44859s1 c44859s1M16786p5 = m16786p3();
        if (c44859s1M16786p5 != null && (recyclerView3 = c44859s1M16786p5.f100772f) != null) {
            recyclerView3.setItemViewCacheSize(20);
        }
        C44859s1 c44859s1M16786p6 = m16786p3();
        if (c44859s1M16786p6 != null && (recyclerView2 = c44859s1M16786p6.f100772f) != null) {
            recyclerView2.setAdapter(this.f17425V);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final void m16785o3(@Nullable String str, boolean z11) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new FinanceCoinFragment$autoClickItemAtPosition$1(z11, this, str, null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C12572a.m23695d("EVENT_REFRESH_COIN", null, 0L, 6, null);
        sendIntent(new FinanceCoinContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        RecyclerView recyclerView;
        super.onViewHideOrShowToggle(show);
        if (show && getContext() != null) {
            C44859s1 c44859s1M16786p3 = m16786p3();
            if (c44859s1M16786p3 != null && (recyclerView = c44859s1M16786p3.f100772f) != null) {
                ViewExtKt.m66594y(recyclerView);
            }
            List<FinanceCoinEntity> list = this.f17426W;
            if (list != null) {
                this.f17425V.replaceData(list);
            }
        }
    }
}
