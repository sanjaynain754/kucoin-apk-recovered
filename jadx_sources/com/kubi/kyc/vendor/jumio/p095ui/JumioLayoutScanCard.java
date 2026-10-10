package com.kubi.kyc.vendor.jumio.p095ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.views.JumioScanView;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.vendor.jumio.JumioException;
import com.kubi.kyc.vendor.jumio.entity.KycStepEntity;
import com.kubi.resources.widget.StepView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36899s;
import p205dn.C36900t;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: JumioLayoutScanCard.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u001d\u001a\u00020\u0017J*\u0010\u001e\u001a\u00020\u001f*\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170$H\u0002J\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0017J\b\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002J\u001e\u0010)\u001a\u00020\u00172\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0007J\b\u00100\u001a\u00020\u0017H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u00061"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioLayoutScanCard;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "useManual", "", "viewBinding", "Lcom/kubi/kyc/databinding/LayoutJumioScanCardBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/LayoutJumioScanCardBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "injectFragmentManager", "", "scanView", "Lcom/jumio/sdk/views/JumioScanView;", "buttonBack", "Landroid/widget/ImageView;", TIMPushProvider.f75062n, "showFlipIDTips", "rotationIDAnima", "Landroid/animation/ObjectAnimator;", "start", "", "end", "endCallback", "Lkotlin/Function0;", TIMPushProvider.f75063o, "updateViewWhenFallback", "showTakeBtn", "adjustViewDisplay", "setKycSteps", "steps", "Ljava/util/ArrayList;", "Lcom/kubi/kyc/vendor/jumio/entity/KycStepEntity;", "Lkotlin/collections/ArrayList;", "selectStep", "nextStep", "initView", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioLayoutScanCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioLayoutScanCard.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutScanCard\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n52#2:207\n80#2,7:208\n1869#3,2:215\n1#4:217\n*S KotlinDebug\n*F\n+ 1 JumioLayoutScanCard.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutScanCard\n*L\n47#1:207\n47#1:208,7\n168#1:215,2\n*E\n"})
public final class JumioLayoutScanCard extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f31616f = {Reflection.property1(new PropertyReference1Impl(JumioLayoutScanCard.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/LayoutJumioScanCardBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @Nullable
    public FragmentManager f31617b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public JumioScanPart f31618c;

    /* JADX INFO: renamed from: d */
    public boolean f31619d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC24293a f31620e;

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioLayoutScanCard$b */
    /* JADX INFO: compiled from: JumioLayoutScanCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/vendor/jumio/ui/JumioLayoutScanCard$rotationIDAnima$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17285b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f31621a;

        public C17285b(Function0<Unit> function0) {
            this.f31621a = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            final Function0<Unit> function0 = this.f31621a;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.C17285b.m37384b(function0);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m37384b(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutScanCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m37367q(FragmentManager fragmentManager, JumioLayoutScanCard jumioLayoutScanCard) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            JumioScanPart jumioScanPart = jumioLayoutScanCard.f31618c;
            if (jumioScanPart != null) {
                jumioScanPart.fallback();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new JumioException(thM103847exceptionOrNullimpl, "JumioLayoutScanCard", false, null, 12, null), null, 2, null);
            ToastCompat.m66437C(R$string.bd_error_retery);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final void m37373l() {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        LinearLayoutCompat linearLayoutCompat;
        ImageView imageView5;
        this.f31619d = false;
        C36899s viewBinding = getViewBinding();
        if (viewBinding != null && (imageView5 = viewBinding.f81543f) != null) {
            ViewExtKt.m66577h(imageView5);
        }
        C36899s viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (linearLayoutCompat = viewBinding2.f81544g) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        JumioScanPart jumioScanPart = this.f31618c;
        JumioScanMode scanMode = jumioScanPart != null ? jumioScanPart.getScanMode() : null;
        int i11 = scanMode == null ? -1 : C17284a.$EnumSwitchMapping$0[scanMode.ordinal()];
        if (i11 == 1) {
            this.f31619d = true;
            C36899s viewBinding3 = getViewBinding();
            if (viewBinding3 != null && (imageView2 = viewBinding3.f81543f) != null) {
                ViewExtKt.m66594y(imageView2);
            }
            C36899s viewBinding4 = getViewBinding();
            if (viewBinding4 == null || (imageView = viewBinding4.f81541d) == null) {
                return;
            }
            ViewExtKt.m66577h(imageView);
            return;
        }
        if (i11 != 2) {
            C36899s viewBinding5 = getViewBinding();
            if (viewBinding5 == null || (imageView4 = viewBinding5.f81541d) == null) {
                return;
            }
            ViewExtKt.m66577h(imageView4);
            return;
        }
        C36899s viewBinding6 = getViewBinding();
        if (viewBinding6 == null || (imageView3 = viewBinding6.f81541d) == null) {
            return;
        }
        ViewExtKt.m66594y(imageView3);
    }

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioLayoutScanCard$a */
    /* JADX INFO: compiled from: JumioLayoutScanCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C17284a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JumioScanMode.values().length];
            try {
                iArr[JumioScanMode.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JumioScanMode.BARCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutScanCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m37350B(ImageView imageView) {
        imageView.setImageResource(R$drawable.kckyckit_flip_back);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final void m37354H(JumioLayoutScanCard jumioLayoutScanCard) throws SDKNotConfiguredException {
        JumioScanPart jumioScanPart = jumioLayoutScanCard.f31618c;
        if (jumioScanPart != null) {
            jumioScanPart.fallback();
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m37366p(final JumioLayoutScanCard jumioLayoutScanCard) {
        final FragmentManager fragmentManager = jumioLayoutScanCard.f31617b;
        if (fragmentManager != null) {
            JumioManualChooseDialog.f31622f0.showDialog(fragmentManager, jumioLayoutScanCard.f31619d, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.j0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.m37367q(fragmentManager, jumioLayoutScanCard);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m37368r(C36899s c36899s) {
        if (c36899s.f81547j.isShutterEnabled()) {
            c36899s.f81547j.takePicture();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m37369s(C36899s c36899s) {
        if (c36899s.f81547j.getHasMultipleCameras()) {
            c36899s.f81547j.switchCamera();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m37370y(JumioScanPart jumioScanPart, JumioLayoutScanCard jumioLayoutScanCard) {
        Unit unit;
        JumioScanView jumioScanView;
        JumioScanView jumioScanView2;
        JumioScanView jumioScanView3;
        if (jumioScanPart == null) {
            return Unit.INSTANCE;
        }
        jumioLayoutScanCard.f31618c = jumioScanPart;
        jumioLayoutScanCard.m37373l();
        jumioLayoutScanCard.setVisibility(0);
        C36899s viewBinding = jumioLayoutScanCard.getViewBinding();
        if (viewBinding != null && (jumioScanView3 = viewBinding.f81547j) != null) {
            jumioScanView3.invalidate();
        }
        C36899s viewBinding2 = jumioLayoutScanCard.getViewBinding();
        if (viewBinding2 != null && (jumioScanView2 = viewBinding2.f81547j) != null) {
            jumioScanView2.requestLayout();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C36899s viewBinding3 = jumioLayoutScanCard.getViewBinding();
            if (viewBinding3 == null || (jumioScanView = viewBinding3.f81547j) == null) {
                unit = null;
            } else {
                jumioScanView.attach(jumioScanPart);
                unit = Unit.INSTANCE;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        C36899s viewBinding4 = jumioLayoutScanCard.getViewBinding();
        if (viewBinding4 != null && viewBinding4.f81547j.isShutterEnabled()) {
            jumioLayoutScanCard.m37371E();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final void m37371E() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutScanCard.m37353F(this.f31678b);
            }
        });
    }

    @Nullable
    public final C36899s getViewBinding() {
        return (C36899s) this.f31620e.getValue(this, f31616f[0]);
    }

    public final void setKycSteps(@NotNull ArrayList<KycStepEntity> steps) {
        StepView stepView;
        StepView stepView2;
        StepView stepView3;
        StepView stepView4;
        Intrinsics.checkNotNullParameter(steps, "steps");
        if (steps.isEmpty()) {
            C36899s viewBinding = getViewBinding();
            if (viewBinding == null || (stepView4 = viewBinding.f81548k) == null) {
                return;
            }
            ViewExtKt.m66577h(stepView4);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = steps.iterator();
        while (it.hasNext()) {
            arrayList.add(C27041f.m66668h(((KycStepEntity) it.next()).getTitle()));
        }
        C36899s viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (stepView3 = viewBinding2.f81548k) != null) {
            stepView3.setDrawText(false);
        }
        C36899s viewBinding3 = getViewBinding();
        if (viewBinding3 != null && (stepView2 = viewBinding3.f81548k) != null) {
            stepView2.setSteps(arrayList);
        }
        C36899s viewBinding4 = getViewBinding();
        if (viewBinding4 == null || (stepView = viewBinding4.f81548k) == null) {
            return;
        }
        ViewExtKt.m66594y(stepView);
    }

    /* JADX INFO: renamed from: t */
    public final void m37377t(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f31617b = fragmentManager;
    }

    /* JADX INFO: renamed from: u */
    public final ObjectAnimator m37378u(ImageView imageView, float f11, float f12, Function0<Unit> function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "rotationY", f11, f12);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setRepeatCount(0);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C17285b(function0));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: x */
    public final void m37381x(@Nullable final JumioScanPart jumioScanPart) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutScanCard.m37370y(jumioScanPart, this);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m37382z() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutScanCard.m37349A(this.f31669b);
            }
        });
    }

    public /* synthetic */ JumioLayoutScanCard(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m37349A(final JumioLayoutScanCard jumioLayoutScanCard) {
        final ImageView imageView;
        LinearLayoutCompat linearLayoutCompat;
        JumioScanView jumioScanView;
        C36899s viewBinding = jumioLayoutScanCard.getViewBinding();
        if (viewBinding != null && (jumioScanView = viewBinding.f81547j) != null) {
            jumioScanView.pause();
        }
        C36899s viewBinding2 = jumioLayoutScanCard.getViewBinding();
        if (viewBinding2 != null && (linearLayoutCompat = viewBinding2.f81544g) != null) {
            ViewExtKt.m66594y(linearLayoutCompat);
        }
        C36899s viewBinding3 = jumioLayoutScanCard.getViewBinding();
        if (viewBinding3 != null && (imageView = viewBinding3.f81539b) != null) {
            imageView.setImageResource(R$drawable.kckyckit_flip_front);
            float rotationY = imageView.getRotationY();
            float f11 = rotationY - 90.0f;
            float f12 = rotationY - 180.0f;
            ObjectAnimator objectAnimatorM37378u = jumioLayoutScanCard.m37378u(imageView, rotationY, f11, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.m37350B(imageView);
                }
            });
            ObjectAnimator objectAnimatorM37378u2 = jumioLayoutScanCard.m37378u(imageView, f11, f12, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.m37351C(this.f31676b);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorM37378u).after(500L).before(objectAnimatorM37378u2);
            animatorSet.start();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m37351C(final JumioLayoutScanCard jumioLayoutScanCard) {
        LinearLayoutCompat linearLayoutCompat;
        C36899s viewBinding = jumioLayoutScanCard.getViewBinding();
        if (viewBinding != null && (linearLayoutCompat = viewBinding.f81544g) != null) {
            linearLayoutCompat.postDelayed(new Runnable() { // from class: com.kubi.kyc.vendor.jumio.ui.g0
                @Override // java.lang.Runnable
                public final void run() {
                    JumioLayoutScanCard.m37352D(this.f31657b);
                }
            }, 1500L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final void m37352D(JumioLayoutScanCard jumioLayoutScanCard) {
        JumioScanView jumioScanView;
        jumioLayoutScanCard.m37373l();
        C36899s viewBinding = jumioLayoutScanCard.getViewBinding();
        if (viewBinding != null && (jumioScanView = viewBinding.f81547j) != null) {
            jumioScanView.resume();
        }
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m37353F(JumioLayoutScanCard jumioLayoutScanCard) {
        ImageView imageView;
        C36899s viewBinding = jumioLayoutScanCard.getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f81543f) != null) {
            imageView.setVisibility(0);
        }
        jumioLayoutScanCard.f31619d = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public final void m37372G() {
        JumioScanPart jumioScanPart;
        if (getViewBinding() != null) {
            C36899s viewBinding = getViewBinding();
            Intrinsics.checkNotNull(viewBinding);
            ImageView ivScanBarcode = viewBinding.f81541d;
            Intrinsics.checkNotNullExpressionValue(ivScanBarcode, "ivScanBarcode");
            if (ViewExtKt.m66581l(ivScanBarcode) && (jumioScanPart = this.f31618c) != null && jumioScanPart.getHasFallback()) {
                C36899s viewBinding2 = getViewBinding();
                Intrinsics.checkNotNull(viewBinding2);
                ImageView ivScanBarcode2 = viewBinding2.f81541d;
                Intrinsics.checkNotNullExpressionValue(ivScanBarcode2, "ivScanBarcode");
                ViewExtKt.m66577h(ivScanBarcode2);
                post(new Runnable() { // from class: com.kubi.kyc.vendor.jumio.ui.m0
                    @Override // java.lang.Runnable
                    public final void run() throws SDKNotConfiguredException {
                        JumioLayoutScanCard.m37354H(this.f31671b);
                    }
                });
                return;
            }
        }
        m37371E();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final ImageView m37374m() {
        C36900t c36900t;
        C36899s viewBinding = getViewBinding();
        if (viewBinding != null && (c36900t = viewBinding.f81545h) != null) {
            return c36900t.f81552b;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m37375n() {
        ViewExtKt.m66577h(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m37376o() {
        ImageView imageView;
        C36899s viewBinding = getViewBinding();
        if (viewBinding != null && (imageView = viewBinding.f81540c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.m37366p(this.f31655b);
                }
            }, 1, null);
        }
        final C36899s viewBinding2 = getViewBinding();
        if (viewBinding2 != null) {
            ImageView ivTake = viewBinding2.f81543f;
            Intrinsics.checkNotNullExpressionValue(ivTake, "ivTake");
            C27046k.m66711z(ivTake, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.m37368r(viewBinding2);
                }
            }, 1, null);
            ImageView ivSwitch = viewBinding2.f81542e;
            Intrinsics.checkNotNullExpressionValue(ivSwitch, "ivSwitch");
            C27046k.m66711z(ivSwitch, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JumioLayoutScanCard.m37369s(viewBinding2);
                }
            }, 1, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final JumioScanView m37379v() {
        C36899s viewBinding = getViewBinding();
        if (viewBinding != null) {
            return viewBinding.f81547j;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m37380w(int i11) {
        StepView stepView;
        C36899s viewBinding = getViewBinding();
        if (viewBinding != null && (stepView = viewBinding.f81548k) != null) {
            stepView.m54784d(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutScanCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31620e = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36899s>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioLayoutScanCard$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36899s invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36899s.m82667a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.layout_jumio_scan_card, (ViewGroup) this, true);
        m37376o();
    }
}
