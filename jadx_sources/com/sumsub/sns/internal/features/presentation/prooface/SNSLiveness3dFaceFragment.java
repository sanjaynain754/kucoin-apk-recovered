package com.sumsub.sns.internal.features.presentation.prooface;

import android.R;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.camera.core.CameraSelector;
import androidx.camera.view.PreviewView;
import androidx.core.view.GravityCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
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
import com.sumsub.sns.internal.core.common.C28497u;
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
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32268e;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32269f;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.util.camera.C33394d;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/i;", "Lcom/sumsub/sns/internal/features/presentation/prooface/m1;", "Lcom/sumsub/sns/internal/features/presentation/prooface/c2;", "<init>", "()V", "Companion", "FaceViewState", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSLiveness3dFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSLiveness3dFaceFragment.kt\ncom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,490:1\n106#2,15:491\n256#3,2:506\n256#3,2:508\n256#3,2:510\n256#3,2:512\n256#3,2:514\n256#3,2:516\n256#3,2:518\n256#3,2:520\n256#3,2:522\n256#3,2:524\n256#3,2:526\n256#3,2:528\n256#3,2:530\n256#3,2:532\n256#3,2:534\n256#3,2:536\n254#3:548\n49#4:538\n51#4:542\n49#4:543\n51#4:547\n46#5:539\n51#5:541\n46#5:544\n51#5:546\n105#6:540\n105#6:545\n*S KotlinDebug\n*F\n+ 1 SNSLiveness3dFaceFragment.kt\ncom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment\n*L\n74#1:491,15\n196#1:506,2\n222#1:508,2\n223#1:510,2\n225#1:512,2\n226#1:514,2\n227#1:516,2\n235#1:518,2\n236#1:520,2\n239#1:522,2\n248#1:524,2\n249#1:526,2\n266#1:528,2\n274#1:530,2\n284#1:532,2\n303#1:534,2\n308#1:536,2\n406#1:548\n345#1:538\n345#1:542\n362#1:543\n362#1:547\n345#1:539\n345#1:541\n362#1:544\n362#1:546\n345#1:540\n362#1:545\n*E\n"})
public final class SNSLiveness3dFaceFragment extends AbstractC28058F<C28344i, AbstractC32118m1, C32072c2> {

    /* JADX INFO: renamed from: j */
    public static final Companion f65167j = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final Lazy f65168a;

    /* JADX INFO: renamed from: b */
    public final Screen f65169b;

    /* JADX INFO: renamed from: c */
    public final Lazy f65170c;

    /* JADX INFO: renamed from: d */
    public final Lazy f65171d;

    /* JADX INFO: renamed from: e */
    public final boolean f65172e;

    /* JADX INFO: renamed from: f */
    public final C28638M f65173f;

    /* JADX INFO: renamed from: g */
    public final C28707v f65174g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41668m f65175h;

