package com.kubi.httpdns.request;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultDecoder.kt */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/httpdns/request/AnswerEntity;", "", "name", "", "type", "", "TTL", "data", "(Ljava/lang/String;IILjava/lang/String;)V", "getTTL", "()I", "getData", "()Ljava/lang/String;", "getName", "getType", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
final class AnswerEntity {
    private final int TTL;

    @NotNull
    private final String data;

    @NotNull
    private final String name;
    private final int type;

    public AnswerEntity(@NotNull String name, int i11, int i12, @NotNull String data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        this.name = name;
        this.type = i11;
        this.TTL = i12;
        this.data = data;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getTTL() {
        return this.TTL;
    }

    public final int getType() {
        return this.type;
    }
}
