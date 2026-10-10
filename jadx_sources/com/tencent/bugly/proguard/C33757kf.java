package com.tencent.bugly.proguard;

import com.tencent.bugly.common.replay.BuglyReplayOptions;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.kf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33757kf extends AbstractC34022xe {

    /* JADX INFO: renamed from: i */
    public static final String f70663i = "replay_report";

    /* JADX INFO: renamed from: j */
    public static final String f70664j = "enabled";

    /* JADX INFO: renamed from: k */
    public static final String f70665k = "quality";

    /* JADX INFO: renamed from: l */
    public static final String f70666l = "frame_rate";

    /* JADX INFO: renamed from: m */
    public static final int f70667m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f70668n = 3;

    /* JADX INFO: renamed from: o */
    public static final Map<Integer, BuglyReplayOptions.BuglyReplayQuality> f70669o;

    /* JADX INFO: renamed from: f */
    public int f70670f = 1;

    /* JADX INFO: renamed from: g */
    public BuglyReplayOptions.BuglyReplayQuality f70671g = BuglyReplayOptions.BuglyReplayQuality.LOW;

    /* JADX INFO: renamed from: h */
    public Boolean f70672h = Boolean.FALSE;

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f70663i;
    }

    static {
        HashMap map = new HashMap();
        f70669o = map;
        map.put(1, BuglyReplayOptions.BuglyReplayQuality.LOW);
        map.put(2, BuglyReplayOptions.BuglyReplayQuality.MEDIUM);
        map.put(3, BuglyReplayOptions.BuglyReplayQuality.HIGH);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        int i11;
        if (jSONObject.has("enabled")) {
            this.f70672h = Boolean.valueOf(jSONObject.optBoolean("enabled", false));
        }
        if (jSONObject.has(f70665k) && (i11 = jSONObject.getInt(f70665k)) >= 1 && i11 <= 3) {
            this.f70671g = f70669o.get(Integer.valueOf(i11));
        }
        if (jSONObject.has(f70666l)) {
            this.f70670f = jSONObject.optInt(f70666l, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m73817b() {
        return this.f70670f;
    }

    /* JADX INFO: renamed from: c */
    public BuglyReplayOptions.BuglyReplayQuality m73818c() {
        return this.f70671g;
    }

    /* JADX INFO: renamed from: d */
    public Boolean m73819d() {
        return this.f70672h;
    }
}
