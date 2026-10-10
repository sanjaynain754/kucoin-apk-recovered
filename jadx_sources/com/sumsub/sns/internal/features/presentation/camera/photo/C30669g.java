package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSCardRadioButton;
import com.sumsub.sns.core.widget.SNSCountrySelectorView;
import com.sumsub.sns.core.widget.SNSDividerWithTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28340e;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.presentation.country.AbstractC30878c;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.features.presentation.country.picker.CountryPickerDialog;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/e;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDocumentSelectorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDocumentSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/SNSDocumentSelectorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n106#2,15:307\n256#3,2:322\n256#3,2:324\n256#3,2:326\n1869#4,2:328\n*S KotlinDebug\n*F\n+ 1 SNSDocumentSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/SNSDocumentSelectorFragment\n*L\n55#1:307,15\n102#1:322,2\n103#1:324,2\n116#1:326,2\n186#1:328,2\n*E\n"})
public final class C30669g extends AbstractC28058F<C28340e, C30402G, C30736v0> {

    /* JADX INFO: renamed from: a */
    public final Lazy f61974a = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.d1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C30669g.m70417a(this.f61256b);
        }
    });

    /* JADX INFO: renamed from: b */
    public final Lazy f61975b;

    /* JADX INFO: renamed from: c */
    public boolean f61976c;

    /* JADX INFO: renamed from: d */
    public List f61977d;

    /* JADX INFO: renamed from: a */
    public static final String m70417a(C30669g c30669g) {
        String string;
        Bundle arguments = c30669g.getArguments();
        return (arguments == null || (string = arguments.getString("extra_document_type")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: b */
    public static final void m70423b(C30669g c30669g, View view) {
        ((C30736v0) c30669g.f61975b.getValue()).intent(C30737w.f62104a);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70420a(C30669g c30669g, C30400E c30400e, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            ((C30736v0) c30669g.f61975b.getValue()).intent(new C30743z(c30400e));
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66111b() {
        return (String) this.f61974a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30736v0) this.f61975b.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        FragmentManager supportFragmentManager;
        C30402G c30402g = (C30402G) abstractC28081V;
        C30683n c30683n = c30402g.f61164a;
        if (c30683n == null || this.f61976c) {
            this.f61976c = false;
        } else {
            List list = c30683n.f62005a;
            this.f61976c = true;
            Context contextRequireContext = requireContext();
            C30421a c30421a = new C30421a(this);
            FragmentActivity fragmentActivity = contextRequireContext instanceof FragmentActivity ? (FragmentActivity) contextRequireContext : null;
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && supportFragmentManager.findFragmentByTag("CountryPickerDialog") == null) {
                Set setEmptySet = SetsKt.emptySet();
                CountryPickerDialog countryPickerDialog = new CountryPickerDialog();
                countryPickerDialog.f62386c = c30421a;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("extra_selection_mode", CountryPickerDialog.SelectionMode.SINGLE);
                bundle2.putParcelableArray("extra_items", (Parcelable[]) list.toArray(new C30877b[0]));
                bundle2.putParcelableArray("extra_preselected_items", (Parcelable[]) setEmptySet.toArray(new C30877b[0]));
                bundle2.putBoolean("extra_sort", true);
                countryPickerDialog.setArguments(bundle2);
                countryPickerDialog.show(supportFragmentManager, "CountryPickerDialog");
            }
        }
        C28340e viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57720h.setText(c30402g.f61165b);
        }
        C30398C c30398c = c30402g.f61166c;
        C28340e viewBinding2 = getViewBinding();
        if (viewBinding2 != null) {
            SNSCountrySelectorView sNSCountrySelectorView = viewBinding2.f57715c;
            C30877b c30877b = c30398c.f61159c;
            sNSCountrySelectorView.setIconStart(c30877b != null ? AbstractC30878c.m70503a(c30877b, requireContext()) : null);
            C30877b c30877b2 = c30398c.f61159c;
            sNSCountrySelectorView.setTitle(c30877b2 != null ? c30877b2.f62374b : null);
            sNSCountrySelectorView.setPlaceholder(c30398c.f61158b);
            viewBinding2.f57716d.setText(c30398c.f61157a);
        }
        m70425a(c30402g.f61167d);
        m70426a(c30402g.f61168e);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_document_selector, viewGroup, false);
        int i11 = R$id.sns_bottom_controls;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_container;
            if (((FragmentContainerView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_continue;
                SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSPrimaryButton != null) {
                    i11 = R$id.sns_country_selector;
                    SNSCountrySelectorView sNSCountrySelectorView = (SNSCountrySelectorView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSCountrySelectorView != null) {
                        i11 = R$id.sns_country_title;
                        SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSSubtitle1TextView != null) {
                            i11 = R$id.sns_documents_empty;
                            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSSubtitle2TextView != null) {
                                i11 = R$id.sns_footer;
                                SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSCaptionTextView != null) {
                                    i11 = R$id.sns_guideline_end;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                        i11 = R$id.sns_guideline_start;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                            i11 = R$id.sns_radiogroup;
                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(viewInflate, i11);
                                            if (radioGroup != null) {
                                                i11 = R$id.sns_title;
                                                SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                                if (sNSH1TextView != null) {
                                                    i11 = R$id.sns_toolbar;
                                                    if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                                        return new C28340e((SNSBackgroundConstraintLayout) viewInflate, sNSPrimaryButton, sNSCountrySelectorView, sNSSubtitle1TextView, sNSSubtitle2TextView, sNSCaptionTextView, radioGroup, sNSH1TextView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C30669g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30669g.m70422b(this.f61968b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30427c(new C30424b(this)));
        this.f61975b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30736v0.class), new C30430d(lazy), new C30664e(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f61977d = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        AbstractC28962j abstractC28962j;
        C28960h c28960h;
        super.onViewCreated(view, bundle);
        C28340e viewBinding = getViewBinding();
        if (viewBinding != null) {
            SNSCountrySelectorView sNSCountrySelectorView = viewBinding.f57715c;
            Context contextRequireContext = requireContext();
            String imageName = SNSIconHandler.SNSCommonIcons.MORE.getImageName();
            C28468k0 c28468k0 = C28468k0.f57983a;
            Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(contextRequireContext, imageName);
            if (drawableOnResolveIcon == null) {
                drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(contextRequireContext, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName());
            }
            sNSCountrySelectorView.setIconEnd(drawableOnResolveIcon);
            SNSJsonCustomization customization = c28468k0.getCustomization();
            String str = null;
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
                }
            }
            if (str != null) {
                AbstractC28234b.m69177a(viewBinding.f57716d, str);
            }
            viewBinding.f57715c.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C30669g.m70419a(this.f62115b, view2);
                }
            });
            viewBinding.f57714b.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C30669g.m70423b(this.f61240b, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m70422b(C30669g c30669g) {
        return new C30738w0(c30669g, (String) c30669g.f61974a.getValue(), c30669g.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30669g.getArguments());
    }

    /* JADX INFO: renamed from: a */
    public static final void m70419a(C30669g c30669g, View view) {
        ((C30736v0) c30669g.f61975b.getValue()).intent(C30396A.f61156a);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70418a(C30669g c30669g, String str) {
        AbstractC28052C.onLinkClicked$default((C30736v0) c30669g.f61975b.getValue(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX INFO: renamed from: a */
    public final void m70425a(final InterfaceC30731t interfaceC30731t) {
        String str;
        C28340e viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57717e.setVisibility(8);
            viewBinding.f57719g.setVisibility(8);
            if (Intrinsics.areEqual(interfaceC30731t, C30691r.f62021a)) {
                this.f61977d = null;
                return;
            }
            if (interfaceC30731t instanceof C30693s) {
                AbstractC28458h.m69341a(viewBinding.f57717e, ((C30693s) interfaceC30731t).f62024a);
                this.f61977d = null;
                return;
            }
            if (interfaceC30731t instanceof C30689q) {
                List<InterfaceC30681m> list = ((C30689q) interfaceC30731t).f62017a;
                C28340e viewBinding2 = getViewBinding();
                int id2 = -1;
                if (viewBinding2 != null) {
                    RadioGroup radioGroup = viewBinding2.f57719g;
                    if (!Intrinsics.areEqual(this.f61977d, list)) {
                        this.f61977d = list;
                        TransitionManager.beginDelayedTransition(radioGroup);
                        C28340e viewBinding3 = getViewBinding();
                        if (viewBinding3 != null) {
                            RadioGroup radioGroup2 = viewBinding3.f57719g;
                            radioGroup2.removeAllViews();
                            for (InterfaceC30681m interfaceC30681m : list) {
                                if (interfaceC30681m instanceof C30401F) {
                                    SNSSubtitle1TextView sNSSubtitle1TextView = new SNSSubtitle1TextView(requireContext(), null, 0, 0, 14, null);
                                    sNSSubtitle1TextView.setText(((C30401F) interfaceC30681m).f61163a);
                                    SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
                                    SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
                                    C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
                                    if (c28966p != null) {
                                        SNSMetricElement sNSMetricElement = SNSMetricElement.SECTION_HEADER_ALIGNMENT;
                                        Map map = c28966p.f58878d;
                                        AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
                                        C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
                                        if (c28960h != null) {
                                            str = c28960h.f58868a;
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        AbstractC28234b.m69177a(sNSSubtitle1TextView, str);
                                    }
                                    RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                    layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
                                    radioGroup2.addView(sNSSubtitle1TextView, layoutParams);
                                } else if (interfaceC30681m instanceof C30400E) {
                                    SNSCardRadioButton sNSCardRadioButtonM70424a = m70424a((C30400E) interfaceC30681m);
                                    RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(-1, -2);
                                    layoutParams2.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
                                    radioGroup2.addView(sNSCardRadioButtonM70424a, layoutParams2);
                                } else if (interfaceC30681m instanceof C30685o) {
                                    SNSDividerWithTextView sNSDividerWithTextView = new SNSDividerWithTextView(requireContext(), null, 0, 6, null);
                                    sNSDividerWithTextView.setText(((C30685o) interfaceC30681m).f62008a);
                                    RadioGroup.LayoutParams layoutParams3 = new RadioGroup.LayoutParams(-1, -2);
                                    layoutParams3.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
                                    radioGroup2.addView(sNSDividerWithTextView, layoutParams3);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                }
                RadioGroup radioGroup3 = viewBinding.f57719g;
                Function1 function1 = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.c1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(C30669g.m70421a(interfaceC30731t, (RadioButton) obj));
                    }
                };
                int childCount = radioGroup3.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = radioGroup3.getChildAt(i11);
                    SNSCardRadioButton sNSCardRadioButton = childAt instanceof SNSCardRadioButton ? (SNSCardRadioButton) childAt : null;
                    if (sNSCardRadioButton != null && ((Boolean) function1.invoke(sNSCardRadioButton)).booleanValue()) {
                        id2 = sNSCardRadioButton.getId();
                    }
                }
                radioGroup3.check(id2);
                viewBinding.f57719g.setVisibility(0);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70421a(InterfaceC30731t interfaceC30731t, RadioButton radioButton) {
        return Intrinsics.areEqual(radioButton.getTag(), ((C30689q) interfaceC30731t).f62018b);
    }

    /* JADX INFO: renamed from: a */
    public final void m70426a(C30735v c30735v) {
        C28340e viewBinding = getViewBinding();
        if (viewBinding != null) {
            SNSCaptionTextView sNSCaptionTextView = viewBinding.f57718f;
            AbstractC28458h.m69341a(sNSCaptionTextView, c30735v.f62085a);
            AbstractC28485q.m69381a(sNSCaptionTextView, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30669g.m70418a(this.f61245b, (String) obj);
                }
            });
            sNSCaptionTextView.setMovementMethod(new LinkMovementMethod());
            viewBinding.f57714b.setText(c30735v.f62086b.f61997a);
            viewBinding.f57714b.setEnabled(c30735v.f62086b.f61998b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final SNSCardRadioButton m70424a(final C30400E c30400e) {
        SNSCardRadioButton sNSCardRadioButton = new SNSCardRadioButton(requireContext(), null, 0, 0, SNSMetricElement.DOCUMENT_TYPE_CARD_STYLE, 14, null);
        sNSCardRadioButton.setText(c30400e.f61161b);
        sNSCardRadioButton.setTag(c30400e);
        sNSCardRadioButton.setStartDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c30400e.f61162c), true);
        sNSCardRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.f1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C30669g.m70420a(this.f61972b, c30400e, compoundButton, z11);
            }
        });
        return sNSCardRadioButton;
    }
}
