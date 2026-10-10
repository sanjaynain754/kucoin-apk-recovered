package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Y3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29310Y3 {

    @NotNull
    public static final C29295V3 Companion = new C29295V3();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59324b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.t5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29310Y3.m69845a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final List f59325a;

    public /* synthetic */ C29310Y3(List list, int i11) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29290U3.f59304a.getDescriptor());
        }
        this.f59325a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29310Y3) && Intrinsics.areEqual(this.f59325a, ((C29310Y3) obj).f59325a);
    }

    public C29310Y3(ArrayList arrayList) {
        this.f59325a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69845a() {
        return new C41813f(C29305X3.Companion.serializer());
    }

    public final int hashCode() {
        return this.f59325a.hashCode();
    }

    public final String toString() {
        return "UpdateApplicantDataForm(fields=" + this.f59325a + ")";
    }
}
