package com.kubi.spot.dialog.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.network.restful.C19321b;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.sdk.BaseViewModel;
import e20.InterfaceC37050a;
import er.C37237b;
import f30.C37335f;
import gr.C38000b;
import gr.C38006h;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AmendOrderViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0002J\u0006\u0010\u001e\u001a\u00020\u001bR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/AmendOrderViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "api", "Lcom/kubi/spot/dialog/order/AmendApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/dialog/order/AmendApi;", "api$delegate", "Lkotlin/Lazy;", "restfulApi", "Lcom/kubi/spot/api/IRestfulApi;", "getRestfulApi", "()Lcom/kubi/spot/api/IRestfulApi;", "restfulApi$delegate", "protocolScope", "Lcom/kubi/spot/utils/ParentCoroutineScope;", "_latestPrice", "Landroidx/lifecycle/MutableLiveData;", "", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "Landroidx/lifecycle/LiveData;", "getLatestPrice", "()Landroidx/lifecycle/LiveData;", "latestSequence", "", "", "symbol", "subscribeLatestPrice", "cancelSubscribe", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AmendOrderViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50507X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.dialog.order.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AmendOrderViewModel.m61711w();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f50508Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.dialog.order.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AmendOrderViewModel.m61703C();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final C37335f f50509Z = new C37335f(C42911a.m94120b());

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<String> f50510a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<String> f50511b0;

    /* JADX INFO: renamed from: c0 */
    public volatile long f50512c0;

    /* JADX INFO: renamed from: C */
    public static final InterfaceC37050a m61703C() {
        return (InterfaceC37050a) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37050a.class);
    }

    /* JADX INFO: renamed from: A */
    public final void m61712A(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AmendOrderViewModel$getLatestPrice$1(this, str, null), 2, null);
        m61714D(str);
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC37050a m61713B() {
        return (InterfaceC37050a) this.f50508Y.getValue();
    }

    /* JADX INFO: renamed from: D */
    public final void m61714D(String str) {
        this.f50509Z.close();
        C41696j.m91104d(this.f50509Z, null, null, new AmendOrderViewModel$subscribeLatestPrice$1(str, this, null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m61715x() {
        this.f50509Z.close();
    }

    /* JADX INFO: renamed from: y */
    public final AmendApi m61716y() {
        return (AmendApi) this.f50507X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<String> m61717z() {
        return this.f50511b0;
    }

    public AmendOrderViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.f50510a0 = mutableLiveData;
        this.f50511b0 = mutableLiveData;
    }

    /* JADX INFO: renamed from: w */
    public static final AmendApi m61711w() {
        return (AmendApi) C42597a.m93388d().create(AmendApi.class);
    }
}
