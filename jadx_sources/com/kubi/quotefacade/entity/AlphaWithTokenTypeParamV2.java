package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavSimpleParam.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006("}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;", "Landroid/os/Parcelable;", "datasource", "", "tokenBridgeIds", "", "externalTokenChains", "excludes", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getDatasource", "()Ljava/lang/String;", "setDatasource", "(Ljava/lang/String;)V", "getTokenBridgeIds", "()Ljava/util/List;", "setTokenBridgeIds", "(Ljava/util/List;)V", "getExternalTokenChains", "setExternalTokenChains", "getExcludes", "setExcludes", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaWithTokenTypeParamV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaWithTokenTypeParamV2> CREATOR = new C21872a();

    @NotNull
    private String datasource;

    @Nullable
    private String excludes;

    @Nullable
    private List<String> externalTokenChains;

    @Nullable
    private List<String> tokenBridgeIds;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaWithTokenTypeParamV2$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21872a implements Parcelable.Creator<AlphaWithTokenTypeParamV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaWithTokenTypeParamV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaWithTokenTypeParamV2(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaWithTokenTypeParamV2[] newArray(int i11) {
            return new AlphaWithTokenTypeParamV2[i11];
        }
    }

    public AlphaWithTokenTypeParamV2(@NotNull String datasource, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(datasource, "datasource");
        this.datasource = datasource;
        this.tokenBridgeIds = list;
        this.externalTokenChains = list2;
        this.excludes = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaWithTokenTypeParamV2)) {
            return false;
        }
        AlphaWithTokenTypeParamV2 alphaWithTokenTypeParamV2 = (AlphaWithTokenTypeParamV2) other;
        return Intrinsics.areEqual(this.datasource, alphaWithTokenTypeParamV2.datasource) && Intrinsics.areEqual(this.tokenBridgeIds, alphaWithTokenTypeParamV2.tokenBridgeIds) && Intrinsics.areEqual(this.externalTokenChains, alphaWithTokenTypeParamV2.externalTokenChains) && Intrinsics.areEqual(this.excludes, alphaWithTokenTypeParamV2.excludes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaWithTokenTypeParamV2 copy$default(AlphaWithTokenTypeParamV2 alphaWithTokenTypeParamV2, String str, List list, List list2, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alphaWithTokenTypeParamV2.datasource;
        }
        if ((i11 & 2) != 0) {
            list = alphaWithTokenTypeParamV2.tokenBridgeIds;
        }
        if ((i11 & 4) != 0) {
            list2 = alphaWithTokenTypeParamV2.externalTokenChains;
        }
        if ((i11 & 8) != 0) {
            str2 = alphaWithTokenTypeParamV2.excludes;
        }
        return alphaWithTokenTypeParamV2.copy(str, list, list2, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDatasource() {
        return this.datasource;
    }

    @Nullable
    public final List<String> component2() {
        return this.tokenBridgeIds;
    }

    @Nullable
    public final List<String> component3() {
        return this.externalTokenChains;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExcludes() {
        return this.excludes;
    }

    @NotNull
    public final AlphaWithTokenTypeParamV2 copy(@NotNull String datasource, @Nullable List<String> tokenBridgeIds, @Nullable List<String> externalTokenChains, @Nullable String excludes) {
        Intrinsics.checkNotNullParameter(datasource, "datasource");
        return new AlphaWithTokenTypeParamV2(datasource, tokenBridgeIds, externalTokenChains, excludes);
    }

    @NotNull
    public final String getDatasource() {
        return this.datasource;
    }

    @Nullable
    public final String getExcludes() {
        return this.excludes;
    }

    @Nullable
    public final List<String> getExternalTokenChains() {
        return this.externalTokenChains;
    }

    @Nullable
    public final List<String> getTokenBridgeIds() {
        return this.tokenBridgeIds;
    }

    public int hashCode() {
        int iHashCode = this.datasource.hashCode() * 31;
        List<String> list = this.tokenBridgeIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.externalTokenChains;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.excludes;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setDatasource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.datasource = str;
    }

    public final void setExcludes(@Nullable String str) {
        this.excludes = str;
    }

    public final void setExternalTokenChains(@Nullable List<String> list) {
        this.externalTokenChains = list;
    }

    public final void setTokenBridgeIds(@Nullable List<String> list) {
        this.tokenBridgeIds = list;
    }

    @NotNull
    public String toString() {
        return "AlphaWithTokenTypeParamV2(datasource=" + this.datasource + ", tokenBridgeIds=" + this.tokenBridgeIds + ", externalTokenChains=" + this.externalTokenChains + ", excludes=" + this.excludes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.datasource);
        dest.writeStringList(this.tokenBridgeIds);
        dest.writeStringList(this.externalTokenChains);
        dest.writeString(this.excludes);
    }

    public /* synthetic */ AlphaWithTokenTypeParamV2(String str, List list, List list2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, (i11 & 8) != 0 ? null : str2);
    }
}
