package com.kubi.quotefacade.favorites.alpha;

import android.os.Bundle;
import com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FavAlphaPremiumFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/alpha/RecommendAlphaPremiumFragment;", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "<init>", "()V", "getCurrentPageId", "", "getSymbolType", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecommendAlphaPremiumFragment extends RecommendCommonFragment {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f41781a0 = new Companion(null);

    /* JADX INFO: compiled from: FavAlphaPremiumFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/alpha/RecommendAlphaPremiumFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/favorites/alpha/RecommendAlphaPremiumFragment;", "positionType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final RecommendAlphaPremiumFragment newInstance(@Nullable String positionType) {
            RecommendAlphaPremiumFragment recommendAlphaPremiumFragment = new RecommendAlphaPremiumFragment();
            Bundle bundle = new Bundle();
            bundle.putString("positionType", positionType);
            recommendAlphaPremiumFragment.setArguments(bundle);
            return recommendAlphaPremiumFragment;
        }
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment
    /* JADX INFO: renamed from: P3 */
    public int mo51544P3() {
        return 6;
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment
    @NotNull
    /* JADX INFO: renamed from: M3 */
    public String mo51543M3() {
        return "B5FavoritesAlpha";
    }
}
