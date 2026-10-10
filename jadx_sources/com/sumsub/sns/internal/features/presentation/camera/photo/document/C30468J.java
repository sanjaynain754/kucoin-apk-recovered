package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$raw;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.C28137n;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.camera.SNSCornersOverlayView;
import com.sumsub.sns.core.widget.camera.SNSPhotoMadeOverlay;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28427X;
import com.sumsub.sns.internal.core.common.AbstractC28443c1;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28407M0;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.camera.C28732b;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.C28747m;
import com.sumsub.sns.internal.core.presentation.camera.C28748n;
import com.sumsub.sns.internal.core.presentation.camera.C28749o;
import com.sumsub.sns.internal.core.presentation.camera.C28750p;
import com.sumsub.sns.internal.core.presentation.camera.C28751q;
import com.sumsub.sns.internal.core.presentation.camera.C28757w;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28752r;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29145k2;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.camera.C30360a;
import com.sumsub.sns.internal.features.presentation.camera.C30369d;
import com.sumsub.sns.internal.features.presentation.camera.C30372e;
import com.sumsub.sns.internal.features.presentation.camera.C30378h;
import com.sumsub.sns.internal.features.presentation.camera.C30388m;
import com.sumsub.sns.internal.features.presentation.camera.C30390n;
import com.sumsub.sns.internal.features.presentation.camera.C30394p;
import com.sumsub.sns.internal.features.presentation.camera.C30747r;
import com.sumsub.sns.internal.features.presentation.camera.C30751t;
import com.sumsub.sns.internal.features.presentation.camera.C30800z;
import com.sumsub.sns.internal.features.presentation.camera.InterfaceC30798y;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32637O;
import com.sumsub.sns.internal.features.presentation.utils.C32638P;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.autocapture.C33313g;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/s1;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;", "Lcom/sumsub/sns/internal/core/common/M0;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/camera/photo/document/y", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPhotoDocumentPickerFragment2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPhotoDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerFragment2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,460:1\n106#2,15:461\n90#3,6:476\n337#4:482\n*S KotlinDebug\n*F\n+ 1 SNSPhotoDocumentPickerFragment2.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerFragment2\n*L\n58#1:461,15\n343#1:476,6\n367#1:482\n*E\n"})
public final class C30468J extends AbstractC28064I<C30627s1, C30440B2> implements InterfaceC28407M0 {

    /* JADX INFO: renamed from: a */
    public final Lazy f61433a;

    /* JADX INFO: renamed from: b */
    public final C30394p f61434b;

    /* JADX INFO: renamed from: c */
    public final C30751t f61435c;

    /* JADX INFO: renamed from: d */
    public final C30572j f61436d;

    /* JADX INFO: renamed from: e */
    public final C32637O f61437e;

    /* JADX INFO: renamed from: f */
    public final C28404L f61438f;

    /* JADX INFO: renamed from: g */
    public final Screen f61439g;

    /* JADX INFO: renamed from: h */
    public final Matrix f61440h;

    /* JADX INFO: renamed from: i */
    public final RectF f61441i;

    /* JADX INFO: renamed from: j */
    public final Rect f61442j;

    /* JADX INFO: renamed from: k */
    public final Matrix f61443k;

    /* JADX INFO: renamed from: l */
    public Bitmap f61444l;

    /* JADX INFO: renamed from: m */
    public C30538d1 f61445m;

    /* JADX INFO: renamed from: n */
    public boolean f61446n;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty[] f61432p = {AbstractC28118g.m69077a(C30468J.class, "photoMadeOverlay", "getPhotoMadeOverlay()Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;", 0)};

    /* JADX INFO: renamed from: o */
    public static final C30654y f61431o = new C30654y();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC30798y m70359a(C30468J c30468j) {
        return ((C30440B2) c30468j.f61433a.getValue()).f61312m;
    }

    /* JADX INFO: renamed from: b */
    public static final C28651g m70365b(C30468J c30468j) {
        return ((C30440B2) c30468j.f61433a.getValue()).f61313n;
    }

