package com.sumsub.sns.internal.features.presentation.preview.photo.poa;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
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
import com.sumsub.sns.internal.features.domain.documents.C30149t;
import com.sumsub.sns.internal.features.domain.mrtd.C30237b;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.features.presentation.utils.SecondSidePolicy;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.poa.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31926j extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f64904a;

    /* JADX INFO: renamed from: b */
    public final C28578h f64905b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C30156e c30156e = new C30156e((InterfaceC29953a) this.f64905b.f58168f.getValue(), (InterfaceC29984m) this.f64905b.f58180r.getValue());
        Document document = this.f64904a;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f64905b.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f64905b.f58180r.getValue();
        C28578h c28578h = this.f64905b;
        return new C31925i(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c28578h.f58179q, c30156e, new C32635M(this.f64904a, savedStateHandle, (InterfaceC29984m) this.f64905b.f58180r.getValue(), (C30312t) this.f64905b.f58158O.getValue(), new C30067A(), new C30311s0(this.f64905b), (InterfaceC28389D0) this.f64905b.f58153J.getValue(), c30156e, new C30316a(), new C30243e(this.f64905b), new C30251i(this.f64905b), new C32662m(savedStateHandle, this.f64904a, SecondSidePolicy.AlwaysPrompt)), new C30237b(c28578h), new C30073G(this.f64904a, (C29917M) this.f64905b.f58172j.getValue(), (InterfaceC29984m) this.f64905b.f58180r.getValue()), new C30149t(this.f64905b.f58179q));
    }

    public C31926j(Document document, C31922f c31922f, C28578h c28578h, Bundle bundle) {
        super(c31922f, bundle);
        this.f64904a = document;
        this.f64905b = c28578h;
    }
}
