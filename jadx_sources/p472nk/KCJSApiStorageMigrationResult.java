package p472nk;

import com.kubi.jsbridge.impl.storage.KCJSApiStorageMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nk.c, reason: from toString */
/* JADX INFO: compiled from: KCJSApiStorageMigrationHelper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationResult;", "", "targetKey", "", "targetBiz", "status", "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationStatus;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationStatus;Ljava/lang/String;)V", "getTargetKey", "()Ljava/lang/String;", "getTargetBiz", "getStatus", "()Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationStatus;", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCJSApiStorageMigrationResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String targetKey;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String targetBiz;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final KCJSApiStorageMigrationStatus status;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String message;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiStorageMigrationResult)) {
            return false;
        }
        KCJSApiStorageMigrationResult kCJSApiStorageMigrationResult = (KCJSApiStorageMigrationResult) other;
        return Intrinsics.areEqual(this.targetKey, kCJSApiStorageMigrationResult.targetKey) && Intrinsics.areEqual(this.targetBiz, kCJSApiStorageMigrationResult.targetBiz) && this.status == kCJSApiStorageMigrationResult.status && Intrinsics.areEqual(this.message, kCJSApiStorageMigrationResult.message);
    }

    public KCJSApiStorageMigrationResult(@NotNull String targetKey, @Nullable String str, @NotNull KCJSApiStorageMigrationStatus status, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(targetKey, "targetKey");
        Intrinsics.checkNotNullParameter(status, "status");
        this.targetKey = targetKey;
        this.targetBiz = str;
        this.status = status;
        this.message = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final KCJSApiStorageMigrationStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTargetBiz() {
        return this.targetBiz;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTargetKey() {
        return this.targetKey;
    }

    public int hashCode() {
        int iHashCode = this.targetKey.hashCode() * 31;
        String str = this.targetBiz;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31;
        String str2 = this.message;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiStorageMigrationResult(targetKey=" + this.targetKey + ", targetBiz=" + this.targetBiz + ", status=" + this.status + ", message=" + this.message + ')';
    }
}
