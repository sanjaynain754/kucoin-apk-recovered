package com.kubi.assets.options.positions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.OptionsPositionEntity;
import com.kubi.assets.options.AssetOptionsViewModel;
import com.kubi.assets.options.UIState;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OptionsPositionsFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0014J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020$0#2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018H\u0014J\b\u0010'\u001a\u00020\u001dH\u0016J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0014J\u0016\u0010,\u001a\u00020\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0012H\u0003R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/options/positions/OptionsPositionsFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "<init>", "()V", "assetOptionsVm", "Lcom/kubi/assets/options/AssetOptionsViewModel;", "getAssetOptionsVm", "()Lcom/kubi/assets/options/AssetOptionsViewModel;", "assetOptionsVm$delegate", "Lkotlin/Lazy;", "assetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "assetApi$delegate", "uiHideNumber", "", "getUiHideNumber$AssetsCenterLib_googleRelease", "()Z", "setUiHideNumber$AssetsCenterLib_googleRelease", "(Z)V", "getLayout", "", "getItemLayout", "getEndFooterText", "needDefaultBackground", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "showEmpty", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "notifyAdapterItemChanged", "changeList", "", "notifyDataNumberVisibleChange", "isHide", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOptionsPositionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsPositionsFragment.kt\ncom/kubi/assets/options/positions/OptionsPositionsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n106#2,15:140\n76#3,7:155\n153#3,7:162\n1869#4:169\n360#4,7:170\n1870#4:177\n*S KotlinDebug\n*F\n+ 1 OptionsPositionsFragment.kt\ncom/kubi/assets/options/positions/OptionsPositionsFragment\n*L\n37#1:140,15\n61#1:155,7\n66#1:162,7\n118#1:169\n119#1:170,7\n118#1:177\n*E\n"})
public final class OptionsPositionsFragment extends BasePagingFragment<OptionsPositionEntity> {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f18162c0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f18163Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f18164a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f18165b0;

    /* JADX INFO: compiled from: OptionsPositionsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/options/positions/OptionsPositionsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/options/positions/OptionsPositionsFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OptionsPositionsFragment newInstance() {
            return new OptionsPositionsFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.options.positions.OptionsPositionsFragment$onViewCreated$3 */
    /* JADX INFO: compiled from: OptionsPositionsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.positions.OptionsPositionsFragment$onViewCreated$3", m90122f = "OptionsPositionsFragment.kt", m90123i = {}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105573 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.assets.options.positions.OptionsPositionsFragment$onViewCreated$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: OptionsPositionsFragment.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/options/AssetOptionsContract$UIState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.options.positions.OptionsPositionsFragment$onViewCreated$3$1", m90122f = "OptionsPositionsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UIState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPositionsFragment this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(UIState uIState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uIState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OptionsPositionsFragment optionsPositionsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsPositionsFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                UIState uIState = (UIState) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.m18170S3(uIState.getUiHideNumberFlag());
                return Unit.INSTANCE;
            }
        }

        public C105573(Continuation<? super C105573> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPositionsFragment.this.new C105573(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C105573) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41634e<UIState> stateFlow = OptionsPositionsFragment.this.m18168Q3().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsPositionsFragment.this, null);
                this.label = 1;
                if (C41636g.m90925l(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OptionsPositionEntity>> mo16440r3(int i11, int i12) {
        String id2;
        String str = "0";
        if (i11 != 1) {
            List data = this.f46495W.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            OptionsPositionEntity optionsPositionEntity = (OptionsPositionEntity) CollectionsKt.lastOrNull(data);
            if (optionsPositionEntity != null && (id2 = optionsPositionEntity.getId()) != null) {
                str = id2;
            }
        }
        Observable observableCompose = m18166P3().m17153o1(str, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    /* JADX INFO: renamed from: P3 */
    private final AssetV2Api m18166P3() {
        return (AssetV2Api) this.f18164a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C10564g.m18180i(this, helper, item);
        C10564g.m18186o(this, helper, item);
        C10564g.m18178g(this, helper, item);
        C10564g.m18175d(this, helper, item);
        C10564g.m18181j(this, helper, item);
        C10564g.m18176e(this, helper, item);
        C10564g.m18179h(this, helper, item);
        C10564g.m18177f(this, helper, item);
        C10564g.m18184m(this, helper, item);
        ShowHideTextView.m54778d(helper.itemView, this.f18165b0);
    }

    /* JADX INFO: renamed from: Q3 */
    public final AssetOptionsViewModel m18168Q3() {
        return (AssetOptionsViewModel) this.f18163Z.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: S3 */
    public final void m18170S3(boolean z11) {
        this.f18165b0 = z11;
        this.f46495W.notifyDataSetChanged();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.options_position_list_fragment;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setEnableRefresh(false);
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "option_positions_change".length();
        }
        C12572a.m23692a(this, false, new C10555x559e0844("option_positions_change", null, this));
        if (c12573b.m23696a()) {
            "event_refresh_overview".length();
        }
        C12572a.m23692a(this, false, new C10556x559e0845("event_refresh_overview", null, this));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C105573(null));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showEmpty(R$string.no_position, R$drawable.ic2_common_empty);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.auto_footer_nomore_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.option_position_item;
    }

    public OptionsPositionsFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.assets.options.positions.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsPositionsFragment.m18165N3(this.f18166b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.options.positions.OptionsPositionsFragment$special$$inlined$viewModels$default$1
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
        this.f18163Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AssetOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.options.positions.OptionsPositionsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.options.positions.OptionsPositionsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.options.positions.OptionsPositionsFragment$special$$inlined$viewModels$default$4
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
        this.f18164a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.positions.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsPositionsFragment.m18164M3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final AssetV2Api m18164M3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: N3 */
    public static final ViewModelStoreOwner m18165N3(OptionsPositionsFragment optionsPositionsFragment) {
        Fragment fragmentRequireParentFragment = optionsPositionsFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: R3 */
    public final void m18169R3(List<OptionsPositionEntity> list) {
        for (OptionsPositionEntity optionsPositionEntity : list) {
            List data = this.f46495W.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            Iterator it = data.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((OptionsPositionEntity) it.next()).getId(), optionsPositionEntity.getId())) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            List data2 = this.f46495W.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
            if (((OptionsPositionEntity) CollectionsKt.getOrNull(data2, i11)) != null) {
                this.f46495W.setData(i11, optionsPositionEntity);
                this.f46495W.notifyItemChanged(i11);
            }
        }
    }
}
