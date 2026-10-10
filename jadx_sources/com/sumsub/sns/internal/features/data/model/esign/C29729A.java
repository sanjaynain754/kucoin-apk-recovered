package com.sumsub.sns.internal.features.data.model.esign;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29729A {

    @NotNull
    public static final C29790z Companion = new C29790z();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59797c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29729A.m69914a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final String f59798a;

    /* JADX INFO: renamed from: b */
    public final List f59799b;

    public /* synthetic */ C29729A(int i11, String str, List list) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29789y.f59860a.getDescriptor());
        }
        this.f59798a = str;
        this.f59799b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29729A)) {
            return false;
        }
        C29729A c29729a = (C29729A) obj;
        return Intrinsics.areEqual(this.f59798a, c29729a.f59798a) && Intrinsics.areEqual(this.f59799b, c29729a.f59799b);
    }

    public C29729A(String str, List list) {
        this.f59798a = str;
        this.f59799b = list;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69914a() {
        return new C41813f(C29785u.f59857a);
    }

    public final int hashCode() {
        return this.f59799b.hashCode() + (this.f59798a.hashCode() * 31);
    }

    public final String toString() {
        return "Document(id=" + this.f59798a + ", agreements=" + this.f59799b + ")";
    }
}