    /* JADX INFO: renamed from: c */
    public static final C30747r m70366c(C30468J c30468j) {
        C32635M c32635m;
        C30800z c30800z = new C30800z();
        C30440B2 c30440b2 = (C30440B2) c30468j.f61433a.getValue();
        C30360a c30360a = new C30360a(c30440b2.f61302c && ((c32635m = c30440b2.f61310k) == null || (!c30440b2.f61296Q && c32635m.m71250c().isEmpty())), ((C30440B2) c30468j.f61433a.getValue()).f61300a);
        CameraX$Mode cameraX$ModeM70314g = ((C30440B2) c30468j.f61433a.getValue()).m70314g();
        C30440B2 c30440b3 = (C30440B2) c30468j.f61433a.getValue();
        Size size = c30440b3.f61307h.f67922k;
        if (size == null || !c30440b3.f61286G) {
            size = null;
        }
        C30440B2 c30440b4 = (C30440B2) c30468j.f61433a.getValue();
        C33313g c33313g = c30440b4.f61308i;
        return new C30747r(new C30372e(false, cameraX$ModeM70314g, size, new C28732b(c33313g.f67926a, AbstractC30566i.m70409a(c33313g.f67928c), AbstractC30566i.m70409a(c30440b4.f61308i.f67929d), TimeUnit.SECONDS.toMillis(c30440b4.f61308i.f67927b), ((long) c30440b4.f61308i.f67930e) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)), c30360a, c30800z);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m70367d(C30468J c30468j) {
        ((C30440B2) c30468j.f61433a.getValue()).m70318j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m70368e(C30468J c30468j) {
        BottomSheetBehavior bottomSheetBehavior = c30468j.f61434b.f61154j;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final C30388m m70369f(C30468J c30468j) {
        return ((C30440B2) c30468j.f61433a.getValue()).f61311l;
    }

    /* JADX INFO: renamed from: g */
    public static final ViewModelProvider.Factory m70370g(C30468J c30468j) {
        return new C30448D2(c30468j, c30468j.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30468j.getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f61435c.f62127i.m69525u());
        C28936t c28936t = ((C30440B2) this.f61433a.getValue()).f61285F;
        KProperty kProperty = C30440B2.f61279U[5];
        Boolean bool = (Boolean) c28936t.m69705a();
        bool.getClass();
        linkedHashMap.put("isAutocaptureEnabled", bool);
        Boolean bool2 = ((C30538d1) ((C30440B2) this.f61433a.getValue()).f61287H.getValue()).f61666b;
        if (bool2 != null) {
            linkedHashMap.put("isAutocaptureActive", bool2);
        }
        return linkedHashMap;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        return ((C30440B2) this.f61433a.getValue()).f61300a.f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_document_picker_v2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f61435c.f62127i.m69525u());
        C28936t c28936t = ((C30440B2) this.f61433a.getValue()).f61285F;
        KProperty kProperty = C30440B2.f61279U[5];
        Boolean bool = (Boolean) c28936t.m69705a();
        bool.getClass();
        linkedHashMap.put("isAutocaptureEnabled", bool);
        Boolean bool2 = ((C30538d1) ((C30440B2) this.f61433a.getValue()).f61287H.getValue()).f61666b;
        if (bool2 != null) {
            linkedHashMap.put("isAutocaptureActive", bool2);
        }
        return linkedHashMap;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF62175b() {
        return this.f61439g;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30440B2) this.f61433a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(final InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C30526b1) {
            C30378h c30378h = this.f61435c.f62125g;
            C28746l c28746l = c30378h.f61116m;
            if (c28746l == null) {
                C33272c.f67816e.f67810a.mo68956e(c30378h.f61111h, "takePicture: cameraX is null, aborting", null);
            } else {
                c28746l.m69574g();
            }
        } else if (interfaceC28145r instanceof C28137n) {
            this.f61435c.f62128j.m70201a((C28137n) interfaceC28145r);
        } else if (interfaceC28145r instanceof C32638P) {
            this.f61437e.mo69598p();
        } else {
            super.handleEvent(interfaceC28145r);
        }
        if (interfaceC28145r instanceof C30592m1) {
            C30592m1 c30592m1 = (C30592m1) interfaceC28145r;
            RectF rectF = new RectF(AbstractC30566i.m70408a(c30592m1.f61789c.m71661a(), c30592m1.f61787a.getWidth() / c30592m1.f61788b.getWidth(), c30592m1.f61787a.getHeight() / c30592m1.f61788b.getHeight()));
            this.f61440h.mapRect(rectF);
            C30369d c30369d = this.f61435c.f62126h;
            SNSCornersOverlayView sNSCornersOverlayView = (SNSCornersOverlayView) c30369d.f61091f.getValue(c30369d, C30369d.f61089h[0]);
            if (sNSCornersOverlayView != null) {
                sNSCornersOverlayView.setDocRect(rectF);
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30550f1) {
            C30369d c30369d2 = this.f61435c.f62126h;
            SNSCornersOverlayView sNSCornersOverlayView2 = (SNSCornersOverlayView) c30369d2.f61091f.getValue(c30369d2, C30369d.f61089h[0]);
            if (sNSCornersOverlayView2 != null) {
                sNSCornersOverlayView2.setDocRect(null);
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30598n1) {
            SNSPhotoMadeOverlay sNSPhotoMadeOverlay = (SNSPhotoMadeOverlay) this.f61438f.getValue(this, f61432p[0]);
            if (sNSPhotoMadeOverlay != null) {
                sNSPhotoMadeOverlay.flash(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.q3
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C30468J.m70360a(interfaceC28145r);
                    }
                });
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30586l1) {
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(this, 100, null, 2, null);
        } else if (interfaceC28145r instanceof C30580k1) {
            this.f61435c.f62125g.m70261n();
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70373a((C30627s1) interfaceC28147s);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "finishing photo screen: " + abstractC28503w, null);
        BottomSheetBehavior bottomSheetBehavior = this.f61434b.f61154j;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            m69084e();
            return true;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f61434b.f61154j;
        if (bottomSheetBehavior2 == null) {
            return false;
        }
        bottomSheetBehavior2.setState(4);
        return false;
    }

    @Override // com.sumsub.sns.internal.core.common.InterfaceC28407M0
    public final Boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.f61435c.f62129k.onKeyDown(i11, keyEvent);
    }

    public C30468J() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.p3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70370g(this.f61850b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30453F(new C30449E(this)));
        this.f61433a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30440B2.class), new C30457G(lazy), new C30461H(lazy), function0);
        this.f61434b = new C30394p(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.s3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70369f(this.f61880b);
            }
        }, new C30390n());
        this.f61435c = new C30751t(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.t3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70359a(this.f61896b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.u3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70365b(this.f61908b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.v3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70366c(this.f61921b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.w3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30468J.m70361a(this.f61934b, (InterfaceC28752r) obj);
            }
        }, new C30433A(this, null), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.x3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70367d(this.f61943b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.y3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30468J.m70368e(this.f61955b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.z3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30468J.m70362a(this.f61965b, (C29054T) obj);
            }
        });
        this.f61436d = new C30572j(this);
        this.f61437e = new C32637O(this, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.a4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30468J.m70363a(this.f61637b, ((Boolean) obj).booleanValue());
            }
        });
        this.f61438f = new C28404L(R$id.photo_made_indicator);
        this.f61439g = AbstractC28047a.m69058a(this);
        this.f61440h = new Matrix();
        this.f61441i = new RectF();
        this.f61442j = new Rect();
        this.f61443k = new Matrix();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "creating Document Picker view, autoCaptureExpanded = true", null);
        AbstractC28421U.m69305b(((C30440B2) this.f61433a.getValue()).f61287H, getViewLifecycleOwner(), new C30445D(this, null));
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70362a(C30468J c30468j, C29054T c29054t) {
        C30440B2 c30440b2 = (C30440B2) c30468j.f61433a.getValue();
        if (c30440b2.f61291L && c30440b2.f61286G) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Gallery picking NOT allowed here!!", null);
            C33272c.f67814c.mo68959w("DocCapture", "Gallery picking NOT allowed here!!", new RuntimeException("Gallery picking NOT allowed here!!"));
            if (C28468k0.f57988f) {
                throw new IllegalStateException("Check failed.");
            }
        } else {
            AbstractC28052C.finish$default(c30440b2, null, C29054T.m69738a(c29054t, null, null, (IdentitySide) c30440b2.f61309j.get("current_side"), 1007), null, null, 13, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m70374b(C30538d1 c30538d1) {
        C30538d1 c30538d2;
        C30616q1 c30616q1;
        C28746l c28746l;
        File file;
        C30616q1 c30616q2;
        C30616q1 c30616q3 = c30538d1.f61665a;
        if (c30616q3 != null && (file = c30616q3.f61857a) != null) {
            C30538d1 c30538d3 = this.f61445m;
            if (((c30538d3 == null || (c30616q2 = c30538d3.f61665a) == null) ? null : c30616q2.f61857a) != null || !c30616q3.f61858b) {
                file = null;
            }
            if (file != null) {
                C30440B2 c30440b2 = (C30440B2) this.f61433a.getValue();
                C33313g c33313g = c30440b2.f61308i;
                String str = "start video recording: " + new C28732b(c33313g.f67926a, AbstractC30566i.m70409a(c33313g.f67928c), AbstractC30566i.m70409a(c30440b2.f61308i.f67929d), TimeUnit.SECONDS.toMillis(c30440b2.f61308i.f67927b), ((long) c30440b2.f61308i.f67930e) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                C33270a c33270a = C33272c.f67816e;
                c33270a.f67810a.mo68955d("DocCapture", str, null);
                C30378h c30378h = this.f61435c.f62125g;
                C28746l c28746l2 = c30378h.f61116m;
                if (c28746l2 == null) {
                    c33270a.f67810a.mo68956e(c30378h.f61111h, "startVideoRecording: cameraX is null, aborting", null);
                } else {
                    c28746l2.m69567a(file);
                }
            }
        }
        C30616q1 c30616q4 = c30538d1.f61665a;
        if (c30616q4 == null || c30616q4.f61858b || (c30538d2 = this.f61445m) == null || (c30616q1 = c30538d2.f61665a) == null || !c30616q1.f61858b || (c28746l = this.f61435c.f62125g.f61116m) == null) {
            return;
        }
        c28746l.m69573f();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70363a(C30468J c30468j, boolean z11) {
        C30440B2 c30440b2 = (C30440B2) c30468j.f61433a.getValue();
        C32635M c32635m = c30440b2.f61310k;
        if (c32635m != null) {
            C28936t c28936t = c30440b2.f61318s;
            KProperty kProperty = C30440B2.f61279U[1];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.FALSE);
            C41696j.m91104d(ViewModelKt.getViewModelScope(c30440b2), null, null, new C30459G1(z11, c30440b2, c32635m, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70361a(C30468J c30468j, InterfaceC28752r interfaceC28752r) {
        if (interfaceC28752r instanceof C28748n) {
            ((C30440B2) c30468j.f61433a.getValue()).m70303a(((C28748n) interfaceC28752r).f58480a);
        } else if (interfaceC28752r instanceof C28749o) {
            ((C30440B2) c30468j.f61433a.getValue()).getClass();
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "onCameraPreviewReady", null);
        } else if (interfaceC28752r instanceof C28751q) {
            ((C30440B2) c30468j.f61433a.getValue()).m70308b(((C28751q) interfaceC28752r).f58483a);
        } else if (interfaceC28752r instanceof C28750p) {
            ((C30440B2) c30468j.f61433a.getValue()).m70298a(((C28750p) interfaceC28752r).f58482a);
        } else if (interfaceC28752r instanceof C28747m) {
            C30440B2 c30440b2 = (C30440B2) c30468j.f61433a.getValue();
            if (((C28747m) interfaceC28752r).f58479a instanceof C28757w) {
                C28936t c28936t = c30440b2.f61323x;
                KProperty kProperty = C30440B2.f61279U[4];
                c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
                c30440b2.fireEvent(C30580k1.f61758a);
            } else {
                c30440b2.getClass();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70373a(C30627s1 c30627s1) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "handleState: " + c30627s1, null);
        C30751t c30751t = this.f61435c;
        c30627s1.getClass();
        c30751t.m70447a(c30627s1.f61877a);
        C30572j c30572j = this.f61436d;
        C30622r1 c30622r1 = c30627s1.f61878b;
        C30460G2 c30460g2 = c30572j.f61742h;
        if (c30622r1 != null) {
            C28778k c28778k = c30460g2.f61414i;
            KProperty[] kPropertyArr = C30460G2.f61409k;
            TextView textView = (TextView) c28778k.getValue(c30460g2, kPropertyArr[1]);
            if (textView != null) {
                textView.setText(c30622r1.f61868a);
            }
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) c30460g2.f61415j.getValue(c30460g2, kPropertyArr[2]);
            if (linearProgressIndicator != null) {
                linearProgressIndicator.setProgress(c30622r1.f61869b);
            }
            ViewGroup viewGroup = (ViewGroup) c30460g2.f61413h.getValue(c30460g2, kPropertyArr[0]);
            if (viewGroup != null) {
                AbstractC28443c1.m69322a(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) c30460g2.f61413h.getValue(c30460g2, C30460G2.f61409k[0]);
        if (viewGroup2 != null) {
            AbstractC28443c1.m69323b(viewGroup2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70360a(InterfaceC28145r interfaceC28145r) {
        ((C30598n1) interfaceC28145r).f61812a.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX INFO: renamed from: a */
    public final void m70372a(C30538d1 c30538d1) {
        SNSCornersOverlayView.State state;
        View view;
        int i11;
        SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "handleDocumentCaptureState: " + c30538d1, null);
        m70374b(c30538d1);
        C30751t c30751t = this.f61435c;
        C30516Z0 c30516z0 = c30538d1.f61667c;
        if (c30516z0 != null && (sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30516z0.f61626c) != null) {
            int i12 = AbstractC30659z.f61956a[sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.ordinal()];
            if (i12 == 1) {
                state = SNSCornersOverlayView.State.DEFAULT;
            } else if (i12 == 2) {
                state = SNSCornersOverlayView.State.RED;
            } else if (i12 == 3) {
                state = SNSCornersOverlayView.State.YELLOW;
            } else if (i12 == 4) {
                state = SNSCornersOverlayView.State.GREEN;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (state == null) {
                if (Intrinsics.areEqual(c30538d1.f61666b, Boolean.TRUE)) {
                    state = SNSCornersOverlayView.State.RED;
                } else {
                    state = SNSCornersOverlayView.State.DEFAULT;
                }
            }
        } else if (Intrinsics.areEqual(c30538d1.f61666b, Boolean.TRUE)) {
            state = SNSCornersOverlayView.State.RED;
        } else {
            state = SNSCornersOverlayView.State.DEFAULT;
        }
        C30369d c30369d = c30751t.f62126h;
        SNSCornersOverlayView sNSCornersOverlayView = (SNSCornersOverlayView) c30369d.f61091f.getValue(c30369d, C30369d.f61089h[0]);
        if (sNSCornersOverlayView != null) {
            sNSCornersOverlayView.setState(state);
        }
        C30572j c30572j = this.f61436d;
        C30544e1 c30544e1 = c30538d1.f61668d;
        String str = c30544e1 != null ? c30544e1.f61690a : null;
        String str2 = c30544e1 != null ? c30544e1.f61691b : null;
        C30584l c30584l = c30572j.f61740f;
        if (str != null) {
            C28778k c28778k = c30584l.f61768i;
            KProperty[] kPropertyArr = C30584l.f61763l;
            TextView textView = (TextView) c28778k.getValue(c30584l, kPropertyArr[1]);
            if (textView != null) {
                AbstractC28458h.m69341a(textView, str2);
            }
            ImageView imageView = (ImageView) c30584l.f61769j.getValue(c30584l, kPropertyArr[2]);
            if (imageView != null) {
                imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(c30584l.f58549a.requireContext(), str));
            }
            ViewGroup viewGroup = (ViewGroup) c30584l.f61767h.getValue(c30584l, kPropertyArr[0]);
            if (viewGroup != null) {
                AbstractC28443c1.m69322a(viewGroup);
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) c30584l.f61767h.getValue(c30584l, C30584l.f61763l[0]);
            if (viewGroup2 != null) {
                AbstractC28443c1.m69323b(viewGroup2);
            }
        }
        C30572j c30572j2 = this.f61436d;
        C30516Z0 c30516z1 = c30538d1.f61667c;
        c30572j2.f61741g.m70406a(c30516z1 != null ? c30516z1.f61624a : null, Intrinsics.areEqual(c30538d1.f61666b, Boolean.TRUE));
        C30572j c30572j3 = this.f61436d;
        C30610p1 c30610p1 = c30538d1.f61669e;
        boolean z11 = c30610p1 != null;
        AbstractC29180q2 abstractC29180q2 = c30610p1 != null ? c30610p1.f61840a : null;
        IdentitySide identitySide = c30610p1 != null ? c30610p1.f61841b : null;
        Float f11 = c30610p1 != null ? c30610p1.f61842c : null;
        C30584l c30584l2 = c30572j3.f61740f;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) c30584l2.f61770k.getValue(c30584l2, C30584l.f61763l[3]);
        if (lottieAnimationView != null) {
            if (!z11) {
                AbstractC28443c1.m69323b(lottieAnimationView);
            } else {
                if (abstractC29180q2 instanceof C29145k2) {
                    i11 = R$raw.sns_autocapture_tilt_passport;
                } else {
                    i11 = identitySide == IdentitySide.Back ? R$raw.sns_autocapture_tilt_id_back : R$raw.sns_autocapture_tilt_id_front;
                }
                AbstractC28427X.m69311a(lottieAnimationView, f11);
                lottieAnimationView.setAnimation(i11);
                AbstractC28443c1.m69322a(lottieAnimationView);
            }
        }
        final C28135m c28135m = c30538d1.f61670f;
        if (c28135m != null && (view = getView()) != null) {
            view.post(new Runnable() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.r3
                @Override // java.lang.Runnable
                public final void run() {
                    C30468J.m70364a(this.f61871b, c28135m);
                }
            });
        }
        this.f61445m = c30538d1;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70364a(C30468J c30468j, C28135m c28135m) {
        AbstractActivityC28115f baseActivity = c30468j.getBaseActivity();
        AbstractC29149l0 abstractC29149l0 = c28135m.f57362a;
        String str = c28135m.f57363b;
        CharSequence charSequence = c28135m.f57364c;
        int i11 = AbstractActivityC28115f.f57327i;
        baseActivity.mo69076a(abstractC29149l0, str, charSequence, null);
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m70371a(int i11, int i12) {
        Bitmap bitmap = this.f61444l;
        if (bitmap != null && bitmap.getWidth() == i11 && bitmap.getHeight() == i12 && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmap2 = this.f61444l;
        if (bitmap2 != null) {
            if (!bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            this.f61444l = null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, config);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "prepared frame bitmap " + bitmapCreateBitmap.getWidth() + "x" + bitmapCreateBitmap.getHeight(), null);
        Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, true);
        if (bitmapCreateBitmap != bitmapCopy) {
            bitmapCreateBitmap.recycle();
        }
        this.f61444l = bitmapCopy;
        return bitmapCopy;
    }
}
