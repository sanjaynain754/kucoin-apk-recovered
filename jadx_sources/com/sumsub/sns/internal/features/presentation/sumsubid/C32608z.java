package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28351p;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.C28626A;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.android.C28707v;
import com.sumsub.sns.internal.core.presentation.screen.C28942c;
import com.sumsub.sns.internal.core.presentation.screen.C28943d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.presentation.otp.C31375c;
import com.sumsub.sns.internal.features.presentation.otp.C31382j;
import com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.C32583i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/p;", "Lcom/sumsub/sns/internal/features/presentation/sumsubid/U0;", "Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSumsubIdFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSumsubIdFragment.kt\ncom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n106#2,15:164\n1#3:179\n1563#4:180\n1634#4,3:181\n*S KotlinDebug\n*F\n+ 1 SNSSumsubIdFragment.kt\ncom/sumsub/sns/internal/features/presentation/sumsubid/SNSSumsubIdFragment\n*L\n38#1:164,15\n110#1:180\n110#1:181,3\n*E\n"})
public final class C32608z extends AbstractC28058F<C28351p, AbstractC32498U0, C32487O0> {

    /* JADX INFO: renamed from: a */
    public final Lazy f66515a;

    /* JADX INFO: renamed from: b */
    public C32583i f66516b;

    /* JADX INFO: renamed from: c */
    public final C32490Q f66517c;

    /* JADX INFO: renamed from: d */
    public final C28707v f66518d;

    /* JADX INFO: renamed from: e */
    public final String f66519e;

