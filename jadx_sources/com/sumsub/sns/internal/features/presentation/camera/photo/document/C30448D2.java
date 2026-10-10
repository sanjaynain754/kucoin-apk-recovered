package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.features.presentation.utils.SecondSidePolicy;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p126ml.autocapture.AbstractC33311e;
import com.sumsub.sns.internal.p126ml.autocapture.C33307a;
import com.sumsub.sns.internal.p126ml.autocapture.C33308b;
import com.sumsub.sns.internal.p126ml.autocapture.C33310d;
import com.sumsub.sns.internal.p126ml.autocapture.C33313g;
import com.sumsub.sns.internal.p126ml.badphotos.AbstractC33315b;
import com.sumsub.sns.internal.p126ml.badphotos.AbstractC33317d;
import com.sumsub.sns.internal.p126ml.badphotos.C33316c;
import com.sumsub.sns.internal.p126ml.badphotos.C33318e;
import com.sumsub.sns.internal.p126ml.core.InterfaceC33336o;
import com.sumsub.sns.internal.p126ml.docdetector.C33353d;
import okhttp3.OkHttpClient;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.D2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30448D2 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f61382a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C33353d c33353d;
        C33310d c33310dM71632a = C33308b.m71632a();
        C33307a c33307a = c33310dM71632a.f67921j;
        C29062V c29062v = C29070X.Companion;
        String str2 = (String) savedStateHandle.get("EXTRA_DOCUMENT_TYPE");
        c29062v.getClass();
        C29070X c29070xM69739a = C29062V.m69739a(str2);
        if (!AbstractC28413P0.f57921a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SNSSession sNSSession = AbstractC28413P0.f57923c;
        C32635M c32635m = null;
        if (sNSSession == null) {
            sNSSession = null;
        }
        String url = sNSSession.getUrl();
        String str3 = (String) savedStateHandle.get("EXTRA_ONLY_ID_DOC");
        String str4 = (String) savedStateHandle.get("EXTRA_COUNTRY_CODE");
        Boolean bool = (Boolean) savedStateHandle.get("EXTRA_GALLERY_AVAILABLE");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f61382a.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f61382a.f58180r.getValue();
        C28578h c28578h = this.f61382a;
        InterfaceC33336o interfaceC33336oM71634a = AbstractC33315b.m71634a(c28578h.f58163a, (OkHttpClient) c28578h.f58148E.getValue(), url, c29070xM69739a);
        C33316c c33316c = interfaceC33336oM71634a instanceof C33316c ? (C33316c) interfaceC33336oM71634a : null;
        C33353d c33353d2 = new C33353d(this.f61382a.f58163a, (OkHttpClient) this.f61382a.f58148E.getValue(), url + "resources/sdk/embeddedModels/" + c33310dM71632a.f67921j.f67906a, c33307a);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "autocap config: inputSize=" + c33307a.f67909d + ", outputSize=" + c33307a.f67910e, null);
        Unit unit = Unit.INSTANCE;
        C33318e c33318eM71641a = AbstractC33317d.m71641a();
        C33310d c33310dM71632a2 = C33308b.m71632a();
        int i11 = C33313g.f67924f;
        C33313g c33313gM71633a = AbstractC33311e.m71633a();
        Boolean bool2 = (Boolean) savedStateHandle.get("EXTRA_IS_SEAMLESS");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = (Boolean) savedStateHandle.get("EXTRA_ALLOW_IN_PLACE_UPLOAD");
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        if (C33048a.f67488u.m71434a() && C33048a.f67438A.m71434a() && zBooleanValue3 && !zBooleanValue2 && c29070xM69739a.m69747d()) {
            Document document = (Document) savedStateHandle.get("EXTRA_DOCUMENT");
            if (document == null) {
                document = new Document(c29070xM69739a, null);
            }
            Document document2 = document;
            c33353d = c33353d2;
            c32635m = new C32635M(document2, savedStateHandle, (InterfaceC29984m) this.f61382a.f58180r.getValue(), (C30312t) this.f61382a.f58158O.getValue(), new C30067A(), new C30311s0(this.f61382a), (InterfaceC28389D0) this.f61382a.f58153J.getValue(), new C30156e((InterfaceC29953a) this.f61382a.f58168f.getValue(), (InterfaceC29984m) this.f61382a.f58180r.getValue()), new C30316a(), new C30243e(this.f61382a), new C30251i(this.f61382a), new C32662m(savedStateHandle, document2, SecondSidePolicy.AlwaysPrompt));
        } else {
            c33353d = c33353d2;
        }
        return new C30440B2(c29070xM69739a, str3, str4, zBooleanValue, interfaceC29953a, interfaceC29984m, c33316c, c33353d, c33318eM71641a, c33310dM71632a2, c33313gM71633a, savedStateHandle, c32635m);
    }

    public C30448D2(C30468J c30468j, C28578h c28578h, Bundle bundle) {
        super(c30468j, bundle);
        this.f61382a = c28578h;
    }
}
