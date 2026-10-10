package com.kubi.sdk.fileupload;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UploadBean.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/UploadResult;", "", "resultCode", "", "fileId", "", "errMessage", "(ILjava/lang/String;Ljava/lang/String;)V", "getErrMessage", "()Ljava/lang/String;", "setErrMessage", "(Ljava/lang/String;)V", "getFileId", "setFileId", "getResultCode", "()I", "setResultCode", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class UploadResult {

    @Nullable
    private String errMessage;

    @Nullable
    private String fileId;
    private int resultCode;

    public UploadResult() {
        this(0, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadResult)) {
            return false;
        }
        UploadResult uploadResult = (UploadResult) other;
        return this.resultCode == uploadResult.resultCode && Intrinsics.areEqual(this.fileId, uploadResult.fileId) && Intrinsics.areEqual(this.errMessage, uploadResult.errMessage);
    }

    public UploadResult(int i11, @Nullable String str, @Nullable String str2) {
        this.resultCode = i11;
        this.fileId = str;
        this.errMessage = str2;
    }

    public static /* synthetic */ UploadResult copy$default(UploadResult uploadResult, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = uploadResult.resultCode;
        }
        if ((i12 & 2) != 0) {
            str = uploadResult.fileId;
        }
        if ((i12 & 4) != 0) {
            str2 = uploadResult.errMessage;
        }
        return uploadResult.copy(i11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrMessage() {
        return this.errMessage;
    }

    @NotNull
    public final UploadResult copy(int resultCode, @Nullable String fileId, @Nullable String errMessage) {
        return new UploadResult(resultCode, fileId, errMessage);
    }

    @Nullable
    public final String getErrMessage() {
        return this.errMessage;
    }

    @Nullable
    public final String getFileId() {
        return this.fileId;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.resultCode) * 31;
        String str = this.fileId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errMessage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setErrMessage(@Nullable String str) {
        this.errMessage = str;
    }

    public final void setFileId(@Nullable String str) {
        this.fileId = str;
    }

    public final void setResultCode(int i11) {
        this.resultCode = i11;
    }

    @NotNull
    public String toString() {
        return "UploadResult(resultCode=" + this.resultCode + ", fileId=" + this.fileId + ", errMessage=" + this.errMessage + ')';
    }

    public /* synthetic */ UploadResult(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
    }
}
