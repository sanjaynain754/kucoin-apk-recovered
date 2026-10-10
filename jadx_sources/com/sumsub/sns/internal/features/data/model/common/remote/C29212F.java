package com.sumsub.sns.internal.features.data.model.common.remote;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29212F implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final List f59203a;

    @NotNull
    public static final C29202D Companion = new C29202D();

    @NotNull
    public static final Parcelable.Creator<C29212F> CREATOR = new C29207E();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59202b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.n4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29212F.m69806b();
        }
    })};

    public /* synthetic */ C29212F(List list, int i11) {
        if ((i11 & 1) == 0) {
            this.f59203a = null;
        } else {
            this.f59203a = list;
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
        return (obj instanceof C29212F) && Intrinsics.areEqual(this.f59203a, ((C29212F) obj).f59203a);
    }

    public C29212F(ArrayList arrayList) {
        this.f59203a = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69806b() {
        return new C41813f(C29306Y.f59314a);
    }

    public final int hashCode() {
        List list = this.f59203a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "AvailableLanguages(queue=" + this.f59203a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        List list = this.f59203a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C29325b0) it.next()).writeToParcel(parcel, i11);
        }
    }
}
