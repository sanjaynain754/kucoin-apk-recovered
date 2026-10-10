package com.kubi.assets.dialog.evm;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385jy.C40820a;
import p385jy.C40822c;
import p569qq.C43852m;
import p637ta.C44721a0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00104\u001a\u000202H\u0002J\b\u00105\u001a\u000202H\u0002J\b\u00106\u001a\u000202H\u0002J\b\u00107\u001a\u000202H\u0002J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b!\u0010\u001eR#\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b&\u0010'¨\u0006;"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "isBottomSheet", "", "binding", "Lcom/kubi/assets/databinding/AssetDialogEvmRepeatChainBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogEvmRepeatChainBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "evmRepeatVm", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainVM;", "getEvmRepeatVm", "()Lcom/kubi/assets/dialog/evm/EvmRepeatChainVM;", "evmRepeatVm$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainAdapter;", "getAdapter", "()Lcom/kubi/assets/dialog/evm/EvmRepeatChainAdapter;", "adapter$delegate", "address", "", "getAddress", "()Ljava/lang/String;", "address$delegate", "memo", "getMemo", "memo$delegate", "initialData", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "getInitialData", "()Ljava/util/List;", "initialData$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "bindViewModel", "loadData", "showContentView", "showLoadingView", "showFailedView", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEvmRepeatChainDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmRepeatChainDialog.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,194:1\n143#2,20:195\n106#3,15:215\n*S KotlinDebug\n*F\n+ 1 EvmRepeatChainDialog.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainDialog\n*L\n34#1:195,20\n36#1:215,15\n*E\n"})
public final class EvmRepeatChainDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ KProperty<Object>[] f17043A0 = {Reflection.property1(new PropertyReference1Impl(EvmRepeatChainDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogEvmRepeatChainBinding;", 0))};

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final Companion f17044z0 = new Companion(null);

    /* JADX INFO: renamed from: s0 */
    public final float f17045s0 = 0.8f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f17046t0 = C45681e.m100799e(this, new Function1<EvmRepeatChainDialog, C44721a0>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44721a0 invoke(@NotNull EvmRepeatChainDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44721a0.m98952a(fragment.requireView());
        }
    }, new Function1<C44721a0, Unit>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44721a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44721a0 c44721a0) {
            invoke(c44721a0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f17047u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f17048v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f17049w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f17050x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f17051y0;

    /* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog$Companion;", "", "<init>", "()V", "ARG_ADDRESS", "", "ARG_MEMO", "ARG_INITIAL_DATA", "newInstance", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainDialog;", "address", "memo", "initialData", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EvmRepeatChainDialog newInstance$default(Companion companion, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                list = null;
            }
            return companion.newInstance(str, str2, list);
        }

        @NotNull
        public final EvmRepeatChainDialog newInstance(@NotNull String address, @NotNull String memo, @Nullable List<EvmRepeatAddressResponseEntity> initialData) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(memo, "memo");
            EvmRepeatChainDialog evmRepeatChainDialog = new EvmRepeatChainDialog();
            Bundle bundle = new Bundle();
            bundle.putString("arg_address", address);
            bundle.putString("arg_memo", memo);
            if (initialData != null) {
                bundle.putParcelableArrayList("arg_initial_data", new ArrayList<>(initialData));
            }
            evmRepeatChainDialog.setArguments(bundle);
            return evmRepeatChainDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final EvmRepeatChainAdapter m16227A4() {
        return new EvmRepeatChainAdapter();
    }

    /* JADX INFO: renamed from: E4 */
    private final String m16229E4() {
        return (String) this.f17049w0.getValue();
    }

    /* JADX INFO: renamed from: I4 */
    private final String m16230I4() {
        return (String) this.f17050x0.getValue();
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m16234M4(EvmRepeatChainDialog evmRepeatChainDialog, int i11, EvmRepeatChainItem evmRepeatChainItem) {
        Intrinsics.checkNotNullParameter(evmRepeatChainItem, "<unused var>");
        evmRepeatChainDialog.m16259G4().m16271A(new EvmRepeatChainIntent.DeleteItem(i11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m16235N4(EvmRepeatChainDialog evmRepeatChainDialog, View view) {
        ToastCompat.m66437C(R$string.kc_withdaraw_evm_repeat_dialog_add_succ);
        evmRepeatChainDialog.dismissAllowingStateLoss();
        C43852m.m96590b("B1withdrawPage", "addressBox", "clearSameAddress", TuplesKt.m90091to("after_click_element_value", "cancel"));
    }

    /* JADX INFO: renamed from: D4 */
    public final EvmRepeatChainAdapter m16257D4() {
        return (EvmRepeatChainAdapter) this.f17048v0.getValue();
    }

    /* JADX INFO: renamed from: F4 */
    public final C44721a0 m16258F4() {
        return (C44721a0) this.f17046t0.getValue(this, f17043A0[0]);
    }

    /* JADX INFO: renamed from: G4 */
    public final EvmRepeatChainVM m16259G4() {
        return (EvmRepeatChainVM) this.f17047u0.getValue();
    }

    /* JADX INFO: renamed from: H4 */
    public final List<EvmRepeatAddressResponseEntity> m16260H4() {
        return (List) this.f17051y0.getValue();
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17045s0() {
        return this.f17045s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_dialog_evm_repeat_chain, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16231J4();
        m16256C4();
        if (m16260H4() == null) {
            m16238Q4();
            return;
        }
        EvmRepeatChainVM evmRepeatChainVMM16259G4 = m16259G4();
        List<EvmRepeatAddressResponseEntity> listM16260H4 = m16260H4();
        Intrinsics.checkNotNull(listM16260H4);
        evmRepeatChainVMM16259G4.m16271A(new EvmRepeatChainIntent.SetInitialData(listM16260H4));
    }

    public EvmRepeatChainDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewModels$default$2
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
        this.f17047u0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EvmRepeatChainVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$special$$inlined$viewModels$default$5
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
        this.f17048v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.evm.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EvmRepeatChainDialog.m16227A4();
            }
        });
        this.f17049w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.evm.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EvmRepeatChainDialog.m16228B4(this.f17074b);
            }
        });
        this.f17050x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.evm.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EvmRepeatChainDialog.m16239R4(this.f17075b);
            }
        });
        this.f17051y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.evm.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EvmRepeatChainDialog.m16237P4(this.f17076b);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static final String m16228B4(EvmRepeatChainDialog evmRepeatChainDialog) {
        String string;
        Bundle arguments = evmRepeatChainDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("arg_address");
        } else {
            string = null;
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    /* JADX INFO: renamed from: J4 */
    private final void m16231J4() {
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton;
        C40820a c40820a;
        LinearLayout root;
        C40820a c40820a2;
        TextView textView;
        C40820a c40820a3;
        ImageView imageView;
        RecyclerView recyclerView;
        C44721a0 c44721a0M16258F4 = m16258F4();
        if (c44721a0M16258F4 != null && (recyclerView = c44721a0M16258F4.f99541g) != null) {
            recyclerView.setAdapter(m16257D4());
        }
        C44721a0 c44721a0M16258F5 = m16258F4();
        if (c44721a0M16258F5 != null && (c40820a3 = c44721a0M16258F5.f99539e) != null && (imageView = c40820a3.f90679b) != null) {
            imageView.setImageResource(R$drawable.ic2_common_system_maintain);
        }
        C44721a0 c44721a0M16258F6 = m16258F4();
        if (c44721a0M16258F6 != null && (c40820a2 = c44721a0M16258F6.f99539e) != null && (textView = c40820a2.f90680c) != null) {
            textView.setText(com.kubi.sdk.R$string.load_failed_click_retry);
        }
        C44721a0 c44721a0M16258F7 = m16258F4();
        if (c44721a0M16258F7 != null && (c40820a = c44721a0M16258F7.f99539e) != null && (root = c40820a.getRoot()) != null) {
            root.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.evm.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EvmRepeatChainDialog.m16232K4(this.f17069b, view);
                }
            });
        }
        m16257D4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.dialog.evm.j
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                EvmRepeatChainDialog.m16233L4(this.f17070a, baseQuickAdapter, view, i11);
            }
        });
        m16257D4().m16225j(new Function2() { // from class: com.kubi.assets.dialog.evm.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EvmRepeatChainDialog.m16234M4(this.f17071b, ((Integer) obj).intValue(), (EvmRepeatChainItem) obj2);
            }
        });
        C44721a0 c44721a0M16258F8 = m16258F4();
        if (c44721a0M16258F8 != null && (kcPrimaryButton = c44721a0M16258F8.f99536b) != null) {
            kcPrimaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.evm.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EvmRepeatChainDialog.m16235N4(this.f17072b, view);
                }
            });
        }
        C44721a0 c44721a0M16258F9 = m16258F4();
        if (c44721a0M16258F9 != null && (kcSecondaryButton = c44721a0M16258F9.f99538d) != null) {
            kcSecondaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.evm.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EvmRepeatChainDialog.m16236O4(this.f17073b, view);
                }
            });
        }
        C43852m.m96595g("B1withdrawPage", "addressBox", "clearSameAddress", null, 8, null);
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m16232K4(EvmRepeatChainDialog evmRepeatChainDialog, View view) {
        evmRepeatChainDialog.m16238Q4();
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m16233L4(EvmRepeatChainDialog evmRepeatChainDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        evmRepeatChainDialog.m16259G4().m16271A(new EvmRepeatChainIntent.ToggleGroupExpand(i11));
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m16236O4(EvmRepeatChainDialog evmRepeatChainDialog, View view) {
        evmRepeatChainDialog.m16259G4().m16271A(EvmRepeatChainIntent.b.f17083a);
        C43852m.m96590b("B1withdrawPage", "addressBox", "clearSameAddress", TuplesKt.m90091to("after_click_element_value", "clear"));
    }

    /* JADX INFO: renamed from: P4 */
    public static final List m16237P4(EvmRepeatChainDialog evmRepeatChainDialog) {
        ArrayList parcelableArrayList;
        Bundle arguments = evmRepeatChainDialog.getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("arg_initial_data")) != null) {
            return CollectionsKt.toList(parcelableArrayList);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q4 */
    private final void m16238Q4() {
        m16259G4().m16271A(new EvmRepeatChainIntent.LoadRepeatAddressList(m16229E4(), m16230I4()));
    }

    /* JADX INFO: renamed from: R4 */
    public static final String m16239R4(EvmRepeatChainDialog evmRepeatChainDialog) {
        String string;
        Bundle arguments = evmRepeatChainDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("arg_memo");
        } else {
            string = null;
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public final void m16240S4() {
        LinearLayout linearLayout;
        C40820a c40820a;
        LinearLayout root;
        C40822c c40822c;
        LinearLayout root2;
        RecyclerView recyclerView;
        C44721a0 c44721a0M16258F4 = m16258F4();
        if (c44721a0M16258F4 != null && (recyclerView = c44721a0M16258F4.f99541g) != null) {
            ViewExtKt.m66577h(recyclerView);
        }
        C44721a0 c44721a0M16258F5 = m16258F4();
        if (c44721a0M16258F5 != null && (c40822c = c44721a0M16258F5.f99540f) != null && (root2 = c40822c.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C44721a0 c44721a0M16258F6 = m16258F4();
        if (c44721a0M16258F6 != null && (c40820a = c44721a0M16258F6.f99539e) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
        C44721a0 c44721a0M16258F7 = m16258F4();
        if (c44721a0M16258F7 != null && (linearLayout = c44721a0M16258F7.f99537c) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public final void m16241T4() {
        AppCompatImageView appCompatImageView;
        LinearLayout linearLayout;
        C40822c c40822c;
        AppCompatImageView appCompatImageView2;
        C40822c c40822c2;
        LinearLayout root;
        RecyclerView recyclerView;
        C40820a c40820a;
        LinearLayout root2;
        C40822c c40822c3;
        Context context = getContext();
        int i11 = com.kubi.assets.R$drawable.kc_loading;
        C44721a0 c44721a0M16258F4 = m16258F4();
        if (c44721a0M16258F4 != null && (c40822c3 = c44721a0M16258F4.f99540f) != null) {
            appCompatImageView = c40822c3.f90684b;
        } else {
            appCompatImageView = null;
        }
        C24277v.m58539d(context, i11, appCompatImageView);
        C44721a0 c44721a0M16258F5 = m16258F4();
        if (c44721a0M16258F5 != null && (c40820a = c44721a0M16258F5.f99539e) != null && (root2 = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C44721a0 c44721a0M16258F6 = m16258F4();
        if (c44721a0M16258F6 != null && (recyclerView = c44721a0M16258F6.f99541g) != null) {
            ViewExtKt.m66577h(recyclerView);
        }
        C44721a0 c44721a0M16258F7 = m16258F4();
        if (c44721a0M16258F7 != null && (c40822c2 = c44721a0M16258F7.f99540f) != null && (root = c40822c2.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
        C44721a0 c44721a0M16258F8 = m16258F4();
        if (c44721a0M16258F8 != null && (c40822c = c44721a0M16258F8.f99540f) != null && (appCompatImageView2 = c40822c.f90684b) != null) {
            ViewExtKt.m66594y(appCompatImageView2);
        }
        C44721a0 c44721a0M16258F9 = m16258F4();
        if (c44721a0M16258F9 != null && (linearLayout = c44721a0M16258F9.f99537c) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContentView() {
        LinearLayout linearLayout;
        RecyclerView recyclerView;
        C40822c c40822c;
        LinearLayout root;
        C40820a c40820a;
        LinearLayout root2;
        C44721a0 c44721a0M16258F4 = m16258F4();
        if (c44721a0M16258F4 != null && (c40820a = c44721a0M16258F4.f99539e) != null && (root2 = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C44721a0 c44721a0M16258F5 = m16258F4();
        if (c44721a0M16258F5 != null && (c40822c = c44721a0M16258F5.f99540f) != null && (root = c40822c.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C44721a0 c44721a0M16258F6 = m16258F4();
        if (c44721a0M16258F6 != null && (recyclerView = c44721a0M16258F6.f99541g) != null) {
            ViewExtKt.m66594y(recyclerView);
        }
        C44721a0 c44721a0M16258F7 = m16258F4();
        if (c44721a0M16258F7 != null && (linearLayout = c44721a0M16258F7.f99537c) != null) {
            ViewExtKt.m66594y(linearLayout);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m16256C4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EvmRepeatChainDialog$bindViewModel$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EvmRepeatChainDialog$bindViewModel$2(this, null), 3, null);
    }
}
