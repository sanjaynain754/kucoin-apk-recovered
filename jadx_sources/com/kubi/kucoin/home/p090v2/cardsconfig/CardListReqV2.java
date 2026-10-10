package com.kubi.kucoin.home.p090v2.cardsconfig;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CardListReqV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0006J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cardsconfig/CardListReqV2;", "Landroid/os/Parcelable;", "userCustomWidgetList", "", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "userCustomVersion", "", "<init>", "(Ljava/util/List;I)V", "getUserCustomWidgetList", "()Ljava/util/List;", "getUserCustomVersion", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CardListReqV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardListReqV2> CREATOR = new C15409a();
    private final int userCustomVersion;

    @NotNull
    private final List<CardListRspV2.UserCustomWidget> userCustomWidgetList;

    /* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cardsconfig.CardListReqV2$a */
    /* JADX INFO: compiled from: CardListReqV2.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15409a implements Parcelable.Creator<CardListReqV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardListReqV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(CardListRspV2.UserCustomWidget.CREATOR.createFromParcel(parcel));
            }
            return new CardListReqV2(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CardListReqV2[] newArray(int i11) {
            return new CardListReqV2[i11];
        }
    }

    public CardListReqV2(@NotNull List<CardListRspV2.UserCustomWidget> userCustomWidgetList, int i11) {
        Intrinsics.checkNotNullParameter(userCustomWidgetList, "userCustomWidgetList");
        this.userCustomWidgetList = userCustomWidgetList;
        this.userCustomVersion = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListReqV2)) {
            return false;
        }
        CardListReqV2 cardListReqV2 = (CardListReqV2) other;
        return Intrinsics.areEqual(this.userCustomWidgetList, cardListReqV2.userCustomWidgetList) && this.userCustomVersion == cardListReqV2.userCustomVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardListReqV2 copy$default(CardListReqV2 cardListReqV2, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = cardListReqV2.userCustomWidgetList;
        }
        if ((i12 & 2) != 0) {
            i11 = cardListReqV2.userCustomVersion;
        }
        return cardListReqV2.copy(list, i11);
    }

    @NotNull
    public final List<CardListRspV2.UserCustomWidget> component1() {
        return this.userCustomWidgetList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final CardListReqV2 copy(@NotNull List<CardListRspV2.UserCustomWidget> userCustomWidgetList, int userCustomVersion) {
        Intrinsics.checkNotNullParameter(userCustomWidgetList, "userCustomWidgetList");
        return new CardListReqV2(userCustomWidgetList, userCustomVersion);
    }

    public final int getUserCustomVersion() {
        return this.userCustomVersion;
    }

    @NotNull
    public final List<CardListRspV2.UserCustomWidget> getUserCustomWidgetList() {
        return this.userCustomWidgetList;
    }

    public int hashCode() {
        return (this.userCustomWidgetList.hashCode() * 31) + Integer.hashCode(this.userCustomVersion);
    }

    @NotNull
    public String toString() {
        return "CardListReqV2(userCustomWidgetList=" + this.userCustomWidgetList + ", userCustomVersion=" + this.userCustomVersion + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CardListRspV2.UserCustomWidget> list = this.userCustomWidgetList;
        dest.writeInt(list.size());
        Iterator<CardListRspV2.UserCustomWidget> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.userCustomVersion);
    }

    public /* synthetic */ CardListReqV2(List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i12 & 2) != 0 ? 0 : i11);
    }
}
