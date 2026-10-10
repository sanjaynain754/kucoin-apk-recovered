package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.W2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29069W2 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59012a;

    /* JADX INFO: renamed from: b */
    public final Map f59013b;

    @NotNull
    public static final C29061U2 Companion = new C29061U2();

    @NotNull
    public static final Parcelable.Creator<C29069W2> CREATOR = new C29065V2();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59011c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.i4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29069W2.m69742b();
        }
    })};

    public /* synthetic */ C29069W2(int i11, String str, Map map) {
        this.f59012a = (i11 & 1) == 0 ? null : str;
        if ((i11 & 2) == 0) {
            this.f59013b = new LinkedHashMap();
        } else {
            this.f59013b = map;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29069W2)) {
            return false;
        }
        C29069W2 c29069w2 = (C29069W2) obj;
        return Intrinsics.areEqual(this.f59012a, c29069w2.f59012a) && Intrinsics.areEqual(this.f59013b, c29069w2.f59013b);
    }

    /* JADX INFO: renamed from: a */
    public static C29069W2 m69741a(C29069W2 c29069w2, Map map, int i11) {
        String str = c29069w2.f59012a;
        if ((i11 & 2) != 0) {
            map = c29069w2.f59013b;
        }
        return new C29069W2(str, map);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69742b() {
        return new C41790a1(C41897w2.f92051a, C29092b3.f59040a);
    }

    public final int hashCode() {
        String str = this.f59012a;
        return this.f59013b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Questionnaire(id=" + this.f59012a + ", sections=" + this.f59013b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59012a);
        Map map = this.f59013b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            ((C29110e3) entry.getValue()).writeToParcel(parcel, i11);
        }
    }

    public C29069W2(String str, Map map) {
        this.f59012a = str;
        this.f59013b = map;
    }

    public C29069W2(String str, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f59012a = str;
        this.f59013b = linkedHashMap;
    }
}
