package com.sumsub.sns.internal.features.data.model.common;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.w3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29713w3 {

    @NotNull
    public static final C29708v3 Companion = new C29708v3();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59776c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.m4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SumsubIdType.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: a */
    public final SumsubIdType f59777a;

    /* JADX INFO: renamed from: b */
    public final boolean f59778b;

    public /* synthetic */ C29713w3(int i11, SumsubIdType sumsubIdType, boolean z11) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29703u3.f59767a.getDescriptor());
        }
        this.f59777a = sumsubIdType;
        if ((i11 & 2) == 0) {
            this.f59778b = true;
        } else {
            this.f59778b = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29713w3)) {
            return false;
        }
        C29713w3 c29713w3 = (C29713w3) obj;
        return this.f59777a == c29713w3.f59777a && this.f59778b == c29713w3.f59778b;
    }

    public C29713w3(SumsubIdType sumsubIdType, boolean z11) {
        this.f59777a = sumsubIdType;
        this.f59778b = z11;
    }

    public final int hashCode() {
        SumsubIdType sumsubIdType = this.f59777a;
        return Boolean.hashCode(this.f59778b) + ((sumsubIdType == null ? 0 : sumsubIdType.hashCode()) * 31);
    }

    public final String toString() {
        return "SumsubIdConfig(type=" + this.f59777a + ", enabledByDefault=" + this.f59778b + ")";
    }
}
