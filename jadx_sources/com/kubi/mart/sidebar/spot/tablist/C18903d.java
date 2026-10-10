package com.kubi.mart.sidebar.spot.tablist;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.d */
/* JADX INFO: compiled from: SpotSidebarTabContract.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$TabListDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/data/entity/TradeItemBean;", "subTabs", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getSubTabs", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C18903d implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<TradeItemBean> f34830a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<String> f34831b;

    /* JADX WARN: Multi-variable type inference failed */
    public C18903d(@NotNull List<? extends TradeItemBean> items, @NotNull List<String> subTabs) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subTabs, "subTabs");
        this.f34830a = items;
        this.f34831b = subTabs;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TradeItemBean> m41607a() {
        return this.f34830a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m41608b() {
        return this.f34831b;
    }
}
