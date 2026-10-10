package com.kubi.assets;

import android.text.TextUtils;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.BotAssetEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.utils.C27099x;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.AssetV2Contract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2Contract.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Contract$UIState;", "Lcom/kubi/mvi/state/IState;", "overviewData", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "botAssetEntity", "Lcom/kubi/assets/entity/BotAssetEntity;", "<init>", "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Lcom/kubi/assets/entity/BotAssetEntity;)V", "getOverviewData", "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "getBotAssetEntity", "()Lcom/kubi/assets/entity/BotAssetEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2Contract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2Contract.kt\ncom/kubi/assets/AssetV2Contract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,54:1\n32#2:55\n*S KotlinDebug\n*F\n+ 1 AssetV2Contract.kt\ncom/kubi/assets/AssetV2Contract$UIState\n*L\n43#1:55\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final BotAssetEntity botAssetEntity;

    @Nullable
    private final AssetV2OverviewEntity overviewData;

    /* JADX WARN: Multi-variable type inference failed */
    public UIState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.overviewData, uIState.overviewData) && Intrinsics.areEqual(this.botAssetEntity, uIState.botAssetEntity);
    }

    public UIState(@Nullable AssetV2OverviewEntity assetV2OverviewEntity, @NotNull BotAssetEntity botAssetEntity) {
        Intrinsics.checkNotNullParameter(botAssetEntity, "botAssetEntity");
        this.overviewData = assetV2OverviewEntity;
        this.botAssetEntity = botAssetEntity;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, AssetV2OverviewEntity assetV2OverviewEntity, BotAssetEntity botAssetEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            assetV2OverviewEntity = uIState.overviewData;
        }
        if ((i11 & 2) != 0) {
            botAssetEntity = uIState.botAssetEntity;
        }
        return uIState.copy(assetV2OverviewEntity, botAssetEntity);
    }

    @NotNull
    public final UIState copy(@Nullable AssetV2OverviewEntity overviewData, @NotNull BotAssetEntity botAssetEntity) {
        Intrinsics.checkNotNullParameter(botAssetEntity, "botAssetEntity");
        return new UIState(overviewData, botAssetEntity);
    }

    @NotNull
    public final BotAssetEntity getBotAssetEntity() {
        return this.botAssetEntity;
    }

    @Nullable
    public final AssetV2OverviewEntity getOverviewData() {
        return this.overviewData;
    }

    public int hashCode() {
        AssetV2OverviewEntity assetV2OverviewEntity = this.overviewData;
        return ((assetV2OverviewEntity == null ? 0 : assetV2OverviewEntity.hashCode()) * 31) + this.botAssetEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "UIState(overviewData=" + this.overviewData + ", botAssetEntity=" + this.botAssetEntity + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UIState(AssetV2OverviewEntity assetV2OverviewEntity, BotAssetEntity botAssetEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Object objM103844constructorimpl;
        if ((i11 & 1) != 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String strM102326h = C46392a.m102326h(C42153h.f93593a.m92507K(), "");
                objM103844constructorimpl = Result.m103844constructorimpl(!TextUtils.isEmpty(strM102326h) ? (AssetV2OverviewEntity) C27099x.m66913c(strM102326h, AssetV2OverviewEntity.class) : null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            assetV2OverviewEntity = (AssetV2OverviewEntity) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
        this(assetV2OverviewEntity, (i11 & 2) != 0 ? new BotAssetEntity() : botAssetEntity);
    }
}
