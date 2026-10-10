package com.sumsub.sns.internal.core.presentation.helper;

import com.sumsub.sns.internal.core.presentation.base.adapter.C28713b;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28714c;
import com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo$Type;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29164n3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewAnswerType;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28878b {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m69664a(C29983l c29983l, String str) {
        return AbstractC29121g2.m69769a(str).m69801a(c29983l, null);
    }

    /* JADX INFO: renamed from: a */
    public static final SNSStepState m69663a(Document document) {
        if (!document.isSubmitted()) {
            return SNSStepState.INIT;
        }
        C29164n3 review = document.getReview();
        if ((review != null ? review.f59161c : null) == ReviewAnswerType.Red) {
            return SNSStepState.REJECTED;
        }
        C29164n3 review2 = document.getReview();
        if ((review2 != null ? review2.f59161c : null) == ReviewAnswerType.Green) {
            return SNSStepState.APPROVED;
        }
        if (document.isRejected()) {
            return SNSStepState.REJECTED;
        }
        if (document.isApproved()) {
            return SNSStepState.APPROVED;
        }
        if (!document.isSubmitted() && !document.isReviewing()) {
            return SNSStepState.INIT;
        }
        return SNSStepState.PENDING;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7  */
    /* JADX INFO: renamed from: a */
    public static final C28713b m69662a(final C29983l c29983l, Document document, ApplicantStatus applicantStatus, boolean z11, C28879c c28879c) {
        SNSStepState sNSStepStateM69663a;
        String strM70061a;
        C29154m c29154mM69794a;
        String str;
        String strSubstring;
        boolean z12;
        C33050a c33050a = C33048a.f67462Y;
        boolean zM71434a = c33050a.m71434a();
        int i11 = AbstractC28877a.f58720a[applicantStatus.ordinal()];
        if (i11 == 1) {
            sNSStepStateM69663a = SNSStepState.PENDING;
        } else if (i11 != 2) {
            if (i11 == 3 && !document.isSubmitted() && z11) {
                sNSStepStateM69663a = SNSStepState.REJECTED;
            } else {
                sNSStepStateM69663a = m69663a(document);
            }
        } else if (!document.isSubmitted()) {
            sNSStepStateM69663a = SNSStepState.INIT;
        } else if (document.isSubmitted() && document.isRejected()) {
            sNSStepStateM69663a = SNSStepState.REJECTED;
        } else if (!zM71434a) {
            sNSStepStateM69663a = m69663a(document);
        } else {
            sNSStepStateM69663a = SNSStepState.PENDING;
        }
        SNSStepState sNSStepState = sNSStepStateM69663a;
        boolean zM71434a2 = c33050a.m71434a();
        boolean z13 = applicantStatus == ApplicantStatus.Reviewed;
        String strM69745b = document.getType().m69745b(c29983l);
        if (applicantStatus == ApplicantStatus.Reviewing) {
            strM70061a = c29983l.m70061a("sns_iddoc_status_reviewing");
        } else if (z13 && sNSStepState == SNSStepState.REJECTED && !document.isSubmitted()) {
            strM70061a = c29983l.m70061a("sns_iddoc_status_notSubmitted");
        } else {
            String string = null;
            if ((z13 && document.isRejected()) || sNSStepState == SNSStepState.REJECTED) {
                C29164n3 review = document.getReview();
                if (review != null) {
                    String str2 = review.f59159a;
                    if (str2 != null) {
                        int lastIndex = StringsKt.getLastIndex(str2);
                        while (true) {
                            if (-1 < lastIndex) {
                                if (str2.charAt(lastIndex) != '\n') {
                                    strSubstring = str2.substring(0, lastIndex + 1);
                                    break;
                                }
                                lastIndex--;
                            } else {
                                strSubstring = "";
                                break;
                            }
                        }
                        if (strSubstring != null) {
                            string = StringsKt.trim((CharSequence) strSubstring).toString();
                        }
                    }
                    if (string != null) {
                        str = string;
                    }
                    if (sNSStepState == SNSStepState.REJECTED) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    return new C28713b(sNSStepState, strM69745b, str, z12, new C28714c(SNSDocumentViewTypeInfo$Type.DOCUMENT, document));
                }
                strM70061a = c29983l.m70061a("sns_iddoc_status_declined");
                if (strM70061a == null) {
                    strM70061a = "Rejected";
                }
            } else if ((z13 || !zM71434a2) && document.isApproved()) {
                strM70061a = c29983l.m70061a("sns_iddoc_status_approved");
            } else if (!document.isReviewing() && !document.isSubmitted()) {
                if (document.getType().m69748e()) {
                    AbstractC29172p abstractC29172p = c28879c.f58722b;
                    boolean z14 = (abstractC29172p == null || (c29154mM69794a = abstractC29172p.m69794a(document.getType())) == null || !c29154mM69794a.m69788b()) ? false : true;
                    String str3 = document.getType().f59014a;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str4 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{str3}, 1));
                    strM70061a = c29983l.m70062a(z14 ? String.format("sns_step_%s_geolocation_prompt", Arrays.copyOf(new Object[]{str3}, 1)) : str4, str4, "sns_step_defaults_prompt");
                } else {
                    List list = c28879c.f58722b.mo69760k().f59151a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (Intrinsics.areEqual(((C29154m) obj).f59132a, document.getType())) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        CollectionsKt.addAll(arrayList2, ((C29154m) obj2).f59133b);
                    }
                    String strJoinToString$default = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.helper.d
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return AbstractC28878b.m69664a(c29983l, (String) obj3);
                        }
                    }, 30, null);
                    if (Intrinsics.areEqual((Object) null, "videoident") && !StringsKt.isBlank(strJoinToString$default)) {
                        strM70061a = StringsKt.replace$default(document.getType().m69743a(c29983l).toString(), "{doctypes}", strJoinToString$default, false, 4, (Object) null);
                    } else {
                        strM70061a = document.getType().m69743a(c29983l).toString();
                    }
                }
            } else {
                strM70061a = c29983l.m70061a("sns_iddoc_status_submitted");
            }
        }
        str = strM70061a;
        if (sNSStepState == SNSStepState.REJECTED) {
            z12 = true;
        } else {
            z12 = false;
        }
        return new C28713b(sNSStepState, strM69745b, str, z12, new C28714c(SNSDocumentViewTypeInfo$Type.DOCUMENT, document));
    }
}
