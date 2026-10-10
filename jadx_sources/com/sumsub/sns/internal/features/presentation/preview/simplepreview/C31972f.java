package com.sumsub.sns.internal.features.presentation.preview.simplepreview;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28322B;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.domain.documents.C30110D;
import com.sumsub.sns.internal.features.domain.documents.C30112F;
import com.sumsub.sns.internal.features.domain.documents.C30114H;
import com.sumsub.sns.internal.features.domain.documents.C30116J;
import java.io.File;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.simplepreview.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/B;", "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/h;", "Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/k;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSimpleDocumentPreviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSimpleDocumentPreviewFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/simplepreview/SNSSimpleDocumentPreviewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,163:1\n106#2,15:164\n256#3,2:179\n256#3,2:181\n256#3,2:183\n*S KotlinDebug\n*F\n+ 1 SNSSimpleDocumentPreviewFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/simplepreview/SNSSimpleDocumentPreviewFragment\n*L\n45#1:164,15\n125#1:179,2\n126#1:181,2\n127#1:183,2\n*E\n"})
public final class C31972f extends AbstractC28058F<C28322B, AbstractC31974h, C31977k> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f65003U = 0;

    /* JADX INFO: renamed from: a */
    public final Lazy f65004a;

    /* JADX INFO: renamed from: b */
    public final Screen f65005b;

    /* JADX INFO: renamed from: c */
    public final String f65006c;

    /* JADX INFO: renamed from: d */
    public Integer f65007d;

    /* JADX INFO: renamed from: a */
    public static final void m70967a(C31972f c31972f, View view) {
        SNSRotationZoomableImageView sNSRotationZoomableImageView;
        SNSRotationZoomableImageView sNSRotationZoomableImageView2;
        C28322B viewBinding = c31972f.getViewBinding();
        if (viewBinding != null && (sNSRotationZoomableImageView2 = viewBinding.f57624c) != null) {
            sNSRotationZoomableImageView2.rotateCCW();
        }
        C28322B viewBinding2 = c31972f.getViewBinding();
        c31972f.f65007d = (viewBinding2 == null || (sNSRotationZoomableImageView = viewBinding2.f57624c) == null) ? null : Integer.valueOf(sNSRotationZoomableImageView.getRotation());
    }

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider.Factory m70969c(C31972f c31972f) {
        Bundle arguments = c31972f.getArguments();
        return new C31978l(arguments != null ? (C30110D) arguments.getParcelable("image_data") : null, c31972f, c31972f.getArguments(), c31972f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF64225b() {
        return this.f65006c;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF62065t() {
        return this.f65005b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31977k) this.f65004a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m70971a((AbstractC31974h) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_layout_simple_document_viewer, viewGroup, false);
        int i11 = R$id.sns_bottom_sheet;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i11);
        if (constraintLayout != null) {
            i11 = R$id.sns_image_view;
            SNSRotationZoomableImageView sNSRotationZoomableImageView = (SNSRotationZoomableImageView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSRotationZoomableImageView != null) {
                i11 = R$id.sns_primary_button;
                SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSPrimaryButton != null) {
                    i11 = R$id.sns_secondary_button;
                    SNSSecondaryButton sNSSecondaryButton = (SNSSecondaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSSecondaryButton != null) {
                        i11 = R$id.sns_toolbar;
                        SNSToolbarView sNSToolbarView = (SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSToolbarView != null) {
                            i11 = R$id.sns_warning_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (imageView != null) {
                                i11 = R$id.sns_warning_message;
                                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSSubtitle2TextView != null) {
                                    return new C28322B((ConstraintLayout) viewInflate, constraintLayout, sNSRotationZoomableImageView, sNSPrimaryButton, sNSSecondaryButton, sNSToolbarView, imageView, sNSSubtitle2TextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C31972f() {
        Integer num;
        String string;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.simplepreview.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31972f.m70969c(this.f65002b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31968b(new C31967a(this)));
        this.f65004a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31977k.class), new C31969c(lazy), new C31970d(lazy), function0);
        this.f65005b = Screen.DocumentPreviewScreen;
        Bundle arguments = getArguments();
        this.f65006c = (arguments == null || (string = arguments.getString("doc_set_type")) == null) ? "TYPE_UNKNOWN" : string;
        C30110D c30110dM70972f = m70972f();
        if (c30110dM70972f != null) {
            num = c30110dM70972f.f60544c;
        } else {
            num = null;
        }
        this.f65007d = num;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70968b(C31972f c31972f) {
        Map mapMapOf;
        C28367f analyticsDelegate = c31972f.getAnalyticsDelegate();
        Control control = Control.ConfirmButton;
        C30110D c30110dM70972f = c31972f.m70972f();
        if (c30110dM70972f == null) {
            mapMapOf = MapsKt.emptyMap();
        } else {
            mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("isFromGallery", Boolean.valueOf(c30110dM70972f.f60543b)));
        }
        C28367f.m69256a(analyticsDelegate, control, mapMapOf, (Popup) null, 4);
        AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(c31972f, 0, c31972f.m70970a(false, false), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX INFO: renamed from: a */
    public final Bundle m70970a(boolean z11, boolean z12) {
        Object c30116j;
        Integer num;
        if (z11) {
            C30110D c30110dM70972f = m70972f();
            File file = c30110dM70972f != null ? c30110dM70972f.f60542a : null;
            C30110D c30110dM70972f2 = m70972f();
            c30116j = new C30114H(file, c30110dM70972f2 != null ? c30110dM70972f2.f60543b : false);
        } else if (z12) {
            C30110D c30110dM70972f3 = m70972f();
            c30116j = new C30112F(c30110dM70972f3 != null ? c30110dM70972f3.f60542a : null);
        } else {
            Integer num2 = this.f65007d;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                C30110D c30110dM70972f4 = m70972f();
                if (c30110dM70972f4 != null && (num = c30110dM70972f4.f60544c) != null && iIntValue == num.intValue()) {
                    num2 = null;
                }
            } else {
                num2 = null;
            }
            C30110D c30110dM70972f5 = m70972f();
            c30116j = new C30116J(c30110dM70972f5 != null ? c30110dM70972f5.f60542a : null, num2);
        }
        return BundleKt.bundleOf(TuplesKt.m90091to("result_data", c30116j));
    }

    /* JADX INFO: renamed from: f */
    public final C30110D m70972f() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (C30110D) arguments.getParcelable("image_data");
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        C30110D c30110dM70972f = m70972f();
        if (c30110dM70972f == null) {
            return MapsKt.emptyMap();
        }
        return MapsKt.mapOf(TuplesKt.m90091to("isFromGallery", Boolean.valueOf(c30110dM70972f.f60543b)));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z11;
        float dimensionPixelSize;
        int color;
        Integer numM69172a;
        super.onViewCreated(view, bundle);
        C28322B viewBinding = getViewBinding();
        if (viewBinding != null) {
            ConstraintLayout constraintLayout = viewBinding.f57623b;
            Float fM69170a = AbstractC28233a.m69170a(SNSMetricElement.BOTTOM_SHEET_CORNER_RADIUS);
            if (fM69170a != null) {
                dimensionPixelSize = fM69170a.floatValue();
            } else {
                dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R$dimen.sns_bottom_sheet_corner_radius);
            }
            C28966p c28966pM69169a = AbstractC28233a.m69169a();
            if (c28966pM69169a != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, SNSColorElement.BOTTOM_SHEET_BACKGROUND, AbstractC28458h.m69346a(constraintLayout.getResources().getConfiguration()))) != null) {
                color = numM69172a.intValue();
            } else {
                color = ContextCompat.getColor(requireContext(), R$color.sns_bottomSheetBackground);
            }
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().toBuilder().setTopLeftCorner(0, dimensionPixelSize).setTopRightCorner(0, dimensionPixelSize).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            constraintLayout.setBackground(materialShapeDrawable);
        }
        C28322B viewBinding2 = getViewBinding();
        if (viewBinding2 != null) {
            SNSToolbarView sNSToolbarView = viewBinding2.f57627f;
            sNSToolbarView.setOptionButtonDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(sNSToolbarView.getContext(), SNSIconHandler.SNSCommonIcons.ROTATE_CCW.getImageName()));
            sNSToolbarView.setOnOptionButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.simplepreview.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31972f.m70967a(this.f65020b, view2);
                }
            });
            C30110D c30110dM70972f = m70972f();
            if (c30110dM70972f != null && !c30110dM70972f.f60543b) {
                z11 = true;
            } else {
                z11 = false;
            }
            sNSToolbarView.setOptionButtonVisible(z11);
            sNSToolbarView.setIconTintList(ColorStateList.valueOf(-1));
            sNSToolbarView.setOptionButtonTintList(ColorStateList.valueOf(-1));
        }
        setResult(0, m70970a(true, true));
    }

    /* JADX INFO: renamed from: a */
    public final void m70971a(AbstractC31974h abstractC31974h) {
        C28322B viewBinding = getViewBinding();
        if (viewBinding != null) {
            if (abstractC31974h instanceof C31973g) {
                C31973g c31973g = (C31973g) abstractC31974h;
                viewBinding.f57624c.setImageBitmap(c31973g.f65008a);
                viewBinding.f57625d.setText(c31973g.f65009b);
                viewBinding.f57626e.setText(c31973g.f65010c);
                viewBinding.f57626e.setVisibility(0);
                viewBinding.f57628g.setVisibility(8);
                viewBinding.f57629h.setVisibility(8);
                AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.simplepreview.n
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C31972f.m70966a(this.f65021b);
                    }
                }, viewBinding.f57626e);
                AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.simplepreview.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C31972f.m70968b(this.f65022b);
                    }
                }, viewBinding.f57625d);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70966a(C31972f c31972f) {
        C28367f analyticsDelegate = c31972f.getAnalyticsDelegate();
        Control control = Control.RetakeButton;
        C30110D c30110dM70972f = c31972f.m70972f();
        C28367f.m69256a(analyticsDelegate, control, c30110dM70972f == null ? MapsKt.emptyMap() : MapsKt.mapOf(TuplesKt.m90091to("isFromGallery", Boolean.valueOf(c30110dM70972f.f60543b))), (Popup) null, 4);
        AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(c31972f, 0, c31972f.m70970a(true, false), 1, null);
        return Unit.INSTANCE;
    }
}
