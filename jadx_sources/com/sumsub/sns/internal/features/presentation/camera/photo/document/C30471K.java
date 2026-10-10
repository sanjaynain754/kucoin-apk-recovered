package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSDocBoundsCheckResultView;
import com.sumsub.sns.core.widget.SNSProgressBarView;
import com.sumsub.sns.core.widget.SNSSegmentedToggleView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.core.widget.camera.SNSFrameViewWithBackground;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28470l;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.C28757w;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K;
import com.sumsub.sns.internal.features.presentation.camera.C30345H;
import com.sumsub.sns.internal.features.presentation.camera.C30351N;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.autocapture.C33308b;
import com.sumsub.sns.internal.p126ml.autocapture.C33310d;
import com.sumsub.sns.internal.p126ml.docdetector.C33350a;
import com.tencent.bugly.proguard.C33627eb;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;", "Lcom/sumsub/sns/internal/features/presentation/camera/K;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/camera/photo/document/m", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPhotoDocumentPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPhotoDocumentPickerFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 6 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,873:1\n106#2,15:874\n1#3:889\n277#4,2:890\n298#4,2:892\n256#4,2:894\n254#4:896\n277#4,2:897\n256#4,2:899\n256#4,2:901\n256#4,2:903\n256#4,2:905\n277#4,2:907\n298#4,2:909\n256#4,2:911\n254#4:913\n254#4:914\n81#4:915\n256#4,2:916\n310#4:918\n326#4,4:919\n311#4:923\n298#4,2:930\n256#4,2:932\n256#4,2:934\n256#4,2:936\n256#4,2:938\n256#4,2:940\n277#4,2:942\n256#4,2:945\n277#4,2:947\n256#4,2:949\n90#5,6:924\n337#6:944\n*S KotlinDebug\n*F\n+ 1 SNSPhotoDocumentPickerFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerFragment\n*L\n93#1:874,15\n206#1:890,2\n207#1:892,2\n226#1:894,2\n321#1:896\n324#1:897,2\n369#1:899,2\n385#1:901,2\n402#1:903,2\n431#1:905,2\n433#1:907,2\n458#1:909,2\n476#1:911,2\n492#1:913\n538#1:914\n539#1:915\n566#1:916,2\n581#1:918\n581#1:919,4\n581#1:923\n725#1:930,2\n731#1:932,2\n746#1:934,2\n747#1:936,2\n757#1:938,2\n766#1:940,2\n781#1:942,2\n322#1:945,2\n439#1:947,2\n470#1:949,2\n672#1:924,6\n816#1:944\n*E\n"})
public final class C30471K extends AbstractC30348K<C30444C2> {

    /* JADX INFO: renamed from: A */
    public ViewGroup f61460A;

    /* JADX INFO: renamed from: B */
    public final C28404L f61461B;

    /* JADX INFO: renamed from: C */
    public final C28404L f61462C;

    /* JADX INFO: renamed from: D */
    public final C28404L f61463D;

    /* JADX INFO: renamed from: E */
    public boolean f61464E;

    /* JADX INFO: renamed from: F */
    public final C28404L f61465F;

    /* JADX INFO: renamed from: G */
    public final Screen f61466G;

    /* JADX INFO: renamed from: H */
    public final boolean f61467H;

    /* JADX INFO: renamed from: I */
    public final Lazy f61468I;

    /* JADX INFO: renamed from: J */
    public final Matrix f61469J;

    /* JADX INFO: renamed from: K */
    public Rect f61470K;

    /* JADX INFO: renamed from: L */
    public final RectF f61471L;

    /* JADX INFO: renamed from: M */
    public final Rect f61472M;

    /* JADX INFO: renamed from: N */
    public final Matrix f61473N;

    /* JADX INFO: renamed from: O */
    public Bitmap f61474O;

    /* JADX INFO: renamed from: P */
    public C30486P f61475P;

    /* JADX INFO: renamed from: Q */
    public boolean f61476Q;

    /* JADX INFO: renamed from: i */
    public final Lazy f61477i;

    /* JADX INFO: renamed from: j */
    public final Lazy f61478j;

    /* JADX INFO: renamed from: k */
    public final C28404L f61479k;

    /* JADX INFO: renamed from: l */
    public final C28404L f61480l;

    /* JADX INFO: renamed from: m */
    public final C28404L f61481m;

    /* JADX INFO: renamed from: n */
    public final C28404L f61482n;

    /* JADX INFO: renamed from: o */
    public final C28404L f61483o;

    /* JADX INFO: renamed from: p */
    public final C28404L f61484p;

    /* JADX INFO: renamed from: q */
    public final C28404L f61485q;

    /* JADX INFO: renamed from: r */
    public final C28404L f61486r;

    /* JADX INFO: renamed from: s */
    public final C28404L f61487s;

    /* JADX INFO: renamed from: t */
    public final C28404L f61488t;

    /* JADX INFO: renamed from: u */
    public final C28404L f61489u;

    /* JADX INFO: renamed from: v */
    public final C28404L f61490v;

    /* JADX INFO: renamed from: w */
    public final C28404L f61491w;

    /* JADX INFO: renamed from: x */
    public final C28404L f61492x;

    /* JADX INFO: renamed from: y */
    public final C28404L f61493y;

