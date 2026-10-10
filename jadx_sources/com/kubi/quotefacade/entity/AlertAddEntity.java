package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlertEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlertAddEntity;", "", "requestId", "", "warns", "Ljava/util/ArrayList;", "Lcom/kubi/quotefacade/entity/AlertAddEntity$AlertAddItem;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "getWarns", "()Ljava/util/ArrayList;", "setWarns", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AlertAddItem", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlertAddEntity {

    @Nullable
    private String requestId;

    @Nullable
    private ArrayList<AlertAddItem> warns;

    /* JADX INFO: compiled from: AlertEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlertAddEntity$AlertAddItem;", "", "noticeType", "", "symbol", "", "warnAmount", "warnType", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getNoticeType", "()Ljava/lang/Integer;", "setNoticeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getWarnAmount", "setWarnAmount", "getWarnType", "setWarnType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/AlertAddEntity$AlertAddItem;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AlertAddItem {

        @Nullable
        private Integer noticeType;

        @Nullable
        private String symbol;

        @Nullable
        private String warnAmount;

        @Nullable
        private Integer warnType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertAddItem)) {
                return false;
            }
            AlertAddItem alertAddItem = (AlertAddItem) other;
            return Intrinsics.areEqual(this.noticeType, alertAddItem.noticeType) && Intrinsics.areEqual(this.symbol, alertAddItem.symbol) && Intrinsics.areEqual(this.warnAmount, alertAddItem.warnAmount) && Intrinsics.areEqual(this.warnType, alertAddItem.warnType);
        }

        public static /* synthetic */ AlertAddItem copy$default(AlertAddItem alertAddItem, Integer num, String str, String str2, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = alertAddItem.noticeType;
            }
            if ((i11 & 2) != 0) {
                str = alertAddItem.symbol;
            }
            if ((i11 & 4) != 0) {
                str2 = alertAddItem.warnAmount;
            }
            if ((i11 & 8) != 0) {
                num2 = alertAddItem.warnType;
            }
            return alertAddItem.copy(num, str, str2, num2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getNoticeType() {
            return this.noticeType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getWarnAmount() {
            return this.warnAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getWarnType() {
            return this.warnType;
        }

        @NotNull
        public final AlertAddItem copy(@Nullable Integer noticeType, @Nullable String symbol, @Nullable String warnAmount, @Nullable Integer warnType) {
            return new AlertAddItem(noticeType, symbol, warnAmount, warnType);
        }

        @Nullable
        public final Integer getNoticeType() {
            return this.noticeType;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        public final String getWarnAmount() {
            return this.warnAmount;
        }

        @Nullable
        public final Integer getWarnType() {
            return this.warnType;
        }

        public int hashCode() {
            Integer num = this.noticeType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.symbol;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.warnAmount;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.warnType;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        public final void setNoticeType(@Nullable Integer num) {
            this.noticeType = num;
        }

        public final void setSymbol(@Nullable String str) {
            this.symbol = str;
        }

        public final void setWarnAmount(@Nullable String str) {
            this.warnAmount = str;
        }

        public final void setWarnType(@Nullable Integer num) {
            this.warnType = num;
        }

        @NotNull
        public String toString() {
            return "AlertAddItem(noticeType=" + this.noticeType + ", symbol=" + this.symbol + ", warnAmount=" + this.warnAmount + ", warnType=" + this.warnType + ')';
        }

        public AlertAddItem(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2) {
            this.noticeType = num;
            this.symbol = str;
            this.warnAmount = str2;
            this.warnType = num2;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertAddEntity)) {
            return false;
        }
        AlertAddEntity alertAddEntity = (AlertAddEntity) other;
        return Intrinsics.areEqual(this.requestId, alertAddEntity.requestId) && Intrinsics.areEqual(this.warns, alertAddEntity.warns);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlertAddEntity copy$default(AlertAddEntity alertAddEntity, String str, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alertAddEntity.requestId;
        }
        if ((i11 & 2) != 0) {
            arrayList = alertAddEntity.warns;
        }
        return alertAddEntity.copy(str, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final ArrayList<AlertAddItem> component2() {
        return this.warns;
    }

    @NotNull
    public final AlertAddEntity copy(@Nullable String requestId, @Nullable ArrayList<AlertAddItem> warns) {
        return new AlertAddEntity(requestId, warns);
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final ArrayList<AlertAddItem> getWarns() {
        return this.warns;
    }

    public int hashCode() {
        String str = this.requestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<AlertAddItem> arrayList = this.warns;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setRequestId(@Nullable String str) {
        this.requestId = str;
    }

    public final void setWarns(@Nullable ArrayList<AlertAddItem> arrayList) {
        this.warns = arrayList;
    }

    @NotNull
    public String toString() {
        return "AlertAddEntity(requestId=" + this.requestId + ", warns=" + this.warns + ')';
    }

    public AlertAddEntity(@Nullable String str, @Nullable ArrayList<AlertAddItem> arrayList) {
        this.requestId = str;
        this.warns = arrayList;
    }
}
