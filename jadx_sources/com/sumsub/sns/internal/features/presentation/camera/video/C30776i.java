package com.sumsub.sns.internal.features.presentation.camera.video;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.timepicker.TimeModel;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28636K;
import com.sumsub.sns.internal.core.presentation.android.C28626A;
import com.sumsub.sns.internal.core.presentation.android.C28632G;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.android.C28707v;
import com.sumsub.sns.internal.core.presentation.camera.C28732b;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28744j;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.presentation.preview.selfie.AbstractC31959s;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/video/i;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/camera/video/r;", "Lcom/sumsub/sns/internal/features/presentation/camera/video/G;", "Lcom/sumsub/sns/internal/core/presentation/camera/s;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/camera/video/a", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVideoSelfieFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoSelfieFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n106#2,15:266\n256#3,2:281\n256#3,2:283\n256#3,2:285\n256#3,2:287\n256#3,2:289\n256#3,2:291\n256#3,2:293\n256#3,2:295\n256#3,2:297\n1#4:299\n*S KotlinDebug\n*F\n+ 1 SNSVideoSelfieFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieFragment\n*L\n43#1:266,15\n122#1:281,2\n123#1:283,2\n124#1:285,2\n137#1:287,2\n138#1:289,2\n139#1:291,2\n162#1:293,2\n163#1:295,2\n164#1:297,2\n*E\n"})
public final class C30776i extends AbstractC28064I<C30785r, C30763G> implements InterfaceC28753s {

    /* JADX INFO: renamed from: a */
    public final Lazy f62174a;

    /* JADX INFO: renamed from: b */
    public final Screen f62175b;

    /* JADX INFO: renamed from: c */
    public final C28404L f62176c;

    /* JADX INFO: renamed from: d */
    public final C28404L f62177d;

    /* JADX INFO: renamed from: e */
    public final C28404L f62178e;

    /* JADX INFO: renamed from: f */
    public final C28404L f62179f;

    /* JADX INFO: renamed from: g */
    public final C28404L f62180g;

    /* JADX INFO: renamed from: h */
    public final C28404L f62181h;

    /* JADX INFO: renamed from: i */
    public final C28404L f62182i;

    /* JADX INFO: renamed from: j */
    public final C28404L f62183j;

    /* JADX INFO: renamed from: k */
    public SNSVideoSelfieViewModel$State f62184k;

    /* JADX INFO: renamed from: l */
    public final C28746l f62185l;

