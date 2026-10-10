package com.kubi.margin.trade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.MarginOfflineInfoKt;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.entity.MarginNoticeBanner;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p024ap.C4369a;
import p024ap.InterfaceC4370b;
import p024ap.InterfaceC4371c;
import p698vp.C45618h;
import p768xo.InterfaceC46305f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: BaseMarginViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/margin/trade/BaseMarginViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "marginApi", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getMarginApi", "()Lcom/kubi/margin/api/MarginApi;", "marginApi$delegate", "Lkotlin/Lazy;", "_marginNoticeLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/margin/api/entity/MarginNoticeBanner;", "marginNoticeLiveData", "Landroidx/lifecycle/LiveData;", "getMarginNoticeLiveData", "()Landroidx/lifecycle/LiveData;", "_symbolOfflineBanner", "Lcom/kubi/data/entity/MarginSymbolInfo;", "symbolOfflineBanner", "getSymbolOfflineBanner", "requestBannerInfos", "", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "canMarginNoticeShow", "baseEntity", "Lcom/kubi/sdk/base/entity/BaseEntity;", "canSymbolOfflineShow", "symbolInfo", "onMarginNoticeClose", "onSymbolOfflineBannerClose", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginViewModel.kt\ncom/kubi/margin/trade/BaseMarginViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,150:1\n47#2,4:151\n84#3:155\n75#3,2:156\n75#3,2:158\n*S KotlinDebug\n*F\n+ 1 BaseMarginViewModel.kt\ncom/kubi/margin/trade/BaseMarginViewModel\n*L\n147#1:151,4\n92#1:155\n128#1:156,2\n131#1:158,2\n*E\n"})
public final class BaseMarginViewModel extends ViewModel {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f33673b0 = new Companion(null);

    /* JADX INFO: renamed from: c0 */
    public static final int f33674c0 = 86400000;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33675V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.c2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseMarginViewModel.m39762y();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<MarginNoticeBanner> f33676W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final LiveData<MarginNoticeBanner> f33677X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<MarginSymbolInfo> f33678Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<MarginSymbolInfo> f33679Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final CoroutineExceptionHandler f33680a0;

    /* JADX INFO: compiled from: BaseMarginViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/margin/trade/BaseMarginViewModel$Companion;", "", "<init>", "()V", "ONE_DAY_MILLIS", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BaseMarginViewModel.kt\ncom/kubi/margin/trade/BaseMarginViewModel\n*L\n1#1,49:1\n148#2,2:50\n*E\n"})
    public static final class C18168a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("BaseMarginViewModel", exception);
        }

        public C18168a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: u */
    public final MarginSymbolInfo m39765u(MarginSymbolInfo marginSymbolInfo) {
        if (marginSymbolInfo == null || !MarginOfflineInfoKt.isOffline(marginSymbolInfo) || C4369a.m3895a(InterfaceC4371c.a.f3766a, InterfaceC4370b.a.f3765a, MarginOfflineInfoKt.getOfflineTag(marginSymbolInfo))) {
            return null;
        }
        return marginSymbolInfo;
    }

    /* JADX INFO: renamed from: A */
    public final void m39763A(@NotNull TradeItemBean currentSymbol) {
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f33680a0), null, new BaseMarginViewModel$requestBannerInfos$1(this, currentSymbol, null), 2, null);
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC46305f m39766v() {
        return (InterfaceC46305f) this.f33675V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<MarginNoticeBanner> m39767w() {
        return this.f33677X;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<MarginSymbolInfo> m39768x() {
        return this.f33679Z;
    }

    /* JADX INFO: renamed from: z */
    public final void m39769z() {
        String id2;
        Long closeKeepDay;
        MarginNoticeBanner value = this.f33676W.getValue();
        if (value == null || (id2 = value.getId()) == null || (closeKeepDay = value.getCloseKeepDay()) == null) {
            return;
        }
        long jLongValue = closeKeepDay.longValue();
        if (jLongValue == 0) {
            C46392a.m102330m(C45618h.f102740a.m100713a(id2), 0L);
        } else if (jLongValue > 0) {
            C46392a.m102330m(C45618h.f102740a.m100713a(id2), System.currentTimeMillis() + (jLongValue * ((long) f33674c0)));
        }
    }

    public BaseMarginViewModel() {
        MutableLiveData<MarginNoticeBanner> mutableLiveData = new MutableLiveData<>();
        this.f33676W = mutableLiveData;
        this.f33677X = mutableLiveData;
        MutableLiveData<MarginSymbolInfo> mutableLiveData2 = new MutableLiveData<>();
        this.f33678Y = mutableLiveData2;
        this.f33679Z = mutableLiveData2;
        this.f33680a0 = new C18168a(CoroutineExceptionHandler.INSTANCE);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC46305f m39762y() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: t */
    public final MarginNoticeBanner m39764t(BaseEntity<MarginNoticeBanner> baseEntity) {
        MarginNoticeBanner data;
        String id2;
        if (!baseEntity.getSuccess() || baseEntity.getData() == null || (id2 = (data = baseEntity.getData()).getId()) == null) {
            return null;
        }
        long jM102324f = C46392a.m102324f(C45618h.f102740a.m100713a(id2), -1L);
        if (jM102324f == 0) {
            return null;
        }
        if ((jM102324f <= 0 || System.currentTimeMillis() <= jM102324f) && jM102324f >= 0) {
            return null;
        }
        return data;
    }
}
