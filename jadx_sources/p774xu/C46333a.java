package p774xu;

import com.kubi.qrcode.lib.track.TrackCategory;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xu.a */
/* JADX INFO: compiled from: QrCodeTrack.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/qrcode/lib/track/QrCodeTrack;", "", "<init>", "()V", DbParams.KEY_CHANNEL_RESULT, "", "category", "Lcom/kubi/qrcode/lib/track/TrackCategory;", "scanCode", "", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46333a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46333a f103908a = new C46333a();

    /* JADX INFO: renamed from: a */
    public final void m102147a(@NotNull TrackCategory category, @NotNull String scanCode) throws JSONException {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(scanCode, "scanCode");
        if (scanCode.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", category.getValue());
        jSONObject.put("message", scanCode);
        C43852m.m96605q("qr_scan_result", jSONObject);
    }
}
