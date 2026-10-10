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
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.mvi.common.MviExKt;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.sdk.R$string;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385jy.C40820a;
import p385jy.C40822c;
import p637ta.C44906z;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: EvmChainListDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmChainListDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "isBottomSheet", "", "binding", "Lcom/kubi/assets/databinding/AssetDialogEvmChainListBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogEvmChainListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "evmViewModel", "Lcom/kubi/assets/dialog/evm/EvmChainListVM;", "getEvmViewModel", "()Lcom/kubi/assets/dialog/evm/EvmChainListVM;", "evmViewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/assets/dialog/evm/EvmChainListAdapter;", "getAdapter", "()Lcom/kubi/assets/dialog/evm/EvmChainListAdapter;", "adapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "loadEvmChains", "showContentView", "showLoadingView", "showFailedView", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEvmChainListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmChainListDialog.kt\ncom/kubi/assets/dialog/evm/EvmChainListDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,119:1\n143#2,20:120\n106#3,15:140\n*S KotlinDebug\n*F\n+ 1 EvmChainListDialog.kt\ncom/kubi/assets/dialog/evm/EvmChainListDialog\n*L\n32#1:120,20\n34#1:140,15\n*E\n"})
public final class EvmChainListDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f17034w0 = {Reflection.property1(new PropertyReference1Impl(EvmChainListDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogEvmChainListBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    public final float f17035s0 = 0.8f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f17036t0 = C45681e.m100799e(this, new Function1<EvmChainListDialog, C44906z>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44906z invoke(@NotNull EvmChainListDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44906z.m99336a(fragment.requireView());
        }
    }, new Function1<C44906z, Unit>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44906z it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44906z c44906z) {
            invoke(c44906z);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f17037u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f17038v0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmChainListDialog$onViewCreated$1 */
    /* JADX INFO: compiled from: EvmChainListDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmChainListDialog$onViewCreated$1", m90122f = "EvmChainListDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97471 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        public C97471(Continuation<? super C97471> continuation) {
            super(1, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return EvmChainListDialog.this.new C97471(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C97471) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EvmChainListDialog.this.m16209A4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: u4 */
    public static final EvmChainListAdapter m16206u4() {
        return new EvmChainListAdapter();
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17035s0() {
        return this.f17035s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_dialog_evm_chain_list, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16207y4();
        MviExKt.m42519o(this, new C97471(null));
    }

    /* JADX INFO: renamed from: v4 */
    public final EvmChainListAdapter m16210v4() {
        return (EvmChainListAdapter) this.f17038v0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final C44906z m16211w4() {
        return (C44906z) this.f17036t0.getValue(this, f17034w0[0]);
    }

    /* JADX INFO: renamed from: x4 */
    public final EvmChainListVM m16212x4() {
        return (EvmChainListVM) this.f17037u0.getValue();
    }

    public EvmChainListDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewModels$default$2
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
        this.f17037u0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EvmChainListVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.dialog.evm.EvmChainListDialog$special$$inlined$viewModels$default$5
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
        this.f17038v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.evm.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EvmChainListDialog.m16206u4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public final void m16196B4() {
        C40820a c40820a;
        LinearLayout root;
        C40822c c40822c;
        LinearLayout root2;
        RecyclerView recyclerView;
        C44906z c44906zM16211w4 = m16211w4();
        if (c44906zM16211w4 != null && (recyclerView = c44906zM16211w4.f101204d) != null) {
            ViewExtKt.m66577h(recyclerView);
        }
        C44906z c44906zM16211w5 = m16211w4();
        if (c44906zM16211w5 != null && (c40822c = c44906zM16211w5.f101203c) != null && (root2 = c40822c.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C44906z c44906zM16211w6 = m16211w4();
        if (c44906zM16211w6 != null && (c40820a = c44906zM16211w6.f101202b) != null && (root = c40820a.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public final void m16197C4() {
        AppCompatImageView appCompatImageView;
        C40822c c40822c;
        AppCompatImageView appCompatImageView2;
        C40822c c40822c2;
        LinearLayout root;
        RecyclerView recyclerView;
        C40820a c40820a;
        LinearLayout root2;
        C40822c c40822c3;
        Context context = getContext();
        int i11 = R$drawable.kc_loading;
        C44906z c44906zM16211w4 = m16211w4();
        if (c44906zM16211w4 != null && (c40822c3 = c44906zM16211w4.f101203c) != null) {
            appCompatImageView = c40822c3.f90684b;
        } else {
            appCompatImageView = null;
        }
        C24277v.m58539d(context, i11, appCompatImageView);
        C44906z c44906zM16211w5 = m16211w4();
        if (c44906zM16211w5 != null && (c40820a = c44906zM16211w5.f101202b) != null && (root2 = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C44906z c44906zM16211w6 = m16211w4();
        if (c44906zM16211w6 != null && (recyclerView = c44906zM16211w6.f101204d) != null) {
            ViewExtKt.m66577h(recyclerView);
        }
        C44906z c44906zM16211w7 = m16211w4();
        if (c44906zM16211w7 != null && (c40822c2 = c44906zM16211w7.f101203c) != null && (root = c40822c2.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
        C44906z c44906zM16211w8 = m16211w4();
        if (c44906zM16211w8 != null && (c40822c = c44906zM16211w8.f101203c) != null && (appCompatImageView2 = c40822c.f90684b) != null) {
            ViewExtKt.m66594y(appCompatImageView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContentView() {
        RecyclerView recyclerView;
        C40822c c40822c;
        LinearLayout root;
        C40820a c40820a;
        LinearLayout root2;
        C44906z c44906zM16211w4 = m16211w4();
        if (c44906zM16211w4 != null && (c40820a = c44906zM16211w4.f101202b) != null && (root2 = c40820a.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C44906z c44906zM16211w5 = m16211w4();
        if (c44906zM16211w5 != null && (c40822c = c44906zM16211w5.f101203c) != null && (root = c40822c.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C44906z c44906zM16211w6 = m16211w4();
        if (c44906zM16211w6 != null && (recyclerView = c44906zM16211w6.f101204d) != null) {
            ViewExtKt.m66594y(recyclerView);
        }
    }

    /* JADX INFO: renamed from: y4 */
    private final void m16207y4() {
        C40820a c40820a;
        LinearLayout root;
        C40820a c40820a2;
        TextView textView;
        C40820a c40820a3;
        ImageView imageView;
        RecyclerView recyclerView;
        C44906z c44906zM16211w4 = m16211w4();
        if (c44906zM16211w4 != null && (recyclerView = c44906zM16211w4.f101204d) != null) {
            recyclerView.setAdapter(m16210v4());
        }
        C44906z c44906zM16211w5 = m16211w4();
        if (c44906zM16211w5 != null && (c40820a3 = c44906zM16211w5.f101202b) != null && (imageView = c40820a3.f90679b) != null) {
            imageView.setImageResource(com.kubi.sdk.R$drawable.ic2_common_system_maintain);
        }
        C44906z c44906zM16211w6 = m16211w4();
        if (c44906zM16211w6 != null && (c40820a2 = c44906zM16211w6.f101202b) != null && (textView = c40820a2.f90680c) != null) {
            textView.setText(R$string.load_failed_click_retry);
        }
        C44906z c44906zM16211w7 = m16211w4();
        if (c44906zM16211w7 != null && (c40820a = c44906zM16211w7.f101202b) != null && (root = c40820a.getRoot()) != null) {
            root.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.evm.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EvmChainListDialog.m16208z4(this.f17057b, view);
                }
            });
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EvmChainListDialog$initViews$2(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EvmChainListDialog$initViews$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m16208z4(EvmChainListDialog evmChainListDialog, View view) {
        evmChainListDialog.m16209A4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m16209A4() {
        m16212x4().m16218u(EvmChainListIntent.a.f17061a);
    }
}
