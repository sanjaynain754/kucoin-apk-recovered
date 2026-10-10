package com.kubi.mine.lib.p101ui;

import android.view.View;
import android.widget.ImageView;
import com.kubi.mine.R$id;
import com.kubi.mine.R$mipmap;
import com.kubi.mine.lib.entity.AvatarEntity;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChooseAvatarFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/mine/lib/ui/ChooseAvatarFragment$onViewCreated$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/mine/lib/entity/AvatarEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChooseAvatarFragment$onViewCreated$1 extends BaseQuickAdapter<AvatarEntity, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AvatarEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) helper.getView(R$id.iv_avatar);
        C46338a.m102152b(imageView).mo6634v(item.getImgUrl()).mo6606a(new C42032f().mo92188b0(R$mipmap.mine_ic_avatar_placeholder)).m6594E0(imageView);
        helper.setImageResource(R$id.iv_check_status, item.isChecked() ? R$mipmap.kucoin_icon_blue_white_yes : 0);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseAvatarFragment$onViewCreated$1.m41895i(this.f35392b, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m41895i(ChooseAvatarFragment$onViewCreated$1 chooseAvatarFragment$onViewCreated$1, AvatarEntity avatarEntity) {
        Iterator<AvatarEntity> it = chooseAvatarFragment$onViewCreated$1.getData().iterator();
        while (it.hasNext()) {
            it.next().setChecked(false);
        }
        avatarEntity.setChecked(true);
        chooseAvatarFragment$onViewCreated$1.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
