package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.w0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@JvmInline
@InterfaceC44962o
public final class C28009w0 {

    @NotNull
    public static final C28005v0 Companion = new C28005v0();

    /* JADX INFO: renamed from: a */
    public final String f57137a;

    public final boolean equals(Object obj) {
        return (obj instanceof C28009w0) && Intrinsics.areEqual(this.f57137a, ((C28009w0) obj).f57137a);
    }

    public final int hashCode() {
        return this.f57137a.hashCode();
    }

    public final String toString() {
        return this.f57137a;
    }

    public /* synthetic */ C28009w0(String str) {
        this.f57137a = str;
    }
}
