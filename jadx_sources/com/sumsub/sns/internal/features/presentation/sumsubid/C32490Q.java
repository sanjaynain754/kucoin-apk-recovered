package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.squareup.picasso.C27835s;
import com.squareup.picasso.Picasso;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSAspectRatioImageView;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.databinding.C28330J;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i;
import com.sumsub.sns.internal.core.presentation.bottomsheet.C28718b;
import com.sumsub.sns.internal.core.presentation.bottomsheet.C28720d;
import com.sumsub.sns.internal.core.presentation.bottomsheet.InterfaceC28719c;
import com.sumsub.sns.internal.core.presentation.common.C28777j;
import com.sumsub.sns.internal.core.presentation.common.C28785r;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32490Q extends AbstractC28725i {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty[] f66298o = {AbstractC28118g.m69077a(C32490Q.class, "binding", "getBinding()Lcom/sumsub/sns/databinding/SnsSumsubidLearnMoreBottomSheetBinding;", 0)};

    /* JADX INFO: renamed from: k */
    public final String f66299k;

    /* JADX INFO: renamed from: l */
    public final String f66300l;

    /* JADX INFO: renamed from: m */
    public final C28718b f66301m;

    /* JADX INFO: renamed from: n */
    public final C28777j f66302n;

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: a */
    public final View mo69543a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R$layout.sns_sumsubid_learn_more_bottom_sheet, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m71162a(C32490Q c32490q, View view) {
        AbstractC28725i.m69541a(c32490q, Control.ConfirmButton);
        C28720d c28720d = c32490q.f58412e;
        if (c28720d != null) {
            c28720d.dismiss();
            return;
        }
        FragmentManager childFragmentManager = c32490q.f58549a.getChildFragmentManager();
        childFragmentManager.executePendingTransactions();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(c32490q.mo69549n());
        C28720d c28720d2 = fragmentFindFragmentByTag instanceof C28720d ? (C28720d) fragmentFindFragmentByTag : null;
        if (c28720d2 != null) {
            c28720d2.dismiss();
        } else {
            c32490q.m69608b("Bottom sheet is dismissed");
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f66299k;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: n */
    public final String mo69549n() {
        return this.f66300l;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: o */
    public final InterfaceC28719c mo69550o() {
        return this.f66301m;
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: p */
    public final void mo69551p() {
        C27835s c27835sM68795i;
        C28578h c28578h;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HORIZONTAL_MARGIN;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                int iFloatValue = (int) f11.floatValue();
                C28720d c28720d = this.f58412e;
                View view = c28720d != null ? c28720d.getView() : null;
                if (view != null) {
                    view.setPadding(iFloatValue, view.getPaddingTop(), iFloatValue, view.getPaddingBottom());
                }
            }
        }
        C28330J c28330jM71163s = m71163s();
        if (c28330jM71163s != null) {
            SNSAspectRatioImageView sNSAspectRatioImageView = c28330jM71163s.f57657b;
            sNSAspectRatioImageView.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCornerSizes(sNSAspectRatioImageView.getResources().getDimension(R$dimen.sns_id_learn_more_banner_corner_radius)).build());
            sNSAspectRatioImageView.setVisibility(0);
            Context contextRequireContext = this.f58549a.requireContext();
            AbstractActivityC28115f abstractActivityC28115f = contextRequireContext instanceof AbstractActivityC28115f ? (AbstractActivityC28115f) contextRequireContext : null;
            Picasso picasso = (abstractActivityC28115f == null || (c28578h = (C28578h) abstractActivityC28115f.f57328a.getValue()) == null) ? null : (Picasso) c28578h.f58152I.getValue();
            if (picasso != null && (c27835sM68795i = picasso.m68795i("/s/msdk/images/sumsubid_learn_more_banner.png")) != null) {
                c27835sM68795i.m68906d(sNSAspectRatioImageView);
            }
        }
        C28330J c28330jM71163s2 = m71163s();
        if (c28330jM71163s2 != null) {
            c28330jM71163s2.f57659d.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C32490Q.m71162a(this.f66335b, view2);
                }
            });
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f58549a.getViewLifecycleOwner()), null, null, new C28785r(this, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32490Q.m71161a(this.f66337b, (C29124h) obj);
            }
        }, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final C28330J m71163s() {
        return (C28330J) this.f66302n.getValue(this, f66298o[0]);
    }

    public C32490Q(AbstractC28133l abstractC28133l) {
        super(abstractC28133l);
        this.f66299k = "SNSSumsubIdLearnMoreBottomSheet";
        this.f66300l = "SNSSumsubIdLearnMoreBottomSheet";
        this.f66301m = new C28718b(Screen.SumsubIdLearnMoreScreen);
        this.f66302n = m69544a(C32488P.f66283a);
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: q */
    public final void mo69552q() {
        AbstractActivityC28115f abstractActivityC28115f;
        C28578h c28578h;
        C28330J c28330jM71163s = m71163s();
        if (c28330jM71163s != null) {
            SNSAspectRatioImageView sNSAspectRatioImageView = c28330jM71163s.f57657b;
            Context contextRequireContext = this.f58549a.requireContext();
            Picasso picasso = null;
            if (contextRequireContext instanceof AbstractActivityC28115f) {
                abstractActivityC28115f = (AbstractActivityC28115f) contextRequireContext;
            } else {
                abstractActivityC28115f = null;
            }
            if (abstractActivityC28115f != null && (c28578h = (C28578h) abstractActivityC28115f.f57328a.getValue()) != null) {
                picasso = (Picasso) c28578h.f58152I.getValue();
            }
            if (picasso != null) {
                picasso.m68788b(sNSAspectRatioImageView);
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.bottomsheet.AbstractC28725i
    /* JADX INFO: renamed from: a */
    public final void mo69546a(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.setState(3);
        bottomSheetBehavior.setSkipCollapsed(true);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71161a(C32490Q c32490q, C29124h c29124h) {
        C28330J c28330jM71163s = c32490q.m71163s();
        if (c28330jM71163s != null) {
            c28330jM71163s.f57661f.setText(AbstractC29130i.m69770a("sumsubid.info.title", c29124h.f59089v));
        }
        C28330J c28330jM71163s2 = c32490q.m71163s();
        if (c28330jM71163s2 != null) {
            c28330jM71163s2.f57660e.setText(AbstractC29130i.m69770a("sumsubid.info.benefits.title", c29124h.f59089v));
        }
        List listListOf = CollectionsKt.listOf((Object[]) new C32486O[]{new C32486O(Integer.valueOf(R$drawable.sns_ic_flash_on), AbstractC29130i.m69770a("sumsubid.info.benefits.instant.title", c29124h.f59089v), AbstractC29130i.m69770a("sumsubid.info.benefits.instant.subtitle", c29124h.f59089v)), new C32486O(Integer.valueOf(R$drawable.sns_ic_lock_outline), AbstractC29130i.m69770a("sumsubid.info.benefits.protected.title", c29124h.f59089v), AbstractC29130i.m69770a("sumsubid.info.benefits.protected.subtitle", c29124h.f59089v)), new C32486O(Integer.valueOf(R$drawable.sns_ic_shield_check_outline), AbstractC29130i.m69770a("sumsubid.info.benefits.control.title", c29124h.f59089v), AbstractC29130i.m69770a("sumsubid.info.benefits.control.subtitle", c29124h.f59089v))});
        C28330J c28330jM71163s3 = c32490q.m71163s();
        if (c28330jM71163s3 != null) {
            LinearLayout linearLayout = c28330jM71163s3.f57658c;
            linearLayout.removeAllViews();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
            int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium_plus);
            boolean z11 = false;
            int i11 = 0;
            for (Object obj : listListOf) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C32486O c32486o = (C32486O) obj;
                View viewInflate = layoutInflaterFrom.inflate(R$layout.sns_sumsubid_learn_more_benefit_item, linearLayout, z11);
                int i13 = R$id.sns_sumsubid_learn_more_benefit_item_body;
                SNSBodyTextView sNSBodyTextView = (SNSBodyTextView) ViewBindings.findChildViewById(viewInflate, i13);
                if (sNSBodyTextView != null) {
                    i13 = R$id.sns_sumsubid_learn_more_benefit_item_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i13);
                    if (imageView != null) {
                        i13 = R$id.sns_sumsubid_learn_more_benefit_item_title;
                        SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(viewInflate, i13);
                        if (sNSSubtitle1TextView != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                            linearLayout.addView(linearLayout2);
                            Integer num = c32486o.f66258a;
                            if (num.intValue() != 0) {
                                imageView.setImageResource(num.intValue());
                            } else {
                                imageView.setImageDrawable(null);
                            }
                            ColorStateList imageTintList = ImageViewCompat.getImageTintList(imageView);
                            if (imageTintList == null) {
                                imageTintList = ColorStateList.valueOf(-65281);
                            }
                            Integer numM69174a = AbstractC28234b.m69174a(imageView, SNSColorElement.CONTENT_SUCCESS);
                            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(numM69174a != null ? numM69174a.intValue() : imageTintList.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281)));
                            sNSSubtitle1TextView.setText(c32486o.f66259b);
                            sNSBodyTextView.setText(c32486o.f66260c);
                            if (i11 != CollectionsKt.getLastIndex(listListOf)) {
                                ((ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams()).bottomMargin = dimensionPixelSize;
                            }
                            i11 = i12;
                            z11 = false;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
            }
        }
        C28330J c28330jM71163s4 = c32490q.m71163s();
        if (c28330jM71163s4 != null) {
            c28330jM71163s4.f57659d.setText(AbstractC29130i.m69770a("sumsubid.info.action", c29124h.f59089v));
        }
        return Unit.INSTANCE;
    }
}
