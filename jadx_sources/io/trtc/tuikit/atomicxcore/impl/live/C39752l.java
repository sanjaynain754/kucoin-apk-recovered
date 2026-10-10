package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C39752l extends TUILiveBattleManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39767q f88336a;

    public C39752l(C39767q c39767q) {
        this.f88336a = c39767q;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleEnded(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleStoppedReason battleStoppedReason) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        this.f88336a.f88367b.setValue(CollectionsKt.emptyList());
        this.f88336a.f88366a.setValue(new BattleInfo(null, null, 0L, 0L, 15, null));
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleEnded called", "message", 0, "Listener: onBattleEnded called");
        this.f88336a.f88370e.m88249a((Function1) new C39725c(battleInfo));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestAccept(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleRequestAccept called", "message", 0, "Listener: onBattleRequestAccept called");
        this.f88336a.f88370e.m88249a((Function1) new C39728d(battleInfo, battleUser, battleUser2));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestCancelled(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleRequestCancelled called", "message", 0, "Listener: onBattleRequestCancelled called");
        this.f88336a.f88370e.m88249a((Function1) new C39731e(battleInfo, battleUser, battleUser2));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestReceived(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser inviter, TUILiveBattleManager.BattleUser invitee) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleRequestReceived called", "message", 0, "Listener: onBattleRequestReceived called");
        this.f88336a.f88370e.m88249a((Function1) new C39734f(battleInfo, inviter, invitee));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestReject(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleRequestReject called", "message", 0, "Listener: onBattleRequestReject called");
        this.f88336a.f88370e.m88249a((Function1) new C39737g(battleInfo, battleUser, battleUser2));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleRequestTimeout(TUILiveBattleManager.BattleInfo battleInfo, TUILiveBattleManager.BattleUser battleUser, TUILiveBattleManager.BattleUser battleUser2) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleRequestTimeout called", "message", 0, "Listener: onBattleRequestTimeout called");
        this.f88336a.f88370e.m88249a((Function1) new C39740h(battleInfo, battleUser, battleUser2));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleScoreChanged(String str, List list) {
        if (list == null) {
            this.f88336a.f88368c.setValue(MapsKt.emptyMap());
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88336a.f88368c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TUILiveBattleManager.BattleUser battleUser = (TUILiveBattleManager.BattleUser) it.next();
            Pair pairM90091to = TuplesKt.m90091to(battleUser.userId, Integer.valueOf(battleUser.score));
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        interfaceC41669n.setValue(linkedHashMap);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onBattleStarted(TUILiveBattleManager.BattleInfo battleInfo) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        ArrayList arrayList = new ArrayList();
        SeatUserInfo seatUserInfoM88318a = AbstractC39719a.m88318a(battleInfo.inviter);
        Iterator<TUILiveBattleManager.BattleUser> it = battleInfo.inviteeList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39719a.m88318a(it.next()));
        }
        this.f88336a.f88367b.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf(seatUserInfoM88318a), (Iterable) arrayList));
        InterfaceC41669n interfaceC41669n = this.f88336a.f88366a;
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        String battleId = battleInfo.battleId;
        Intrinsics.checkNotNullExpressionValue(battleId, "battleId");
        TUILiveBattleManager.BattleConfig battleConfig = battleInfo.config;
        Intrinsics.checkNotNullExpressionValue(battleConfig, "config");
        Intrinsics.checkNotNullParameter(battleConfig, "battleConfig");
        int i11 = battleConfig.duration;
        boolean z11 = battleConfig.needResponse;
        String extensionInfo = battleConfig.extensionInfo;
        Intrinsics.checkNotNullExpressionValue(extensionInfo, "extensionInfo");
        interfaceC41669n.setValue(new BattleInfo(battleId, new BattleConfig(i11, z11, extensionInfo), battleInfo.startTime, battleInfo.endTime));
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onBattleStarted called", "message", 0, "Listener: onBattleStarted called");
        C39767q c39767q = this.f88336a;
        c39767q.f88370e.m88249a((Function1) new C39743i(c39767q, seatUserInfoM88318a, arrayList));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onUserExitBattle(String battleID, TUILiveBattleManager.BattleUser battleUser) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(battleUser, "battleUser");
        InterfaceC41669n interfaceC41669n = this.f88336a.f88367b;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((SeatUserInfo) obj).getUserID(), battleUser.userId)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
        InterfaceC41669n interfaceC41669n2 = this.f88336a.f88368c;
        Map map = (Map) interfaceC41669n2.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), battleUser.userId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        interfaceC41669n2.setValue(linkedHashMap);
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onUserExitBattle called", "message", 0, "Listener: onUserExitBattle called");
        this.f88336a.f88370e.m88249a((Function1) new C39746j(battleID, battleUser));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.Observer
    public final void onUserJoinBattle(String battleID, TUILiveBattleManager.BattleUser battleUser) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(battleUser, "battleUser");
        InterfaceC41669n interfaceC41669n = this.f88336a.f88367b;
        interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) CollectionsKt.listOf(AbstractC39719a.m88318a(battleUser))));
        AbstractC39465b.m88232a(this.f88336a.f88369d, "Listener: onUserJoinBattle called", "message", 0, "Listener: onUserJoinBattle called");
        this.f88336a.f88370e.m88249a((Function1) new C39749k(battleID, battleUser));
    }
}
