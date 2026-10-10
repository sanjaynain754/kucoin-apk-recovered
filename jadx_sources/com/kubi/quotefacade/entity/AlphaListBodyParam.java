package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainFilterData.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jt\u0010/\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u000bJ\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0006HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017¨\u0006="}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaListBodyParam;", "Landroid/os/Parcelable;", "itemFilters", "", "Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;", "l1Keyword", "", TtmlNode.TAG_SPAN, "orderBy", "order", "pageNum", "", "pageSize", "excludes", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getItemFilters", "()Ljava/util/List;", "setItemFilters", "(Ljava/util/List;)V", "getL1Keyword", "()Ljava/lang/String;", "setL1Keyword", "(Ljava/lang/String;)V", "getSpan", "setSpan", "getOrderBy", "setOrderBy", "getOrder", "setOrder", "getPageNum", "()Ljava/lang/Integer;", "setPageNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPageSize", "setPageSize", "getExcludes", "setExcludes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyParam;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaListBodyParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaListBodyParam> CREATOR = new C21866a();

    @Nullable
    private String excludes;

    @Nullable
    private List<AlphaListBodyEntity> itemFilters;

    @Nullable
    private String l1Keyword;

    @Nullable
    private String order;

    @Nullable
    private String orderBy;

    @Nullable
    private Integer pageNum;

    @Nullable
    private Integer pageSize;

    @Nullable
    private String span;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.AlphaListBodyParam$a */
    /* JADX INFO: compiled from: ChainFilterData.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21866a implements Parcelable.Creator<AlphaListBodyParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlphaListBodyParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(AlphaListBodyEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AlphaListBodyParam(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlphaListBodyParam[] newArray(int i11) {
            return new AlphaListBodyParam[i11];
        }
    }

    public AlphaListBodyParam() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaListBodyParam)) {
            return false;
        }
        AlphaListBodyParam alphaListBodyParam = (AlphaListBodyParam) other;
        return Intrinsics.areEqual(this.itemFilters, alphaListBodyParam.itemFilters) && Intrinsics.areEqual(this.l1Keyword, alphaListBodyParam.l1Keyword) && Intrinsics.areEqual(this.span, alphaListBodyParam.span) && Intrinsics.areEqual(this.orderBy, alphaListBodyParam.orderBy) && Intrinsics.areEqual(this.order, alphaListBodyParam.order) && Intrinsics.areEqual(this.pageNum, alphaListBodyParam.pageNum) && Intrinsics.areEqual(this.pageSize, alphaListBodyParam.pageSize) && Intrinsics.areEqual(this.excludes, alphaListBodyParam.excludes);
    }

    public AlphaListBodyParam(@Nullable List<AlphaListBodyEntity> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable String str5) {
        this.itemFilters = list;
        this.l1Keyword = str;
        this.span = str2;
        this.orderBy = str3;
        this.order = str4;
        this.pageNum = num;
        this.pageSize = num2;
        this.excludes = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaListBodyParam copy$default(AlphaListBodyParam alphaListBodyParam, List list, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = alphaListBodyParam.itemFilters;
        }
        if ((i11 & 2) != 0) {
            str = alphaListBodyParam.l1Keyword;
        }
        if ((i11 & 4) != 0) {
            str2 = alphaListBodyParam.span;
        }
        if ((i11 & 8) != 0) {
            str3 = alphaListBodyParam.orderBy;
        }
        if ((i11 & 16) != 0) {
            str4 = alphaListBodyParam.order;
        }
        if ((i11 & 32) != 0) {
            num = alphaListBodyParam.pageNum;
        }
        if ((i11 & 64) != 0) {
            num2 = alphaListBodyParam.pageSize;
        }
        if ((i11 & 128) != 0) {
            str5 = alphaListBodyParam.excludes;
        }
        Integer num3 = num2;
        String str6 = str5;
        String str7 = str4;
        Integer num4 = num;
        return alphaListBodyParam.copy(list, str, str2, str3, str7, num4, num3, str6);
    }

    @Nullable
    public final List<AlphaListBodyEntity> component1() {
        return this.itemFilters;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getL1Keyword() {
        return this.l1Keyword;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSpan() {
        return this.span;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderBy() {
        return this.orderBy;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExcludes() {
        return this.excludes;
    }

    @NotNull
    public final AlphaListBodyParam copy(@Nullable List<AlphaListBodyEntity> itemFilters, @Nullable String l1Keyword, @Nullable String span, @Nullable String orderBy, @Nullable String order, @Nullable Integer pageNum, @Nullable Integer pageSize, @Nullable String excludes) {
        return new AlphaListBodyParam(itemFilters, l1Keyword, span, orderBy, order, pageNum, pageSize, excludes);
    }

    @Nullable
    public final String getExcludes() {
        return this.excludes;
    }

    @Nullable
    public final List<AlphaListBodyEntity> getItemFilters() {
        return this.itemFilters;
    }

    @Nullable
    public final String getL1Keyword() {
        return this.l1Keyword;
    }

    @Nullable
    public final String getOrder() {
        return this.order;
    }

    @Nullable
    public final String getOrderBy() {
        return this.orderBy;
    }

    @Nullable
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getSpan() {
        return this.span;
    }

    public int hashCode() {
        List<AlphaListBodyEntity> list = this.itemFilters;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.l1Keyword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.span;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderBy;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.order;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.pageNum;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageSize;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.excludes;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setExcludes(@Nullable String str) {
        this.excludes = str;
    }

    public final void setItemFilters(@Nullable List<AlphaListBodyEntity> list) {
        this.itemFilters = list;
    }

    public final void setL1Keyword(@Nullable String str) {
        this.l1Keyword = str;
    }

    public final void setOrder(@Nullable String str) {
        this.order = str;
    }

    public final void setOrderBy(@Nullable String str) {
        this.orderBy = str;
    }

    public final void setPageNum(@Nullable Integer num) {
        this.pageNum = num;
    }

    public final void setPageSize(@Nullable Integer num) {
        this.pageSize = num;
    }

    public final void setSpan(@Nullable String str) {
        this.span = str;
    }

    @NotNull
    public String toString() {
        return "AlphaListBodyParam(itemFilters=" + this.itemFilters + ", l1Keyword=" + this.l1Keyword + ", span=" + this.span + ", orderBy=" + this.orderBy + ", order=" + this.order + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", excludes=" + this.excludes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<AlphaListBodyEntity> list = this.itemFilters;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AlphaListBodyEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.l1Keyword);
        dest.writeString(this.span);
        dest.writeString(this.orderBy);
        dest.writeString(this.order);
        Integer num = this.pageNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.pageSize;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.excludes);
    }

    public /* synthetic */ AlphaListBodyParam(List list, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : str5);
    }
}
