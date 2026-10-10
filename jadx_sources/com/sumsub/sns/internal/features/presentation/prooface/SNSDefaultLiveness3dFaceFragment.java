package com.sumsub.sns.internal.features.presentation.prooface;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Size;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSBackgroundView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSLivenessFaceView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.databinding.C28321A;
import com.sumsub.sns.databinding.C28344i;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.android.C28626A;
import com.sumsub.sns.internal.core.presentation.android.C28638M;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.android.C28707v;
import com.sumsub.sns.internal.core.presentation.camera.C28732b;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29181q3;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import com.sumsub.sns.internal.features.data.model.prooface.C29801D;
import com.sumsub.sns.internal.features.data.model.prooface.C29802E;
import com.sumsub.sns.internal.features.data.model.prooface.C29803F;
import com.sumsub.sns.internal.features.data.model.prooface.C29805H;
import com.sumsub.sns.internal.features.data.model.prooface.C29806I;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.util.camera.C33394d;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/prooface/N;", "Lcom/sumsub/sns/internal/features/presentation/prooface/k0;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDefaultLiveness3dFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDefaultLiveness3dFaceFragment.kt\ncom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,636:1\n106#2,15:637\n256#3,2:652\n254#3:655\n1#4:654\n*S KotlinDebug\n*F\n+ 1 SNSDefaultLiveness3dFaceFragment.kt\ncom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment\n*L\n70#1:637,15\n319#1:652,2\n335#1:655\n*E\n"})
public final class SNSDefaultLiveness3dFaceFragment extends AbstractC28064I<C32021N, C32109k0> implements SensorEventListener {

    /* JADX INFO: renamed from: p */
    public static final Companion f65151p = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final Lazy f65152a;

    /* JADX INFO: renamed from: b */
    public final Screen f65153b;

    /* JADX INFO: renamed from: c */
    public C28344i f65154c;

    /* JADX INFO: renamed from: d */
    public final Lazy f65155d;

    /* JADX INFO: renamed from: e */
    public int f65156e;

    /* JADX INFO: renamed from: f */
    public int f65157f;

    /* JADX INFO: renamed from: g */
    public boolean f65158g;

    /* JADX INFO: renamed from: h */
    public float f65159h;

    /* JADX INFO: renamed from: i */
    public SensorManager f65160i;

    /* JADX INFO: renamed from: j */
    public Sensor f65161j;

    /* JADX INFO: renamed from: k */
    public boolean f65162k;

    /* JADX INFO: renamed from: l */
    public final boolean f65163l;

    /* JADX INFO: renamed from: m */
    public final C28638M f65164m;

    /* JADX INFO: renamed from: n */
    public final C28707v f65165n;

