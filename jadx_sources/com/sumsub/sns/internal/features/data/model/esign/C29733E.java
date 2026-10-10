package com.sumsub.sns.internal.features.data.model.esign;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29733E {

    @NotNull
    public static final C29788x Companion = new C29788x();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59802c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29733E.m69915a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final C29732D f59803a;

    /* JADX INFO: renamed from: b */
    public final List f59804b;

    public /* synthetic */ C29733E(int i11, C29732D c29732d, List list) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29784t.f59856a.getDescriptor());
        }
        this.f59803a = c29732d;
        this.f59804b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29733E)) {
            return false;
        }
        C29733E c29733e = (C29733E) obj;
        return Intrinsics.areEqual(this.f59803a, c29733e.f59803a) && Intrinsics.areEqual(this.f59804b, c29733e.f59804b);
    }

    public C29733E(C29732D c29732d, ArrayList arrayList) {
        this.f59803a = c29732d;
        this.f59804b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69915a() {
        return new C41813f(C29789y.f59860a);
    }

    public final int hashCode() {
        return this.f59804b.hashCode() + (this.f59803a.f59801a.hashCode() * 31);
    }

    public final String toString() {
        return "ESignOtpConfirmRequest(otp=" + this.f59803a + ", documents=" + this.f59804b + ")";
    }
}
