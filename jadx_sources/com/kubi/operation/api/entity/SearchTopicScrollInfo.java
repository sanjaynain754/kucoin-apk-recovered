package com.kubi.operation.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.operation.api.R$string;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchTopicEntity.kt */
/* JADX INFO: loaded from: classes31.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, m90084d2 = {"Lcom/kubi/operation/api/entity/SearchTopicScrollInfo;", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "Landroid/os/Parcelable;", "latestUpdateRange", "", "newsId", "", "newsTitle", "type", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLatestUpdateRange", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNewsId", "()Ljava/lang/String;", "getNewsTitle", "getType", TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/operation/api/entity/SearchTopicScrollInfo;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OperationApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchTopicScrollInfo implements MarqueeTextView.InterfaceC22932e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SearchTopicScrollInfo> CREATOR = new C19433a();

    @Nullable
    private final Long latestUpdateRange;

    @Nullable
    private final String newsId;

    @Nullable
    private final String newsTitle;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.operation.api.entity.SearchTopicScrollInfo$a */
    /* JADX INFO: compiled from: SearchTopicEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19433a implements Parcelable.Creator<SearchTopicScrollInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchTopicScrollInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchTopicScrollInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchTopicScrollInfo[] newArray(int i11) {
            return new SearchTopicScrollInfo[i11];
        }
    }

    public static /* synthetic */ SearchTopicScrollInfo copy$default(SearchTopicScrollInfo searchTopicScrollInfo, Long l11, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = searchTopicScrollInfo.latestUpdateRange;
        }
        if ((i11 & 2) != 0) {
            str = searchTopicScrollInfo.newsId;
        }
        if ((i11 & 4) != 0) {
            str2 = searchTopicScrollInfo.newsTitle;
        }
        if ((i11 & 8) != 0) {
            str3 = searchTopicScrollInfo.type;
        }
        return searchTopicScrollInfo.copy(l11, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTopicScrollInfo)) {
            return false;
        }
        SearchTopicScrollInfo searchTopicScrollInfo = (SearchTopicScrollInfo) other;
        return Intrinsics.areEqual(this.latestUpdateRange, searchTopicScrollInfo.latestUpdateRange) && Intrinsics.areEqual(this.newsId, searchTopicScrollInfo.newsId) && Intrinsics.areEqual(this.newsTitle, searchTopicScrollInfo.newsTitle) && Intrinsics.areEqual(this.type, searchTopicScrollInfo.type);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.latestUpdateRange;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.newsId);
        dest.writeString(this.newsTitle);
        dest.writeString(this.type);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLatestUpdateRange() {
        return this.latestUpdateRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewsId() {
        return this.newsId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNewsTitle() {
        return this.newsTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final SearchTopicScrollInfo copy(@Nullable Long latestUpdateRange, @Nullable String newsId, @Nullable String newsTitle, @Nullable String type) {
        return new SearchTopicScrollInfo(latestUpdateRange, newsId, newsTitle, type);
    }

    @Override // com.kubi.resources.widget.MarqueeTextView.InterfaceC22932e
    @NotNull
    public String getDisplayString() {
        if (StringsKt.equals("NEWS", this.type, true)) {
            return C27041f.m66668h(this.newsTitle);
        }
        if (StringsKt.equals("LATEST_UPDATE", this.type, true)) {
            long jM66653m = C27039d.m66653m(this.latestUpdateRange, 1L) * 1000;
            if (jM66653m > 86400000) {
                return C27017c.f54310a.m66516f(R$string.operation_hottopic_update_day, String.valueOf(jM66653m / ((long) 86400000)));
            }
            if (jM66653m > FundingRateEntity.MILLIS_PER_HOUR) {
                return C27017c.f54310a.m66516f(R$string.operation_hottopic_update_hour, String.valueOf(jM66653m / ((long) 3600000)));
            }
            if (jM66653m > 60000) {
                return C27017c.f54310a.m66516f(R$string.operation_hottopic_update_minute, String.valueOf(jM66653m / ((long) 60000)));
            }
            if (jM66653m > 1000) {
                return C27017c.f54310a.m66516f(R$string.operation_hottopic_update_seconds, String.valueOf(jM66653m / ((long) 1000)));
            }
        }
        return "";
    }

    @Nullable
    public final Long getLatestUpdateRange() {
        return this.latestUpdateRange;
    }

    @Nullable
    public final String getNewsId() {
        return this.newsId;
    }

    @Nullable
    public final String getNewsTitle() {
        return this.newsTitle;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Long l11 = this.latestUpdateRange;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.newsId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.newsTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchTopicScrollInfo(latestUpdateRange=" + this.latestUpdateRange + ", newsId=" + this.newsId + ", newsTitle=" + this.newsTitle + ", type=" + this.type + ')';
    }

    public SearchTopicScrollInfo(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.latestUpdateRange = l11;
        this.newsId = str;
        this.newsTitle = str2;
        this.type = str3;
    }
}
