package sh;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sh.d, reason: from toString */
/* JADX INFO: compiled from: EuropeUnlockLeverageComposeEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageComposeEntity;", "", FirebaseAnalytics.Param.LEVEL, "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "tasks", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "<init>", "(Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;Ljava/util/List;)V", "getLevel", "()Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "getTasks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeUnlockLeverageComposeEntity {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final EuropeUnlockLeverageLevelEntity level;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final List<EuropeUnlockLeverageLevelTaskEntity> tasks;

    /* JADX WARN: Multi-variable type inference failed */
    public EuropeUnlockLeverageComposeEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EuropeUnlockLeverageComposeEntity)) {
            return false;
        }
        EuropeUnlockLeverageComposeEntity europeUnlockLeverageComposeEntity = (EuropeUnlockLeverageComposeEntity) other;
        return Intrinsics.areEqual(this.level, europeUnlockLeverageComposeEntity.level) && Intrinsics.areEqual(this.tasks, europeUnlockLeverageComposeEntity.tasks);
    }

    public EuropeUnlockLeverageComposeEntity(@Nullable EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity, @Nullable List<EuropeUnlockLeverageLevelTaskEntity> list) {
        this.level = europeUnlockLeverageLevelEntity;
        this.tasks = list;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EuropeUnlockLeverageLevelEntity getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<EuropeUnlockLeverageLevelTaskEntity> m97961b() {
        return this.tasks;
    }

    public int hashCode() {
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity = this.level;
        int iHashCode = (europeUnlockLeverageLevelEntity == null ? 0 : europeUnlockLeverageLevelEntity.hashCode()) * 31;
        List<EuropeUnlockLeverageLevelTaskEntity> list = this.tasks;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EuropeUnlockLeverageComposeEntity(level=" + this.level + ", tasks=" + this.tasks + ')';
    }

    public /* synthetic */ EuropeUnlockLeverageComposeEntity(EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : europeUnlockLeverageLevelEntity, (i11 & 2) != 0 ? null : list);
    }
}
