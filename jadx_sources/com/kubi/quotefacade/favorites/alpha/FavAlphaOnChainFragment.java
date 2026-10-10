package com.kubi.quotefacade.favorites.alpha;

import android.os.Bundle;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.AlphaFavEntity;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.favorites.FavCommonFragment;
import com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.utils.extensions.C27023a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavAlphaOnChainFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/alpha/FavAlphaOnChainFragment;", "Lcom/kubi/quotefacade/favorites/FavCommonFragment;", "<init>", "()V", "getSymbolType", "", "getSubType", "", "getRecommendPage", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "onTradeItemClick", "", "itemBean", "Lcom/kubi/data/entity/TradeItemBean;", "fromType", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;)V", "getCurrentPageId", "getCurrentBlockId", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FavAlphaOnChainFragment extends FavCommonFragment {

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public static final Companion f41778o0 = new Companion(null);

    /* JADX INFO: compiled from: FavAlphaOnChainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/alpha/FavAlphaOnChainFragment$Companion;", "", "<init>", "()V", "PAGE_ID_ALPHA", "", "newInstance", "Lcom/kubi/quotefacade/favorites/alpha/FavAlphaOnChainFragment;", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFavAlphaOnChainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavAlphaOnChainFragment.kt\ncom/kubi/quotefacade/favorites/alpha/FavAlphaOnChainFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FavAlphaOnChainFragment newInstance(@Nullable String positionType) {
            FavAlphaOnChainFragment favAlphaOnChainFragment = new FavAlphaOnChainFragment();
            Bundle bundle = new Bundle();
            if (positionType != null) {
                bundle.putString("positionType", positionType);
            }
            favAlphaOnChainFragment.setArguments(bundle);
            return favAlphaOnChainFragment;
        }
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    /* JADX INFO: renamed from: H4 */
    public int mo51248H4() {
        return 7;
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: G4 */
    public String mo51247G4() {
        return "chain_area";
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    /* JADX INFO: renamed from: j5 */
    public void mo51259j5(@NotNull TradeItemBean itemBean, @Nullable Integer num) throws JSONException {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
        AlphaFavEntity alphaFavEntity = itemBean instanceof AlphaFavEntity ? (AlphaFavEntity) itemBean : null;
        AlphaItemEntity itemEntity = alphaFavEntity != null ? alphaFavEntity.getItemEntity() : null;
        if (itemEntity != null) {
            QuoteExKt.m51867r(itemEntity.getToken(), itemEntity.getKcChain(), itemEntity.getTokenBridgeId(), itemEntity.getCollectTypeOrCategory());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", itemEntity != null ? itemEntity.getDisplayToken() : null);
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B5MarketFavoritesAlpha", "coins", "1", jSONObject);
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: y4 */
    public String mo51275y4() {
        return "";
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: z4 */
    public String mo51277z4() {
        return "B5FavoritesAlpha";
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: F4 */
    public RecommendCommonFragment mo51246F4() {
        RecommendCommonFragment f41665d0 = getF41665d0();
        if (f41665d0 == null) {
            RecommendAlphaOnChainFragment recommendAlphaOnChainFragmentNewInstance = RecommendAlphaOnChainFragment.f41780a0.newInstance(m51244D4());
            m51263o5(recommendAlphaOnChainFragmentNewInstance);
            return recommendAlphaOnChainFragmentNewInstance;
        }
        return f41665d0;
    }
}
