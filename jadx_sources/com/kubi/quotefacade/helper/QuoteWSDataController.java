package com.kubi.quotefacade.helper;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: QuoteWSDataController.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\u0004\u0012\u00020\u000b0\u000fJ0\u0010\u0011\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\u0004\u0012\u00020\u000b0\u000fJ\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/QuoteWSDataController;", "", "<init>", "()V", "TAG", "", "quoteScope", "Lcom/kubi/quotefacade/helper/QuoteCoroutineScope;", "marketWsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "futureSubscribe", "", "symbols", "", "function", "Lkotlin/Function1;", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "spotSubscribe", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "closeQuoteScope", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteWSDataController {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f41943a = "QuoteWSDataController";

    /* JADX INFO: renamed from: b */
    @NotNull
    public final QuoteCoroutineScope f41944b = new QuoteCoroutineScope(C42911a.m94120b(), null, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MarketWsHelper f41945c = new MarketWsHelper();

    /* JADX INFO: renamed from: e */
    public static final Unit m51877e(QuoteWSDataController quoteWSDataController, Function1 function1, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C41696j.m91104d(quoteWSDataController.f41944b, null, null, new QuoteWSDataController$futureSubscribe$1$1(function1, data, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m51878g(QuoteWSDataController quoteWSDataController, Function1 function1, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C41696j.m91104d(quoteWSDataController.f41944b, null, null, new QuoteWSDataController$spotSubscribe$1$1(function1, data, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m51879c() {
        C44128b.m97266j(this.f41943a, "closeQuoteScope");
        this.f41945c.m32541F();
        this.f41944b.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m51880d(@NotNull List<String> symbols, @NotNull final Function1<? super List<WsFutureSnapshotEntity>, Unit> function) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(function, "function");
        MarketWsHelper.m32517A(this.f41945c, symbols, 0L, new Function1() { // from class: com.kubi.quotefacade.helper.r2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteWSDataController.m51877e(this.f42095b, function, (List) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m51881f(@NotNull List<String> symbols, @NotNull final Function1<? super List<WsMarketSnapshotEntity>, Unit> function) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(function, "function");
        MarketWsHelper.m32519D(this.f41945c, symbols, 0L, new Function1() { // from class: com.kubi.quotefacade.helper.q2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteWSDataController.m51878g(this.f42068b, function, (List) obj);
            }
        }, 2, null);
    }
}
