package com.kubi.mart.sidebar.spot.helper;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.mart.utils.MartCoroutineScope;
import com.kubi.network.restful.C19321b;
import com.kubi.utils.C27100x0;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotWsHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\r0\u0012J\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/SpotWsHelper;", "", "<init>", "()V", "scope", "Lcom/kubi/mart/utils/MartCoroutineScope;", "spotWsApi", "Lcom/kubi/mart/sidebar/spot/helper/ISpotWsApi;", "getSpotWsApi", "()Lcom/kubi/mart/sidebar/spot/helper/ISpotWsApi;", "spotWsApi$delegate", "Lkotlin/Lazy;", "subscribe", "", "symbolsOrAreas", "", "", "onWsData", "Lkotlin/Function1;", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "unSubscribe", "Companion", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotWsHelper {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f34746c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MartCoroutineScope f34747a = new MartCoroutineScope(C42911a.m94120b(), null, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f34748b = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotWsHelper.m41494f();
        }
    });

    /* JADX INFO: compiled from: SpotWsHelper.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/SpotWsHelper$Companion;", "", "<init>", "()V", "TAG", "", "BUFFER_TIME", "", "PAGE_MAX_SIZE", "", "BATCH_MAX_LIMIT", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final ISpotWsApi m41494f() {
        return (ISpotWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(ISpotWsApi.class);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m41495i(SpotWsHelper spotWsHelper) {
        spotWsHelper.f34747a.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final ISpotWsApi m41496e() {
        return (ISpotWsApi) this.f34748b.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m41497g(@NotNull List<String> symbolsOrAreas, @NotNull Function1<? super List<WsMarketSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(symbolsOrAreas, "symbolsOrAreas");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        m41498h();
        if (symbolsOrAreas.isEmpty()) {
            return;
        }
        C41696j.m91104d(this.f34747a, null, null, new SpotWsHelper$subscribe$1(symbolsOrAreas.size() > 80 ? CollectionsKt.chunked(CollectionsKt.take(symbolsOrAreas, 600), 80) : CollectionsKt.listOf(symbolsOrAreas), this, onWsData, null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m41498h() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotWsHelper.m41495i(this.f34785b);
            }
        });
    }
}
