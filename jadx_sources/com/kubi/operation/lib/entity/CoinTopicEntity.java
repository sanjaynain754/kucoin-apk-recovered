package com.kubi.operation.lib.entity;

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

/* JADX INFO: compiled from: CoinTopicEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0016\u001a\u00020\u0017J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006+"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/CoinTopicEntity;", "Landroid/os/Parcelable;", "anchorsTitle", "", "backUrl", "topicTitle", "topicUrl", "currencies", "", "Lcom/kubi/operation/lib/entity/TopicCurrency;", "scrollInfo", "Lcom/kubi/operation/lib/entity/TopicScrollInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAnchorsTitle", "()Ljava/lang/String;", "getBackUrl", "getTopicTitle", "getTopicUrl", "getCurrencies", "()Ljava/util/List;", "getScrollInfo", "usable", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CoinTopicEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CoinTopicEntity> CREATOR = new C19505a();

    @Nullable
    private final String anchorsTitle;

    @Nullable
    private final String backUrl;

    @Nullable
    private final List<TopicCurrency> currencies;

    @Nullable
    private final List<TopicScrollInfo> scrollInfo;

    @Nullable
    private final String topicTitle;

    @Nullable
    private final String topicUrl;

    /* JADX INFO: renamed from: com.kubi.operation.lib.entity.CoinTopicEntity$a */
    /* JADX INFO: compiled from: CoinTopicEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19505a implements Parcelable.Creator<CoinTopicEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoinTopicEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(TopicCurrency.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(TopicScrollInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new CoinTopicEntity(string, string2, string3, string4, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoinTopicEntity[] newArray(int i11) {
            return new CoinTopicEntity[i11];
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
        if (!(other instanceof CoinTopicEntity)) {
            return false;
        }
        CoinTopicEntity coinTopicEntity = (CoinTopicEntity) other;
        return Intrinsics.areEqual(this.anchorsTitle, coinTopicEntity.anchorsTitle) && Intrinsics.areEqual(this.backUrl, coinTopicEntity.backUrl) && Intrinsics.areEqual(this.topicTitle, coinTopicEntity.topicTitle) && Intrinsics.areEqual(this.topicUrl, coinTopicEntity.topicUrl) && Intrinsics.areEqual(this.currencies, coinTopicEntity.currencies) && Intrinsics.areEqual(this.scrollInfo, coinTopicEntity.scrollInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinTopicEntity copy$default(CoinTopicEntity coinTopicEntity, String str, String str2, String str3, String str4, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = coinTopicEntity.anchorsTitle;
        }
        if ((i11 & 2) != 0) {
            str2 = coinTopicEntity.backUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = coinTopicEntity.topicTitle;
        }
        if ((i11 & 8) != 0) {
            str4 = coinTopicEntity.topicUrl;
        }
        if ((i11 & 16) != 0) {
            list = coinTopicEntity.currencies;
        }
        if ((i11 & 32) != 0) {
            list2 = coinTopicEntity.scrollInfo;
        }
        List list3 = list;
        List list4 = list2;
        return coinTopicEntity.copy(str, str2, str3, str4, list3, list4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnchorsTitle() {
        return this.anchorsTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackUrl() {
        return this.backUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTopicTitle() {
        return this.topicTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTopicUrl() {
        return this.topicUrl;
    }

    @Nullable
    public final List<TopicCurrency> component5() {
        return this.currencies;
    }

    @Nullable
    public final List<TopicScrollInfo> component6() {
        return this.scrollInfo;
    }

    @NotNull
    public final CoinTopicEntity copy(@Nullable String anchorsTitle, @Nullable String backUrl, @Nullable String topicTitle, @Nullable String topicUrl, @Nullable List<TopicCurrency> currencies, @Nullable List<TopicScrollInfo> scrollInfo) {
        return new CoinTopicEntity(anchorsTitle, backUrl, topicTitle, topicUrl, currencies, scrollInfo);
    }

    @Nullable
    public final String getAnchorsTitle() {
        return this.anchorsTitle;
    }

    @Nullable
    public final String getBackUrl() {
        return this.backUrl;
    }

    @Nullable
    public final List<TopicCurrency> getCurrencies() {
        return this.currencies;
    }

    @Nullable
    public final List<TopicScrollInfo> getScrollInfo() {
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
        String str2 = this.backUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topicTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.topicUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<TopicCurrency> list = this.currencies;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<TopicScrollInfo> list2 = this.scrollInfo;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CoinTopicEntity(anchorsTitle=" + this.anchorsTitle + ", backUrl=" + this.backUrl + ", topicTitle=" + this.topicTitle + ", topicUrl=" + this.topicUrl + ", currencies=" + this.currencies + ", scrollInfo=" + this.scrollInfo + ')';
    }

    public final boolean usable() {
        String str = this.topicUrl;
        return !(str == null || str.length() == 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.anchorsTitle);
        dest.writeString(this.backUrl);
        dest.writeString(this.topicTitle);
        dest.writeString(this.topicUrl);
        List<TopicCurrency> list = this.currencies;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<TopicCurrency> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<TopicScrollInfo> list2 = this.scrollInfo;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<TopicScrollInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public CoinTopicEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<TopicCurrency> list, @Nullable List<TopicScrollInfo> list2) {
        this.anchorsTitle = str;
        this.backUrl = str2;
        this.topicTitle = str3;
        this.topicUrl = str4;
        this.currencies = list;
        this.scrollInfo = list2;
    }
}
