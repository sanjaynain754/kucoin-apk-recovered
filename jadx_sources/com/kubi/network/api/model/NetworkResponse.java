package com.kubi.network.api.model;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NetworkResponse.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/api/model/NetworkResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "code", "", "data", "(ILjava/lang/Object;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class NetworkResponse<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @Nullable
    private final T data;

    /* JADX INFO: compiled from: NetworkResponse.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/api/model/NetworkResponse$Companion;", "", "()V", "success", "Lcom/kubi/network/api/model/NetworkResponse;", ExifInterface.GPS_DIRECTION_TRUE, TtmlNode.TAG_BODY, "(Ljava/lang/Object;)Lcom/kubi/network/api/model/NetworkResponse;", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NetworkResponse success$default(Companion companion, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = null;
            }
            return companion.success(obj);
        }

        @NotNull
        public final <T> NetworkResponse<T> success(@Nullable T body) {
            return new NetworkResponse<>(200, body);
        }
    }

    public NetworkResponse(int i11, @Nullable T t11) {
        this.code = i11;
        this.data = t11;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public /* synthetic */ NetworkResponse(int i11, Object obj, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : obj);
    }
}
