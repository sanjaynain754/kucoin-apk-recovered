package com.kubi.sdk.flutter.delegate;

import android.net.Uri;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33820nf;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterTrackHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterTrackHelper;", "", "<init>", "()V", "initTime", "", "startLoadingTime", "startEngineTime", "startExecutorTime", "route", "", "loadType", "isColdCall", "", "setIsColdLauncher", "", "setRoute", "initialRoute", "setLoadType", "onInit", "onStartLoading", "onStartEngine", "onStartEntrypoint", "onFlutterUiDisplayed", "trackFailed", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "clear", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterTrackHelper {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion f46622h = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static int f46623i;

    /* JADX INFO: renamed from: a */
    public long f46624a;

    /* JADX INFO: renamed from: b */
    public long f46625b;

    /* JADX INFO: renamed from: c */
    public long f46626c;

    /* JADX INFO: renamed from: d */
    public long f46627d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public String f46628e = "/";

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f46629f = "none";

    /* JADX INFO: renamed from: g */
    public boolean f46630g;

    /* JADX INFO: compiled from: FlutterTrackHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterTrackHelper$Companion;", "", "<init>", "()V", "TAG", "", "loadingCount", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m56720g() {
        this.f46630g = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m56714a() {
        this.f46624a = 0L;
        this.f46625b = 0L;
        this.f46626c = 0L;
        this.f46627d = 0L;
        this.f46629f = "none";
    }

    /* JADX INFO: renamed from: f */
    public final void m56719f() {
        f46623i++;
        this.f46625b = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public final void m56721h(@NotNull String loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        this.f46629f = loadType;
    }

    /* JADX INFO: renamed from: i */
    public final void m56722i(@NotNull String initialRoute) {
        Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
        this.f46628e = initialRoute;
    }

    /* JADX INFO: renamed from: j */
    public final void m56723j(@NotNull String error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        String path = Uri.parse(this.f46628e).getPath();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "open_flutter");
        jSONObject.put("path", path);
        jSONObject.put("url", this.f46628e);
        jSONObject.put("success", false);
        jSONObject.put("error_message", error);
        jSONObject.put(C33820nf.f71150f, this.f46629f);
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public final void m56715b() throws JSONException {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.f46625b;
        C44128b.m97259c("FlutterTrackHelper", "load " + this.f46628e + " cost:" + j11);
        String path = Uri.parse(this.f46628e).getPath();
        long j12 = jCurrentTimeMillis - this.f46624a;
        long j13 = this.f46627d;
        long j14 = j13 - this.f46626c;
        long j15 = jCurrentTimeMillis - j13;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "open_flutter");
        jSONObject.put("$event_duration", j11);
        jSONObject.put("path", path);
        jSONObject.put("url", this.f46628e);
        jSONObject.put("success", true);
        jSONObject.put("duration1", j12);
        jSONObject.put("duration2", j14);
        jSONObject.put("duration3", j15);
        if (this.f46630g) {
            str = "cold";
        } else if (f46623i == 1) {
            str = "first";
        } else {
            str = "none";
        }
        jSONObject.put("mode", str);
        jSONObject.put(C33820nf.f71150f, this.f46629f);
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public final void m56716c() {
        this.f46624a = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: d */
    public final void m56717d() {
        this.f46626c = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: e */
    public final void m56718e() {
        this.f46627d = System.currentTimeMillis();
    }
}
