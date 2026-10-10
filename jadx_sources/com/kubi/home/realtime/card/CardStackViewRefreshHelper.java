package com.kubi.home.realtime.card;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import com.kubi.home.realtime.AdapterViewType;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.frame.manager.BasePendingRefreshHelper;
import com.kubi.home.realtime.frame.view.CardStackView;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p456mj.C42562k;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.realtime.card.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CardStackViewRefreshHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/realtime/card/CardStackViewRefreshHelper;", "Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper;", "cardStackView", "Lcom/kubi/home/realtime/frame/view/CardStackView;", "onUIOperationsCompleted", "Lkotlin/Function0;", "", "<init>", "(Lcom/kubi/home/realtime/frame/view/CardStackView;Lkotlin/jvm/functions/Function0;)V", "executeUIOperations", "operations", "Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper$PendingOperations;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardStackViewRefreshHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardStackViewRefreshHelper.kt\ncom/kubi/home/realtime/card/CardStackViewRefreshHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1869#2,2:49\n1869#2,2:51\n1869#2,2:53\n*S KotlinDebug\n*F\n+ 1 CardStackViewRefreshHelper.kt\ncom/kubi/home/realtime/card/CardStackViewRefreshHelper\n*L\n21#1:49,2\n25#1:51,2\n35#1:53,2\n*E\n"})
public final class CardStackViewRefreshHelper extends BasePendingRefreshHelper {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final CardStackView f26100i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Function0<Unit> f26101j;

    public CardStackViewRefreshHelper(@NotNull CardStackView cardStackView, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(cardStackView, "cardStackView");
        this.f26100i = cardStackView;
        this.f26101j = function0;
    }

    @Override // com.kubi.home.realtime.frame.manager.BasePendingRefreshHelper
    /* JADX INFO: renamed from: d */
    public void mo30094d(@NotNull BasePendingRefreshHelper.PendingOperations operations) {
        IRealTimeAdapter<IRealTimeData> iRealTimeAdapterM93328c;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator<T> it = operations.m30152b().iterator();
        while (it.hasNext()) {
            this.f26100i.m30176v(((IRealTimeData) it.next()).getUniqueId());
        }
        Iterator<T> it2 = operations.m30153c().values().iterator();
        while (true) {
            View view = null;
            if (!it2.hasNext()) {
                for (IRealTimeData iRealTimeData : operations.m30151a().values()) {
                    C42562k.ViewInstance viewInstanceM93319r = C42562k.f94240a.m93319r(iRealTimeData.getUniqueId());
                    if (viewInstanceM93319r != null && (iRealTimeAdapterM93328c = viewInstanceM93319r.m93328c()) != null) {
                        Context context = this.f26100i.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        View viewM30050f = iRealTimeAdapterM93328c.m30050f(context, iRealTimeData, AdapterViewType.CARD, null);
                        if (viewM30050f != null) {
                            viewM30050f.setTag(iRealTimeData.getUniqueId());
                            this.f26100i.m30168n(viewM30050f, iRealTimeData);
                        }
                    }
                }
                Function0<Unit> function0 = this.f26101j;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            IRealTimeData iRealTimeData2 = (IRealTimeData) it2.next();
            C42562k.ViewInstance viewInstanceM93319r2 = C42562k.f94240a.m93319r(iRealTimeData2.getUniqueId());
            if (viewInstanceM93319r2 == null) {
                return;
            }
            for (View view2 : ViewGroupKt.getChildren(this.f26100i)) {
                if (Intrinsics.areEqual(view2.getTag(), iRealTimeData2.getUniqueId())) {
                    view = view2;
                    break;
                }
            }
            View view3 = view;
            if (view3 != null) {
                viewInstanceM93319r2.m93328c().m30045a(view3, iRealTimeData2, AdapterViewType.CARD);
                this.f26100i.m30178x(iRealTimeData2);
            }
        }
    }
}
