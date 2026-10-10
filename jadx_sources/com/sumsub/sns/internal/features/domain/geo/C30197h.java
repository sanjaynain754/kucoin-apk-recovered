package com.sumsub.sns.internal.features.domain.geo;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30197h {

    @NotNull
    public static final C30196g Companion = new C30196g();

    /* JADX INFO: renamed from: a */
    public final double f60687a;

    /* JADX INFO: renamed from: b */
    public final double f60688b;

    /* JADX INFO: renamed from: c */
    public final float f60689c;

    public /* synthetic */ C30197h(int i11, double d11, double d12, float f11) {
        if (7 != (i11 & 7)) {
            C41801c2.m91514a(i11, 7, C30195f.f60686a.getDescriptor());
        }
        this.f60687a = d11;
        this.f60688b = d12;
        this.f60689c = f11;
    }

    public C30197h(double d11, double d12, float f11) {
        this.f60687a = d11;
        this.f60688b = d12;
        this.f60689c = f11;
    }
}
