package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.base.AbstractC28542b;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29027M;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Iterator;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30223k0 extends AbstractC28542b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC29921d f60754b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60755c;

    /* JADX INFO: renamed from: a */
    public abstract Object mo70147a(AbstractC30176f0 abstractC30176f0, AbstractC29172p abstractC29172p, String str, C30221j0 c30221j0);

    /* JADX INFO: renamed from: a */
    public Object mo70148a(List list, AbstractC30176f0 abstractC30176f0, C30221j0 c30221j0) {
        return m70146a(this, list, abstractC30176f0, c30221j0);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo70149b(AbstractC30176f0 abstractC30176f0, AbstractC29172p abstractC29172p, String str, C30221j0 c30221j0);

    /* JADX WARN: Code duplicated, block: B:62:0x00d3 A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:19:0x0041, B:69:0x00f8, B:70:0x00fa, B:24:0x004b, B:65:0x00e4, B:60:0x00cf, B:62:0x00d3, B:66:0x00e7, B:32:0x0066, B:38:0x007f, B:40:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x00a2, B:49:0x00aa, B:51:0x00ae, B:53:0x00b4, B:56:0x00bc, B:35:0x006d), top: B:80:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7 A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:19:0x0041, B:69:0x00f8, B:70:0x00fa, B:24:0x004b, B:65:0x00e4, B:60:0x00cf, B:62:0x00d3, B:66:0x00e7, B:32:0x0066, B:38:0x007f, B:40:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x00a2, B:49:0x00aa, B:51:0x00ae, B:53:0x00b4, B:56:0x00bc, B:35:0x006d), top: B:80:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0112, code lost:
    
        if (r13 == r1) goto L75;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m70145a(AbstractC30223k0 abstractC30223k0, AbstractC30176f0 abstractC30176f0, ContinuationImpl continuationImpl) {
        C30221j0 c30221j0;
        AbstractC30223k0 abstractC30223k1;
        Exception e11;
        String strM69795b;
        AbstractC30176f0 abstractC30176f1;
        AbstractC29172p abstractC29172p;
        Object next;
        List list;
        if (continuationImpl instanceof C30221j0) {
            c30221j0 = (C30221j0) continuationImpl;
            int i11 = c30221j0.f60753g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30221j0.f60753g = i11 - Integer.MIN_VALUE;
            } else {
                c30221j0 = new C30221j0(abstractC30223k0, continuationImpl);
            }
        } else {
            c30221j0 = new C30221j0(abstractC30223k0, continuationImpl);
        }
        Object objM69413a = c30221j0.f60751e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30221j0.f60753g;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69413a);
                InterfaceC29984m interfaceC29984m = abstractC30223k0.f60755c;
                c30221j0.f60747a = abstractC30223k0;
                c30221j0.f60748b = abstractC30176f0;
                c30221j0.f60753g = 1;
                objM69413a = ((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) c30221j0);
                if (objM69413a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        abstractC30223k0 = c30221j0.f60747a;
                        ResultKt.throwOnFailure(objM69413a);
                        list = (List) objM69413a;
                        return new C29078Z(list);
                    }
                    if (i12 != 4) {
                        if (i12 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objM69413a);
                        return new C29074Y(objM69413a);
                    }
                    abstractC30223k0 = c30221j0.f60747a;
                    ResultKt.throwOnFailure(objM69413a);
                    list = (List) objM69413a;
                    return new C29078Z(list);
                }
                String str = c30221j0.f60750d;
                abstractC29172p = c30221j0.f60749c;
                abstractC30176f1 = c30221j0.f60748b;
                abstractC30223k1 = c30221j0.f60747a;
                try {
                    ResultKt.throwOnFailure(objM69413a);
                    strM69795b = str;
                    abstractC30223k0 = abstractC30223k1;
                    if (abstractC30176f1.f60640c) {
                        c30221j0.f60747a = abstractC30223k0;
                        c30221j0.f60748b = null;
                        c30221j0.f60749c = null;
                        c30221j0.f60750d = null;
                        c30221j0.f60753g = 3;
                        objM69413a = abstractC30223k0.mo70149b(abstractC30176f1, abstractC29172p, strM69795b, c30221j0);
                        if (objM69413a == coroutine_suspended) {
                        }
                        list = (List) objM69413a;
                        return new C29078Z(list);
                    }
                    c30221j0.f60747a = abstractC30223k0;
                    c30221j0.f60748b = null;
                    c30221j0.f60749c = null;
                    c30221j0.f60750d = null;
                    c30221j0.f60753g = 4;
                    objM69413a = abstractC30223k0.mo70147a(abstractC30176f1, abstractC29172p, strM69795b, c30221j0);
                    if (objM69413a == coroutine_suspended) {
                    }
                    list = (List) objM69413a;
                    return new C29078Z(list);
                } catch (Exception e12) {
                    e11 = e12;
                    c30221j0.f60747a = null;
                    c30221j0.f60748b = null;
                    c30221j0.f60749c = null;
                    c30221j0.f60750d = null;
                    c30221j0.f60753g = 5;
                    objM69413a = AbstractC28543c.m69413a(abstractC30223k1.f58096a, e11);
                }
                return coroutine_suspended;
            }
            abstractC30176f0 = c30221j0.f60748b;
            abstractC30223k0 = c30221j0.f60747a;
            ResultKt.throwOnFailure(objM69413a);
            AbstractC29172p abstractC29172p2 = (AbstractC29172p) objM69413a;
            List list2 = abstractC29172p2.mo69761l().f59118b;
            strM69795b = abstractC30176f0.f60639b;
            if (strM69795b == null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String country = ((Document) next).getCountry();
                    if (country != null && country.length() != 0) {
                        break;
                    }
                }
                Document document = (Document) next;
                if ((document == null || (strM69795b = document.getCountry()) == null) && (strM69795b = abstractC29172p2.m69795b()) == null) {
                    strM69795b = "ATA";
                }
            }
            c30221j0.f60747a = abstractC30223k0;
            c30221j0.f60748b = abstractC30176f0;
            c30221j0.f60749c = abstractC29172p2;
            c30221j0.f60750d = strM69795b;
            c30221j0.f60753g = 2;
            if (abstractC30223k0.mo70148a(list2, abstractC30176f0, c30221j0) != coroutine_suspended) {
                abstractC30176f1 = abstractC30176f0;
                abstractC29172p = abstractC29172p2;
                if (abstractC30176f1.f60640c) {
                    c30221j0.f60747a = abstractC30223k0;
                    c30221j0.f60748b = null;
                    c30221j0.f60749c = null;
                    c30221j0.f60750d = null;
                    c30221j0.f60753g = 3;
                    objM69413a = abstractC30223k0.mo70149b(abstractC30176f1, abstractC29172p, strM69795b, c30221j0);
                    if (objM69413a == coroutine_suspended) {
                    }
                    list = (List) objM69413a;
                    return new C29078Z(list);
                }
                c30221j0.f60747a = abstractC30223k0;
                c30221j0.f60748b = null;
                c30221j0.f60749c = null;
                c30221j0.f60750d = null;
                c30221j0.f60753g = 4;
                objM69413a = abstractC30223k0.mo70147a(abstractC30176f1, abstractC29172p, strM69795b, c30221j0);
                if (objM69413a == coroutine_suspended) {
                }
                list = (List) objM69413a;
                return new C29078Z(list);
            }
        } catch (Exception e13) {
            abstractC30223k1 = abstractC30223k0;
            e11 = e13;
        }
        return coroutine_suspended;
    }

    public AbstractC30223k0(InterfaceC29953a interfaceC29953a, InterfaceC29921d interfaceC29921d, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a);
        this.f60754b = interfaceC29921d;
        this.f60755c = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m70146a(AbstractC30223k0 abstractC30223k0, List list, AbstractC30176f0 abstractC30176f0, ContinuationImpl continuationImpl) {
        C30219i0 c30219i0;
        Object next;
        List listEmptyList;
        AbstractC30223k0 abstractC30223k1;
        Iterator it;
        C29027M result;
        if (continuationImpl instanceof C30219i0) {
            c30219i0 = (C30219i0) continuationImpl;
            int i11 = c30219i0.f60745e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30219i0.f60745e = i11 - Integer.MIN_VALUE;
            } else {
                c30219i0 = new C30219i0(abstractC30223k0, continuationImpl);
            }
        } else {
            c30219i0 = new C30219i0(abstractC30223k0, continuationImpl);
        }
        Object obj = c30219i0.f60743c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30219i0.f60745e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((Document) next).getType(), abstractC30176f0.f60638a.getType()));
                Document document = (Document) next;
                if (document == null || (result = document.getResult()) == null || (listEmptyList = result.f58970d) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Iterator it3 = listEmptyList.iterator();
                abstractC30223k1 = abstractC30223k0;
                it = it3;
            } catch (Throwable th2) {
                th = th2;
                C33272c c33272c = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(abstractC30223k0), "Pre process error", th);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c30219i0.f60742b;
            abstractC30223k1 = c30219i0.f60741a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                AbstractC30223k0 abstractC30223k2 = abstractC30223k1;
                th = th3;
                abstractC30223k0 = abstractC30223k2;
                C33272c c33272c2 = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(abstractC30223k0), "Pre process error", th);
            }
        }
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            InterfaceC29921d interfaceC29921d = abstractC30223k1.f60754b;
            c30219i0.f60741a = abstractC30223k1;
            c30219i0.f60742b = it;
            c30219i0.f60745e = 1;
            if (((C29950z) interfaceC29921d).m70007a(iIntValue, c30219i0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
