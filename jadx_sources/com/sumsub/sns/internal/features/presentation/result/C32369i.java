package com.sumsub.sns.internal.features.presentation.result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28337b;
import com.sumsub.sns.internal.core.analytics.C28379r;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/result/i;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/b;", "Lcom/sumsub/sns/internal/features/presentation/result/o;", "Lcom/sumsub/sns/internal/features/presentation/result/q;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSFinishResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFinishResultFragment.kt\ncom/sumsub/sns/internal/features/presentation/result/SNSFinishResultFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,85:1\n106#2,15:86\n*S KotlinDebug\n*F\n+ 1 SNSFinishResultFragment.kt\ncom/sumsub/sns/internal/features/presentation/result/SNSFinishResultFragment\n*L\n23#1:86,15\n*E\n"})
public final class C32369i extends AbstractC28058F<C28337b, AbstractC32375o, C32377q> {

    /* JADX INFO: renamed from: a */
    public final Lazy f65947a;

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71104a(C32369i c32369i) {
        return new C32361a(c32369i, c32369i.getArguments(), c32369i.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return MapsKt.mapOf(TuplesKt.m90091to(DbParams.KEY_CHANNEL_RESULT, ((C32377q) this.f65947a.getValue()).m71105e().f65938a));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return MapsKt.mapOf(TuplesKt.m90091to(DbParams.KEY_CHANNEL_RESULT, ((C32377q) this.f65947a.getValue()).m71105e().f65938a));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32377q) this.f65947a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        AbstractC32375o abstractC32375o = (AbstractC32375o) abstractC28081V;
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70632e(Intrinsics.areEqual(abstractC32375o, C32373m.f65952a));
        }
        if (abstractC32375o instanceof C32374n) {
            C28337b viewBinding = getViewBinding();
            if (viewBinding != null) {
                viewBinding.f57692b.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), ((C32374n) abstractC32375o).f65953a));
            }
            C28337b viewBinding2 = getViewBinding();
            if (viewBinding2 != null) {
                SNSStepViewExtensionsKt.setSnsStepState(viewBinding2.f57692b, ((C32374n) abstractC32375o).f65956d);
            }
            C28337b viewBinding3 = getViewBinding();
            if (viewBinding3 != null) {
                AbstractC28458h.m69341a(viewBinding3.f57694d, ((C32374n) abstractC32375o).f65954b);
            }
            C28337b viewBinding4 = getViewBinding();
            if (viewBinding4 != null) {
                AbstractC28458h.m69341a(viewBinding4.f57693c, ((C32374n) abstractC32375o).f65955c);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_finish_result_fragment, viewGroup, false);
        int i11 = R$id.sns_guideline_center;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_guideline_end;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_guideline_start;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_icon;
                    SNSImageView sNSImageView = (SNSImageView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSImageView != null) {
                        i11 = R$id.sns_subtitle;
                        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSSubtitle2TextView != null) {
                            i11 = R$id.sns_title;
                            SNSH2TextView sNSH2TextView = (SNSH2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSH2TextView != null) {
                                i11 = R$id.sns_toolbar;
                                if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                    return new C28337b((SNSBackgroundConstraintLayout) viewInflate, sNSImageView, sNSSubtitle2TextView, sNSH2TextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C32369i() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.result.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32369i.m71104a(this.f65946b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32365e(new C32364d(this)));
        this.f65947a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32377q.class), new C32366f(lazy), new C32367g(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF64225b() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("arg_doc_set_type")) != null) {
            return string;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF62065t() {
        String string;
        Bundle arguments = getArguments();
        Screen screen = null;
        if (arguments != null) {
            string = arguments.getString("analyticsScreen");
        } else {
            string = null;
        }
        C28379r c28379r = Screen.Companion;
        if (string == null) {
            string = "";
        }
        c28379r.getClass();
        for (Screen screen2 : Screen.values()) {
            if (Intrinsics.areEqual(screen2.getText(), string)) {
                screen = screen2;
                break;
            }
        }
        if (screen == null) {
            return Screen.Other;
        }
        return screen;
    }
}
