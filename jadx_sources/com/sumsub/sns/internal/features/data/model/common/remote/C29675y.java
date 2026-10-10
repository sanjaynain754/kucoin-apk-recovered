package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29675y {

    @NotNull
    public static final C29668x Companion = new C29668x();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59728b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.l6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29675y.m69906a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final List f59729a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29675y) && Intrinsics.areEqual(this.f59729a, ((C29675y) obj).f59729a);
    }

    public /* synthetic */ C29675y(List list, int i11) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29647u.f59702a.getDescriptor());
        }
        this.f59729a = list;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69906a() {
        return new C41813f(C29661w.Companion.serializer());
    }

    public final int hashCode() {
        return this.f59729a.hashCode();
    }

    public final String toString() {
        return "ApplicantDataFormResponse(fields=" + this.f59729a + ")";
    }
}
