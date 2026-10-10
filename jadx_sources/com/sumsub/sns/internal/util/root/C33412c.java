package com.sumsub.sns.internal.util.root;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.root.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33412c {

    /* JADX INFO: renamed from: a */
    public final Lazy f68123a = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.util.root.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C33412c.m71699a();
        }
    });

    /* JADX INFO: renamed from: a */
    public static final C33413d m71699a() {
        boolean z11;
        boolean zM71701a;
        boolean zM71701a2;
        C33414e c33414e = new C33414e();
        String[] strArr = c33414e.f68127b;
        int length = strArr.length;
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            }
            try {
                zM71701a2 = c33414e.m71701a(strArr[i11]);
            } catch (Exception e11) {
                C33272c.f67814c.mo68956e("SNSRootChecker", "Failed to check for root", e11);
                zM71701a2 = false;
            }
            if (zM71701a2) {
                z11 = true;
                break;
            }
            i11++;
        }
        for (String str : c33414e.f68128c) {
            try {
                zM71701a = c33414e.m71701a(str);
            } catch (Exception e12) {
                C33272c.f67814c.mo68956e("SNSRootChecker", "Failed to check for root", e12);
                zM71701a = false;
            }
            if (zM71701a) {
                z12 = true;
                break;
            }
        }
        return new C33413d(z11, z12);
    }
}
