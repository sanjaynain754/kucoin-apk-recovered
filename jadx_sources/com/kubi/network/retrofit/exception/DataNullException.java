package com.kubi.network.retrofit.exception;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataNullException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/retrofit/exception/DataNullException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class DataNullException extends Exception {

    @NotNull
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public DataNullException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataNullException(@NotNull String url) {
        super("Data is null");
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ DataNullException(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