    /* JADX INFO: renamed from: o */
    public AbstractC31985B f65166o;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;", "", "<init>", "()V", "Lcom/sumsub/sns/internal/features/data/model/common/X;", "documentType", "Landroidx/fragment/app/Fragment;", "newInstance", "(Lcom/sumsub/sns/internal/features/data/model/common/X;)Landroidx/fragment/app/Fragment;", "", "RESULT_DELAY", "J", "", "MINIMUM_LIGHT", "I", "OPTIMAL_IMAGE_HEIGHT", "OPTIMAL_IMAGE_WIDTH", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Keep
        @NotNull
        public final Fragment newInstance(@NotNull C29070X documentType) {
            SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment = new SNSDefaultLiveness3dFaceFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", documentType.f59014a);
            sNSDefaultLiveness3dFaceFragment.setArguments(bundle);
            return sNSDefaultLiveness3dFaceFragment;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70976a(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        C28344i c28344i = sNSDefaultLiveness3dFaceFragment.f65154c;
        SNSBackgroundView sNSBackgroundView = c28344i != null ? c28344i.f57737e : null;
        if (sNSBackgroundView == null || sNSBackgroundView.getVisibility() != 0) {
            C28344i c28344i2 = sNSDefaultLiveness3dFaceFragment.f65154c;
            SNSBackgroundView sNSBackgroundView2 = c28344i2 != null ? c28344i2.f57737e : null;
            if (sNSBackgroundView2 != null) {
                sNSBackgroundView2.setVisibility(0);
            }
            SNSImageView sNSImageViewM70990h = sNSDefaultLiveness3dFaceFragment.m70990h();
            if (sNSImageViewM70990h != null) {
                sNSImageViewM70990h.setScaleX(0.0f);
            }
            SpringAnimation springAnimation = new SpringAnimation(sNSDefaultLiveness3dFaceFragment.m70990h(), DynamicAnimation.SCALE_X, 1.0f);
            springAnimation.getSpring().setStiffness(200.0f);
            springAnimation.getSpring().setDampingRatio(0.75f);
            springAnimation.start();
            SNSImageView sNSImageViewM70990h2 = sNSDefaultLiveness3dFaceFragment.m70990h();
            if (sNSImageViewM70990h2 != null) {
                sNSImageViewM70990h2.setScaleY(0.0f);
            }
            SpringAnimation springAnimation2 = new SpringAnimation(sNSDefaultLiveness3dFaceFragment.m70990h(), DynamicAnimation.SCALE_Y, 1.0f);
            springAnimation2.getSpring().setStiffness(200.0f);
            springAnimation2.getSpring().setDampingRatio(0.75f);
            springAnimation2.start();
            C28344i c28344i3 = sNSDefaultLiveness3dFaceFragment.f65154c;
            SNSPrimaryButton sNSPrimaryButton = c28344i3 != null ? c28344i3.f57746n : null;
            if (sNSPrimaryButton != null && sNSPrimaryButton.getVisibility() == 0) {
                sNSPrimaryButton.setAlpha(0.0f);
                sNSPrimaryButton.animate().alpha(1.0f).start();
            }
            SNSH2TextView sNSH2TextViewM70991i = sNSDefaultLiveness3dFaceFragment.m70991i();
            if (sNSH2TextViewM70991i != null) {
                sNSH2TextViewM70991i.setAlpha(1.0f);
                sNSH2TextViewM70991i.animate().alpha(0.0f).start();
            }
            if (sNSDefaultLiveness3dFaceFragment.f65158g && sNSDefaultLiveness3dFaceFragment.f65164m.m69484s()) {
                sNSDefaultLiveness3dFaceFragment.m70985a(sNSDefaultLiveness3dFaceFragment.requireContext(), sNSDefaultLiveness3dFaceFragment.f65156e, sNSDefaultLiveness3dFaceFragment.f65157f);
                sNSDefaultLiveness3dFaceFragment.f65158g = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m70982f(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        SharedPreferences.Editor editorEdit = ((C32109k0) sNSDefaultLiveness3dFaceFragment.f65152a.getValue()).f65361f.f60333b.edit();
        editorEdit.putBoolean("dont_show_settings_dialog", true);
        editorEdit.commit();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final ViewModelProvider.Factory m70983g(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        return new C32113l0(sNSDefaultLiveness3dFaceFragment, sNSDefaultLiveness3dFaceFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), sNSDefaultLiveness3dFaceFragment.getArguments());
    }

    /* JADX INFO: renamed from: b */
    public static final C28746l m70978b(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        CameraX$Mode cameraX$Mode = CameraX$Mode.ANALYZER;
        Size size = new Size(1280, 720);
        CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
        C32079e c32079e = new C32079e(sNSDefaultLiveness3dFaceFragment);
        return new C28746l(cameraX$Mode, size, 1, new C28732b(), cameraSelector, (C33394d) sNSDefaultLiveness3dFaceFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58187y.getValue(), c32079e);
    }

    /* JADX INFO: renamed from: c */
    public static final C28651g m70979c(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        return ((C32109k0) sNSDefaultLiveness3dFaceFragment.f65152a.getValue()).f65378w;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m70980d(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        C32109k0 c32109k0 = (C32109k0) sNSDefaultLiveness3dFaceFragment.f65152a.getValue();
        C28936t c28936t = c32109k0.f65379x;
        KProperty kProperty = C32109k0.f65342M[0];
        if (((Boolean) c28936t.m69705a()).booleanValue() && !c32109k0.f65361f.f60333b.getBoolean("dont_show_settings_dialog", false)) {
            sNSDefaultLiveness3dFaceFragment.f65164m.m69482q();
        }
        sNSDefaultLiveness3dFaceFragment.m70992j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m70981e(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(sNSDefaultLiveness3dFaceFragment, C28491s.f58027b, null, null, 6, null);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void finish$idensic_mobile_sdk_aar_defaultRelease(AbstractC28503w abstractC28503w, Object obj, Long l11) {
        if (!(obj instanceof C29181q3)) {
            super.finish$idensic_mobile_sdk_aar_defaultRelease(abstractC28503w, obj, l11);
            return;
        }
        C29181q3 c29181q3 = (C29181q3) obj;
        AbstractC29807J abstractC29807J = c29181q3.f59178a;
        if (abstractC29807J instanceof C29806I) {
            InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
            if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
                ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70608a(c29181q3.f59179b);
                return;
            }
            return;
        }
        if (abstractC29807J instanceof C29801D) {
            AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, new C28494t(), null, null, 6, null);
            return;
        }
        if (abstractC29807J instanceof C29805H) {
            AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, C28491s.f58027b, null, null, 6, null);
            return;
        }
        if (abstractC29807J instanceof C29803F) {
            ((C32109k0) this.f65152a.getValue()).m71046f();
            ((C28746l) this.f65155d.getValue()).m69572e();
            AbstractC28052C.throwError$default((C32109k0) this.f65152a.getValue(), ((C29803F) c29181q3.f59178a).f59879a, getF66531c(), null, 4, null);
        } else {
            if (!(abstractC29807J instanceof C29802E)) {
                AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, C28491s.f58027b, null, null, 6, null);
                return;
            }
            ((C32109k0) this.f65152a.getValue()).m71046f();
            ((C28746l) this.f65155d.getValue()).m69572e();
            AbstractC28052C.throwError$default((C32109k0) this.f65152a.getValue(), ((C29802E) c29181q3.f59178a).f59878a, getF66531c(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final SNSLivenessFaceView m70989g() {
        C28344i c28344i = this.f65154c;
        if (c28344i != null) {
            return c28344i.f57740h;
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66531c() {
        return ((C32109k0) this.f65152a.getValue()).f65357b.f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_liveness_3dface);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return MapsKt.plus(this.f65165n.m69525u(), this.f65164m.m69483r());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final TextView getPoweredByText() {
        C28321A c28321a;
        C28344i c28344i = this.f65154c;
        if (c28344i == null || (c28321a = c28344i.f57745m) == null) {
            return null;
        }
        return c28321a.f57621b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF61466G() {
        return this.f65153b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32109k0) this.f65152a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final SNSImageView m70990h() {
        C28344i c28344i = this.f65154c;
        if (c28344i != null) {
            return c28344i.f57742j;
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        AbstractC32267d.m71078a("handleEvent: " + interfaceC28145r);
        if (interfaceC28145r instanceof C32277w) {
            AbstractC32267d.m71078a("HandleErrorEvent: " + ((C32277w) interfaceC28145r).f65747a);
            this.f65162k = false;
            updateShowProgress(true);
            m70992j();
            return;
        }
        if (!(interfaceC28145r instanceof C28135m)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        ((C32109k0) this.f65152a.getValue()).m71046f();
        ((C28746l) this.f65155d.getValue()).m69572e();
        AbstractActivityC28115f baseActivity = getBaseActivity();
        C28135m c28135m = (C28135m) interfaceC28145r;
        AbstractC29149l0 abstractC29149l0 = c28135m.f57362a;
        String str = c28135m.f57363b;
        CharSequence charSequence = c28135m.f57364c;
        int i11 = AbstractActivityC28115f.f57327i;
        baseActivity.mo69076a(abstractC29149l0, str, charSequence, null);
    }

    /* JADX INFO: renamed from: i */
    public final SNSH2TextView m70991i() {
        C28344i c28344i = this.f65154c;
        if (c28344i != null) {
            return c28344i.f57741i;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m70992j() {
        ((C32109k0) this.f65152a.getValue()).getClass();
        if (C33048a.f67453P.m71434a()) {
            C33272c.f67816e.f67810a.mo68956e("Prooface", "Init camera FORBIDDEN", null);
            return;
        }
        AbstractC32267d.m71078a("Init camera");
        C28746l c28746l = (C28746l) this.f65155d.getValue();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        PreviewView previewViewM70988f = m70988f();
        Size size = C28746l.f58454x;
        c28746l.m69566a(viewLifecycleOwner, previewViewM70988f, (Function0) null);
    }

    /* JADX INFO: renamed from: k */
    public final void m70993k() {
        if (this.f65159h >= 10.0f || this.f65158g || !this.f65164m.m69484s()) {
            return;
        }
        Pair pairM70985a = m70985a(requireContext(), 0, 255);
        this.f65156e = ((Number) pairM70985a.getFirst()).intValue();
        this.f65157f = ((Number) pairM70985a.getSecond()).intValue();
        this.f65158g = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m70994l() {
        if (this.f65162k) {
            return;
        }
        C28344i c28344i = this.f65154c;
        SNSImageView sNSImageView = c28344i != null ? c28344i.f57736d : null;
        if (sNSImageView != null) {
            sNSImageView.setVisibility(8);
        }
        C32109k0 c32109k0 = (C32109k0) this.f65152a.getValue();
        c32109k0.getClass();
        AbstractC32267d.m71078a("startSession()");
        ImageProxy imageProxy = c32109k0.f65375t;
        if (imageProxy != null) {
            imageProxy.close();
        }
        c32109k0.showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c32109k0), null, null, new C32105j0(c32109k0, null), 3, null);
        this.f65162k = true;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!(abstractC28503w instanceof C28497u)) {
            m69084e();
            return true;
        }
        C28344i c28344i = this.f65154c;
        ConstraintLayout constraintLayout = c28344i != null ? c28344i.f57738f : null;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        ((C32109k0) this.f65152a.getValue()).m71042a(C29805H.f59881a, (String) null);
        return false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f65159h = sensorEvent.values[0];
        m70993k();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStop() {
        ((C32109k0) this.f65152a.getValue()).m71046f();
        this.f65162k = false;
        super.onStop();
    }

    public SNSDefaultLiveness3dFaceFragment() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.j2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSDefaultLiveness3dFaceFragment.m70983g(this.f65340b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32108k(new C32104j(this)));
        this.f65152a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32109k0.class), new C32112l(lazy), new C32116m(lazy), function0);
        this.f65153b = Screen.LivenessScreen;
        this.f65155d = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.k2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSDefaultLiveness3dFaceFragment.m70978b(this.f65382b);
            }
        });
        this.f65157f = 255;
        this.f65159h = Float.MAX_VALUE;
        this.f65163l = C33048a.f67479l.m71434a();
        this.f65164m = new C28638M(this, new C32123o(this), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.l2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSDefaultLiveness3dFaceFragment.m70982f(this.f65388b);
            }
        });
        this.f65165n = new C28707v(this, SetsKt.setOf(C28626A.f58259e), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSDefaultLiveness3dFaceFragment.m70979c(this.f65391b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.n2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSDefaultLiveness3dFaceFragment.m70980d(this.f65397b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.o2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSDefaultLiveness3dFaceFragment.m70981e(this.f65404b);
            }
        }, 8);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return getOpenPayload();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((C28746l) this.f65155d.getValue()).m69572e();
        this.f65154c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f65160i;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        if (this.f65158g && this.f65164m.m69484s()) {
            m70985a(requireContext(), this.f65156e, this.f65157f);
            this.f65158g = false;
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f65160i;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.f65161j, 3);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getIsPrepared()) {
            this.f65165n.m69523s();
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f65154c = C28344i.m69250a(view);
        super.onViewCreated(view, bundle);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void onViewModelPrepared(Bundle bundle) {
        Sensor defaultSensor;
        int i11;
        super.onViewModelPrepared(bundle);
        SNSLivenessFaceView sNSLivenessFaceViewM70989g = m70989g();
        if (sNSLivenessFaceViewM70989g != null) {
            sNSLivenessFaceViewM70989g.setVisibility(4);
        }
        SensorManager sensorManager = (SensorManager) requireContext().getSystemService("sensor");
        this.f65160i = sensorManager;
        TextView textView = null;
        if (sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(5);
        } else {
            defaultSensor = null;
        }
        this.f65161j = defaultSensor;
        AbstractC28421U.m69305b(((C32109k0) this.f65152a.getValue()).f65351H, getViewLifecycleOwner(), new C32084f(this, null));
        AbstractC28421U.m69305b(((C32109k0) this.f65152a.getValue()).f65353J, getViewLifecycleOwner(), new C32089g(this, null));
        SNSLivenessFaceView sNSLivenessFaceViewM70989g2 = m70989g();
        if (sNSLivenessFaceViewM70989g2 != null) {
            sNSLivenessFaceViewM70989g2.setStateListener(new C32094h(this));
        }
        C28344i c28344i = this.f65154c;
        if (c28344i != null) {
            textView = c28344i.f57739g;
        }
        if (textView != null) {
            if (this.f65163l) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
        this.f65165n.m69523s();
    }

    /* JADX INFO: renamed from: f */
    public final PreviewView m70988f() {
        C28344i c28344i = this.f65154c;
        if (c28344i != null) {
            return c28344i.f57735c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m70986a(AbstractC31985B abstractC31985B) {
        SNSLivenessFaceView sNSLivenessFaceViewM70989g;
        SNSLivenessFaceView sNSLivenessFaceViewM70989g2;
        SNSLivenessFaceView sNSLivenessFaceViewM70989g3;
        SNSLivenessFaceView sNSLivenessFaceViewM70989g4;
        AbstractC31985B abstractC31985B2 = this.f65166o;
        AbstractC31985B abstractC31985B3 = (abstractC31985B2 == null || abstractC31985B.getClass() != abstractC31985B2.getClass()) ? abstractC31985B : null;
        if (abstractC31985B3 != null) {
            AbstractC32267d.m71078a("face detector status: " + abstractC31985B3);
        }
        this.f65166o = abstractC31985B;
        C28344i c28344i = this.f65154c;
        SNSBackgroundView sNSBackgroundView = c28344i != null ? c28344i.f57737e : null;
        if (sNSBackgroundView != null && sNSBackgroundView.getVisibility() == 0) {
            SNSLivenessFaceView sNSLivenessFaceViewM70989g5 = m70989g();
            if (sNSLivenessFaceViewM70989g5 != null) {
                sNSLivenessFaceViewM70989g5.setScanCompleteState();
                return;
            }
            return;
        }
        if (this.f65162k) {
            SNSH2TextView sNSH2TextViewM70991i = m70991i();
            if (sNSH2TextViewM70991i != null) {
                sNSH2TextViewM70991i.setText(abstractC31985B.mo70973a());
            }
            if (abstractC31985B instanceof C32284y) {
                SNSLivenessFaceView sNSLivenessFaceViewM70989g6 = m70989g();
                if (sNSLivenessFaceViewM70989g6 != null) {
                    sNSLivenessFaceViewM70989g6.setRecognizingState();
                }
                if (!this.f65163l || (sNSLivenessFaceViewM70989g4 = m70989g()) == null) {
                    return;
                }
                sNSLivenessFaceViewM70989g4.setFaceRectangle(null);
                return;
            }
            if (abstractC31985B instanceof C32288z) {
                SNSLivenessFaceView sNSLivenessFaceViewM70989g7 = m70989g();
                if (sNSLivenessFaceViewM70989g7 != null) {
                    sNSLivenessFaceViewM70989g7.setRecognizingState();
                }
                if (!this.f65163l || (sNSLivenessFaceViewM70989g3 = m70989g()) == null) {
                    return;
                }
                sNSLivenessFaceViewM70989g3.setFaceRectangle(m70984a(((C32288z) abstractC31985B).f65765a));
                return;
            }
            if (abstractC31985B instanceof C31982A) {
                SNSLivenessFaceView sNSLivenessFaceViewM70989g8 = m70989g();
                if (sNSLivenessFaceViewM70989g8 != null) {
                    sNSLivenessFaceViewM70989g8.setRecognizingState();
                }
                if (!this.f65163l || (sNSLivenessFaceViewM70989g2 = m70989g()) == null) {
                    return;
                }
                sNSLivenessFaceViewM70989g2.setFaceRectangle(null);
                return;
            }
            if (abstractC31985B instanceof C32281x) {
                SNSLivenessFaceView sNSLivenessFaceViewM70989g9 = m70989g();
                if (sNSLivenessFaceViewM70989g9 != null) {
                    sNSLivenessFaceViewM70989g9.setFaceDetectedState();
                }
                if (!this.f65163l || (sNSLivenessFaceViewM70989g = m70989g()) == null) {
                    return;
                }
                sNSLivenessFaceViewM70989g.setFaceRectangle(m70984a(((C32281x) abstractC31985B).f65753a));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    /* JADX INFO: renamed from: a */
    public final RectF m70984a(RectF rectF) {
        int[] iArr = new int[2];
        PreviewView previewViewM70988f = m70988f();
        if (previewViewM70988f != null) {
            previewViewM70988f.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        SNSLivenessFaceView sNSLivenessFaceViewM70989g = m70989g();
        if (sNSLivenessFaceViewM70989g != null) {
            sNSLivenessFaceViewM70989g.getLocationInWindow(iArr2);
        }
        return new RectF(((rectF.left * m70988f().getWidth()) - iArr2[0]) + iArr[0], ((rectF.top * m70988f().getHeight()) - iArr2[1]) + iArr[1], ((rectF.right * m70988f().getWidth()) - iArr2[0]) + iArr[0], ((rectF.bottom * m70988f().getHeight()) - iArr2[1]) + iArr[1]);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70977a(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment, View view) {
        C28367f.m69257a(sNSDefaultLiveness3dFaceFragment.getAnalyticsDelegate(), Screen.LivenessScreen, sNSDefaultLiveness3dFaceFragment.getF66531c(), Control.RetryButton, null, 24);
        SNSH2TextView sNSH2TextViewM70991i = sNSDefaultLiveness3dFaceFragment.m70991i();
        if (sNSH2TextViewM70991i != null) {
            sNSH2TextViewM70991i.setAlpha(0.0f);
            sNSH2TextViewM70991i.animate().alpha(1.0f).start();
        }
        SNSLivenessFaceView sNSLivenessFaceViewM70989g = sNSDefaultLiveness3dFaceFragment.m70989g();
        if (sNSLivenessFaceViewM70989g != null) {
            sNSLivenessFaceViewM70989g.setRecognizingState();
        }
        C28344i c28344i = sNSDefaultLiveness3dFaceFragment.f65154c;
        SNSBackgroundView sNSBackgroundView = c28344i != null ? c28344i.f57737e : null;
        if (sNSBackgroundView != null) {
            sNSBackgroundView.setVisibility(8);
        }
        sNSDefaultLiveness3dFaceFragment.m70994l();
        sNSDefaultLiveness3dFaceFragment.m70993k();
    }

    /* JADX INFO: renamed from: a */
    public final Pair m70985a(Context context, int i11, int i12) {
        int i13 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode", -1);
        int i14 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        if (i13 != -1 && i14 != -1) {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", i11);
            Settings.System.putInt(context.getContentResolver(), "screen_brightness", i12);
            WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
            attributes.screenBrightness = i12 / 255.0f;
            requireActivity().getWindow().setAttributes(attributes);
        }
        return new Pair(Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* JADX WARN: Code duplicated, block: B:94:0x016b  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0172  */
    /* JADX WARN: Code duplicated, block: B:99:0x0175  */
    /* JADX INFO: renamed from: a */
    public final void m70987a(C32012K c32012k) {
        Pair pair;
        C28344i c28344i;
        SNSPrimaryButton sNSPrimaryButton;
        C29810M c29810m = c32012k.f65073a;
        String str = c29810m != null ? c29810m.f59887d : null;
        AnswerType answerType = AnswerType.Green;
        if (Intrinsics.areEqual(str, answerType.getValue())) {
            pair = new Pair(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.SUCCESS.getImageName()), SNSStepState.APPROVED);
        } else {
            if ((c29810m != null ? Intrinsics.areEqual(c29810m.f59888e, Boolean.TRUE) : false) && !Intrinsics.areEqual(c29810m.f59887d, answerType.getValue())) {
                pair = new Pair(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.SUBMITTED.getImageName()), SNSStepState.PENDING);
            } else {
                pair = new Pair(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName()), SNSStepState.REJECTED);
            }
        }
        Drawable drawable = (Drawable) pair.component1();
        SNSStepState sNSStepState = (SNSStepState) pair.component2();
        SNSImageView sNSImageViewM70990h = m70990h();
        if (sNSImageViewM70990h != null) {
            SNSStepViewExtensionsKt.setSnsStepState(sNSImageViewM70990h, sNSStepState);
        }
        SNSImageView sNSImageViewM70990h2 = m70990h();
        if (sNSImageViewM70990h2 != null) {
            sNSImageViewM70990h2.setImageDrawable(drawable);
        }
        InterfaceC32009J interfaceC32009J = c32012k.f65075c;
        if (interfaceC32009J instanceof C32003H) {
            C28344i c28344i2 = this.f65154c;
            SNSH2TextView sNSH2TextView = c28344i2 != null ? c28344i2.f57744l : null;
            if (sNSH2TextView != null) {
                sNSH2TextView.setText(((C32003H) interfaceC32009J).f65057a);
            }
            C28344i c28344i3 = this.f65154c;
            SNSSubtitle2TextView sNSSubtitle2TextView = c28344i3 != null ? c28344i3.f57743k : null;
            if (sNSSubtitle2TextView != null) {
                sNSSubtitle2TextView.setText(((C32003H) c32012k.f65075c).f65058b);
            }
            C28344i c28344i4 = this.f65154c;
            SNSSubtitle2TextView sNSSubtitle2TextView2 = c28344i4 != null ? c28344i4.f57743k : null;
            if (sNSSubtitle2TextView2 != null) {
                sNSSubtitle2TextView2.setGravity(17);
            }
        } else if (interfaceC32009J instanceof C32006I) {
            C28344i c28344i5 = this.f65154c;
            SNSH2TextView sNSH2TextView2 = c28344i5 != null ? c28344i5.f57744l : null;
            if (sNSH2TextView2 != null) {
                sNSH2TextView2.setText(((C32006I) interfaceC32009J).f65064a);
            }
            C28344i c28344i6 = this.f65154c;
            SNSSubtitle2TextView sNSSubtitle2TextView3 = c28344i6 != null ? c28344i6.f57743k : null;
            if (sNSSubtitle2TextView3 != null) {
                CharSequence charSequence = ((C32006I) c32012k.f65075c).f65065b;
                sNSSubtitle2TextView3.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
            }
            C28344i c28344i7 = this.f65154c;
            SNSSubtitle2TextView sNSSubtitle2TextView4 = c28344i7 != null ? c28344i7.f57743k : null;
            if (sNSSubtitle2TextView4 != null) {
                sNSSubtitle2TextView4.setGravity(GravityCompat.START);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!Intrinsics.areEqual(c29810m != null ? c29810m.f59887d : null, answerType.getValue())) {
            if (!(c29810m != null ? Intrinsics.areEqual(c29810m.f59888e, Boolean.TRUE) : false)) {
                C28344i c28344i8 = this.f65154c;
                SNSPrimaryButton sNSPrimaryButton2 = c28344i8 != null ? c28344i8.f57746n : null;
                if (sNSPrimaryButton2 != null) {
                    sNSPrimaryButton2.setVisibility(0);
                }
                C28344i c28344i9 = this.f65154c;
                SNSPrimaryButton sNSPrimaryButton3 = c28344i9 != null ? c28344i9.f57746n : null;
                if (sNSPrimaryButton3 != null) {
                    sNSPrimaryButton3.setText(c32012k.f65074b);
                }
                C28344i c28344i10 = this.f65154c;
                SNSPrimaryButton sNSPrimaryButton4 = c28344i10 != null ? c28344i10.f57746n : null;
                if (sNSPrimaryButton4 != null) {
                    sNSPrimaryButton4.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.prooface.p2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SNSDefaultLiveness3dFaceFragment.m70977a(this.f65409b, view);
                        }
                    });
                }
            } else {
                c28344i = this.f65154c;
                if (c28344i != null) {
                    sNSPrimaryButton = c28344i.f57746n;
                } else {
                    sNSPrimaryButton = null;
                }
                if (sNSPrimaryButton != null) {
                    sNSPrimaryButton.setVisibility(8);
                }
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C32099i(this, c29810m, null), 3, null);
            }
        } else {
            c28344i = this.f65154c;
            if (c28344i != null) {
                sNSPrimaryButton = c28344i.f57746n;
            } else {
                sNSPrimaryButton = null;
            }
            if (sNSPrimaryButton != null) {
                sNSPrimaryButton.setVisibility(8);
            }
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C32099i(this, c29810m, null), 3, null);
        }
        SNSLivenessFaceView sNSLivenessFaceViewM70989g = m70989g();
        if (sNSLivenessFaceViewM70989g != null) {
            sNSLivenessFaceViewM70989g.setScanCompleteState();
        }
    }
}
