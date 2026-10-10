package com.kubi.tradingbotkit.business.asset;

import androidx.recyclerview.widget.DiffUtil;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.b, reason: from toString */
/* JADX INFO: compiled from: BotAssetsContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;", "", "showList", "", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "<init>", "(Ljava/util/List;Landroidx/recyclerview/widget/DiffUtil$DiffResult;)V", "getShowList", "()Ljava/util/List;", "setShowList", "(Ljava/util/List;)V", "getDiffResult", "()Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "setDiffResult", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DiffList {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public List<BotAssetsTotalItemModel> showList;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public DiffUtil.DiffResult diffResult;

    /* JADX WARN: Multi-variable type inference failed */
    public DiffList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiffList)) {
            return false;
        }
        DiffList diffList = (DiffList) other;
        return Intrinsics.areEqual(this.showList, diffList.showList) && Intrinsics.areEqual(this.diffResult, diffList.diffResult);
    }

    public DiffList(@Nullable List<BotAssetsTotalItemModel> list, @Nullable DiffUtil.DiffResult diffResult) {
        this.showList = list;
        this.diffResult = diffResult;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DiffUtil.DiffResult getDiffResult() {
        return this.diffResult;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<BotAssetsTotalItemModel> m63779b() {
        return this.showList;
    }

    /* JADX INFO: renamed from: c */
    public final void m63780c(@Nullable DiffUtil.DiffResult diffResult) {
        this.diffResult = diffResult;
    }

    /* JADX INFO: renamed from: d */
    public final void m63781d(@Nullable List<BotAssetsTotalItemModel> list) {
        this.showList = list;
    }

    public int hashCode() {
        List<BotAssetsTotalItemModel> list = this.showList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        DiffUtil.DiffResult diffResult = this.diffResult;
        return iHashCode + (diffResult != null ? diffResult.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DiffList(showList=" + this.showList + ", diffResult=" + this.diffResult + ')';
    }

    public /* synthetic */ DiffList(List list, DiffUtil.DiffResult diffResult, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : diffResult);
    }
}
