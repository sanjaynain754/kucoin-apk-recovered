package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.core.data.model.SNSSDKState;
import java.util.Iterator;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29007H {
    /* JADX INFO: renamed from: a */
    public static final SNSSDKState m69729a(AbstractC29172p abstractC29172p, List list, ReviewStatusType reviewStatusType) {
        ReviewAnswerType reviewAnswerType;
        C29164n3 c29164n3;
        switch (AbstractC29003G.f58949a[abstractC29172p.mo69762m().f59165b.ordinal()]) {
            case 1:
                if (list.isEmpty()) {
                    return SNSSDKState.Failed.ApplicantMisconfigured.INSTANCE;
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Document) it.next()).getResult() != null) {
                            if (!list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (((Document) it2.next()).getResult() != null) {
                                        if (!list.isEmpty()) {
                                            Iterator it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                C29027M result = ((Document) it3.next()).getResult();
                                                if (result != null && (c29164n3 = result.f58967a) != null) {
                                                    reviewAnswerType = c29164n3.f59161c;
                                                } else {
                                                    reviewAnswerType = null;
                                                }
                                                if (reviewAnswerType == null) {
                                                    return SNSSDKState.Incomplete.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!list.isEmpty()) {
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    if (((Document) it4.next()).getResult() == null) {
                                        return null;
                                    }
                                }
                            }
                            return SNSSDKState.Pending.INSTANCE;
                        }
                    }
                }
                return SNSSDKState.Initial.INSTANCE;
            case 2:
            case 3:
            case 4:
                if (reviewStatusType == ReviewStatusType.Processing) {
                    return SNSSDKState.Incomplete.INSTANCE;
                }
                return SNSSDKState.Pending.INSTANCE;
            case 5:
                if (reviewStatusType == ReviewStatusType.Pending) {
                    return SNSSDKState.Incomplete.INSTANCE;
                }
                return SNSSDKState.Pending.INSTANCE;
            case 6:
                return SNSSDKState.Pending.INSTANCE;
            case 7:
                if (abstractC29172p.m69798n()) {
                    return SNSSDKState.Approved.INSTANCE;
                }
                if (abstractC29172p.m69799o()) {
                    return SNSSDKState.FinallyRejected.INSTANCE;
                }
                if (!abstractC29172p.m69800p()) {
                    return null;
                }
                return SNSSDKState.TemporarilyDeclined.INSTANCE;
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
