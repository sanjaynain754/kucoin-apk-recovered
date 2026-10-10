package com.sumsub.sns.internal.features.presentation.prooface;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSLivenessFaceView;
import com.sumsub.sns.databinding.C28344i;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.model.prooface.C29822f;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.tencent.bugly.proguard.C33864ph;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32089g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSDefaultLiveness3dFaceFragment f65302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32089g(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment, Continuation continuation) {
        super(2, continuation);
        this.f65302b = sNSDefaultLiveness3dFaceFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32089g c32089g = new C32089g(this.f65302b, continuation);
        c32089g.f65301a = obj;
        return c32089g;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32089g c32089g = new C32089g(this.f65302b, (Continuation) obj2);
        c32089g.f65301a = (AbstractC32018M) obj;
        return c32089g.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float fMax;
        float fMin;
        String str;
        SNSImageView sNSImageView;
        View viewFindViewById;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC32018M abstractC32018M = (AbstractC32018M) this.f65301a;
        AbstractC32267d.m71078a("livenessResult: " + abstractC32018M);
        if (!(abstractC32018M instanceof C32000G)) {
            if (abstractC32018M instanceof C32012K) {
                SNSDefaultLiveness3dFaceFragment.Companion companion = SNSDefaultLiveness3dFaceFragment.f65151p;
                this.f65302b.m70987a((C32012K) abstractC32018M);
            } else {
                SNSImageView sNSImageView2 = null;
                if (abstractC32018M instanceof C32015L) {
                    View view = this.f65302b.getView();
                    if (view != null && (viewFindViewById = view.findViewById(R$id.sns_camera)) != null) {
                        viewFindViewById.setVisibility(0);
                    }
                    SNSH2TextView sNSH2TextViewM70991i = this.f65302b.m70991i();
                    if (sNSH2TextViewM70991i != null) {
                        sNSH2TextViewM70991i.setText(((C32015L) abstractC32018M).f65081b);
                    }
                    SNSLivenessFaceView sNSLivenessFaceViewM70989g = this.f65302b.m70989g();
                    if (sNSLivenessFaceViewM70989g != null) {
                        sNSLivenessFaceViewM70989g.setRecognizingState();
                    }
                    C28344i c28344i = this.f65302b.f65154c;
                    if (c28344i != null) {
                        sNSImageView2 = c28344i.f57736d;
                    }
                    if (sNSImageView2 != null) {
                        sNSImageView2.setVisibility(8);
                    }
                    if (((C32015L) abstractC32018M).f65080a) {
                        C28758x c28758xM69571d = ((C28746l) this.f65302b.f65155d.getValue()).m69571d();
                        ((C32109k0) this.f65302b.f65152a.getValue()).m71039a(c28758xM69571d.f58488a, c28758xM69571d.f58489b, c28758xM69571d.f58490c);
                    }
                } else if (abstractC32018M instanceof C31997F) {
                    SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment = this.f65302b;
                    SNSDefaultLiveness3dFaceFragment.Companion companion2 = SNSDefaultLiveness3dFaceFragment.f65151p;
                    SNSH2TextView sNSH2TextViewM70991i2 = sNSDefaultLiveness3dFaceFragment.m70991i();
                    if (sNSH2TextViewM70991i2 != null) {
                        sNSH2TextViewM70991i2.setText(((C31997F) abstractC32018M).f65046a);
                    }
                } else if (abstractC32018M instanceof C31991D) {
                    TransitionSet transitionSet = new TransitionSet();
                    Fade fade = new Fade(1);
                    transitionSet.addTransition(fade);
                    Fade fade2 = new Fade(2);
                    fade2.setStartDelay(fade.getDuration());
                    transitionSet.addTransition(fade2);
                    TransitionManager.beginDelayedTransition((ViewGroup) this.f65302b.requireView().findViewById(R$id.sns_overlay), transitionSet);
                    SNSH2TextView sNSH2TextViewM70991i3 = this.f65302b.m70991i();
                    if (sNSH2TextViewM70991i3 != null) {
                        sNSH2TextViewM70991i3.setText(((C31991D) abstractC32018M).f65037b);
                    }
                    SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment2 = this.f65302b;
                    sNSDefaultLiveness3dFaceFragment2.f65162k = false;
                    SNSLivenessFaceView sNSLivenessFaceViewM70989g2 = sNSDefaultLiveness3dFaceFragment2.m70989g();
                    if (sNSLivenessFaceViewM70989g2 != null) {
                        sNSLivenessFaceViewM70989g2.setFaceAnalyzingState();
                    }
                    C28344i c28344i2 = this.f65302b.f65154c;
                    if (c28344i2 != null) {
                        sNSImageView = c28344i2.f57736d;
                    } else {
                        sNSImageView = null;
                    }
                    if (sNSImageView == null || sNSImageView.getVisibility() != 0) {
                        C28344i c28344i3 = this.f65302b.f65154c;
                        if (c28344i3 != null) {
                            sNSImageView2 = c28344i3.f57736d;
                        }
                        if (sNSImageView2 != null) {
                            sNSImageView2.setImageBitmap(((C31991D) abstractC32018M).f65036a);
                            sNSImageView2.setVisibility(0);
                            sNSImageView2.setAlpha(0.0f);
                            sNSImageView2.animate().alpha(1.0f).setDuration(sNSImageView2.getResources().getInteger(R.integer.config_shortAnimTime)).start();
                        }
                    }
                } else if (abstractC32018M instanceof C31988C) {
                    C31988C c31988c = (C31988C) abstractC32018M;
                    AbstractC32267d.m71078a("Calibrate, set exposure = " + c31988c.f65031a);
                    ((C28746l) this.f65302b.f65155d.getValue()).m69563a(c31988c.f65031a);
                } else if (abstractC32018M instanceof C31994E) {
                    C31994E c31994e = (C31994E) abstractC32018M;
                    AbstractC32267d.m71078a("Calibrate, set exposure = " + c31994e.f65041a);
                    ((C28746l) this.f65302b.f65155d.getValue()).m69563a(c31994e.f65041a);
                    C32109k0 c32109k0 = (C32109k0) this.f65302b.f65152a.getValue();
                    c32109k0.getClass();
                    AbstractC32267d.m71078a("Stop calibration");
                    C29818c c29818c = c32109k0.f65372q;
                    if (c29818c != null) {
                        List list = c29818c.f59898b;
                        if (list != null) {
                            Iterator it = list.iterator();
                            if (it.hasNext()) {
                                fMax = ((C29822f) it.next()).f59902b;
                                while (it.hasNext()) {
                                    fMax = Math.max(fMax, ((C29822f) it.next()).f59902b);
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            fMax = 0.0f;
                        }
                        List list2 = c29818c.f59898b;
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            if (it2.hasNext()) {
                                fMin = ((C29822f) it2.next()).f59902b;
                                while (it2.hasNext()) {
                                    fMin = Math.min(fMin, ((C29822f) it2.next()).f59902b);
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            fMin = 0.0f;
                        }
                        if (fMax > 0.0f && (fMax - fMin) / fMax > 0.3f) {
                            str = "ok";
                        } else {
                            str = C33864ph.f71456b;
                        }
                        c29818c.f59897a = str;
                    }
                } else if (abstractC32018M != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
