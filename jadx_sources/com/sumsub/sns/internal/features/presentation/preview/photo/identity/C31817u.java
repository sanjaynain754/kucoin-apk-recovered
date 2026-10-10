package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.C30071E;
import com.sumsub.sns.internal.features.domain.C30074H;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30216h;
import com.sumsub.sns.internal.features.domain.C30220j;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.documents.C30150u;
import com.sumsub.sns.internal.features.domain.mrtd.C30237b;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.features.presentation.utils.SecondSidePolicy;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31817u extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f64653a;

    /* JADX INFO: renamed from: b */
    public final C28578h f64654b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C30156e c30156e = new C30156e((InterfaceC29953a) this.f64654b.f58168f.getValue(), (InterfaceC29984m) this.f64654b.f58180r.getValue());
        C30071E c30071e = new C30071E(new C30074H((InterfaceC29984m) this.f64654b.f58180r.getValue()), (C30216h) this.f64654b.f58160Q.getValue(), (C30220j) this.f64654b.f58159P.getValue(), (C30312t) this.f64654b.f58158O.getValue());
        C31801e c31801e = new C31801e(this.f64653a, savedStateHandle, (InterfaceC29984m) this.f64654b.f58180r.getValue(), (C30312t) this.f64654b.f58158O.getValue(), new C30067A(), new C30311s0(this.f64654b), (InterfaceC28389D0) this.f64654b.f58153J.getValue(), c30156e, new C30243e(this.f64654b), new C30251i(this.f64654b), (C30216h) this.f64654b.f58160Q.getValue(), c30071e, new C30316a(), new C32662m(savedStateHandle, this.f64653a, SecondSidePolicy.AlwaysPrompt));
        Document document = this.f64653a;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f64654b.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f64654b.f58180r.getValue();
        C28578h c28578h = this.f64654b;
        C28547d c28547d = c28578h.f58179q;
        return new C31816t(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c28547d, c30156e, new C30237b(c28578h), c31801e, new C30150u(c31801e, c28547d));
    }

    public C31817u(Document document, C31808l c31808l, C28578h c28578h, Bundle bundle) {
        super(c31808l, bundle);
        this.f64653a = document;
        this.f64654b = c28578h;
    }
}
