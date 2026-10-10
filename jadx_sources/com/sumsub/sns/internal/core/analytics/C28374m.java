package com.sumsub.sns.internal.core.analytics;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C28374m {

    @NotNull
    public static final C28373l Companion = new C28373l();

    /* JADX INFO: renamed from: a */
    public final String f57852a;

    /* JADX INFO: renamed from: b */
    public final byte[] f57853b;

    public /* synthetic */ C28374m(int i11, String str, byte[] bArr) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C28372k.f57851a.getDescriptor());
        }
        this.f57852a = str;
        this.f57853b = bArr;
    }

    public C28374m(String str, byte[] bArr) {
        this.f57852a = str;
        this.f57853b = bArr;
    }
}
