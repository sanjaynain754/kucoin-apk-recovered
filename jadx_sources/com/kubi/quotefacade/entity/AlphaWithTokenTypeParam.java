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
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParam;", "Landroid/os/Parcelable;", "tokenChains", "", "", "collectType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTokenChains", "()Ljava/util/List;", "setTokenChains", "(Ljava/util/List;)V", "getCollectType", "()Ljava/lang/String;", "setCollectType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaWithTokenTypeParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaWithTokenTypeParam> CREATOR = new C21871a();

    @Nullable
    private String collectType;

    @NotNull
    private List<String> tokenChains;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaWithTokenTypeParam$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21871a implements Parcelable.Creator<AlphaWithTokenTypeParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaWithTokenTypeParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaWithTokenTypeParam(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaWithTokenTypeParam[] newArray(int i11) {
            return new AlphaWithTokenTypeParam[i11];
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
        if (!(other instanceof AlphaWithTokenTypeParam)) {
            return false;
        }
        AlphaWithTokenTypeParam alphaWithTokenTypeParam = (AlphaWithTokenTypeParam) other;
        return Intrinsics.areEqual(this.tokenChains, alphaWithTokenTypeParam.tokenChains) && Intrinsics.areEqual(this.collectType, alphaWithTokenTypeParam.collectType);
    }

    public AlphaWithTokenTypeParam(@NotNull List<String> tokenChains, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        this.tokenChains = tokenChains;
        this.collectType = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaWithTokenTypeParam copy$default(AlphaWithTokenTypeParam alphaWithTokenTypeParam, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = alphaWithTokenTypeParam.tokenChains;
        }
        if ((i11 & 2) != 0) {
            str = alphaWithTokenTypeParam.collectType;
        }
        return alphaWithTokenTypeParam.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.tokenChains;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCollectType() {
        return this.collectType;
    }

    @NotNull
    public final AlphaWithTokenTypeParam copy(@NotNull List<String> tokenChains, @Nullable String collectType) {
        Intrinsics.checkNotNullParameter(tokenChains, "tokenChains");
        return new AlphaWithTokenTypeParam(tokenChains, collectType);
    }

    @Nullable
    public final String getCollectType() {
        return this.collectType;
    }

    @NotNull
    public final List<String> getTokenChains() {
        return this.tokenChains;
    }

    public int hashCode() {
        int iHashCode = this.tokenChains.hashCode() * 31;
        String str = this.collectType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCollectType(@Nullable String str) {
        this.collectType = str;
    }

    public final void setTokenChains(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tokenChains = list;
    }

    @NotNull
    public String toString() {
        return "AlphaWithTokenTypeParam(tokenChains=" + this.tokenChains + ", collectType=" + this.collectType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.tokenChains);
        dest.writeString(this.collectType);
    }
}
