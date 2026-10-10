package com.sumsub.sns.internal.features.presentation.questionnaire;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.form.C28165b;
import com.sumsub.sns.core.presentation.form.C28169f;
import com.sumsub.sns.core.presentation.form.InterfaceC28171h;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28348m;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.common.C28761a;
import com.sumsub.sns.internal.core.presentation.common.C28763b;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30468J;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30654y;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/m;", "Lcom/sumsub/sns/internal/features/presentation/questionnaire/p;", "Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "Lcom/sumsub/sns/core/presentation/form/h;", "<init>", "()V", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSQuestionnaireFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSQuestionnaireFragment.kt\ncom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,207:1\n106#2,15:208\n27#3,4:223\n1#4:227\n54#5,8:228\n*S KotlinDebug\n*F\n+ 1 SNSQuestionnaireFragment.kt\ncom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment\n*L\n40#1:208,15\n56#1:223,4\n149#1:228,8\n*E\n"})
public final class SNSQuestionnaireFragment extends AbstractC28058F<C28348m, C32320p, C32300I> implements InterfaceC28797d, InterfaceC28171h {

    /* JADX INFO: renamed from: d */
    public static final Companion f65822d = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final Lazy f65823a;

    /* JADX INFO: renamed from: b */
    public final C28761a f65824b;

