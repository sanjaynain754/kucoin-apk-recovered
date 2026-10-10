package com.sumsub.sns.internal.core.common;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28513z0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58044a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f58045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28513z0(File file, Continuation continuation) {
        super(2, continuation);
        this.f58045b = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28513z0 c28513z0 = new C28513z0(this.f58045b, continuation);
        c28513z0.f58044a = obj;
        return c28513z0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28513z0 c28513z0 = new C28513z0(this.f58045b, (Continuation) obj2);
        c28513z0.f58044a = (InterfaceC41709m0) obj;
        return c28513z0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int pageCount;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f58044a;
        try {
            pageCount = new PdfRenderer(ParcelFileDescriptor.open(this.f58045b, 268435456)).getPageCount();
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(interfaceC41709m0);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, e11);
            pageCount = 0;
        }
        return Boxing.boxInt(pageCount);
    }
}
