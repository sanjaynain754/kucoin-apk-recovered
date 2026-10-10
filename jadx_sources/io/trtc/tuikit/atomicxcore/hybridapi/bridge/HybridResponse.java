package io.trtc.tuikit.atomicxcore.hybridapi.bridge;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;", "", "api", "", "code", "", "message", "data", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V", "getApi", "()Ljava/lang/String;", "getCode", "()I", "getData", "()Ljava/lang/Object;", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toJson", "toString", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class HybridResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String api;
    private final int code;

    @Nullable
    private final Object data;

    @Nullable
    private final String message;

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;", "", "()V", "failure", "", "api", "code", "", "message", "data", "success", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String failure$default(Companion companion, String str, int i11, String str2, Object obj, int i12, Object obj2) {
            if ((i12 & 8) != 0) {
                obj = null;
            }
            return companion.failure(str, i11, str2, obj);
        }

        public static /* synthetic */ String success$default(Companion companion, String str, Object obj, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                obj = null;
            }
            return companion.success(str, obj);
        }

        @NotNull
        public final String failure(@NotNull String api, int code, @NotNull String message, @Nullable Object data) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(message, "message");
            return new HybridResponse(api, code, message, data).toJson();
        }

        @NotNull
        public final String success(@NotNull String api, @Nullable Object data) {
            Intrinsics.checkNotNullParameter(api, "api");
            return new HybridResponse(api, 0, null, data).toJson();
        }
    }

    public HybridResponse(@NotNull String api, int i11, @Nullable String str, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.code = i11;
        this.message = str;
        this.data = obj;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridResponse)) {
            return false;
        }
        HybridResponse hybridResponse = (HybridResponse) other;
        return Intrinsics.areEqual(this.api, hybridResponse.api) && this.code == hybridResponse.code && Intrinsics.areEqual(this.message, hybridResponse.message) && Intrinsics.areEqual(this.data, hybridResponse.data);
    }

    public static /* synthetic */ HybridResponse copy$default(HybridResponse hybridResponse, String str, int i11, String str2, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = hybridResponse.api;
        }
        if ((i12 & 2) != 0) {
            i11 = hybridResponse.code;
        }
        if ((i12 & 4) != 0) {
            str2 = hybridResponse.message;
        }
        if ((i12 & 8) != 0) {
            obj = hybridResponse.data;
        }
        return hybridResponse.copy(str, i11, str2, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final HybridResponse copy(@NotNull String api, int code, @Nullable String message, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new HybridResponse(api, code, message, data);
    }

    @NotNull
    public final String getApi() {
        return this.api;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iM88225a = AbstractC39396a.m88225a(this.code, this.api.hashCode() * 31, 31);
        String str = this.message;
        int iHashCode = (iM88225a + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.data;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HybridResponse(api=" + this.api + ", code=" + this.code + ", message=" + this.message + ", data=" + this.data + ')';
    }

    @NotNull
    public final String toJson() {
        String json = JsonParserKt.getSharedGson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public /* synthetic */ HybridResponse(String str, int i11, String str2, Object obj, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : obj);
    }
}
