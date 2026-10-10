package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.exifinterface.media.ExifInterface;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28510y0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f58041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f58042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28510y0(File file, int i11, Continuation continuation) {
        super(2, continuation);
        this.f58041b = file;
        this.f58042c = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28510y0 c28510y0 = new C28510y0(this.f58041b, this.f58042c, continuation);
        c28510y0.f58040a = obj;
        return c28510y0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28510y0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapM69275a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f58040a;
        ExifInterface exifInterface = new ExifInterface(this.f58041b);
        try {
            String absolutePath = this.f58041b.getAbsolutePath();
            int i11 = this.f58042c;
            bitmapM69275a = AbstractC28385B0.m69275a(absolutePath, i11, i11);
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(interfaceC41709m0), "Error while decoding image", th2);
            bitmapM69275a = null;
        }
        if (bitmapM69275a == null) {
            return null;
        }
        if (exifInterface.getRotationDegrees() != 0) {
            int width = bitmapM69275a.getWidth();
            int height = bitmapM69275a.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate(exifInterface.getRotationDegrees());
            Unit unit = Unit.INSTANCE;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM69275a, 0, 0, width, height, matrix, true);
            bitmapM69275a.recycle();
            return bitmapCreateBitmap;
        }
        return bitmapM69275a;
    }
}
