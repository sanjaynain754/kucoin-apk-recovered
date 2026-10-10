package com.kubi.mart.sidebar.spot;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.b */
/* JADX INFO: compiled from: SpotSidebarContract.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$SearchDataListEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "keyWord", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getKeyWord", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C18848b implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f34723a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<TradeItemBean> f34724b;

    /* JADX WARN: Multi-variable type inference failed */
    public C18848b(@NotNull String keyWord, @NotNull List<? extends TradeItemBean> items) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f34723a = keyWord;
        this.f34724b = items;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TradeItemBean> m41445a() {
        return this.f34724b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF34723a() {
        return this.f34723a;
    }
}
