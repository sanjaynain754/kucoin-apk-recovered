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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29752Y {

    @NotNull
    public static final C29750W Companion = new C29750W();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59824f;

    /* JADX INFO: renamed from: a */
    public final String f59825a;

    /* JADX INFO: renamed from: b */
    public final ESignSubmissionResponse$Status f59826b;

    /* JADX INFO: renamed from: c */
    public final String f59827c;

    /* JADX INFO: renamed from: d */
    public final List f59828d;

    /* JADX INFO: renamed from: e */
    public final C29757c f59829e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29752Y)) {
            return false;
        }
        C29752Y c29752y = (C29752Y) obj;
        return Intrinsics.areEqual(this.f59825a, c29752y.f59825a) && this.f59826b == c29752y.f59826b && Intrinsics.areEqual(this.f59827c, c29752y.f59827c) && Intrinsics.areEqual(this.f59828d, c29752y.f59828d) && Intrinsics.areEqual(this.f59829e, c29752y.f59829e);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59824f = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ESignSubmissionResponse$Status.Companion.serializer();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29752Y.m69921b();
            }
        }), null};
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69921b() {
        return new C41813f(C29746S.f59816a);
    }

    public final int hashCode() {
        String str = this.f59825a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ESignSubmissionResponse$Status eSignSubmissionResponse$Status = this.f59826b;
        int iHashCode2 = (iHashCode + (eSignSubmissionResponse$Status == null ? 0 : eSignSubmissionResponse$Status.hashCode())) * 31;
        String str2 = this.f59827c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f59828d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        C29757c c29757c = this.f59829e;
        return iHashCode4 + (c29757c != null ? c29757c.hashCode() : 0);
    }

    public final String toString() {
        return "ESignSubmissionResponse(id=" + this.f59825a + ", status=" + this.f59826b + ", phoneNumber=" + this.f59827c + ", docs=" + this.f59828d + ", actions=" + this.f59829e + ")";
    }

    public /* synthetic */ C29752Y(int i11, String str, ESignSubmissionResponse$Status eSignSubmissionResponse$Status, String str2, List list, C29757c c29757c) {
        if ((i11 & 1) == 0) {
            this.f59825a = null;
        } else {
            this.f59825a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59826b = null;
        } else {
            this.f59826b = eSignSubmissionResponse$Status;
        }
        if ((i11 & 4) == 0) {
            this.f59827c = null;
        } else {
            this.f59827c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59828d = null;
        } else {
            this.f59828d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59829e = null;
        } else {
            this.f59829e = c29757c;
        }
    }
}
