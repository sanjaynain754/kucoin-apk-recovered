package com.kubi.quotefacade.widgets.calendar.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.quotefacade.widgets.calendar.C22619k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeCalendarEventEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\nH\u0002J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u0005J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017¨\u00064"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "Landroid/os/Parcelable;", "eventId", "", "categoryId", "", "categoryCode", "title", TUIConstants.TUIChat.INPUT_MORE_ICON, "startTime", "", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getEventId", "()Ljava/lang/String;", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategoryCode", "getTitle", "getIcon", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getEventName", "getStartSecond", "getTimeText", "getMonthText", "getDateText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeCalendarEventEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HomeCalendarEventEntity> CREATOR = new C22613a();

    @Nullable
    private final String categoryCode;

    @Nullable
    private final Integer categoryId;

    @Nullable
    private final Long endTime;

    @Nullable
    private final String eventId;

    @Nullable
    private final String icon;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity$a */
    /* JADX INFO: compiled from: HomeCalendarEventEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22613a implements Parcelable.Creator<HomeCalendarEventEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomeCalendarEventEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HomeCalendarEventEntity(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HomeCalendarEventEntity[] newArray(int i11) {
            return new HomeCalendarEventEntity[i11];
        }
    }

    public HomeCalendarEventEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCalendarEventEntity)) {
            return false;
        }
        HomeCalendarEventEntity homeCalendarEventEntity = (HomeCalendarEventEntity) other;
        return Intrinsics.areEqual(this.eventId, homeCalendarEventEntity.eventId) && Intrinsics.areEqual(this.categoryId, homeCalendarEventEntity.categoryId) && Intrinsics.areEqual(this.categoryCode, homeCalendarEventEntity.categoryCode) && Intrinsics.areEqual(this.title, homeCalendarEventEntity.title) && Intrinsics.areEqual(this.icon, homeCalendarEventEntity.icon) && Intrinsics.areEqual(this.startTime, homeCalendarEventEntity.startTime) && Intrinsics.areEqual(this.endTime, homeCalendarEventEntity.endTime);
    }

    public HomeCalendarEventEntity(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable Long l12) {
        this.eventId = str;
        this.categoryId = num;
        this.categoryCode = str2;
        this.title = str3;
        this.icon = str4;
        this.startTime = l11;
        this.endTime = l12;
    }

    public static /* synthetic */ HomeCalendarEventEntity copy$default(HomeCalendarEventEntity homeCalendarEventEntity, String str, Integer num, String str2, String str3, String str4, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = homeCalendarEventEntity.eventId;
        }
        if ((i11 & 2) != 0) {
            num = homeCalendarEventEntity.categoryId;
        }
        if ((i11 & 4) != 0) {
            str2 = homeCalendarEventEntity.categoryCode;
        }
        if ((i11 & 8) != 0) {
            str3 = homeCalendarEventEntity.title;
        }
        if ((i11 & 16) != 0) {
            str4 = homeCalendarEventEntity.icon;
        }
        if ((i11 & 32) != 0) {
            l11 = homeCalendarEventEntity.startTime;
        }
        if ((i11 & 64) != 0) {
            l12 = homeCalendarEventEntity.endTime;
        }
        Long l13 = l11;
        Long l14 = l12;
        String str5 = str4;
        String str6 = str2;
        return homeCalendarEventEntity.copy(str, num, str6, str3, str5, l13, l14);
    }

    private final long getStartSecond() {
        Long l11 = this.startTime;
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategoryCode() {
        return this.categoryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final HomeCalendarEventEntity copy(@Nullable String eventId, @Nullable Integer categoryId, @Nullable String categoryCode, @Nullable String title, @Nullable String icon, @Nullable Long startTime, @Nullable Long endTime) {
        return new HomeCalendarEventEntity(eventId, categoryId, categoryCode, title, icon, startTime, endTime);
    }

    @Nullable
    public final String getCategoryCode() {
        return this.categoryCode;
    }

    @Nullable
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getEventName() {
        String str = this.title;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.categoryId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.categoryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.startTime;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.endTime;
        return iHashCode6 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeCalendarEventEntity(eventId=" + this.eventId + ", categoryId=" + this.categoryId + ", categoryCode=" + this.categoryCode + ", title=" + this.title + ", icon=" + this.icon + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.eventId);
        Integer num = this.categoryId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.categoryCode);
        dest.writeString(this.title);
        dest.writeString(this.icon);
        Long l11 = this.startTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.endTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
    }

    @NotNull
    public final String getDateText() {
        return C22619k.m53420s(getStartSecond(), null, 2, null);
    }

    @NotNull
    public final String getMonthText() {
        return C22619k.m53424w(getStartSecond(), null, 2, null);
    }

    @NotNull
    public final String getTimeText() {
        return C22619k.m53422u(Long.valueOf(getStartSecond()), null, 2, null);
    }

    public /* synthetic */ HomeCalendarEventEntity(String str, Integer num, String str2, String str3, String str4, Long l11, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : l11, (i11 & 64) != 0 ? null : l12);
    }
}
