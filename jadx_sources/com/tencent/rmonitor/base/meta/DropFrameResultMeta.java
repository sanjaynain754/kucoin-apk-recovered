package com.tencent.rmonitor.base.meta;

import com.tencent.bugly.proguard.C33723j2;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.custom.C35153a;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J[\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0000J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0000H\u0002J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\rJ\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0000J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0000H\u0002J\b\u0010(\u001a\u00020\u001bH\u0016J\u0006\u0010)\u001a\u00020\rJ\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;", "Lcom/tencent/rmonitor/base/meta/MonitorMeta;", DropFrameTable.COLUMN_SCENE, "", "totalDuration", "", "refreshDuration", "", "refreshCount", "hitchesDuration", "suspendDuration", "timeStamp", "userCustom", "Lorg/json/JSONObject;", "(Ljava/lang/String;J[J[JJJJLorg/json/JSONObject;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "computeFPS", "", "copy", "copyFrom", "", "other", "dump", "equals", "", "", "equalsOther", "fromJSONObject", "jsonObject", "hashCode", "", "merge", "mergeUserCustom", "reset", "toJSONObject", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class DropFrameResultMeta extends MonitorMeta {

    @JvmField
    public long hitchesDuration;

    @JvmField
    @NotNull
    public final long[] refreshCount;

    @JvmField
    @NotNull
    public final long[] refreshDuration;

    @JvmField
    @NotNull
    public String scene;

    @JvmField
    public long suspendDuration;

    @JvmField
    public long timeStamp;

    @JvmField
    public long totalDuration;

    @JvmField
    @Nullable
    public JSONObject userCustom;

    public DropFrameResultMeta() {
        this(null, 0L, null, null, 0L, 0L, 0L, null, 255, null);
    }

    public /* synthetic */ DropFrameResultMeta(String str, long j11, long[] jArr, long[] jArr2, long j12, long j13, long j14, JSONObject jSONObject, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? new long[60] : jArr, (i11 & 8) != 0 ? new long[60] : jArr2, (i11 & 16) != 0 ? 0L : j12, (i11 & 32) != 0 ? 0L : j13, (i11 & 64) == 0 ? j14 : 0L, (i11 & 128) != 0 ? null : jSONObject);
    }

    public static /* synthetic */ DropFrameResultMeta copy$default(DropFrameResultMeta dropFrameResultMeta, String str, long j11, long[] jArr, long[] jArr2, long j12, long j13, long j14, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dropFrameResultMeta.scene;
        }
        if ((i11 & 2) != 0) {
            j11 = dropFrameResultMeta.totalDuration;
        }
        if ((i11 & 4) != 0) {
            jArr = dropFrameResultMeta.refreshDuration;
        }
        if ((i11 & 8) != 0) {
            jArr2 = dropFrameResultMeta.refreshCount;
        }
        if ((i11 & 16) != 0) {
            j12 = dropFrameResultMeta.hitchesDuration;
        }
        if ((i11 & 32) != 0) {
            j13 = dropFrameResultMeta.suspendDuration;
        }
        if ((i11 & 64) != 0) {
            j14 = dropFrameResultMeta.timeStamp;
        }
        if ((i11 & 128) != 0) {
            jSONObject = dropFrameResultMeta.userCustom;
        }
        JSONObject jSONObject2 = jSONObject;
        long j15 = j14;
        long j16 = j13;
        return dropFrameResultMeta.copy(str, j11, jArr, jArr2, j12, j16, j15, jSONObject2);
    }

    private final boolean equalsOther(DropFrameResultMeta other) {
        return Intrinsics.areEqual(this.scene, other.scene) && this.totalDuration == other.totalDuration && Arrays.equals(this.refreshDuration, other.refreshDuration) && Arrays.equals(this.refreshCount, other.refreshCount) && this.hitchesDuration == other.hitchesDuration && this.suspendDuration == other.suspendDuration && this.timeStamp == other.timeStamp && Intrinsics.areEqual(this.userCustom, other.userCustom);
    }

    private final void mergeUserCustom(DropFrameResultMeta other) throws JSONException {
        JSONObject jSONObject = other.userCustom;
        JSONObject jSONObject2 = this.userCustom;
        if (jSONObject == null) {
            jSONObject = jSONObject2;
        } else if (jSONObject2 != null) {
            ArrayList<String> arrayList = new ArrayList(40);
            String[] NUMBER_PARAM_KEYS = ICustomDataEditor.NUMBER_PARAM_KEYS;
            Intrinsics.checkNotNullExpressionValue(NUMBER_PARAM_KEYS, "NUMBER_PARAM_KEYS");
            CollectionsKt.addAll(arrayList, NUMBER_PARAM_KEYS);
            String[] STRING_PARAM_KEYS = ICustomDataEditor.STRING_PARAM_KEYS;
            Intrinsics.checkNotNullExpressionValue(STRING_PARAM_KEYS, "STRING_PARAM_KEYS");
            CollectionsKt.addAll(arrayList, STRING_PARAM_KEYS);
            String[] STRING_ARRAY_PARAM_KEYS = ICustomDataEditor.STRING_ARRAY_PARAM_KEYS;
            Intrinsics.checkNotNullExpressionValue(STRING_ARRAY_PARAM_KEYS, "STRING_ARRAY_PARAM_KEYS");
            CollectionsKt.addAll(arrayList, STRING_ARRAY_PARAM_KEYS);
            String[] RESERVED_PARAM_KEYS = C35153a.f75234l;
            Intrinsics.checkNotNullExpressionValue(RESERVED_PARAM_KEYS, "RESERVED_PARAM_KEYS");
            CollectionsKt.addAll(arrayList, RESERVED_PARAM_KEYS);
            for (String str : arrayList) {
                if (!jSONObject2.has(str) && jSONObject.has(str)) {
                    jSONObject2.put(str, jSONObject.get(str));
                }
            }
            jSONObject = jSONObject2;
        }
        this.userCustom = jSONObject;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long[] getRefreshDuration() {
        return this.refreshDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long[] getRefreshCount() {
        return this.refreshCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getHitchesDuration() {
        return this.hitchesDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getSuspendDuration() {
        return this.suspendDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final JSONObject getUserCustom() {
        return this.userCustom;
    }

    public final float computeFPS() {
        long j11 = 0;
        for (long j12 : this.refreshDuration) {
            j11 += j12;
        }
        if (j11 > 0) {
            return ((j11 - this.hitchesDuration) * 60.0f) / j11;
        }
        return 0.0f;
    }

    @NotNull
    public final DropFrameResultMeta copy(@NotNull String scene, long totalDuration, @NotNull long[] refreshDuration, @NotNull long[] refreshCount, long hitchesDuration, long suspendDuration, long timeStamp, @Nullable JSONObject userCustom) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(refreshDuration, "refreshDuration");
        Intrinsics.checkNotNullParameter(refreshCount, "refreshCount");
        return new DropFrameResultMeta(scene, totalDuration, refreshDuration, refreshCount, hitchesDuration, suspendDuration, timeStamp, userCustom);
    }

    public final void copyFrom(@NotNull DropFrameResultMeta other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.scene = other.scene;
        this.timeStamp = other.timeStamp;
        this.totalDuration = other.totalDuration;
        this.hitchesDuration = other.hitchesDuration;
        this.suspendDuration = other.suspendDuration;
        int length = this.refreshCount.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.refreshCount[i11] = other.refreshCount[i11];
        }
        int length2 = this.refreshDuration.length;
        for (int i12 = 0; i12 < length2; i12++) {
            this.refreshDuration[i12] = other.refreshDuration[i12];
        }
        this.userCustom = other.userCustom;
    }

    public final void dump() {
        float f11;
        float f12;
        if (Logger.verbos) {
            long j11 = 0;
            for (long j12 : this.refreshDuration) {
                j11 += j12;
            }
            if (j11 > 0) {
                int i11 = 0;
                for (long j13 : this.refreshCount) {
                    i11 += (int) j13;
                }
                float f13 = j11;
                f11 = (i11 * 1000.0f) / f13;
                f12 = ((j11 - this.hitchesDuration) * 60.0f) / f13;
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            Logger.INSTANCE.mo77133v("RMonitor_looper_metric", "dump, ", toString(), ", totalRefreshDuration: ", String.valueOf(j11), ", fps1: ", String.valueOf(f11), ", fps2: ", String.valueOf(f12));
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DropFrameResultMeta.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            return equalsOther((DropFrameResultMeta) other);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.tencent.rmonitor.base.meta.DropFrameResultMeta");
    }

    public final void fromJSONObject(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            String strOptString = jsonObject.optString("stage");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"stage\")");
            this.scene = strOptString;
            this.totalDuration = jsonObject.optLong("total_duration");
            this.hitchesDuration = jsonObject.optLong("hitches_duration");
            this.suspendDuration = jsonObject.optLong("suspend_duration");
            this.timeStamp = jsonObject.optLong("timestamp");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("refresh_count");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                long[] jArr = this.refreshCount;
                if (length == jArr.length) {
                    int length2 = jArr.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        this.refreshCount[i11] = jSONArrayOptJSONArray.optLong(i11);
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jsonObject.optJSONArray("refresh_duration");
            if (jSONArrayOptJSONArray2 != null) {
                int length3 = jSONArrayOptJSONArray2.length();
                long[] jArr2 = this.refreshDuration;
                if (length3 == jArr2.length) {
                    int length4 = jArr2.length;
                    for (int i12 = 0; i12 < length4; i12++) {
                        this.refreshDuration[i12] = jSONArrayOptJSONArray2.optLong(i12);
                    }
                }
            }
            this.userCustom = jsonObject.optJSONObject("user_custom");
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77130d(C33723j2.f70320c, th2.toString());
        }
    }

    public int hashCode() {
        int iHashCode = (Long.hashCode(this.timeStamp) + ((Long.hashCode(this.suspendDuration) + ((Long.hashCode(this.hitchesDuration) + ((Arrays.hashCode(this.refreshCount) + ((Arrays.hashCode(this.refreshDuration) + ((Long.hashCode(this.totalDuration) + (this.scene.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        JSONObject jSONObject = this.userCustom;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final void merge(@NotNull DropFrameResultMeta other) throws JSONException {
        Intrinsics.checkNotNullParameter(other, "other");
        this.totalDuration += other.totalDuration;
        int length = this.refreshDuration.length;
        for (int i11 = 0; i11 < length; i11++) {
            long[] jArr = this.refreshDuration;
            jArr[i11] = jArr[i11] + other.refreshDuration[i11];
        }
        int length2 = this.refreshCount.length;
        for (int i12 = 0; i12 < length2; i12++) {
            long[] jArr2 = this.refreshCount;
            jArr2[i12] = jArr2[i12] + other.refreshCount[i12];
        }
        this.hitchesDuration += other.hitchesDuration;
        this.suspendDuration += other.suspendDuration;
        mergeUserCustom(other);
    }

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
        this.scene = "";
        this.timeStamp = 0L;
        this.totalDuration = 0L;
        this.hitchesDuration = 0L;
        this.suspendDuration = 0L;
        int length = this.refreshCount.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.refreshCount[i11] = 0;
        }
        int length2 = this.refreshDuration.length;
        for (int i12 = 0; i12 < length2; i12++) {
            this.refreshDuration[i12] = 0;
        }
        this.userCustom = null;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", this.scene);
        jSONObject.put("total_duration", this.totalDuration);
        jSONObject.put("hitches_duration", this.hitchesDuration);
        jSONObject.put("suspend_duration", this.suspendDuration);
        jSONObject.put("timestamp", this.timeStamp);
        JSONArray jSONArray = new JSONArray();
        int length = this.refreshCount.length;
        long j11 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            jSONArray.put(i11, this.refreshCount[i11]);
            j11 += this.refreshCount[i11];
        }
        jSONObject.put("refresh_count", jSONArray);
        jSONObject.put("total_refresh_count", j11);
        JSONArray jSONArray2 = new JSONArray();
        int length2 = this.refreshDuration.length;
        for (int i12 = 0; i12 < length2; i12++) {
            jSONArray2.put(i12, this.refreshDuration[i12]);
        }
        jSONObject.put("refresh_duration", jSONArray2);
        JSONObject jSONObject2 = this.userCustom;
        if (jSONObject2 != null) {
            jSONObject.put("user_custom", jSONObject2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "DropFrameResultMeta(scene=" + this.scene + ", totalDuration=" + this.totalDuration + ", refreshDuration=" + Arrays.toString(this.refreshDuration) + ", refreshCount=" + Arrays.toString(this.refreshCount) + ", hitchesDuration=" + this.hitchesDuration + ", suspendDuration=" + this.suspendDuration + ", timeStamp=" + this.timeStamp + ", userCustom=" + this.userCustom + ')';
    }

    public DropFrameResultMeta(@NotNull String scene, long j11, @NotNull long[] refreshDuration, @NotNull long[] refreshCount, long j12, long j13, long j14, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(refreshDuration, "refreshDuration");
        Intrinsics.checkNotNullParameter(refreshCount, "refreshCount");
        this.scene = scene;
        this.totalDuration = j11;
        this.refreshDuration = refreshDuration;
        this.refreshCount = refreshCount;
        this.hitchesDuration = j12;
        this.suspendDuration = j13;
        this.timeStamp = j14;
        this.userCustom = jSONObject;
    }
}
