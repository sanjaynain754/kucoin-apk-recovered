package com.sumsub.sns.internal.features.presentation.poa;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.C30073G;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.documents.C30151v;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.features.presentation.utils.SecondSidePolicy;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31447a extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f63748a;

    /* JADX INFO: renamed from: b */
    public final C28578h f63749b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C30316a c30316a = new C30316a();
        Document document = this.f63748a;
        C30073G c30073g = new C30073G(document, (C29917M) this.f63749b.f58172j.getValue(), (InterfaceC29984m) this.f63749b.f58180r.getValue());
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f63749b.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f63749b.f58180r.getValue();
        C32635M c32635m = new C32635M(this.f63748a, savedStateHandle, (InterfaceC29984m) this.f63749b.f58180r.getValue(), (C30312t) this.f63749b.f58158O.getValue(), new C30067A(), new C30311s0(this.f63749b), (InterfaceC28389D0) this.f63749b.f58153J.getValue(), new C30156e((InterfaceC29953a) this.f63749b.f58168f.getValue(), (InterfaceC29984m) this.f63749b.f58180r.getValue()), c30316a, new C30243e(this.f63749b), new C30251i(this.f63749b), new C32662m(savedStateHandle, this.f63748a, SecondSidePolicy.AlwaysPrompt));
        C28547d c28547d = this.f63749b.f58179q;
        return new C31472x(document, interfaceC29953a, c30073g, interfaceC29984m, new C30151v(c28547d), c32635m, c30316a, c28547d);
    }

    public C31447a(Document document, C31455g c31455g, C28578h c28578h, Bundle bundle) {
        super(c31455g, bundle);
        this.f63748a = document;
        this.f63749b = c28578h;
    }
}
