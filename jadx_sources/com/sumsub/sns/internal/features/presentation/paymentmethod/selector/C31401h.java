package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28121h;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSCardRadioButton;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28346k;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.paymentmethod.upload.C31428h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/h;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/k;", "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/n;", "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/t;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/paymentmethod/selector/b", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPaymentMethodSelectorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPaymentMethodSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/paymentmethod/selector/SNSPaymentMethodSelectorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 5 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,248:1\n106#2,15:249\n1563#3:264\n1634#3,3:265\n1563#3:268\n1634#3,3:269\n1869#3,2:272\n295#3,2:274\n53#4,4:276\n27#5,4:280\n27#5,4:284\n*S KotlinDebug\n*F\n+ 1 SNSPaymentMethodSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/paymentmethod/selector/SNSPaymentMethodSelectorFragment\n*L\n55#1:249,15\n150#1:264\n150#1:265,3\n151#1:268\n151#1:269,3\n160#1:272,2\n167#1:274,2\n169#1:276,4\n49#1:280,4\n132#1:284,4\n*E\n"})
public final class C31401h extends AbstractC28058F<C28346k, C31407n, C31413t> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f63625U = 0;

    /* JADX INFO: renamed from: a */
    public final Screen f63626a = Screen.PaymentMethodsSelectorScreen;

    /* JADX INFO: renamed from: b */
    public final Lazy f63627b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C31401h.m70705a(this.f63624b);
        }
    });

    /* JADX INFO: renamed from: c */
    public final String f63628c = "PAYMENT_METHODS";

    /* JADX INFO: renamed from: d */
    public final Lazy f63629d;

    /* JADX INFO: renamed from: e */
    public ArrayList f63630e;

    /* JADX INFO: renamed from: a */
    public static final Document m70705a(C31401h c31401h) {
        Document document;
        Bundle arguments = c31401h.getArguments();
        if (arguments == null || (document = (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null)) == null) {
            throw new IllegalStateException("Document argument is required");
        }
        return document;
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m70709b(C31401h c31401h) {
        return new C31414u((Document) c31401h.f63627b.getValue(), c31401h, c31401h.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31401h.getArguments());
    }

    /* JADX INFO: renamed from: f */
    public final String m70711f() {
        return "instructions_request_key_" + this.f63628c + "_" + Reflection.getOrCreateKotlinClass(C31401h.class).getQualifiedName();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF65006c() {
        return this.f63628c;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF62051d() {
        return this.f63626a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31413t) this.f63629d.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof C31405l)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        C31395b c31395b = new C31395b(((C31405l) interfaceC28145r).f63633a);
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            String strM70711f = m70711f();
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70624a(new C29697t2("PAYMENT_METHODS", IntroScene.PAYMENT_METHOD_BANK_CARD.getSceneName(), (String) null, (String) null, MapsKt.mapOf(TuplesKt.m90091to("paymentMethod", "bankCard")), 28), c31395b, strM70711f);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        Object obj;
        List list;
        C31407n c31407n = (C31407n) abstractC28081V;
        C28346k viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57752e.setText(c31407n.f63636a);
            viewBinding.f57751d.setText(c31407n.f63637b);
            viewBinding.f57749b.setText(c31407n.f63638c);
            viewBinding.f57749b.setEnabled(c31407n.f63639d);
            ArrayList arrayList = c31407n.f63640e;
            C28346k viewBinding2 = getViewBinding();
            int id2 = -1;
            if (viewBinding2 != null) {
                RadioGroup radioGroup = viewBinding2.f57750c;
                ArrayList arrayList2 = this.f63630e;
                if (arrayList2 != null) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        C31406m c31406m = (C31406m) obj2;
                        c31406m.getClass();
                        arrayList3.add(TuplesKt.m90091to("bankCard", c31406m.f63634a.toString()));
                    }
                    list = CollectionsKt.toList(arrayList3);
                } else {
                    list = null;
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    C31406m c31406m2 = (C31406m) obj3;
                    c31406m2.getClass();
                    arrayList4.add(TuplesKt.m90091to("bankCard", c31406m2.f63634a.toString()));
                }
                if (!Intrinsics.areEqual(list, arrayList4)) {
                    this.f63630e = arrayList;
                    TransitionManager.beginDelayedTransition(radioGroup);
                    radioGroup.removeAllViews();
                    int size3 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj4 = arrayList.get(i13);
                        i13++;
                        SNSCardRadioButton sNSCardRadioButtonM70710a = m70710a((C31406m) obj4);
                        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
                        radioGroup.addView(sNSCardRadioButtonM70710a, layoutParams);
                    }
                }
            }
            ArrayList arrayList5 = c31407n.f63640e;
            C28346k viewBinding3 = getViewBinding();
            if (viewBinding3 != null) {
                RadioGroup radioGroup2 = viewBinding3.f57750c;
                int size4 = arrayList5.size();
                int i14 = 0;
                do {
                    if (i14 >= size4) {
                        obj = null;
                        break;
                    } else {
                        obj = arrayList5.get(i14);
                        i14++;
                    }
                } while (!((C31406m) obj).f63635b);
                Object obj5 = ((C31406m) obj) != null ? "bankCard" : null;
                int childCount = radioGroup2.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = radioGroup2.getChildAt(i15);
                    Object tag = childAt.getTag();
                    if ((tag instanceof C31406m ? (C31406m) tag : null) != null && Intrinsics.areEqual("bankCard", obj5)) {
                        id2 = childAt.getId();
                    }
                }
                if (radioGroup2.getCheckedRadioButtonId() != id2) {
                    radioGroup2.check(id2);
                }
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_payment_method_selector, viewGroup, false);
        int i11 = R$id.sns_bottom_controls;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_continue;
            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSPrimaryButton != null) {
                i11 = R$id.sns_guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_radiogroup;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(viewInflate, i11);
                        if (radioGroup != null) {
                            i11 = R$id.sns_section;
                            SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSSubtitle1TextView != null) {
                                i11 = R$id.sns_title;
                                SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSH1TextView != null) {
                                    i11 = R$id.sns_toolbar;
                                    if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                        return new C28346k((SNSBackgroundConstraintLayout) viewInflate, sNSPrimaryButton, radioGroup, sNSSubtitle1TextView, sNSH1TextView);
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

    public C31401h() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31401h.m70709b(this.f63668b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31397d(new C31396c(this)));
        this.f63629d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31413t.class), new C31398e(lazy), new C31399f(lazy), function0);
    }

    /* JADX INFO: renamed from: g */
    public final void m70712g() {
        requireActivity().getSupportFragmentManager().setFragmentResultListener(m70711f(), getViewLifecycleOwner(), new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.z
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                C31401h.m70708a(this.f63672a, str, bundle);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f63630e = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((C31413t) this.f63629d.getValue()).intent(C31404k.f63632a);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        AbstractC28962j abstractC28962j;
        C28960h c28960h;
        super.onViewCreated(view, bundle);
        C28346k viewBinding = getViewBinding();
        if (viewBinding != null) {
            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
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
                AbstractC28234b.m69177a(viewBinding.f57752e, str);
            }
            viewBinding.f57749b.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31401h.m70706a(this.f63671b, view2);
                }
            });
        }
        m70712g();
    }

    /* JADX INFO: renamed from: a */
    public static final void m70707a(C31401h c31401h, C31406m c31406m, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            C31413t c31413t = (C31413t) c31401h.f63629d.getValue();
            c31406m.getClass();
            c31413t.intent(new C31403j());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70706a(C31401h c31401h, View view) {
        ((C31413t) c31401h.f63629d.getValue()).intent(C31402i.f63631a);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70708a(C31401h c31401h, String str, Bundle bundle) {
        C31395b c31395b;
        AbstractC28133l.Companion.getClass();
        if (C28121h.m69079a(bundle) && (c31395b = (C31395b) AbstractC28437b.m69320a(bundle, "payload", C31395b.class, null)) != null) {
            Document document = (Document) c31401h.f63627b.getValue();
            PhotosAmount photosAmount = c31395b.f63619a;
            C31428h c31428h = new C31428h();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ARGS_DOCUMENT", document);
            bundle2.putParcelable("ARGS_PHOTOS_AMOUNT", photosAmount);
            c31428h.setArguments(bundle2);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(c31401h, c31428h, "SNSBankCardUploadFragment", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final SNSCardRadioButton m70710a(final C31406m c31406m) {
        SNSCardRadioButton sNSCardRadioButton = new SNSCardRadioButton(requireContext(), null, 0, 0, SNSMetricElement.DOCUMENT_TYPE_CARD_STYLE, 14, null);
        sNSCardRadioButton.setText(c31406m.f63634a);
        sNSCardRadioButton.setTag(c31406m);
        sNSCardRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.x
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C31401h.m70707a(this.f63669b, c31406m, compoundButton, z11);
            }
        });
        return sNSCardRadioButton;
    }
}
