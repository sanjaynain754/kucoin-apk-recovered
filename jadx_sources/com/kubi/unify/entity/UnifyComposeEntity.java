package com.kubi.unify.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyComposeEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyComposeEntity;", "", "messageType", "", "userEquity", "Lcom/kubi/unify/entity/WsUnifyAccountOverviewEntity;", "accountEquity", "", "Lcom/kubi/unify/entity/WsUnifyFundsInfoEntity;", "positions", "Lcom/kubi/unify/entity/WsUnifyPositionEntity;", "<init>", "(Ljava/lang/String;Lcom/kubi/unify/entity/WsUnifyAccountOverviewEntity;Ljava/util/List;Ljava/util/List;)V", "getMessageType", "()Ljava/lang/String;", "getUserEquity", "()Lcom/kubi/unify/entity/WsUnifyAccountOverviewEntity;", "getAccountEquity", "()Ljava/util/List;", "getPositions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyComposeEntity {

    @SerializedName("aE")
    @Nullable
    private final List<WsUnifyFundsInfoEntity> accountEquity;

    @SerializedName("mT")
    @Nullable
    private final String messageType;

    @SerializedName("p")
    @Nullable
    private final List<WsUnifyPositionEntity> positions;

    @SerializedName("uE")
    @Nullable
    private final WsUnifyAccountOverviewEntity userEquity;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyComposeEntity)) {
            return false;
        }
        UnifyComposeEntity unifyComposeEntity = (UnifyComposeEntity) other;
        return Intrinsics.areEqual(this.messageType, unifyComposeEntity.messageType) && Intrinsics.areEqual(this.userEquity, unifyComposeEntity.userEquity) && Intrinsics.areEqual(this.accountEquity, unifyComposeEntity.accountEquity) && Intrinsics.areEqual(this.positions, unifyComposeEntity.positions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifyComposeEntity copy$default(UnifyComposeEntity unifyComposeEntity, String str, WsUnifyAccountOverviewEntity wsUnifyAccountOverviewEntity, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyComposeEntity.messageType;
        }
        if ((i11 & 2) != 0) {
            wsUnifyAccountOverviewEntity = unifyComposeEntity.userEquity;
        }
        if ((i11 & 4) != 0) {
            list = unifyComposeEntity.accountEquity;
        }
        if ((i11 & 8) != 0) {
            list2 = unifyComposeEntity.positions;
        }
        return unifyComposeEntity.copy(str, wsUnifyAccountOverviewEntity, list, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WsUnifyAccountOverviewEntity getUserEquity() {
        return this.userEquity;
    }

    @Nullable
    public final List<WsUnifyFundsInfoEntity> component3() {
        return this.accountEquity;
    }

    @Nullable
    public final List<WsUnifyPositionEntity> component4() {
        return this.positions;
    }

    @NotNull
    public final UnifyComposeEntity copy(@Nullable String messageType, @Nullable WsUnifyAccountOverviewEntity userEquity, @Nullable List<WsUnifyFundsInfoEntity> accountEquity, @Nullable List<WsUnifyPositionEntity> positions) {
        return new UnifyComposeEntity(messageType, userEquity, accountEquity, positions);
    }

    @Nullable
    public final List<WsUnifyFundsInfoEntity> getAccountEquity() {
        return this.accountEquity;
    }

    @Nullable
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final List<WsUnifyPositionEntity> getPositions() {
        return this.positions;
    }

    @Nullable
    public final WsUnifyAccountOverviewEntity getUserEquity() {
        return this.userEquity;
    }

    public int hashCode() {
        String str = this.messageType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        WsUnifyAccountOverviewEntity wsUnifyAccountOverviewEntity = this.userEquity;
        int iHashCode2 = (iHashCode + (wsUnifyAccountOverviewEntity == null ? 0 : wsUnifyAccountOverviewEntity.hashCode())) * 31;
        List<WsUnifyFundsInfoEntity> list = this.accountEquity;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<WsUnifyPositionEntity> list2 = this.positions;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyComposeEntity(messageType=" + this.messageType + ", userEquity=" + this.userEquity + ", accountEquity=" + this.accountEquity + ", positions=" + this.positions + ')';
    }

    public UnifyComposeEntity(@Nullable String str, @Nullable WsUnifyAccountOverviewEntity wsUnifyAccountOverviewEntity, @Nullable List<WsUnifyFundsInfoEntity> list, @Nullable List<WsUnifyPositionEntity> list2) {
        this.messageType = str;
        this.userEquity = wsUnifyAccountOverviewEntity;
        this.accountEquity = list;
        this.positions = list2;
    }
}
