package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p394k6.C40926i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorReportData.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001!B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001f¨\u0006\""}, m90084d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportData;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "data", "", "b", "(Lcom/facebook/internal/instrument/errorreport/ErrorReportData;)I", "", "e", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "filename", "errorMessage", "", "c", "Ljava/lang/Long;", "timestamp", "", "d", "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ErrorReportData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String filename;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String errorMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Long timestamp;

    public ErrorReportData(@Nullable String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l11 = this.timestamp;
        Intrinsics.checkNotNull(l11, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l11.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.filename = string;
    }

    /* JADX INFO: renamed from: a */
    public final void m10142a() {
        C40926i.m89625d(this.filename);
    }

    /* JADX INFO: renamed from: b */
    public final int m10143b(@NotNull ErrorReportData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l11 = this.timestamp;
        if (l11 == null) {
            return -1;
        }
        long jLongValue = l11.longValue();
        Long l12 = data.timestamp;
        if (l12 != null) {
            return Intrinsics.compare(l12.longValue(), jLongValue);
        }
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final JSONObject m10144c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l11 = this.timestamp;
            if (l11 != null) {
                jSONObject.put("timestamp", l11);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10145d() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final void m10146e() {
        if (m10145d()) {
            C40926i.m89641t(this.filename, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectM10144c = m10144c();
        if (jSONObjectM10144c == null) {
            return super.toString();
        }
        String string = jSONObjectM10144c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "params.toString()");
        return string;
    }

    public ErrorReportData(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        JSONObject jSONObjectM89639r = C40926i.m89639r(name, true);
        if (jSONObjectM89639r != null) {
            this.timestamp = Long.valueOf(jSONObjectM89639r.optLong("timestamp", 0L));
            this.errorMessage = jSONObjectM89639r.optString("error_message", null);
        }
    }
}
