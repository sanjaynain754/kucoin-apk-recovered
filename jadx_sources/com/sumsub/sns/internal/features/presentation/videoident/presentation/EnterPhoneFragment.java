package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28358w;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.features.presentation.verification2.phone.C32853c;
import com.sumsub.sns.internal.features.presentation.verification2.phone.C32857e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00048PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/w;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;", "<init>", "()V", "", "onSubmitInternal", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "provideViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/w;", "state", "Landroid/os/Bundle;", "savedInstanceState", "handleSuccessState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/r;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/r;)V", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;", "viewModel", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;", "phoneNumberHandler", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEnterPhoneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterPhoneFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,77:1\n106#2,15:78\n*S KotlinDebug\n*F\n+ 1 EnterPhoneFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment\n*L\n21#1:78,15\n*E\n"})
public final class EnterPhoneFragment extends AbstractC28058F<C28358w, EnterPhoneViewModel.ViewState, EnterPhoneViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C32857e phoneNumberHandler;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final EnterPhoneFragment newInstance() {
            return new EnterPhoneFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0(EnterPhoneFragment enterPhoneFragment) {
        return new EnterPhoneViewModelFactory(enterPhoneFragment);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    /* JADX INFO: renamed from: getIdDocSetType */
    public String getF66519e() {
        return "VIDEO_IDENT";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    /* JADX INFO: renamed from: getScreen */
    public Screen getF63626a() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public EnterPhoneViewModel getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (EnterPhoneViewModel) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleEvent(@NotNull InterfaceC28145r event) {
        if (event instanceof EnterPhoneViewModel.SetResult) {
            AbstractC28133l.setResult$default(this, 0, null, 3, null);
        } else {
            super.handleEvent(event);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public void handleSuccessState(@NotNull EnterPhoneViewModel.ViewState state, @Nullable Bundle savedInstanceState) {
        C28358w viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        viewBinding.f57814e.setText(state.getTitle());
        viewBinding.f57813d.setText(state.getSubtitle());
        SNSPrimaryButton sNSPrimaryButton = viewBinding.f57812c;
        EnterPhoneViewModel.ButtonState primaryButton = state.getPrimaryButton();
        sNSPrimaryButton.setText(primaryButton != null ? primaryButton.getText() : null);
        SNSPrimaryButton sNSPrimaryButton2 = viewBinding.f57812c;
        EnterPhoneViewModel.ButtonState primaryButton2 = state.getPrimaryButton();
        sNSPrimaryButton2.setEnabled(primaryButton2 != null ? primaryButton2.getEnabled() : false);
        AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnterPhoneFragment.handleSuccessState$lambda$3(this.f67373b);
            }
        }, viewBinding.f57812c);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    @NotNull
    public C28358w provideViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        View viewInflate = inflater.inflate(R$layout.sns_fragment_video_ident_enter_phone, container, false);
        int i11 = R$id.sns_guideline_end;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_guideline_start;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_phone;
                if (((SNSFlaggedInputLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_phone_id;
                    SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSTextInputEditText != null) {
                        i11 = R$id.sns_primary_button;
                        SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSPrimaryButton != null) {
                            i11 = R$id.sns_subtitle;
                            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSSubtitle2TextView != null) {
                                i11 = R$id.sns_title;
                                SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSH1TextView != null) {
                                    i11 = R$id.sns_toolbar;
                                    if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                        return new C28358w((SNSBackgroundConstraintLayout) viewInflate, sNSTextInputEditText, sNSPrimaryButton, sNSSubtitle2TextView, sNSH1TextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public EnterPhoneFragment() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnterPhoneFragment.viewModel_delegate$lambda$0(this.f67376b);
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function2 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EnterPhoneViewModel.class), new Function0<ViewModelStore>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
        this.phoneNumberHandler = new C32857e(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnterPhoneFragment.phoneNumberHandler$lambda$1(this.f67378b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnterPhoneFragment.phoneNumberHandler$lambda$2(this.f67381b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSuccessState$lambda$3(EnterPhoneFragment enterPhoneFragment) {
        enterPhoneFragment.onSubmitInternal();
        return Unit.INSTANCE;
    }

    private final void onSubmitInternal() {
        SNSTextInputEditText sNSTextInputEditText;
        SNSPrimaryButton sNSPrimaryButton;
        C28358w viewBinding = getViewBinding();
        if (viewBinding != null && (sNSPrimaryButton = viewBinding.f57812c) != null) {
            sNSPrimaryButton.setEnabled(false);
        }
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().onSubmit();
        C28358w viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (sNSTextInputEditText = viewBinding2.f57811b) != null) {
            AbstractC28458h.m69339a((View) sNSTextInputEditText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32853c phoneNumberHandler$lambda$1(EnterPhoneFragment enterPhoneFragment) {
        return enterPhoneFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().getPhoneNumberController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit phoneNumberHandler$lambda$2(EnterPhoneFragment enterPhoneFragment) {
        enterPhoneFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onSubmit();
        return Unit.INSTANCE;
    }
}