    /* JADX INFO: renamed from: i */
    public AbstractC32118m1 f65176i;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment$Companion;", "", "<init>", "()V", "Lcom/sumsub/sns/internal/features/data/model/common/X;", "documentType", "Landroidx/fragment/app/Fragment;", "newInstance", "(Lcom/sumsub/sns/internal/features/data/model/common/X;)Landroidx/fragment/app/Fragment;", "", "OPTIMAL_IMAGE_HEIGHT", "I", "OPTIMAL_IMAGE_WIDTH", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Keep
        @NotNull
        public final Fragment newInstance(@NotNull C29070X documentType) {
            SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment = new SNSLiveness3dFaceFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", documentType.f59014a);
            sNSLiveness3dFaceFragment.setArguments(bundle);
            return sNSLiveness3dFaceFragment;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment$FaceViewState;", "", "<init>", "(Ljava/lang/String;I)V", "Recognizing", "FaceDetected", "Processing", "ScanComplete", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum FaceViewState {
        Recognizing,
        FaceDetected,
        Processing,
        ScanComplete;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<FaceViewState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C32269f m70995a(final SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        return new C32269f(sNSLiveness3dFaceFragment.requireActivity(), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.r2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SNSLiveness3dFaceFragment.m70997b(this.f65422b));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m71001f(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        C32072c2 c32072c2 = (C32072c2) sNSLiveness3dFaceFragment.f65168a.getValue();
        C28936t c28936t = c32072c2.f65265h;
        KProperty kProperty = C32072c2.f65257x[0];
        if (((Boolean) c28936t.m69705a()).booleanValue() && !c32072c2.f65259b.f60333b.getBoolean("dont_show_settings_dialog", false)) {
            sNSLiveness3dFaceFragment.f65173f.m69482q();
        }
        ((C32072c2) sNSLiveness3dFaceFragment.f65168a.getValue()).intent(C32048W0.f65199a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m71003h(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        ((C32269f) sNSLiveness3dFaceFragment.f65171d.getValue()).m71083d();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final SNSLivenessFaceView m71008g() {
        C28344i viewBinding = getViewBinding();
        if (viewBinding != null) {
            return viewBinding.f57740h;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m70997b(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        return sNSLiveness3dFaceFragment.f65173f.m69484s();
    }

    /* JADX INFO: renamed from: c */
    public static final C28746l m70998c(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        CameraX$Mode cameraX$Mode = CameraX$Mode.ANALYZER;
        Size size = new Size(1280, 720);
        CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
        C32120n0 c32120n0 = new C32120n0(sNSLiveness3dFaceFragment);
        return new C28746l(cameraX$Mode, size, 1, new C28732b(), cameraSelector, (C33394d) sNSLiveness3dFaceFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58187y.getValue(), c32120n0);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m70999d(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        ((C32072c2) sNSLiveness3dFaceFragment.f65168a.getValue()).intent(new C32036S0(((C28746l) sNSLiveness3dFaceFragment.f65170c.getValue()).m69571d()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final C28651g m71000e(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        return ((C32072c2) sNSLiveness3dFaceFragment.f65168a.getValue()).f65264g;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m71002g(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(sNSLiveness3dFaceFragment, C28491s.f58027b, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m71004i(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        SharedPreferences.Editor editorEdit = ((C32072c2) sNSLiveness3dFaceFragment.f65168a.getValue()).f65259b.f60333b.edit();
        editorEdit.putBoolean("dont_show_settings_dialog", true);
        editorEdit.commit();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final ViewModelProvider.Factory m71005j(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        return new C32077d2(sNSLiveness3dFaceFragment, sNSLiveness3dFaceFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), sNSLiveness3dFaceFragment.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66531c() {
        return ((C32072c2) this.f65168a.getValue()).f65258a.f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return MapsKt.plus(this.f65174g.m69525u(), this.f65173f.m69483r());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Screen getScreen() {
        return this.f65169b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32072c2) this.f65168a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        AbstractC32267d.m71078a("LivenessFragment: handleEvent: " + interfaceC28145r);
        if (!(interfaceC28145r instanceof C28135m)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        AbstractActivityC28115f baseActivity = getBaseActivity();
        C28135m c28135m = (C28135m) interfaceC28145r;
        AbstractC29149l0 abstractC29149l0 = c28135m.f57362a;
        String str = c28135m.f57363b;
        CharSequence charSequence = c28135m.f57364c;
        int i11 = AbstractActivityC28115f.f57327i;
        baseActivity.mo69076a(abstractC29149l0, str, charSequence, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m71006a((AbstractC32118m1) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((C32269f) this.f65171d.getValue()).m71079a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!(abstractC28503w instanceof C28497u)) {
            return super.onFinishCalled(abstractC28503w);
        }
        ((C32072c2) this.f65168a.getValue()).intent(C32031Q0.f65135a);
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStop() {
        AbstractC32267d.m71078a("LivenessFragment: stop camera");
        ((C28746l) this.f65170c.getValue()).m69572e();
        ((C32072c2) this.f65168a.getValue()).intent(C32039T0.f65180a);
        ((C32072c2) this.f65168a.getValue()).intent(C32051X0.f65208a);
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C28344i.m69250a(layoutInflater.inflate(R$layout.sns_fragment_liveness_3dface, viewGroup, false));
    }

    public SNSLiveness3dFaceFragment() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.s2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m71005j(this.f65431b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32261u0(new C32257t0(this)));
        this.f65168a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32072c2.class), new C32274v0(lazy), new C32278w0(lazy), function0);
        this.f65169b = Screen.LivenessScreen;
        this.f65170c = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.t2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m70998c(this.f65718b);
            }
        });
        this.f65171d = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.u2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m70995a(this.f65723b);
            }
        });
        this.f65172e = C33048a.f67479l.m71434a();
        this.f65173f = new C28638M(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m71003h(this.f65746b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.w2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m71004i(this.f65752b);
            }
        });
        this.f65174g = new C28707v(this, SetsKt.setOf(C28626A.f58259e), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m71000e(this.f65757b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.y2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m71001f(this.f65764b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.z2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m71002g(this.f65771b);
            }
        }, 8);
        this.f65175h = C41674s.m91001b(0, 0, null, 7, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return getOpenPayload();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final TextView getPoweredByText() {
        C28321A c28321a;
        C28344i viewBinding = getViewBinding();
        if (viewBinding != null && (c28321a = viewBinding.f57745m) != null) {
            return c28321a.f57621b;
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((C28746l) this.f65170c.getValue()).m69572e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((C32269f) this.f65171d.getValue()).m71081b();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((C32269f) this.f65171d.getValue()).m71082c();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f65174g.m69523s();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        int i11;
        super.onViewCreated(view, bundle);
        AbstractC28421U.m69305b(C41636g.m90939v(new C31983A0(((C32072c2) this.f65168a.getValue()).f65277t)), getViewLifecycleOwner(), new C31995E0(this, null));
        AbstractC28421U.m69305b(C41636g.m90881E(C41636g.m90939v(new C31992D0(((C32072c2) this.f65168a.getValue()).f65277t))), getViewLifecycleOwner(), new C31998F0(this, null));
        C28344i viewBinding = getViewBinding();
        if (viewBinding != null) {
            textView = viewBinding.f57739g;
        } else {
            textView = null;
        }
        if (textView != null) {
            if (this.f65172e) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
        AbstractC28421U.m69304a(C41636g.m90939v(this.f65175h), this, new C32140s0(this, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m71009h() {
        AbstractC32267d.m71078a("LivenessFragment: init camera");
        ((C28746l) this.f65170c.getValue()).m69566a(getViewLifecycleOwner(), m71007f(), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.a3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSLiveness3dFaceFragment.m70999d(this.f65234b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m71006a(AbstractC32118m1 abstractC32118m1) {
        SNSStepState sNSStepState;
        SNSIconHandler.SNSResultIcons sNSResultIcons;
        AbstractC32267d.m71078a("LivenessFragment: handleState: " + abstractC32118m1);
        C28344i viewBinding = getViewBinding();
        SNSBackgroundView sNSBackgroundView = viewBinding != null ? viewBinding.f57737e : null;
        if (sNSBackgroundView != null) {
            sNSBackgroundView.setVisibility(8);
        }
        C28344i viewBinding2 = getViewBinding();
        FrameLayout frameLayout = viewBinding2 != null ? viewBinding2.f57734b : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        PreviewView previewViewM71007f = m71007f();
        if (previewViewM71007f != null) {
            previewViewM71007f.setVisibility(4);
        }
        C28344i viewBinding3 = getViewBinding();
        SNSImageView sNSImageView = viewBinding3 != null ? viewBinding3.f57736d : null;
        if (sNSImageView != null) {
            sNSImageView.setVisibility(8);
        }
        SNSLivenessFaceView sNSLivenessFaceViewM71008g = m71008g();
        if (sNSLivenessFaceViewM71008g != null) {
            sNSLivenessFaceViewM71008g.setVisibility(8);
        }
        C28344i viewBinding4 = getViewBinding();
        SNSH2TextView sNSH2TextView = viewBinding4 != null ? viewBinding4.f57741i : null;
        if (sNSH2TextView != null) {
            sNSH2TextView.setVisibility(8);
        }
        if (!(abstractC32118m1 instanceof C32086f1)) {
            if (abstractC32118m1 instanceof C32091g1) {
                ((C32269f) this.f65171d.getValue()).m71083d();
                C28344i viewBinding5 = getViewBinding();
                FrameLayout frameLayout2 = viewBinding5 != null ? viewBinding5.f57734b : null;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                SNSLivenessFaceView sNSLivenessFaceViewM71008g2 = m71008g();
                if (sNSLivenessFaceViewM71008g2 != null) {
                    sNSLivenessFaceViewM71008g2.setVisibility(0);
                }
                PreviewView previewViewM71007f2 = m71007f();
                if (previewViewM71007f2 != null) {
                    previewViewM71007f2.setVisibility(0);
                }
                C28344i viewBinding6 = getViewBinding();
                SNSH2TextView sNSH2TextView2 = viewBinding6 != null ? viewBinding6.f57741i : null;
                if (sNSH2TextView2 != null) {
                    sNSH2TextView2.setVisibility(0);
                }
                C28344i viewBinding7 = getViewBinding();
                SNSH2TextView sNSH2TextView3 = viewBinding7 != null ? viewBinding7.f57741i : null;
                if (sNSH2TextView3 != null) {
                    sNSH2TextView3.setText(((C32091g1) abstractC32118m1).f65307a);
                }
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C32124o0(this, abstractC32118m1, null), 3, null);
            } else if (abstractC32118m1 instanceof C32096h1) {
                C28344i viewBinding8 = getViewBinding();
                FrameLayout frameLayout3 = viewBinding8 != null ? viewBinding8.f57734b : null;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                SNSLivenessFaceView sNSLivenessFaceViewM71008g3 = m71008g();
                if (sNSLivenessFaceViewM71008g3 != null) {
                    sNSLivenessFaceViewM71008g3.setVisibility(0);
                }
                if (!(this.f65176i instanceof C32096h1)) {
                    TransitionSet transitionSet = new TransitionSet();
                    Fade fade = new Fade(1);
                    transitionSet.addTransition(fade);
                    Fade fade2 = new Fade(2);
                    fade2.setStartDelay(fade.getDuration());
                    transitionSet.addTransition(fade2);
                    TransitionManager.beginDelayedTransition((ViewGroup) requireView().findViewById(R$id.sns_overlay), transitionSet);
                }
                C28344i viewBinding9 = getViewBinding();
                SNSH2TextView sNSH2TextView4 = viewBinding9 != null ? viewBinding9.f57741i : null;
                if (sNSH2TextView4 != null) {
                    sNSH2TextView4.setVisibility(0);
                }
                C28344i viewBinding10 = getViewBinding();
                SNSH2TextView sNSH2TextView5 = viewBinding10 != null ? viewBinding10.f57741i : null;
                if (sNSH2TextView5 != null) {
                    sNSH2TextView5.setText(((C32096h1) abstractC32118m1).f65316a);
                }
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C32128p0(this, null), 3, null);
                C28344i viewBinding11 = getViewBinding();
                SNSImageView sNSImageView2 = viewBinding11 != null ? viewBinding11.f57736d : null;
                if (sNSImageView2 != null) {
                    sNSImageView2.setImageBitmap(((C32096h1) abstractC32118m1).f65317b);
                    sNSImageView2.setVisibility(0);
                    if (!(this.f65176i instanceof C32096h1)) {
                        sNSImageView2.setAlpha(0.0f);
                        sNSImageView2.animate().alpha(1.0f).setDuration(sNSImageView2.getResources().getInteger(R.integer.config_shortAnimTime)).start();
                    }
                }
            } else if (abstractC32118m1 instanceof C32114l1) {
                C28344i viewBinding12 = getViewBinding();
                SNSBackgroundView sNSBackgroundView2 = viewBinding12 != null ? viewBinding12.f57737e : null;
                if (sNSBackgroundView2 != null) {
                    sNSBackgroundView2.setVisibility(0);
                }
                C28344i viewBinding13 = getViewBinding();
                SNSImageView sNSImageView3 = viewBinding13 != null ? viewBinding13.f57742j : null;
                if (sNSImageView3 != null) {
                    SNSLiveness3dFaceViewModel$Icon sNSLiveness3dFaceViewModel$Icon = ((C32114l1) abstractC32118m1).f65385a;
                    int[] iArr = AbstractC32117m0.f65390a;
                    int i11 = iArr[sNSLiveness3dFaceViewModel$Icon.ordinal()];
                    if (i11 == 1) {
                        sNSStepState = SNSStepState.APPROVED;
                    } else if (i11 == 2) {
                        sNSStepState = SNSStepState.PENDING;
                    } else if (i11 == 3) {
                        sNSStepState = SNSStepState.REJECTED;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i12 = iArr[sNSLiveness3dFaceViewModel$Icon.ordinal()];
                    if (i12 == 1) {
                        sNSResultIcons = SNSIconHandler.SNSResultIcons.SUCCESS;
                    } else if (i12 == 2) {
                        sNSResultIcons = SNSIconHandler.SNSResultIcons.SUBMITTED;
                    } else if (i12 == 3) {
                        sNSResultIcons = SNSIconHandler.SNSResultIcons.FAILURE;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    Drawable drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), sNSResultIcons.getImageName());
                    SNSStepViewExtensionsKt.setSnsStepState(sNSImageView3, sNSStepState);
                    sNSImageView3.setImageDrawable(drawableOnResolveIcon);
                }
                C32114l1 c32114l1 = (C32114l1) abstractC32118m1;
                InterfaceC32110k1 interfaceC32110k1 = c32114l1.f65386b;
                if (interfaceC32110k1 instanceof C32101i1) {
                    C28344i viewBinding14 = getViewBinding();
                    SNSH2TextView sNSH2TextView6 = viewBinding14 != null ? viewBinding14.f57744l : null;
                    if (sNSH2TextView6 != null) {
                        sNSH2TextView6.setText(((C32101i1) interfaceC32110k1).f65331a);
                    }
                    C28344i viewBinding15 = getViewBinding();
                    SNSSubtitle2TextView sNSSubtitle2TextView = viewBinding15 != null ? viewBinding15.f57743k : null;
                    if (sNSSubtitle2TextView != null) {
                        sNSSubtitle2TextView.setText(((C32101i1) interfaceC32110k1).f65332b);
                    }
                    C28344i viewBinding16 = getViewBinding();
                    SNSSubtitle2TextView sNSSubtitle2TextView2 = viewBinding16 != null ? viewBinding16.f57743k : null;
                    if (sNSSubtitle2TextView2 != null) {
                        sNSSubtitle2TextView2.setGravity(17);
                    }
                } else if (interfaceC32110k1 instanceof C32106j1) {
                    C28344i viewBinding17 = getViewBinding();
                    SNSH2TextView sNSH2TextView7 = viewBinding17 != null ? viewBinding17.f57744l : null;
                    if (sNSH2TextView7 != null) {
                        sNSH2TextView7.setText(((C32106j1) interfaceC32110k1).f65338a);
                    }
                    C28344i viewBinding18 = getViewBinding();
                    SNSSubtitle2TextView sNSSubtitle2TextView3 = viewBinding18 != null ? viewBinding18.f57743k : null;
                    if (sNSSubtitle2TextView3 != null) {
                        CharSequence charSequence = ((C32106j1) interfaceC32110k1).f65339b;
                        sNSSubtitle2TextView3.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
                    }
                    C28344i viewBinding19 = getViewBinding();
                    SNSSubtitle2TextView sNSSubtitle2TextView4 = viewBinding19 != null ? viewBinding19.f57743k : null;
                    if (sNSSubtitle2TextView4 != null) {
                        sNSSubtitle2TextView4.setGravity(GravityCompat.START);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C28344i viewBinding20 = getViewBinding();
                SNSPrimaryButton sNSPrimaryButton = viewBinding20 != null ? viewBinding20.f57746n : null;
                if (sNSPrimaryButton != null) {
                    if (c32114l1.f65387c != null) {
                        sNSPrimaryButton.setVisibility(0);
                        sNSPrimaryButton.setAlpha(1.0f);
                        sNSPrimaryButton.setText(c32114l1.f65387c.f65290a);
                        sNSPrimaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.prooface.q2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SNSLiveness3dFaceFragment.m70996a(this.f65417b, view);
                            }
                        });
                    } else {
                        sNSPrimaryButton.setVisibility(8);
                    }
                }
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C32132q0(this, null), 3, null);
                if (!(this.f65176i instanceof C32114l1)) {
                    C28344i viewBinding21 = getViewBinding();
                    SNSImageView sNSImageView4 = viewBinding21 != null ? viewBinding21.f57742j : null;
                    if (sNSImageView4 != null) {
                        sNSImageView4.setScaleX(0.0f);
                    }
                    C28344i viewBinding22 = getViewBinding();
                    SpringAnimation springAnimation = new SpringAnimation(viewBinding22 != null ? viewBinding22.f57742j : null, DynamicAnimation.SCALE_X, 1.0f);
                    springAnimation.getSpring().setStiffness(200.0f);
                    springAnimation.getSpring().setDampingRatio(0.75f);
                    springAnimation.start();
                    C28344i viewBinding23 = getViewBinding();
                    SNSImageView sNSImageView5 = viewBinding23 != null ? viewBinding23.f57742j : null;
                    if (sNSImageView5 != null) {
                        sNSImageView5.setScaleY(0.0f);
                    }
                    C28344i viewBinding24 = getViewBinding();
                    SpringAnimation springAnimation2 = new SpringAnimation(viewBinding24 != null ? viewBinding24.f57742j : null, DynamicAnimation.SCALE_Y, 1.0f);
                    springAnimation2.getSpring().setStiffness(200.0f);
                    springAnimation2.getSpring().setDampingRatio(0.75f);
                    springAnimation2.start();
                    C28344i viewBinding25 = getViewBinding();
                    SNSPrimaryButton sNSPrimaryButton2 = viewBinding25 != null ? viewBinding25.f57746n : null;
                    if (sNSPrimaryButton2 != null && sNSPrimaryButton2.getVisibility() == 0) {
                        sNSPrimaryButton2.setAlpha(0.0f);
                        sNSPrimaryButton2.animate().alpha(1.0f).start();
                    }
                    C32269f c32269f = (C32269f) this.f65171d.getValue();
                    C32268e c32268e = c32269f.f65734e;
                    if (c32268e != null && ((Boolean) c32269f.f65731b.invoke()).booleanValue()) {
                        c32269f.m71080a(c32268e);
                        c32269f.f65734e = null;
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.f65176i = abstractC32118m1;
    }

    /* JADX INFO: renamed from: f */
    public final PreviewView m71007f() {
        C28344i viewBinding = getViewBinding();
        if (viewBinding != null) {
            return viewBinding.f57735c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70996a(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, View view) {
        C28367f.m69257a(sNSLiveness3dFaceFragment.getAnalyticsDelegate(), Screen.LivenessScreen, sNSLiveness3dFaceFragment.getF66531c(), Control.RetryButton, null, 24);
        ((C32072c2) sNSLiveness3dFaceFragment.f65168a.getValue()).intent(C32045V0.f65193a);
    }
}
