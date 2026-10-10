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
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainWithTokenParam;", "Landroid/os/Parcelable;", "tokens", "", "", "<init>", "(Ljava/util/List;)V", "getTokens", "()Ljava/util/List;", "setTokens", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainWithTokenParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChainWithTokenParam> CREATOR = new C21880a();

    @Nullable
    private List<String> tokens;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.ChainWithTokenParam$a */
    /* JADX INFO: compiled from: FavSimpleParam.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21880a implements Parcelable.Creator<ChainWithTokenParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainWithTokenParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChainWithTokenParam(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainWithTokenParam[] newArray(int i11) {
            return new ChainWithTokenParam[i11];
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
        return (other instanceof ChainWithTokenParam) && Intrinsics.areEqual(this.tokens, ((ChainWithTokenParam) other).tokens);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainWithTokenParam copy$default(ChainWithTokenParam chainWithTokenParam, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = chainWithTokenParam.tokens;
        }
        return chainWithTokenParam.copy(list);
    }

    @Nullable
    public final List<String> component1() {
        return this.tokens;
    }

    @NotNull
    public final ChainWithTokenParam copy(@Nullable List<String> tokens) {
        return new ChainWithTokenParam(tokens);
    }

    @Nullable
    public final List<String> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        List<String> list = this.tokens;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setTokens(@Nullable List<String> list) {
        this.tokens = list;
    }

    @NotNull
    public String toString() {
        return "ChainWithTokenParam(tokens=" + this.tokens + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.tokens);
    }

    public ChainWithTokenParam(@Nullable List<String> list) {
        this.tokens = list;
    }
}
