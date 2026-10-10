package com.kubi.quotefacade.favorites.spot;

import android.os.Bundle;
import com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RecommendSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/spot/RecommendSpotFragment;", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "<init>", "()V", "getSymbolType", "", "getCurrentPageId", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecommendSpotFragment extends RecommendCommonFragment {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f41895a0 = new Companion(null);

    /* JADX INFO: compiled from: RecommendSpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/spot/RecommendSpotFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/favorites/spot/RecommendSpotFragment;", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final RecommendSpotFragment newInstance(@Nullable String positionType) {
            RecommendSpotFragment recommendSpotFragment = new RecommendSpotFragment();
            Bundle bundle = new Bundle();
            bundle.putString("positionType", positionType);
            recommendSpotFragment.setArguments(bundle);
            return recommendSpotFragment;
        }
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment
    /* JADX INFO: renamed from: P3 */
    public int mo51544P3() {
        return 1;
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment
    @NotNull
    /* JADX INFO: renamed from: M3 */
    public String mo51543M3() {
        return "B5FavoritesSpots";
    }
}
