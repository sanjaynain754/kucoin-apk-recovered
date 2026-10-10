package com.sumsub.sns.internal.features.domain.mrtd;

import android.nfc.tech.IsoDep;
import com.sumsub.sns.internal.core.presentation.nfc.C28904i;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.nfc.api.SNSKinegramNfcDocumentReader;
import com.sumsub.sns.nfc.api.SNSKinegramNfcDocumentReaderFactory;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30261r extends AbstractC30268y {

    /* JADX INFO: renamed from: c */
    public final C28998E2 f60844c;

    /* JADX INFO: renamed from: d */
    public final Lazy f60845d;

    /* JADX INFO: renamed from: a */
    public static final SNSKinegramNfcDocumentReader m70167a(C30261r c30261r) {
        SNSKinegramNfcDocumentReaderFactory sNSKinegramNfcDocumentReaderFactory = SNSKinegramNfcDocumentReaderFactory.INSTANCE;
        C28998E2 c28998e2 = c30261r.f60844c;
        return sNSKinegramNfcDocumentReaderFactory.create(c28998e2.f58933k, c28998e2.f58934l, c28998e2.f58935m, new Function2() { // from class: com.sumsub.sns.internal.features.domain.mrtd.i0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C30261r.m70168a((String) obj, (Throwable) obj2);
            }
        });
    }

    public C30261r(C29917M c29917m, InterfaceC29953a interfaceC29953a, C28998E2 c28998e2) {
        super(c29917m, interfaceC29953a);
        this.f60844c = c28998e2;
        this.f60845d = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.domain.mrtd.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30261r.m70167a(this.f60817b);
            }
        });
    }

    @Override // com.sumsub.sns.internal.features.domain.mrtd.AbstractC30268y
    /* JADX INFO: renamed from: a */
    public final Object mo70164a(IsoDep isoDep, Function1 function1, C28904i c28904i) {
        return C41686h.m91049g(C41782z0.m91392b(), new C30259p(this, isoDep, function1, null), c28904i);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70168a(String str, Throwable th2) {
        C33272c.f67816e.f67810a.mo68955d("ReadMRTDUseCase", str, th2);
        return Unit.INSTANCE;
    }
}
