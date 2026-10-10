package com.sumsub.sns.internal.features.presentation.geo;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.core.SNSCoreModule;
import com.sumsub.sns.core.SNSModule;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.android.C28705t;
import com.sumsub.sns.internal.core.presentation.android.location.AbstractC28684t;
import com.sumsub.sns.internal.core.presentation.android.location.C28676l;
import com.sumsub.sns.internal.core.presentation.android.location.C28683s;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.geo.C30198i;
import com.sumsub.sns.internal.features.domain.geo.C30207r;
import com.sumsub.sns.internal.features.domain.geo.C30210u;
import com.sumsub.sns.internal.features.domain.geo.C30213x;
import com.sumsub.sns.internal.features.domain.geo.C30215z;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.verification.C32707d;
import java.util.Map;
import java.util.Set;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.w0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31122w0 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62938a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC28498u0 f62939b;

    /* JADX INFO: renamed from: a */
    public static final C28683s m70587a(C31122w0 c31122w0, C30317b c30317b) {
        return new C28683s(AbstractC28684t.m69499a(c31122w0.f62938a.f58163a), c30317b);
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        Object obj = savedStateHandle.get("ARGS_DOCUMENT");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Document document = (Document) obj;
        final C30317b c30317b = new C30317b("SumSubGeo", new C30316a(0));
        C28578h c28578h = this.f62938a;
        C30207r c30207r = new C30207r((C29917M) c28578h.f58172j.getValue(), (InterfaceC29953a) this.f62938a.f58168f.getValue(), new C30198i(c28578h.f58188z));
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f62938a.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f62938a.f58180r.getValue();
        C30210u c30210u = new C30210u((C29917M) this.f62938a.f58172j.getValue(), (InterfaceC29953a) this.f62938a.f58168f.getValue(), (InterfaceC29984m) this.f62938a.f58180r.getValue(), c30207r);
        C30213x c30213x = new C30213x((C29917M) this.f62938a.f58172j.getValue(), (InterfaceC29953a) this.f62938a.f58168f.getValue());
        C30215z c30215z = new C30215z(document, (C29917M) this.f62938a.f58172j.getValue(), (InterfaceC29953a) this.f62938a.f58168f.getValue(), ((AbstractC31275i2) ((SNSAppActivity) this.f62939b).f63147e.getValue()).mo70635g());
        SNSModule pluggedModule = C28468k0.f57983a.getPluggedModule(SNSCoreModule.class.getName());
        SNSCoreModule sNSCoreModule = pluggedModule instanceof SNSCoreModule ? (SNSCoreModule) pluggedModule : null;
        return new C31120v0(savedStateHandle, interfaceC29953a, interfaceC29984m, c30210u, c30213x, c30215z, sNSCoreModule != null && sNSCoreModule.isSkipGeolocationForm(), new C30156e((InterfaceC29953a) this.f62938a.f58168f.getValue(), (InterfaceC29984m) this.f62938a.f58180r.getValue()), new C32707d(savedStateHandle, (Map) this.f62938a.f58161R.getValue()), document, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31122w0.m70587a(this.f62854b, c30317b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.geo.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C31122w0.m70588a(c30317b, (Set) obj2);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.geo.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31122w0.m70586a(c30317b);
            }
        });
    }

    public C31122w0(C31087g c31087g, C28578h c28578h, InterfaceC28498u0 interfaceC28498u0, Bundle bundle) {
        super(c31087g, bundle);
        this.f62938a = c28578h;
        this.f62939b = interfaceC28498u0;
    }

    /* JADX INFO: renamed from: a */
    public static final C28705t m70588a(C30317b c30317b, Set set) {
        return new C28705t(c30317b, set);
    }

    /* JADX INFO: renamed from: a */
    public static final C28676l m70586a(C30317b c30317b) {
        return new C28676l(c30317b);
    }
}
