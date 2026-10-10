package y70;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: y70.g, reason: from toString */
/* JADX INFO: compiled from: StorageId.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m90084d2 = {"Ly70/g;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "category", "key", "Lcom/kubi/utils/storage/StorageType;", "storageType", "", "supportLegacy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V", "siteType", "isStandalone", "e", "(Ljava/lang/String;Z)Ljava/lang/String;", "uid", "f", "(Ljava/lang/String;)Ly70/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "c", "Lcom/kubi/utils/storage/StorageType;", "()Lcom/kubi/utils/storage/StorageType;", "d", "Z", "()Z", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStorageId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,67:1\n46#1:68\n*S KotlinDebug\n*F\n+ 1 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n59#1:68\n*E\n"})
public final /* data */ class StorageId<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final StorageType storageType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean supportLegacy;

    public StorageId(@NotNull String category, @NotNull String key, @NotNull StorageType storageType, boolean z11) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.category = category;
        this.key = key;
        this.storageType = storageType;
        this.supportLegacy = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageId)) {
            return false;
        }
        StorageId storageId = (StorageId) other;
        return Intrinsics.areEqual(this.category, storageId.category) && Intrinsics.areEqual(this.key, storageId.key) && this.storageType == storageId.storageType && this.supportLegacy == storageId.supportLegacy;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final StorageType getStorageType() {
        return this.storageType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSupportLegacy() {
        return this.supportLegacy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.category.hashCode() * 31) + this.key.hashCode()) * 31) + this.storageType.hashCode()) * 31;
        boolean z11 = this.supportLegacy;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    @NotNull
    public String toString() {
        return "StorageId(category=" + this.category + ", key=" + this.key + ", storageType=" + this.storageType + ", supportLegacy=" + this.supportLegacy + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m102383e(@NotNull String siteType, boolean isStandalone) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        if (this.storageType != StorageType.Shared && !isStandalone) {
            return this.category + ".site_" + siteType;
        }
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<T> m102384f(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new StorageId<>(getCategory(), getKey() + '-' + uid, getStorageType(), getSupportLegacy());
    }

    public /* synthetic */ StorageId(String str, String str2, StorageType storageType, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? StorageType.LocalSite : storageType, (i11 & 8) != 0 ? false : z11);
    }
}
