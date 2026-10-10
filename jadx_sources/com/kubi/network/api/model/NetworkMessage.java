package com.kubi.network.api.model;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NetworkResponse.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/network/api/model/NetworkMessage;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "()Ljava/lang/String;", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class NetworkMessage<T> {

    @Nullable
    private final T data;

    @Nullable
    private final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkMessage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public NetworkMessage(@Nullable String str, @Nullable T t11) {
        this.id = str;
        this.data = t11;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public /* synthetic */ NetworkMessage(String str, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : obj);
    }
}