    /* JADX INFO: renamed from: m */
    public final C28707v f62186m;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty[] f62173o = {AbstractC28118g.m69077a(C30776i.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0), AbstractC28118g.m69077a(C30776i.class, "circleProgressView", "getCircleProgressView()Landroid/widget/ProgressBar;", 0), AbstractC28118g.m69077a(C30776i.class, "tvCounter", "getTvCounter()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30776i.class, "stopView", "getStopView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30776i.class, "doneView", "getDoneView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30776i.class, "tvText", "getTvText()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30776i.class, "tvDescription1", "getTvDescription1()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30776i.class, "tvDescription2", "getTvDescription2()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: n */
    public static final C30765a f62172n = new C30765a();

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69577a(C28740f c28740f) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69579b() {
    }

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider.Factory m70453c(C30776i c30776i) {
        return new C30764H(c30776i, c30776i.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30776i.getArguments());
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69578a(File file) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69580b(File file) {
        C30763G c30763g = (C30763G) this.f62174a.getValue();
        c30763g.getClass();
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30763g), null, null, new C30759C(file, c30763g, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final ProgressBar m70455f() {
        return (ProgressBar) this.f62177d.getValue(this, f62173o[1]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return this.f62186m.m69525u();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_video_selfie);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return this.f62186m.m69525u();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Screen getScreen() {
        return this.f62175b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30763G) this.f62174a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        ProgressBar progressBarM70455f;
        if (interfaceC28145r instanceof C30778k) {
            this.f62185l.m69567a(((C30778k) interfaceC28145r).f62188a);
            return;
        }
        if (interfaceC28145r instanceof C30779l) {
            this.f62185l.m69573f();
            return;
        }
        if (interfaceC28145r instanceof C30777j) {
            Bundle bundle = new Bundle();
            C30777j c30777j = (C30777j) interfaceC28145r;
            bundle.putString("EXTRA_FILE", c30777j.f62187a.f62192a.getAbsolutePath());
            bundle.putString("EXTRA_PHRASE", c30777j.f62187a.f62193b);
            Unit unit = Unit.INSTANCE;
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(this, 0, bundle, 1, null);
            return;
        }
        if (interfaceC28145r instanceof C30781n) {
            C30781n c30781n = (C30781n) interfaceC28145r;
            int i11 = AbstractC30767b.f62164a[c30781n.f62191a.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 && (progressBarM70455f = m70455f()) != null) {
                    progressBarM70455f.setProgress((int) (((7600 - c30781n.f62190b) * ((long) 100)) / 7600));
                    return;
                }
                return;
            }
            long j11 = ((3000 - c30781n.f62190b) * ((long) 100)) / 3000;
            ProgressBar progressBarM70455f2 = m70455f();
            if (progressBarM70455f2 != null) {
                progressBarM70455f2.setProgress((int) j11);
            }
            TextView textView = (TextView) this.f62178e.getValue(this, f62173o[2]);
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView.setText(String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf((c30781n.f62190b / TimeUnit.SECONDS.toMillis(1L)) + 1)}, 1)));
                return;
            }
            return;
        }
        if (!(interfaceC28145r instanceof C30780m)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        if (AbstractC30767b.f62164a[((C30780m) interfaceC28145r).f62191a.ordinal()] == 2) {
            C30763G c30763g = (C30763G) this.f62174a.getValue();
            c30763g.getClass();
            AbstractC31959s.m70965a("Recording is finished");
            CountDownTimer countDownTimer = c30763g.f62157e;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c30763g.f62157e = null;
            c30763g.fireEvent(C30779l.f62189a);
            AbstractC28073M0.updateState$default(c30763g, false, new C30793z(null), 1, null);
            c30763g.f62157e = new CountDownTimerC30757A(c30763g).start();
            ProgressBar progressBarM70455f3 = m70455f();
            if (progressBarM70455f3 != null) {
                progressBarM70455f3.setProgress(0);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70454a((C30785r) interfaceC28147s);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStop() {
        C30763G c30763g = (C30763G) this.f62174a.getValue();
        CountDownTimer countDownTimer = c30763g.f62157e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c30763g.f62157e = null;
        this.f62185l.m69573f();
        super.onStop();
    }

    public C30776i() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.video.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30776i.m70453c(this.f62165b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30773e(new C30771d(this)));
        this.f62174a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30763G.class), new C30774f(lazy), new C30775g(lazy), function0);
        this.f62175b = AbstractC28047a.m69058a(this);
        this.f62176c = new C28404L(R$id.sns_camera);
        this.f62177d = new C28404L(R$id.sns_video_circle_progress);
        this.f62178e = new C28404L(R$id.sns_counter);
        this.f62179f = new C28404L(R$id.sns_stop);
        this.f62180g = new C28404L(R$id.sns_done);
        this.f62181h = new C28404L(R$id.sns_text);
        this.f62182i = new C28404L(R$id.sns_description_1);
        this.f62183j = new C28404L(R$id.sns_description_2);
        this.f62185l = new C28746l(CameraX$Mode.VIDEO, null, 1, new C28732b(), CameraSelector.DEFAULT_FRONT_CAMERA, null, this);
        this.f62186m = new C28707v(this, SetsKt.setOf((Object[]) new AbstractC28636K[]{C28626A.f58259e, C28632G.f58262e}), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.video.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30776i.m70450a(this.f62166b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.video.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30776i.m70452b(this.f62168b);
            }
        }, new C30769c(this), 8);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69576a(ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("EXTRA_ID_DOC_SET_TYPE")) != null) {
            return string;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62185l.m69572e();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f62186m.m69523s();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        int iIntValue;
        Drawable background;
        C28955c c28955c;
        super.onViewCreated(view, bundle);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        if (customization != null) {
            theme = customization.getTheme();
        } else {
            theme = null;
        }
        if (theme instanceof C28966p) {
            c28966p = (C28966p) theme;
        } else {
            c28966p = null;
        }
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_CRITICAL;
            boolean zM69346a = AbstractC28458h.m69346a(view.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(new TypedValue().data, new int[]{R$attr.sns_colorOnRejected});
                int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                iIntValue = color;
            }
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = requireContext().obtainStyledAttributes(new TypedValue().data, new int[]{R$attr.sns_colorOnRejected});
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            iIntValue = color2;
        }
        View view2 = (View) this.f62179f.getValue(this, f62173o[3]);
        if (view2 != null && (background = view2.getBackground()) != null) {
            background.setTint(iIntValue);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        C28746l c28746l = this.f62185l;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        PreviewView previewView = (PreviewView) this.f62176c.getValue(this, f62173o[0]);
        Size size = C28746l.f58454x;
        c28746l.m69566a(viewLifecycleOwner, previewView, (Function0) null);
        this.f62185l.m69563a(this.f62185l.m69571d().f58490c);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69575a(Bitmap bitmap, C28758x c28758x, C28744j c28744j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final C28651g m70450a(C30776i c30776i) {
        return ((C30763G) c30776i.f62174a.getValue()).f62160h;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70452b(C30776i c30776i) {
        C30763G c30763g = (C30763G) c30776i.f62174a.getValue();
        c30763g.getClass();
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30763g), null, null, new C30762F(c30763g, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70454a(C30785r c30785r) {
        Drawable indeterminateDrawable;
        Drawable progressDrawable;
        C28955c c28955c;
        Drawable indeterminateDrawable2;
        Drawable progressDrawable2;
        C28955c c28955c2;
        C28404L c28404l = this.f62181h;
        KProperty[] kPropertyArr = f62173o;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[5]);
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c30785r.f62194a.f62196a);
        }
        TextView textView2 = (TextView) this.f62182i.getValue(this, kPropertyArr[6]);
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c30785r.f62194a.f62197b);
        }
        TextView textView3 = (TextView) this.f62183j.getValue(this, kPropertyArr[7]);
        if (textView3 != null) {
            AbstractC28458h.m69341a(textView3, c30785r.f62194a.f62198c);
        }
        SNSVideoSelfieViewModel$State sNSVideoSelfieViewModel$State = this.f62184k;
        SNSVideoSelfieViewModel$State sNSVideoSelfieViewModel$State2 = c30785r.f62195b;
        if (sNSVideoSelfieViewModel$State == sNSVideoSelfieViewModel$State2) {
            return;
        }
        this.f62184k = sNSVideoSelfieViewModel$State2;
        int i11 = sNSVideoSelfieViewModel$State2 == null ? -1 : AbstractC30767b.f62164a[sNSVideoSelfieViewModel$State2.ordinal()];
        Integer num = null;
        if (i11 == 1) {
            TextView textView4 = (TextView) this.f62178e.getValue(this, kPropertyArr[2]);
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            View view = (View) this.f62179f.getValue(this, kPropertyArr[3]);
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = (View) this.f62180g.getValue(this, kPropertyArr[4]);
            if (view2 != null) {
                view2.setVisibility(8);
            }
            int i12 = R$drawable.sns_circular_progress_bar_countdown;
            ProgressBar progressBarM70455f = m70455f();
            if (progressBarM70455f != null) {
                Resources resources = getResources();
                FragmentActivity activity = getActivity();
                progressBarM70455f.setProgressDrawable(ResourcesCompat.getDrawable(resources, i12, activity != null ? activity.getTheme() : null));
            }
            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
            SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
            C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
            if (c28966p != null) {
                SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
                View view3 = getView();
                boolean zM69346a = view3 != null ? AbstractC28458h.m69346a(view3.getResources().getConfiguration()) : false;
                Map map = c28966p.f58877c;
                if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                    if (zM69346a) {
                        num = c28955c.f58858a;
                    } else {
                        num = c28955c.f58859b;
                    }
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    ProgressBar progressBarM70455f2 = m70455f();
                    if (progressBarM70455f2 != null && (progressDrawable = progressBarM70455f2.getProgressDrawable()) != null) {
                        progressDrawable.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(new TypedValue().data, new int[]{R$attr.sns_colorOnProcessing});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            ProgressBar progressBarM70455f3 = m70455f();
            if (progressBarM70455f3 == null || (indeterminateDrawable = progressBarM70455f3.getIndeterminateDrawable()) == null) {
                return;
            }
            indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            ProgressBar progressBarM70455f4 = m70455f();
            if (progressBarM70455f4 != null) {
                progressBarM70455f4.setProgress(0);
            }
            TextView textView5 = (TextView) this.f62178e.getValue(this, kPropertyArr[2]);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            View view4 = (View) this.f62179f.getValue(this, kPropertyArr[3]);
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View view5 = (View) this.f62180g.getValue(this, kPropertyArr[4]);
            if (view5 != null) {
                view5.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView6 = (TextView) this.f62178e.getValue(this, kPropertyArr[2]);
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        View view6 = (View) this.f62179f.getValue(this, kPropertyArr[3]);
        if (view6 != null) {
            view6.setVisibility(0);
        }
        View view7 = (View) this.f62180g.getValue(this, kPropertyArr[4]);
        if (view7 != null) {
            view7.setVisibility(8);
        }
        int i13 = R$drawable.sns_circular_progress_bar_recording;
        ProgressBar progressBarM70455f5 = m70455f();
        if (progressBarM70455f5 != null) {
            Resources resources2 = getResources();
            FragmentActivity activity2 = getActivity();
            progressBarM70455f5.setProgressDrawable(ResourcesCompat.getDrawable(resources2, i13, activity2 != null ? activity2.getTheme() : null));
        }
        SNSJsonCustomization customization2 = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme2 = customization2 != null ? customization2.getTheme() : null;
        C28966p c28966p2 = theme2 instanceof C28966p ? (C28966p) theme2 : null;
        if (c28966p2 != null) {
            SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_CRITICAL;
            View view8 = getView();
            boolean zM69346a2 = view8 != null ? AbstractC28458h.m69346a(view8.getResources().getConfiguration()) : false;
            Map map2 = c28966p2.f58877c;
            if (map2 != null && (c28955c2 = (C28955c) map2.get(sNSColorElement2.getValue())) != null) {
                if (zM69346a2) {
                    num = c28955c2.f58858a;
                } else {
                    num = c28955c2.f58859b;
                }
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                ProgressBar progressBarM70455f6 = m70455f();
                if (progressBarM70455f6 != null && (progressDrawable2 = progressBarM70455f6.getProgressDrawable()) != null) {
                    progressDrawable2.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_IN));
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = requireContext().obtainStyledAttributes(new TypedValue().data, new int[]{R$attr.sns_colorOnRejected});
        int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        ProgressBar progressBarM70455f7 = m70455f();
        if (progressBarM70455f7 != null && (indeterminateDrawable2 = progressBarM70455f7.getIndeterminateDrawable()) != null) {
            indeterminateDrawable2.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
        }
        View view9 = (View) this.f62179f.getValue(this, kPropertyArr[3]);
        if (view9 != null) {
            view9.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.video.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view10) {
                    C30776i.m70451a(this.f62163b, view10);
                }
            });
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    public final void onError(Exception exc) {
    }

    /* JADX INFO: renamed from: a */
    public static final void m70451a(C30776i c30776i, View view) {
        C28367f.m69257a(c30776i.getAnalyticsDelegate(), c30776i.f62175b, c30776i.getIdDocSetType(), Control.DoneButton, null, 24);
        C30763G c30763g = (C30763G) c30776i.f62174a.getValue();
        c30763g.getClass();
        AbstractC31959s.m70965a("Recording is finished");
        CountDownTimer countDownTimer = c30763g.f62157e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c30763g.f62157e = null;
        c30763g.fireEvent(C30779l.f62189a);
        AbstractC28073M0.updateState$default(c30763g, false, new C30793z(null), 1, null);
        c30763g.f62157e = new CountDownTimerC30757A(c30763g).start();
        ProgressBar progressBarM70455f = c30776i.m70455f();
        if (progressBarM70455f != null) {
            progressBarM70455f.setProgress(0);
        }
    }
}
