package com.sumsub.sns.internal.fingerprint;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33061b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C33062c f67512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33065f f67513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C33065f f67514c;

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objM103844constructorimpl;
        Object value = ((Result) this.f67512a.f67516b.getValue()).getValue();
        if (Result.m103851isSuccessimpl(value)) {
            C33064e c33064e = (C33064e) value;
            c33064e.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayListM71552a = c33064e.f67517a.m71552a();
            int size = arrayListM71552a.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListM71552a.get(i11);
                i11++;
                linkedHashMap.putAll(((AbstractC33169s) obj).mo71462a());
            }
            value = Result.m103843boximpl(Result.m103844constructorimpl(linkedHashMap));
        }
        Object objM103844constructorimpl2 = Result.m103844constructorimpl(value);
        boolean zM103851isSuccessimpl = Result.m103851isSuccessimpl(objM103844constructorimpl2);
        if (zM103851isSuccessimpl) {
            ResultKt.throwOnFailure(objM103844constructorimpl2);
            objM103844constructorimpl = ((Result) objM103844constructorimpl2).getValue();
        } else {
            if (zM103851isSuccessimpl) {
                throw new NoWhenBranchMatchedException();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(Result.m103847exceptionOrNullimpl(objM103844constructorimpl2)));
        }
        C33065f c33065f = this.f67513b;
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) == null) {
            c33065f.invoke(objM103844constructorimpl);
        } else {
            this.f67514c.f67518a.resumeWith(Result.m103844constructorimpl(MapsKt.emptyMap()));
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public C33061b(C33062c c33062c, C33065f c33065f, C33065f c33065f2) {
        this.f67512a = c33062c;
        this.f67513b = c33065f;
        this.f67514c = c33065f2;
    }
}
