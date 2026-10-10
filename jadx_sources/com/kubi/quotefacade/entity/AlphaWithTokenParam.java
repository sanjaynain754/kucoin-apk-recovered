package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavSimpleParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;", "Landroid/os/Parcelable;", "tokenChains", "", "", "<init>", "(Ljava/util/List;)V", "getTokenChains", "()Ljava/util/List;", "setTokenChains", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaWithTokenParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaWithTokenParam> CREATOR = new C21870a();

    @NotNull
    private List<String> tokenChains;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaWithTokenParam$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21870a implements Parcelable.Creator<AlphaWithTokenParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaWithTokenParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaWithTokenParam(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaWithTokenParam[] newArray(int i11) {
            return new AlphaWithTokenParam[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlphaWithTokenParam) && Intrinsics.areEqual(this.tokenChains, ((AlphaWithTokenParam) other).tokenChains);
    }

    public AlphaWithTokenParam(@NotNull List<String> tokenChains) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        this.tokenChains = tokenChains;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaWithTokenParam copy$default(AlphaWithTokenParam alphaWithTokenParam, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = alphaWithTokenParam.tokenChains;
        }
        return alphaWithTokenParam.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.tokenChains;
    }

    @NotNull
    public final AlphaWithTokenParam copy(@NotNull List<String> tokenChains) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        return new AlphaWithTokenParam(tokenChains);
    }

    @NotNull
    public final List<String> getTokenChains() {
        return this.tokenChains;
    }

    public int hashCode() {
        return this.tokenChains.hashCode();
    }

    public final void setTokenChains(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tokenChains = list;
    }

    @NotNull
    public String toString() {
        return "AlphaWithTokenParam(tokenChains=" + this.tokenChains + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.tokenChains);
    }
}
