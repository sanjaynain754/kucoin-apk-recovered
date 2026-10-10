package com.sumsub.sns.internal.features.data.model.esign;

import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29742N {

    @NotNull
    public static final C29741M Companion = new C29741M();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59812b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29742N.m69918a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final Map f59813a;

    public /* synthetic */ C29742N(int i11, Map map) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29740L.f59811a.getDescriptor());
        }
        this.f59813a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29742N) && Intrinsics.areEqual(this.f59813a, ((C29742N) obj).f59813a);
    }

    public C29742N(Map map) {
        this.f59813a = map;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69918a() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }

    public final int hashCode() {
        return this.f59813a.hashCode();
    }

    public final String toString() {
        return "ESignProvideDataRequest(idDoc=" + this.f59813a + ")";
    }
}
