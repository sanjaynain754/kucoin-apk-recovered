package com.kubi.spot.quote.market.rank;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.spot.R$color;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.Tag;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J&\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00192\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/rank/RankHelper;", "", "<init>", "()V", "getShapeDrawable", "Landroid/graphics/drawable/Drawable;", "color", "", "textColor", "setRankType", "", "symbol", "", "tag", "Lcom/kubi/spot/entity/Tag;", "textView", "Landroid/widget/TextView;", "generateFlutterRoute", "route", "needLogin", "", "showBottomSheet", "fragment", "Lcom/kubi/sdk/BaseFragment;", "data", "", "MarketRankType", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RankHelper f51027a = new RankHelper();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RANK_SEARCH' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: RankHelper.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#BK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, m90084d2 = {"Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;", "", "topRes", "", "titleRes", "contentRes", "textColor", "drawBg", "Landroid/graphics/drawable/Drawable;", "drawableIcon", "jumpUri", "", "rank", "<init>", "(Ljava/lang/String;IIIIILandroid/graphics/drawable/Drawable;ILjava/lang/String;I)V", "getTopRes", "()I", "getTitleRes", "getContentRes", "getTextColor", "getDrawBg", "()Landroid/graphics/drawable/Drawable;", "getDrawableIcon", "getJumpUri", "()Ljava/lang/String;", "getRank", "setRank", "(I)V", "RANK_SEARCH", "RANK_GAIN", "RANK_NEW", "RANK_HOT", "RANK_VOL", "RANK_LOSE", "RANK_NONE", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class MarketRankType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final MarketRankType RANK_GAIN;
        public static final MarketRankType RANK_HOT;
        public static final MarketRankType RANK_LOSE;
        public static final MarketRankType RANK_NEW;
        public static final MarketRankType RANK_NONE;
        public static final MarketRankType RANK_SEARCH;
        public static final MarketRankType RANK_VOL;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ MarketRankType[] f51028b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f51029c;
        private final int contentRes;

        @NotNull
        private final Drawable drawBg;
        private final int drawableIcon;

        @NotNull
        private final String jumpUri;
        private int rank;
        private final int textColor;
        private final int titleRes;
        private final int topRes;

        /* JADX INFO: compiled from: RankHelper.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType$Companion;", "", "<init>", "()V", "typeByTag", "Lcom/kubi/spot/quote/market/rank/RankHelper$MarketRankType;", "tag", "Lcom/kubi/spot/entity/Tag;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final MarketRankType typeByTag(@NotNull Tag tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Integer algorithm = tag.getAlgorithm();
                if (algorithm != null && algorithm.intValue() == 1) {
                    return MarketRankType.RANK_HOT;
                }
                if (algorithm != null && algorithm.intValue() == 2) {
                    return MarketRankType.RANK_SEARCH;
                }
                if (algorithm != null && algorithm.intValue() == 3) {
                    return MarketRankType.RANK_GAIN;
                }
                if (algorithm != null && algorithm.intValue() == 4) {
                    return MarketRankType.RANK_LOSE;
                }
                if (algorithm != null && algorithm.intValue() == 11) {
                    return MarketRankType.RANK_VOL;
                }
                return (algorithm != null && algorithm.intValue() == 12) ? MarketRankType.RANK_NEW : MarketRankType.RANK_NONE;
            }
        }

        public MarketRankType(String str, int i11, int i12, int i13, int i14, int i15, Drawable drawable, int i16, String str2, int i17) {
            super(str, i11);
            this.topRes = i12;
            this.titleRes = i13;
            this.contentRes = i14;
            this.textColor = i15;
            this.drawBg = drawable;
            this.drawableIcon = i16;
            this.jumpUri = str2;
            this.rank = i17;
        }

        static {
            int i11 = R$string.rank_hot_search_placeholder;
            int i12 = R$string.rank_hot_search_label;
            int i13 = R$string.rank_hot_search_desc;
            int i14 = R$color.c_ff7c33;
            RankHelper rankHelper = RankHelper.f51027a;
            int i15 = R$color.c_8_ff7c33;
            RANK_SEARCH = new MarketRankType("RANK_SEARCH", 0, i11, i12, i13, i14, rankHelper.m62657d(i15, i14), R$mipmap.kucoin_ic_rank_search, RankHelper.m62655c(rankHelper, "discover/rankingList", false, 2, null), 0, 128, null);
            int i16 = R$string.rank_gain_placeholder;
            int i17 = R$string.rank_gain_label;
            int i18 = R$string.rank_gain_desc;
            int i19 = R$color.c_ffc050;
            RANK_GAIN = new MarketRankType("RANK_GAIN", 1, i16, i17, i18, i19, rankHelper.m62657d(R$color.c_8_ffc050, i19), R$mipmap.kucoin_ic_rank_gain, RankHelper.m62655c(rankHelper, "discover/rankingList", false, 2, null), 0, 128, null);
            int i21 = R$string.rank_new_placeholder;
            int i22 = R$string.rank_new_label;
            int i23 = R$string.rank_new_desc;
            int i24 = R$color.primary;
            RANK_NEW = new MarketRankType("RANK_NEW", 2, i21, i22, i23, i24, rankHelper.m62657d(R$color.primary8, i24), R$mipmap.kucoin_ic_rank_new, RankHelper.m62655c(rankHelper, "discover/rankingList", false, 2, null), 0, 128, null);
            RANK_HOT = new MarketRankType("RANK_HOT", 3, R$string.rank_hot_placeholder, R$string.rank_hot_label, R$string.rank_hot_desc, i14, rankHelper.m62657d(i15, i14), R$mipmap.kucoin_ic_rank_hot, RankHelper.m62655c(rankHelper, "discover/rankingList", false, 2, null), 0, 128, null);
            int i25 = R$string.rank_vol_placeholder;
            int i26 = R$string.rank_vol_label;
            int i27 = R$string.rank_vol_desc;
            int i28 = R$color.c_ff666f;
            RANK_VOL = new MarketRankType("RANK_VOL", 4, i25, i26, i27, i28, rankHelper.m62657d(R$color.c_8_ff666f, i28), R$mipmap.kucoin_ic_rank_vol, RankHelper.m62655c(rankHelper, "discover/rankingList", false, 2, null), 0, 128, null);
            int i29 = R$string.rank_lose_placeholder;
            int i31 = R$string.rank_lose_label;
            int i32 = R$string.rank_lose_desc;
            int i33 = R$color.c_4e9af8;
            RANK_LOSE = new MarketRankType("RANK_LOSE", 5, i29, i31, i32, i33, rankHelper.m62657d(R$color.c_8_4e9af8, i33), R$mipmap.kucoin_ic_rank_lose, RankHelper.m62655c(rankHelper, "discover/rankingList", false, 2, null), 0, 128, null);
            int i34 = R$color.emphasis;
            RANK_NONE = new MarketRankType("RANK_NONE", 6, 0, 0, 0, i34, rankHelper.m62657d(R$color.emphasis8, i34), R$mipmap.kucoin_icon_default_icon, "", 0, 128, null);
            MarketRankType[] marketRankTypeArrM62659a = m62659a();
            f51028b = marketRankTypeArrM62659a;
            f51029c = EnumEntriesKt.enumEntries(marketRankTypeArrM62659a);
            INSTANCE = new Companion(null);
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ MarketRankType[] m62659a() {
            return new MarketRankType[]{RANK_SEARCH, RANK_GAIN, RANK_NEW, RANK_HOT, RANK_VOL, RANK_LOSE, RANK_NONE};
        }

        @NotNull
        public static EnumEntries<MarketRankType> getEntries() {
            return f51029c;
        }

        public static MarketRankType valueOf(String str) {
            return (MarketRankType) Enum.valueOf(MarketRankType.class, str);
        }

        public static MarketRankType[] values() {
            return (MarketRankType[]) f51028b.clone();
        }

        public final int getContentRes() {
            return this.contentRes;
        }

        @NotNull
        public final Drawable getDrawBg() {
            return this.drawBg;
        }

        public final int getDrawableIcon() {
            return this.drawableIcon;
        }

        @NotNull
        public final String getJumpUri() {
            return this.jumpUri;
        }

        public final int getRank() {
            return this.rank;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getTopRes() {
            return this.topRes;
        }

        public final void setRank(int i11) {
            this.rank = i11;
        }

        public /* synthetic */ MarketRankType(String str, int i11, int i12, int i13, int i14, int i15, Drawable drawable, int i16, String str2, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, i12, i13, i14, i15, drawable, i16, str2, (i18 & 128) != 0 ? 1 : i17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m62655c(RankHelper rankHelper, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return rankHelper.m62656b(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m62656b(@NotNull String route, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return "flutter?route=" + Uri.encode(route) + "&needLogin=" + z11;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m62657d(int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f), C5275i0.m6236a(4.0f)});
        gradientDrawable.setColor(C27017c.f54310a.m66512a(i11));
        return gradientDrawable;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m62658e(@NotNull String symbol, @Nullable Tag tag, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (tag == null) {
            ViewExtKt.m66577h(textView);
            return;
        }
        MarketRankType marketRankTypeTypeByTag = MarketRankType.INSTANCE.typeByTag(tag);
        if (marketRankTypeTypeByTag == MarketRankType.RANK_NONE) {
            ViewExtKt.m66577h(textView);
            return;
        }
        ViewExtKt.m66594y(textView);
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(marketRankTypeTypeByTag.getTopRes(), C27041f.m66668h(tag.getSubtitle())));
        sb2.append(' ');
        textView.setText(sb2.toString());
        textView.setTextColor(c27017c.m66512a(marketRankTypeTypeByTag.getTextColor()));
        textView.setBackground(marketRankTypeTypeByTag.getDrawBg());
        C27014a1.m66505e(textView, marketRankTypeTypeByTag.getDrawableIcon(), GravityCompat.START, C5275i0.m6236a(2.0f));
    }
}
