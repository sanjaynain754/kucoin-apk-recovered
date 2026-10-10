package com.sumsub.sns.internal.features.domain;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.domain.documents.C30128a;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33978va;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30071E {

    /* JADX INFO: renamed from: a */
    public final String f60414a;

    /* JADX INFO: renamed from: b */
    public final C30074H f60415b;

    /* JADX INFO: renamed from: c */
    public final C30216h f60416c;

    /* JADX INFO: renamed from: d */
    public final C30220j f60417d;

    /* JADX INFO: renamed from: e */
    public final C30312t f60418e;

    /* JADX INFO: renamed from: f */
    public final Function0 f60419f;

    /* JADX INFO: renamed from: a */
    public static final Map m70096a() {
        return C28468k0.f57983a.getPreferredDocumentsDefinitions();
    }

    public C30071E(C30074H c30074h, C30216h c30216h, C30220j c30220j, C30312t c30312t) {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.domain.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30071E.m70096a();
            }
        };
        this.f60414a = "DocCapture";
        this.f60415b = c30074h;
        this.f60416c = c30216h;
        this.f60417d = c30220j;
        this.f60418e = c30312t;
        this.f60419f = function0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (r11 == r1) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f8, please report this as an issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70098a(Document document, String str, ContinuationImpl continuationImpl) {
        C30070D c30070d;
        SNSDocumentDefinition sNSDocumentDefinitionM70097a;
        String country;
        Map mapM69771a;
        Object objM70143a;
        SNSDocumentDefinition sNSDocumentDefinition;
        Document document2;
        String str2;
        Iterator it;
        Object next;
        String str3;
        Object objM70180a;
        String str4;
        String str5;
        if (continuationImpl instanceof C30070D) {
            c30070d = (C30070D) continuationImpl;
            int i11 = c30070d.f60413f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30070d.f60413f = i11 - Integer.MIN_VALUE;
            } else {
                c30070d = new C30070D(this, continuationImpl);
            }
        } else {
            c30070d = new C30070D(this, continuationImpl);
        }
        Object objM70144a = c30070d.f60411d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30070d.f60413f;
        if (i12 != 0) {
            if (i12 == 1) {
                SNSDocumentDefinition sNSDocumentDefinition2 = (SNSDocumentDefinition) c30070d.f60409b;
                Document document3 = (Document) c30070d.f60408a;
                ResultKt.throwOnFailure(objM70144a);
                sNSDocumentDefinitionM70097a = sNSDocumentDefinition2;
                document = document3;
                objM70143a = objM70144a;
            } else {
                if (i12 == 2) {
                    str2 = c30070d.f60410c;
                    sNSDocumentDefinition = (SNSDocumentDefinition) c30070d.f60409b;
                    document2 = (Document) c30070d.f60408a;
                    ResultKt.throwOnFailure(objM70144a);
                    it = ((Iterable) objM70144a).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(sNSDocumentDefinition.getIdDocType(), (String) next));
                    str3 = (String) next;
                    if (str3 == null) {
                        m70099a("Can not find definition document type for country. Definition document: " + sNSDocumentDefinition.getIdDocType() + ",country: " + str2);
                        return null;
                    }
                    C30312t c30312t = this.f60418e;
                    c30070d.f60408a = str2;
                    c30070d.f60409b = str3;
                    c30070d.f60410c = null;
                    c30070d.f60413f = 3;
                    objM70180a = c30312t.m70180a(document2, str2, str3, c30070d);
                    if (objM70180a != coroutine_suspended) {
                        str4 = str2;
                        str5 = str3;
                        objM70144a = objM70180a;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (String) c30070d.f60409b;
                str4 = (String) c30070d.f60408a;
                ResultKt.throwOnFailure(objM70144a);
            }
            return new C30128a(str4, str5, (DocumentSideness) objM70144a);
        }
        ResultKt.throwOnFailure(objM70144a);
        sNSDocumentDefinitionM70097a = m70097a(document);
        if (sNSDocumentDefinitionM70097a == null) {
            m70099a("Can not get preferred definition.");
            return null;
        }
        country = sNSDocumentDefinitionM70097a.getCountry();
        C29124h c29124hM70039a = ((C29967J) this.f60415b.f60427a).m70039a();
        if (c29124hM70039a == null || (mapM69771a = AbstractC29130i.m69771a(c29124hM70039a)) == null || !(country == null || mapM69771a.containsKey(country))) {
            m70099a("Preferred definition's country is not valid. Definition country: " + country + C33978va.f72339h);
            return null;
        }
        if (country == null) {
            C30216h c30216h = this.f60416c;
            c30070d.f60408a = document;
            c30070d.f60409b = sNSDocumentDefinitionM70097a;
            c30070d.f60413f = 1;
            objM70143a = c30216h.m70143a(document, str, c30070d);
        } else {
            sNSDocumentDefinition = sNSDocumentDefinitionM70097a;
            C30220j c30220j = this.f60417d;
            c30070d.f60408a = document;
            c30070d.f60409b = sNSDocumentDefinition;
            c30070d.f60410c = country;
            c30070d.f60413f = 2;
            objM70144a = c30220j.m70144a(document, country, c30070d);
            if (objM70144a != coroutine_suspended) {
                String str6 = country;
                document2 = document;
                str2 = str6;
                it = ((Iterable) objM70144a).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(sNSDocumentDefinition.getIdDocType(), (String) next));
                str3 = (String) next;
                if (str3 == null) {
                    m70099a("Can not find definition document type for country. Definition document: " + sNSDocumentDefinition.getIdDocType() + ",country: " + str2);
                    return null;
                }
                C30312t c30312t2 = this.f60418e;
                c30070d.f60408a = str2;
                c30070d.f60409b = str3;
                c30070d.f60410c = null;
                c30070d.f60413f = 3;
                objM70180a = c30312t2.m70180a(document2, str2, str3, c30070d);
                if (objM70180a != coroutine_suspended) {
                    str4 = str2;
                    str5 = str3;
                    objM70144a = objM70180a;
                    return new C30128a(str4, str5, (DocumentSideness) objM70144a);
                }
            }
        }
        return coroutine_suspended;
        country = ((C30175f) objM70143a).f60635a;
        sNSDocumentDefinition = sNSDocumentDefinitionM70097a;
        C30220j c30220j2 = this.f60417d;
        c30070d.f60408a = document;
        c30070d.f60409b = sNSDocumentDefinition;
        c30070d.f60410c = country;
        c30070d.f60413f = 2;
        objM70144a = c30220j2.m70144a(document, country, c30070d);
        if (objM70144a != coroutine_suspended) {
            String str7 = country;
            document2 = document;
            str2 = str7;
            it = ((Iterable) objM70144a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(sNSDocumentDefinition.getIdDocType(), (String) next));
            str3 = (String) next;
            if (str3 == null) {
                m70099a("Can not find definition document type for country. Definition document: " + sNSDocumentDefinition.getIdDocType() + ",country: " + str2);
                return null;
            }
            C30312t c30312t3 = this.f60418e;
            c30070d.f60408a = str2;
            c30070d.f60409b = str3;
            c30070d.f60410c = null;
            c30070d.f60413f = 3;
            objM70180a = c30312t3.m70180a(document2, str2, str3, c30070d);
            if (objM70180a != coroutine_suspended) {
                str4 = str2;
                str5 = str3;
                objM70144a = objM70180a;
                return new C30128a(str4, str5, (DocumentSideness) objM70144a);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final SNSDocumentDefinition m70097a(Document document) {
        if (document.isSubmitted() && !document.isRejected()) {
            m70099a("Document is submitted and not rejected.");
            return null;
        }
        Map map = (Map) this.f60419f.invoke();
        m70099a("Preferred definitions=" + map);
        if (map == null) {
            m70099a("Preferred definitions are empty.");
            return null;
        }
        SNSDocumentDefinition sNSDocumentDefinition = (SNSDocumentDefinition) map.get(document.getType().f59014a);
        if (sNSDocumentDefinition != null) {
            return sNSDocumentDefinition;
        }
        m70099a("Can not find preferred definition for the document type: " + document.getType() + C33978va.f72339h);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m70099a(String str) {
        Logger.DefaultImpls.d$default(C33272c.f67816e, this.f60414a, str, null, 4, null);
    }
}
