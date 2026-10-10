package com.kubi.config.kcrc;

import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRemoteConfigEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRCAllEntity;", "", "success", "", "code", "", "data", "Lcom/kubi/config/kcrc/KCRCDataAll;", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/config/kcrc/KCRCDataAll;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/kubi/config/kcrc/KCRCDataAll;", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/config/kcrc/KCRCDataAll;)Lcom/kubi/config/kcrc/KCRCAllEntity;", "equals", "other", "hashCode", "", "needRetry", "toString", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class KCRCAllEntity {

    @Nullable
    private final String code;

    @Nullable
    private final KCRCDataAll data;

    @Nullable
    private Boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCRCAllEntity)) {
            return false;
        }
        KCRCAllEntity kCRCAllEntity = (KCRCAllEntity) other;
        return Intrinsics.areEqual(this.success, kCRCAllEntity.success) && Intrinsics.areEqual(this.code, kCRCAllEntity.code) && Intrinsics.areEqual(this.data, kCRCAllEntity.data);
    }

    public static /* synthetic */ KCRCAllEntity copy$default(KCRCAllEntity kCRCAllEntity, Boolean bool, String str, KCRCDataAll kCRCDataAll, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = kCRCAllEntity.success;
        }
        if ((i11 & 2) != 0) {
            str = kCRCAllEntity.code;
        }
        if ((i11 & 4) != 0) {
            kCRCDataAll = kCRCAllEntity.data;
        }
        return kCRCAllEntity.copy(bool, str, kCRCDataAll);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KCRCDataAll getData() {
        return this.data;
    }

    @NotNull
    public final KCRCAllEntity copy(@Nullable Boolean success, @Nullable String code, @Nullable KCRCDataAll data) {
        return new KCRCAllEntity(success, code, data);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final KCRCDataAll getData() {
        return this.data;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        KCRCDataAll kCRCDataAll = this.data;
        return iHashCode2 + (kCRCDataAll != null ? kCRCDataAll.hashCode() : 0);
    }

    public final boolean needRetry() {
        return ((Intrinsics.areEqual(this.success, Boolean.TRUE) && Intrinsics.areEqual(this.code, "200")) || C11416b.f19681a.m20553a().contains(C27041f.m66668h(this.code))) ? false : true;
    }

    public final void setSuccess(@Nullable Boolean bool) {
        this.success = bool;
    }

    @NotNull
    public String toString() {
        return "KCRCAllEntity(success=" + this.success + ", code=" + this.code + ", data=" + this.data + ')';
    }

    public KCRCAllEntity(@Nullable Boolean bool, @Nullable String str, @Nullable KCRCDataAll kCRCDataAll) {
        this.success = bool;
        this.code = str;
        this.data = kCRCDataAll;
    }
}
