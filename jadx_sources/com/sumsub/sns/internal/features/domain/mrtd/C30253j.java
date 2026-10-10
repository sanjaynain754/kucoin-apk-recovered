package com.sumsub.sns.internal.features.domain.mrtd;

import android.content.Context;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28489r0;
import com.sumsub.sns.internal.core.common.C28477n0;
import com.sumsub.sns.internal.core.common.C28480o0;
import com.sumsub.sns.internal.core.common.C28483p0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30253j {

    /* JADX INFO: renamed from: a */
    public final Function0 f60820a;

    /* JADX INFO: renamed from: b */
    public final Function0 f60821b;

    /* JADX INFO: renamed from: c */
    public final Lazy f60822c;

    /* JADX INFO: renamed from: d */
    public final Lazy f60823d;

    public C30253j(Function0 function0, Function0 function1) {
        this.f60820a = function0;
        this.f60821b = function1;
        this.f60822c = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.domain.mrtd.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C30253j.m70162b(this.f60788b));
            }
        });
        this.f60823d = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.domain.mrtd.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C30253j.m70160a(this.f60792b));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70160a(C30253j c30253j) {
        return ((Boolean) c30253j.f60821b.invoke()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m70162b(C30253j c30253j) {
        boolean zM69294a = AbstractC28409N0.m69294a("com.sumsub.sns.nfc.BuildConfig");
        C33272c c33272c = C33272c.f67812a;
        Logger.DefaultImpls.d$default(c33272c, "SumSubNfc", "NFC module enabled: " + zM69294a, null, 4, null);
        Logger.DefaultImpls.d$default(c33272c, "SumSubNfc", "NFC has capability: " + m70159a((AbstractC28489r0) c30253j.f60820a.invoke()), null, 4, null);
        return zM69294a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m70159a(AbstractC28489r0 abstractC28489r0) {
        boolean z11 = Intrinsics.areEqual(abstractC28489r0, C28480o0.f58016b) || Intrinsics.areEqual(abstractC28489r0, C28477n0.f58014b);
        Logger.DefaultImpls.d$default(C33272c.f67812a, "SumSubNfc", "NFC message: " + abstractC28489r0.f58026a, null, 4, null);
        if (abstractC28489r0 instanceof C28483p0) {
            C33272c.f67814c.mo68956e("SumSubNfc", "NFC Error", ((C28483p0) abstractC28489r0).f58022b);
        }
        return z11;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m70161b(C28578h c28578h) {
        Object objM103844constructorimpl;
        Context context = c28578h.f58163a;
        try {
            Result.Companion companion = Result.INSTANCE;
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(strArr != null ? ArraysKt.contains(strArr, "android.permission.NFC") : false));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Boolean bool = (Boolean) objM103844constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public C30253j(final C28578h c28578h) {
        this(new Function0() { // from class: com.sumsub.sns.internal.features.domain.mrtd.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30253j.m70158a(c28578h);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.domain.mrtd.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C30253j.m70161b(c28578h));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC28489r0 m70158a(C28578h c28578h) {
        return AbstractC28458h.m69348b(c28578h.f58163a);
    }
}
