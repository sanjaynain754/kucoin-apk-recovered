package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.widget.SNSHorizontalProgressBarView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31903v extends FunctionReferenceImpl implements Function1 {
    /* JADX INFO: renamed from: a */
    public final void m70927a(AbstractC31897s abstractC31897s) {
        MrtdLayoutHandler$LayoutState mrtdLayoutHandler$LayoutState;
        IntroScene introScene;
        boolean z11;
        C31905w c31905w = (C31905w) this.receiver;
        c31905w.getClass();
        boolean z12 = abstractC31897s instanceof C31891p;
        if (z12) {
            mrtdLayoutHandler$LayoutState = MrtdLayoutHandler$LayoutState.INTRO;
        } else if ((abstractC31897s instanceof C31893q) || (abstractC31897s instanceof C31895r)) {
            mrtdLayoutHandler$LayoutState = MrtdLayoutHandler$LayoutState.READING;
        } else if (abstractC31897s instanceof C31887n) {
            mrtdLayoutHandler$LayoutState = MrtdLayoutHandler$LayoutState.RESULT_SUCCESS;
        } else {
            if (!(abstractC31897s instanceof C31889o)) {
                throw new NoWhenBranchMatchedException();
            }
            mrtdLayoutHandler$LayoutState = MrtdLayoutHandler$LayoutState.RESULT_ERROR;
        }
        boolean z13 = mrtdLayoutHandler$LayoutState != c31905w.f64852p;
        if (z13) {
            c31905w.f64852p = mrtdLayoutHandler$LayoutState;
            C31858c c31858c = c31905w.f64851o;
            int[] iArr = AbstractC31901u.f64837a;
            int i11 = iArr[mrtdLayoutHandler$LayoutState.ordinal()];
            if (i11 == 1) {
                introScene = IntroScene.MRTD_PREPARING;
            } else if (i11 == 2) {
                introScene = IntroScene.MRTD_SCANNING;
            } else if (i11 == 3) {
                introScene = IntroScene.MRTD_SCANNED;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                introScene = IntroScene.MRTD_FAILED;
            }
            C28778k c28778k = c31858c.f64745g;
            KProperty[] kPropertyArr = C31858c.f64742i;
            FrameLayout frameLayout = (FrameLayout) c28778k.getValue(c31858c, kPropertyArr[0]);
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            SNSInstructionsViewHandler instructionsViewHandler = C28468k0.f57983a.getInstructionsViewHandler();
            View viewOnVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(c31858c.f58549a.requireContext(), "IDENTITY", ((C31855b) c31858c.f64743e.invoke()).f64738a, introScene.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), ((C31855b) c31858c.f64743e.invoke()).f64739b) : null;
            if (viewOnVerificationStep != null) {
                FrameLayout frameLayout2 = (FrameLayout) c31858c.f64745g.getValue(c31858c, kPropertyArr[0]);
                if (frameLayout2 != null) {
                    frameLayout2.addView(viewOnVerificationStep, new FrameLayout.LayoutParams(-1, -1));
                }
                z11 = true;
            } else {
                z11 = false;
            }
            c31858c.f64746h = z11;
            FrameLayout frameLayout3 = (FrameLayout) c31858c.f64745g.getValue(c31858c, kPropertyArr[0]);
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(c31858c.f64746h ? 0 : 8);
            }
            C28778k c28778k2 = c31905w.f64844h;
            KProperty[] kPropertyArr2 = C31905w.f64840q;
            View view = (View) c28778k2.getValue(c31905w, kPropertyArr2[0]);
            if (view != null) {
                view.setVisibility(8);
            }
            Group group = (Group) c31905w.f64845i.getValue(c31905w, kPropertyArr2[1]);
            if (group != null) {
                group.setVisibility(8);
            }
            Group group2 = (Group) c31905w.f64846j.getValue(c31905w, kPropertyArr2[2]);
            if (group2 != null) {
                group2.setVisibility(8);
            }
            if (!c31905w.f64851o.f64746h) {
                int i12 = iArr[mrtdLayoutHandler$LayoutState.ordinal()];
                if (i12 == 1) {
                    View view2 = (View) c31905w.f64844h.getValue(c31905w, kPropertyArr2[0]);
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                } else if (i12 == 2) {
                    Group group3 = (Group) c31905w.f64845i.getValue(c31905w, kPropertyArr2[1]);
                    if (group3 != null) {
                        group3.setVisibility(0);
                    }
                } else {
                    if (i12 != 3 && i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Group group4 = (Group) c31905w.f64846j.getValue(c31905w, kPropertyArr2[2]);
                    if (group4 != null) {
                        group4.setVisibility(0);
                    }
                }
            }
            c31905w.m70939n();
        }
        c31905w.m70938a(abstractC31897s);
        if (c31905w.f64851o.f64746h) {
            return;
        }
        C31909y c31909y = c31905w.f64850n;
        if (z13) {
            if (z12) {
                C28778k c28778k3 = c31909y.f64860h;
                KProperty[] kPropertyArr3 = C31909y.f64856r;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) c28778k3.getValue(c31909y, kPropertyArr3[0]);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAnimation(((C31907x) c31909y.f64858f.invoke()).f64854a);
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) c31909y.f64860h.getValue(c31909y, kPropertyArr3[0]);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.playAnimation();
                }
            } else {
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) c31909y.f64860h.getValue(c31909y, C31909y.f64856r[0]);
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.cancelAnimation();
                }
            }
        }
        if (z12) {
            c31909y.m70944a((C31891p) abstractC31897s);
            return;
        }
        if (abstractC31897s instanceof C31893q) {
            C31893q c31893q = (C31893q) abstractC31897s;
            C28778k c28778k4 = c31909y.f64864l;
            KProperty[] kPropertyArr4 = C31909y.f64856r;
            TextView textView = (TextView) c28778k4.getValue(c31909y, kPropertyArr4[4]);
            if (textView != null) {
                textView.setText(c31893q.f64821a);
            }
            TextView textView2 = (TextView) c31909y.f64865m.getValue(c31909y, kPropertyArr4[5]);
            if (textView2 != null) {
                textView2.setText(c31893q.f64822b);
            }
            SNSHorizontalProgressBarView sNSHorizontalProgressBarView = (SNSHorizontalProgressBarView) c31909y.f64866n.getValue(c31909y, kPropertyArr4[6]);
            if (sNSHorizontalProgressBarView != null) {
                sNSHorizontalProgressBarView.setIndeterminate(true);
                return;
            }
            return;
        }
        if (abstractC31897s instanceof C31895r) {
            C31895r c31895r = (C31895r) abstractC31897s;
            if (z13) {
                C28778k c28778k5 = c31909y.f64866n;
                KProperty[] kPropertyArr5 = C31909y.f64856r;
                SNSHorizontalProgressBarView sNSHorizontalProgressBarView2 = (SNSHorizontalProgressBarView) c28778k5.getValue(c31909y, kPropertyArr5[6]);
                if (sNSHorizontalProgressBarView2 != null) {
                    sNSHorizontalProgressBarView2.setIndeterminate(false);
                }
                SNSHorizontalProgressBarView sNSHorizontalProgressBarView3 = (SNSHorizontalProgressBarView) c31909y.f64866n.getValue(c31909y, kPropertyArr5[6]);
                if (sNSHorizontalProgressBarView3 != null) {
                    sNSHorizontalProgressBarView3.setProgress(0);
                }
            }
            C28778k c28778k6 = c31909y.f64864l;
            KProperty[] kPropertyArr6 = C31909y.f64856r;
            TextView textView3 = (TextView) c28778k6.getValue(c31909y, kPropertyArr6[4]);
            if (textView3 != null) {
                textView3.setText(c31895r.f64825a);
            }
            TextView textView4 = (TextView) c31909y.f64865m.getValue(c31909y, kPropertyArr6[5]);
            if (textView4 != null) {
                textView4.setText(c31895r.f64826b);
            }
            SNSHorizontalProgressBarView sNSHorizontalProgressBarView4 = (SNSHorizontalProgressBarView) c31909y.f64866n.getValue(c31909y, kPropertyArr6[6]);
            if (sNSHorizontalProgressBarView4 != null) {
                sNSHorizontalProgressBarView4.setProgressCompat(c31895r.f64828d, true);
                return;
            }
            return;
        }
        if (!(abstractC31897s instanceof C31887n)) {
            if (!(abstractC31897s instanceof C31889o)) {
                c31909y.getClass();
                throw new NoWhenBranchMatchedException();
            }
            C31889o c31889o = (C31889o) abstractC31897s;
            if (z13) {
                ImageView imageViewM70945n = c31909y.m70945n();
                if (imageViewM70945n != null) {
                    SNSStepViewExtensionsKt.setSnsStepState(imageViewM70945n, SNSStepState.REJECTED);
                }
                ImageView imageViewM70945n2 = c31909y.m70945n();
                if (imageViewM70945n2 != null) {
                    imageViewM70945n2.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(c31909y.f58549a.requireContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName()));
                }
            }
            C28778k c28778k7 = c31909y.f64868p;
            KProperty[] kPropertyArr7 = C31909y.f64856r;
            TextView textView5 = (TextView) c28778k7.getValue(c31909y, kPropertyArr7[8]);
            if (textView5 != null) {
                textView5.setText(c31889o.f64809a);
            }
            TextView textView6 = (TextView) c31909y.f64869q.getValue(c31909y, kPropertyArr7[9]);
            if (textView6 != null) {
                AbstractC28458h.m69341a(textView6, (CharSequence) null);
                return;
            }
            return;
        }
        C31887n c31887n = (C31887n) abstractC31897s;
        if (z13) {
            ImageView imageViewM70945n3 = c31909y.m70945n();
            if (imageViewM70945n3 != null) {
                SNSStepViewExtensionsKt.setSnsStepState(imageViewM70945n3, SNSStepState.APPROVED);
            }
            ImageView imageViewM70945n4 = c31909y.m70945n();
            if (imageViewM70945n4 != null) {
                imageViewM70945n4.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(c31909y.f58549a.requireContext(), SNSIconHandler.SNSResultIcons.SUCCESS.getImageName()));
            }
            ImageView imageViewM70945n5 = c31909y.m70945n();
            if (imageViewM70945n5 != null) {
                imageViewM70945n5.setVisibility(4);
            }
            ImageView imageViewM70945n6 = c31909y.m70945n();
            if (imageViewM70945n6 != null) {
                AbstractC28458h.m69354d(imageViewM70945n6);
            }
        }
        C28778k c28778k8 = c31909y.f64868p;
        KProperty[] kPropertyArr8 = C31909y.f64856r;
        TextView textView7 = (TextView) c28778k8.getValue(c31909y, kPropertyArr8[8]);
        if (textView7 != null) {
            textView7.setText(c31887n.f64807a);
        }
        TextView textView8 = (TextView) c31909y.f64869q.getValue(c31909y, kPropertyArr8[9]);
        if (textView8 != null) {
            AbstractC28458h.m69341a(textView8, (CharSequence) null);
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m70927a((AbstractC31897s) obj);
        return Unit.INSTANCE;
    }

    public C31903v(C31905w c31905w) {
        super(1, c31905w, C31905w.class, "onState", "onState(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/MrtdLayoutController$State;)V", 0);
    }
}
