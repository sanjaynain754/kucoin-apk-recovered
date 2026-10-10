package com.kubi.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "status", "Lcom/kubi/sdk/Status;", "data", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Lcom/kubi/sdk/Status;Ljava/lang/Object;Ljava/lang/Throwable;)V", "getStatus", "()Lcom/kubi/sdk/Status;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "(Lcom/kubi/sdk/Status;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/kubi/sdk/Resource;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Resource<T> {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f46439d = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final Status status;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final T data;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Throwable error;

    /* JADX INFO: compiled from: BaseViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/Resource$Companion;", "", "<init>", "()V", "success", "Lcom/kubi/sdk/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Ljava/lang/Object;)Lcom/kubi/sdk/Resource;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "(Ljava/lang/Throwable;Ljava/lang/Object;)Lcom/kubi/sdk/Resource;", "loading", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource error$default(Companion companion, Throwable th2, Object obj, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                obj = null;
            }
            return companion.error(th2, obj);
        }

        @NotNull
        public final <T> Resource<T> error(@Nullable Throwable error, @Nullable T data) {
            return new Resource<>(Status.ERROR, null, error);
        }

        @NotNull
        public final <T> Resource<T> loading(@Nullable T data) {
            return new Resource<>(Status.LOADING, data, null);
        }

        @NotNull
        public final <T> Resource<T> success(@Nullable T data) {
            return new Resource<>(Status.SUCCESS, data, null);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return this.status == resource.status && Intrinsics.areEqual(this.data, resource.data) && Intrinsics.areEqual(this.error, resource.error);
    }

    public Resource(@NotNull Status status, @Nullable T t11, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t11;
        this.error = th2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m56500a() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        T t11 = this.data;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        Throwable th2 = this.error;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Resource(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ')';
    }
}
