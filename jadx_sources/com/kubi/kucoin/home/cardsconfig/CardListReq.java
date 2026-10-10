package com.kubi.kucoin.home.cardsconfig;

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

/* JADX INFO: compiled from: CardListReq.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/kucoin/home/cardsconfig/CardListReq;", "Landroid/os/Parcelable;", "cardList", "", "Lcom/kubi/kucoin/home/cardsconfig/CardListReq$Card;", "isModified", "", "hasLogined", "<init>", "(Ljava/util/List;ZZ)V", "getCardList", "()Ljava/util/List;", "()Z", "getHasLogined", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Card", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CardListReq implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardListReq> CREATOR = new C15396a();

    @NotNull
    private final List<Card> cardList;
    private final boolean hasLogined;
    private final boolean isModified;

    /* JADX INFO: compiled from: CardListReq.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/home/cardsconfig/CardListReq$Card;", "Landroid/os/Parcelable;", "code", "", "userVisible", "", "<init>", "(Ljava/lang/String;I)V", "getCode", "()Ljava/lang/String;", "getUserVisible", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Card implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new C15395a();

        @NotNull
        private final String code;
        private final int userVisible;

        /* JADX INFO: renamed from: com.kubi.kucoin.home.cardsconfig.CardListReq$Card$a */
        /* JADX INFO: compiled from: CardListReq.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C15395a implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
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
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.code, card.code) && this.userVisible == card.userVisible;
        }

        public Card(@NotNull String code, int i11) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.code = code;
            this.userVisible = i11;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = card.code;
            }
            if ((i12 & 2) != 0) {
                i11 = card.userVisible;
            }
            return card.copy(str, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getUserVisible() {
            return this.userVisible;
        }

        @NotNull
        public final Card copy(@NotNull String code, int userVisible) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Card(code, userVisible);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        public final int getUserVisible() {
            return this.userVisible;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + Integer.hashCode(this.userVisible);
        }

        @NotNull
        public String toString() {
            return "Card(code=" + this.code + ", userVisible=" + this.userVisible + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            dest.writeInt(this.userVisible);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cardsconfig.CardListReq$a */
    /* JADX INFO: compiled from: CardListReq.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15396a implements Parcelable.Creator<CardListReq> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardListReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Card.CREATOR.createFromParcel(parcel));
            }
            return new CardListReq(arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CardListReq[] newArray(int i11) {
            return new CardListReq[i11];
        }
    }

    public CardListReq(@NotNull List<Card> cardList, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        this.cardList = cardList;
        this.isModified = z11;
        this.hasLogined = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListReq)) {
            return false;
        }
        CardListReq cardListReq = (CardListReq) other;
        return Intrinsics.areEqual(this.cardList, cardListReq.cardList) && this.isModified == cardListReq.isModified && this.hasLogined == cardListReq.hasLogined;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardListReq copy$default(CardListReq cardListReq, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cardListReq.cardList;
        }
        if ((i11 & 2) != 0) {
            z11 = cardListReq.isModified;
        }
        if ((i11 & 4) != 0) {
            z12 = cardListReq.hasLogined;
        }
        return cardListReq.copy(list, z11, z12);
    }

    @NotNull
    public final List<Card> component1() {
        return this.cardList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsModified() {
        return this.isModified;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasLogined() {
        return this.hasLogined;
    }

    @NotNull
    public final CardListReq copy(@NotNull List<Card> cardList, boolean isModified, boolean hasLogined) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        return new CardListReq(cardList, isModified, hasLogined);
    }

    @NotNull
    public final List<Card> getCardList() {
        return this.cardList;
    }

    public final boolean getHasLogined() {
        return this.hasLogined;
    }

    public int hashCode() {
        return (((this.cardList.hashCode() * 31) + Boolean.hashCode(this.isModified)) * 31) + Boolean.hashCode(this.hasLogined);
    }

    public final boolean isModified() {
        return this.isModified;
    }

    @NotNull
    public String toString() {
        return "CardListReq(cardList=" + this.cardList + ", isModified=" + this.isModified + ", hasLogined=" + this.hasLogined + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Card> list = this.cardList;
        dest.writeInt(list.size());
        Iterator<Card> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.isModified ? 1 : 0);
        dest.writeInt(this.hasLogined ? 1 : 0);
    }

    public /* synthetic */ CardListReq(List list, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
    }
}
