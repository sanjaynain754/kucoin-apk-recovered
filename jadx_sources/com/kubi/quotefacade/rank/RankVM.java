package com.kubi.quotefacade.rank;

import androidx.lifecycle.ViewModelKt;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414kv.C41994j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/rank/RankContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "rankEntityMapper", "Lcom/kubi/quotefacade/mapper/RankEntityMapper;", "getRankEntityMapper", "()Lcom/kubi/quotefacade/mapper/RankEntityMapper;", "rankEntityMapper$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/quotefacade/rank/RankContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewAllList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToShowRedDot", "fetchMarket", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankVM.kt\ncom/kubi/quotefacade/rank/RankVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1869#2:95\n1563#2:96\n1634#2,3:97\n1870#2:100\n*S KotlinDebug\n*F\n+ 1 RankVM.kt\ncom/kubi/quotefacade/rank/RankVM\n*L\n56#1:95\n68#1:96\n68#1:97,3\n56#1:100\n*E\n"})
public final class RankVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f42408Z = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteMarketRepository f42409X = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f42410Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankVM.m52702w();
        }
    });

    /* JADX INFO: compiled from: RankVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankVM$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: w */
    public static final C41994j m52702w() {
        return new C41994j();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof RankContract$UiIntent.FetchNewAllList) {
            Object objM52705t = m52705t(continuation);
            return objM52705t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM52705t : Unit.INSTANCE;
        }
        if (interfaceC19282d instanceof RankContract$UiIntent.CheckToShowNewTabRedDot) {
            m52703r();
        } else if (interfaceC19282d instanceof RankContract$UiIntent.FetchMarket) {
            m52704s();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x0143  */
    /* JADX WARN: Code duplicated, block: B:46:0x014d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x009d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d4 -> B:32:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x014b -> B:39:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x014d -> B:39:0x0107). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: t */
    public final java.lang.Object m52705t(p852kotlin.coroutines.Continuation<? super p852kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.quotefacade.rank.RankVM.m52705t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final C41994j m52707v() {
        return (C41994j) this.f42410Y.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final void m52703r() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RankVM$checkToShowRedDot$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m52704s() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RankVM$fetchMarket$1(this, null), 3, null);
    }
}
