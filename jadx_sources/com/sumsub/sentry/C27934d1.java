package com.sumsub.sentry;

import com.tencent.bugly.proguard.C33820nf;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.d1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@JvmInline
@InterfaceC44962o
public final class C27934d1 {

    @NotNull
    public static final C27930c1 Companion = new C27930c1();

    /* JADX INFO: renamed from: a */
    public final String f57061a;

    static {
        StringsKt.replace$default(new UUID(0L, 0L).toString(), C33820nf.f71144W, "", false, 4, (Object) null).substring(0, 16);
    }

    /* JADX INFO: renamed from: a */
    public static String m69006a(String str) {
        return "SpanId(value=" + str + ")";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C27934d1) && Intrinsics.areEqual(this.f57061a, ((C27934d1) obj).f57061a);
    }

    public final int hashCode() {
        return this.f57061a.hashCode();
    }

    public final String toString() {
        return m69006a(this.f57061a);
    }
}
