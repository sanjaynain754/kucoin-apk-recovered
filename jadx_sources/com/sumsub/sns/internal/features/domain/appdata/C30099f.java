package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29007H;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C29035O;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29166o;
import com.sumsub.sns.internal.features.data.model.common.C29698t3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.socket.C30050p;
import com.sumsub.sns.internal.features.data.repository.socket.InterfaceC30035a;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30099f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60508a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f60509b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30035a f60510c;

    /* JADX INFO: renamed from: d */
    public final String f60511d;

    /* JADX WARN: Code duplicated, block: B:48:0x0112 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a A[Catch: Exception -> 0x0049, PHI: r4 r8 r12 r13
      0x012a: PHI (r4v5 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType) = 
      (r4v4 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType)
      (r4v7 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType)
     binds: [B:47:0x0110, B:52:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r8v4 com.sumsub.sns.internal.features.data.model.common.p) = 
      (r8v3 com.sumsub.sns.internal.features.data.model.common.p)
      (r8v5 com.sumsub.sns.internal.features.data.model.common.p)
     binds: [B:47:0x0110, B:52:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r12v4 java.util.List) = (r12v3 java.util.List), (r12v5 java.util.List) binds: [B:47:0x0110, B:52:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r13v7 com.sumsub.sns.internal.features.data.repository.applicant.d) = 
      (r13v12 com.sumsub.sns.internal.features.data.repository.applicant.d)
      (r13v8 com.sumsub.sns.internal.features.data.repository.applicant.d)
     binds: [B:47:0x0110, B:52:0x0128] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0147 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014e A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0158 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01cf A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0208  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:16:0x0044, B:86:0x020f, B:88:0x0215, B:89:0x021c, B:23:0x0060, B:70:0x01a0, B:72:0x01a8, B:74:0x01cf, B:78:0x01e4, B:75:0x01d8, B:77:0x01dc, B:82:0x0202, B:83:0x0207, B:26:0x0075, B:53:0x012a, B:57:0x0147, B:66:0x0166, B:60:0x014e, B:61:0x0152, B:63:0x0158, B:29:0x0088, B:46:0x0102, B:48:0x0112, B:32:0x0096, B:38:0x00b1, B:40:0x00c1, B:42:0x00c5, B:35:0x009d), top: B:93:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[LOOP:0: B:61:0x0152->B:96:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m70111a(boolean z11, InterfaceC29921d interfaceC29921d, ContinuationImpl continuationImpl) {
        C30097d c30097d;
        InterfaceC29921d interfaceC29921d2;
        List list;
        InterfaceC29921d interfaceC29921d3;
        ReviewStatusType reviewStatusType;
        AbstractC29172p abstractC29172p;
        String language;
        C29950z c29950z;
        List list2;
        InterfaceC29921d interfaceC29921d4;
        List listSortedWith;
        ReviewStatusType reviewStatusType2;
        AbstractC29172p abstractC29172p2;
        List list3;
        Iterator it;
        Object objM70077a;
        List list4;
        AbstractC29172p abstractC29172p3;
        InterfaceC29921d interfaceC29921d5;
        C29166o c29166o;
        AbstractC29172p abstractC29172pM69751a;
        SNSSDKState sNSSDKStateM69729a;
        if (continuationImpl instanceof C30097d) {
            c30097d = (C30097d) continuationImpl;
            int i11 = c30097d.f60505g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30097d.f60505g = i11 - Integer.MIN_VALUE;
            } else {
                c30097d = new C30097d(this, continuationImpl);
            }
        } else {
            c30097d = new C30097d(this, continuationImpl);
        }
        Object objM70043a = c30097d.f60503e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30097d.f60505g;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60509b;
                interfaceC29921d2 = interfaceC29921d;
                c30097d.f60499a = interfaceC29921d2;
                c30097d.f60505g = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(z11, (ContinuationImpl) c30097d);
                if (objM70043a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                interfaceC29921d2 = (InterfaceC29921d) c30097d.f60499a;
                ResultKt.throwOnFailure(objM70043a);
            } else {
                if (i12 == 2) {
                    reviewStatusType = c30097d.f60502d;
                    List list5 = (List) c30097d.f60501c;
                    AbstractC29172p abstractC29172p4 = (AbstractC29172p) c30097d.f60500b;
                    InterfaceC29921d interfaceC29921d6 = (InterfaceC29921d) c30097d.f60499a;
                    ResultKt.throwOnFailure(objM70043a);
                    list = list5;
                    abstractC29172p = abstractC29172p4;
                    interfaceC29921d3 = interfaceC29921d6;
                    language = ((Locale) objM70043a).getLanguage();
                    interfaceC29921d4 = interfaceC29921d3;
                    if (!StringsKt.equals(language, abstractC29172p.mo69756g(), true)) {
                        listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
                        boolean z12 = abstractC29172p.mo69760k().f59152b;
                        if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Init) {
                            if (listSortedWith != null) {
                                it = listSortedWith.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!((Document) it.next()).isSubmitted()) {
                                        }
                                    }
                                }
                            } else {
                                it = listSortedWith.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!((Document) it.next()).isSubmitted()) {
                                        }
                                    }
                                }
                            }
                            C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": setting to 'pending'", null);
                            InterfaceC30035a interfaceC30035a = this.f60510c;
                            String str = this.f60511d;
                            C30098e c30098e = new C30098e(interfaceC29921d4, null);
                            c30097d.f60499a = abstractC29172p;
                            c30097d.f60500b = reviewStatusType;
                            c30097d.f60501c = listSortedWith;
                            c30097d.f60502d = null;
                            c30097d.f60505g = 4;
                            objM70077a = ((C30050p) interfaceC30035a).m70077a(str, c30098e, c30097d);
                            if (objM70077a != coroutine_suspended) {
                                list4 = listSortedWith;
                                objM70043a = objM70077a;
                                abstractC29172p3 = abstractC29172p;
                                if (((Boolean) objM70043a).booleanValue()) {
                                    C29166o c29166oMo69762m = abstractC29172p3.mo69762m();
                                    c29166o = new C29166o(c29166oMo69762m.f59164a, ReviewStatusType.Pending, c29166oMo69762m.f59166c, c29166oMo69762m.f59167d, c29166oMo69762m.f59168e, c29166oMo69762m.f59169f, c29166oMo69762m.f59170g, c29166oMo69762m.f59171h);
                                    if (abstractC29172p3 instanceof C29698t3) {
                                        abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p3, null, c29166o, 8159);
                                    } else {
                                        if (abstractC29172p3 instanceof C29082a) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p3, null, c29166o, 32735);
                                    }
                                    InterfaceC29984m interfaceC29984m2 = this.f60509b;
                                    c30097d.f60499a = reviewStatusType;
                                    c30097d.f60500b = list4;
                                    c30097d.f60501c = abstractC29172pM69751a;
                                    c30097d.f60505g = 5;
                                    C29967J c29967j = (C29967J) interfaceC29984m2;
                                    c29967j.f60202j.m70058a(abstractC29172pM69751a);
                                    c29967j.m70048c();
                                    if (Unit.INSTANCE != coroutine_suspended) {
                                        abstractC29172p2 = abstractC29172pM69751a;
                                        reviewStatusType2 = reviewStatusType;
                                        list3 = list4;
                                    }
                                } else {
                                    reviewStatusType2 = reviewStatusType;
                                    list3 = list4;
                                    abstractC29172p2 = abstractC29172p3;
                                }
                            }
                        }
                        reviewStatusType2 = reviewStatusType;
                        abstractC29172p2 = abstractC29172p;
                        list3 = listSortedWith;
                    } else {
                        c30097d.f60499a = interfaceC29921d3;
                        c30097d.f60500b = abstractC29172p;
                        c30097d.f60501c = list;
                        c30097d.f60502d = reviewStatusType;
                        c30097d.f60505g = 3;
                        c29950z = (C29950z) interfaceC29921d3;
                        if (c29950z.m70016a(language, c30097d) == coroutine_suspended) {
                            list2 = list;
                            interfaceC29921d5 = c29950z;
                            list = list2;
                            interfaceC29921d4 = interfaceC29921d5;
                            listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
                            boolean z13 = abstractC29172p.mo69760k().f59152b;
                            if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Init) {
                                if (listSortedWith != null) {
                                    it = listSortedWith.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (!((Document) it.next()).isSubmitted()) {
                                            }
                                        }
                                    }
                                } else {
                                    it = listSortedWith.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (!((Document) it.next()).isSubmitted()) {
                                            }
                                        }
                                    }
                                }
                                C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": setting to 'pending'", null);
                                InterfaceC30035a interfaceC30035a2 = this.f60510c;
                                String str2 = this.f60511d;
                                C30098e c30098e2 = new C30098e(interfaceC29921d4, null);
                                c30097d.f60499a = abstractC29172p;
                                c30097d.f60500b = reviewStatusType;
                                c30097d.f60501c = listSortedWith;
                                c30097d.f60502d = null;
                                c30097d.f60505g = 4;
                                objM70077a = ((C30050p) interfaceC30035a2).m70077a(str2, c30098e2, c30097d);
                                if (objM70077a != coroutine_suspended) {
                                    list4 = listSortedWith;
                                    objM70043a = objM70077a;
                                    abstractC29172p3 = abstractC29172p;
                                    if (((Boolean) objM70043a).booleanValue()) {
                                        C29166o c29166oMo69762m2 = abstractC29172p3.mo69762m();
                                        c29166o = new C29166o(c29166oMo69762m2.f59164a, ReviewStatusType.Pending, c29166oMo69762m2.f59166c, c29166oMo69762m2.f59167d, c29166oMo69762m2.f59168e, c29166oMo69762m2.f59169f, c29166oMo69762m2.f59170g, c29166oMo69762m2.f59171h);
                                        if (abstractC29172p3 instanceof C29698t3) {
                                            abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p3, null, c29166o, 8159);
                                        } else {
                                            if (abstractC29172p3 instanceof C29082a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p3, null, c29166o, 32735);
                                        }
                                        InterfaceC29984m interfaceC29984m3 = this.f60509b;
                                        c30097d.f60499a = reviewStatusType;
                                        c30097d.f60500b = list4;
                                        c30097d.f60501c = abstractC29172pM69751a;
                                        c30097d.f60505g = 5;
                                        C29967J c29967j2 = (C29967J) interfaceC29984m3;
                                        c29967j2.f60202j.m70058a(abstractC29172pM69751a);
                                        c29967j2.m70048c();
                                        if (Unit.INSTANCE != coroutine_suspended) {
                                            abstractC29172p2 = abstractC29172pM69751a;
                                            reviewStatusType2 = reviewStatusType;
                                            list3 = list4;
                                        }
                                    } else {
                                        reviewStatusType2 = reviewStatusType;
                                        list3 = list4;
                                        abstractC29172p2 = abstractC29172p3;
                                    }
                                }
                            }
                            reviewStatusType2 = reviewStatusType;
                            abstractC29172p2 = abstractC29172p;
                            list3 = listSortedWith;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i12 == 3) {
                    reviewStatusType = c30097d.f60502d;
                    list2 = (List) c30097d.f60501c;
                    abstractC29172p = (AbstractC29172p) c30097d.f60500b;
                    InterfaceC29921d interfaceC29921d7 = (InterfaceC29921d) c30097d.f60499a;
                    ResultKt.throwOnFailure(objM70043a);
                    interfaceC29921d5 = interfaceC29921d7;
                    list = list2;
                    interfaceC29921d4 = interfaceC29921d5;
                    listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
                    boolean z14 = abstractC29172p.mo69760k().f59152b;
                    if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Init && !z14) {
                        if (listSortedWith != null || !listSortedWith.isEmpty()) {
                            it = listSortedWith.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((Document) it.next()).isSubmitted()) {
                                    }
                                }
                            }
                        }
                        C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": setting to 'pending'", null);
                        InterfaceC30035a interfaceC30035a3 = this.f60510c;
                        String str3 = this.f60511d;
                        C30098e c30098e3 = new C30098e(interfaceC29921d4, null);
                        c30097d.f60499a = abstractC29172p;
                        c30097d.f60500b = reviewStatusType;
                        c30097d.f60501c = listSortedWith;
                        c30097d.f60502d = null;
                        c30097d.f60505g = 4;
                        objM70077a = ((C30050p) interfaceC30035a3).m70077a(str3, c30098e3, c30097d);
                        if (objM70077a != coroutine_suspended) {
                            list4 = listSortedWith;
                            objM70043a = objM70077a;
                            abstractC29172p3 = abstractC29172p;
                            if (((Boolean) objM70043a).booleanValue()) {
                                C29166o c29166oMo69762m3 = abstractC29172p3.mo69762m();
                                c29166o = new C29166o(c29166oMo69762m3.f59164a, ReviewStatusType.Pending, c29166oMo69762m3.f59166c, c29166oMo69762m3.f59167d, c29166oMo69762m3.f59168e, c29166oMo69762m3.f59169f, c29166oMo69762m3.f59170g, c29166oMo69762m3.f59171h);
                                if (abstractC29172p3 instanceof C29698t3) {
                                    abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p3, null, c29166o, 8159);
                                } else {
                                    if (abstractC29172p3 instanceof C29082a) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p3, null, c29166o, 32735);
                                }
                                InterfaceC29984m interfaceC29984m4 = this.f60509b;
                                c30097d.f60499a = reviewStatusType;
                                c30097d.f60500b = list4;
                                c30097d.f60501c = abstractC29172pM69751a;
                                c30097d.f60505g = 5;
                                C29967J c29967j3 = (C29967J) interfaceC29984m4;
                                c29967j3.f60202j.m70058a(abstractC29172pM69751a);
                                c29967j3.m70048c();
                                if (Unit.INSTANCE != coroutine_suspended) {
                                    abstractC29172p2 = abstractC29172pM69751a;
                                    reviewStatusType2 = reviewStatusType;
                                    list3 = list4;
                                }
                            } else {
                                reviewStatusType2 = reviewStatusType;
                                list3 = list4;
                                abstractC29172p2 = abstractC29172p3;
                            }
                        }
                        return coroutine_suspended;
                    }
                    reviewStatusType2 = reviewStatusType;
                    abstractC29172p2 = abstractC29172p;
                    list3 = listSortedWith;
                } else if (i12 == 4) {
                    List list6 = (List) c30097d.f60501c;
                    ReviewStatusType reviewStatusType3 = (ReviewStatusType) c30097d.f60500b;
                    abstractC29172p3 = (AbstractC29172p) c30097d.f60499a;
                    ResultKt.throwOnFailure(objM70043a);
                    list4 = list6;
                    reviewStatusType = reviewStatusType3;
                    if (((Boolean) objM70043a).booleanValue()) {
                        C29166o c29166oMo69762m4 = abstractC29172p3.mo69762m();
                        c29166o = new C29166o(c29166oMo69762m4.f59164a, ReviewStatusType.Pending, c29166oMo69762m4.f59166c, c29166oMo69762m4.f59167d, c29166oMo69762m4.f59168e, c29166oMo69762m4.f59169f, c29166oMo69762m4.f59170g, c29166oMo69762m4.f59171h);
                        if (abstractC29172p3 instanceof C29698t3) {
                            abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p3, null, c29166o, 8159);
                        } else {
                            if (abstractC29172p3 instanceof C29082a) {
                                throw new NoWhenBranchMatchedException();
                            }
                            abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p3, null, c29166o, 32735);
                        }
                        InterfaceC29984m interfaceC29984m5 = this.f60509b;
                        c30097d.f60499a = reviewStatusType;
                        c30097d.f60500b = list4;
                        c30097d.f60501c = abstractC29172pM69751a;
                        c30097d.f60505g = 5;
                        C29967J c29967j4 = (C29967J) interfaceC29984m5;
                        c29967j4.f60202j.m70058a(abstractC29172pM69751a);
                        c29967j4.m70048c();
                        if (Unit.INSTANCE != coroutine_suspended) {
                            abstractC29172p2 = abstractC29172pM69751a;
                            reviewStatusType2 = reviewStatusType;
                            list3 = list4;
                        }
                        return coroutine_suspended;
                    }
                    reviewStatusType2 = reviewStatusType;
                    list3 = list4;
                    abstractC29172p2 = abstractC29172p3;
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC29172p2 = (AbstractC29172p) c30097d.f60501c;
                    list3 = (List) c30097d.f60500b;
                    reviewStatusType2 = (ReviewStatusType) c30097d.f60499a;
                    ResultKt.throwOnFailure(objM70043a);
                }
            }
            sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p2, list3, reviewStatusType2);
            if (sNSSDKStateM69729a != null) {
                ((C29957e) this.f60508a).m70036a(sNSSDKStateM69729a);
            }
            C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": finished", null);
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(new C30096c(abstractC29172p2, list3, reviewStatusType2));
            AbstractC29172p abstractC29172p5 = (AbstractC29172p) objM70043a;
            list = abstractC29172p5.mo69761l().f59118b;
            C28984B3 c28984b3 = abstractC29172p5.mo69761l().f59120d;
            ReviewStatusType reviewStatusType4 = c28984b3 != null ? c28984b3.f58905a : null;
            C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": running with applicant=" + AbstractC28458h.m69333a(abstractC29172p5), null);
            InterfaceC29953a interfaceC29953a = this.f60508a;
            c30097d.f60499a = interfaceC29921d2;
            c30097d.f60500b = abstractC29172p5;
            c30097d.f60501c = list;
            c30097d.f60502d = reviewStatusType4;
            c30097d.f60505g = 2;
            ((C29957e) interfaceC29953a).getClass();
            Locale locale = C28468k0.f57987e;
            if (locale != coroutine_suspended) {
                ReviewStatusType reviewStatusType5 = reviewStatusType4;
                interfaceC29921d3 = interfaceC29921d2;
                reviewStatusType = reviewStatusType5;
                abstractC29172p = abstractC29172p5;
                objM70043a = locale;
                language = ((Locale) objM70043a).getLanguage();
                interfaceC29921d4 = interfaceC29921d3;
                if (!StringsKt.equals(language, abstractC29172p.mo69756g(), true)) {
                    listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
                    boolean z15 = abstractC29172p.mo69760k().f59152b;
                    if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Init) {
                        if (listSortedWith != null) {
                            it = listSortedWith.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((Document) it.next()).isSubmitted()) {
                                    }
                                }
                            }
                        } else {
                            it = listSortedWith.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((Document) it.next()).isSubmitted()) {
                                    }
                                }
                            }
                        }
                        C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": setting to 'pending'", null);
                        InterfaceC30035a interfaceC30035a4 = this.f60510c;
                        String str4 = this.f60511d;
                        C30098e c30098e4 = new C30098e(interfaceC29921d4, null);
                        c30097d.f60499a = abstractC29172p;
                        c30097d.f60500b = reviewStatusType;
                        c30097d.f60501c = listSortedWith;
                        c30097d.f60502d = null;
                        c30097d.f60505g = 4;
                        objM70077a = ((C30050p) interfaceC30035a4).m70077a(str4, c30098e4, c30097d);
                        if (objM70077a != coroutine_suspended) {
                            list4 = listSortedWith;
                            objM70043a = objM70077a;
                            abstractC29172p3 = abstractC29172p;
                            if (((Boolean) objM70043a).booleanValue()) {
                                C29166o c29166oMo69762m5 = abstractC29172p3.mo69762m();
                                c29166o = new C29166o(c29166oMo69762m5.f59164a, ReviewStatusType.Pending, c29166oMo69762m5.f59166c, c29166oMo69762m5.f59167d, c29166oMo69762m5.f59168e, c29166oMo69762m5.f59169f, c29166oMo69762m5.f59170g, c29166oMo69762m5.f59171h);
                                if (abstractC29172p3 instanceof C29698t3) {
                                    abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p3, null, c29166o, 8159);
                                } else {
                                    if (abstractC29172p3 instanceof C29082a) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p3, null, c29166o, 32735);
                                }
                                InterfaceC29984m interfaceC29984m6 = this.f60509b;
                                c30097d.f60499a = reviewStatusType;
                                c30097d.f60500b = list4;
                                c30097d.f60501c = abstractC29172pM69751a;
                                c30097d.f60505g = 5;
                                C29967J c29967j5 = (C29967J) interfaceC29984m6;
                                c29967j5.f60202j.m70058a(abstractC29172pM69751a);
                                c29967j5.m70048c();
                                if (Unit.INSTANCE != coroutine_suspended) {
                                    abstractC29172p2 = abstractC29172pM69751a;
                                    reviewStatusType2 = reviewStatusType;
                                    list3 = list4;
                                }
                            } else {
                                reviewStatusType2 = reviewStatusType;
                                list3 = list4;
                                abstractC29172p2 = abstractC29172p3;
                            }
                            sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p2, list3, reviewStatusType2);
                            if (sNSSDKStateM69729a != null) {
                                ((C29957e) this.f60508a).m70036a(sNSSDKStateM69729a);
                            }
                            C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": finished", null);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m103844constructorimpl(new C30096c(abstractC29172p2, list3, reviewStatusType2));
                        }
                    }
                    reviewStatusType2 = reviewStatusType;
                    abstractC29172p2 = abstractC29172p;
                    list3 = listSortedWith;
                    sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p2, list3, reviewStatusType2);
                    if (sNSSDKStateM69729a != null) {
                        ((C29957e) this.f60508a).m70036a(sNSSDKStateM69729a);
                    }
                    C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": finished", null);
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m103844constructorimpl(new C30096c(abstractC29172p2, list3, reviewStatusType2));
                }
                c30097d.f60499a = interfaceC29921d3;
                c30097d.f60500b = abstractC29172p;
                c30097d.f60501c = list;
                c30097d.f60502d = reviewStatusType;
                c30097d.f60505g = 3;
                c29950z = (C29950z) interfaceC29921d3;
                if (c29950z.m70016a(language, c30097d) == coroutine_suspended) {
                    list2 = list;
                    interfaceC29921d5 = c29950z;
                    list = list2;
                    interfaceC29921d4 = interfaceC29921d5;
                    listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
                    boolean z16 = abstractC29172p.mo69760k().f59152b;
                    if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Init) {
                        if (listSortedWith != null) {
                            it = listSortedWith.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((Document) it.next()).isSubmitted()) {
                                    }
                                }
                            }
                        } else {
                            it = listSortedWith.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((Document) it.next()).isSubmitted()) {
                                    }
                                }
                            }
                        }
                        C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": setting to 'pending'", null);
                        InterfaceC30035a interfaceC30035a5 = this.f60510c;
                        String str5 = this.f60511d;
                        C30098e c30098e5 = new C30098e(interfaceC29921d4, null);
                        c30097d.f60499a = abstractC29172p;
                        c30097d.f60500b = reviewStatusType;
                        c30097d.f60501c = listSortedWith;
                        c30097d.f60502d = null;
                        c30097d.f60505g = 4;
                        objM70077a = ((C30050p) interfaceC30035a5).m70077a(str5, c30098e5, c30097d);
                        if (objM70077a != coroutine_suspended) {
                            list4 = listSortedWith;
                            objM70043a = objM70077a;
                            abstractC29172p3 = abstractC29172p;
                            if (((Boolean) objM70043a).booleanValue()) {
                                C29166o c29166oMo69762m6 = abstractC29172p3.mo69762m();
                                c29166o = new C29166o(c29166oMo69762m6.f59164a, ReviewStatusType.Pending, c29166oMo69762m6.f59166c, c29166oMo69762m6.f59167d, c29166oMo69762m6.f59168e, c29166oMo69762m6.f59169f, c29166oMo69762m6.f59170g, c29166oMo69762m6.f59171h);
                                if (abstractC29172p3 instanceof C29698t3) {
                                    abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p3, null, c29166o, 8159);
                                } else {
                                    if (abstractC29172p3 instanceof C29082a) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p3, null, c29166o, 32735);
                                }
                                InterfaceC29984m interfaceC29984m7 = this.f60509b;
                                c30097d.f60499a = reviewStatusType;
                                c30097d.f60500b = list4;
                                c30097d.f60501c = abstractC29172pM69751a;
                                c30097d.f60505g = 5;
                                C29967J c29967j6 = (C29967J) interfaceC29984m7;
                                c29967j6.f60202j.m70058a(abstractC29172pM69751a);
                                c29967j6.m70048c();
                                if (Unit.INSTANCE != coroutine_suspended) {
                                    abstractC29172p2 = abstractC29172pM69751a;
                                    reviewStatusType2 = reviewStatusType;
                                    list3 = list4;
                                }
                            } else {
                                reviewStatusType2 = reviewStatusType;
                                list3 = list4;
                                abstractC29172p2 = abstractC29172p3;
                            }
                            sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p2, list3, reviewStatusType2);
                            if (sNSSDKStateM69729a != null) {
                                ((C29957e) this.f60508a).m70036a(sNSSDKStateM69729a);
                            }
                            C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": finished", null);
                            Result.Companion companion4 = Result.INSTANCE;
                            return Result.m103844constructorimpl(new C30096c(abstractC29172p2, list3, reviewStatusType2));
                        }
                    }
                    reviewStatusType2 = reviewStatusType;
                    abstractC29172p2 = abstractC29172p;
                    list3 = listSortedWith;
                    sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p2, list3, reviewStatusType2);
                    if (sNSSDKStateM69729a != null) {
                        ((C29957e) this.f60508a).m70036a(sNSSDKStateM69729a);
                    }
                    C33272c.f67816e.f67810a.mo68955d("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": finished", null);
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m103844constructorimpl(new C30096c(abstractC29172p2, list3, reviewStatusType2));
                }
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            C33272c.f67816e.f67810a.mo68956e("GetApplicantDataAndUpdateStatusIfNeededUseCase", this.f60511d + ": finished with error", e11);
            Result.Companion companion6 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60508a, e11)));
        }
    }

    public C30099f(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, InterfaceC30035a interfaceC30035a, String str) {
        this.f60508a = interfaceC29953a;
        this.f60509b = interfaceC29984m;
        this.f60510c = interfaceC30035a;
        this.f60511d = "GetApplUptStat_" + str;
    }
}
