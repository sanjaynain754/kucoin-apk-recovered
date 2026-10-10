package com.sumsub.sns.internal.features.data.model.esign;

import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29769i {

    @NotNull
    public static final C29767h Companion = new C29767h();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59842c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29769i.m69924a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final boolean f59843a;

    /* JADX INFO: renamed from: b */
    public final List f59844b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29769i)) {
            return false;
        }
        C29769i c29769i = (C29769i) obj;
        return this.f59843a == c29769i.f59843a && Intrinsics.areEqual(this.f59844b, c29769i.f59844b);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69924a() {
        return new C41813f(C29759d.f59834a);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f59843a) * 31;
        List list = this.f59844b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ESignAgreements(isAccepted=" + this.f59843a + ", agreements=" + this.f59844b + ")";
    }

    public /* synthetic */ C29769i(int i11, boolean z11, List list) {
        this.f59843a = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.f59844b = null;
        } else {
            this.f59844b = list;
        }
    }
}
