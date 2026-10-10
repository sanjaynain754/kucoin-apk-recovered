package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.internal.core.common.AbstractC28427X;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.common.C28786s;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31909y extends AbstractC28787t {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ KProperty[] f64856r = {AbstractC28118g.m69077a(C31909y.class, "introAnimation", "getIntroAnimation()Lcom/airbnb/lottie/LottieAnimationView;", 0), AbstractC28118g.m69077a(C31909y.class, "introTitle", "getIntroTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31909y.class, "introHint", "getIntroHint()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31909y.class, "introAction", "getIntroAction()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31909y.class, "readingTitle", "getReadingTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31909y.class, "readingSubtitle", "getReadingSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31909y.class, "readingProgress", "getReadingProgress()Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;", 0), AbstractC28118g.m69077a(C31909y.class, "resultIcon", "getResultIcon()Landroid/widget/ImageView;", 0), AbstractC28118g.m69077a(C31909y.class, "resultTitle", "getResultTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31909y.class, "resultSubtitle", "getResultSubtitle()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f64857e;

    /* JADX INFO: renamed from: f */
    public final Function0 f64858f;

    /* JADX INFO: renamed from: g */
    public final String f64859g;

    /* JADX INFO: renamed from: h */
    public final C28778k f64860h;

    /* JADX INFO: renamed from: i */
    public final C28778k f64861i;

    /* JADX INFO: renamed from: j */
    public final C28778k f64862j;

    /* JADX INFO: renamed from: k */
    public final C28778k f64863k;

    /* JADX INFO: renamed from: l */
    public final C28778k f64864l;

    /* JADX INFO: renamed from: m */
    public final C28778k f64865m;

    /* JADX INFO: renamed from: n */
    public final C28778k f64866n;

    /* JADX INFO: renamed from: o */
    public final C28778k f64867o;

    /* JADX INFO: renamed from: p */
    public final C28778k f64868p;

    /* JADX INFO: renamed from: q */
    public final C28778k f64869q;

    /* JADX INFO: renamed from: a */
    public static final Unit m70942a(C31909y c31909y, C29983l c29983l) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) c31909y.f64860h.getValue(c31909y, f64856r[0]);
        if (lottieAnimationView != null) {
            String strM70061a = c29983l.m70061a("sns_mrtdscan2_animation_chip");
            String strM70061a2 = c29983l.m70061a("sns_mrtdscan2_animation_phone");
            if (strM70061a != null) {
                AbstractC28427X.m69313a(lottieAnimationView, "Chip area", strM70061a);
            }
            if (strM70061a2 != null) {
                AbstractC28427X.m69313a(lottieAnimationView, "Phone sensor", strM70061a2);
            }
        }
        return Unit.INSTANCE;
    }

    public C31909y(C31905w c31905w, Function0 function0, Function0 function1) {
        super(c31905w.f58549a, c31905w);
        this.f64857e = function0;
        this.f64858f = function1;
        this.f64859g = "MrtdLayoutStateHandler";
        this.f64860h = m69602a(R$id.sns_intro_animation);
        this.f64861i = m69602a(R$id.sns_intro_title);
        this.f64862j = m69602a(R$id.sns_intro_hint);
        this.f64863k = m69602a(R$id.sns_intro_action);
        this.f64864l = m69602a(R$id.sns_reading_title);
        this.f64865m = m69602a(R$id.sns_reading_subtitle);
        this.f64866n = m69602a(R$id.sns_reading_progress);
        this.f64867o = m69602a(R$id.sns_result_status);
        this.f64868p = m69602a(R$id.sns_result_title);
        this.f64869q = m69602a(R$id.sns_result_subtitle);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f64859g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f64860h.getValue(this, f64856r[0]);
        if (lottieAnimationView != null) {
            AbstractC31852a.m70917a(lottieAnimationView);
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f58549a.getViewLifecycleOwner()), null, null, new C28786s(this, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C31909y.m70942a(this.f64781b, (C29983l) obj);
            }
        }, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final ImageView m70945n() {
        return (ImageView) this.f64867o.getValue(this, f64856r[7]);
    }

    /* JADX INFO: renamed from: a */
    public final void m70944a(C31891p c31891p) {
        C28778k c28778k = this.f64861i;
        KProperty[] kPropertyArr = f64856r;
        TextView textView = (TextView) c28778k.getValue(this, kPropertyArr[1]);
        if (textView != null) {
            textView.setText(c31891p.f64815a);
        }
        TextView textView2 = (TextView) this.f64862j.getValue(this, kPropertyArr[2]);
        if (textView2 != null) {
            CharSequence charSequence = c31891p.f64816b;
            textView2.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, this.f58549a.requireContext()) : null);
        }
        CharSequence charSequence2 = c31891p.f64817c;
        if (charSequence2 != null) {
            TextView textView3 = (TextView) this.f64863k.getValue(this, kPropertyArr[3]);
            if (textView3 != null) {
                textView3.setHighlightColor(0);
            }
            TextView textView4 = (TextView) this.f64863k.getValue(this, kPropertyArr[3]);
            if (textView4 != null) {
                Function1 function1 = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.i1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C31909y.m70943a(this.f64784b, (String) obj);
                    }
                };
                SpannableString spannableString = new SpannableString(charSequence2);
                spannableString.setSpan(new URLSpan(charSequence2.toString()), 0, spannableString.length(), 33);
                textView4.setText(spannableString);
                AbstractC28485q.m69381a(textView4, function1);
                return;
            }
            return;
        }
        TextView textView5 = (TextView) this.f64863k.getValue(this, kPropertyArr[3]);
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70943a(C31909y c31909y, String str) {
        c31909y.f64857e.invoke();
        return Unit.INSTANCE;
    }
}
