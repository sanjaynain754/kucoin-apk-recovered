package com.kubi.assets.autoearn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44843q;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AutoEarnCloseDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020'H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetDialogAutoEarnCloseBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogAutoEarnCloseBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "getViewModel", "()Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initEfforts", "setupViews", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoEarnCloseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnCloseDialog.kt\ncom/kubi/assets/autoearn/AutoEarnCloseDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,102:1\n143#2,20:103\n106#3,15:123\n*S KotlinDebug\n*F\n+ 1 AutoEarnCloseDialog.kt\ncom/kubi/assets/autoearn/AutoEarnCloseDialog\n*L\n44#1:103,20\n47#1:123,15\n*E\n"})
public final class AutoEarnCloseDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    public final float f16545s0 = 0.75f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f16546t0 = C45681e.m100799e(this, new Function1<AutoEarnCloseDialog, C44843q>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44843q invoke(@NotNull AutoEarnCloseDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44843q.m99212a(fragment.requireView());
        }
    }, new Function1<C44843q, Unit>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44843q it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44843q c44843q) {
            invoke(c44843q);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f16547u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.autoearn.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoEarnCloseDialog.m15366r4(this.f16574b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f16548v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f16544x0 = {Reflection.property1(new PropertyReference1Impl(AutoEarnCloseDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogAutoEarnCloseBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f16543w0 = new Companion(null);

    /* JADX INFO: compiled from: AutoEarnCloseDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$Companion;", "", "<init>", "()V", "TAG", "", "create", "Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;", FirebaseAnalytics.Param.CURRENCY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ AutoEarnCloseDialog create$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            return companion.create(str);
        }

        @NotNull
        public final AutoEarnCloseDialog create(@NotNull String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            AutoEarnCloseDialog autoEarnCloseDialog = new AutoEarnCloseDialog();
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("CURRENCY", currency);
            autoEarnCloseDialog.setArguments(bundleBundleOf);
            return autoEarnCloseDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: t4 */
    private final String m15367t4() {
        return (String) this.f16547u0.getValue();
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF16545s0() {
        return this.f16545s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_auto_earn_close, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15368w4();
        m15376v4();
    }

    /* JADX INFO: renamed from: s4 */
    public final C44843q m15374s4() {
        return (C44843q) this.f16546t0.getValue(this, f16544x0[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final AutoEarnViewModel m15375u4() {
        return (AutoEarnViewModel) this.f16548v0.getValue();
    }

    public AutoEarnCloseDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewModels$default$2
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
        this.f16548v0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AutoEarnViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.autoearn.AutoEarnCloseDialog$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: r4 */
    public static final String m15366r4(AutoEarnCloseDialog autoEarnCloseDialog) {
        String string;
        Bundle arguments = autoEarnCloseDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("CURRENCY");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: w4 */
    private final void m15368w4() {
        C44843q c44843qM15374s4 = m15374s4();
        if (c44843qM15374s4 != null) {
            AppCompatImageView ivClose = c44843qM15374s4.f100650e;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.autoearn.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnCloseDialog.m15369x4(this.f16575b);
                }
            }, 1, null);
            KcPrimaryButton btnClose = c44843qM15374s4.f100648c;
            Intrinsics.checkNotNullExpressionValue(btnClose, "btnClose");
            C27046k.m66711z(btnClose, 0L, new Function0() { // from class: com.kubi.assets.autoearn.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnCloseDialog.m15370y4(this.f16576b);
                }
            }, 1, null);
            BaseTextView btnCancel = c44843qM15374s4.f100647b;
            Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
            C27046k.m66711z(btnCancel, 0L, new Function0() { // from class: com.kubi.assets.autoearn.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnCloseDialog.m15371z4(this.f16577b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m15369x4(AutoEarnCloseDialog autoEarnCloseDialog) {
        autoEarnCloseDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m15370y4(AutoEarnCloseDialog autoEarnCloseDialog) {
        autoEarnCloseDialog.m15375u4().m15424e(autoEarnCloseDialog.m15367t4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m15371z4(AutoEarnCloseDialog autoEarnCloseDialog) {
        autoEarnCloseDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m15376v4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AutoEarnCloseDialog$initEfforts$1(this, null), 3, null);
    }
}
