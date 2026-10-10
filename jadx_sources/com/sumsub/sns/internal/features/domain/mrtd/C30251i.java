package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType;
import com.sumsub.sns.internal.features.data.model.common.remote.C29301X;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29655v0;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30251i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60818a;

    /* JADX INFO: renamed from: b */
    public final C30234G f60819b;

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c7 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70155a(com.sumsub.sns.internal.features.data.model.common.Document r24, com.sumsub.sns.internal.features.data.model.common.C29154m r25, java.util.ArrayList r26, p852kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.domain.mrtd.C30251i.m70155a(com.sumsub.sns.internal.features.data.model.common.Document, com.sumsub.sns.internal.features.data.model.common.m, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C30251i(C28578h c28578h) {
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue();
        C30234G c30234g = new C30234G(c28578h);
        this.f60818a = interfaceC29984m;
        this.f60819b = c30234g;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: a */
    public final Object m70157a(C29307Y0 c29307y0, Document document, boolean z11, ContinuationImpl continuationImpl) {
        C30249h c30249h;
        C30251i c30251i;
        C28988C2 c28988c2;
        int iIntValue;
        MRTDInstructionType mRTDInstructionType;
        MRTDInstructionType next;
        C29655v0 c29655v0;
        C28988C2 c28988c3;
        if (continuationImpl instanceof C30249h) {
            c30249h = (C30249h) continuationImpl;
            int i11 = c30249h.f60816e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30249h.f60816e = i11 - Integer.MIN_VALUE;
                c30251i = this;
            } else {
                c30251i = this;
                c30249h = new C30249h(c30251i, continuationImpl);
            }
        } else {
            c30251i = this;
            c30249h = new C30249h(c30251i, continuationImpl);
        }
        C30249h c30249h2 = c30249h;
        Object objM70156a = c30249h2.f60814c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30249h2.f60816e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70156a);
            C29655v0 c29655v1 = c29307y0.f59321f;
            if (c29655v1 == null) {
                return null;
            }
            String str = c29307y0.f59316a;
            if (str != null && c29307y0.f59317b != null && c29307y0.f59320e != null) {
                C33272c c33272c = C33272c.f67812a;
                Logger.DefaultImpls.d$default(c33272c, "SumSubNfc", "NfcSessionInfo: " + c29655v1, null, 4, null);
                String str2 = c29307y0.f59316a;
                String str3 = c29307y0.f59317b;
                String str4 = c29307y0.f59320e;
                String str5 = c29655v1.f59706b;
                if (str5 == null) {
                    Logger.DefaultImpls.w$default(c33272c, "SumSubNfc", "MrtdSeed is null", null, 4, null);
                    c28988c2 = null;
                } else {
                    Integer num = c29655v1.f59713i;
                    int iIntValue2 = num != null ? num.intValue() : 1;
                    Integer num2 = c29655v1.f59714j;
                    if (num2 == null) {
                        iIntValue = Integer.MAX_VALUE;
                    } else {
                        if (num2.intValue() <= 0) {
                            num2 = null;
                        }
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = Integer.MAX_VALUE;
                        }
                    }
                    int i13 = iIntValue;
                    String str6 = c29655v1.f59715k;
                    if (str6 != null) {
                        Iterator<MRTDInstructionType> it = MRTDInstructionType.getEntries().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!StringsKt.equals(next.getValue(), str6, true));
                        mRTDInstructionType = next;
                    } else {
                        mRTDInstructionType = null;
                    }
                    c28988c2 = new C28988C2(document, str2, str3, str4, z11, iIntValue2, i13, mRTDInstructionType, null, 0, str5, c29655v1.f59712h);
                }
                String str7 = c29307y0.f59316a;
                String str8 = c29307y0.f59317b;
                String str9 = c29307y0.f59320e;
                c30249h2.f60812a = c29655v1;
                c30249h2.f60813b = c28988c2;
                c30249h2.f60816e = 1;
                objM70156a = c30251i.m70156a(document, str7, str8, str9, z11, c29655v1, c30249h2);
                if (objM70156a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29655v0 = c29655v1;
                c28988c3 = c28988c2;
            } else {
                Logger.DefaultImpls.e$default(C33272c.f67812a, "SumSubNfc", "idDocType, country or imageId is null: idDocType=" + str + ", country=" + c29307y0.f59317b + ", imageId=" + c29307y0.f59320e, null, 4, null);
                return null;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28988c3 = c30249h2.f60813b;
            c29655v0 = c30249h2.f60812a;
            ResultKt.throwOnFailure(objM70156a);
        }
        C28998E2 c28998e2 = (C28998E2) objM70156a;
        if (StringsKt.equals(c29655v0.f59705a, "basic", true)) {
            if (c28988c3 != null) {
                return c28988c3.mo69716a(c28998e2, 0);
            }
            return null;
        }
        if (StringsKt.equals(c29655v0.f59705a, "kinegram", true)) {
            return c28998e2 != null ? c28998e2.mo69716a(c28988c3, 0) : c28988c3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m70156a(Document document, String str, String str2, String str3, boolean z11, C29655v0 c29655v0, ContinuationImpl continuationImpl) {
        C30245f c30245f;
        Document document2;
        C29655v0 c29655v1;
        String str4;
        boolean z12;
        String str5;
        String str6;
        Pair pair;
        int iIntValue;
        C29301X c29301x;
        if (continuationImpl instanceof C30245f) {
            c30245f = (C30245f) continuationImpl;
            int i11 = c30245f.f60801i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30245f.f60801i = i11 - Integer.MIN_VALUE;
            } else {
                c30245f = new C30245f(this, continuationImpl);
            }
        } else {
            c30245f = new C30245f(this, continuationImpl);
        }
        Object objM70045b = c30245f.f60799g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30245f.f60801i;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f60818a;
            c30245f.f60793a = document;
            c30245f.f60794b = str;
            c30245f.f60795c = str2;
            c30245f.f60796d = str3;
            c30245f.f60797e = c29655v0;
            c30245f.f60798f = z11;
            c30245f.f60801i = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c30245f);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
            document2 = document;
            c29655v1 = c29655v0;
            str4 = str2;
            z12 = z11;
            str5 = str3;
            str6 = str;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = c30245f.f60798f;
            c29655v1 = c30245f.f60797e;
            String str7 = c30245f.f60796d;
            String str8 = c30245f.f60795c;
            str6 = c30245f.f60794b;
            Document document3 = c30245f.f60793a;
            ResultKt.throwOnFailure(objM70045b);
            z12 = z13;
            str5 = str7;
            str4 = str8;
            document2 = document3;
        }
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        MRTDInstructionType mRTDInstructionType = null;
        if (c29124h == null || (c29301x = c29124h.f59086s) == null || (pair = TuplesKt.m90091to(c29301x.f59311b, c29301x.f59310a)) == null) {
            pair = new Pair(null, null);
        }
        String str9 = (String) pair.component1();
        String str10 = (String) pair.component2();
        String str11 = c29655v1.f59707c;
        String str12 = c29655v1.f59708d;
        String str13 = c29655v1.f59709e;
        String str14 = c29655v1.f59711g;
        if (str10 != null && str9 != null && str11 != null && str12 != null && str13 != null && str14 != null) {
            Integer num = c29655v1.f59713i;
            int iIntValue2 = num != null ? num.intValue() : 1;
            Integer num2 = c29655v1.f59714j;
            if (num2 == null) {
                iIntValue = Integer.MAX_VALUE;
            } else {
                if (num2.intValue() <= 0) {
                    num2 = null;
                }
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = Integer.MAX_VALUE;
                }
            }
            String str15 = c29655v1.f59715k;
            if (str15 != null) {
                for (MRTDInstructionType mRTDInstructionType2 : MRTDInstructionType.getEntries()) {
                    MRTDInstructionType mRTDInstructionType3 = mRTDInstructionType;
                    if (StringsKt.equals(mRTDInstructionType2.getValue(), str15, true)) {
                        mRTDInstructionType = mRTDInstructionType2;
                        break;
                    }
                    mRTDInstructionType = mRTDInstructionType3;
                }
                mRTDInstructionType = mRTDInstructionType;
            }
            return new C28998E2(document2, str6, str4, str5, z12, iIntValue2, iIntValue, mRTDInstructionType, null, 0, str10, str9, c29655v1.f59710f, str14, str11, str12, str13);
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m90091to("clientUrl", str10), TuplesKt.m90091to("clientId", str9), TuplesKt.m90091to("documentNumber", str11), TuplesKt.m90091to("birthDate", str12), TuplesKt.m90091to("expirationDate", str13), TuplesKt.m90091to("emrtdSessionId", str14)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((Pair) obj).getSecond() == null) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.mrtd.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C30251i.m70154a((Pair) obj2);
            }
        }, 31, null);
        Logger.DefaultImpls.w$default(C33272c.f67812a, "SumSubNfc", "Some values are missing: " + strJoinToString$default, null, 4, null);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m70154a(Pair pair) {
        return (CharSequence) pair.getFirst();
    }
}
