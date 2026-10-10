package com.kubi.network.websocket.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.utils.C27099x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010$\u001a\u0004\u0018\u0001H%\"\u0006\b\u0000\u0010%\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, m90084d2 = {"Lcom/kubi/network/websocket/model/Message;", "", "()V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "extension", "getExtension", "()Ljava/lang/Object;", "setExtension", "(Ljava/lang/Object;)V", "id", "getId", "setId", "source", "getSource$annotations", "getSource", "setSource", "subject", "getSubject", "setSubject", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "topic", "getTopic", "setTopic", "userId", "getUserId", "setUserId", TtmlNode.TAG_BODY, ExifInterface.GPS_DIRECTION_TRUE, "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,104:1\n126#2:105\n*S KotlinDebug\n*F\n+ 1 Response.kt\ncom/kubi/network/websocket/model/Message\n*L\n63#1:105\n*E\n"})
public final class Message {

    @Nullable
    private String data;

    @Nullable
    private Object extension;
    private long timestamp;

    @NotNull
    private String id = "";

    @NotNull
    private String userId = "";

    @NotNull
    private String source = "socket";

    @NotNull
    private String topic = "";

    @NotNull
    private String subject = "";

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.network.websocket.model.Message$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes64.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/network/websocket/model/Message$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C19398a<T> extends TypeToken<T> {
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final Object getExtension() {
        return this.extension;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getSubject() {
        return this.subject;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setExtension(@Nullable Object obj) {
        this.extension = obj;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setSubject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subject = str;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    public final void setTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.topic = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final /* synthetic */ <T> T body() {
        if (getData() != null && !TextUtils.isEmpty(getData())) {
            try {
                String data = getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                Intrinsics.needClassReification();
                return (T) C27099x.m66914d(data, new C19398a().getType());
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ void getSource$annotations() {
    }
}
