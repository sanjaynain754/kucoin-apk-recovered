package com.kubi.home.news;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.resources.widget.MarqueeTextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewsData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/news/NewsData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "Lcom/kubi/home/news/NewsData$Data;", "<init>", "(Lcom/kubi/home/news/NewsData$Data;)V", "getData", "()Lcom/kubi/home/news/NewsData$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Data", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewsData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<NewsData> CREATOR = new C14740a();

    @Nullable
    private final Data data;

    /* JADX INFO: compiled from: NewsData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/news/NewsData$Data;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/home/news/NewsData$Data$Item;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new C14739a();

        @NotNull
        private final List<Item> items;

        /* JADX INFO: compiled from: NewsData.kt */
        @Keep
        @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/home/news/NewsData$Data$Item;", "Landroid/os/Parcelable;", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Item implements Parcelable, MarqueeTextView.InterfaceC22932e {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new C14738a();

            @NotNull
            private final String title;

            /* JADX INFO: renamed from: com.kubi.home.news.NewsData$Data$Item$a */
            /* JADX INFO: compiled from: NewsData.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class C14738a implements Parcelable.Creator<Item> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Item createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Item[] newArray(int i11) {
                    return new Item[i11];
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
                return (other instanceof Item) && Intrinsics.areEqual(this.title, ((Item) other).title);
            }

            public Item(@NotNull String title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
            }

            public static /* synthetic */ Item copy$default(Item item, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = item.title;
                }
                return item.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final Item copy(@NotNull String title) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Item(title);
            }

            @Override // com.kubi.resources.widget.MarqueeTextView.InterfaceC22932e
            @NotNull
            public String getDisplayString() {
                return this.title;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode();
            }

            @NotNull
            public String toString() {
                return "Item(title=" + this.title + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
            }
        }

        /* JADX INFO: renamed from: com.kubi.home.news.NewsData$Data$a */
        /* JADX INFO: compiled from: NewsData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C14739a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Item.CREATOR.createFromParcel(parcel));
                }
                return new Data(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Data[] newArray(int i11) {
                return new Data[i11];
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
            return (other instanceof Data) && Intrinsics.areEqual(this.items, ((Data) other).items);
        }

        public Data(@NotNull List<Item> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = data.items;
            }
            return data.copy(list);
        }

        @NotNull
        public final List<Item> component1() {
            return this.items;
        }

        @NotNull
        public final Data copy(@NotNull List<Item> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Data(items);
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(items=" + this.items + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Item> list = this.items;
            dest.writeInt(list.size());
            Iterator<Item> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.news.NewsData$a */
    /* JADX INFO: compiled from: NewsData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14740a implements Parcelable.Creator<NewsData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NewsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewsData(parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NewsData[] newArray(int i11) {
            return new NewsData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewsData) && Intrinsics.areEqual(this.data, ((NewsData) other).data);
    }

    public NewsData(@Nullable Data data) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        this.data = data;
    }

    public static /* synthetic */ NewsData copy$default(NewsData newsData, Data data, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = newsData.data;
        }
        return newsData.copy(data);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final NewsData copy(@Nullable Data data) {
        return new NewsData(data);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @NotNull
    public String toString() {
        return "NewsData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Data data = this.data;
        if (data == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            data.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ NewsData(Data data, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : data);
    }
}
