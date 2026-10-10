package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29145k2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30216h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60731a;

    /* JADX INFO: renamed from: b */
    public final C30220j f60732b;

    /* JADX INFO: renamed from: c */
    public final C30312t f60733c;

    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170 A[PHI: r14
      0x0170: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v7 java.lang.String) binds: [B:53:0x014c, B:65:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.sumsub.sns.internal.features.domain.documents.DocumentSideness] */
    /* JADX INFO: renamed from: a */
    public final Object m70143a(Document document, String str, ContinuationImpl continuationImpl) {
        C30188g c30188g;
        Ref.ObjectRef objectRef;
        C29124h c29124hM70039a;
        String str2;
        Document document2;
        Map map;
        String str3;
        C29124h c29124h;
        String str4;
        Ref.ObjectRef objectRef2;
        Object obj;
        C29124h c29124h2;
        Ref.ObjectRef objectRef3;
        String str5;
        String str6;
        Object obj2;
        String str7;
        Map map2;
        Set setKeySet;
        String str8;
        Object objM70144a;
        Ref.ObjectRef objectRef4;
        Object obj3;
        T t11;
        String str9;
        if (continuationImpl instanceof C30188g) {
            c30188g = (C30188g) continuationImpl;
            int i11 = c30188g.f60679i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30188g.f60679i = i11 - Integer.MIN_VALUE;
            } else {
                c30188g = new C30188g(this, continuationImpl);
            }
        } else {
            c30188g = new C30188g(this, continuationImpl);
        }
        Object obj4 = c30188g.f60677g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30188g.f60679i;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj4);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Try guess country and idDocType", null);
            objectRef = new Ref.ObjectRef();
            objectRef.element = DocumentSideness.UNKNOWN;
            c29124hM70039a = ((C29967J) this.f60731a).m70039a();
            if (c29124hM70039a != null && (map = c29124hM70039a.f59072e) != null) {
                if (map.size() != 1) {
                    map = null;
                }
                if (map != null) {
                    str3 = (String) CollectionsKt.firstOrNull(map.keySet());
                    if (str3 != null) {
                        C30220j c30220j = this.f60732b;
                        c30188g.f60671a = str;
                        c30188g.f60672b = document;
                        c30188g.f60673c = objectRef;
                        c30188g.f60674d = c29124hM70039a;
                        c30188g.f60675e = str3;
                        c30188g.f60676f = str3;
                        c30188g.f60679i = 1;
                        Object objM70144a2 = c30220j.m70144a(document, str3, c30188g);
                        if (objM70144a2 != coroutine_suspended) {
                            str2 = str;
                            document2 = document;
                            objectRef2 = objectRef;
                            obj = objM70144a2;
                            c29124h2 = c29124hM70039a;
                            str4 = str3;
                        }
                    } else {
                        c29124h = c29124hM70039a;
                        str4 = null;
                        str2 = str;
                        document2 = document;
                        if (str4 != null) {
                            str7 = str4;
                        } else {
                            c29124hM70039a = c29124h;
                            if (str2 != null) {
                                str7 = str2;
                            } else {
                                if (c29124hM70039a != null) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                }
                                if (str2 == null) {
                                    str7 = "ATA";
                                } else {
                                    str7 = str2;
                                }
                            }
                        }
                        C30220j c30220j2 = this.f60732b;
                        c30188g.f60671a = objectRef;
                        c30188g.f60672b = str7;
                        c30188g.f60673c = null;
                        c30188g.f60674d = null;
                        c30188g.f60675e = null;
                        c30188g.f60676f = null;
                        c30188g.f60679i = 4;
                        objM70144a = c30220j2.m70144a(document2, str7, c30188g);
                        if (objM70144a != coroutine_suspended) {
                            objectRef4 = objectRef;
                            obj3 = objM70144a;
                            str9 = (String) CollectionsKt.firstOrNull((List) obj3);
                            if (str9 == null) {
                                str9 = C29145k2.f59128c.f59176a;
                            }
                            return new C30175f(str7, str9, (DocumentSideness) objectRef4.element);
                        }
                    }
                }
                return coroutine_suspended;
            }
            str2 = str;
            document2 = document;
            if (str2 != null) {
                str7 = str2;
            } else {
                if (c29124hM70039a != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str7 = "ATA";
                } else {
                    str7 = str2;
                }
            }
            C30220j c30220j3 = this.f60732b;
            c30188g.f60671a = objectRef;
            c30188g.f60672b = str7;
            c30188g.f60673c = null;
            c30188g.f60674d = null;
            c30188g.f60675e = null;
            c30188g.f60676f = null;
            c30188g.f60679i = 4;
            objM70144a = c30220j3.m70144a(document2, str7, c30188g);
            if (objM70144a != coroutine_suspended) {
                objectRef4 = objectRef;
                obj3 = objM70144a;
                str9 = (String) CollectionsKt.firstOrNull((List) obj3);
                if (str9 == null) {
                    str9 = C29145k2.f59128c.f59176a;
                }
                return new C30175f(str7, str9, (DocumentSideness) objectRef4.element);
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                str6 = (String) c30188g.f60672b;
                str5 = (String) c30188g.f60671a;
                ResultKt.throwOnFailure(obj4);
                obj2 = obj4;
                return new C30175f(str6, str5, (DocumentSideness) obj2);
            }
            if (i12 == 3) {
                objectRef2 = (Ref.ObjectRef) c30188g.f60676f;
                str4 = c30188g.f60675e;
                c29124h = c30188g.f60674d;
                objectRef3 = c30188g.f60673c;
                Document document3 = (Document) c30188g.f60672b;
                String str10 = (String) c30188g.f60671a;
                ResultKt.throwOnFailure(obj4);
                document2 = document3;
                str2 = str10;
                t11 = obj4;
                objectRef2.element = t11;
                objectRef = objectRef3;
                if (str4 != null) {
                    str7 = str4;
                } else {
                    c29124hM70039a = c29124h;
                    if (str2 != null) {
                        str7 = str2;
                    } else {
                        if (c29124hM70039a != null || (map2 = c29124hM70039a.f59072e) == null || (setKeySet = map2.keySet()) == null || (str8 = (String) CollectionsKt.firstOrNull(setKeySet)) == null || StringsKt.isBlank(str8)) {
                            str2 = null;
                        } else {
                            str2 = str8;
                        }
                        if (str2 == null) {
                            str7 = "ATA";
                        } else {
                            str7 = str2;
                        }
                    }
                }
                C30220j c30220j4 = this.f60732b;
                c30188g.f60671a = objectRef;
                c30188g.f60672b = str7;
                c30188g.f60673c = null;
                c30188g.f60674d = null;
                c30188g.f60675e = null;
                c30188g.f60676f = null;
                c30188g.f60679i = 4;
                objM70144a = c30220j4.m70144a(document2, str7, c30188g);
                if (objM70144a != coroutine_suspended) {
                    objectRef4 = objectRef;
                    obj3 = objM70144a;
                }
                return coroutine_suspended;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str7 = (String) c30188g.f60672b;
            objectRef4 = (Ref.ObjectRef) c30188g.f60671a;
            ResultKt.throwOnFailure(obj4);
            obj3 = obj4;
            str9 = (String) CollectionsKt.firstOrNull((List) obj3);
            if (str9 == null) {
                str9 = C29145k2.f59128c.f59176a;
            }
            return new C30175f(str7, str9, (DocumentSideness) objectRef4.element);
        }
        String str11 = (String) c30188g.f60676f;
        str4 = c30188g.f60675e;
        C29124h c29124h3 = c30188g.f60674d;
        Ref.ObjectRef objectRef5 = c30188g.f60673c;
        document2 = (Document) c30188g.f60672b;
        str2 = (String) c30188g.f60671a;
        ResultKt.throwOnFailure(obj4);
        str3 = str11;
        objectRef2 = objectRef5;
        c29124h2 = c29124h3;
        obj = obj4;
        List list = (List) obj;
        if (list.size() == 1) {
            String str12 = (String) list.get(0);
            C30312t c30312t = this.f60733c;
            String str13 = (String) list.get(0);
            c30188g.f60671a = str12;
            c30188g.f60672b = str3;
            c30188g.f60673c = null;
            c30188g.f60674d = null;
            c30188g.f60675e = null;
            c30188g.f60676f = null;
            c30188g.f60679i = 2;
            Object objM70180a = c30312t.m70180a(document2, str3, str13, c30188g);
            if (objM70180a != coroutine_suspended) {
                str5 = str12;
                str6 = str3;
                obj2 = objM70180a;
                return new C30175f(str6, str5, (DocumentSideness) obj2);
            }
        } else {
            C30312t c30312t2 = this.f60733c;
            c30188g.f60671a = str2;
            c30188g.f60672b = document2;
            c30188g.f60673c = objectRef2;
            c30188g.f60674d = c29124h2;
            c30188g.f60675e = str4;
            c30188g.f60676f = objectRef2;
            c30188g.f60679i = 3;
            Object objM70180a2 = c30312t2.m70180a(document2, str3, (String) null, c30188g);
            if (objM70180a2 != coroutine_suspended) {
                objectRef3 = objectRef2;
                c29124h = c29124h2;
                t11 = objM70180a2;
                objectRef2.element = t11;
                objectRef = objectRef3;
                if (str4 != null) {
                    str7 = str4;
                } else {
                    c29124hM70039a = c29124h;
                    if (str2 != null) {
                        str7 = str2;
                    } else {
                        if (c29124hM70039a != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str7 = "ATA";
                        } else {
                            str7 = str2;
                        }
                    }
                }
                C30220j c30220j5 = this.f60732b;
                c30188g.f60671a = objectRef;
                c30188g.f60672b = str7;
                c30188g.f60673c = null;
                c30188g.f60674d = null;
                c30188g.f60675e = null;
                c30188g.f60676f = null;
                c30188g.f60679i = 4;
                objM70144a = c30220j5.m70144a(document2, str7, c30188g);
                if (objM70144a != coroutine_suspended) {
                    objectRef4 = objectRef;
                    obj3 = objM70144a;
                    str9 = (String) CollectionsKt.firstOrNull((List) obj3);
                    if (str9 == null) {
                        str9 = C29145k2.f59128c.f59176a;
                    }
                    return new C30175f(str7, str9, (DocumentSideness) objectRef4.element);
                }
            }
        }
        return coroutine_suspended;
    }

    public C30216h(InterfaceC29984m interfaceC29984m, C30220j c30220j, C30312t c30312t) {
        this.f60731a = interfaceC29984m;
        this.f60732b = c30220j;
        this.f60733c = c30312t;
    }
}
