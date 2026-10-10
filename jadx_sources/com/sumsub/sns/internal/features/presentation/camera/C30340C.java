package com.sumsub.sns.internal.features.presentation.camera;

import android.os.Bundle;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28137n;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.documents.C30127V;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30340C extends AbstractC28787t {

    /* JADX INFO: renamed from: e */
    public final String f61014e;

    public C30340C(AbstractC30348K abstractC30348K) {
        super(abstractC30348K, null);
        this.f61014e = "PickerResult";
    }

    /* JADX INFO: renamed from: a */
    public final void m70201a(C28137n c28137n) {
        Object obj = c28137n.f57369b;
        C29054T c29054t = obj instanceof C29054T ? (C29054T) obj : null;
        C29015J c29015j = obj instanceof C29015J ? (C29015J) obj : null;
        C30127V c30127v = obj instanceof C30127V ? (C30127V) obj : null;
        if (c30127v != null) {
            AbstractC28133l abstractC28133l = this.f58549a;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DOCUMENT_UPLOAD_RESULT", c30127v);
            Unit unit = Unit.INSTANCE;
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l, 0, bundle, 1, null);
            return;
        }
        if (c29054t != null && c29054t.f58994a != null && c29054t.f58995b != null) {
            AbstractC28133l abstractC28133l2 = this.f58549a;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DOCUMENT_RESULT", c29054t);
            Unit unit2 = Unit.INSTANCE;
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l2, 0, bundle2, 1, null);
            return;
        }
        if (c29015j == null) {
            AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this.f58549a, null, null, null, 7, null);
            return;
        }
        AbstractC28133l abstractC28133l3 = this.f58549a;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DOCUMENT_RESULTS", c29015j);
        Unit unit3 = Unit.INSTANCE;
        AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(abstractC28133l3, 0, bundle3, 1, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61014e;
    }

    public C30340C(C30751t c30751t) {
        super(c30751t.f58549a, c30751t);
        this.f61014e = "PickerResult";
    }
}
