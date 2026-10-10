package com.kubi.mart.sidebar.spot.tablist.data;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.entity.SpotMenuModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ITabListGet.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet;", "", "fetchList", "", "Lcom/kubi/data/entity/TradeItemBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITabListGet {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f34832a = Companion.f34833a;

    /* JADX INFO: compiled from: ITabListGet.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet;", "sidebarType", "", "symbolCode", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f34833a = new Companion();

        @NotNull
        public final ITabListGet create(@NotNull String sidebarType, @NotNull String symbolCode, @NotNull SpotMenuModel menuModel) {
            Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            Intrinsics.checkNotNullParameter(menuModel, "menuModel");
            return Intrinsics.areEqual(menuModel.getTabType(), "FAVORITE") ? new SpotSidebarTabDataGetFavorite(sidebarType, menuModel) : new SpotSidebarTabDataGetArea(sidebarType, menuModel, symbolCode);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo41609a(@NotNull Continuation<? super List<? extends TradeItemBean>> continuation);
}
