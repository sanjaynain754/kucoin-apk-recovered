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

/* JADX INFO: compiled from: CardListRsp.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J@\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\nJ\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m90084d2 = {"Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "Landroid/os/Parcelable;", "cardList", "", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "showConfigButton", "", "userPortrait", "", "abType", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;)V", "getCardList", "()Ljava/util/List;", "setCardList", "(Ljava/util/List;)V", "getShowConfigButton", "()Z", "getUserPortrait", "()Ljava/lang/String;", "getAbType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Card", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CardListRsp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardListRsp> CREATOR = new C15398a();

    @Nullable
    private final Integer abType;

    @NotNull
    private List<Card> cardList;
    private final boolean showConfigButton;

    @Nullable
    private final String userPortrait;

    /* JADX INFO: compiled from: CardListRsp.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0006\u0010(\u001a\u00020\fJ\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\fHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001c¨\u00063"}, m90084d2 = {"Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "Landroid/os/Parcelable;", "code", "", "type", "isCustomQuery", "", "isDefaultHidden", "isFixed", "name", "schematicUrl", "homeVisible", "", "configVisible", "userVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;III)V", "getCode", "()Ljava/lang/String;", "getType", "()Z", "getName", "getSchematicUrl", "getHomeVisible", "()I", "getConfigVisible", "getUserVisible", "setUserVisible", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Card implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new C15397a();

        @NotNull
        private final String code;
        private final int configVisible;
        private final int homeVisible;
        private final boolean isCustomQuery;
        private final boolean isDefaultHidden;
        private final boolean isFixed;

        @Nullable
        private final String name;

        @Nullable
        private final String schematicUrl;

        @Nullable
        private final String type;
        private int userVisible;

        /* JADX INFO: renamed from: com.kubi.kucoin.home.cardsconfig.CardListRsp$Card$a */
        /* JADX INFO: compiled from: CardListRsp.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C15397a implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z11 = false;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                return new Card(string, string2, z11, z12, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public Card(@NotNull String code, @Nullable String str, boolean z11, boolean z12, boolean z13, @Nullable String str2, @Nullable String str3, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.code = code;
            this.type = str;
            this.isCustomQuery = z11;
            this.isDefaultHidden = z12;
            this.isFixed = z13;
            this.name = str2;
            this.schematicUrl = str3;
            this.homeVisible = i11;
            this.configVisible = i12;
            this.userVisible = i13;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = card.code;
            }
            if ((i14 & 2) != 0) {
                str2 = card.type;
            }
            if ((i14 & 4) != 0) {
                z11 = card.isCustomQuery;
            }
            if ((i14 & 8) != 0) {
                z12 = card.isDefaultHidden;
            }
            if ((i14 & 16) != 0) {
                z13 = card.isFixed;
            }
            if ((i14 & 32) != 0) {
                str3 = card.name;
            }
            if ((i14 & 64) != 0) {
                str4 = card.schematicUrl;
            }
            if ((i14 & 128) != 0) {
                i11 = card.homeVisible;
            }
            if ((i14 & 256) != 0) {
                i12 = card.configVisible;
            }
            if ((i14 & 512) != 0) {
                i13 = card.userVisible;
            }
            int i15 = i12;
            int i16 = i13;
            String str5 = str4;
            int i17 = i11;
            boolean z14 = z13;
            String str6 = str3;
            return card.copy(str, str2, z11, z12, z14, str6, str5, i17, i15, i16);
        }

        @NotNull
        public final Card copy(@NotNull String code, @Nullable String type, boolean isCustomQuery, boolean isDefaultHidden, boolean isFixed, @Nullable String name, @Nullable String schematicUrl, int homeVisible, int configVisible, int userVisible) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Card(code, type, isCustomQuery, isDefaultHidden, isFixed, name, schematicUrl, homeVisible, configVisible, userVisible);
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
            return Intrinsics.areEqual(this.code, card.code) && Intrinsics.areEqual(this.type, card.type) && this.isCustomQuery == card.isCustomQuery && this.isDefaultHidden == card.isDefaultHidden && this.isFixed == card.isFixed && Intrinsics.areEqual(this.name, card.name) && Intrinsics.areEqual(this.schematicUrl, card.schematicUrl) && this.homeVisible == card.homeVisible && this.configVisible == card.configVisible && this.userVisible == card.userVisible;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getUserVisible() {
            return this.userVisible;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsCustomQuery() {
            return this.isCustomQuery;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsDefaultHidden() {
            return this.isDefaultHidden;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsFixed() {
            return this.isFixed;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSchematicUrl() {
            return this.schematicUrl;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getHomeVisible() {
            return this.homeVisible;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int getConfigVisible() {
            return this.configVisible;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        public final int getConfigVisible() {
            return this.configVisible;
        }

        public final int getHomeVisible() {
            return this.homeVisible;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getSchematicUrl() {
            return this.schematicUrl;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final int getUserVisible() {
            return this.userVisible;
        }

        public int hashCode() {
            int iHashCode = this.code.hashCode() * 31;
            String str = this.type;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isCustomQuery)) * 31) + Boolean.hashCode(this.isDefaultHidden)) * 31) + Boolean.hashCode(this.isFixed)) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.schematicUrl;
            return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.homeVisible)) * 31) + Integer.hashCode(this.configVisible)) * 31) + Integer.hashCode(this.userVisible);
        }

        public final boolean isCustomQuery() {
            return this.isCustomQuery;
        }

        public final boolean isDefaultHidden() {
            return this.isDefaultHidden;
        }

        public final boolean isFixed() {
            return this.isFixed;
        }

        public final void setUserVisible(int i11) {
            this.userVisible = i11;
        }

        @NotNull
        public String toString() {
            return "Card(code=" + this.code + ", type=" + this.type + ", isCustomQuery=" + this.isCustomQuery + ", isDefaultHidden=" + this.isDefaultHidden + ", isFixed=" + this.isFixed + ", name=" + this.name + ", schematicUrl=" + this.schematicUrl + ", homeVisible=" + this.homeVisible + ", configVisible=" + this.configVisible + ", userVisible=" + this.userVisible + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            dest.writeString(this.type);
            dest.writeInt(this.isCustomQuery ? 1 : 0);
            dest.writeInt(this.isDefaultHidden ? 1 : 0);
            dest.writeInt(this.isFixed ? 1 : 0);
            dest.writeString(this.name);
            dest.writeString(this.schematicUrl);
            dest.writeInt(this.homeVisible);
            dest.writeInt(this.configVisible);
            dest.writeInt(this.userVisible);
        }

        public /* synthetic */ Card(String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? false : z11, (i14 & 8) != 0 ? false : z12, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? 2 : i11, (i14 & 256) != 0 ? 1 : i12, (i14 & 512) != 0 ? -1 : i13);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cardsconfig.CardListRsp$a */
    /* JADX INFO: compiled from: CardListRsp.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15398a implements Parcelable.Creator<CardListRsp> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardListRsp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Card.CREATOR.createFromParcel(parcel));
            }
            return new CardListRsp(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CardListRsp[] newArray(int i11) {
            return new CardListRsp[i11];
        }
    }

    public CardListRsp(@NotNull List<Card> cardList, boolean z11, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        this.cardList = cardList;
        this.showConfigButton = z11;
        this.userPortrait = str;
        this.abType = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListRsp)) {
            return false;
        }
        CardListRsp cardListRsp = (CardListRsp) other;
        return Intrinsics.areEqual(this.cardList, cardListRsp.cardList) && this.showConfigButton == cardListRsp.showConfigButton && Intrinsics.areEqual(this.userPortrait, cardListRsp.userPortrait) && Intrinsics.areEqual(this.abType, cardListRsp.abType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardListRsp copy$default(CardListRsp cardListRsp, List list, boolean z11, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cardListRsp.cardList;
        }
        if ((i11 & 2) != 0) {
            z11 = cardListRsp.showConfigButton;
        }
        if ((i11 & 4) != 0) {
            str = cardListRsp.userPortrait;
        }
        if ((i11 & 8) != 0) {
            num = cardListRsp.abType;
        }
        return cardListRsp.copy(list, z11, str, num);
    }

    @NotNull
    public final List<Card> component1() {
        return this.cardList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowConfigButton() {
        return this.showConfigButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserPortrait() {
        return this.userPortrait;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAbType() {
        return this.abType;
    }

    @NotNull
    public final CardListRsp copy(@NotNull List<Card> cardList, boolean showConfigButton, @Nullable String userPortrait, @Nullable Integer abType) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        return new CardListRsp(cardList, showConfigButton, userPortrait, abType);
    }

    @Nullable
    public final Integer getAbType() {
        return this.abType;
    }

    @NotNull
    public final List<Card> getCardList() {
        return this.cardList;
    }

    public final boolean getShowConfigButton() {
        return this.showConfigButton;
    }

    @Nullable
    public final String getUserPortrait() {
        return this.userPortrait;
    }

    public int hashCode() {
        int iHashCode = ((this.cardList.hashCode() * 31) + Boolean.hashCode(this.showConfigButton)) * 31;
        String str = this.userPortrait;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.abType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setCardList(@NotNull List<Card> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cardList = list;
    }

    @NotNull
    public String toString() {
        return "CardListRsp(cardList=" + this.cardList + ", showConfigButton=" + this.showConfigButton + ", userPortrait=" + this.userPortrait + ", abType=" + this.abType + ')';
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
        dest.writeInt(this.showConfigButton ? 1 : 0);
        dest.writeString(this.userPortrait);
        Integer num = this.abType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ CardListRsp(List list, boolean z11, String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11, str, (i11 & 8) != 0 ? null : num);
    }
}
