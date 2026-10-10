package com.sumsub.sns.internal.features.presentation.prooface;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.domain.facedetector.AbstractC28560f;
import com.sumsub.sns.internal.core.domain.facedetector.C28558d;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29157m2;
import com.sumsub.sns.internal.features.data.network.prooface.C29886a;
import com.sumsub.sns.internal.features.data.network.prooface.C29900o;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.fingerprint.C33062c;
import com.sumsub.sns.internal.util.camera.C33394d;
import okhttp3.OkHttpClient;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32113l0 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f65384a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        if (!AbstractC28413P0.f57921a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SNSSession sNSSession = AbstractC28413P0.f57923c;
        if (sNSSession == null) {
            sNSSession = null;
        }
        String url = sNSSession.getUrl();
        C28558d c28558dM69423b = AbstractC28560f.m69423b(this.f65384a.f58163a);
        String str2 = (String) savedStateHandle.get("EXTRA_ID_DOC_SET_TYPE");
        if (str2 == null) {
            str2 = "TYPE_UNKNOWN";
        }
        C29070X c29070x = new C29070X(str2);
        AbstractC46162a abstractC46162a = this.f65384a.f58188z;
        C29886a c29886a = new C29886a();
        OkHttpClient okHttpClient = (OkHttpClient) this.f65384a.f58145B.getValue();
        String str3 = (String) savedStateHandle.get("EXTRA_ID_DOC_SET_TYPE");
        if (str3 == null) {
            str3 = C29157m2.f59150c.f59176a;
        }
        C28578h c28578h = this.f65384a;
        return new C32109k0(savedStateHandle, c28558dM69423b, c29070x, abstractC46162a, c29886a, new C29900o(okHttpClient, str3, c28578h.f58188z, url, c28578h.f58154K), (C30034c) this.f65384a.f58167e.getValue(), (InterfaceC29953a) this.f65384a.f58168f.getValue(), (InterfaceC29984m) this.f65384a.f58180r.getValue(), (C33062c) this.f65384a.f58186x.getValue(), (C33394d) this.f65384a.f58187y.getValue());
    }

    public C32113l0(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment, C28578h c28578h, Bundle bundle) {
        super(sNSDefaultLiveness3dFaceFragment, bundle);
        this.f65384a = c28578h;
    }
}
