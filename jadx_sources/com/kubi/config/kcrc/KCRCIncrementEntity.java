package com.kubi.config.kcrc;

import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRemoteConfigEntity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRCIncrementEntity;", "", "success", "", "code", "", "data", "Lcom/kubi/config/kcrc/KCRCDataIncrement;", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/config/kcrc/KCRCDataIncrement;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/kubi/config/kcrc/KCRCDataIncrement;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/config/kcrc/KCRCDataIncrement;)Lcom/kubi/config/kcrc/KCRCIncrementEntity;", "equals", "other", "hashCode", "", "needRetry", "toString", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class KCRCIncrementEntity {

    @Nullable
    private final String code;

    @Nullable
    private final KCRCDataIncrement data;

    @Nullable
    private final Boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCRCIncrementEntity)) {
            return false;
        }
        KCRCIncrementEntity kCRCIncrementEntity = (KCRCIncrementEntity) other;
        return Intrinsics.areEqual(this.success, kCRCIncrementEntity.success) && Intrinsics.areEqual(this.code, kCRCIncrementEntity.code) && Intrinsics.areEqual(this.data, kCRCIncrementEntity.data);
    }

    public static /* synthetic */ KCRCIncrementEntity copy$default(KCRCIncrementEntity kCRCIncrementEntity, Boolean bool, String str, KCRCDataIncrement kCRCDataIncrement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = kCRCIncrementEntity.success;
        }
        if ((i11 & 2) != 0) {
            str = kCRCIncrementEntity.code;
        }
        if ((i11 & 4) != 0) {
            kCRCDataIncrement = kCRCIncrementEntity.data;
        }
        return kCRCIncrementEntity.copy(bool, str, kCRCDataIncrement);
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
    public final KCRCDataIncrement getData() {
        return this.data;
    }

    @NotNull
    public final KCRCIncrementEntity copy(@Nullable Boolean success, @Nullable String code, @Nullable KCRCDataIncrement data) {
        return new KCRCIncrementEntity(success, code, data);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final KCRCDataIncrement getData() {
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
        KCRCDataIncrement kCRCDataIncrement = this.data;
        return iHashCode2 + (kCRCDataIncrement != null ? kCRCDataIncrement.hashCode() : 0);
    }

    public final boolean needRetry() {
        return ((Intrinsics.areEqual(this.success, Boolean.TRUE) && Intrinsics.areEqual(this.code, "200")) || C11416b.f19681a.m20553a().contains(C27041f.m66668h(this.code))) ? false : true;
    }

    @NotNull
    public String toString() {
        return "KCRCIncrementEntity(success=" + this.success + ", code=" + this.code + ", data=" + this.data + ')';
    }

    public KCRCIncrementEntity(@Nullable Boolean bool, @Nullable String str, @Nullable KCRCDataIncrement kCRCDataIncrement) {
        this.success = bool;
        this.code = str;
        this.data = kCRCDataIncrement;
    }
}
