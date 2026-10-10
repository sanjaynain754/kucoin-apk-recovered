package com.jumio.core.data.scan;

import java.io.File;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, m90084d2 = {"Lcom/jumio/core/data/scan/FileData;", "Lcom/jumio/core/data/scan/FileDataInterface;", "Ljava/io/Serializable;", "<init>", "()V", "hasData", "", "getHasData", "()Z", "fileName", "", "getFileName", "()Ljava/lang/String;", "mimeType", "getMimeType", "setMimeType", "(Ljava/lang/String;)V", "fileType", "getFileType", "setFileType", "data", "getData", "setData", "timestamp", "", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "clear", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class FileData implements FileDataInterface, Serializable {

    @Nullable
    private Long timestamp;

    @NotNull
    private String mimeType = "";

    @NotNull
    private String fileType = "";

    @NotNull
    private String data = "";

    @Override // com.jumio.core.data.scan.DataInterface
    @NotNull
    public String getData() {
        return this.data;
    }

    @Override // com.jumio.core.data.scan.FileDataInterface
    @NotNull
    public String getFileType() {
        return this.fileType;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    @NotNull
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    @Nullable
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    @Override // com.jumio.core.data.scan.FileDataInterface
    public void setFileType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileType = str;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void setMimeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mimeType = str;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void clear() {
        if (getHasData()) {
            new File(getData()).delete();
        }
        setData("");
        setMimeType("");
        setFileType("");
        setTimestamp(null);
    }

    @Override // com.jumio.core.data.scan.FileDataInterface
    @NotNull
    public String getFileName() {
        return StringsKt.substringAfterLast$default(getData(), "/", (String) null, 2, (Object) null);
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public boolean getHasData() {
        if (getData().length() > 0) {
            return true;
        }
        return false;
    }
}
