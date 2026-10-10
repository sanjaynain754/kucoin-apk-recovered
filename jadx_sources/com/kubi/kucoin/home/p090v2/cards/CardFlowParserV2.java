package com.kubi.kucoin.home.p090v2.cards;

import com.kubi.kucoin.home.cards.exception.CardFlowException;
import com.kubi.kucoin.home.cards.exception.CardFlowMessage;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CardFlowParserV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/CardFlowParserV2;", "", "<init>", "()V", "cardsLock", "Ljava/util/concurrent/locks/ReentrantLock;", "reportKey", "", "addedCard", "", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "kotlin.jvm.PlatformType", "", "getAddedCardData", "buildVisibleCardFlow", "", "cardConfig", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2;", "loadCardData", "allWidget", "", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;", "userWidget", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardFlowParserV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFlowParserV2.kt\ncom/kubi/kucoin/home/v2/cards/CardFlowParserV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CardFlowIssue.kt\ncom/kubi/kucoin/home/cards/exception/CardFlowIssueKt\n*L\n1#1,82:1\n1208#2,2:83\n1236#2,4:85\n1869#2:89\n1870#2:91\n1#3:90\n48#4,2:92\n44#4,2:94\n*S KotlinDebug\n*F\n+ 1 CardFlowParserV2.kt\ncom/kubi/kucoin/home/v2/cards/CardFlowParserV2\n*L\n58#1:83,2\n58#1:85,4\n59#1:89\n59#1:91\n65#1:92,2\n68#1:94,2\n*E\n"})
public abstract class CardFlowParserV2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReentrantLock f27929a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f27930b = "WidgetException";

    /* JADX INFO: renamed from: c */
    public final List<BaseCardDataV2> f27931c = Collections.synchronizedList(new ArrayList());

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract BaseCardDataV2 mo30805c(@NotNull Map<String, CardListRspV2.AppWidgetConfigVO> map, @NotNull CardListRspV2.UserCustomWidget userCustomWidget);

    /* JADX INFO: renamed from: a */
    public final void m32258a(@NotNull CardListRspV2 cardConfig) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(cardConfig, "cardConfig");
        this.f27929a.lock();
        this.f27931c.clear();
        try {
            Result.Companion companion = Result.INSTANCE;
            List<CardListRspV2.AppWidgetConfigVO> allWidgetList = cardConfig.getAllWidgetList();
            if (allWidgetList != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(allWidgetList, 10)), 16));
                for (Object obj : allWidgetList) {
                    linkedHashMap.put(((CardListRspV2.AppWidgetConfigVO) obj).getCode(), obj);
                }
                for (CardListRspV2.UserCustomWidget userCustomWidget : cardConfig.getUserCustomWidgetList()) {
                    BaseCardDataV2 baseCardDataV2Mo30805c = mo30805c(linkedHashMap, userCustomWidget);
                    if (baseCardDataV2Mo30805c != null) {
                        this.f27931c.add(baseCardDataV2Mo30805c);
                    } else {
                        C44128b.m97261e(this.f27930b, "Widget " + userCustomWidget.getCode() + ':' + userCustomWidget.getStyle() + " load failed");
                    }
                }
            } else {
                C43846g.m96568c(new CardFlowMessage("build card failed, allWidgetList is null", this.f27930b, false, 4, null), null, 2, null);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g(this.f27930b, thM103847exceptionOrNullimpl);
            C43846g.m96568c(new CardFlowException(thM103847exceptionOrNullimpl, this.f27930b, false, null, 8, null), null, 2, null);
        }
        this.f27929a.unlock();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<BaseCardDataV2> m32259b() {
        if (this.f27929a.isLocked()) {
            return null;
        }
        this.f27929a.lock();
        List<BaseCardDataV2> addedCard = this.f27931c;
        Intrinsics.checkNotNullExpressionValue(addedCard, "addedCard");
        List<BaseCardDataV2> mutableList = CollectionsKt.toMutableList((Collection) addedCard);
        this.f27929a.unlock();
        return mutableList;
    }
}
