package com.kubi.network.socket.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.socketio.C19373d;
import com.tencent.bugly.proguard.C33820nf;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.h */
/* JADX INFO: compiled from: SocketIOPacketUtils.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/socket/utils/h;", "", "<init>", "()V", "", "str", "Lcom/kubi/network/socket/socketio/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lcom/kubi/network/socket/socketio/d;", "", "type", "payload", "", "b", "(ILjava/lang/Object;)Z", "", "[Ljava/lang/String;", "SOCKET_IO_TYPES", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19392h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19392h f36156a = new C19392h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String[] SOCKET_IO_TYPES = {"CONNECT", "DISCONNECT", "EVENT", "ACK", "ERROR", "BINARY_EVENT", "BINARY_ACK"};

    /* JADX INFO: renamed from: b */
    public final boolean m43069b(int type, Object payload) {
        switch (type) {
            case 0:
            case 4:
                return payload instanceof JSONObject;
            case 1:
                return payload == null;
            case 2:
            case 5:
                if (payload instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) payload;
                    if (jSONArray.length() > 0 && !jSONArray.isNull(0)) {
                        return true;
                    }
                }
                return false;
            case 3:
            case 6:
                return payload instanceof JSONArray;
            default:
                return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C19373d<Object> m43068a(@NotNull String str) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "str");
        int length = str.length();
        int i12 = 0;
        C19373d<Object> c19373d = new C19373d<>(null, null, Character.getNumericValue(str.charAt(0)), null, null, 27, null);
        if (c19373d.getType() < 0 || c19373d.getType() > SOCKET_IO_TYPES.length - 1) {
            throw new RuntimeException("unknown packet type " + c19373d.getType());
        }
        if (5 == c19373d.getType() || 6 == c19373d.getType()) {
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) C33820nf.f71144W, false, 2, (Object) null) || length <= 1) {
                throw new RuntimeException("illegal attachments");
            }
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                i12++;
                if (str.charAt(i12) == '-') {
                    break;
                }
                sb2.append(str.charAt(i12));
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "attachments.toString()");
            c19373d.m43001f(Integer.valueOf(Integer.parseInt(string)));
        }
        int i13 = i12 + 1;
        if (length <= i13 || '/' != str.charAt(i13)) {
            c19373d.m43004i("/");
        } else {
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                i11 = i12 + 1;
                char cCharAt = str.charAt(i11);
                if (',' == cCharAt) {
                    break;
                }
                sb3.append(cCharAt);
                if (i12 + 2 == length) {
                    break;
                }
                i12 = i11;
            }
            c19373d.m43004i(sb3.toString());
            i12 = i11;
        }
        int i14 = i12 + 1;
        if (length > i14 && Character.getNumericValue(str.charAt(i14)) > -1) {
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                int i15 = i12 + 1;
                char cCharAt2 = str.charAt(i15);
                if (Character.getNumericValue(cCharAt2) < 0) {
                    break;
                }
                sb4.append(cCharAt2);
                if (i12 + 2 == length) {
                    i12 = i15;
                    break;
                }
                i12 = i15;
            }
            try {
                String string2 = sb4.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
                c19373d.m43003h(Integer.valueOf(Integer.parseInt(string2)));
            } catch (NumberFormatException unused) {
                throw new RuntimeException("invalid payload");
            }
        }
        int i16 = i12 + 1;
        if (length > i16) {
            try {
                str.charAt(i16);
                String strSubstring = str.substring(i16);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                c19373d.m43002g(new JSONTokener(strSubstring).nextValue());
                if (!m43069b(c19373d.getType(), c19373d.m42997b())) {
                    throw new RuntimeException("invalid payload");
                }
            } catch (JSONException e11) {
                C44128b.m97263g("An error occured while retrieving data from JSONTokener", e11);
                throw new RuntimeException("invalid payload");
            }
        }
        return c19373d;
    }
}
