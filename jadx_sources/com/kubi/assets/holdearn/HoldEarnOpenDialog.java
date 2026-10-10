package com.kubi.assets.holdearn;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$font;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.event.api.C12572a;
import com.kubi.host.HostManager;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44729b0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
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

/* JADX INFO: compiled from: HoldEarnOpenDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u001e\u001a\u00020\u00002#\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aJ&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u001bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnOpenDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "preSpmId", "", "getPreSpmId", "()Ljava/lang/String;", "preSpmId$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/assets/holdearn/HoldEarnViewModel;", "getViewModel", "()Lcom/kubi/assets/holdearn/HoldEarnViewModel;", "viewModel$delegate", "onCloseListener", "Lkotlin/Function1;", "", "", "waitForSuccessDialogClose", "setOnCloseListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/ParameterName;", "name", "succ", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onResume", "setupViews", "initViewModel", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "isBottomSheet", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldEarnOpenDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldEarnOpenDialog.kt\ncom/kubi/assets/holdearn/HoldEarnOpenDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,214:1\n143#2,20:215\n106#3,15:235\n*S KotlinDebug\n*F\n+ 1 HoldEarnOpenDialog.kt\ncom/kubi/assets/holdearn/HoldEarnOpenDialog\n*L\n59#1:215,20\n62#1:235,15\n*E\n"})
public final class HoldEarnOpenDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    public final float f17728s0 = 0.9f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f17729t0 = C45681e.m100799e(this, new Function1<HoldEarnOpenDialog, C44729b0>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44729b0 invoke(@NotNull HoldEarnOpenDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44729b0.m98968a(fragment.requireView());
        }
    }, new Function1<C44729b0, Unit>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44729b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44729b0 c44729b0) {
            invoke(c44729b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f17730u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.holdearn.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HoldEarnOpenDialog.m17343C4(this.f17759b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f17731v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public Function1<? super Boolean, Unit> f17732w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f17733x0;

    /* JADX INFO: renamed from: z0 */
    public static final /* synthetic */ KProperty<Object>[] f17727z0 = {Reflection.property1(new PropertyReference1Impl(HoldEarnOpenDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenBinding;", 0))};

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public static final Companion f17726y0 = new Companion(null);

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final String f17724A0 = HostManager.a.m() + "/earn-h5/hold-to-earn?loading=2&isBanner=1&appNeedLang=true&openIntro=1";

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final String f17725B0 = "https://www.kucoin.com/support/48142946141339";

    /* JADX INFO: compiled from: HoldEarnOpenDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnOpenDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/holdearn/HoldEarnOpenDialog;", "preSpmId", "", "HELP_URL", "PROTOCOL_URL", "getPROTOCOL_URL", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HoldEarnOpenDialog create(@NotNull String preSpmId) {
            Intrinsics.checkNotNullParameter(preSpmId, "preSpmId");
            HoldEarnOpenDialog holdEarnOpenDialog = new HoldEarnOpenDialog();
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("pre_spm_id", preSpmId);
            holdEarnOpenDialog.setArguments(bundleBundleOf);
            return holdEarnOpenDialog;
        }

        @NotNull
        public final String getPROTOCOL_URL() {
            return HoldEarnOpenDialog.f17725B0;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m17346G4(C44729b0 c44729b0, final HoldEarnOpenDialog holdEarnOpenDialog) {
        if (c44729b0.f99599c.isChecked()) {
            holdEarnOpenDialog.m17365A4().m17388p(1);
            C43852m.m96590b("B9HoldToEarnTurnOnNowPopup", "turnOn", "1", TuplesKt.m90091to("app_mode", AssetExKt.m15129q() ? "lite" : ""));
        } else {
            HoldEarnOpenConfirmDialog holdEarnOpenConfirmDialogM17341o4 = HoldEarnOpenConfirmDialog.f17720s0.create().m17341o4(new Function0() { // from class: com.kubi.assets.holdearn.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenDialog.m17347H4(this.f17760b);
                }
            });
            FragmentManager childFragmentManager = holdEarnOpenDialog.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            holdEarnOpenConfirmDialogM17341o4.show(childFragmentManager, "HoldEarnOpenConfirmDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m17348I4(BaseTextView baseTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium));
        ds2.setColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m17349J4(HoldEarnOpenDialog holdEarnOpenDialog, View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, f17724A0, null, null, null, null, null, null, 126, null);
        holdEarnOpenDialog.m17365A4().m17387o().setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m17350K4(BaseTextView baseTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium));
        ds2.setColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m17351L4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, f17725B0, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: z4 */
    private final String m17364z4() {
        return (String) this.f17730u0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final HoldEarnViewModel m17365A4() {
        return (HoldEarnViewModel) this.f17731v0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: D4 */
    public final HoldEarnOpenDialog m17366D4(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f17732w0 = function1;
        return this;
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17737s0() {
        return this.f17728s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_hold_earn_open, container, false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f17733x0 || (function1 = this.f17732w0) == null) {
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m17344E4();
        m17342B4();
        C43852m.m96597i("B9HoldToEarnTurnOnNowPopup", m17364z4());
    }

    /* JADX INFO: renamed from: y4 */
    public final C44729b0 m17367y4() {
        return (C44729b0) this.f17729t0.getValue(this, f17727z0[0]);
    }

    public HoldEarnOpenDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewModels$default$2
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
        this.f17731v0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HoldEarnViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenDialog$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: B4 */
    private final void m17342B4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HoldEarnOpenDialog$initViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: C4 */
    public static final String m17343C4(HoldEarnOpenDialog holdEarnOpenDialog) {
        String string;
        Bundle arguments = holdEarnOpenDialog.getArguments();
        if (arguments != null && (string = arguments.getString("pre_spm_id")) != null) {
            return C27041f.m66668h(string);
        }
        return null;
    }

    /* JADX INFO: renamed from: E4 */
    private final void m17344E4() {
        final C44729b0 c44729b0M17367y4 = m17367y4();
        if (c44729b0M17367y4 != null) {
            AppCompatImageView ivClose = c44729b0M17367y4.f99602f;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.holdearn.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenDialog.m17345F4(this.f17753b);
                }
            }, 1, null);
            if (AssetExKt.m15129q()) {
                BaseTextView baseTextView = c44729b0M17367y4.f99604h;
                baseTextView.setText(getString(R$string.kc_lite_hold_earn_tip));
                baseTextView.setTextSize(14.0f);
                baseTextView.setTextAlignment(4);
            } else {
                final BaseTextView baseTextView2 = c44729b0M17367y4.f99604h;
                baseTextView2.setTextSize(12.0f);
                baseTextView2.setTextAlignment(5);
                baseTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                Intrinsics.checkNotNull(baseTextView2);
                highlightTextHelper.m54120f(baseTextView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.holdearn.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HoldEarnOpenDialog.m17348I4(baseTextView2, (TextPaint) obj);
                    }
                }, new View.OnClickListener() { // from class: com.kubi.assets.holdearn.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HoldEarnOpenDialog.m17349J4(this.f17755b, view);
                    }
                })));
            }
            final BaseTextView baseTextView3 = c44729b0M17367y4.f99605i;
            baseTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(baseTextView3);
            highlightTextHelper2.m54120f(baseTextView3, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.holdearn.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HoldEarnOpenDialog.m17350K4(baseTextView3, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.holdearn.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HoldEarnOpenDialog.m17351L4(view);
                }
            })));
            KcPrimaryButton btnOpen = c44729b0M17367y4.f99598b;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.assets.holdearn.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenDialog.m17346G4(c44729b0M17367y4, this);
                }
            }, 1, null);
            LinearLayout holdEarnTipsContainer = c44729b0M17367y4.f99601e;
            Intrinsics.checkNotNullExpressionValue(holdEarnTipsContainer, "holdEarnTipsContainer");
            AssetExKt.m15138z(holdEarnTipsContainer, !AssetExKt.m15129q());
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m17345F4(HoldEarnOpenDialog holdEarnOpenDialog) {
        holdEarnOpenDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m17347H4(HoldEarnOpenDialog holdEarnOpenDialog) {
        String str;
        holdEarnOpenDialog.m17365A4().m17388p(1);
        if (AssetExKt.m15129q()) {
            str = "lite";
        } else {
            str = "";
        }
        C43852m.m96590b("B9HoldToEarnTurnOnNowPopup", "turnOn", "1", TuplesKt.m90091to("app_mode", str));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (Intrinsics.areEqual(Boolean.TRUE, m17365A4().m17387o().getValue())) {
            C12572a.m23695d(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, 0L, 6, null);
            m17365A4().m17387o().setValue(Boolean.FALSE);
        }
    }
}
