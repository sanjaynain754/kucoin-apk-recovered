package com.sumsub.sns.internal.features.presentation.exitsurvey;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.form.C28165b;
import com.sumsub.sns.core.presentation.form.C28169f;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSLinkButton;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28342g;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.exitsurvey.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/exitsurvey/g;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/g;", "Lcom/sumsub/sns/internal/features/presentation/exitsurvey/k;", "Lcom/sumsub/sns/internal/features/presentation/exitsurvey/q;", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/exitsurvey/a", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSExitSurveyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSExitSurveyFragment.kt\ncom/sumsub/sns/internal/features/presentation/exitsurvey/SNSExitSurveyFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,166:1\n106#2,15:167\n54#3,8:182\n50#3,12:190\n298#4,2:202\n298#4,2:204\n*S KotlinDebug\n*F\n+ 1 SNSExitSurveyFragment.kt\ncom/sumsub/sns/internal/features/presentation/exitsurvey/SNSExitSurveyFragment\n*L\n39#1:167,15\n125#1:182,8\n133#1:190,12\n138#1:202,2\n139#1:204,2\n*E\n"})
public final class C31023g extends AbstractC28058F<C28342g, AbstractC31027k, C31033q> implements InterfaceC28797d {

    /* JADX INFO: renamed from: a */
    public final Lazy f62704a;

    /* JADX INFO: renamed from: b */
    public final C28404L f62705b;

    /* JADX INFO: renamed from: c */
    public final C28404L f62706c;

    /* JADX INFO: renamed from: d */
    public final C28404L f62707d;

    /* JADX INFO: renamed from: e */
    public final C28404L f62708e;

