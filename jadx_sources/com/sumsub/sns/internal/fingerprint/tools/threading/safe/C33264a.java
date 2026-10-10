package com.sumsub.sns.internal.fingerprint.tools.threading.safe;

import com.tencent.bugly.proguard.C33978va;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.tools.threading.safe.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33264a extends Exception {

    /* JADX INFO: renamed from: a */
    public final List f67805a;

    public C33264a(TimeoutException timeoutException, List list) {
        super(timeoutException);
        this.f67805a = list;
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m71614a(StackTraceElement stackTraceElement) {
        return stackTraceElement.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strJoinToString$default;
        Throwable cause = getCause();
        List list = this.f67805a;
        if (list != null) {
            strJoinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.fingerprint.tools.threading.safe.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C33264a.m71614a((StackTraceElement) obj);
                }
            }, 31, null);
        } else {
            strJoinToString$default = null;
        }
        return "The execution took too long to complete. Original exception: " + cause + ", execution thread stacktrace: " + strJoinToString$default + C33978va.f72339h;
    }
}
