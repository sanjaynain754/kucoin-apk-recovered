package com.sumsub.sentry;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27961k0 {

    @NotNull
    public static final C27957j0 Companion = new C27957j0();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f57082f = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sentry.k2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SentryItemType.Companion.serializer();
        }
    }), null, null};

    /* JADX INFO: renamed from: a */
    public final String f57083a;

    /* JADX INFO: renamed from: b */
    public final String f57084b;

    /* JADX INFO: renamed from: c */
    public final SentryItemType f57085c;

    /* JADX INFO: renamed from: d */
    public final String f57086d;

    /* JADX INFO: renamed from: e */
    public final int f57087e;

    public /* synthetic */ C27961k0(int i11, String str, String str2, SentryItemType sentryItemType, String str3, int i12) {
        if (20 != (i11 & 20)) {
            C41801c2.m91514a(i11, 20, C27953i0.f57081a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f57083a = null;
        } else {
            this.f57083a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57084b = null;
        } else {
            this.f57084b = str2;
        }
        this.f57085c = sentryItemType;
        if ((i11 & 8) == 0) {
            this.f57086d = null;
        } else {
            this.f57086d = str3;
        }
        this.f57087e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27961k0)) {
            return false;
        }
        C27961k0 c27961k0 = (C27961k0) obj;
        return Intrinsics.areEqual(this.f57083a, c27961k0.f57083a) && Intrinsics.areEqual(this.f57084b, c27961k0.f57084b) && this.f57085c == c27961k0.f57085c && Intrinsics.areEqual(this.f57086d, c27961k0.f57086d) && this.f57087e == c27961k0.f57087e;
    }

    public C27961k0(SentryItemType sentryItemType, int i11) {
        this.f57083a = "application/json";
        this.f57084b = null;
        this.f57085c = sentryItemType;
        this.f57086d = null;
        this.f57087e = i11;
    }

    public final int hashCode() {
        String str = this.f57083a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57084b;
        int iHashCode2 = (this.f57085c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f57086d;
        return Integer.hashCode(this.f57087e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SentryEnvelopeItemHeader(contentType=" + this.f57083a + ", fileName=" + this.f57084b + ", type=" + this.f57085c + ", attachmentType=" + this.f57086d + ", length=" + this.f57087e + ")";
    }
}
