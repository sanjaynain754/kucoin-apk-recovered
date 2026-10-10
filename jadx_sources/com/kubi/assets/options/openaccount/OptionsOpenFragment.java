package com.kubi.assets.options.openaccount;

import com.kubi.assets.R$layout;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p637ta.C44894x1;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: OptionsOpenFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent;", "Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiState;", "Lcom/kubi/assets/options/openaccount/OptionsOpenViewModel;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetOptionsOpenFragmentLayoutBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetOptionsOpenFragmentLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "initView", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOptionsOpenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsOpenFragment.kt\ncom/kubi/assets/options/openaccount/OptionsOpenFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,32:1\n147#2,16:33\n*S KotlinDebug\n*F\n+ 1 OptionsOpenFragment.kt\ncom/kubi/assets/options/openaccount/OptionsOpenFragment\n*L\n19#1:33,16\n*E\n"})
public final class OptionsOpenFragment extends BaseStateFragment<OptionsOpenContract$UiIntent, UiState, OptionsOpenViewModel> {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f18159V = {Reflection.property1(new PropertyReference1Impl(OptionsOpenFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetOptionsOpenFragmentLayoutBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18160U = C45681e.m100799e(this, new Function1<OptionsOpenFragment, C44894x1>() { // from class: com.kubi.assets.options.openaccount.OptionsOpenFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44894x1 invoke(@NotNull OptionsOpenFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44894x1.m99312a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44894x1, Unit>() { // from class: com.kubi.assets.options.openaccount.OptionsOpenFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44894x1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44894x1 c44894x1) {
            invoke(c44894x1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: o3 */
    public static final Unit m18155o3(OptionsOpenFragment optionsOpenFragment) {
        optionsOpenFragment.sendIntent(new OptionsOpenContract$UiIntent.JumpToOpen("krn/router?component=kucoin_options_rn&biz=options&entry=main"));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_options_open_fragment_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<OptionsOpenViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(OptionsOpenViewModel.class);
    }

    /* JADX INFO: renamed from: n3 */
    public final C44894x1 m18156n3() {
        return (C44894x1) this.f18160U.getValue(this, f18159V[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        KcPrimaryButton kcPrimaryButton;
        C44894x1 c44894x1M18156n3 = m18156n3();
        if (c44894x1M18156n3 != null && (kcPrimaryButton = c44894x1M18156n3.f101118c) != null) {
            C27046k.m66679B(kcPrimaryButton, new Function0() { // from class: com.kubi.assets.options.openaccount.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsOpenFragment.m18155o3(this.f18161b);
                }
            });
        }
    }
}
