package com.sumsub.sns.internal.features.presentation.imageviewer;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import com.jumio.core.constants.ConstantsKt;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.internal.core.common.C28510y0;
import com.sumsub.sns.internal.core.common.C28513z0;
import java.io.File;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31138j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62963a;

    /* JADX INFO: renamed from: b */
    public int f62964b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f62965c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31141m f62966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31138j(C31141m c31141m, Continuation continuation) {
        super(2, continuation);
        this.f62966d = c31141m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31138j c31138j = new C31138j(this.f62966d, continuation);
        c31138j.f62965c = obj;
        return c31138j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31138j c31138j = new C31138j(this.f62966d, (Continuation) obj2);
        c31138j.f62965c = (InterfaceC41635f) obj;
        return c31138j.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L39;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        String mimeTypeFromExtension;
        int i11;
        InterfaceC41635f interfaceC41635f2;
        int i12;
        InterfaceC41635f interfaceC41635f3;
        AbstractC28081V c31135g;
        String fileExtensionFromUrl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f62964b;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i12 = this.f62963a;
                    interfaceC41635f2 = (InterfaceC41635f) this.f62965c;
                    ResultKt.throwOnFailure(obj);
                    AbstractC28081V c31135g2 = new C31135g((Bitmap) obj, this.f62966d.f62973b, i12);
                    interfaceC41635f = interfaceC41635f2;
                    c31135g = c31135g2;
                }
            } else {
                interfaceC41635f3 = (InterfaceC41635f) this.f62965c;
                ResultKt.throwOnFailure(obj);
                AbstractC28081V c31136h = new C31136h(((Number) obj).intValue(), this.f62966d.f62973b);
                interfaceC41635f = interfaceC41635f3;
                c31135g = c31136h;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41635f = (InterfaceC41635f) this.f62965c;
        File file = this.f62966d.f62973b;
        if (file != null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString())) != null) {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        } else {
            mimeTypeFromExtension = null;
        }
        Bundle bundle = this.f62966d.f62972a;
        if (bundle != null) {
            i11 = bundle.getInt("rotation", 0);
        } else {
            i11 = 0;
        }
        if (this.f62966d.f62973b == null) {
            c31135g = new C31135g(null, null, 0);
        } else if (Intrinsics.areEqual(mimeTypeFromExtension, ConstantsKt.MIME_TYPE_PDF)) {
            File file2 = this.f62966d.f62973b;
            this.f62965c = interfaceC41635f;
            this.f62964b = 1;
            Object objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28513z0(file2, null), this);
            if (objM91049g != coroutine_suspended) {
                interfaceC41635f3 = interfaceC41635f;
                obj = objM91049g;
                AbstractC28081V c31136h2 = new C31136h(((Number) obj).intValue(), this.f62966d.f62973b);
                interfaceC41635f = interfaceC41635f3;
                c31135g = c31136h2;
            }
        } else {
            File file3 = this.f62966d.f62973b;
            this.f62965c = interfaceC41635f;
            this.f62963a = i11;
            this.f62964b = 2;
            Object objM91049g2 = C41686h.m91049g(C41782z0.m91392b(), new C28510y0(file3, 1920, null), this);
            if (objM91049g2 != coroutine_suspended) {
                interfaceC41635f2 = interfaceC41635f;
                obj = objM91049g2;
                i12 = i11;
                AbstractC28081V c31135g3 = new C31135g((Bitmap) obj, this.f62966d.f62973b, i12);
                interfaceC41635f = interfaceC41635f2;
                c31135g = c31135g3;
            }
        }
        return coroutine_suspended;
        this.f62965c = null;
        this.f62964b = 3;
    }
}
