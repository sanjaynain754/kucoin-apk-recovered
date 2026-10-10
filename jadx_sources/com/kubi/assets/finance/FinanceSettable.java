package com.kubi.assets.finance;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.assets.R$id;
import com.kubi.assets.R$mipmap;
import com.kubi.assets.entity.KcsRightsBonusEntity;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.finance.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FinanceSettable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceSettable;", "", "setKcsLevel", "", "item", "Lcom/kubi/assets/entity/ProductChildEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "setKcsLevelIcon", "kcsLevel", "", "setKcsLevelStyles", "applyRtlConstraints", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface FinanceSettable {
    /* JADX INFO: renamed from: b */
    default void m16763b(BaseViewHolder baseViewHolder, int i11) {
        int i12;
        if (i11 == 0 || i11 == 1) {
            i12 = R$mipmap.asset_kcs1_icon;
        } else if (i11 != 2) {
            i12 = i11 != 3 ? R$mipmap.asset_kcs4_icon : R$mipmap.asset_kcs3_icon;
        } else {
            i12 = R$mipmap.asset_kcs2_icon;
        }
        baseViewHolder.setImageResource(R$id.ivKcsIcon, i12);
    }

    /* JADX INFO: renamed from: d */
    default void m16764d(@Nullable ProductChildEntity productChildEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        KcsRightsBonusEntity kcsRightsBonus = productChildEntity != null ? productChildEntity.getKcsRightsBonus() : null;
        if ((kcsRightsBonus != null ? kcsRightsBonus.getKcsLevel() : null) == null) {
            helper.setGone(R$id.ivKcsIcon, false);
        } else {
            m16766f(helper, C27039d.m66650j(kcsRightsBonus.getKcsLevel()));
            m16763b(helper, C27039d.m66650j(kcsRightsBonus.getKcsLevel()));
        }
    }

    /* JADX INFO: renamed from: e */
    default void m16765e(@NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (C5303w0.m6511a()) {
            ImageView imageView = (ImageView) helper.getView(R$id.ivKcsIcon);
            TextView textView = (TextView) helper.getView(R$id.tvAnnualized);
            ConstraintSet constraintSet = new ConstraintSet();
            View view = helper.itemView;
            ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
            if (constraintLayout == null) {
                return;
            }
            constraintSet.clone(constraintLayout);
            constraintSet.setMargin(imageView.getId(), 7, C27040e.m66658b(5));
            constraintSet.connect(textView.getId(), 7, 0, 7);
            constraintSet.connect(imageView.getId(), 7, textView.getId(), 6);
            constraintSet.applyTo(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: f */
    default void m16766f(BaseViewHolder baseViewHolder, int i11) {
        m16765e(baseViewHolder);
    }
}
