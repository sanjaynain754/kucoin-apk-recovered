package com.sumsub.sns.internal.features.presentation.prooface;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.domain.facedetector.AbstractC28560f;
import com.sumsub.sns.internal.core.domain.facedetector.C28559e;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29157m2;
import com.sumsub.sns.internal.features.data.network.prooface.C29900o;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32210f0;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.p125ff.C33048a;
import okhttp3.OkHttpClient;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.random.Random;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.d2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32077d2 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f65285a;

    /* JADX INFO: renamed from: a */
    public static final C32074d m71024a(C32077d2 c32077d2, C29983l c29983l) {
        return new C32074d(c29983l, (InterfaceC29984m) c32077d2.f65285a.f58180r.getValue());
    }

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
        C28559e c28559e = new C28559e(C33048a.f67473f.m71434a(), C33048a.f67474g.m71434a(), Random.INSTANCE.nextLong(-100L, 100L) + 500);
        AbstractC32267d.m71078a("ViewModel: face detector config: " + c28559e);
        OkHttpClient okHttpClient = (OkHttpClient) this.f65285a.f58145B.getValue();
        String str2 = (String) savedStateHandle.get("EXTRA_ID_DOC_SET_TYPE");
        if (str2 == null) {
            str2 = C29157m2.f59150c.f59176a;
        }
        C28578h c28578h = this.f65285a;
        C32210f0 c32210f0 = new C32210f0(new C29900o(okHttpClient, str2, c28578h.f58188z, url, c28578h.f58154K), AbstractC28560f.m69423b(this.f65285a.f58163a), this.f65285a, c28559e);
        String str3 = (String) savedStateHandle.get("EXTRA_ID_DOC_SET_TYPE");
        if (str3 == null) {
            str3 = "TYPE_UNKNOWN";
        }
        return new C32072c2(savedStateHandle, new C29070X(str3), (C30034c) this.f65285a.f58167e.getValue(), (InterfaceC29953a) this.f65285a.f58168f.getValue(), (InterfaceC29984m) this.f65285a.f58180r.getValue(), c32210f0, new C32102i2((InterfaceC29984m) this.f65285a.f58180r.getValue()), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.prooface.c3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32077d2.m71024a(this.f65281b, (C29983l) obj);
            }
        }, c28559e);
    }

    public C32077d2(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, C28578h c28578h, Bundle bundle) {
        super(sNSLiveness3dFaceFragment, bundle);
        this.f65285a = c28578h;
    }
}
