package com.sumsub.sns.internal.features.domain.ekyc;

import com.sumsub.sns.internal.core.common.AbstractC28420T0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29693s3;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29958A;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.util.Arrays;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.ekyc.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30161d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60606a;

    /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m70124a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        C30160c c30160c;
        String str4;
        String str5;
        String str6;
        C29983l c29983l;
        String str7;
        String str8;
        C29124h c29124h;
        Map map;
        String str9;
        String strM70061a;
        String strM70061a2;
        C29693s3 c29693s3;
        Map map2;
        if (continuationImpl instanceof C30160c) {
            c30160c = (C30160c) continuationImpl;
            int i11 = c30160c.f60605g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30160c.f60605g = i11 - Integer.MIN_VALUE;
            } else {
                c30160c = new C30160c(this, continuationImpl);
            }
        } else {
            c30160c = new C30160c(this, continuationImpl);
        }
        Object objM70040a = c30160c.f60603e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30160c.f60605g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70040a);
            InterfaceC29984m interfaceC29984m = this.f60606a;
            str4 = str;
            c30160c.f60599a = str4;
            str5 = str2;
            c30160c.f60600b = str5;
            str6 = str3;
            c30160c.f60601c = str6;
            c30160c.f60605g = 1;
            C29967J c29967j = (C29967J) interfaceC29984m;
            objM70040a = c29967j.m70040a(c29967j.f60204l.f60236h.getValue(), new C29958A(c29967j, null), c30160c);
            if (objM70040a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            String str10 = c30160c.f60601c;
            str5 = c30160c.f60600b;
            String str11 = c30160c.f60599a;
            ResultKt.throwOnFailure(objM70040a);
            str6 = str10;
            str4 = str11;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29983l = c30160c.f60602d;
            str8 = c30160c.f60601c;
            str5 = c30160c.f60600b;
            str7 = c30160c.f60599a;
            ResultKt.throwOnFailure(objM70040a);
        }
        c29124h = (C29124h) ((AbstractC29971N) objM70040a).m70051c();
        if (c29124h == null) {
            return null;
        }
        String strM69301a = AbstractC28420T0.m69301a(StringsKt.split$default((CharSequence) str5, new char[]{'.'}, false, 0, 6, (Object) null));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str12 = String.format("sns_ekyc_source_%s::%s", Arrays.copyOf(new Object[]{str7, strM69301a}, 2));
        map = c29124h.f59082o;
        if (map != null || (c29693s3 = (C29693s3) map.get(strM69301a)) == null || (map2 = c29693s3.f59739a) == null) {
            str9 = null;
        } else {
            str9 = (String) map2.get(str7);
        }
        strM70061a = c29983l.m70061a(str12);
        if (strM70061a != null) {
            if (strM70061a.length() <= 0) {
                strM70061a = null;
            }
            if (strM70061a != null) {
                return strM70061a;
            }
        }
        if (str9 != null || (str8 != null && str9.length() <= 0)) {
            str9 = null;
        }
        if (str9 == null) {
            return str9;
        }
        if (str8 != null || (strM70061a2 = c29983l.m70061a(str8)) == null || strM70061a2.length() <= 0) {
            return null;
        }
        return strM70061a2;
        C29983l c29983l2 = (C29983l) ((AbstractC29971N) objM70040a).m70051c();
        if (c29983l2 == null) {
            return null;
        }
        InterfaceC29984m interfaceC29984m2 = this.f60606a;
        c30160c.f60599a = str4;
        c30160c.f60600b = str5;
        c30160c.f60601c = str6;
        c30160c.f60602d = c29983l2;
        c30160c.f60605g = 2;
        Object objM70045b = ((C29967J) interfaceC29984m2).m70045b(false, c30160c);
        if (objM70045b != coroutine_suspended) {
            c29983l = c29983l2;
            objM70040a = objM70045b;
            str7 = str4;
            str8 = str6;
            c29124h = (C29124h) ((AbstractC29971N) objM70040a).m70051c();
            if (c29124h == null) {
                return null;
            }
            String strM69301a2 = AbstractC28420T0.m69301a(StringsKt.split$default((CharSequence) str5, new char[]{'.'}, false, 0, 6, (Object) null));
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str13 = String.format("sns_ekyc_source_%s::%s", Arrays.copyOf(new Object[]{str7, strM69301a2}, 2));
            map = c29124h.f59082o;
            if (map != null) {
                str9 = null;
            } else {
                str9 = null;
            }
            strM70061a = c29983l.m70061a(str13);
            if (strM70061a != null) {
                if (strM70061a.length() <= 0) {
                    strM70061a = null;
                }
                if (strM70061a != null) {
                    return strM70061a;
                }
            }
            if (str9 != null) {
                str9 = null;
            } else {
                str9 = null;
            }
            if (str9 == null) {
                return str9;
            }
            if (str8 != null) {
            }
            return null;
        }
        return coroutine_suspended;
    }

    public C30161d(InterfaceC29984m interfaceC29984m) {
        this.f60606a = interfaceC29984m;
    }
}
