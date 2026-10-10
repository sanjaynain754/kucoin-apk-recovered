package com.sumsub.sns.internal.log.cacher.strategy;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.cacher.C33281i;
import com.sumsub.sns.internal.log.cacher.C33282j;
import java.io.File;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.strategy.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33288c implements InterfaceC33292g {

    /* JADX INFO: renamed from: a */
    public static final C33288c f67862a = new C33288c();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C33288c);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.log.cacher.strategy.InterfaceC33292g
    /* JADX INFO: renamed from: a */
    public final Object mo71622a(String str, C33281i c33281i, C33282j c33282j, ContinuationImpl continuationImpl) {
        C33286a c33286a;
        Function1 function1;
        String str2;
        File file;
        String name;
        if (continuationImpl instanceof C33286a) {
            c33286a = (C33286a) continuationImpl;
            int i11 = c33286a.f67859e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33286a.f67859e = i11 - Integer.MIN_VALUE;
            } else {
                c33286a = new C33286a(this, continuationImpl);
            }
        } else {
            c33286a = new C33286a(this, continuationImpl);
        }
        Object objM91049g = c33286a.f67857c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33286a.f67859e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            C41685g2 c41685g2 = C41685g2.f91735b;
            C33287b c33287b = new C33287b(c33282j, null);
            c33286a.f67855a = str;
            c33286a.f67856b = c33281i;
            c33286a.f67859e = 1;
            objM91049g = C41686h.m91049g(c41685g2, c33287b, c33286a);
            if (objM91049g != coroutine_suspended) {
            }
            function1 = c33281i;
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Function1 function2 = (Function1) c33286a.f67856b;
            str = c33286a.f67855a;
            ResultKt.throwOnFailure(objM91049g);
            function1 = function2;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) c33286a.f67856b;
            String str3 = c33286a.f67855a;
            ResultKt.throwOnFailure(objM91049g);
            str2 = str3;
        }
        if (((Boolean) objM91049g).booleanValue()) {
            if (file != null || (name = file.getName()) == null) {
                name = "unknown";
            }
            Logger.DefaultImpls.i$default(C33272c.f67812a, str2, "Wrapped sink couldn't send value - cached to " + name, null, 4, null);
        } else if (file != null) {
            Boxing.boxBoolean(file.delete());
        }
        return Unit.INSTANCE;
        function1 = c33281i;
        File file2 = (File) objM91049g;
        c33286a.f67855a = str;
        c33286a.f67856b = file2;
        c33286a.f67859e = 2;
        objM91049g = function1.invoke(c33286a);
        if (objM91049g != coroutine_suspended) {
            str2 = str;
            file = file2;
            if (((Boolean) objM91049g).booleanValue()) {
                if (file != null) {
                    name = "unknown";
                } else {
                    name = "unknown";
                }
                Logger.DefaultImpls.i$default(C33272c.f67812a, str2, "Wrapped sink couldn't send value - cached to " + name, null, 4, null);
            } else if (file != null) {
                Boxing.boxBoolean(file.delete());
            }
            return Unit.INSTANCE;
        }
        function1 = c33281i;
        return coroutine_suspended;
    }

    public final String toString() {
        return "CacheThenSendSinkStrategy";
    }

    public final int hashCode() {
        return -1731710409;
    }
}
