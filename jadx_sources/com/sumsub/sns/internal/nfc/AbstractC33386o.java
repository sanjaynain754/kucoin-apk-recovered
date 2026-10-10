package com.sumsub.sns.internal.nfc;

import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33386o {
    /* JADX WARN: Can't wrap try/catch for region: R(4:25|29|17|18) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r7 != r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r0.f68089d = r10;
        r0.f68086a = r8;
        r0.f68087b = r9;
        r0.f68088c = r7;
        r0.f68091f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        throw r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:24:0x0062). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71683a(int i11, int i12, Function0 function0, ContinuationImpl continuationImpl) {
        C33385n c33385n;
        int i13;
        int i14;
        Function0 function1;
        int i15;
        if (continuationImpl instanceof C33385n) {
            c33385n = (C33385n) continuationImpl;
            int i16 = c33385n.f68091f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c33385n.f68091f = i16 - Integer.MIN_VALUE;
            } else {
                c33385n = new C33385n(continuationImpl);
            }
        } else {
            c33385n = new C33385n(continuationImpl);
        }
        Object obj = c33385n.f68090e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i17 = c33385n.f68091f;
        if (i17 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i11 >= 0) {
                i13 = i11;
                i14 = 0;
                function1 = function0;
                i15 = i12;
                return function1.invoke();
            }
            throw new IllegalStateException("Impossible state");
        }
        if (i17 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i14 = c33385n.f68088c;
        int i18 = c33385n.f68087b;
        int i19 = c33385n.f68086a;
        Function0 function2 = c33385n.f68089d;
        ResultKt.throwOnFailure(obj);
        i15 = i18;
        i13 = i19;
        function1 = function2;
        if (i14 != i13) {
            i14++;
            return function1.invoke();
        }
        throw new IllegalStateException("Impossible state");
    }
}
