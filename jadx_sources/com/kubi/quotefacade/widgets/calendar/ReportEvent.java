package com.kubi.quotefacade.widgets.calendar;

import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.q, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: HomeCalendarReport.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/ReportEvent;", "", "pageId", "", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getPageId", "()Ljava/lang/String;", "getBlockId", "getLocationId", "getParams", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReportEvent {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String pageId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String blockId;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String locationId;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final JSONObject params;

    public ReportEvent() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportEvent)) {
            return false;
        }
        ReportEvent reportEvent = (ReportEvent) other;
        return Intrinsics.areEqual(this.pageId, reportEvent.pageId) && Intrinsics.areEqual(this.blockId, reportEvent.blockId) && Intrinsics.areEqual(this.locationId, reportEvent.locationId) && Intrinsics.areEqual(this.params, reportEvent.params);
    }

    public ReportEvent(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.pageId = pageId;
        this.blockId = blockId;
        this.locationId = locationId;
        this.params = jSONObject;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONObject getParams() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = ((((this.pageId.hashCode() * 31) + this.blockId.hashCode()) * 31) + this.locationId.hashCode()) * 31;
        JSONObject jSONObject = this.params;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReportEvent(pageId=" + this.pageId + ", blockId=" + this.blockId + ", locationId=" + this.locationId + ", params=" + this.params + ')';
    }

    public /* synthetic */ ReportEvent(String str, String str2, String str3, JSONObject jSONObject, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? HomeCardViewHolderProxy.PAGE_ID : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "1" : str3, (i11 & 8) != 0 ? null : jSONObject);
    }
}
