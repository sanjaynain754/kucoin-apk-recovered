package com.kubi.network.websocket.model;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u0017\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/network/websocket/model/SocketRequest;", "", "_id", "", "type", "topic", "response", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "id", "", "getId", "()I", "getResponse", "()Z", "setResponse", "(Z)V", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "getType", "setType", "isPrivate", "topicSet", "", "toJson", "private", "Companion", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SocketRequest implements Cloneable {
    private static final int FIRST_ID = 10000;

    @NotNull
    private final String _id;
    private final int id;
    private boolean response;

    @NotNull
    private String topic;

    @NotNull
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(10000);

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/network/websocket/model/SocketRequest$Companion;", "", "<init>", "()V", "Lcom/kubi/network/websocket/model/SocketRequest;", "generatePing", "()Lcom/kubi/network/websocket/model/SocketRequest;", "", "topic", "subscribe", "(Ljava/lang/String;)Lcom/kubi/network/websocket/model/SocketRequest;", "unsubscribe", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "", "FIRST_ID", "I", "Ljava/util/concurrent/atomic/AtomicInteger;", "sNextGeneratedId", "Ljava/util/concurrent/atomic/AtomicInteger;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SocketRequest generatePing() {
            return new SocketRequest(null, "ping", "", false, 9, null);
        }

        @NotNull
        public final SocketRequest subscribe(@NotNull String topic) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            return new SocketRequest(null, "subscribe", topic, false, 9, null);
        }

        @NotNull
        public final SocketRequest unsubscribe(@NotNull String topic) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            return new SocketRequest(null, "unsubscribe", topic, false, 9, null);
        }

        /* JADX INFO: renamed from: a */
        public final String m43117a() {
            int i11;
            int i12;
            do {
                i11 = SocketRequest.sNextGeneratedId.get();
                i12 = i11 + 1;
                if (i12 >= Integer.MAX_VALUE) {
                    i12 = 10000;
                }
            } while (!SocketRequest.sNextGeneratedId.compareAndSet(i11, i12));
            return String.valueOf(i11);
        }
    }

    public SocketRequest(@NotNull String _id, @NotNull String type, @NotNull String topic, boolean z11) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(topic, "topic");
        this._id = _id;
        this.type = type;
        this.topic = topic;
        this.response = z11;
        this.id = DowngradeExKt.m66543m(_id, 0, 1, null);
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getResponse() {
        return this.response;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f A[RETURN] */
    public final boolean isPrivate(@NotNull List<String> topicSet) {
        Intrinsics.checkNotNullParameter(topicSet, "topicSet");
        for (Object obj : topicSet) {
            if (Pattern.matches(StringsKt.replace$default((String) obj, "%s", ".*", false, 4, (Object) null), this.topic)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final void setResponse(boolean z11) {
        this.response = z11;
    }

    public final void setTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.topic = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public final String toJson(boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("type", this.type);
        jSONObject.put("topic", this.topic);
        jSONObject.put("privateChannel", z11);
        jSONObject.put("response", this.response);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …nse)\n        }.toString()");
        return string;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    public /* synthetic */ SocketRequest(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? INSTANCE.m43117a() : str, (i11 & 2) != 0 ? "subscribe" : str2, str3, (i11 & 8) != 0 ? true : z11);
    }
}
