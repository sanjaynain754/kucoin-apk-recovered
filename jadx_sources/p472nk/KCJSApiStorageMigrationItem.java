package p472nk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nk.b, reason: from toString */
/* JADX INFO: compiled from: KCJSApiStorageMigrationHelper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationItem;", "", "legacyCategory", "", "sourceKey", "targetKey", "targetBiz", "overwrite", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLegacyCategory", "()Ljava/lang/String;", "getSourceKey", "getTargetKey", "getTargetBiz", "getOverwrite", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCJSApiStorageMigrationItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String legacyCategory;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String sourceKey;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String targetKey;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String targetBiz;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final boolean overwrite;

    public KCJSApiStorageMigrationItem(@NotNull String legacyCategory, @NotNull String sourceKey, @NotNull String targetKey, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(legacyCategory, "legacyCategory");
        Intrinsics.checkNotNullParameter(sourceKey, "sourceKey");
        Intrinsics.checkNotNullParameter(targetKey, "targetKey");
        this.legacyCategory = legacyCategory;
        this.sourceKey = sourceKey;
        this.targetKey = targetKey;
        this.targetBiz = str;
        this.overwrite = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiStorageMigrationItem)) {
            return false;
        }
        KCJSApiStorageMigrationItem kCJSApiStorageMigrationItem = (KCJSApiStorageMigrationItem) other;
        return Intrinsics.areEqual(this.legacyCategory, kCJSApiStorageMigrationItem.legacyCategory) && Intrinsics.areEqual(this.sourceKey, kCJSApiStorageMigrationItem.sourceKey) && Intrinsics.areEqual(this.targetKey, kCJSApiStorageMigrationItem.targetKey) && Intrinsics.areEqual(this.targetBiz, kCJSApiStorageMigrationItem.targetBiz) && this.overwrite == kCJSApiStorageMigrationItem.overwrite;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLegacyCategory() {
        return this.legacyCategory;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getOverwrite() {
        return this.overwrite;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSourceKey() {
        return this.sourceKey;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTargetBiz() {
        return this.targetBiz;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTargetKey() {
        return this.targetKey;
    }

    public int hashCode() {
        int iHashCode = ((((this.legacyCategory.hashCode() * 31) + this.sourceKey.hashCode()) * 31) + this.targetKey.hashCode()) * 31;
        String str = this.targetBiz;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.overwrite);
    }

    @NotNull
    public String toString() {
        return "KCJSApiStorageMigrationItem(legacyCategory=" + this.legacyCategory + ", sourceKey=" + this.sourceKey + ", targetKey=" + this.targetKey + ", targetBiz=" + this.targetBiz + ", overwrite=" + this.overwrite + ')';
    }

    public /* synthetic */ KCJSApiStorageMigrationItem(String str, String str2, String str3, String str4, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? false : z11);
    }
}
