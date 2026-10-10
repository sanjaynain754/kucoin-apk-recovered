package com.sumsub.sns.internal.features.presentation.geo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.form.C28165b;
import com.sumsub.sns.core.presentation.form.C28169f;
import com.sumsub.sns.core.widget.SNSBackgroundView;
import com.sumsub.sns.core.widget.SNSDividerWithTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28343h;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.C28705t;
import com.sumsub.sns.internal.core.presentation.android.C28709x;
import com.sumsub.sns.internal.core.presentation.android.location.C28676l;
import com.sumsub.sns.internal.core.presentation.android.location.C28682r;
import com.sumsub.sns.internal.core.presentation.android.location.C28683s;
import com.sumsub.sns.internal.core.presentation.android.location.C28686v;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/geo/g;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/h;", "Lcom/sumsub/sns/internal/features/presentation/geo/H0;", "Lcom/sumsub/sns/internal/features/presentation/geo/v0;", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSGeoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSGeoFragment.kt\ncom/sumsub/sns/internal/features/presentation/geo/SNSGeoFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n106#2,15:182\n256#3,2:197\n256#3,2:211\n256#3,2:213\n256#3,2:215\n50#4,12:199\n1#5:217\n*S KotlinDebug\n*F\n+ 1 SNSGeoFragment.kt\ncom/sumsub/sns/internal/features/presentation/geo/SNSGeoFragment\n*L\n40#1:182,15\n109#1:197,2\n128#1:211,2\n134#1:213,2\n146#1:215,2\n112#1:199,12\n*E\n"})
public final class C31087g extends AbstractC28058F<C28343h, AbstractC31052H0, C31120v0> implements InterfaceC28797d {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f62856U = 0;

    /* JADX INFO: renamed from: a */
    public final String f62857a = "SumSubGeo";

    /* JADX INFO: renamed from: b */
    public final Lazy f62858b;