    /* JADX INFO: renamed from: z */
    public final C28404L f61494z;

    /* JADX INFO: renamed from: S */
    public static final /* synthetic */ KProperty[] f61459S = {AbstractC28118g.m69077a(C30471K.class, "rootView", "getRootView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "takePictureProgressView", "getTakePictureProgressView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "takePictureViewContainer", "getTakePictureViewContainer()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "buttonsContainer", "getButtonsContainer()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "toolbar", "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0), AbstractC28118g.m69077a(C30471K.class, "progressBar", "getProgressBar()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "helperTitle", "getHelperTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30471K.class, "helperBrief", "getHelperBrief()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30471K.class, "helperDetails", "getHelperDetails()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30471K.class, "helperDetailsFrame", "getHelperDetailsFrame()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30471K.class, "helperView", "getHelperView()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30471K.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0), AbstractC28118g.m69077a(C30471K.class, TtmlNode.RUBY_CONTAINER, "getContainer()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30471K.class, "docDetectionResultView", "getDocDetectionResultView()Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", 0), AbstractC28118g.m69077a(C30471K.class, "frameWithBackground", "getFrameWithBackground()Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;", 0), AbstractC28118g.m69077a(C30471K.class, "debugInfoView", "getDebugInfoView()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30471K.class, "debugInfoRightView", "getDebugInfoRightView()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30471K.class, "photoFrameContainerView", "getPhotoFrameContainerView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "autoCaptureHint", "getAutoCaptureHint()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30471K.class, "autoManual", "getAutoManual()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30471K.class, "photoMadeIndicator", "getPhotoMadeIndicator()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: R */
    public static final C30590m f61458R = new C30590m();

    /* JADX INFO: renamed from: b */
    public static final int m70384b(C30471K c30471k) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            boolean zM69346a = AbstractC28458h.m69346a(c30471k.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30471k.requireContext(), R$color.sns_cameraContent);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m70385c(C30471K c30471k) {
        View viewM70393F = c30471k.m70393F();
        if (viewM70393F != null) {
            viewM70393F.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final void m70386d(C30471K c30471k) {
        c30471k.m70397a(false);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: a */
    public final void mo70214a(C28740f c28740f) {
        ((C30444C2) this.f61477i.getValue()).m70341a(c28740f);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: v */
    public final boolean getF62066u() {
        return false;
    }

    /* JADX INFO: renamed from: A */
    public static final DecimalFormat m70375A() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat;
    }

    /* JADX INFO: renamed from: e */
    public static final ViewModelProvider.Factory m70387e(C30471K c30471k) {
        return new C30452E2(c30471k, c30471k.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30471k.getArguments());
    }

    /* JADX INFO: renamed from: B */
    public final void m70389B() {
        RectF frameRect;
        Rect rect = null;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "configurePhotoFrameRect", null);
        View viewM70393F = m70393F();
        int top = viewM70393F != null ? viewM70393F.getTop() : 0;
        SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E = m70392E();
        if (sNSFrameViewWithBackgroundM70392E != null && (frameRect = sNSFrameViewWithBackgroundM70392E.getFrameRect()) != null) {
            rect = new Rect((int) frameRect.left, ((int) frameRect.top) + top, (int) frameRect.right, top + ((int) frameRect.bottom));
            this.f61471L.set(rect);
        }
        this.f61470K = rect;
    }

    /* JADX INFO: renamed from: C */
    public final View m70390C() {
        return (View) this.f61462C.getValue(this, f61459S[20]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final LinkedHashMap m70391D() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = ((C30486P) ((C30444C2) this.f61477i.getValue()).f61343G.getValue()).f61538b.f61529d;
        if (bool != null) {
            linkedHashMap.put("isAutocaptureEnabled", bool);
        }
        Boolean bool2 = ((C30486P) ((C30444C2) this.f61477i.getValue()).f61343G.getValue()).f61538b.f61526a;
        if (bool2 != null) {
            linkedHashMap.put("isAutocaptureActive", bool2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: E */
    public final SNSFrameViewWithBackground m70392E() {
        return (SNSFrameViewWithBackground) this.f61492x.getValue(this, f61459S[16]);
    }

    /* JADX INFO: renamed from: F */
    public final View m70393F() {
        return (View) this.f61461B.getValue(this, f61459S[19]);
    }

    /* JADX INFO: renamed from: d */
    public final void m70401d(C30486P c30486p) {
        C30486P c30486p2;
        C30531c0 c30531c0;
        C28746l c28746l;
        File file;
        C30531c0 c30531c1;
        C30531c0 c30531c2 = c30486p.f61537a;
        if (c30531c2 != null && (file = c30531c2.f61653a) != null) {
            C30486P c30486p3 = this.f61475P;
            if (((c30486p3 == null || (c30531c1 = c30486p3.f61537a) == null) ? null : c30531c1.f61653a) != null || !c30531c2.f61654b) {
                file = null;
            }
            if (file != null) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "start video recording: " + ((C30444C2) this.f61477i.getValue()).mo70250f(), null);
                C28746l c28746l2 = this.f61028e;
                if (c28746l2 != null) {
                    c28746l2.m69567a(file);
                }
            }
        }
        C30531c0 c30531c3 = c30486p.f61537a;
        if (c30531c3 == null || c30531c3.f61654b || (c30486p2 = this.f61475P) == null || (c30531c0 = c30486p2.f61537a) == null || !c30531c0.f61654b || (c28746l = this.f61028e) == null) {
            return;
        }
        c28746l.m69573f();
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: f */
    public final View mo70222f() {
        return (View) this.f61481m.getValue(this, f61459S[3]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: g */
    public final CameraX$Mode getF61031h() {
        return ((C30444C2) this.f61477i.getValue()).m70355h();
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return MapsKt.plus(this.f61026c.m69525u(), m70391D());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66531c() {
        return ((C30444C2) this.f61477i.getValue()).f61055a.f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_document_picker);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return MapsKt.plus(this.f61026c.m69525u(), m70391D());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF65169b() {
        return this.f61466G;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30444C2) this.f61477i.getValue();
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: h */
    public final View mo70224h() {
        return (View) this.f61488t.getValue(this, f61459S[12]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: i */
    public final TextView mo70225i() {
        return (TextView) this.f61485q.getValue(this, f61459S[8]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: j */
    public final TextView mo70226j() {
        return (TextView) this.f61486r.getValue(this, f61459S[9]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: k */
    public final TextView mo70227k() {
        return (TextView) this.f61484p.getValue(this, f61459S[7]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: l */
    public final ViewGroup mo70228l() {
        return (ViewGroup) this.f61487s.getValue(this, f61459S[11]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: m */
    public final PreviewView mo70229m() {
        return (PreviewView) this.f61489u.getValue(this, f61459S[13]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getF61467H() {
        return this.f61467H;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: o */
    public final View mo70231o() {
        return (View) this.f61482n.getValue(this, f61459S[4]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: p */
    public final View mo70232p() {
        return (View) this.f61479k.getValue(this, f61459S[1]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: r */
    public final View mo70234r() {
        return (View) this.f61480l.getValue(this, f61459S[2]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: s */
    public final SNSToolbarView mo70235s() {
        return (SNSToolbarView) this.f61483o.getValue(this, f61459S[5]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: w */
    public final void mo70239w() {
        ((C30444C2) this.f61477i.getValue()).getClass();
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onCameraPreviewReady", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: x */
    public final void mo70240x() {
        if (Intrinsics.areEqual(((C30486P) ((C30444C2) this.f61477i.getValue()).f61343G.getValue()).f61538b.f61526a, Boolean.TRUE)) {
            m70397a(true);
        }
    }

    public C30471K() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.b4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30471K.m70387e(this.f61647b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30635u(new C30630t(this)));
        this.f61477i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30444C2.class), new C30640v(lazy), new C30645w(lazy), function0);
        this.f61478j = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.e4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30471K.m70384b(this.f61695b));
            }
        });
        this.f61479k = new C28404L(R$id.sns_primary_button_progress);
        this.f61480l = new C28404L(R$id.sns_primary_button);
        this.f61481m = new C28404L(R$id.sns_buttons_container);
        this.f61482n = new C28404L(R$id.sns_gallery);
        this.f61483o = new C28404L(R$id.sns_toolbar);
        this.f61484p = new C28404L(R$id.sns_helper_title);
        this.f61485q = new C28404L(R$id.sns_helper_brief);
        this.f61486r = new C28404L(R$id.sns_helper_details);
        this.f61487s = new C28404L(R$id.sns_helper);
        this.f61488t = new C28404L(R$id.sns_dark_overlay);
        this.f61489u = new C28404L(R$id.sns_camera_preview);
        this.f61490v = new C28404L(R$id.sns_camera_preview_container);
        this.f61491w = new C28404L(R$id.sns_doc_detection_result);
        this.f61492x = new C28404L(R$id.sns_frame_with_background);
        this.f61493y = new C28404L(R$id.sns_debug_info);
        this.f61494z = new C28404L(R$id.sns_debug_info_right);
        this.f61461B = new C28404L(R$id.sns_frame_container);
        this.f61462C = new C28404L(R$id.sns_autocapture_hint_old);
        this.f61463D = new C28404L(R$id.sns_auto_manual);
        this.f61465F = new C28404L(R$id.photo_made_indicator);
        this.f61466G = AbstractC28047a.m69058a(this);
        this.f61467H = true;
        this.f61468I = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.f4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30471K.m70388z();
            }
        });
        LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.g4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30471K.m70375A();
            }
        });
        this.f61469J = new Matrix();
        this.f61471L = new RectF();
        this.f61472M = new Rect();
        this.f61473N = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    public static final void m70382a(C30471K c30471k, View view) {
        ((C30444C2) c30471k.f61477i.getValue()).f61353Q = true;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "saving the screen", null);
    }

    /* JADX INFO: renamed from: z */
    public static final C33310d m70388z() {
        return C33308b.m71632a();
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(final InterfaceC28145r interfaceC28145r) {
        TextView textView;
        TextView textView2;
        super.handleEvent(interfaceC28145r);
        if (interfaceC28145r instanceof C30515Z) {
            C30515Z c30515z = (C30515Z) interfaceC28145r;
            float width = c30515z.f61618a.getWidth() / c30515z.f61619b.getWidth();
            float height = c30515z.f61618a.getHeight() / c30515z.f61619b.getHeight();
            ViewGroup viewGroup = (ViewGroup) this.f61494z.getValue(this, f61459S[18]);
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            if (c30515z.f61622e) {
                m70395a(width, height, c30515z.f61620c, c30515z.f61623f);
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30494S) {
            C28404L c28404l = this.f61493y;
            KProperty[] kPropertyArr = f61459S;
            ViewGroup viewGroup2 = (ViewGroup) c28404l.getValue(this, kPropertyArr[17]);
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f61494z.getValue(this, kPropertyArr[18]);
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f61493y.getValue(this, kPropertyArr[17]);
            if (viewGroup4 != null) {
                textView = (TextView) viewGroup4.findViewById(R$id.sns_doc_bounds_confidence);
            } else {
                textView = null;
            }
            if (textView != null) {
                AbstractC28458h.m69341a(textView, (CharSequence) null);
            }
            ViewGroup viewGroup5 = (ViewGroup) this.f61493y.getValue(this, kPropertyArr[17]);
            if (viewGroup5 != null) {
                textView2 = (TextView) viewGroup5.findViewById(R$id.sns_good_photo_confidence);
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                AbstractC28458h.m69341a(textView2, (CharSequence) null);
            }
            SNSDocBoundsCheckResultView sNSDocBoundsCheckResultView = (SNSDocBoundsCheckResultView) this.f61491w.getValue(this, kPropertyArr[15]);
            if (sNSDocBoundsCheckResultView != null) {
                sNSDocBoundsCheckResultView.setDocRect(null);
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30525b0) {
            ViewGroup viewGroup6 = (ViewGroup) this.f61493y.getValue(this, f61459S[17]);
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30519a0) {
            if (!this.f61464E) {
                this.f61464E = true;
                Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.i4
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C30471K.m70378a(this.f61737b, interfaceC28145r);
                    }
                };
                C28404L c28404l2 = this.f61465F;
                KProperty[] kPropertyArr2 = f61459S;
                View view = (View) c28404l2.getValue(this, kPropertyArr2[22]);
                if (view != null) {
                    view.setVisibility(4);
                }
                View view2 = (View) this.f61465F.getValue(this, kPropertyArr2[22]);
                if (view2 != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    alphaAnimation.setAnimationListener(new AnimationAnimationListenerC30625s(this, function0));
                    view2.startAnimation(alphaAnimation);
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30512Y) {
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(this, 100, null, 2, null);
        } else if (interfaceC28145r instanceof C30509X) {
            m70237u();
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        boolean zOnFinishCalled = super.onFinishCalled(abstractC28503w);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "finishing photo screen: " + abstractC28503w, null);
        return zOnFinishCalled;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K, com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSSegmentedToggleView sNSSegmentedToggleView;
        SNSSegmentedToggleView sNSSegmentedToggleView2;
        int i11;
        super.onViewCreated(view, bundle);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "creating Document Picker view, autoCaptureExpanded = false", null);
        View viewM70393F = m70393F();
        if (viewM70393F != null) {
            viewM70393F.setVisibility(4);
        }
        C28404L c28404l = this.f61463D;
        KProperty[] kPropertyArr = f61459S;
        ViewGroup viewGroup = (ViewGroup) c28404l.getValue(this, kPropertyArr[21]);
        if (viewGroup != null) {
            sNSSegmentedToggleView = (SNSSegmentedToggleView) viewGroup.findViewById(R$id.sns_auto_manual_switch);
        } else {
            sNSSegmentedToggleView = null;
        }
        if (sNSSegmentedToggleView != null) {
            if (((Boolean) ((C30444C2) this.f61477i.getValue()).f61367u.getValue()).booleanValue() && ((C30444C2) this.f61477i.getValue()).m70355h() != CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            sNSSegmentedToggleView.setVisibility(i11);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f61463D.getValue(this, kPropertyArr[21]);
        if (viewGroup2 != null) {
            sNSSegmentedToggleView2 = (SNSSegmentedToggleView) viewGroup2.findViewById(R$id.sns_auto_manual_switch);
        } else {
            sNSSegmentedToggleView2 = null;
        }
        if (sNSSegmentedToggleView2 != null) {
            sNSSegmentedToggleView2.setOnItemSelected(new C30608p(this));
        }
        AbstractC28421U.m69305b(((C30444C2) this.f61477i.getValue()).f61343G, getViewLifecycleOwner(), new C30614q(this, null));
        View viewFindViewById = requireView().findViewById(R$id.sns_save_frame);
        viewFindViewById.setVisibility(8);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.h4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C30471K.m70382a(this.f61726b, view2);
            }
        });
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

    /* JADX INFO: renamed from: c */
    public final void m70400c(C30486P c30486p) {
        View viewM70390C;
        C30483O c30483o;
        String string;
        String string2;
        C30483O c30483o2 = c30486p.f61538b;
        Boolean bool = c30483o2.f61526a;
        Boolean bool2 = Boolean.TRUE;
        int i11 = !Intrinsics.areEqual(bool, bool2) ? 1 : 0;
        C28404L c28404l = this.f61463D;
        KProperty[] kPropertyArr = f61459S;
        ViewGroup viewGroup = (ViewGroup) c28404l.getValue(this, kPropertyArr[21]);
        Boolean bool3 = null;
        SNSSegmentedToggleView sNSSegmentedToggleView = viewGroup != null ? (SNSSegmentedToggleView) viewGroup.findViewById(R$id.sns_auto_manual_switch) : null;
        if (sNSSegmentedToggleView != null) {
            CharSequence charSequence = c30483o2.f61527b;
            String str = "";
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            CharSequence charSequence2 = c30483o2.f61528c;
            if (charSequence2 != null && (string2 = charSequence2.toString()) != null) {
                str = string2;
            }
            sNSSegmentedToggleView.setItems(CollectionsKt.listOf((Object[]) new String[]{string, str}), i11);
        }
        C30486P c30486p2 = this.f61475P;
        if (c30486p2 != null && (c30483o = c30486p2.f61538b) != null) {
            bool3 = c30483o.f61526a;
        }
        if (Intrinsics.areEqual(c30483o2.f61529d, bool2) && !Intrinsics.areEqual(c30483o2.f61526a, bool3)) {
            m70398a(Intrinsics.areEqual(c30483o2.f61526a, bool2), (ViewGroup) this.f61463D.getValue(this, kPropertyArr[21]));
            m70398a(Intrinsics.areEqual(c30483o2.f61526a, bool2), mo70235s());
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f61463D.getValue(this, kPropertyArr[21]);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(Intrinsics.areEqual(c30483o2.f61529d, bool2) ? 0 : 8);
        }
        View viewM70390C2 = m70390C();
        if (viewM70390C2 != null) {
            viewM70390C2.setVisibility(!Intrinsics.areEqual(c30483o2.f61526a, bool2) ? 4 : 0);
        }
        if (Intrinsics.areEqual(bool3, bool2) && Intrinsics.areEqual(c30483o2.f61526a, Boolean.FALSE)) {
            m70218a(false, m70393F(), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.l4
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30471K.m70385c(this.f61782b);
                }
            });
        }
        if (!Intrinsics.areEqual(c30483o2.f61526a, bool2) || (viewM70390C = m70390C()) == null) {
            return;
        }
        viewM70390C.post(new Runnable() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.m4
            @Override // java.lang.Runnable
            public final void run() {
                C30471K.m70386d(this.f61801b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70379a(boolean z11, C30471K c30471k, C30486P c30486p) {
        String str;
        if (z11) {
            View viewM70390C = c30471k.m70390C();
            TextView textView = viewM70390C instanceof TextView ? (TextView) viewM70390C : null;
            if (textView != null) {
                C30477M c30477m = c30486p.f61539c;
                if (c30477m == null || (str = c30477m.f61511a) == null) {
                    str = C33627eb.f69716f;
                }
                textView.setText(str);
            }
        }
        View viewM70390C2 = c30471k.m70390C();
        TextView textView2 = viewM70390C2 instanceof TextView ? (TextView) viewM70390C2 : null;
        if (textView2 != null) {
            textView2.setVisibility(z11 ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: b */
    public final void mo70221b(File file) {
        ((C30444C2) this.f61477i.getValue()).m70349b(file);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: b */
    public final void mo70220b(C30351N c30351n) {
        final View viewMo70231o = mo70231o();
        if (viewMo70231o == null) {
            return;
        }
        boolean z11 = c30351n.f61033b && ((C30444C2) this.f61477i.getValue()).f61058d;
        if (viewMo70231o.getVisibility() != 0 && z11) {
            m70218a(true, viewMo70231o, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.j4
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30471K.m70377a(viewMo70231o);
                }
            });
        } else {
            if (z11) {
                return;
            }
            viewMo70231o.setVisibility(4);
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: a */
    public final Object mo70213a(ImageProxy imageProxy, C28758x c28758x, C30345H c30345h) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91393c(), new C30596n(this, imageProxy, c28758x, null), c30345h);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: a */
    public final Object mo70212a(Bitmap bitmap, Continuation continuation) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91393c(), new C30602o(this, bitmap, null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70383a(C30471K c30471k, C28135m c28135m) {
        AbstractActivityC28115f baseActivity = c30471k.getBaseActivity();
        AbstractC29149l0 abstractC29149l0 = c28135m.f57362a;
        String str = c28135m.f57363b;
        CharSequence charSequence = c28135m.f57364c;
        int i11 = AbstractActivityC28115f.f57327i;
        baseActivity.mo69076a(abstractC29149l0, str, charSequence, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m70399b(C30486P c30486p) {
        ViewGroup viewGroup;
        View view;
        String str;
        SNSProgressBarView sNSProgressBarView;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "handleDocumentCaptureState: " + c30486p, null);
        m70401d(c30486p);
        m70400c(c30486p);
        m70396a(c30486p);
        View viewRequireView = requireView();
        int i11 = R$id.sns_popup_hint_container_background;
        View viewFindViewById = viewRequireView.findViewById(i11);
        if (viewFindViewById != null && (sNSProgressBarView = (SNSProgressBarView) viewFindViewById.findViewById(R$id.sns_progress)) != null) {
            C30489Q c30489q = c30486p.f61540d;
            sNSProgressBarView.setVisibility((c30489q == null || !c30489q.f61548c) ? 8 : 0);
            sNSProgressBarView.setIndeterminateTintList(ColorStateList.valueOf(((Number) this.f61478j.getValue()).intValue()));
        }
        ViewGroup viewGroup2 = this.f61460A;
        if (Intrinsics.areEqual(c30486p.f61538b.f61526a, Boolean.TRUE)) {
            viewGroup = (ViewGroup) requireView().findViewById(R$id.sns_frame_popup_hint_container);
        } else {
            viewGroup = (ViewGroup) requireView().findViewById(i11);
        }
        this.f61460A = viewGroup;
        if (!Intrinsics.areEqual(viewGroup2, viewGroup) && viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.f61460A;
        if (viewGroup3 != null) {
            int i12 = R$id.sns_text;
            TextView textView = (TextView) viewGroup3.findViewById(i12);
            if (textView != null) {
                C30489Q c30489q2 = c30486p.f61540d;
                AbstractC28458h.m69341a(textView, c30489q2 != null ? c30489q2.f61547b : null);
            }
            ViewGroup viewGroup4 = this.f61460A;
            TextView textView2 = viewGroup4 != null ? (TextView) viewGroup4.findViewById(i12) : null;
            if (textView2 != null) {
                textView2.setTextColor(((Number) this.f61478j.getValue()).intValue());
            }
            C30489Q c30489q3 = c30486p.f61540d;
            if (c30489q3 != null && (str = c30489q3.f61546a) != null) {
                ViewGroup viewGroup5 = this.f61460A;
                ImageView imageView = viewGroup5 != null ? (ImageView) viewGroup5.findViewById(R$id.sns_icon) : null;
                if (imageView != null) {
                    imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), str));
                }
            }
            ViewGroup viewGroup6 = this.f61460A;
            ImageView imageView2 = viewGroup6 != null ? (ImageView) viewGroup6.findViewById(R$id.sns_icon) : null;
            if (imageView2 != null) {
                imageView2.setImageTintList(ColorStateList.valueOf(((Number) this.f61478j.getValue()).intValue()));
            }
            ViewGroup viewGroup7 = this.f61460A;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(c30486p.f61540d == null ? 8 : 0);
            }
        }
        final C28135m c28135m = c30486p.f61541e;
        if (c28135m != null && (view = getView()) != null) {
            view.post(new Runnable() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.k4
                @Override // java.lang.Runnable
                public final void run() {
                    C30471K.m70383a(this.f61761b, c28135m);
                }
            });
        }
        this.f61475P = c30486p;
    }

    /* JADX INFO: renamed from: a */
    public final void m70396a(final C30486P c30486p) {
        String str;
        SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;
        SNSFrameViewWithBackground.State state;
        SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E;
        C30483O c30483o;
        C30486P c30486p2 = this.f61475P;
        Boolean bool = (c30486p2 == null || (c30483o = c30486p2.f61538b) == null) ? null : c30483o.f61526a;
        C30477M c30477m = c30486p.f61539c;
        boolean z11 = c30477m == null || (StringsKt.isBlank(c30477m.f61511a) && c30486p.f61540d == null) || !Intrinsics.areEqual(c30486p.f61538b.f61526a, Boolean.TRUE);
        final boolean z12 = !z11;
        if (!Intrinsics.areEqual(c30486p.f61538b.f61526a, bool)) {
            View viewM70390C = m70390C();
            if (viewM70390C != null) {
                viewM70390C.setVisibility(z11 ? 8 : 0);
            }
            m70398a(z12, m70390C());
            m70218a(z12, m70390C(), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.c4
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30471K.m70379a(z12, this, c30486p);
                }
            });
        } else {
            if (!z11) {
                View viewM70390C2 = m70390C();
                TextView textView = viewM70390C2 instanceof TextView ? (TextView) viewM70390C2 : null;
                if (textView != null) {
                    C30477M c30477m2 = c30486p.f61539c;
                    if (c30477m2 == null || (str = c30477m2.f61511a) == null) {
                        str = C33627eb.f69716f;
                    }
                    textView.setText(str);
                }
            }
            View viewM70390C3 = m70390C();
            TextView textView2 = viewM70390C3 instanceof TextView ? (TextView) viewM70390C3 : null;
            if (textView2 != null) {
                textView2.setVisibility(z11 ? 8 : 0);
            }
        }
        C30477M c30477m3 = c30486p.f61539c;
        if (c30477m3 == null || (sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30477m3.f61513c) == null) {
            return;
        }
        int i11 = AbstractC30474L.f61499a[sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.ordinal()];
        if (i11 == 1) {
            state = SNSFrameViewWithBackground.State.DEFAULT;
        } else if (i11 == 2) {
            state = SNSFrameViewWithBackground.State.RED;
        } else if (i11 == 3) {
            state = SNSFrameViewWithBackground.State.YELLOW;
        } else if (i11 == 4) {
            state = SNSFrameViewWithBackground.State.GREEN;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (state == null || (sNSFrameViewWithBackgroundM70392E = m70392E()) == null) {
            return;
        }
        sNSFrameViewWithBackgroundM70392E.setState(state);
    }

    /* JADX INFO: renamed from: a */
    public final void m70397a(boolean z11) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View viewM70393F = m70393F();
        if (viewM70393F == null || viewM70393F.getVisibility() != 0 || z11) {
            ViewGroup.LayoutParams layoutParams4 = null;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showPhotoFrame: " + z11, null);
            View viewM70393F2 = m70393F();
            if (viewM70393F2 == null || viewM70393F2.getLayoutParams() == null) {
                return;
            }
            View viewM70393F3 = m70393F();
            float width = viewM70393F3 != null ? viewM70393F3.getWidth() : 0;
            float fApplyDimension = TypedValue.applyDimension(5, 90.0f, requireContext().getResources().getDisplayMetrics());
            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_small);
            Resources resources = getResources();
            int i11 = R$dimen.sns_margin_medium;
            float fCoerceAtMost = (int) RangesKt.coerceAtMost(width - (resources.getDimensionPixelSize(i11) * 2), fApplyDimension);
            int i12 = (int) (fCoerceAtMost / ((C33310d) this.f61468I.getValue()).f67920i);
            int i13 = (dimensionPixelSize * 2) + i12;
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.sns_autocapture_hint_min_height);
            int dimensionPixelSize3 = (getResources().getDimensionPixelSize(i11) * 2) + getResources().getDimensionPixelSize(R$dimen.sns_autocapture_switch_min_height);
            BottomSheetBehavior bottomSheetBehavior = this.f61025b;
            int peekHeight = bottomSheetBehavior != null ? bottomSheetBehavior.getPeekHeight() : 0;
            C28404L c28404l = this.f61490v;
            KProperty[] kPropertyArr = f61459S;
            ViewGroup viewGroup = (ViewGroup) c28404l.getValue(this, kPropertyArr[14]);
            int height = viewGroup != null ? viewGroup.getHeight() : 0;
            SNSToolbarView sNSToolbarViewMo70235s = mo70235s();
            int height2 = ((height - (sNSToolbarViewMo70235s != null ? sNSToolbarViewMo70235s.getHeight() : 0)) - i13) - peekHeight;
            int i14 = dimensionPixelSize2 + dimensionPixelSize3;
            int i15 = RangesKt.coerceAtLeast(height2, 0) < i14 ? i14 - height2 : 0;
            if (i15 != 0) {
                i12 -= i15;
                i13 -= i15;
                ViewGroup viewGroup2 = (ViewGroup) this.f61463D.getValue(this, kPropertyArr[21]);
                SNSSegmentedToggleView sNSSegmentedToggleView = viewGroup2 != null ? (SNSSegmentedToggleView) viewGroup2.findViewById(R$id.sns_auto_manual_switch) : null;
                if (sNSSegmentedToggleView != null && (layoutParams3 = sNSSegmentedToggleView.getLayoutParams()) != null && (layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
                }
            }
            SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E = m70392E();
            if (sNSFrameViewWithBackgroundM70392E != null && (layoutParams2 = sNSFrameViewWithBackgroundM70392E.getLayoutParams()) != null) {
                layoutParams2.width = (int) width;
                layoutParams2.height = i13;
                SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E2 = m70392E();
                if (sNSFrameViewWithBackgroundM70392E2 != null) {
                    sNSFrameViewWithBackgroundM70392E2.setLayoutParams(layoutParams2);
                }
            }
            SizeF sizeF = new SizeF(fCoerceAtMost, i12);
            View viewM70393F4 = m70393F();
            boolean z12 = (viewM70393F4 == null || viewM70393F4.getVisibility() == 0) ? false : true;
            SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E3 = m70392E();
            if (sNSFrameViewWithBackgroundM70392E3 != null) {
                OneShotPreDrawListener.add(sNSFrameViewWithBackgroundM70392E3, new RunnableC30620r(sNSFrameViewWithBackgroundM70392E3, this, sizeF, z12));
            }
            SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E4 = m70392E();
            if (sNSFrameViewWithBackgroundM70392E4 != null) {
                sNSFrameViewWithBackgroundM70392E4.setFrameSize(sizeF);
            }
            SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E5 = m70392E();
            if (sNSFrameViewWithBackgroundM70392E5 != null) {
                sNSFrameViewWithBackgroundM70392E5.updateFrameRect();
            }
            m70389B();
            SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E6 = m70392E();
            if (sNSFrameViewWithBackgroundM70392E6 != null) {
                sNSFrameViewWithBackgroundM70392E6.setState(SNSFrameViewWithBackground.State.RED);
            }
            View viewM70390C = m70390C();
            if (viewM70390C != null) {
                View viewM70390C2 = m70390C();
                if (viewM70390C2 != null && (layoutParams = viewM70390C2.getLayoutParams()) != null) {
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        BottomSheetBehavior bottomSheetBehavior2 = this.f61025b;
                        marginLayoutParams.bottomMargin = bottomSheetBehavior2 != null ? bottomSheetBehavior2.getPeekHeight() : 0;
                        View viewM70390C3 = m70390C();
                        if (viewM70390C3 != null) {
                            viewM70390C3.setLayoutParams(layoutParams);
                        }
                    }
                    layoutParams4 = layoutParams;
                }
                viewM70390C.setLayoutParams(layoutParams4);
            }
            View viewM70393F5 = m70393F();
            if (viewM70393F5 != null) {
                viewM70393F5.setVisibility(((Boolean) ((C30444C2) this.f61477i.getValue()).f61367u.getValue()).booleanValue() ? 0 : 8);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70381a(C30471K c30471k) {
        RectF frameRect;
        Drawable background;
        SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E = c30471k.m70392E();
        if (sNSFrameViewWithBackgroundM70392E == null || (frameRect = sNSFrameViewWithBackgroundM70392E.getFrameRect()) == null) {
            return;
        }
        ViewGroup viewGroup = c30471k.f61460A;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R$drawable.sns_round_rect_background);
        }
        ViewGroup viewGroup2 = c30471k.f61460A;
        if (viewGroup2 != null && (background = viewGroup2.getBackground()) != null) {
            AbstractC28470l.m69370a(background, sNSFrameViewWithBackgroundM70392E.getFrameBackgroundColor());
        }
        ViewGroup viewGroup3 = c30471k.f61460A;
        if (viewGroup3 != null) {
            viewGroup3.setLeft((int) frameRect.left);
        }
        ViewGroup viewGroup4 = c30471k.f61460A;
        if (viewGroup4 != null) {
            viewGroup4.setTop((int) frameRect.top);
        }
        ViewGroup viewGroup5 = c30471k.f61460A;
        if (viewGroup5 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup5.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) frameRect.width();
                layoutParams.height = (int) frameRect.height();
                viewGroup5.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70398a(boolean z11, final View view) {
        int i11;
        Resources resources;
        SNSFrameViewWithBackground sNSFrameViewWithBackgroundM70392E = m70392E();
        int frameBackgroundColor = sNSFrameViewWithBackgroundM70392E != null ? sNSFrameViewWithBackgroundM70392E.getFrameBackgroundColor() : ContextCompat.getColor(requireContext(), R$color.sns_cameraBackgroundOverlay);
        int integer = 0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = frameBackgroundColor;
            frameBackgroundColor = 0;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluatorCompat(), Integer.valueOf(i11), Integer.valueOf(frameBackgroundColor));
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            integer = resources.getInteger(R.integer.config_mediumAnimTime);
        }
        valueAnimatorOfObject.setDuration(integer);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.d4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C30471K.m70380a(view, valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: renamed from: a */
    public static final void m70380a(View view, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Drawable background = view != null ? view.getBackground() : null;
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(iIntValue);
        } else if (view != null) {
            view.setBackgroundColor(iIntValue);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m70394a(int i11, int i12) {
        Bitmap bitmap = this.f61474O;
        if (bitmap != null && bitmap.getWidth() == i11 && bitmap.getHeight() == i12 && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmap2 = this.f61474O;
        if (bitmap2 != null) {
            if (!bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            this.f61474O = null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, config);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "prepared frame bitmap " + bitmapCreateBitmap.getWidth() + "x" + bitmapCreateBitmap.getHeight(), null);
        Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, true);
        if (bitmapCreateBitmap != bitmapCopy) {
            bitmapCreateBitmap.recycle();
        }
        this.f61474O = bitmapCopy;
        return bitmapCopy;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70378a(C30471K c30471k, InterfaceC28145r interfaceC28145r) {
        c30471k.f61464E = false;
        ((C30519a0) interfaceC28145r).f61632a.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K
    /* JADX INFO: renamed from: a */
    public final void mo70216a(Exception exc) {
        boolean z11 = exc instanceof C28757w;
        if (z11) {
            ViewGroup viewGroup = (ViewGroup) this.f61463D.getValue(this, f61459S[21]);
            SNSSegmentedToggleView sNSSegmentedToggleView = viewGroup != null ? (SNSSegmentedToggleView) viewGroup.findViewById(R$id.sns_auto_manual_switch) : null;
            if (sNSSegmentedToggleView != null) {
                sNSSegmentedToggleView.setVisibility(8);
            }
        }
        C30444C2 c30444c2 = (C30444C2) this.f61477i.getValue();
        if (z11) {
            C28936t c28936t = c30444c2.f61369w;
            KProperty kProperty = C30444C2.f61336U[2];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            c30444c2.fireEvent(C30509X.f61601a);
            return;
        }
        c30444c2.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static String m70376a(long j11) {
        return j11 + " ms";
    }

    /* JADX INFO: renamed from: a */
    public final void m70395a(float f11, float f12, C33350a c33350a, boolean z11) {
        Rect rectM70408a = AbstractC30566i.m70408a(c33350a.m71661a(), f11, f12);
        if (z11) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentFrameAndCheckPhotoFrame: " + rectM70408a, null);
        }
        RectF rectF = new RectF(rectM70408a);
        this.f61469J.mapRect(rectF);
        if (z11) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentFrameAndCheckPhotoFrame: view rect=" + rectF, null);
        }
        SNSDocBoundsCheckResultView sNSDocBoundsCheckResultView = (SNSDocBoundsCheckResultView) this.f61491w.getValue(this, f61459S[15]);
        if (sNSDocBoundsCheckResultView != null) {
            sNSDocBoundsCheckResultView.setDocRectF(rectF);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70377a(View view) {
        view.setVisibility(0);
        return Unit.INSTANCE;
    }
}
