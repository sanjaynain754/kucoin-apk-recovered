package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.C28137n;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSBottomSheetHandleView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.databinding.C28350o;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.InterfaceC28407M0;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.C28748n;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28752r;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.presentation.camera.C30360a;
import com.sumsub.sns.internal.features.presentation.camera.C30372e;
import com.sumsub.sns.internal.features.presentation.camera.C30378h;
import com.sumsub.sns.internal.features.presentation.camera.C30388m;
import com.sumsub.sns.internal.features.presentation.camera.C30390n;
import com.sumsub.sns.internal.features.presentation.camera.C30394p;
import com.sumsub.sns.internal.features.presentation.camera.C30745q;
import com.sumsub.sns.internal.features.presentation.camera.C30747r;
import com.sumsub.sns.internal.features.presentation.camera.C30751t;
import com.sumsub.sns.internal.features.presentation.camera.InterfaceC30798y;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/o;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/t;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/y;", "Lcom/sumsub/sns/internal/core/common/M0;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSelfieWithDocumentPickerFragment2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,135:1\n106#2,15:136\n*S KotlinDebug\n*F\n+ 1 SNSSelfieWithDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/selfie/SNSSelfieWithDocumentPickerFragment2\n*L\n35#1:136,15\n*E\n"})
public final class C30716l extends AbstractC28058F<C28350o, C30724t, C30729y> implements InterfaceC28407M0 {

    /* JADX INFO: renamed from: a */
    public final Lazy f62048a;

    /* JADX INFO: renamed from: b */
    public final C30394p f62049b;

    /* JADX INFO: renamed from: c */
    public final C30751t f62050c;

    /* JADX INFO: renamed from: d */
    public final Screen f62051d;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC30798y m70427a(C30716l c30716l) {
        return ((C30729y) c30716l.f62048a.getValue()).f62079d;
    }

    /* JADX INFO: renamed from: b */
    public static final C28651g m70430b(C30716l c30716l) {
        return ((C30729y) c30716l.f62048a.getValue()).f62080e;
    }

    /* JADX INFO: renamed from: c */
    public static final C30747r m70431c(C30716l c30716l) {
        return new C30747r(new C30372e(14), new C30360a(((C30729y) c30716l.f62048a.getValue()).f62077b, ((C30729y) c30716l.f62048a.getValue()).f62076a), 4);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m70432d(C30716l c30716l) {
        ((C30729y) c30716l.f62048a.getValue()).intent(C30722r.f62069a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m70433e(C30716l c30716l) {
        BottomSheetBehavior bottomSheetBehavior = c30716l.f62049b.f61154j;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final C30388m m70434f(C30716l c30716l) {
        return ((C30729y) c30716l.f62048a.getValue()).f62078c;
    }

    /* JADX INFO: renamed from: g */
    public static final ViewModelProvider.Factory m70435g(C30716l c30716l) {
        return new C30695A(c30716l, c30716l.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30716l.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return this.f62050c.f62127i.m69525u();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF65006c() {
        return ((C30729y) this.f62048a.getValue()).f62076a.f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return this.f62050c.f62127i.m69525u();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF65005b() {
        return this.f62051d;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30729y) this.f62048a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof C30718n)) {
            if (!(interfaceC28145r instanceof C28137n)) {
                super.handleEvent(interfaceC28145r);
                return;
            } else {
                this.f62050c.f62128j.m70201a((C28137n) interfaceC28145r);
                return;
            }
        }
        C30378h c30378h = this.f62050c.f62125g;
        C28746l c28746l = c30378h.f61116m;
        if (c28746l != null) {
            c28746l.m69574g();
        } else {
            C33272c.f67816e.f67810a.mo68956e(c30378h.f61111h, "takePicture: cameraX is null, aborting", null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m70436a((C30724t) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        BottomSheetBehavior bottomSheetBehavior = this.f62049b.f61154j;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            return super.onFinishCalled(abstractC28503w);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f62049b.f61154j;
        if (bottomSheetBehavior2 == null) {
            return false;
        }
        bottomSheetBehavior2.setState(4);
        return false;
    }

    @Override // com.sumsub.sns.internal.core.common.InterfaceC28407M0
    public final Boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.f62050c.f62129k.onKeyDown(i11, keyEvent);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_selfie_document_picker_v2, viewGroup, false);
        int i11 = R$id.sns_camera_preview_container;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
            int i12 = R$id.sns_dark_overlay;
            if (ViewBindings.findChildViewById(viewInflate, i12) != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i12 = R$id.sns_helper))) != null) {
                int i13 = R$id.sns_brief_details;
                if (((LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                    i13 = R$id.sns_divider;
                    if (((SNSBottomSheetHandleView) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                        i13 = R$id.sns_helper_brief;
                        if (((SNSBodyTextView) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                            i13 = R$id.sns_helper_details;
                            if (((SNSBodyTextView) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                                i13 = R$id.sns_helper_details_frame;
                                if (((FrameLayout) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                                    i13 = R$id.sns_helper_title;
                                    if (((SNSH2TextView) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                                        i13 = R$id.sns_intro_content;
                                        if (((NestedScrollView) ViewBindings.findChildViewById(viewFindChildViewById, i13)) != null) {
                                            return new C28350o(coordinatorLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i13)));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C30716l() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70435g(this.f62039b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30711h(new C30709g(this)));
        this.f62048a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30729y.class), new C30713i(lazy), new C30714j(lazy), function0);
        this.f62049b = new C30394p(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70434f(this.f62047b);
            }
        }, new C30390n());
        this.f62050c = new C30751t(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70427a(this.f62030b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70430b(this.f62032b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70431c(this.f62034b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30716l.m70428a(this.f62036b, (InterfaceC28752r) obj);
            }
        }, new C30745q(null), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70432d(this.f62038b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30716l.m70433e(this.f62040b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30716l.m70429a(this.f62042b, (C29054T) obj);
            }
        });
        this.f62051d = AbstractC28047a.m69058a(this);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70429a(C30716l c30716l, C29054T c29054t) {
        ((C30729y) c30716l.f62048a.getValue()).intent(new C30720p(c29054t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70428a(C30716l c30716l, InterfaceC28752r interfaceC28752r) {
        if (interfaceC28752r instanceof C28748n) {
            ((C30729y) c30716l.f62048a.getValue()).intent(new C30721q(((C28748n) interfaceC28752r).f58480a));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70436a(C30724t c30724t) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "handleState: " + c30724t, null);
        C30751t c30751t = this.f62050c;
        c30724t.getClass();
        c30751t.m70447a(false);
    }
}
