package com.kubi.sdk.web.jsapi;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: JsBridgeEvent.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0002$%B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "", "", "type", "value", "", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/sdk/web/jsapi/a;", TUIConstants.TUIChat.CALL_BACK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/kubi/sdk/web/jsapi/a;)V", "", "code", "msg", "", "success", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILjava/lang/String;Z)V", ExifInterface.GPS_DIRECTION_TRUE, "data", "b", "(Ljava/lang/Object;ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "c", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "d", "Lcom/kubi/sdk/web/jsapi/a;", "e", "()Lcom/kubi/sdk/web/jsapi/a;", "Companion", "Result", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsBridgeEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsBridgeEvent.kt\ncom/kubi/sdk/web/jsapi/JsBridgeEvent\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,109:1\n35#2,3:110\n*S KotlinDebug\n*F\n+ 1 JsBridgeEvent.kt\ncom/kubi/sdk/web/jsapi/JsBridgeEvent\n*L\n93#1:110,3\n*E\n"})
public final class JsBridgeEvent {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f48468f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final String f48469g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> params;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC24316a callback;

    /* JADX INFO: compiled from: JsBridgeEvent.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsBridgeEvent$Companion;", "", "()V", "TYPE_EVENT", "", "getTYPE_EVENT$annotations", "TYPE_FUNC", "TYPE_JUMP", "TYPE_PROXY", "failedVal", "successVal", "jsonOrEmpty", "Lorg/json/JSONObject;", "data", "code", "", "msg", "success", "", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ JSONObject jsonOrEmpty$default(Companion companion, Object obj, int i11, String str, boolean z11, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = "";
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            if ((i12 & 4) != 0) {
                str = "";
            }
            if ((i12 & 8) != 0) {
                z11 = i11 == 0;
            }
            return companion.jsonOrEmpty(obj, i11, str, z11);
        }

        @NotNull
        public final JSONObject jsonOrEmpty(@NotNull Object data, int code, @NotNull String msg, boolean success) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(msg, "msg");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", data);
            jSONObject.put("code", code);
            jSONObject.put("success", success);
            jSONObject.put("msg", msg);
            return jSONObject;
        }

        @Deprecated(message = "change to func")
        public static /* synthetic */ void getTYPE_EVENT$annotations() {
        }
    }

    /* JADX INFO: compiled from: JsBridgeEvent.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsBridgeEvent$Result;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "code", "", "msg", "", "success", "", "(Ljava/lang/Object;ILjava/lang/String;Z)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;ILjava/lang/String;Z)Lcom/kubi/sdk/web/jsapi/JsBridgeEvent$Result;", "equals", "other", "hashCode", "toString", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class Result<T> {
        private final int code;
        private final T data;

        @NotNull
        private final String msg;
        private final boolean success;

        public Result(T t11, int i11, @NotNull String msg, boolean z11) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.data = t11;
            this.code = i11;
            this.msg = msg;
            this.success = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.data, result.data) && this.code == result.code && Intrinsics.areEqual(this.msg, result.msg) && this.success == result.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, Object obj, int i11, String str, boolean z11, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = result.data;
            }
            if ((i12 & 2) != 0) {
                i11 = result.code;
            }
            if ((i12 & 4) != 0) {
                str = result.msg;
            }
            if ((i12 & 8) != 0) {
                z11 = result.success;
            }
            return result.copy(obj, i11, str, z11);
        }

        public final T component1() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final Result<T> copy(T data, int code, @NotNull String msg, boolean success) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new Result<>(data, code, msg, success);
        }

        public final int getCode() {
            return this.code;
        }

        public final T getData() {
            return this.data;
        }

        @NotNull
        public final String getMsg() {
            return this.msg;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            T t11 = this.data;
            int iHashCode = (((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + this.msg.hashCode()) * 31;
            boolean z11 = this.success;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            return iHashCode + r11;
        }

        @NotNull
        public String toString() {
            return "Result(data=" + this.data + ", code=" + this.code + ", msg=" + this.msg + ", success=" + this.success + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Result(Object obj, int i11, String str, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            i11 = (i12 & 2) != 0 ? 0 : i11;
            this(obj, i11, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? i11 == 0 : z11);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        Boolean bool = Boolean.TRUE;
        String string = Companion.jsonOrEmpty$default(companion, bool, 0, null, false, 14, null).toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonOrEmpty(true).toString()");
        f48468f = string;
        String string2 = Companion.jsonOrEmpty$default(companion, bool, 0, null, false, 14, null).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonOrEmpty(true).toString()");
        f48469g = string2;
    }

    public JsBridgeEvent(@NotNull String type, @NotNull String value, @NotNull Map<String, ? extends Object> params, @Nullable InterfaceC24316a interfaceC24316a) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.type = type;
        this.value = value;
        this.params = params;
        this.callback = interfaceC24316a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58746c(JsBridgeEvent jsBridgeEvent, int i11, String str, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            str = "";
        }
        if ((i12 & 4) != 0) {
            z11 = i11 == 0;
        }
        jsBridgeEvent.m58748a(i11, str, z11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m58747d(JsBridgeEvent jsBridgeEvent, Object obj, int i11, String str, boolean z11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str = "";
        }
        if ((i12 & 8) != 0) {
            z11 = i11 == 0;
        }
        jsBridgeEvent.m58749b(obj, i11, str, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m58748a(int code, @NotNull String msg, boolean success) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        InterfaceC24316a interfaceC24316a = this.callback;
        if (interfaceC24316a == null) {
            return;
        }
        String string = INSTANCE.jsonOrEmpty("", code, msg, success).toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonOrEmpty(\"\", code, msg, success).toString()");
        interfaceC24316a.mo58745a(string);
    }

    /* JADX INFO: renamed from: b */
    public final <T> void m58749b(@Nullable T data, int code, @NotNull String msg, boolean success) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C24329b c24329b = C24329b.f48558a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("js callback code: ");
        sb2.append(code);
        sb2.append(", msg: ");
        sb2.append(msg);
        sb2.append(", data is not null: ");
        sb2.append(data != null);
        c24329b.m58864d("jsInoke", sb2.toString());
        InterfaceC24316a interfaceC24316a = this.callback;
        if (interfaceC24316a == null) {
            return;
        }
        if (data == null) {
            data = (T) "";
        }
        String strM66919i = C27099x.m66919i(new Result(data, code, msg, success), false, 2, null);
        interfaceC24316a.mo58745a(strM66919i != null ? strM66919i : "");
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC24316a getCallback() {
        return this.callback;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m58751f() {
        return this.params;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return this.type + '-' + this.value + '(' + this.params + ')';
    }
}
