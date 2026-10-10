package com.kubi.widget.web.file;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.file.f, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FileBridgeResult.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileActionResult;", "", "success", "", "errorCode", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getErrorCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FileActionResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String errorCode;

    public FileActionResult(boolean z11, @Nullable String str) {
        this.success = z11;
        this.errorCode = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileActionResult)) {
            return false;
        }
        FileActionResult fileActionResult = (FileActionResult) other;
        return this.success == fileActionResult.success && Intrinsics.areEqual(this.errorCode, fileActionResult.errorCode);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.errorCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FileActionResult(success=" + this.success + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ FileActionResult(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str);
    }
}
