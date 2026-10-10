package com.sumsub.sns.internal.core.exception;

import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.log.cacher.C33284l;
import com.tencent.bugly.proguard.C33844oi;
import java.io.PrintWriter;
import java.io.StringWriter;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28619d implements InterfaceC28620e {

    /* JADX INFO: renamed from: a */
    public final C33284l f58237a;

    @Override // com.sumsub.sns.internal.core.exception.InterfaceC28620e
    /* JADX INFO: renamed from: a */
    public final Object mo69475a(Thread thread, Throwable th2, String str, C28621f c28621f) {
        Object objSend = this.f58237a.send(m69474a(str, th2), c28621f);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    public C28619d(C33284l c33284l) {
        this.f58237a = c33284l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    /* JADX INFO: renamed from: a */
    public static LogParams m69474a(String str, Throwable th2) {
        String str2;
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(th2.getStackTrace());
        if (stackTraceElement != null) {
            str2 = stackTraceElement.getFileName() + C33844oi.f71346o + stackTraceElement.getLineNumber();
            if (str2 == null) {
                str2 = "unknown";
            }
        } else {
            str2 = "unknown";
        }
        String str3 = str2;
        String fileName = stackTraceElement != null ? stackTraceElement.getFileName() : null;
        String str4 = str == null ? "" : str;
        String message = th2.getMessage();
        return new LogParams("uncaughtException", str3, (String) null, fileName, str4, message == null ? "" : message, (String) null, stringWriter.toString(), 64, (DefaultConstructorMarker) null);
    }
}
