package com.jumio.core.data.scan;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0002X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/data/scan/FileDataInterface;", "Lcom/jumio/core/data/scan/DataInterface;", "", "fileName", "getFileName", "()Ljava/lang/String;", "fileType", "getFileType", "setFileType", "(Ljava/lang/String;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface FileDataInterface extends DataInterface<String> {
    @NotNull
    String getFileName();

    @NotNull
    String getFileType();

    void setFileType(@NotNull String str);
}
