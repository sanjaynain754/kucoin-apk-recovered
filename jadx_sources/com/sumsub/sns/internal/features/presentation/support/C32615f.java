package com.sumsub.sns.internal.features.presentation.support;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSupportItemView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/support/f;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/support/h;", "Lcom/sumsub/sns/internal/features/presentation/support/k;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSupportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSupportFragment.kt\ncom/sumsub/sns/internal/features/presentation/support/SNSSupportFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n106#2,15:92\n1869#3,2:107\n1#4:109\n*S KotlinDebug\n*F\n+ 1 SNSSupportFragment.kt\ncom/sumsub/sns/internal/features/presentation/support/SNSSupportFragment\n*L\n26#1:92,15\n43#1:107,2\n*E\n"})
public final class C32615f extends AbstractC28064I<C32617h, C32620k> {

    /* JADX INFO: renamed from: a */
    public final Lazy f66529a;

    /* JADX INFO: renamed from: b */
    public final Screen f66530b;

    /* JADX INFO: renamed from: c */
    public final String f66531c;

    /* JADX INFO: renamed from: a */
    public final void m71221a(C32617h c32617h) {
        ViewGroup viewGroup;
        View view = getView();
        ViewGroup viewGroup2 = null;
        TextView textView = view != null ? (TextView) view.findViewById(R$id.sns_title) : null;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c32617h.f66537a);
        }
        View view2 = getView();
        TextView textView2 = view2 != null ? (TextView) view2.findViewById(R$id.sns_subtitle) : null;
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c32617h.f66538b);
        }
        View view3 = getView();
        ViewGroup viewGroup3 = view3 != null ? (ViewGroup) view3.findViewById(R$id.sns_list) : null;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        for (final C32616g c32616g : c32617h.f66542f) {
            SNSSupportItemView sNSSupportItemView = new SNSSupportItemView(requireContext(), null, 0, 0, 14, null);
            SNSStepViewExtensionsKt.setSnsStepState(sNSSupportItemView, c32616g.f66533b);
            Drawable drawableOnResolveIcon = c32616g.f66534c;
            if (drawableOnResolveIcon == null) {
                String iconName = c32616g.f66532a.getIconName();
                drawableOnResolveIcon = iconName != null ? C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), iconName) : null;
            }
            sNSSupportItemView.setIconStart(drawableOnResolveIcon);
            sNSSupportItemView.setTitle(c32616g.f66535d);
            sNSSupportItemView.setSubtitle(c32616g.f66536e);
            sNSSupportItemView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.support.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C32615f.m71220a(c32616g, this, view4);
                }
            });
            View view4 = getView();
            ViewGroup viewGroup4 = view4 != null ? (ViewGroup) view4.findViewById(R$id.sns_list) : null;
            if (viewGroup4 != null) {
                viewGroup4.addView(sNSSupportItemView);
            }
        }
        SNSApplicantDataFieldView sNSApplicantDataFieldView = new SNSApplicantDataFieldView(requireContext(), null, 0, 0, 14, null);
        CharSequence charSequence = c32617h.f66539c;
        if (charSequence == null) {
            charSequence = "";
        }
        sNSApplicantDataFieldView.setLabel(charSequence);
        sNSApplicantDataFieldView.setTag(sNSApplicantDataFieldView);
        sNSApplicantDataFieldView.setHint(c32617h.f66541e);
        sNSApplicantDataFieldView.disableInput();
        CharSequence charSequence2 = c32617h.f66540d;
        if (charSequence2 != null) {
            sNSApplicantDataFieldView.enableCopyToClipboard(charSequence2);
        }
        View view5 = getView();
        ViewGroup viewGroup5 = view5 != null ? (ViewGroup) view5.findViewById(R$id.sns_list) : null;
        int dimensionPixelSize = (viewGroup5 == null || viewGroup5.getChildCount() != 0) ? requireContext().getResources().getDimensionPixelSize(R$dimen.sns_margin_large) : 0;
        View view6 = getView();
        if (view6 != null) {
            viewGroup = (ViewGroup) view6.findViewById(R$id.sns_list);
        }
        if (viewGroup2 == null) {
            viewGroup2 = viewGroup;
            return;
        }
        viewGroup2 = viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = dimensionPixelSize;
        Unit unit = Unit.INSTANCE;
        viewGroup2.addView(sNSApplicantDataFieldView, marginLayoutParams);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF63761f() {
        return this.f66531c;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_bottom_sheet_support);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF63762g() {
        return this.f66530b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32620k) this.f66529a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m71221a((C32617h) interfaceC28147s);
    }

    public C32615f() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.support.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32615f.m71219a(this.f66528b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32611b(new C32610a(this)));
        this.f66529a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32620k.class), new C32612c(lazy), new C32613d(lazy), function0);
        this.f66530b = Screen.SupportScreen;
        this.f66531c = "TYPE_UNKNOWN";
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71219a(C32615f c32615f) {
        return new C32621l(c32615f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }

    /* JADX INFO: renamed from: a */
    public static final void m71220a(C32616g c32616g, C32615f c32615f, View view) {
        if (AbstractC28485q.m69382a(c32616g.f66532a, c32615f.requireContext())) {
            return;
        }
        Logger.DefaultImpls.e$default(C33272c.f67812a, "SNSSupportFragment", "The SDK is not possible to resolve a click on support item (" + c32616g + ")", null, 4, null);
    }
}