    /* JADX INFO: renamed from: a */
    public static final C28651g m71208a(C32608z c32608z) {
        return ((C32487O0) c32608z.f66515a.getValue()).f66282u;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71212b(C32608z c32608z) {
        C32583i c32583i = c32608z.f66516b;
        if (c32583i != null) {
            c32583i.m71207b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m71213c(C32608z c32608z) {
        C32583i c32583i = c32608z.f66516b;
        if (c32583i != null) {
            c32583i.m71205a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m71215e(C32608z c32608z) {
        c32608z.f66518d.m69523s();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m71216f(C32608z c32608z) {
        AlertDialog alertDialog = c32608z.f66518d.f58525e;
        if (alertDialog != null) {
            if (!alertDialog.isShowing()) {
                alertDialog = null;
            }
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final ViewModelProvider.Factory m71217g(C32608z c32608z) {
        return new C32505a(c32608z, c32608z.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c32608z.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF62316b() {
        return this.f66519e;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF63626a() {
        C28936t c28936t = ((C32487O0) this.f66515a.getValue()).f66267f;
        KProperty kProperty = C32487O0.f66261v[0];
        int i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t.m69705a()).ordinal()];
        if (i11 == 1) {
            return Screen.SumsubIdEmailScreen;
        }
        if (i11 == 2) {
            return Screen.SumsubIdReuseScreen;
        }
        if (i11 == 3) {
            return Screen.SumsubIdReuseScreen;
        }
        if (i11 == 4) {
            return Screen.SumsubIdAgreementScreen;
        }
        if (i11 == 5) {
            return Screen.SumsubIdProfileScreen;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32487O0) this.f66515a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof C32523g)) {
            if (interfaceC28145r instanceof C32497U) {
                C32497U c32497u = (C32497U) interfaceC28145r;
                m71218a(c32497u.f66328a, c32497u.f66329b);
                return;
            } else if (interfaceC28145r instanceof C32495T) {
                this.f66517c.m69553r();
                return;
            } else {
                super.handleEvent(interfaceC28145r);
                return;
            }
        }
        C31375c c31375c = C31382j.f63581g;
        C29070X.Companion.getClass();
        Document document = new Document(C29062V.m69739a("SumsubId"), null);
        String text = Screen.SumsubIdCodeScreen.getText();
        C32523g c32523g = (C32523g) interfaceC28145r;
        C28943d c28943d = new C28943d(c32523g.f66346a, new C28942c(Integer.valueOf(c32523g.f66347b), 60), c32523g.f66348c, c32523g.f66349d);
        c31375c.getClass();
        C31382j c31382j = new C31382j();
        Bundle bundle = new Bundle();
        bundle.putString("arg_strings_key", "sumsubid");
        bundle.putString("arg_client_tag", "SNSSumsubIdFragment");
        if (text != null) {
            bundle.putString("arg_screen_name", text);
        }
        bundle.putParcelable("arg_doc", document);
        bundle.putParcelable("arg_otp_params", c28943d);
        c31382j.setArguments(bundle);
        AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31382j.forResult("snsid_otp"), "SNSOtpInputFragment", false, 4, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        AbstractC32498U0 abstractC32498U0 = (AbstractC32498U0) abstractC28081V;
        C32583i c32583i = this.f66516b;
        if (c32583i != null) {
            if (abstractC32498U0 instanceof C32492R0) {
                c32583i.m71202a((C32492R0) abstractC32498U0);
                return;
            }
            if (abstractC32498U0 instanceof C32494S0) {
                c32583i.m71203a((C32494S0) abstractC32498U0);
                return;
            }
            if (abstractC32498U0 instanceof C32489P0) {
                c32583i.m71200a((C32489P0) abstractC32498U0);
            } else if (abstractC32498U0 instanceof C32491Q0) {
                c32583i.m71201a((C32491Q0) abstractC32498U0);
            } else {
                if (!(abstractC32498U0 instanceof C32496T0)) {
                    throw new NoWhenBranchMatchedException();
                }
                c32583i.m71204a((C32496T0) abstractC32498U0);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_sumsubid, viewGroup, false);
        int i11 = R$id.sns_button;
        SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSPrimaryButton != null) {
            i11 = R$id.sns_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, i11);
            if (constraintLayout != null) {
                i11 = R$id.sns_guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_secondary_button;
                        SNSSecondaryButton sNSSecondaryButton = (SNSSecondaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSSecondaryButton != null) {
                            i11 = R$id.sns_toolbar;
                            SNSToolbarView sNSToolbarView = (SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSToolbarView != null) {
                                return new C28351p((SNSBackgroundConstraintLayout) viewInflate, sNSPrimaryButton, constraintLayout, sNSSecondaryButton, sNSToolbarView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C32608z() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.g1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71217g(this.f66350b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32601v(new C32561u(this)));
        this.f66515a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32487O0.class), new C32603w(lazy), new C32605x(lazy), function0);
        this.f66517c = new C32490Q(this);
        this.f66518d = new C28707v(this, SetsKt.setOf(C28626A.f58259e), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71208a(this.f66352b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71212b(this.f66359b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.j1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71213c(this.f66365b);
            }
        }, 8);
        this.f66519e = "SumsubId";
    }

    /* JADX INFO: renamed from: d */
    public static final C28367f m71214d(C32608z c32608z) {
        return c32608z.getAnalyticsDelegate();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentKt.setFragmentResultListener(this, "snsid_otp", new Function2() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.l1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C32608z.m71209a(this.f66378b, (String) obj, (Bundle) obj2);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f66516b = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int color;
        super.onViewCreated(view, bundle);
        this.f66516b = new C32583i(getViewBinding(), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71214d(this.f66389b);
            }
        }, new C32559t((C32487O0) this.f66515a.getValue()), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.n1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71215e(this.f66392b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32608z.m71216f(this.f66397b);
            }
        });
        Integer numM69174a = AbstractC28234b.m69174a(view, SNSColorElement.CONTENT_LINK);
        if (numM69174a != null) {
            color = numM69174a.intValue();
        } else {
            color = ContextCompat.getColor(requireContext(), R$color.sns_contentLink);
        }
        C28351p viewBinding = getViewBinding();
        if (viewBinding != null) {
            SNSToolbarView sNSToolbarView = viewBinding.f57779e;
            sNSToolbarView.setOptionButtonDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.ICON_PERSON.getImageName()));
            sNSToolbarView.setOnOptionButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.p1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C32608z.m71210a(this.f66401b, view2);
                }
            });
            sNSToolbarView.setOptionButtonTintList(ColorStateList.valueOf(color));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m71210a(C32608z c32608z, View view) {
        ((C32487O0) c32608z.f66515a.getValue()).intent(C32476J.f66225a);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71209a(C32608z c32608z, String str, Bundle bundle) {
        c32608z.getClass();
        C31382j.f63581g.getClass();
        AbstractC28133l.Companion.getClass();
        if (bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) == 10) {
            C32487O0 c32487o0 = (C32487O0) c32608z.f66515a.getValue();
            String string = bundle.getString("result_key_code");
            if (string == null) {
                string = "";
            }
            c32487o0.intent(new C32458A(string, Long.valueOf(bundle.getLong("result_key_timestamp", System.currentTimeMillis()))));
        } else if (bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) == 11) {
            ((C32487O0) c32608z.f66515a.getValue()).intent(C32482M.f66249a);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void trackOpen() {
    }

    /* JADX INFO: renamed from: a */
    public final void m71218a(CharSequence charSequence, CharSequence charSequence2) {
        Pair pairM90091to = TuplesKt.m90091to(charSequence, C32478K.f66233a);
        if (charSequence == null) {
            pairM90091to = null;
        }
        final List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Pair[]{pairM90091to, TuplesKt.m90091to(charSequence2, C32462C.f66185a)});
        SNSAlertDialogBuilder sNSAlertDialogBuilder = new SNSAlertDialogBuilder(requireContext());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOfNotNull, 10));
        Iterator it = listListOfNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add((CharSequence) ((Pair) it.next()).getFirst());
        }
        sNSAlertDialogBuilder.setStyledItems(arrayList, new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.k1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C32608z.m71211a(listListOfNotNull, this, dialogInterface, i11);
            }
        }).show();
    }

    /* JADX INFO: renamed from: a */
    public static final void m71211a(List list, C32608z c32608z, DialogInterface dialogInterface, int i11) {
        ((C32487O0) c32608z.f66515a.getValue()).intent((AbstractC32484N) ((Pair) list.get(i11)).getSecond());
    }
}
