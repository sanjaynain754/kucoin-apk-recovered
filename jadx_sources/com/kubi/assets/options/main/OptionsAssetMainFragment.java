package com.kubi.assets.options.main;

import androidx.activity.result.ActivityResultCaller;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.options.AssetOptionsFragment;
import com.kubi.assets.options.openaccount.OptionsOpenFragment;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.utils.extensions.core.C27032f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: OptionsAssetMainFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/options/main/OptionsAssetMainFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;", "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UIState;", "Lcom/kubi/assets/options/main/OptionsAssetMainViewModel;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "optionsOpenFragment", "Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;", "getOptionsOpenFragment", "()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;", "optionsOpenFragment$delegate", "Lkotlin/Lazy;", "optionsAssetsFragment", "Lcom/kubi/assets/options/AssetOptionsFragment;", "getOptionsAssetsFragment", "()Lcom/kubi/assets/options/AssetOptionsFragment;", "optionsAssetsFragment$delegate", "getLayout", "", "bindState", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onAssetsGet", "myAssetEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OptionsAssetMainFragment extends BaseStateFragment<OptionsAssetMainContract$UiIntent, UIState, OptionsAssetMainViewModel> implements AssetV2Fragment.InterfaceC9449a {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f18153W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f18154U = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.main.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionsAssetMainFragment.m18146t3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18155V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.main.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionsAssetMainFragment.m18145s3();
        }
    });

    /* JADX INFO: compiled from: OptionsAssetMainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/options/main/OptionsAssetMainFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/options/main/OptionsAssetMainFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OptionsAssetMainFragment newInstance() {
            return new OptionsAssetMainFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.options.main.OptionsAssetMainFragment$bindState$2 */
    /* JADX INFO: compiled from: OptionsAssetMainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "isOpen", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.main.OptionsAssetMainFragment$bindState$2", m90122f = "OptionsAssetMainFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105462 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C105462) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C105462(Continuation<? super C105462> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105462 c105462 = OptionsAssetMainFragment.this.new C105462(continuation);
            c105462.L$0 = obj;
            return c105462;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                OptionsAssetMainFragment optionsAssetMainFragment = OptionsAssetMainFragment.this;
                C27032f.m66625p(optionsAssetMainFragment, R$id.asset_options_container_fragment_layout, optionsAssetMainFragment.m18147q3(), null, 4, null);
            } else {
                OptionsAssetMainFragment optionsAssetMainFragment2 = OptionsAssetMainFragment.this;
                C27032f.m66625p(optionsAssetMainFragment2, R$id.asset_options_container_fragment_layout, optionsAssetMainFragment2.m18148r3(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static final AssetOptionsFragment m18145s3() {
        return new AssetOptionsFragment();
    }

    /* JADX INFO: renamed from: t3 */
    public static final OptionsOpenFragment m18146t3() {
        return new OptionsOpenFragment();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_options_main_fragment_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<OptionsAssetMainViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(OptionsAssetMainViewModel.class);
    }

    /* JADX INFO: renamed from: q3 */
    public final AssetOptionsFragment m18147q3() {
        return (AssetOptionsFragment) this.f18155V.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public final OptionsOpenFragment m18148r3() {
        return (OptionsOpenFragment) this.f18154U.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.options.main.OptionsAssetMainFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getIsOpen();
            }
        }, new C105462(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(OptionsAssetMainContract$UiIntent.RefreshOpenStatus.INSTANCE);
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        ActivityResultCaller activityResultCallerFindFragmentById;
        if (getContext() != null && isShowing() && (activityResultCallerFindFragmentById = getChildFragmentManager().findFragmentById(R$id.asset_options_container_fragment_layout)) != null && (activityResultCallerFindFragmentById instanceof AssetV2Fragment.InterfaceC9449a)) {
            ((AssetV2Fragment.InterfaceC9449a) activityResultCallerFindFragmentById).mo15196r2(assetV2OverviewEntity);
        }
    }
}
