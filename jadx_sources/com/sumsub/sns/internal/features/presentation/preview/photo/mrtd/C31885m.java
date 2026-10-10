package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28427X;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i;
import com.sumsub.sns.internal.core.presentation.bottomsheet.C28718b;
import com.sumsub.sns.internal.core.presentation.bottomsheet.C28720d;
import com.sumsub.sns.internal.core.presentation.bottomsheet.InterfaceC28719c;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.common.C28786s;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31885m extends AbstractC28725i {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty[] f64797s = {AbstractC28118g.m69077a(C31885m.class, "instructionTitle", "getInstructionTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31885m.class, "instructionBefore", "getInstructionBefore()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31885m.class, "instructionAfter", "getInstructionAfter()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31885m.class, "animation", "getAnimation()Lcom/airbnb/lottie/LottieAnimationView;", 0), AbstractC28118g.m69077a(C31885m.class, "btnPrimary", "getBtnPrimary()Landroid/widget/Button;", 0)};

    /* JADX INFO: renamed from: k */
    public final Function0 f64798k;

    /* JADX INFO: renamed from: l */
    public final String f64799l;

    /* JADX INFO: renamed from: m */
    public final C28718b f64800m;

    /* JADX INFO: renamed from: n */
    public final C28778k f64801n;

    /* JADX INFO: renamed from: o */
    public final C28778k f64802o;

    /* JADX INFO: renamed from: p */
    public final C28778k f64803p;

    /* JADX INFO: renamed from: q */
    public final C28778k f64804q;

    /* JADX INFO: renamed from: r */
    public final C28778k f64805r;

    /* JADX INFO: renamed from: a */
    public static final Unit m70925a(C31885m c31885m, C29983l c29983l) {
        String strSubstringAfter$default;
        String strSubstringBefore$default;
        C28778k c28778k = c31885m.f64801n;
        KProperty[] kPropertyArr = f64797s;
        TextView textView = (TextView) c28778k.getValue(c31885m, kPropertyArr[0]);
        if (textView != null) {
            textView.setText(c29983l.m70061a("sns_mrtdscan2_tips_title"));
        }
        Button button = (Button) c31885m.f64805r.getValue(c31885m, kPropertyArr[4]);
        if (button != null) {
            button.setText(c29983l.m70061a("sns_mrtdscan2_tips_action_dismiss"));
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM69671a = AbstractC28892d.m69671a(new Object[]{((C31883l) c31885m.f64798k.invoke()).f64795b}, 1, "sns_mrtdscan2_tips_body::%s", c29983l);
        if (strM69671a == null) {
            strM69671a = c29983l.m70061a("sns_mrtdscan2_tips_body");
        }
        TextView textView2 = (TextView) c31885m.f64802o.getValue(c31885m, kPropertyArr[1]);
        Spanned spannedM69364a = null;
        if (textView2 != null) {
            textView2.setText((strM69671a == null || (strSubstringBefore$default = StringsKt.substringBefore$default(strM69671a, "{animation}", (String) null, 2, (Object) null)) == null) ? null : AbstractC28462i0.m69364a(strSubstringBefore$default, c31885m.f58549a.requireContext()));
        }
        TextView textView3 = (TextView) c31885m.f64803p.getValue(c31885m, kPropertyArr[2]);
        if (textView3 != null) {
            if (strM69671a != null && (strSubstringAfter$default = StringsKt.substringAfter$default(strM69671a, "{animation}", (String) null, 2, (Object) null)) != null) {
                spannedM69364a = AbstractC28462i0.m69364a(strSubstringAfter$default, c31885m.f58549a.requireContext());
            }
            textView3.setText(spannedM69364a);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) c31885m.f64804q.getValue(c31885m, kPropertyArr[3]);
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

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f64799l;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: n */
    public final String mo69549n() {
        return "MrtdInstructionBottomSheet";
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: o */
    public final InterfaceC28719c mo69550o() {
        return this.f64800m;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: p */
    public final void mo69551p() {
        C28778k c28778k = this.f64804q;
        KProperty[] kPropertyArr = f64797s;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) c28778k.getValue(this, kPropertyArr[3]);
        if (lottieAnimationView != null) {
            AbstractC31852a.m70917a(lottieAnimationView);
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f58549a.getViewLifecycleOwner()), null, null, new C28786s(this, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C31885m.m70925a(this.f64839b, (C29983l) obj);
            }
        }, null), 3, null);
        Button button = (Button) this.f64805r.getValue(this, kPropertyArr[4]);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31885m.m70926a(this.f64853b, view);
                }
            });
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f64804q.getValue(this, kPropertyArr[3]);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setAnimation(((C31883l) this.f64798k.invoke()).f64794a);
        }
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) this.f64804q.getValue(this, kPropertyArr[3]);
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.playAnimation();
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: q */
    public final void mo69552q() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f64804q.getValue(this, f64797s[3]);
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
    }

    public C31885m(C31905w c31905w, Function0 function0) {
        super(c31905w);
        this.f64798k = function0;
        this.f64799l = "MrtdInstructionBottomSheet";
        this.f64800m = new C28718b(Screen.MrtdTipsScreen);
        this.f64801n = m69548b(R$id.sns_instructions_title);
        this.f64802o = m69548b(R$id.sns_instructions_1);
        this.f64803p = m69548b(R$id.sns_instructions_2);
        this.f64804q = m69548b(R$id.sns_animation);
        this.f64805r = m69548b(R$id.sns_primary_button);
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: a */
    public final View mo69543a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R$layout.sns_layout_mrtd_instruction_bottom_sheet, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70926a(C31885m c31885m, View view) {
        AbstractC28725i.m69541a(c31885m, Control.DismissButton);
        C28720d c28720d = c31885m.f58412e;
        if (c28720d != null) {
            c28720d.dismiss();
            return;
        }
        FragmentManager childFragmentManager = c31885m.f58549a.getChildFragmentManager();
        childFragmentManager.executePendingTransactions();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("MrtdInstructionBottomSheet");
        C28720d c28720d2 = fragmentFindFragmentByTag instanceof C28720d ? (C28720d) fragmentFindFragmentByTag : null;
        if (c28720d2 != null) {
            c28720d2.dismiss();
        } else {
            c31885m.m69608b("Bottom sheet is dismissed");
        }
    }
}
