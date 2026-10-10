package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSBackgroundView;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSFileItemView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28339d;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30808G;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30823g;
import com.sumsub.sns.internal.features.presentation.common.C30843t;
import com.sumsub.sns.internal.features.presentation.common.C30844u;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.utils.C32663n;
import com.sumsub.sns.internal.features.presentation.utils.C32664o;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;", "Lcom/sumsub/sns/internal/features/presentation/common/g;", "Lcom/sumsub/sns/databinding/d;", "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/p;", "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSBankCardUploadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSBankCardUploadFragment.kt\ncom/sumsub/sns/internal/features/presentation/paymentmethod/upload/SNSBankCardUploadFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,179:1\n106#2,15:180\n256#3,2:195\n256#3,2:197\n256#3,2:199\n256#3,2:201\n256#3,2:203\n27#4,4:205\n27#4,4:209\n*S KotlinDebug\n*F\n+ 1 SNSBankCardUploadFragment.kt\ncom/sumsub/sns/internal/features/presentation/paymentmethod/upload/SNSBankCardUploadFragment\n*L\n42#1:180,15\n101#1:195,2\n102#1:197,2\n103#1:199,2\n150#1:201,2\n160#1:203,2\n33#1:205,4\n38#1:209,4\n*E\n"})
public final class C31428h extends AbstractC30823g<C28339d, AbstractC31436p, C31442v> {

