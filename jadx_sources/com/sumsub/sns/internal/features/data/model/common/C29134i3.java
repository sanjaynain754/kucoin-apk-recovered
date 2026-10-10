package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.i3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29134i3 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59099a;

    /* JADX INFO: renamed from: b */
    public final List f59100b;

    @NotNull
    public static final C29122g3 Companion = new C29122g3();

    @NotNull
    public static final Parcelable.Creator<C29134i3> CREATOR = new C29128h3();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59098c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.l4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29134i3.m69786b();
        }
    })};

    public /* synthetic */ C29134i3(int i11, String str, List list) {
        this.f59099a = (i11 & 1) == 0 ? null : str;
        if ((i11 & 2) == 0) {
            this.f59100b = new ArrayList();
        } else {
            this.f59100b = list;
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
        if (!(obj instanceof C29134i3)) {
            return false;
        }
        C29134i3 c29134i3 = (C29134i3) obj;
        return Intrinsics.areEqual(this.f59099a, c29134i3.f59099a) && Intrinsics.areEqual(this.f59100b, c29134i3.f59100b);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69786b() {
        return new C41813f(C29057T2.f59004a);
    }

    public final int hashCode() {
        String str = this.f59099a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f59100b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "QuestionnaireSubmitModel(entityId=" + this.f59099a + ", questionnaires=" + this.f59100b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59099a);
        List list = this.f59100b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C29069W2) it.next()).writeToParcel(parcel, i11);
        }
    }

    public C29134i3(String str, List list) {
        this.f59099a = str;
        this.f59100b = list;
    }
}