    /* JADX INFO: renamed from: c */
    public final C28763b f65825c;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;", "", "<init>", "()V", "TAG", "", "PAYLOAD_CURRENT_PAGE_INDEX", "PAYLOAD_IS_DATA_VALID", "ARG_PENDING_FORM_ITEM", "newInstance", "Landroidx/fragment/app/Fragment;", "idDocSetType", "questionnaireId", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Fragment newInstance$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return companion.newInstance(str, str2);
        }

        @NotNull
        public final Fragment newInstance(@NotNull String idDocSetType, @Nullable String questionnaireId) {
            SNSQuestionnaireFragment sNSQuestionnaireFragment = new SNSQuestionnaireFragment();
            Bundle bundle = new Bundle();
            bundle.putString("IDDOCSETTYPE", idDocSetType);
            bundle.putString("QUESTIONNAIRE_ID", questionnaireId);
            sNSQuestionnaireFragment.setArguments(bundle);
            return sNSQuestionnaireFragment;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71095a(SNSQuestionnaireFragment sNSQuestionnaireFragment, C29054T c29054t) {
        ((C32300I) sNSQuestionnaireFragment.f65823a.getValue()).intent(new C32316l(c29054t));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX INFO: renamed from: f */
    public final void m71098f() {
        C28169f c28169f;
        List list = ((C28799f) ((C32300I) this.f65823a.getValue()).f65816r.getValue()).f58567b;
        int i11 = ((C28799f) ((C32300I) this.f65823a.getValue()).f65816r.getValue()).f58566a;
        if (list.isEmpty() || CollectionsKt.getOrNull(list, i11) == null) {
            Logger.DefaultImpls.e$default(C33272c.f67812a, "Questionnaire", "Skipping showPage(). Pages: " + list.size() + ", index: " + i11, null, 4, null);
            return;
        }
        C28348m viewBinding = getViewBinding();
        if (viewBinding != null) {
            FrameLayout frameLayout = viewBinding.f57767b;
            C28348m viewBinding2 = getViewBinding();
            if (viewBinding2 != null) {
                Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(viewBinding2.f57767b.getId());
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
                int id2 = frameLayout.getId();
                C28165b c28165b = C28169f.f57420o;
                String f65006c = getF65006c();
                c28165b.getClass();
                fragmentTransactionBeginTransaction.replace(id2, C28165b.m69096a("Questionnaire", f65006c));
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getLogTag() {
        return "Questionnaire";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return MapsKt.mapOf(TuplesKt.m90091to("pageIndex", Integer.valueOf(RangesKt.coerceAtLeast(((C28799f) ((C32300I) this.f65823a.getValue()).f65816r.getValue()).f58566a - 1, 0))));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32300I) this.f65823a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C28135m) {
            C28348m viewBinding = getViewBinding();
            if (viewBinding != null) {
                viewBinding.f57768c.setVisibility(0);
            }
        } else if (interfaceC28145r instanceof C32313i) {
            C28763b c28763b = this.f65825c;
            C30119M c30119m = ((C32313i) interfaceC28145r).f65837a;
            c28763b.m69589a(c30119m);
            AbstractC28133l abstractC28133l = c28763b.f58502h.f58549a;
            C30468J.f61431o.getClass();
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l, C30654y.m70415a(c30119m).forResult("REQUEST_CAMERA_PICKER"), "SNSPhotoDocumentPickerFragment2", false, 4, null);
        } else if (interfaceC28145r instanceof C32314j) {
            C28763b c28763b2 = this.f65825c;
            C30148s c30148s = ((C32314j) interfaceC28145r).f65838a;
            if (c30148s.f60586c.length == 0) {
                c30148s = new C30148s(c30148s.f60584a, c30148s.f60585b, AbstractC28441c.m69321a(getString(R$string.sns_questionnaire_mime_types)));
            }
            c28763b2.m69589a(c30148s);
            c28763b2.f58503i.m69592a(c30148s);
        }
        super.handleEvent(interfaceC28145r);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m71097a((C32320p) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_questionnarie, viewGroup, false);
        int i11 = R$id.sns_content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i11);
        if (frameLayout != null) {
            i11 = R$id.sns_continue;
            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSPrimaryButton != null) {
                i11 = R$id.sns_guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_toolbar;
                        if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                            return new C28348m((ConstraintLayout) viewInflate, frameLayout, sNSPrimaryButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public SNSQuestionnaireFragment() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.questionnaire.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSQuestionnaireFragment.m71094a(this.f65829b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32308d(new C32306c(this)));
        this.f65823a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32300I.class), new C32310e(lazy), new C32311f(lazy), function0);
        this.f65824b = new C28761a(this, new C32302a(this), new C32304b(this));
        this.f65825c = new C28763b(this, new C30067A(), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.questionnaire.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSQuestionnaireFragment.m71095a(this.f65831b, (C29054T) obj);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF65006c() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("IDDOCSETTYPE")) != null) {
            return string;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final C28348m viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57768c.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.questionnaire.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SNSQuestionnaireFragment.m71096a(this.f65826b, viewBinding, view2);
                }
            });
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d
    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k mo69614a() {
        return (C32300I) this.f65823a.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71094a(SNSQuestionnaireFragment sNSQuestionnaireFragment) {
        return new C32301J(sNSQuestionnaireFragment, sNSQuestionnaireFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), sNSQuestionnaireFragment.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28171h
    /* JADX INFO: renamed from: a */
    public final void mo69097a(AbstractC28841e0 abstractC28841e0, View view) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putParcelable("PENDING_FORM_ITEM", abstractC28841e0);
        }
        this.f65824b.m69584a(view);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: a */
    public static final void m71096a(SNSQuestionnaireFragment sNSQuestionnaireFragment, C28348m c28348m, View view) {
        C28169f c28169f;
        C28348m viewBinding = sNSQuestionnaireFragment.getViewBinding();
        if (viewBinding != null) {
            Fragment fragmentFindFragmentById = sNSQuestionnaireFragment.getChildFragmentManager().findFragmentById(viewBinding.f57767b.getId());
            if (fragmentFindFragmentById instanceof C28169f) {
                c28169f = (C28169f) fragmentFindFragmentById;
            } else {
                c28169f = null;
            }
        } else {
            c28169f = null;
        }
        boolean zM69115e = c28169f != null ? c28169f.m69115e() : false;
        C28367f.m69257a(sNSQuestionnaireFragment.getAnalyticsDelegate(), sNSQuestionnaireFragment.getF62051d(), sNSQuestionnaireFragment.getF65006c(), Control.ContinueButton, MapsKt.mapOf(TuplesKt.m90091to("pageIndex", Integer.valueOf(RangesKt.coerceAtLeast(((C28799f) ((C32300I) sNSQuestionnaireFragment.f65823a.getValue()).f65816r.getValue()).f58566a - 1, 0))), TuplesKt.m90091to("isDataValid", String.valueOf(zM69115e))), 16);
        if (zM69115e) {
            c28348m.f57768c.setVisibility(4);
            AbstractC28458h.m69339a((View) c28348m.f57768c);
            ((C32300I) sNSQuestionnaireFragment.f65823a.getValue()).intent(C32315k.f65839a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71097a(C32320p c32320p) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, "Questionnaire", "handleState: " + AbstractC28458h.m69333a(c32320p), null, 4, null);
        C28348m viewBinding = getViewBinding();
        if (viewBinding != null) {
            SNSPrimaryButton sNSPrimaryButton = viewBinding.f57768c;
            AbstractC28458h.m69341a(sNSPrimaryButton, c32320p.f65846d);
            sNSPrimaryButton.setEnabled(c32320p.f65845c);
        }
        if (c32320p.f65844b) {
            m71098f();
        }
    }
}