    /* JADX INFO: renamed from: f */
    public final C28404L f62709f;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty[] f62703h = {AbstractC28118g.m69077a(C31023g.class, "poweredByText", "getPoweredByText()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31023g.class, "toolBar", "getToolBar()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0), AbstractC28118g.m69077a(C31023g.class, "content", "getContent()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C31023g.class, "btnContinue", "getBtnContinue()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31023g.class, "btnSkip", "getBtnSkip()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: g */
    public static final C31017a f62702g = new C31017a();

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d
    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k mo69614a() {
        return (C31033q) this.f62704a.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70561a(C31023g c31023g) {
        return new C31034r(c31023g, c31023g.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31023g.getArguments());
    }

    /* JADX INFO: renamed from: b */
    public static final void m70563b(C31023g c31023g, View view) {
        ((C31033q) c31023g.f62704a.getValue()).intent(C31028l.f62716a);
    }

    /* JADX INFO: renamed from: f */
    public final TextView m70564f() {
        return (TextView) this.f62708e.getValue(this, f62703h[3]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF63628c() {
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getLogTag() {
        return "SNSExitSurveyFragment";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final TextView getPoweredByText() {
        return (TextView) this.f62705b.getValue(this, f62703h[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31033q) this.f62704a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        AbstractC31027k abstractC31027k = (AbstractC31027k) abstractC28081V;
        if (abstractC31027k instanceof C31025i) {
            TextView textViewM70564f = m70564f();
            if (textViewM70564f != null) {
                textViewM70564f.setEnabled(((C31025i) abstractC31027k).f62713c);
            }
            C31025i c31025i = (C31025i) abstractC31027k;
            String str = c31025i.f62711a;
            String str2 = c31025i.f62712b;
            C28404L c28404l = this.f62707d;
            KProperty[] kPropertyArr = f62703h;
            ViewGroup viewGroup = (ViewGroup) c28404l.getValue(this, kPropertyArr[2]);
            if (viewGroup == null) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f62707d.getValue(this, kPropertyArr[2]);
            if ((viewGroup2 != null ? getChildFragmentManager().findFragmentById(viewGroup2.getId()) : null) == null) {
                TextView textViewM70564f2 = m70564f();
                if (textViewM70564f2 != null) {
                    textViewM70564f2.setText(str);
                }
                TextView textView = (TextView) this.f62709f.getValue(this, kPropertyArr[4]);
                if (textView != null) {
                    textView.setText(str2);
                }
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                int id2 = viewGroup.getId();
                C28169f.f57420o.getClass();
                fragmentTransactionBeginTransaction.replace(id2, C28165b.m69096a("ExitSurvey", "TYPE_UNKNOWN"));
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            }
            return;
        }
        if (abstractC31027k instanceof C31026j) {
            C31026j c31026j = (C31026j) abstractC31027k;
            C28367f.m69257a(getAnalyticsDelegate(), getF63626a(), "TYPE_UNKNOWN", Control.ContinueButton, MapsKt.mapOf(TuplesKt.m90091to("reasons", CollectionsKt.toList(c31026j.f62715b))), 16);
            String str3 = c31026j.f62714a;
            C28404L c28404l2 = this.f62707d;
            KProperty[] kPropertyArr2 = f62703h;
            ViewGroup viewGroup3 = (ViewGroup) c28404l2.getValue(this, kPropertyArr2[2]);
            Fragment fragmentFindFragmentById = viewGroup3 != null ? getChildFragmentManager().findFragmentById(viewGroup3.getId()) : null;
            if (fragmentFindFragmentById != null) {
                FragmentTransaction fragmentTransactionBeginTransaction2 = getChildFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction2.remove(fragmentFindFragmentById);
                fragmentTransactionBeginTransaction2.commitNow();
            }
            TextView textViewM70564f3 = m70564f();
            if (textViewM70564f3 != null) {
                textViewM70564f3.setVisibility(8);
            }
            TextView textView2 = (TextView) this.f62709f.getValue(this, kPropertyArr2[4]);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f62707d.getValue(this, kPropertyArr2[2]);
            if (viewGroup4 != null) {
                AbstractC28458h.m69340a(viewGroup4, 4);
                viewGroup4.removeAllViews();
                View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.sns_exit_survey_success, viewGroup4, true);
                SNSImageView sNSImageView = (SNSImageView) viewInflate.findViewById(R$id.sns_success_icon);
                if (sNSImageView != null) {
                    sNSImageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.SUCCESS.getImageName()));
                    sNSImageView.setSNSStepState(SNSStepState.PROCESSING);
                }
                TextView textView3 = (TextView) viewInflate.findViewById(R$id.sns_success_title);
                if (textView3 != null) {
                    AbstractC28458h.m69341a(textView3, str3);
                }
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_exit_survey, viewGroup, false);
        int i11 = R$id.sns_content;
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_continue;
            if (((SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_skip;
                        if (((SNSLinkButton) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                            i11 = R$id.sns_toolbar;
                            if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                return new C28342g((ConstraintLayout) viewInflate);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C31023g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.exitsurvey.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31023g.m70561a(this.f62733b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31019c(new C31018b(this)));
        this.f62704a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31033q.class), new C31020d(lazy), new C31021e(lazy), function0);
        this.f62705b = new C28404L(R$id.sns_powered);
        this.f62706c = new C28404L(R$id.sns_toolbar);
        this.f62707d = new C28404L(R$id.sns_content);
        this.f62708e = new C28404L(R$id.sns_continue);
        this.f62709f = new C28404L(R$id.sns_skip);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        AbstractC28962j abstractC28962j;
        C28960h c28960h;
        String str;
        super.onViewCreated(view, bundle);
        C28404L c28404l = this.f62706c;
        KProperty[] kPropertyArr = f62703h;
        SNSToolbarView sNSToolbarView = (SNSToolbarView) c28404l.getValue(this, kPropertyArr[1]);
        if (sNSToolbarView != null) {
            sNSToolbarView.setCloseButtonVisible(false);
        }
        TextView textView = (TextView) this.f62709f.getValue(this, kPropertyArr[4]);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.exitsurvey.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31023g.m70562a(this.f62701b, view2);
                }
            });
        }
        TextView textViewM70564f = m70564f();
        if (textViewM70564f != null) {
            textViewM70564f.setEnabled(false);
        }
        TextView textViewM70564f2 = m70564f();
        if (textViewM70564f2 != null) {
            textViewM70564f2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.exitsurvey.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31023g.m70563b(this.f62732b, view2);
                }
            });
        }
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
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
            SNSMetricElement sNSMetricElement = SNSMetricElement.SECTION_HEADER_ALIGNMENT;
            Map map = c28966p.f58878d;
            if (map != null) {
                abstractC28962j = (AbstractC28962j) map.get(sNSMetricElement.getValue());
            } else {
                abstractC28962j = null;
            }
            if (abstractC28962j instanceof C28960h) {
                c28960h = (C28960h) abstractC28962j;
            } else {
                c28960h = null;
            }
            if (c28960h != null) {
                str = c28960h.f58868a;
            } else {
                str = null;
            }
            if (str != null) {
                AbstractC28458h.m69343a(Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str)), (Integer) null, m70564f(), (TextView) this.f62709f.getValue(this, kPropertyArr[4]));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70562a(C31023g c31023g, View view) {
        C28367f.m69257a(c31023g.getAnalyticsDelegate(), c31023g.getF63626a(), "TYPE_UNKNOWN", Control.SkipButton, null, 24);
        ((C31033q) c31023g.f62704a.getValue()).intent(C31029m.f62717a);
    }
}
