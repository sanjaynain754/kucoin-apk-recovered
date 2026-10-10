package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.form.C28165b;
import com.sumsub.sns.core.presentation.form.C28169f;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;", "Lcom/sumsub/sns/internal/features/presentation/preview/a;", "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;", "Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/preview/applicantdata/b", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataDocumentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/applicantdata/SNSApplicantDataDocumentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,125:1\n106#2,15:126\n27#3,4:141\n1#4:145\n277#5,2:146\n54#6,8:148\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/applicantdata/SNSApplicantDataDocumentFragment\n*L\n35#1:126,15\n44#1:141,4\n96#1:146,2\n102#1:148,8\n*E\n"})
public final class C31490h extends AbstractC31475a<C31494l, C31476A> implements InterfaceC28797d {

    /* JADX INFO: renamed from: a */
    public final Lazy f63884a;

    /* JADX INFO: renamed from: b */
    public final C28404L f63885b;

    /* JADX INFO: renamed from: c */
    public final C28404L f63886c;

    /* JADX INFO: renamed from: d */
    public final C28404L f63887d;

    /* JADX INFO: renamed from: e */
    public final C28404L f63888e;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty[] f63883g = {AbstractC28118g.m69077a(C31490h.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C31490h.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31490h.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31490h.class, "vgContent", "getVgContent()Landroid/view/ViewGroup;", 0)};

    /* JADX INFO: renamed from: f */
    public static final C31484b f63882f = new C31484b();

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d
    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k mo69614a() {
        return (C31476A) this.f63884a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C28404L c28404l = this.f63885b;
        KProperty[] kPropertyArr = f63883g;
        Button button = (Button) c28404l.getValue(this, kPropertyArr[0]);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.applicantdata.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31490h.m70755a(this.f63881b, view2);
                }
            });
        }
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
                AbstractC28458h.m69343a(Integer.valueOf(iFloatValue), Integer.valueOf(iFloatValue), (Integer) null, (Button) this.f63885b.getValue(this, kPropertyArr[0]), (TextView) this.f63886c.getValue(this, kPropertyArr[1]), (TextView) this.f63887d.getValue(this, kPropertyArr[2]));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70754a(C31490h c31490h) {
        Bundle arguments = c31490h.getArguments();
        return new C31477B(arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null, c31490h, c31490h.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31490h.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_applicant_data_document);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31476A) this.f63884a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        C28169f c28169f;
        C31494l c31494l = (C31494l) interfaceC28147s;
        C28404L c28404l = this.f63888e;
        KProperty[] kPropertyArr = f63883g;
        ViewGroup viewGroup = (ViewGroup) c28404l.getValue(this, kPropertyArr[3]);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f63888e.getValue(this, kPropertyArr[3]);
            if (viewGroup2 != null) {
                Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(viewGroup2.getId());
                if (fragmentFindFragmentById instanceof C28169f) {
                    c28169f = (C28169f) fragmentFindFragmentById;
                } else {
                    c28169f = null;
                }
            } else {
                c28169f = null;
            }
            if (c28169f == null) {
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                int id2 = viewGroup.getId();
                C28165b c28165b = C28169f.f57420o;
                String f63761f = getF66519e();
                c28165b.getClass();
                fragmentTransactionBeginTransaction.replace(id2, C28165b.m69096a("AppData", f63761f));
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            }
        }
        TextView textView = (TextView) this.f63886c.getValue(this, kPropertyArr[1]);
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c31494l.f63894c);
        }
        TextView textView2 = (TextView) this.f63887d.getValue(this, kPropertyArr[2]);
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31494l.f63895d);
        }
        Button button = (Button) this.f63885b.getValue(this, kPropertyArr[0]);
        if (button != null) {
            AbstractC28458h.m69341a(button, c31494l.f63896e);
        }
        ViewGroup viewGroup3 = (ViewGroup) this.f63888e.getValue(this, kPropertyArr[3]);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(c31494l.f63897f ? 0 : 4);
        }
    }

    public C31490h() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.applicantdata.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31490h.m70754a(this.f63876b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31486d(new C31485c(this)));
        this.f63884a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31476A.class), new C31487e(lazy), new C31488f(lazy), function0);
        this.f63885b = new C28404L(R$id.sns_primary_button);
        this.f63886c = new C28404L(R$id.sns_title);
        this.f63887d = new C28404L(R$id.sns_subtitle);
        this.f63888e = new C28404L(R$id.sns_content);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66519e() {
        Document document;
        C29070X type;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null && (document = (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null)) != null && (type = document.getType()) != null && (str = type.f59014a) != null) {
            return str;
        }
        return "TYPE_UNKNOWN";
    }

    /* JADX INFO: renamed from: a */
    public static final void m70755a(C31490h c31490h, View view) {
        C28367f.m69257a(c31490h.getAnalyticsDelegate(), c31490h.getF63626a(), c31490h.getF66519e(), Control.ContinueButton, null, 24);
        AbstractC28458h.m69339a(view);
        C31476A c31476a = (C31476A) c31490h.f63884a.getValue();
        c31476a.getClass();
        C31482a.m70753a("submitApplicantData");
        C41696j.m91104d(ViewModelKt.getViewModelScope(c31476a), null, null, new C31503u(c31476a, null), 3, null);
    }
}
