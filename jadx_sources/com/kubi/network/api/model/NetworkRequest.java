package com.kubi.network.api.model;

import androidx.annotation.Keep;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import ir.C40168c;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NetworkRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/api/model/NetworkRequest;", "", "id", "", "path", "", ReportDataTable.COLUMN_PARAMS, "", "(ILjava/lang/String;Ljava/util/Map;)V", "getId", "()I", "getParams", "()Ljava/util/Map;", "getPath", "()Ljava/lang/String;", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class NetworkRequest {
    private final int id;

    @Nullable
    private final Map<String, Object> params;

    @Nullable
    private final String path;

    public NetworkRequest() {
        this(0, null, null, 7, null);
    }

    public NetworkRequest(int i11, @Nullable String str, @Nullable Map<String, ? extends Object> map) {
        this.id = i11;
        this.path = str;
        this.params = map;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public Map<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public /* synthetic */ NetworkRequest(int i11, String str, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? C40168c.f89309a.m88526a() : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : map);
    }
}
