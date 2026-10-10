package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28121h;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.camera.photo.C30669g;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30554g;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.C31715m;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m;
import com.sumsub.sns.internal.features.presentation.preview.photo.C31745F;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPreviewIdentityDocumentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPreviewIdentityDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/identity/SNSPreviewIdentityDocumentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,134:1\n106#2,15:135\n*S KotlinDebug\n*F\n+ 1 SNSPreviewIdentityDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/identity/SNSPreviewIdentityDocumentFragment\n*L\n23#1:135,15\n*E\n"})
public final class C31808l extends AbstractC31826m<C31816t> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f64629U = 0;

    /* JADX INFO: renamed from: u */
    public final Lazy f64630u;

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70886a(C31808l c31808l) {
        Bundle arguments = c31808l.getArguments();
        return new C31817u(arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null, c31808l, c31808l.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31808l.getArguments());
    }

    /* JADX INFO: renamed from: b */
    public static final void m70888b(C31808l c31808l, String str, Bundle bundle) {
        C31816t c31816t = (C31816t) c31808l.f64630u.getValue();
        AbstractC28133l.Companion.getClass();
        boolean zM69079a = C28121h.m69079a(bundle);
        c31816t.getClass();
        if (zM69079a) {
            AbstractC28052C.finish$default(c31816t, new C28494t(true), null, null, null, 14, null);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(c31816t), null, null, new C31812p(c31816t, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31816t) this.f64630u.getValue();
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m, com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C31810n) {
            InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
            if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
                C31810n c31810n = (C31810n) interfaceC28145r;
                String str = c31810n.f64634a;
                String str2 = c31810n.f64635b;
                SNSAppActivity sNSAppActivity = (SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease;
                C30669g c30669g = new C30669g();
                Bundle bundle = new Bundle();
                bundle.putString("extra_document_type", str);
                if (str2 != null) {
                    bundle.putString("extra_prefill_country", str2);
                }
                c30669g.setArguments(bundle);
                SNSAppActivity.m70600a(sNSAppActivity, c30669g.forResult("pick_document"), "SNSDocumentSelectorFragment", false, 12);
                return;
            }
            return;
        }
        if (!(interfaceC28145r instanceof C31809m)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease2 = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease2 != null) {
            C31809m c31809m = (C31809m) interfaceC28145r;
            Document document = c31809m.f64631a;
            String str3 = c31809m.f64632b;
            String str4 = c31809m.f64633c;
            C31715m.f64391v.getClass();
            C31715m c31715m = new C31715m();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ARGS_DOCUMENT", document);
            bundle2.putString("args_country", str3);
            bundle2.putString("args_source_id", str4);
            c31715m.setArguments(bundle2);
            SNSAppActivity.m70600a((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease2, c31715m.forResult("ekyc_for_iddocset"), "SNSEkycFragment", false, 12);
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m
    /* JADX INFO: renamed from: l */
    public final void mo70873l() {
        C31816t c31816t = (C31816t) this.f64630u.getValue();
        c31816t.getClass();
        C41696j.m91104d(ViewModelKt.getViewModelScope(c31816t), null, null, new C31813q(c31816t, null), 3, null);
    }

    public C31808l() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.identity.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31808l.m70886a(this.f64628b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31804h(new C31803g(this)));
        this.f64630u = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31816t.class), new C31805i(lazy), new C31806j(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        Document document;
        C29070X type;
        String str;
        Bundle arguments = getArguments();
        Document document2 = null;
        if (arguments != null) {
            document = (Document) arguments.getParcelable("ARGS_DOCUMENT");
        } else {
            document = null;
        }
        if (document != null) {
            document2 = document;
        }
        if (document2 != null && (type = document2.getType()) != null && (str = type.f59014a) != null) {
            return str;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        super.onFinishCalled(abstractC28503w);
        if (((C31816t) this.f64630u.getValue()).f64651n.m70885j()) {
            C31816t c31816t = (C31816t) this.f64630u.getValue();
            C31801e c31801e = c31816t.f64651n;
            c31801e.getClass();
            IdentitySide identitySide = IdentitySide.Front;
            C28936t c28936t = c31801e.f66620l.f66657c;
            KProperty kProperty = C32662m.f66654e[0];
            c28936t.f58834a.set(c28936t.f58835b, identitySide);
            List mutableList = CollectionsKt.toMutableList((Collection) c31801e.m71250c());
            mutableList.clear();
            c31801e.m71244a(mutableList);
            C41696j.m91104d(ViewModelKt.getViewModelScope(c31816t), null, null, new C31745F(c31816t, null, null), 3, null);
            return false;
        }
        return true;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m, com.sumsub.sns.internal.features.presentation.common.AbstractC30809H, com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("pick_document", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.identity.v
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C31808l.m70887a(this.f64655a, str, bundle2);
            }
        });
        requireActivity().getSupportFragmentManager().setFragmentResultListener("ekyc_for_iddocset", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.identity.w
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C31808l.m70888b(this.f64656a, str, bundle2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m70887a(C31808l c31808l, String str, Bundle bundle) {
        AbstractC28133l.Companion.getClass();
        if (C28121h.m69079a(bundle)) {
            String string = bundle.getString("result_selected_country");
            String string2 = bundle.getString("result_selected_id_doc_type");
            String string3 = bundle.getString("result_selected_ekyc_source");
            C30554g c30554g = C30554g.f61704a;
            String strM71624a = AbstractC33294e.m71624a(c30554g);
            String str2 = "Document selected: " + string + C33627eb.f69716f + string2 + C33627eb.f69716f + string3;
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d(strM71624a, str2, null);
            if (string == null) {
                c33270a.f67810a.mo68955d(AbstractC33294e.m71624a(c30554g), "Country is null, finish", null);
                AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(c31808l, null, null, null, 7, null);
                return;
            }
            if (string2 != null) {
                c33270a.f67810a.mo68955d(AbstractC33294e.m71624a(c30554g), "Selected ID Document Type: " + string2, null);
                c31808l.getClass();
                C31816t c31816t = (C31816t) c31808l.f64630u.getValue();
                c31816t.getClass();
                C41696j.m91104d(ViewModelKt.getViewModelScope(c31816t), null, null, new C31811o(c31816t, string, string2, null), 3, null);
                return;
            }
            if (string3 != null) {
                c33270a.f67810a.mo68955d(AbstractC33294e.m71624a(c30554g), "Selected eKYC source: " + string3, null);
                ((C31816t) c31808l.f64630u.getValue()).m70889a(string, string3);
                return;
            }
            c33270a.f67810a.mo68955d(AbstractC33294e.m71624a(c30554g), "Selected country: " + string + ", ID Document Type: " + string2, null);
            return;
        }
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(c31808l, null, null, null, 7, null);
    }
}
