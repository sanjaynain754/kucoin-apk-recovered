package com.kubi.sdk.lib.kunlun.sdk.network;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KunlunAPI.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/network/KunlunReportEvents;", "", DbParams.TABLE_EVENTS, "", "Lcom/google/gson/JsonObject;", "(Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KunlunReportEvents {

    @NotNull
    private final List<JsonObject> events;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KunlunReportEvents) && Intrinsics.areEqual(this.events, ((KunlunReportEvents) other).events);
    }

    public KunlunReportEvents(@NotNull List<JsonObject> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KunlunReportEvents copy$default(KunlunReportEvents kunlunReportEvents, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = kunlunReportEvents.events;
        }
        return kunlunReportEvents.copy(list);
    }

    @NotNull
    public final List<JsonObject> component1() {
        return this.events;
    }

    @NotNull
    public final KunlunReportEvents copy(@NotNull List<JsonObject> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new KunlunReportEvents(events);
    }

    @NotNull
    public final List<JsonObject> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    @NotNull
    public String toString() {
        return "KunlunReportEvents(events=" + this.events + ')';
    }
}
