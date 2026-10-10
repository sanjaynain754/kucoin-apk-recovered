package com.kubi.quotefacade.favorites.spot;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.favorites.FavCommonFragment;
import com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment;
import com.kubi.quotefacade.favorites.spot.FavSpotFragment;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27051h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FavSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/spot/FavSpotFragment;", "Lcom/kubi/quotefacade/favorites/FavCommonFragment;", "<init>", "()V", "getSymbolType", "", "getSubType", "", "getRecommendPage", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "onTradeItemClick", "", "item", "Lcom/kubi/data/entity/TradeItemBean;", "fromType", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;)V", "getCurrentPageId", "getCurrentBlockId", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FavSpotFragment extends FavCommonFragment {

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public static final Companion f41894o0 = new Companion(null);

    /* JADX INFO: compiled from: FavSpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/spot/FavSpotFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "BLOCK_ID", "newInstance", "Lcom/kubi/quotefacade/favorites/spot/FavSpotFragment;", "fromType", "", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFavSpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavSpotFragment.kt\ncom/kubi/quotefacade/favorites/spot/FavSpotFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FavSpotFragment newInstance(int fromType, @Nullable String positionType) {
            FavSpotFragment favSpotFragment = new FavSpotFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("from", fromType);
            if (positionType != null) {
                bundle.putString("positionType", positionType);
            }
            favSpotFragment.setArguments(bundle);
            return favSpotFragment;
        }
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    /* JADX INFO: renamed from: H4 */
    public int mo51248H4() {
        return 1;
    }

    /* JADX INFO: renamed from: A5 */
    public static final Unit m51730A5(FavSpotFragment favSpotFragment, TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent();
        intent.putExtras(new C27051h().m66721e("data", it).m66717a());
        FragmentActivity activity = favSpotFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = favSpotFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: G4 */
    public String mo51247G4() {
        return SearchCategory$Companion.SPOT;
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    /* JADX INFO: renamed from: j5 */
    public void mo51259j5(@NotNull TradeItemBean item, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(item, "item");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("交易对: ");
        SymbolInfoEntity symbolInfoEntity = item.getSymbolInfoEntity();
        sb2.append(symbolInfoEntity != null ? symbolInfoEntity.getSymbol() : null);
        sb2.append(", 页面来源: ");
        sb2.append(num);
        C44128b.m97266j("行情", sb2.toString());
        ISpotService.m59982A(BQuoteFacadeDepend.f42592a.m53024d(), item.getSymbol(), num, null, new Function1() { // from class: gv.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavSpotFragment.m51730A5(this.f85661b, (TradeItemBean) obj);
            }
        }, 4, null);
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: y4 */
    public String mo51275y4() {
        return "Spots";
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: z4 */
    public String mo51277z4() {
        return "B5FavoritesSpots";
    }

    @Override // com.kubi.quotefacade.favorites.FavCommonFragment
    @NotNull
    /* JADX INFO: renamed from: F4 */
    public RecommendCommonFragment mo51246F4() {
        if (getF41665d0() == null) {
            m51263o5(RecommendSpotFragment.f41895a0.newInstance(m51244D4()));
        }
        RecommendCommonFragment f41665d0 = getF41665d0();
        if (f41665d0 == null) {
            f41665d0 = new RecommendSpotFragment();
        }
        f41665d0.setArguments(getArguments());
        return f41665d0;
    }
}
