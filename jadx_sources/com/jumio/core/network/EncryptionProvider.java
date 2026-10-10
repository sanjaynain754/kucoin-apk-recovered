package com.jumio.core.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jumio.core.C40504A2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000eÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/network/EncryptionProvider;", "", "createRequest", "Ljava/io/OutputStream;", "outputStream", "dataLength", "", "contentType", "", "getResponse", "inputStream", "Ljava/io/InputStream;", "finishRequest", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface EncryptionProvider {
    @NotNull
    OutputStream createRequest(@NotNull OutputStream outputStream, int dataLength, @NotNull String contentType) throws Exception;

    void finishRequest();

    @NotNull
    String getResponse(@Nullable InputStream inputStream) throws C40504A2, IOException;
}
