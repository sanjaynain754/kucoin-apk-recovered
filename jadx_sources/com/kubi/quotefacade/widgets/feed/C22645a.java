package com.kubi.quotefacade.widgets.feed;

import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import org.jetbrains.annotations.NotNull;
import p233ej.C37201i;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.feed.a */
/* JADX INFO: compiled from: HomeFeed.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m90084d2 = {"homeFeedWidgetMapping", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "createHomeFeedWidget", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22645a {
    /* JADX INFO: renamed from: b */
    public static final BaseCardV2 m53550b() {
        return C37201i.f82500a.m83229r() ? new HomeFeedRNWidget() : new HomeFeedWidget();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ClassMappingV2 m53551c() {
        return new ClassMappingV2(HomeFeedWidgetViewHolder.class);
    }
}
