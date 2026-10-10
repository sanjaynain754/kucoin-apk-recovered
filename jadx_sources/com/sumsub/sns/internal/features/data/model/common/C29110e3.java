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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.e3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29110e3 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Map f59060a;

    @NotNull
    public static final C29098c3 Companion = new C29098c3();

    @NotNull
    public static final Parcelable.Creator<C29110e3> CREATOR = new C29104d3();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59059b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.k4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29110e3.m69767b();
        }
    })};

    public /* synthetic */ C29110e3(int i11, Map map) {
        if ((i11 & 1) == 0) {
            this.f59060a = new LinkedHashMap();
        } else {
            this.f59060a = map;
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
        return (obj instanceof C29110e3) && Intrinsics.areEqual(this.f59060a, ((C29110e3) obj).f59060a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69767b() {
        return new C41790a1(C41897w2.f92051a, C29073X2.f59015a);
    }

    public final int hashCode() {
        return this.f59060a.hashCode();
    }

    public final String toString() {
        return "QuestionnaireSection(items=" + this.f59060a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Map map = this.f59060a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            C29086a3 c29086a3 = (C29086a3) entry.getValue();
            parcel.writeString(c29086a3.f59038a);
            parcel.writeStringList(c29086a3.f59039b);
        }
    }

    public C29110e3(LinkedHashMap linkedHashMap) {
        this.f59060a = linkedHashMap;
    }

    public C29110e3() {
        this.f59060a = new LinkedHashMap();
    }
}
