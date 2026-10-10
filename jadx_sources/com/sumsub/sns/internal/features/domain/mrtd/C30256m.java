package com.sumsub.sns.internal.features.domain.mrtd;

import android.nfc.tech.IsoDep;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.nfc.C28904i;
import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.nfc.AbstractC33375d;
import com.sumsub.sns.internal.nfc.C33372a;
import com.sumsub.sns.internal.nfc.C33381j;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30256m extends AbstractC30268y {

    /* JADX INFO: renamed from: c */
    public final C28988C2 f60830c;

    @Override // com.sumsub.sns.internal.features.domain.mrtd.AbstractC30268y
    /* JADX INFO: renamed from: a */
    public final Object mo70164a(IsoDep isoDep, Function1 function1, C28904i c28904i) {
        return C41686h.m91049g(C41782z0.m91392b(), new C30255l(this, isoDep, function1, null), c28904i);
    }

    public C30256m(C28578h c28578h, C28988C2 c28988c2) {
        super((C29917M) c28578h.f58172j.getValue(), (InterfaceC29953a) c28578h.f58168f.getValue());
        this.f60830c = c28988c2;
    }

    /* JADX INFO: renamed from: a */
    public static final C33372a m70163a(C30256m c30256m, String str) {
        Object objM103844constructorimpl;
        List listEmptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str != null) {
                Map map = C33381j.f68079d;
                listEmptyList = AbstractC33375d.m71675a(str);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(!listEmptyList.isEmpty() ? new C33372a(listEmptyList, 1) : new C33372a(null, 3));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c.f67816e.f67810a.mo68955d("ReadMRTDUseCase", "Failed to parse server config", thM103847exceptionOrNullimpl);
            objM103844constructorimpl = new C33372a(null, 3);
        }
        return (C33372a) objM103844constructorimpl;
    }
}
