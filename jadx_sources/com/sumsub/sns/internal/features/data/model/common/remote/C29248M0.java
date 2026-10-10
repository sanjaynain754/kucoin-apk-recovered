package com.sumsub.sns.internal.features.data.model.common.remote;

import java.util.ArrayList;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29248M0 {

    @NotNull
    public static final C29243L0 Companion = new C29243L0();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59239b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.u4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29248M0.m69814a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final List f59240a;

    public /* synthetic */ C29248M0(List list, int i11) {
        if ((i11 & 1) == 0) {
            this.f59240a = null;
        } else {
            this.f59240a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29248M0) && Intrinsics.areEqual(this.f59240a, ((C29248M0) obj).f59240a);
    }

    public C29248M0(ArrayList arrayList) {
        this.f59240a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69814a() {
        return new C41813f(C29223H0.f59215a);
    }

    public final int hashCode() {
        List list = this.f59240a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "PoaGpsAddressRequest(fields=" + this.f59240a + ")";
    }
}
