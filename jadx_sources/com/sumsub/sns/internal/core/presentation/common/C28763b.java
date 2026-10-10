package com.sumsub.sns.internal.core.presentation.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.camera.C28730a;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30117K;
import com.sumsub.sns.internal.features.domain.documents.C30110D;
import com.sumsub.sns.internal.features.domain.documents.C30114H;
import com.sumsub.sns.internal.features.domain.documents.C30116J;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30468J;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30654y;
import com.sumsub.sns.internal.features.presentation.preview.simplepreview.C31972f;
import com.sumsub.sns.internal.features.presentation.questionnaire.SNSQuestionnaireFragment;
import java.io.File;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28763b extends AbstractC28787t {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty[] f58498l = {AbstractC28639a.m69485a(C28763b.class, "pendingRequest", "getPendingRequest()Landroid/os/Parcelable;", 0), AbstractC28639a.m69485a(C28763b.class, "pendingResult", "getPendingResult()Lcom/sumsub/sns/internal/features/data/model/common/DocumentPickerResult;", 0)};

    /* JADX INFO: renamed from: e */
    public final C30067A f58499e;

    /* JADX INFO: renamed from: f */
    public final Function1 f58500f;

    /* JADX INFO: renamed from: g */
    public final String f58501g;

    /* JADX INFO: renamed from: h */
    public final C28730a f58502h;

    /* JADX INFO: renamed from: i */
    public final C28769e f58503i;

    /* JADX INFO: renamed from: j */
    public final C28780m f58504j;

    /* JADX INFO: renamed from: k */
    public final C28780m f58505k;

    public C28763b(SNSQuestionnaireFragment sNSQuestionnaireFragment, C30067A c30067a, Function1 function1) {
        super(sNSQuestionnaireFragment, null);
        this.f58499e = c30067a;
        this.f58500f = function1;
        this.f58501g = "DocPickerWithPreview";
        this.f58502h = new C28730a(this, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.common.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28763b.m69586a(this.f58562b, (C29054T) obj);
            }
        });
        this.f58503i = new C28769e(this, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.common.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28763b.m69588b(this.f58563b, (C29054T) obj);
            }
        });
        this.f58504j = new C28780m("PENDING_DOCUMENT_PICKER_REQUEST", Parcelable.class);
        this.f58505k = new C28780m("PENDING_DOCUMENT_PICKER_RESULT", C29054T.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m69589a(Parcelable parcelable) {
        C28780m c28780m = this.f58504j;
        KProperty kProperty = f58498l[0];
        String strM69603a = m69603a(c28780m.f58534a);
        Bundle arguments = this.f58549a.getArguments();
        if (parcelable == null) {
            if (arguments != null) {
                arguments.remove(strM69603a);
            }
        } else if (arguments != null) {
            arguments.putParcelable(strM69603a, parcelable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m69588b(C28763b c28763b, C29054T c29054t) {
        C28780m c28780m = c28763b.f58505k;
        KProperty kProperty = f58498l[1];
        String strM69603a = c28763b.m69603a(c28780m.f58534a);
        Bundle arguments = c28763b.f58549a.getArguments();
        if (c29054t == null) {
            if (arguments != null) {
                arguments.remove(strM69603a);
            }
        } else if (arguments != null) {
            arguments.putParcelable(strM69603a, c29054t);
        }
        AbstractC28133l abstractC28133l = c28763b.f58549a;
        int i11 = C31972f.f65003U;
        C30110D c30110d = new C30110D(c29054t.f58995b, c29054t.f59002i, null);
        String f65006c = abstractC28133l.getF62316b();
        C31972f c31972f = new C31972f();
        c31972f.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("image_data", c30110d), TuplesKt.m90091to("doc_set_type", f65006c)));
        AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l, c31972f.forResult("REQUEST_PHOTO_VIEWER"), "SNSSimpleDocumentViewerFragment", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58501g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        this.f58549a.requireActivity().getSupportFragmentManager().setFragmentResultListener("REQUEST_PHOTO_VIEWER", this.f58549a.getViewLifecycleOwner(), new FragmentResultListener() { // from class: com.sumsub.sns.internal.core.presentation.common.a0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                C28763b.m69587a(this.f58497a, str, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69586a(C28763b c28763b, C29054T c29054t) {
        C28780m c28780m = c28763b.f58505k;
        KProperty kProperty = f58498l[1];
        String strM69603a = c28763b.m69603a(c28780m.f58534a);
        Bundle arguments = c28763b.f58549a.getArguments();
        if (c29054t == null) {
            if (arguments != null) {
                arguments.remove(strM69603a);
            }
        } else if (arguments != null) {
            arguments.putParcelable(strM69603a, c29054t);
        }
        AbstractC28133l abstractC28133l = c28763b.f58549a;
        int i11 = C31972f.f65003U;
        C30110D c30110d = new C30110D(c29054t.f58995b, c29054t.f59002i, null);
        String f65006c = abstractC28133l.getF62316b();
        C31972f c31972f = new C31972f();
        c31972f.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("image_data", c30110d), TuplesKt.m90091to("doc_set_type", f65006c)));
        AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l, c31972f.forResult("REQUEST_PHOTO_VIEWER"), "SNSSimpleDocumentViewerFragment", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69587a(C28763b c28763b, String str, Bundle bundle) {
        AbstractC30117K abstractC30117K = (AbstractC30117K) AbstractC28437b.m69320a(bundle, "result_data", AbstractC30117K.class, null);
        if (abstractC30117K instanceof C30116J) {
            Integer num = ((C30116J) abstractC30117K).f60549b;
            c28763b.m69589a((Parcelable) null);
            C28780m c28780m = c28763b.f58505k;
            KProperty[] kPropertyArr = f58498l;
            KProperty kProperty = kPropertyArr[1];
            c28780m.getClass();
            Bundle arguments = c28763b.f58549a.getArguments();
            C29054T c29054t = (C29054T) (arguments != null ? AbstractC28437b.m69320a(arguments, c28763b.m69603a(c28780m.f58534a), c28780m.f58535b, c28763b.f58549a.requireContext()) : null);
            if (c29054t == null) {
                return;
            }
            C28780m c28780m2 = c28763b.f58505k;
            KProperty kProperty2 = kPropertyArr[1];
            String strM69603a = c28763b.m69603a(c28780m2.f58534a);
            Bundle arguments2 = c28763b.f58549a.getArguments();
            if (arguments2 != null) {
                arguments2.remove(strM69603a);
            }
            File file = c29054t.f58995b;
            if (file != null && num != null) {
                c28763b.f58499e.m70094a(num.intValue(), file);
            }
            c28763b.f58500f.invoke(c29054t);
            return;
        }
        if (abstractC30117K instanceof C30114H) {
            C28780m c28780m3 = c28763b.f58505k;
            KProperty[] kPropertyArr2 = f58498l;
            KProperty kProperty3 = kPropertyArr2[1];
            String strM69603a2 = c28763b.m69603a(c28780m3.f58534a);
            Bundle arguments3 = c28763b.f58549a.getArguments();
            if (arguments3 != null) {
                arguments3.remove(strM69603a2);
            }
            C28780m c28780m4 = c28763b.f58504j;
            KProperty kProperty4 = kPropertyArr2[0];
            c28780m4.getClass();
            Bundle arguments4 = c28763b.f58549a.getArguments();
            Parcelable parcelableM69320a = arguments4 != null ? AbstractC28437b.m69320a(arguments4, c28763b.m69603a(c28780m4.f58534a), c28780m4.f58535b, c28763b.f58549a.requireContext()) : null;
            if (parcelableM69320a instanceof C30148s) {
                C30148s c30148s = (C30148s) parcelableM69320a;
                c28763b.m69589a(c30148s);
                c28763b.f58503i.m69592a(c30148s);
                return;
            } else {
                if (parcelableM69320a instanceof C30119M) {
                    C30119M c30119m = (C30119M) parcelableM69320a;
                    C30119M c30119m2 = new C30119M(c30119m.f60550a, c30119m.f60551b, c30119m.f60552c, c30119m.f60553d, c30119m.f60554e, true, c30119m.f60556g, c30119m.f60557h, c30119m.f60558i);
                    c28763b.m69589a(c30119m2);
                    AbstractC28133l abstractC28133l = c28763b.f58502h.f58549a;
                    C30468J.f61431o.getClass();
                    AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l, C30654y.m70415a(c30119m2).forResult("REQUEST_CAMERA_PICKER"), "SNSPhotoDocumentPickerFragment2", false, 4, null);
                    return;
                }
                return;
            }
        }
        c28763b.m69589a((Parcelable) null);
        C28780m c28780m5 = c28763b.f58505k;
        KProperty kProperty5 = f58498l[1];
        String strM69603a3 = c28763b.m69603a(c28780m5.f58534a);
        Bundle arguments5 = c28763b.f58549a.getArguments();
        if (arguments5 != null) {
            arguments5.remove(strM69603a3);
        }
    }
}
