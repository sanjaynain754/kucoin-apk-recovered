package com.sumsub.sns.internal.features.presentation.utils;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.math.MathKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32668s {
    /* JADX INFO: renamed from: a */
    public static String m71291a(C29054T c29054t) {
        File file = c29054t.f58995b;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m71290a(C32668s c32668s, InterfaceC28389D0 interfaceC28389D0, Bitmap bitmap, ContinuationImpl continuationImpl) {
        C32667r c32667r;
        c32668s.getClass();
        if (continuationImpl instanceof C32667r) {
            c32667r = (C32667r) continuationImpl;
            int i11 = c32667r.f66673c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32667r.f66673c = i11 - Integer.MIN_VALUE;
            } else {
                c32667r = new C32667r(c32668s, continuationImpl);
            }
        } else {
            c32667r = new C32667r(c32668s, continuationImpl);
        }
        Object objMo69276a = c32667r.f66671a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32667r.f66673c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo69276a);
            c32667r.f66673c = 1;
            objMo69276a = interfaceC28389D0.mo69276a(bitmap, c32667r);
            if (objMo69276a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo69276a);
        }
        return Boxing.boxInt(MathKt.roundToInt(((Number) objMo69276a).intValue() / 90) * 90);
    }
}
