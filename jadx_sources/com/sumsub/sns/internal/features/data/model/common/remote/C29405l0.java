package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/sumsub/sns/internal/features/data/model/common/remote/Mask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,216:1\n1563#2:217\n1634#2,3:218\n1999#2,14:221\n434#3:235\n507#3,5:236\n*S KotlinDebug\n*F\n+ 1 RemoteConfig.kt\ncom/sumsub/sns/internal/features/data/model/common/remote/Mask\n*L\n172#1:217\n172#1:218,3\n189#1:221,14\n192#1:235\n192#1:236,5\n*E\n"})
@InterfaceC44962o
public final class C29405l0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59409a;

    /* JADX INFO: renamed from: b */
    public final List f59410b;

    @NotNull
    public static final C29389j0 Companion = new C29389j0();

    @NotNull
    public static final Parcelable.Creator<C29405l0> CREATOR = new C29397k0();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59408c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.e6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29405l0.m69857b();
        }
    })};

    public /* synthetic */ C29405l0(int i11, String str, List list) {
        if (2 != (i11 & 2)) {
            C41801c2.m91514a(i11, 2, C29381i0.f59392a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f59409a = null;
        } else {
            this.f59409a = str;
        }
        this.f59410b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29405l0)) {
            return false;
        }
        C29405l0 c29405l0 = (C29405l0) obj;
        return Intrinsics.areEqual(this.f59409a, c29405l0.f59409a) && Intrinsics.areEqual(this.f59410b, c29405l0.f59410b);
    }

    public C29405l0(String str, List list) {
        this.f59409a = str;
        this.f59410b = list;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69857b() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        String str = this.f59409a;
        return this.f59410b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Mask(countryCode=" + this.f59409a + ", masks=" + this.f59410b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59409a);
        parcel.writeStringList(this.f59410b);
    }
}
