package com.kubi.operation.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchTopicEntity.kt */
/* JADX INFO: loaded from: classes31.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006'"}, m90084d2 = {"Lcom/kubi/operation/api/entity/SearchTopicEntity;", "Landroid/os/Parcelable;", "anchorsTitle", "", "topicTitle", "topicUrl", "currencies", "", "Lcom/kubi/operation/api/entity/SearchTopicCurrency;", "scrollInfo", "Lcom/kubi/operation/api/entity/SearchTopicScrollInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAnchorsTitle", "()Ljava/lang/String;", "getTopicTitle", "getTopicUrl", "getCurrencies", "()Ljava/util/List;", "getScrollInfo", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchTopicEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SearchTopicEntity> CREATOR = new C19432a();

    @Nullable
    private final String anchorsTitle;

    @Nullable
    private final List<SearchTopicCurrency> currencies;

    @Nullable
    private final List<SearchTopicScrollInfo> scrollInfo;

    @Nullable
    private final String topicTitle;

    @Nullable
    private final String topicUrl;

    /* JADX INFO: renamed from: com.kubi.operation.api.entity.SearchTopicEntity$a */
    /* JADX INFO: compiled from: SearchTopicEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19432a implements Parcelable.Creator<SearchTopicEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchTopicEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(SearchTopicCurrency.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(SearchTopicScrollInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new SearchTopicEntity(string, string2, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchTopicEntity[] newArray(int i11) {
            return new SearchTopicEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchTopicEntity copy$default(SearchTopicEntity searchTopicEntity, String str, String str2, String str3, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchTopicEntity.anchorsTitle;
        }
        if ((i11 & 2) != 0) {
            str2 = searchTopicEntity.topicTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = searchTopicEntity.topicUrl;
        }
        if ((i11 & 8) != 0) {
            list = searchTopicEntity.currencies;
        }
        if ((i11 & 16) != 0) {
            list2 = searchTopicEntity.scrollInfo;
        }
        List list3 = list2;
        String str4 = str3;
        return searchTopicEntity.copy(str, str2, str4, list, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTopicEntity)) {
            return false;
        }
        SearchTopicEntity searchTopicEntity = (SearchTopicEntity) other;
        return Intrinsics.areEqual(this.anchorsTitle, searchTopicEntity.anchorsTitle) && Intrinsics.areEqual(this.topicTitle, searchTopicEntity.topicTitle) && Intrinsics.areEqual(this.topicUrl, searchTopicEntity.topicUrl) && Intrinsics.areEqual(this.currencies, searchTopicEntity.currencies) && Intrinsics.areEqual(this.scrollInfo, searchTopicEntity.scrollInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.anchorsTitle);
        dest.writeString(this.topicTitle);
        dest.writeString(this.topicUrl);
        List<SearchTopicCurrency> list = this.currencies;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<SearchTopicCurrency> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<SearchTopicScrollInfo> list2 = this.scrollInfo;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<SearchTopicScrollInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnchorsTitle() {
        return this.anchorsTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTopicTitle() {
        return this.topicTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTopicUrl() {
        return this.topicUrl;
    }

    @Nullable
    public final List<SearchTopicCurrency> component4() {
        return this.currencies;
    }

    @Nullable
    public final List<SearchTopicScrollInfo> component5() {
        return this.scrollInfo;
    }

    @NotNull
    public final SearchTopicEntity copy(@Nullable String anchorsTitle, @Nullable String topicTitle, @Nullable String topicUrl, @Nullable List<SearchTopicCurrency> currencies, @Nullable List<SearchTopicScrollInfo> scrollInfo) {
        return new SearchTopicEntity(anchorsTitle, topicTitle, topicUrl, currencies, scrollInfo);
    }

    @Nullable
    public final String getAnchorsTitle() {
        return this.anchorsTitle;
    }

    @Nullable
    public final List<SearchTopicCurrency> getCurrencies() {
        return this.currencies;
    }

    @Nullable
    public final List<SearchTopicScrollInfo> getScrollInfo() {
        return this.scrollInfo;
    }

    @Nullable
    public final String getTopicTitle() {
        return this.topicTitle;
    }

    @Nullable
    public final String getTopicUrl() {
        return this.topicUrl;
    }

    public int hashCode() {
        String str = this.anchorsTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.topicTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topicUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SearchTopicCurrency> list = this.currencies;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<SearchTopicScrollInfo> list2 = this.scrollInfo;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchTopicEntity(anchorsTitle=" + this.anchorsTitle + ", topicTitle=" + this.topicTitle + ", topicUrl=" + this.topicUrl + ", currencies=" + this.currencies + ", scrollInfo=" + this.scrollInfo + ')';
    }

    public SearchTopicEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<SearchTopicCurrency> list, @Nullable List<SearchTopicScrollInfo> list2) {
        this.anchorsTitle = str;
        this.topicTitle = str2;
        this.topicUrl = str3;
        this.currencies = list;
        this.scrollInfo = list2;
    }
}
