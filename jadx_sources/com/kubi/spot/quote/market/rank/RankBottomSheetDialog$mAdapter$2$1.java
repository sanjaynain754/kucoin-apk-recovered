package com.kubi.spot.quote.market.rank;

import android.view.View;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.entity.Tag;
import com.kubi.spot.quote.market.rank.RankBottomSheetDialog$mAdapter$2$1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import p569qq.C43852m;
import p830zf.InterfaceC46787a0;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RankBottomSheetDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/spot/quote/market/rank/RankBottomSheetDialog$mAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/spot/entity/Tag;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankBottomSheetDialog.kt\ncom/kubi/spot/quote/market/rank/RankBottomSheetDialog$mAdapter$2$1\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,100:1\n25#2,3:101\n17#2,2:104\n*S KotlinDebug\n*F\n+ 1 RankBottomSheetDialog.kt\ncom/kubi/spot/quote/market/rank/RankBottomSheetDialog$mAdapter$2$1\n*L\n44#1:101,3\n55#1:104,2\n*E\n"})
public final class RankBottomSheetDialog$mAdapter$2$1 extends BaseQuickAdapter<Tag, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ RankBottomSheetDialog f51026i;

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.rank.RankBottomSheetDialog$mAdapter$2$1$a */
    /* JADX INFO: compiled from: RankBottomSheetDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25670a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RankHelper.MarketRankType.values().length];
            try {
                iArr[RankHelper.MarketRankType.RANK_HOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RankHelper.MarketRankType.RANK_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RankHelper.MarketRankType.RANK_GAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RankHelper.MarketRankType.RANK_NEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RankHelper.MarketRankType.RANK_VOL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RankHelper.MarketRankType.RANK_LOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RankHelper.MarketRankType.RANK_NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m62652i(RankHelper.MarketRankType marketRankType, Tag tag, RankBottomSheetDialog rankBottomSheetDialog, View view) {
        String str;
        Router router = Router.f46192a;
        Object objM56186h = router.m56186h(InterfaceC46787a0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46787a0) objM56186h).mo102975d() : true) {
            switch (C25670a.$EnumSwitchMapping$0[marketRankType.ordinal()]) {
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
                C43852m.m96590b("B5candle", "OLabelPopup", str, TuplesKt.m90091to("symbol", rankBottomSheetDialog.getF51023d0()));
            }
            router.m56184f(marketRankType.getJumpUri()).m4038a("tagId", tag.getTagId()).m4048k();
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder baseViewHolder, final Tag tag) {
        final RankHelper.MarketRankType marketRankTypeTypeByTag;
        if (baseViewHolder == null || tag == null || (marketRankTypeTypeByTag = RankHelper.MarketRankType.INSTANCE.typeByTag(tag)) == RankHelper.MarketRankType.RANK_NONE) {
            return;
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46787a0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46787a0) objM56186h).mo102973b(baseViewHolder);
        }
        baseViewHolder.setImageResource(R$id.iv_icon, marketRankTypeTypeByTag.getDrawableIcon());
        baseViewHolder.setText(R$id.tv_title, new C27096v0().append(this.f51026i.getText(marketRankTypeTypeByTag.getTitleRes())).m66905e("  #" + tag.getSubtitle(), C27017c.f54310a.m66512a(R$color.complementary)));
        baseViewHolder.setText(R$id.tv_content, marketRankTypeTypeByTag.getContentRes());
        int i11 = R$id.cl_root;
        final RankBottomSheetDialog rankBottomSheetDialog = this.f51026i;
        baseViewHolder.setOnClickListener(i11, new View.OnClickListener() { // from class: z20.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RankBottomSheetDialog$mAdapter$2$1.m62652i(marketRankTypeTypeByTag, tag, rankBottomSheetDialog, view);
            }
        });
    }
}
