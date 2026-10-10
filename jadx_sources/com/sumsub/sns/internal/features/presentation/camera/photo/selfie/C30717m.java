package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;", "Lcom/sumsub/sns/internal/features/presentation/camera/K;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/z;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/camera/photo/selfie/a", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSelfieWithDocumentPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,62:1\n106#2,15:63\n*S KotlinDebug\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment\n*L\n21#1:63,15\n*E\n"})
public final class C30717m extends AbstractC30348K<C30730z> {

    /* JADX INFO: renamed from: i */
    public final Lazy f62054i;

    /* JADX INFO: renamed from: j */
    public final C28404L f62055j;

    /* JADX INFO: renamed from: k */
    public final C28404L f62056k;

    /* JADX INFO: renamed from: l */
    public final C28404L f62057l;

    /* JADX INFO: renamed from: m */
    public final C28404L f62058m;

    /* JADX INFO: renamed from: n */
    public final C28404L f62059n;

    /* JADX INFO: renamed from: o */
    public final C28404L f62060o;

    /* JADX INFO: renamed from: p */
    public final C28404L f62061p;

    /* JADX INFO: renamed from: q */
    public final C28404L f62062q;

    /* JADX INFO: renamed from: r */
    public final C28404L f62063r;

    /* JADX INFO: renamed from: s */
    public final C28404L f62064s;

    /* JADX INFO: renamed from: t */
    public final Screen f62065t;

    /* JADX INFO: renamed from: u */
    public final boolean f62066u;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ KProperty[] f62053w = {AbstractC28118g.m69077a(C30717m.class, "rootView", "getRootView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30717m.class, "takePictureProgressView", "getTakePictureProgressView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30717m.class, "takePictureViewContainer", "getTakePictureViewContainer()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30717m.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30717m.class, "toolbar", "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0), AbstractC28118g.m69077a(C30717m.class, "progressBar", "getProgressBar()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30717m.class, "helperView", "getHelperView()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30717m.class, "helperTitle", "getHelperTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30717m.class, "helperBrief", "getHelperBrief()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30717m.class, "helperDetails", "getHelperDetails()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30717m.class, "helperDetailsFrame", "getHelperDetailsFrame()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30717m.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30717m.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0)};

    /* JADX INFO: renamed from: v */
    public static final C30697a f62052v = new C30697a();

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: n */
    public final boolean getF61467H() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70437a(C30717m c30717m) {
        return new C30696B(c30717m, c30717m.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30717m.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF64225b() {
        return ((C30730z) this.f62054i.getValue()).f61055a.f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_selfie_document_picker);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF64324g() {
        return this.f62065t;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30730z) this.f62054i.getValue();
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: h */
    public final View mo70224h() {
        return (View) this.f62063r.getValue(this, f62053w[11]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: i */
    public final TextView mo70225i() {
        return (TextView) this.f62061p.getValue(this, f62053w[8]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: j */
    public final TextView mo70226j() {
        return (TextView) this.f62062q.getValue(this, f62053w[9]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: k */
    public final TextView mo70227k() {
        return (TextView) this.f62060o.getValue(this, f62053w[7]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: l */
    public final ViewGroup mo70228l() {
        return (ViewGroup) this.f62059n.getValue(this, f62053w[6]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: m */
    public final PreviewView mo70229m() {
        return (PreviewView) this.f62064s.getValue(this, f62053w[12]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: o */
    public final View mo70231o() {
        return (View) this.f62057l.getValue(this, f62053w[3]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: p */
    public final View mo70232p() {
        return (View) this.f62055j.getValue(this, f62053w[1]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: r */
    public final View mo70234r() {
        return (View) this.f62056k.getValue(this, f62053w[2]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: s */
    public final SNSToolbarView mo70235s() {
        return (SNSToolbarView) this.f62058m.getValue(this, f62053w[4]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getF62066u() {
        return this.f62066u;
    }

    public C30717m() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30717m.m70437a(this.f62044b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30701c(new C30699b(this)));
        this.f62054i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30730z.class), new C30703d(lazy), new C30705e(lazy), function0);
        this.f62055j = new C28404L(R$id.sns_primary_button_progress);
        this.f62056k = new C28404L(R$id.sns_primary_button);
        this.f62057l = new C28404L(R$id.sns_gallery);
        this.f62058m = new C28404L(R$id.sns_toolbar);
        this.f62059n = new C28404L(R$id.sns_helper);
        this.f62060o = new C28404L(R$id.sns_helper_title);
        this.f62061p = new C28404L(R$id.sns_helper_brief);
        this.f62062q = new C28404L(R$id.sns_helper_details);
        this.f62063r = new C28404L(R$id.sns_dark_overlay);
        this.f62064s = new C28404L(R$id.sns_camera_preview);
        this.f62065t = AbstractC28047a.m69058a(this);
        this.f62066u = true;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: q */
    public final View mo70233q() {
        View viewMo70234r = mo70234r();
        if (viewMo70234r != null) {
            return viewMo70234r.findViewById(R$id.sns_button);
        }
        return null;
    }
}
