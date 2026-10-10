package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.E2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30452E2 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f61394a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
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
        if (sNSSession == null) {
            sNSSession = null;
        }
        String url = sNSSession.getUrl();
        String str3 = (String) savedStateHandle.get("EXTRA_ONLY_ID_DOC");
        String str4 = (String) savedStateHandle.get("EXTRA_COUNTRY_CODE");
        Boolean bool = (Boolean) savedStateHandle.get("EXTRA_GALLERY_AVAILABLE");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f61394a.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f61394a.f58180r.getValue();
        C28578h c28578h = this.f61394a;
        InterfaceC33336o interfaceC33336oM71634a = AbstractC33315b.m71634a(c28578h.f58163a, (OkHttpClient) c28578h.f58148E.getValue(), url, c29070xM69739a);
        C33316c c33316c = interfaceC33336oM71634a instanceof C33316c ? (C33316c) interfaceC33336oM71634a : null;
        C33353d c33353d = new C33353d(this.f61394a.f58163a, (OkHttpClient) this.f61394a.f58148E.getValue(), url + "resources/sdk/embeddedModels/" + c33310dM71632a.f67921j.f67906a, c33307a);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "autocap config: inputSize=" + c33307a.f67909d + ", outputSize=" + c33307a.f67910e, null);
        Unit unit = Unit.INSTANCE;
        C33316c c33316c2 = c33316c;
        C33318e c33318eM71641a = AbstractC33317d.m71641a();
        C33310d c33310dM71632a2 = C33308b.m71632a();
        int i11 = C33313g.f67924f;
        return new C30444C2(c29070xM69739a, str3, str4, zBooleanValue, interfaceC29953a, interfaceC29984m, c33316c2, c33353d, c33318eM71641a, c33310dM71632a2, AbstractC33311e.m71633a(), savedStateHandle);
    }

    public C30452E2(C30471K c30471k, C28578h c28578h, Bundle bundle) {
        super(c30471k, bundle);
        this.f61394a = c28578h;
    }
}
