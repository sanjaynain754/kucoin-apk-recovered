package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2POrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/FileSelect;", "", "path", "", "isLimit", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getPath", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/p2p/data/entities/FileSelect;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FileSelect {

    @Nullable
    private final Boolean isLimit;

    @Nullable
    private final String path;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileSelect)) {
            return false;
        }
        FileSelect fileSelect = (FileSelect) other;
        return Intrinsics.areEqual(this.path, fileSelect.path) && Intrinsics.areEqual(this.isLimit, fileSelect.isLimit);
    }

    public static /* synthetic */ FileSelect copy$default(FileSelect fileSelect, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fileSelect.path;
        }
        if ((i11 & 2) != 0) {
            bool = fileSelect.isLimit;
        }
        return fileSelect.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsLimit() {
        return this.isLimit;
    }

    @NotNull
    public final FileSelect copy(@Nullable String path, @Nullable Boolean isLimit) {
        return new FileSelect(path, isLimit);
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLimit;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLimit() {
        return this.isLimit;
    }

    @NotNull
    public String toString() {
        return "FileSelect(path=" + this.path + ", isLimit=" + this.isLimit + ')';
    }

    public FileSelect(@Nullable String str, @Nullable Boolean bool) {
        this.path = str;
        this.isLimit = bool;
    }
}
