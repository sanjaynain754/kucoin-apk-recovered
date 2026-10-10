package com.tencent.rmonitor.base.meta;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/DeviceMeta;", "Lcom/tencent/rmonitor/base/meta/MonitorMeta;", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getParams", "()Lorg/json/JSONObject;", "setParams", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class DeviceMeta extends MonitorMeta {

    @Nullable
    private JSONObject params;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceMeta() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceMeta) && Intrinsics.areEqual(this.params, ((DeviceMeta) other).params);
    }

    public DeviceMeta(@Nullable JSONObject jSONObject) {
        this.params = jSONObject;
    }

    public static /* synthetic */ DeviceMeta copy$default(DeviceMeta deviceMeta, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jSONObject = deviceMeta.params;
        }
        return deviceMeta.copy(jSONObject);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JSONObject getParams() {
        return this.params;
    }

    @NotNull
    public final DeviceMeta copy(@Nullable JSONObject params) {
        return new DeviceMeta(params);
    }

    @Nullable
    public final JSONObject getParams() {
        return this.params;
    }

    public int hashCode() {
        JSONObject jSONObject = this.params;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public final void setParams(@Nullable JSONObject jSONObject) {
        this.params = jSONObject;
    }

    @NotNull
    public String toString() {
        return "DeviceMeta(params=" + this.params + ')';
    }

    public /* synthetic */ DeviceMeta(JSONObject jSONObject, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : jSONObject);
    }
}
