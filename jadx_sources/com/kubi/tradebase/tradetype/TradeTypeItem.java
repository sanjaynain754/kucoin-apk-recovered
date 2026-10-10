package com.kubi.tradebase.tradetype;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradeTypeSelectedDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeItem;", "Landroid/os/Parcelable;", "tradeTypeKey", "", "groupHeaderText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTradeTypeKey", "()Ljava/lang/String;", "getGroupHeaderText", "mapToTradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTypeSelectedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n295#2,2:192\n*S KotlinDebug\n*F\n+ 1 TradeTypeSelectedDialog.kt\ncom/kubi/tradebase/tradetype/TradeTypeItem\n*L\n189#1:192,2\n*E\n"})
public final /* data */ class TradeTypeItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeTypeItem> CREATOR = new C25930a();

    @Nullable
    private final String groupHeaderText;

    @NotNull
    private final String tradeTypeKey;

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.TradeTypeItem$a */
    /* JADX INFO: compiled from: TradeTypeSelectedDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25930a implements Parcelable.Creator<TradeTypeItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TradeTypeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeTypeItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TradeTypeItem[] newArray(int i11) {
            return new TradeTypeItem[i11];
        }
    }

    public TradeTypeItem(@NotNull String tradeTypeKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tradeTypeKey, "tradeTypeKey");
        this.tradeTypeKey = tradeTypeKey;
        this.groupHeaderText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeTypeItem)) {
            return false;
        }
        TradeTypeItem tradeTypeItem = (TradeTypeItem) other;
        return Intrinsics.areEqual(this.tradeTypeKey, tradeTypeItem.tradeTypeKey) && Intrinsics.areEqual(this.groupHeaderText, tradeTypeItem.groupHeaderText);
    }

    public static /* synthetic */ TradeTypeItem copy$default(TradeTypeItem tradeTypeItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tradeTypeItem.tradeTypeKey;
        }
        if ((i11 & 2) != 0) {
            str2 = tradeTypeItem.groupHeaderText;
        }
        return tradeTypeItem.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeTypeKey() {
        return this.tradeTypeKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupHeaderText() {
        return this.groupHeaderText;
    }

    @NotNull
    public final TradeTypeItem copy(@NotNull String tradeTypeKey, @Nullable String groupHeaderText) {
        Intrinsics.checkNotNullParameter(tradeTypeKey, "tradeTypeKey");
        return new TradeTypeItem(tradeTypeKey, groupHeaderText);
    }

    @Nullable
    public final String getGroupHeaderText() {
        return this.groupHeaderText;
    }

    @NotNull
    public final String getTradeTypeKey() {
        return this.tradeTypeKey;
    }

    public int hashCode() {
        int iHashCode = this.tradeTypeKey.hashCode() * 31;
        String str = this.groupHeaderText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "TradeTypeItem(tradeTypeKey=" + this.tradeTypeKey + ", groupHeaderText=" + this.groupHeaderText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeTypeKey);
        dest.writeString(this.groupHeaderText);
    }

    @NotNull
    public final TradeType mapToTradeType() {
        TradeType next;
        Iterator<TradeType> it = TradeType.getEntries().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(next.getValue(), this.tradeTypeKey));
        TradeType tradeType = next;
        if (tradeType == null) {
            return TradeType.LIMIT;
        }
        return tradeType;
    }

    public /* synthetic */ TradeTypeItem(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
