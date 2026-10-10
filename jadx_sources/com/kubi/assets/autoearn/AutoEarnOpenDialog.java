package com.kubi.assets.autoearn;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$color;
import com.kubi.assets.R$font;
import com.kubi.assets.R$layout;
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
import p637ta.C44850r;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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

/* JADX INFO: compiled from: AutoEarnOpenDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "preSpmId", "", "getPreSpmId", "()Ljava/lang/String;", "preSpmId$delegate", "Lkotlin/Lazy;", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "currency$delegate", "viewModel", "Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "getViewModel", "()Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "initViewModel", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoEarnOpenDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnOpenDialog.kt\ncom/kubi/assets/autoearn/AutoEarnOpenDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,165:1\n143#2,20:166\n106#3,15:186\n*S KotlinDebug\n*F\n+ 1 AutoEarnOpenDialog.kt\ncom/kubi/assets/autoearn/AutoEarnOpenDialog\n*L\n66#1:166,20\n70#1:186,15\n*E\n"})
public final class AutoEarnOpenDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final String f16554A0;

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final String f16555B0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final String f16558z0;

    /* JADX INFO: renamed from: s0 */
    public final float f16559s0 = 1.0f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f16560t0 = C45681e.m100799e(this, new Function1<AutoEarnOpenDialog, C44850r>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44850r invoke(@NotNull AutoEarnOpenDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44850r.m99225a(fragment.requireView());
        }
    }, new Function1<C44850r, Unit>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44850r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44850r c44850r) {
            invoke(c44850r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f16561u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.autoearn.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoEarnOpenDialog.m15391D4(this.f16583b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f16562v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.autoearn.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutoEarnOpenDialog.m15409x4(this.f16584b);
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f16563w0;

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ KProperty<Object>[] f16557y0 = {Reflection.property1(new PropertyReference1Impl(AutoEarnOpenDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenBinding;", 0))};

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f16556x0 = new Companion(null);

    /* JADX INFO: compiled from: AutoEarnOpenDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;", FirebaseAnalytics.Param.CURRENCY, "", "preSpmId", "AUTO_EARN_PROTOCOL_URL", "getAUTO_EARN_PROTOCOL_URL", "()Ljava/lang/String;", "AUTO_EARN_MANAGE_URL", "getAUTO_EARN_MANAGE_URL", "PAGE_ID", "getPAGE_ID", "AUTO_EARN_STATE_REFRESH", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ AutoEarnOpenDialog create$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            return companion.create(str, str2);
        }

        @NotNull
        public final AutoEarnOpenDialog create(@NotNull String currency, @NotNull String preSpmId) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(preSpmId, "preSpmId");
            AutoEarnOpenDialog autoEarnOpenDialog = new AutoEarnOpenDialog();
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("pre_spm_id", preSpmId);
            bundleBundleOf.putString("CURRENCY", currency);
            autoEarnOpenDialog.setArguments(bundleBundleOf);
            return autoEarnOpenDialog;
        }

        @NotNull
        public final String getAUTO_EARN_MANAGE_URL() {
            return AutoEarnOpenDialog.f16554A0;
        }

        @NotNull
        public final String getAUTO_EARN_PROTOCOL_URL() {
            return AutoEarnOpenDialog.f16558z0;
        }

        @NotNull
        public final String getPAGE_ID() {
            return AutoEarnOpenDialog.f16555B0;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        HostManager hostManager = HostManager.a;
        sb2.append(hostManager.m());
        sb2.append("/earn-h5/lock/savingAgree?isBanner=1&loading=2&appNeedLang=true");
        f16558z0 = sb2.toString();
        f16554A0 = hostManager.m() + "/earn-h5/auto-earn?isBanner=1&appNeedLang=true";
        f16555B0 = "B9AutoEarnTurnOnNowPopup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public final AutoEarnViewModel m15389B4() {
        return (AutoEarnViewModel) this.f16563w0.getValue();
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m15394G4(BaseTextView baseTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium));
        ds2.setColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m15395H4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, f16558z0, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m15396I4(C44850r c44850r, final AutoEarnOpenDialog autoEarnOpenDialog) {
        if (c44850r.f100702c.isChecked()) {
            autoEarnOpenDialog.m15389B4().m15428o(autoEarnOpenDialog.m15410z4());
        } else {
            AutoEarnOpenConfirmDialog autoEarnOpenConfirmDialogM15387o4 = AutoEarnOpenConfirmDialog.f16550s0.create().m15387o4(new Function0() { // from class: com.kubi.assets.autoearn.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenDialog.m15397J4(this.f16589b);
                }
            });
            FragmentManager childFragmentManager = autoEarnOpenDialog.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            autoEarnOpenConfirmDialogM15387o4.show(childFragmentManager, "AutoEarnOpenDialog");
            C43852m.m96591c(f16555B0, "turnOn", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    private final String m15410z4() {
        return (String) this.f16562v0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final String m15411A4() {
        return (String) this.f16561u0.getValue();
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF19086s0() {
        return this.f16559s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_auto_earn_open, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15392E4();
        m15390C4();
        C43852m.m96597i(f16555B0, m15411A4());
    }

    /* JADX INFO: renamed from: y4 */
    public final C44850r m15412y4() {
        return (C44850r) this.f16560t0.getValue(this, f16557y0[0]);
    }

    public AutoEarnOpenDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewModels$default$2
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
        this.f16563w0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AutoEarnViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenDialog$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: C4 */
    private final void m15390C4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AutoEarnOpenDialog$initViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: D4 */
    public static final String m15391D4(AutoEarnOpenDialog autoEarnOpenDialog) {
        String string;
        Bundle arguments = autoEarnOpenDialog.getArguments();
        if (arguments != null && (string = arguments.getString("pre_spm_id")) != null) {
            return C27041f.m66668h(string);
        }
        return null;
    }

    /* JADX INFO: renamed from: E4 */
    private final void m15392E4() {
        final C44850r c44850rM15412y4 = m15412y4();
        if (c44850rM15412y4 != null) {
            AppCompatImageView ivClose = c44850rM15412y4.f100704e;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.autoearn.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenDialog.m15393F4(this.f16585b);
                }
            }, 1, null);
            final BaseTextView baseTextView = c44850rM15412y4.f100707h;
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(baseTextView);
            highlightTextHelper.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.autoearn.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoEarnOpenDialog.m15394G4(baseTextView, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.autoearn.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoEarnOpenDialog.m15395H4(view);
                }
            })));
            KcPrimaryButton btnOpen = c44850rM15412y4.f100701b;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.assets.autoearn.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenDialog.m15396I4(c44850rM15412y4, this);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m15393F4(AutoEarnOpenDialog autoEarnOpenDialog) {
        autoEarnOpenDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m15397J4(AutoEarnOpenDialog autoEarnOpenDialog) {
        autoEarnOpenDialog.m15389B4().m15428o(autoEarnOpenDialog.m15410z4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final String m15409x4(AutoEarnOpenDialog autoEarnOpenDialog) {
        String string;
        Bundle arguments = autoEarnOpenDialog.getArguments();
        if (arguments != null && (string = arguments.getString("CURRENCY")) != null) {
            return C27041f.m66668h(string);
        }
        return null;
    }
}
