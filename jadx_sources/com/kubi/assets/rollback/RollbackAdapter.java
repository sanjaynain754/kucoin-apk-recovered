package com.kubi.assets.rollback;

import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.RollbackEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RollbackAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/rollback/RollbackAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/RollbackEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "convertToString", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRollbackAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RollbackAdapter.kt\ncom/kubi/assets/rollback/RollbackAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1563#2:58\n1634#2,3:59\n*S KotlinDebug\n*F\n+ 1 RollbackAdapter.kt\ncom/kubi/assets/rollback/RollbackAdapter\n*L\n48#1:58\n48#1:59,3\n*E\n"})
public final class RollbackAdapter extends BaseQuickAdapter<RollbackEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f18562i = new Companion(null);

    /* JADX INFO: compiled from: RollbackAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/rollback/RollbackAdapter$Companion;", "", "<init>", "()V", "FREEZE_OTHER_COIN", "", "FREEZE_WITHDRAW", "FREEZE_TRADE", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RollbackAdapter() {
        super(R$layout.asset_item_rollback);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull RollbackEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = helper.setText(R$id.tv_coin_name, item.getCurrency());
        int i11 = R$id.tv_time;
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.asset_rollback_time, new Object[0]));
        sb2.append(' ');
        sb2.append(C42179a.m92633f(item.getCreatedAt(), null, false, false, null, 15, null));
        text.setText(i11, sb2.toString()).setText(R$id.tv_number, C37885i.m85563b(DowngradeExKt.m66535e(item.getAmount(), null, 1, null), item.getCurrency(), 0, 2, null) + ' ' + item.getCurrency()).setText(R$id.tv_txid_title, c27017c.m66516f(R$string.deposit_coin, new Object[0]) + "txid").setText(R$id.tv_txid, item.getWalletTxId()).setText(R$id.tv_owed_number, C37885i.m85563b(DowngradeExKt.m66535e(item.getArrears(), null, 1, null), item.getCurrency(), 0, 2, null) + ' ' + item.getCurrency()).setText(R$id.tv_status, m18902h(item));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX INFO: renamed from: h */
    public final String m18902h(RollbackEntity rollbackEntity) {
        Object objM66516f;
        List<String> disposalSteps = rollbackEntity.getDisposalSteps();
        if (disposalSteps != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(disposalSteps, 10));
            for (String str : disposalSteps) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1448107736) {
                    if (iHashCode != 137100700) {
                        if (iHashCode == 1936619442 && str.equals("FREEZE_WITHDRAW")) {
                            objM66516f = C27017c.f54310a.m66516f(R$string.asset_rollback_step2, new Object[0]);
                        } else {
                            objM66516f = Unit.INSTANCE;
                        }
                    } else if (str.equals("FREEZE_TRADE")) {
                        objM66516f = C27017c.f54310a.m66516f(R$string.asset_rollback_step3, new Object[0]);
                    } else {
                        objM66516f = Unit.INSTANCE;
                    }
                } else if (!str.equals("FREEZE_OTHER_COIN")) {
                    objM66516f = Unit.INSTANCE;
                } else {
                    objM66516f = C27017c.f54310a.m66516f(R$string.asset_rollback_step1, new Object[0]);
                }
                arrayList.add(objM66516f);
            }
            return CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        }
        return null;
    }
}
