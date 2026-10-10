package com.kubi.home.api;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.kubi.home.api.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RankConstant.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/api/RankConstant;", "", "<init>", "()V", "TabDefaultRankType", "", "", "Lkotlin/Pair;", "", "getTabDefaultRankType", "()Ljava/util/Map;", "EVENT_RANK_VIEW_MORE", "EVENT_RANK_CLOSE", "EVENT_SHOW_NEW_COIN_MORE", "EVENT_HIDE_NEW_COIN_MORE", "EVENT_CHANGE_RANK_TYPE", "ApiType", "RankType", "Topic", "NewTopic", "TrackType", "TabType", "RankParamKey", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankConstant {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RankConstant f25518a = new RankConstant();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, Pair<Integer, Integer>> f25519b = MapsKt.mapOf(TuplesKt.m90091to("HOT", new Pair(1, 1)), TuplesKt.m90091to("VOL", new Pair(4, 5)), TuplesKt.m90091to("UP", new Pair(2, 3)), TuplesKt.m90091to("DOWN", new Pair(6, 7)), TuplesKt.m90091to("new_coin", new Pair(8, 8)));

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Pair<Integer, Integer>> m28973a() {
        return f25519b;
    }
}
