package com.sumsub.sns.internal.features.presentation.preview.simplepreview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.jumio.core.constants.ConstantsKt;
import com.sumsub.sns.internal.core.common.AbstractC28385B0;
import com.sumsub.sns.internal.core.common.C28510y0;
import java.io.File;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.simplepreview.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31975i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31977k f65012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31975i(C31977k c31977k, Continuation continuation) {
        super(2, continuation);
        this.f65012b = c31977k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31975i(this.f65012b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31975i(this.f65012b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String mimeTypeFromExtension;
        String fileExtensionFromUrl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65011a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            File file = this.f65012b.f65017a.f60542a;
            if (file != null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString())) != null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            } else {
                mimeTypeFromExtension = null;
            }
            if (Intrinsics.areEqual(mimeTypeFromExtension, ConstantsKt.MIME_TYPE_PDF)) {
                return AbstractC28385B0.m69274a(this.f65012b.f65017a.f60542a, 1920, 0);
            }
            File file2 = this.f65012b.f65017a.f60542a;
            if (file2 == null) {
                return null;
            }
            this.f65011a = 1;
            obj = C41686h.m91049g(C41782z0.m91392b(), new C28510y0(file2, 1920, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return (Bitmap) obj;
    }
}
