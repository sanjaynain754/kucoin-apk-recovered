package com.kubi.network.socket.engineio;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.engineio.a */
/* JADX INFO: compiled from: EngineIOPacket.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/a;", "", "", CmcdConfiguration.KEY_SESSION_ID, "", "upgrades", "", "pingInterval", "pingTimeout", "<init>", "(Ljava/lang/String;Ljava/util/List;JJ)V", "data", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "jsonObj", "(Lorg/json/JSONObject;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getUpgrades", "()Ljava/util/List;", "c", "J", "()J", "d", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19361a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String sid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> upgrades;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long pingInterval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long pingTimeout;

    public C19361a(@NotNull String sid, @NotNull List<String> upgrades, long j11, long j12) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(upgrades, "upgrades");
        this.sid = sid;
        this.upgrades = upgrades;
        this.pingInterval = j11;
        this.pingTimeout = j12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19361a(@NotNull String data) {
        this(new JSONObject(data));
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getPingInterval() {
        return this.pingInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPingTimeout() {
        return this.pingTimeout;
    }

    public C19361a(@NotNull JSONObject jsonObj) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObj, "jsonObj");
        String string = jsonObj.getString(CmcdConfiguration.KEY_SESSION_ID);
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"sid\")");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jsonObj.getJSONArray("upgrades");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonObj.getJSONArray(\"upgrades\")");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(jSONArray.getString(i11));
        }
        Unit unit = Unit.INSTANCE;
        this(string, arrayList, jsonObj.getLong("pingInterval"), jsonObj.getLong("pingTimeout"));
    }
}
