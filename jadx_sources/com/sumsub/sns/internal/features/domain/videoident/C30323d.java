package com.sumsub.sns.internal.features.domain.videoident;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.io.InputStream;
import java.util.Iterator;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.videoident.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30323d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60964a;

    /* JADX INFO: renamed from: b */
    public final C29917M f60965b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60966c;

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (r0 == r1) goto L47;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70187a(C29070X c29070x, String str, IdentitySide identitySide, String str2, InputStream inputStream, ContinuationImpl continuationImpl) {
        C30322c c30322c;
        String str3;
        String strM69795b;
        InputStream inputStream2;
        C29070X c29070x2;
        IdentitySide identitySide2;
        Object next;
        if (continuationImpl instanceof C30322c) {
            c30322c = (C30322c) continuationImpl;
            int i11 = c30322c.f60963h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30322c.f60963h = i11 - Integer.MIN_VALUE;
            } else {
                c30322c = new C30322c(this, continuationImpl);
            }
        } else {
            c30322c = new C30322c(this, continuationImpl);
        }
        C30322c c30322c2 = c30322c;
        Object objM70043a = c30322c2.f60961f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30322c2.f60963h;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60966c;
                c30322c2.f60956a = c29070x;
                c30322c2.f60957b = str;
                c30322c2.f60958c = identitySide;
                c30322c2.f60959d = str2;
                c30322c2.f60960e = inputStream;
                c30322c2.f60963h = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) c30322c2);
                if (objM70043a != coroutine_suspended) {
                    str3 = str;
                    strM69795b = str2;
                    inputStream2 = inputStream;
                    c29070x2 = c29070x;
                    identitySide2 = identitySide;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                InputStream inputStream3 = c30322c2.f60960e;
                strM69795b = c30322c2.f60959d;
                IdentitySide identitySide3 = c30322c2.f60958c;
                String str4 = c30322c2.f60957b;
                C29070X c29070x3 = c30322c2.f60956a;
                ResultKt.throwOnFailure(objM70043a);
                identitySide2 = identitySide3;
                c29070x2 = c29070x3;
                str3 = str4;
                inputStream2 = inputStream3;
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
            AbstractC29172p abstractC29172p = (AbstractC29172p) objM70043a;
            C29140j3 c29140j3Mo69761l = abstractC29172p.mo69761l();
            if (strM69795b == null) {
                Iterator it = c29140j3Mo69761l.f59118b.iterator();
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
            C29917M c29917m = this.f60965b;
            c30322c2.f60956a = null;
            c30322c2.f60957b = null;
            c30322c2.f60958c = null;
            c30322c2.f60959d = null;
            c30322c2.f60960e = null;
            c30322c2.f60963h = 2;
            objM70043a = ((C29914J) c29917m.f60057a).m69951a(strM69795b, inputStream2, str3, identitySide2, MapsKt.emptyMap(), c29070x2, c30322c2);
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60964a, e11)));
        }
    }

    public C30323d(InterfaceC29953a interfaceC29953a, C29917M c29917m, InterfaceC29984m interfaceC29984m) {
        this.f60964a = interfaceC29953a;
        this.f60965b = c29917m;
        this.f60966c = interfaceC29984m;
    }
}
