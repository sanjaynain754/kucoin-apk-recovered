package com.kubi.sdk.base.entity;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseWrapEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0012JD\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/base/entity/BaseWrapEntity;", ExifInterface.GPS_DIRECTION_TRUE, "", "success", "", "code", "", "msg", "data", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCode", "()Ljava/lang/String;", "getMsg", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isSuccess", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/kubi/sdk/base/entity/BaseWrapEntity;", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BaseWrapEntity<T> {

    @SerializedName("code")
    @Nullable
    private final String code;

    @SerializedName("data")
    @Nullable
    private final T data;

    @SerializedName("msg")
    @Nullable
    private final String msg;

    @SerializedName("success")
    @Nullable
    private final Boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseWrapEntity)) {
            return false;
        }
        BaseWrapEntity baseWrapEntity = (BaseWrapEntity) other;
        return Intrinsics.areEqual(this.success, baseWrapEntity.success) && Intrinsics.areEqual(this.code, baseWrapEntity.code) && Intrinsics.areEqual(this.msg, baseWrapEntity.msg) && Intrinsics.areEqual(this.data, baseWrapEntity.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseWrapEntity copy$default(BaseWrapEntity baseWrapEntity, Boolean bool, String str, String str2, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            bool = baseWrapEntity.success;
        }
        if ((i11 & 2) != 0) {
            str = baseWrapEntity.code;
        }
        if ((i11 & 4) != 0) {
            str2 = baseWrapEntity.msg;
        }
        if ((i11 & 8) != 0) {
            obj = baseWrapEntity.data;
        }
        return baseWrapEntity.copy(bool, str, str2, obj);
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
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final T component4() {
        return this.data;
    }

    @NotNull
    public final BaseWrapEntity<T> copy(@Nullable Boolean success, @Nullable String code, @Nullable String msg, @Nullable T data) {
        return new BaseWrapEntity<>(success, code, msg, data);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
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
        String str2 = this.msg;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        T t11 = this.data;
        return iHashCode3 + (t11 != null ? t11.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return C27025c.m66566d(this.success) || Intrinsics.areEqual("200", this.code);
    }

    @NotNull
    public String toString() {
        return "BaseWrapEntity(success=" + this.success + ", code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ')';
    }

    public BaseWrapEntity(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable T t11) {
        this.success = bool;
        this.code = str;
        this.msg = str2;
        this.data = t11;
    }
}
