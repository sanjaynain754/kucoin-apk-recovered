package com.kubi.tradefacade;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SpotKycLeadView.kt */
/* JADX INFO: loaded from: classes49.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class SpotKycLeadHelper$checkKycLead$1 extends FunctionReferenceImpl implements Function0<String> {
    public SpotKycLeadHelper$checkKycLead$1(Object obj) {
        super(0, obj, TradeFragment.class, "getTabCheckedId", "getTabCheckedId()Ljava/lang/String;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((TradeFragment) this.receiver).m63582z4();
    }
}
