package com.sumsub.sns.internal.features.data.model.esign;

import com.sumsub.sns.internal.features.data.model.common.C29704v;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29779o {

    @NotNull
    public static final C29778n Companion = new C29778n();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59849b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29779o.m69925a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final List f59850a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29779o) && Intrinsics.areEqual(this.f59850a, ((C29779o) obj).f59850a);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69925a() {
        return new C41813f(C29704v.f59768a);
    }

    public final int hashCode() {
        List list = this.f59850a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "ESignIdDocument(fields=" + this.f59850a + ")";
    }

    public /* synthetic */ C29779o(List list, int i11) {
        if ((i11 & 1) == 0) {
            this.f59850a = null;
        } else {
            this.f59850a = list;
        }
    }
}
