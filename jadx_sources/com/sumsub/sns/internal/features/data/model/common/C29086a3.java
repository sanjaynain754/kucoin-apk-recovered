package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.a3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29086a3 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59038a;

    /* JADX INFO: renamed from: b */
    public final List f59039b;

    @NotNull
    public static final C29077Y2 Companion = new C29077Y2();

    @NotNull
    public static final Parcelable.Creator<C29086a3> CREATOR = new C29081Z2();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59037c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.j4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29086a3.m69763b();
        }
    })};

    public /* synthetic */ C29086a3(int i11, String str, List list) {
        if ((i11 & 1) == 0) {
            this.f59038a = null;
        } else {
            this.f59038a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59039b = null;
        } else {
            this.f59039b = list;
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
        if (!(obj instanceof C29086a3)) {
            return false;
        }
        C29086a3 c29086a3 = (C29086a3) obj;
        return Intrinsics.areEqual(this.f59038a, c29086a3.f59038a) && Intrinsics.areEqual(this.f59039b, c29086a3.f59039b);
    }

    public C29086a3(String str, ArrayList arrayList) {
        this.f59038a = str;
        this.f59039b = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69763b() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        String str = this.f59038a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f59039b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "QuestionnaireItem(value=" + this.f59038a + ", values=" + this.f59039b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59038a);
        parcel.writeStringList(this.f59039b);
    }

    public C29086a3(String str, List list, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        list = (i11 & 2) != 0 ? null : list;
        this.f59038a = str;
        this.f59039b = list;
    }
}
