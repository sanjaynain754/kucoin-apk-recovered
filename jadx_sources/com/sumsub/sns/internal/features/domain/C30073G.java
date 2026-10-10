package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29038O2;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.data.model.common.C29136j;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30073G {

    /* JADX INFO: renamed from: a */
    public final Document f60424a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60425b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60426c;

    /* JADX WARN: Code duplicated, block: B:43:0x009a A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:41:0x0092, B:43:0x009a, B:44:0x009c, B:46:0x00a0, B:49:0x00aa, B:48:0x00a8, B:19:0x003a, B:25:0x004f, B:26:0x005b, B:28:0x0061, B:32:0x0078, B:34:0x007c, B:37:0x0082, B:22:0x0041), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:41:0x0092, B:43:0x009a, B:44:0x009c, B:46:0x00a0, B:49:0x00aa, B:48:0x00a8, B:19:0x003a, B:25:0x004f, B:26:0x005b, B:28:0x0061, B:32:0x0078, B:34:0x007c, B:37:0x0082, B:22:0x0041), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70100a(ContinuationImpl continuationImpl) {
        C30072F c30072f;
        Object next;
        String str;
        AbstractC29172p abstractC29172p;
        C29038O2 c29038o2;
        Map map;
        C29046Q2 c29046q2;
        if (continuationImpl instanceof C30072F) {
            c30072f = (C30072F) continuationImpl;
            int i11 = c30072f.f60423d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30072f.f60423d = i11 - Integer.MIN_VALUE;
            } else {
                c30072f = new C30072F(this, continuationImpl);
            }
        } else {
            c30072f = new C30072F(this, continuationImpl);
        }
        Object objM70043a = c30072f.f60421b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30072f.f60423d;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60426c;
                c30072f.f60423d = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30072f);
                if (objM70043a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM70043a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC29172p = c30072f.f60420a;
                ResultKt.throwOnFailure(objM70043a);
            }
            c29038o2 = (C29038O2) objM70043a;
            C29136j c29136jMo69755f = abstractC29172p.mo69755f();
            String str2 = c29136jMo69755f != null ? c29136jMo69755f.f59101a : null;
            map = c29038o2.f58979b;
            if (map != null || (c29046q2 = (C29046Q2) map.get(str2)) == null) {
                c29046q2 = c29038o2.f58978a;
            }
            return Result.m103844constructorimpl(c29046q2);
            AbstractC29172p abstractC29172p2 = (AbstractC29172p) objM70043a;
            Iterator it = abstractC29172p2.mo69760k().f59151a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((C29154m) next).f59132a, this.f60424a.getType()));
            C29154m c29154m = (C29154m) next;
            if (c29154m == null || (str = c29154m.f59144m) == null) {
                str = C33820nf.f71144W;
            }
            C29917M c29917m = this.f60425b;
            c30072f.f60420a = abstractC29172p2;
            c30072f.f60423d = 2;
            Object objM69997a = c29917m.m69997a(str, c30072f);
            if (objM69997a != coroutine_suspended) {
                abstractC29172p = abstractC29172p2;
                objM70043a = objM69997a;
                c29038o2 = (C29038O2) objM70043a;
                C29136j c29136jMo69755f2 = abstractC29172p.mo69755f();
                if (c29136jMo69755f2 != null) {
                }
                map = c29038o2.f58979b;
                if (map != null) {
                    c29046q2 = c29038o2.f58978a;
                } else {
                    c29046q2 = c29038o2.f58978a;
                }
                return Result.m103844constructorimpl(c29046q2);
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C30073G(Document document, C29917M c29917m, InterfaceC29984m interfaceC29984m) {
        this.f60424a = document;
        this.f60425b = c29917m;
        this.f60426c = interfaceC29984m;
    }
}
