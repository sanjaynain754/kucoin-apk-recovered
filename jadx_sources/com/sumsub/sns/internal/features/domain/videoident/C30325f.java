package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.utils.InterfaceC30061a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30325f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60975a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60976b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60977c;

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        if (r0 == r1) goto L48;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70188a(C29070X c29070x, String str, IdentitySide identitySide, String str2, File file, ContinuationImpl continuationImpl) {
        C30324e c30324e;
        IdentitySide identitySide2;
        String str3;
        String strM69795b;
        File file2;
        C29070X c29070x2;
        Object next;
        if (continuationImpl instanceof C30324e) {
            c30324e = (C30324e) continuationImpl;
            int i11 = c30324e.f60974h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30324e.f60974h = i11 - Integer.MIN_VALUE;
            } else {
                c30324e = new C30324e(this, continuationImpl);
            }
        } else {
            c30324e = new C30324e(this, continuationImpl);
        }
        C30324e c30324e2 = c30324e;
        Object objM70043a = c30324e2.f60972f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30324e2.f60974h;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60977c;
                c30324e2.f60967a = c29070x;
                c30324e2.f60968b = str;
                identitySide2 = identitySide;
                c30324e2.f60969c = identitySide2;
                c30324e2.f60970d = str2;
                c30324e2.f60971e = file;
                c30324e2.f60974h = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30324e2);
                if (objM70043a != coroutine_suspended) {
                    str3 = str;
                    strM69795b = str2;
                    file2 = file;
                    c29070x2 = c29070x;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                File file3 = c30324e2.f60971e;
                strM69795b = c30324e2.f60970d;
                identitySide2 = c30324e2.f60969c;
                String str4 = c30324e2.f60968b;
                C29070X c29070x3 = c30324e2.f60967a;
                ResultKt.throwOnFailure(objM70043a);
                c29070x2 = c29070x3;
                str3 = str4;
                file2 = file3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70043a);
            }
            C29307Y0 c29307y0 = (C29307Y0) objM70043a;
            if (c29307y0 != null) {
                return Result.m103844constructorimpl(c29307y0);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new SNSException.Unknown(null, 1, null)));
            IdentitySide identitySide3 = identitySide2;
            AbstractC29172p abstractC29172p = (AbstractC29172p) objM70043a;
            List list = abstractC29172p.mo69761l().f59118b;
            if (strM69795b == null) {
                Iterator it = list.iterator();
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
                if ((document == null || (strM69795b = document.getCountry()) == null) && (strM69795b = abstractC29172p.m69795b()) == null) {
                    strM69795b = "ATA";
                }
            }
            C29917M c29917m = this.f60976b;
            c30324e2.f60967a = null;
            c30324e2.f60968b = null;
            c30324e2.f60969c = null;
            c30324e2.f60970d = null;
            c30324e2.f60971e = null;
            c30324e2.f60974h = 2;
            objM70043a = ((C29914J) c29917m.f60057a).m69950a(strM69795b, file2, str3, identitySide3, MapsKt.emptyMap(), c29070x2, (InterfaceC30061a) null, c30324e2);
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60975a, e11)));
        }
    }

    public C30325f(InterfaceC29953a interfaceC29953a, C29917M c29917m, InterfaceC29984m interfaceC29984m) {
        this.f60975a = interfaceC29953a;
        this.f60976b = c29917m;
        this.f60977c = interfaceC29984m;
    }
}
