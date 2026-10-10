package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.C30104c0;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.documents.C30151v;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.features.presentation.utils.SecondSidePolicy;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31443w extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f63742a;

    /* JADX INFO: renamed from: b */
    public final PhotosAmount f63743b;

    /* JADX INFO: renamed from: c */
    public final C28578h f63744c;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C30316a c30316a = new C30316a(0);
        C31421a c31421a = new C31421a(this.f63742a, savedStateHandle, (InterfaceC29984m) this.f63744c.f58180r.getValue(), (C30312t) this.f63744c.f58158O.getValue(), new C30067A(), new C30311s0(this.f63744c), (InterfaceC28389D0) this.f63744c.f58153J.getValue(), new C30156e((InterfaceC29953a) this.f63744c.f58168f.getValue(), (InterfaceC29984m) this.f63744c.f58180r.getValue()), c30316a, new C30243e(this.f63744c), new C30251i(this.f63744c), new C32662m(savedStateHandle, this.f63742a, SecondSidePolicy.AlwaysPrompt));
        Document document = this.f63742a;
        PhotosAmount photosAmount = this.f63743b;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f63744c.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f63744c.f58180r.getValue();
        C28578h c28578h = this.f63744c;
        return new C31442v(document, photosAmount, interfaceC29953a, interfaceC29984m, c31421a, new C30151v(c28578h.f58179q), new C30104c0((C29917M) c28578h.f58172j.getValue(), (InterfaceC29984m) this.f63744c.f58180r.getValue()), this.f63744c.f58179q, c30316a);
    }

    public C31443w(Document document, PhotosAmount photosAmount, C31428h c31428h, C28578h c28578h, Bundle bundle) {
        super(c31428h, bundle);
        this.f63742a = document;
        this.f63743b = photosAmount;
        this.f63744c = c28578h;
    }
}