    /* JADX INFO: renamed from: a */
    public static final Unit m70569a(C31124x0 c31124x0, C31087g c31087g) {
        AbstractC31050G0 abstractC31050G0 = c31124x0.f62941b;
        if (abstractC31050G0 != null) {
            ((C31120v0) c31087g.f62858b.getValue()).intent(abstractC31050G0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final C28705t m70570b(C31087g c31087g) {
        return ((C31120v0) c31087g.f62858b.getValue()).f62923i;
    }

    /* JADX INFO: renamed from: c */
    public static final C28683s m70571c(C31087g c31087g) {
        return ((C31120v0) c31087g.f62858b.getValue()).f62922h;
    }

    /* JADX INFO: renamed from: d */
    public static final ViewModelProvider.Factory m70572d(C31087g c31087g) {
        return new C31122w0(c31087g, c31087g.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31087g.getAppListener$idensic_mobile_sdk_aar_defaultRelease(), c31087g.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF63761f() {
        return ((C31120v0) this.f62858b.getValue()).f62921g.getType().f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getLogTag() {
        return this.f62857a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31120v0) this.f62858b.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m70574a((AbstractC31052H0) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_geo, viewGroup, false);
        int i11 = R$id.sns_form_placeholder;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i11);
        if (frameLayout != null) {
            i11 = R$id.sns_fragment_content;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_icon;
                SNSImageView sNSImageView = (SNSImageView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSImageView != null) {
                    i11 = R$id.sns_primary_button;
                    SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSPrimaryButton != null) {
                        i11 = R$id.sns_secondary_button;
                        SNSSecondaryButton sNSSecondaryButton = (SNSSecondaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSSecondaryButton != null) {
                            i11 = R$id.sns_subtitle;
                            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSSubtitle2TextView != null) {
                                i11 = R$id.sns_subtitle2;
                                SNSSubtitle2TextView sNSSubtitle2TextView2 = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSSubtitle2TextView2 != null) {
                                    i11 = R$id.sns_subtitle_divider;
                                    SNSDividerWithTextView sNSDividerWithTextView = (SNSDividerWithTextView) ViewBindings.findChildViewById(viewInflate, i11);
                                    if (sNSDividerWithTextView != null) {
                                        i11 = R$id.sns_title;
                                        SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                        if (sNSH1TextView != null) {
                                            i11 = R$id.sns_toolbar;
                                            if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                                return new C28343h((SNSBackgroundView) viewInflate, frameLayout, sNSImageView, sNSPrimaryButton, sNSSecondaryButton, sNSSubtitle2TextView, sNSSubtitle2TextView2, sNSDividerWithTextView, sNSH1TextView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C31087g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31087g.m70572d(this.f62828b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31076c(new C31073b(this)));
        this.f62858b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31120v0.class), new C31079d(lazy), new C31082e(lazy), function0);
        new C28686v(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31087g.m70571c(this.f62836b);
            }
        });
        new C28709x(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.c1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31087g.m70570b(this.f62841b);
            }
        });
        new C28682r(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31087g.m70568a(this.f62846b);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        super.handleEvent(interfaceC28145r);
        if (interfaceC28145r instanceof C31043D) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("geo_fallback_document", ((C31120v0) this.f62858b.getValue()).f62921g);
            Unit unit = Unit.INSTANCE;
            FragmentKt.setFragmentResult(this, "geo_request_fallback", bundle);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d
    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k mo69614a() {
        return (C31120v0) this.f62858b.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final C28676l m70568a(C31087g c31087g) {
        return ((C31120v0) c31087g.f62858b.getValue()).f62924j;
    }

    /* JADX INFO: renamed from: a */
    public final void m70574a(AbstractC31052H0 abstractC31052H0) {
        C31070a.m70567a("handleSuccessState: " + Reflection.getOrCreateKotlinClass(abstractC31052H0.getClass()).getSimpleName());
        if (abstractC31052H0 instanceof C31038A0) {
            C31038A0 c31038a0 = (C31038A0) abstractC31052H0;
            C28343h viewBinding = getViewBinding();
            if (viewBinding == null) {
                return;
            }
            AbstractC28458h.m69344a(viewBinding.f57725b);
            C31040B0 c31040b0 = c31038a0.f62735a;
            C28343h viewBinding2 = getViewBinding();
            if (viewBinding2 != null) {
                viewBinding2.f57726c.setVisibility(0);
                viewBinding2.f57726c.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c31040b0.f62738a.getImageName()));
                AbstractC28458h.m69341a(viewBinding2.f57732i, c31040b0.f62739b);
                AbstractC28458h.m69341a(viewBinding2.f57729f, c31040b0.f62740c);
                viewBinding2.f57731h.setVisibility(c31040b0.f62741d == null ? 8 : 0);
                viewBinding2.f57731h.setText(c31040b0.f62741d);
                AbstractC28458h.m69341a(viewBinding2.f57730g, c31040b0.f62742e);
            }
            C31126y0 c31126y0 = c31038a0.f62736b;
            C28343h viewBinding3 = getViewBinding();
            if (viewBinding3 == null) {
                return;
            }
            m70573a(viewBinding3.f57727d, c31126y0 != null ? c31126y0.f62944a : null);
            m70573a(viewBinding3.f57728e, c31126y0 != null ? c31126y0.f62945b : null);
            return;
        }
        if (abstractC31052H0 instanceof C31128z0) {
            C31128z0 c31128z0 = (C31128z0) abstractC31052H0;
            C28343h viewBinding4 = getViewBinding();
            if (viewBinding4 == null) {
                return;
            }
            AbstractC28458h.m69344a(viewBinding4.f57726c, viewBinding4.f57732i, viewBinding4.f57729f, viewBinding4.f57731h, viewBinding4.f57730g);
            viewBinding4.f57725b.setVisibility(0);
            FragmentManager childFragmentManager = getChildFragmentManager();
            int i11 = R$id.sns_form_placeholder;
            Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(i11);
            if ((fragmentFindFragmentById instanceof C28169f ? (C28169f) fragmentFindFragmentById : null) == null) {
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                C28165b c28165b = C28169f.f57420o;
                String f62316b = getF63761f();
                c28165b.getClass();
                fragmentTransactionBeginTransaction.replace(i11, C28165b.m69096a("SumSubGeo", f62316b));
                fragmentTransactionBeginTransaction.commitNow();
            }
            C31126y0 c31126y1 = c31128z0.f62950d;
            C28343h viewBinding5 = getViewBinding();
            if (viewBinding5 == null) {
                return;
            }
            m70573a(viewBinding5.f57727d, c31126y1 != null ? c31126y1.f62944a : null);
            m70573a(viewBinding5.f57728e, c31126y1 != null ? c31126y1.f62945b : null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void trackOpen() {
    }

    /* JADX INFO: renamed from: a */
    public final void m70573a(MaterialButton materialButton, final C31124x0 c31124x0) {
        materialButton.setVisibility(c31124x0 != null ? 0 : 8);
        if (c31124x0 != null) {
            materialButton.setText(c31124x0.f62940a);
            materialButton.setEnabled(c31124x0.f62942c);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.e1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31087g.m70569a(c31124x0, this);
                }
            }, materialButton);
        }
    }
}
