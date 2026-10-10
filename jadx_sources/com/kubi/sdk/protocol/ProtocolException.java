package com.kubi.sdk.protocol;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProtocolException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/protocol/ProtocolException;", "", "code", "", "throwable", "data", "", "isIgnore", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;Z)V", "getCode", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "()Z", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class ProtocolException extends Throwable {

    @Nullable
    private final String code;

    @Nullable
    private final Object data;
    private final boolean isIgnore;

    @Nullable
    private final Throwable throwable;

    public ProtocolException() {
        this(null, null, null, false, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolException)) {
            return false;
        }
        ProtocolException protocolException = (ProtocolException) other;
        return Intrinsics.areEqual(this.code, protocolException.code) && Intrinsics.areEqual(this.throwable, protocolException.throwable) && Intrinsics.areEqual(this.data, protocolException.data) && this.isIgnore == protocolException.isIgnore;
    }

    public ProtocolException(@Nullable String str, @Nullable Throwable th2, @Nullable Object obj, boolean z11) {
        super(th2);
        this.code = str;
        this.throwable = th2;
        this.data = obj;
        this.isIgnore = z11;
    }

    public static /* synthetic */ ProtocolException copy$default(ProtocolException protocolException, String str, Throwable th2, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = protocolException.code;
        }
        if ((i11 & 2) != 0) {
            th2 = protocolException.throwable;
        }
        if ((i11 & 4) != 0) {
            obj = protocolException.data;
        }
        if ((i11 & 8) != 0) {
            z11 = protocolException.isIgnore;
        }
        return protocolException.copy(str, th2, obj, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsIgnore() {
        return this.isIgnore;
    }

    @NotNull
    public final ProtocolException copy(@Nullable String code, @Nullable Throwable throwable, @Nullable Object data, boolean isIgnore) {
        return new ProtocolException(code, throwable, data, isIgnore);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th2 = this.throwable;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        Object obj = this.data;
        int iHashCode3 = (iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
        boolean z11 = this.isIgnore;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode3 + r11;
    }

    public final boolean isIgnore() {
        return this.isIgnore;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "ProtocolException(code=" + this.code + ", throwable=" + this.throwable + ", data=" + this.data + ", isIgnore=" + this.isIgnore + ')';
    }

    public /* synthetic */ ProtocolException(String str, Throwable th2, Object obj, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? false : z11);
    }
}
