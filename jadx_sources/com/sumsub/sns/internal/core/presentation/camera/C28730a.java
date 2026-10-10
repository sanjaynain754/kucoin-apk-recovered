package com.sumsub.sns.internal.core.presentation.camera;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28121h;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28763b;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28730a extends AbstractC28787t {

    /* JADX INFO: renamed from: e */
    public final Function1 f58421e;

    /* JADX INFO: renamed from: f */
    public final String f58422f;

    public C28730a(C28763b c28763b, Function1 function1) {
        super(c28763b.f58549a, c28763b);
        this.f58421e = function1;
        this.f58422f = "CameraPicker";
    }

    /* JADX INFO: renamed from: a */
    public static final void m69554a(C28730a c28730a, String str, Bundle bundle) {
        List list;
        C29054T c29054t;
        AbstractC28133l.Companion.getClass();
        if (C28121h.m69079a(bundle)) {
            C29054T c29054t2 = (C29054T) AbstractC28437b.m69320a(bundle, "DOCUMENT_RESULT", C29054T.class, null);
            C29015J c29015j = (C29015J) AbstractC28437b.m69320a(bundle, "DOCUMENT_RESULTS", C29015J.class, null);
            if (c29015j != null && (list = c29015j.f58957a) != null && (c29054t = (C29054T) CollectionsKt.firstOrNull(list)) != null) {
                c29054t2 = c29054t;
            }
            if (c29054t2 != null) {
                c28730a.f58421e.invoke(c29054t2);
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58422f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        this.f58549a.requireActivity().getSupportFragmentManager().setFragmentResultListener("REQUEST_CAMERA_PICKER", this.f58549a.getViewLifecycleOwner(), new FragmentResultListener() { // from class: com.sumsub.sns.internal.core.presentation.camera.y
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                C28730a.m69554a(this.f58491a, str, bundle);
            }
        });
    }
}
