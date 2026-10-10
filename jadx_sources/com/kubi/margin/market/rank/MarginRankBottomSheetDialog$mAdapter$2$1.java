package com.kubi.margin.market.rank;

import android.view.View;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.entity.Tag;
import com.kubi.margin.market.rank.MarginRankBottomSheetDialog$mAdapter$2$1;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;

/* JADX INFO: compiled from: MarginRankBottomSheetDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/margin/market/rank/MarginRankBottomSheetDialog$mAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/entity/Tag;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginRankBottomSheetDialog$mAdapter$2$1 extends BaseQuickAdapter<Tag, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ MarginRankBottomSheetDialog f33405i;

    /* JADX INFO: renamed from: com.kubi.margin.market.rank.MarginRankBottomSheetDialog$mAdapter$2$1$a */
    /* JADX INFO: compiled from: MarginRankBottomSheetDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C17947a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarginRankHelper.MarketRankType.values().length];
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_HOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_GAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_NEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_VOL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_LOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MarginRankHelper.MarketRankType.RANK_NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m39142i(MarginRankHelper.MarketRankType marketRankType, Tag tag, MarginRankBottomSheetDialog marginRankBottomSheetDialog, View view) {
        String str;
        switch (C17947a.$EnumSwitchMapping$0[marketRankType.ordinal()]) {
            case 1:
                str = "1";
                break;
            case 2:
                str = "2";
                break;
            case 3:
                str = "3";
                break;
            case 4:
                str = "4";
                break;
            case 5:
                str = "5";
                break;
            case 6:
                str = "6";
                break;
            case 7:
                str = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            C43852m.m96590b("B4candle", "OLabelPopup", str, TuplesKt.m90091to("symbol", marginRankBottomSheetDialog.getF33402d0()));
        }
        Router.f46192a.m56184f(marketRankType.getJumpUri()).m4038a("tagId", tag.getTagId()).m4048k();
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder baseViewHolder, final Tag tag) {
        final MarginRankHelper.MarketRankType marketRankTypeTypeByTag;
        if (baseViewHolder == null || tag == null || (marketRankTypeTypeByTag = MarginRankHelper.MarketRankType.INSTANCE.typeByTag(tag)) == MarginRankHelper.MarketRankType.RANK_NONE) {
            return;
        }
        baseViewHolder.setImageResource(R$id.iv_icon, marketRankTypeTypeByTag.getDrawableIcon());
        baseViewHolder.setText(R$id.tv_title, new C27096v0().append(this.f33405i.getText(marketRankTypeTypeByTag.getTitleRes())).m66905e("  #" + tag.getSubtitle(), C27017c.f54310a.m66512a(R$color.complementary)));
        baseViewHolder.setText(R$id.tv_content, marketRankTypeTypeByTag.getContentRes());
        int i11 = R$id.cl_root;
        final MarginRankBottomSheetDialog marginRankBottomSheetDialog = this.f33405i;
        baseViewHolder.setOnClickListener(i11, new View.OnClickListener() { // from class: jp.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginRankBottomSheetDialog$mAdapter$2$1.m39142i(marketRankTypeTypeByTag, tag, marginRankBottomSheetDialog, view);
            }
        });
    }
}
