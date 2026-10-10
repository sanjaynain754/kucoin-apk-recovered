package bm;

import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bm.b, reason: from toString */
/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareAsset;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "<init>", "(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V", "getEntity", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareAsset implements InterfaceC4633f {

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final FuturesWelfareTrialItemEntity entity;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesWelfareAsset) && Intrinsics.areEqual(this.entity, ((FuturesWelfareAsset) other).entity);
    }

    public FuturesWelfareAsset(@NotNull FuturesWelfareTrialItemEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.entity = entity;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FuturesWelfareTrialItemEntity getEntity() {
        return this.entity;
    }

    public int hashCode() {
        return this.entity.hashCode();
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareAsset(entity=" + this.entity + ')';
    }
}
