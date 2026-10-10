package l40;

import androidx.recyclerview.widget.DiffUtil;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.utils.extensions.C27039d;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l40.a */
/* JADX INFO: compiled from: BotAssetsItemDiffCallback.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/adapter/diff/BotAssetsItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "newList", "", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "oldList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getNewList", "()Ljava/util/List;", "setNewList", "(Ljava/util/List;)V", "getOldList", "setOldList", "getOldListSize", "", "getNewListSize", "areItemsTheSame", "", "oldItemPosition", "newItemPosition", "areContentsTheSame", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42053a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: c */
    @Nullable
    public List<BotAssetsTotalItemModel> f92337c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public List<BotAssetsTotalItemModel> f92338d;

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        List<BotAssetsTotalItemModel> list = this.f92338d;
        BotAssetsTotalItemModel botAssetsTotalItemModel = list != null ? list.get(oldItemPosition) : null;
        List<BotAssetsTotalItemModel> list2 = this.f92337c;
        return Intrinsics.areEqual(botAssetsTotalItemModel, list2 != null ? list2.get(newItemPosition) : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        BotAssetsTotalItemModel botAssetsTotalItemModel;
        BotAssetsTotalItemModel botAssetsTotalItemModel2;
        List<BotAssetsTotalItemModel> list = this.f92338d;
        Long itemId = null;
        Long itemId2 = (list == null || (botAssetsTotalItemModel2 = list.get(oldItemPosition)) == null) ? null : botAssetsTotalItemModel2.getItemId();
        List<BotAssetsTotalItemModel> list2 = this.f92337c;
        if (list2 != null && (botAssetsTotalItemModel = list2.get(newItemPosition)) != null) {
            itemId = botAssetsTotalItemModel.getItemId();
        }
        return Intrinsics.areEqual(itemId2, itemId);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        List<BotAssetsTotalItemModel> list = this.f92337c;
        return C27039d.m66650j(list != null ? Integer.valueOf(list.size()) : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        List<BotAssetsTotalItemModel> list = this.f92338d;
        return C27039d.m66650j(list != null ? Integer.valueOf(list.size()) : null);
    }

    public C42053a(@Nullable List<BotAssetsTotalItemModel> list, @Nullable List<BotAssetsTotalItemModel> list2) {
        this.f92337c = list;
        this.f92338d = list2;
    }
}
