package com.kubi.home.deposit;

import android.view.View;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeDepositAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u0010\f\u001a\u00020\t*\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0014\u0010\f\u001a\u00020\t*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/deposit/HomeDepositAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "dataList", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "render", "Lcom/kubi/home/deposit/DepositTitleEntity;", "Lcom/kubi/home/deposit/DepositItemEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeDepositAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeDepositAdapter(@NotNull List<? extends MultiItemEntity> dataList) {
        super(dataList);
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        addItemType(0, R$layout.home_deposit_item_title);
        addItemType(1, R$layout.home_deposit_item_data);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m29100l(final DepositItemEntity depositItemEntity) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.home.deposit.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeDepositAdapter.m29101m(depositItemEntity);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MultiItemEntity multiItemEntity) {
        if (baseViewHolder == null) {
            return;
        }
        if (multiItemEntity instanceof DepositTitleEntity) {
            m29104k((DepositTitleEntity) multiItemEntity, baseViewHolder);
        }
        if (multiItemEntity instanceof DepositItemEntity) {
            m29103j((DepositItemEntity) multiItemEntity, baseViewHolder);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m29103j(final DepositItemEntity depositItemEntity, BaseViewHolder baseViewHolder) {
        baseViewHolder.setImageResource(R$id.ivIcon, depositItemEntity.getIconResId());
        baseViewHolder.setText(R$id.tvTitle, depositItemEntity.getTitle());
        baseViewHolder.setText(R$id.tvTips, depositItemEntity.getTips());
        baseViewHolder.setGone(R$id.klvRecommend, depositItemEntity.isRecommend());
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.home.deposit.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeDepositAdapter.m29100l(depositItemEntity);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m29104k(DepositTitleEntity depositTitleEntity, BaseViewHolder baseViewHolder) {
        baseViewHolder.setText(R$id.tvTitle, depositTitleEntity.getTitle());
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m29101m(DepositItemEntity depositItemEntity) {
        depositItemEntity.getOnClick().invoke();
        return Unit.INSTANCE;
    }
}