    /* JADX INFO: renamed from: e */
    public final Lazy f63681e = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C31428h.m70720a(this.f63745b);
        }
    });

    /* JADX INFO: renamed from: f */
    public final Lazy f63682f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C31428h.m70722b(this.f63746b);
        }
    });

    /* JADX INFO: renamed from: g */
    public final Lazy f63683g;

    /* JADX INFO: renamed from: h */
    public final String f63684h;

    /* JADX INFO: renamed from: i */
    public final Screen f63685i;

    /* JADX INFO: renamed from: a */
    public static final Document m70720a(C31428h c31428h) {
        Document document;
        Bundle arguments = c31428h.getArguments();
        if (arguments == null || (document = (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null)) == null) {
            throw new IllegalStateException("Document argument is required");
        }
        return document;
    }

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider.Factory m70723c(C31428h c31428h) {
        return new C31443w((Document) c31428h.f63681e.getValue(), (PhotosAmount) c31428h.f63682f.getValue(), c31428h, c31428h.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31428h.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF65912b() {
        return this.f63684h;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF65911a() {
        return this.f63685i;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31442v) this.f63683g.getValue();
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof C31429i)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70608a(((C31429i) interfaceC28145r).f63686a.getType());
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        AbstractC31436p abstractC31436p = (AbstractC31436p) abstractC28081V;
        if (!(abstractC31436p instanceof C31435o)) {
            throw new NoWhenBranchMatchedException();
        }
        m70724a((C31435o) abstractC31436p);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_bank_card_upload, viewGroup, false);
        int i11 = R$id.sns_bank_card_bottom_sheet;
        SNSCommonBottomSheetView sNSCommonBottomSheetView = (SNSCommonBottomSheetView) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSCommonBottomSheetView != null) {
            i11 = R$id.sns_body;
            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSSubtitle2TextView != null) {
                i11 = R$id.sns_container;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_disclaimer;
                    SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSCaptionTextView != null) {
                        i11 = R$id.sns_file1;
                        SNSFileItemView sNSFileItemView = (SNSFileItemView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSFileItemView != null) {
                            i11 = R$id.sns_file2;
                            SNSFileItemView sNSFileItemView2 = (SNSFileItemView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSFileItemView2 != null) {
                                i11 = R$id.sns_file_formats_text_view;
                                SNSCaptionTextView sNSCaptionTextView2 = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSCaptionTextView2 != null) {
                                    i11 = R$id.sns_guideline_end;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                        i11 = R$id.sns_guideline_start;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                            i11 = R$id.sns_primary_button;
                                            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                                            if (sNSPrimaryButton != null) {
                                                i11 = R$id.sns_scroller;
                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i11);
                                                if (scrollView != null) {
                                                    i11 = R$id.sns_subtitle;
                                                    SNSSubtitle2TextView sNSSubtitle2TextView2 = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                                    if (sNSSubtitle2TextView2 != null) {
                                                        i11 = R$id.sns_title;
                                                        SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                                        if (sNSH1TextView != null) {
                                                            i11 = R$id.sns_toolbar;
                                                            if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                                                return new C28339d((SNSBackgroundView) viewInflate, sNSCommonBottomSheetView, sNSSubtitle2TextView, sNSCaptionTextView, sNSFileItemView, sNSFileItemView2, sNSCaptionTextView2, sNSPrimaryButton, scrollView, sNSSubtitle2TextView2, sNSH1TextView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public C31428h() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31428h.m70723c(this.f63747b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31424d(new C31423c(this)));
        this.f63683g = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31442v.class), new C31425e(lazy), new C31426f(lazy), function0);
        this.f63684h = "PAYMENT_METHODS";
        this.f63685i = Screen.PaymentMethodsBankCardUploadScreen;
    }

    /* JADX INFO: renamed from: b */
    public static final PhotosAmount m70722b(C31428h c31428h) {
        PhotosAmount photosAmount;
        Bundle arguments = c31428h.getArguments();
        if (arguments != null && (photosAmount = (PhotosAmount) AbstractC28437b.m69320a(arguments, "ARGS_PHOTOS_AMOUNT", PhotosAmount.class, null)) != null) {
            return photosAmount;
        }
        return PhotosAmount.SOME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g
    /* JADX INFO: renamed from: f */
    public final SNSCommonBottomSheetView mo70492f() {
        C28339d c28339d = (C28339d) getViewBinding();
        if (c28339d != null) {
            return c28339d.f57703b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        SNSCommonBottomSheetView sNSCommonBottomSheetView;
        SNSCommonBottomSheetView sNSCommonBottomSheetView2;
        C28339d c28339d = (C28339d) getViewBinding();
        if (c28339d != null && (sNSCommonBottomSheetView = c28339d.f57703b) != null && !sNSCommonBottomSheetView.isHidden()) {
            C28339d c28339d2 = (C28339d) getViewBinding();
            if (c28339d2 != null && (sNSCommonBottomSheetView2 = c28339d2.f57703b) != null) {
                sNSCommonBottomSheetView2.hide();
                return false;
            }
            return false;
        }
        return super.onFinishCalled(abstractC28503w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g, com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSFileItemView sNSFileItemView;
        super.onViewCreated(view, bundle);
        C32664o c32664o = this.f62261c;
        C28339d c28339d = (C28339d) getViewBinding();
        SNSFileItemView sNSFileItemView2 = null;
        if (c28339d != null) {
            sNSFileItemView = c28339d.f57706e;
        } else {
            sNSFileItemView = null;
        }
        C28339d c28339d2 = (C28339d) getViewBinding();
        if (c28339d2 != null) {
            sNSFileItemView2 = c28339d2.f57707f;
        }
        c32664o.m71288a(sNSFileItemView, sNSFileItemView2);
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g
    /* JADX INFO: renamed from: a */
    public final void mo70491a(int i11) {
        ((C31442v) this.f63683g.getValue()).intent(new C31430j(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m70724a(final C31435o c31435o) {
        final C28339d c28339d = (C28339d) getViewBinding();
        if (c28339d != null) {
            c28339d.f57712k.setVisibility(0);
            c28339d.f57711j.setVisibility(0);
            c28339d.f57710i.setVisibility(0);
            c28339d.f57712k.setText(c31435o.f63704a);
            c28339d.f57711j.setText(c31435o.f63705b);
            c28339d.f57704c.setText(c31435o.f63706c);
            AbstractC28458h.m69341a(c28339d.f57705d, c31435o.f63707d);
            c28339d.f57709h.setText(c31435o.f63709f.f63688a);
            c28339d.f57709h.setEnabled(c31435o.f63709f.f63689b != null);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31428h.m70721a(this.f63678b, c31435o, c28339d);
                }
            }, c28339d.f57709h);
            C31433m c31433m = c31435o.f63708e;
            c28339d.f57708g.setText(c31433m.f63698b);
            C31432l c31432l = c31433m.f63697a;
            C32663n c32663n = new C32663n(c31432l.f63690a, c31432l.f63691b, c31432l.f63692c, c31432l.f63693d, c31432l.f63694e, c31432l.f63695f, c31432l.f63696g);
            SNSFileItemView sNSFileItemView = c28339d.f57706e;
            C31434n c31434n = c31433m.f63699c;
            this.f62261c.m71287a(sNSFileItemView, c31434n.f63701a, c31434n.f63703c, c31434n.f63702b, c32663n);
            sNSFileItemView.setVisibility(0);
            sNSFileItemView.setEnabled(true);
            SNSFileItemView sNSFileItemView2 = c28339d.f57707f;
            C31434n c31434n2 = c31433m.f63700d;
            if (c31434n2 == null) {
                sNSFileItemView2.setVisibility(8);
                return;
            }
            this.f62261c.m71287a(sNSFileItemView2, c31434n2.f63701a, c31434n2.f63703c, c31434n2.f63702b, c32663n);
            sNSFileItemView2.setVisibility(0);
            sNSFileItemView2.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70721a(C31428h c31428h, C31435o c31435o, C28339d c28339d) {
        C28367f.m69256a(c31428h.getAnalyticsDelegate(), Control.ContinueButton, (Map) null, (Popup) null, 6);
        EnumC31420x33e3abfe enumC31420x33e3abfe = c31435o.f63709f.f63689b;
        if (enumC31420x33e3abfe != null) {
            int i11 = AbstractC31422b.f63673a[enumC31420x33e3abfe.ordinal()];
            if (i11 == 1) {
                ((C31442v) c31428h.f63683g.getValue()).intent(C30844u.f62290a);
            } else if (i11 == 2) {
                ((AbstractC30808G) c31428h.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30843t(c28339d.f57709h.getId()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
