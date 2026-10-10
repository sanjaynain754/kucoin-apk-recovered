package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.common.C28433a;
import com.sumsub.sns.internal.features.data.model.prooface.C29822f;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32265b;
import java.util.Arrays;
import java.util.Locale;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32230n {

    /* JADX INFO: renamed from: a */
    public final C28433a f65667a = new C28433a(Bitmap.Config.ARGB_8888);

    /* JADX INFO: renamed from: a */
    public final C29822f m71062a(ImageProxy imageProxy, float f11) {
        Object objM69280a = AbstractC28396H.m69280a(imageProxy, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.prooface.session.i1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C32230n.m71061a(this.f65637b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM69280a);
        if (thM103847exceptionOrNullimpl != null) {
            throw new IllegalStateException("Failed to convert imageProxy to bitmap", thM103847exceptionOrNullimpl);
        }
        Pair pairM71072a = AbstractC32265b.m71072a((Bitmap) objM69280a);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new C29822f(f11, ((Number) pairM71072a.getSecond()).floatValue(), String.format(Locale.ROOT, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) pairM71072a.getFirst()).intValue() & 16777215)}, 1)));
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m71061a(C32230n c32230n, int i11, int i12) {
        return c32230n.f65667a.m69317a(i11, i12);
    }
}
