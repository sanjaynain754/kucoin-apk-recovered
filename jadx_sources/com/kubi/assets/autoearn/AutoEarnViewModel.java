package com.kubi.assets.autoearn;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoEarnViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\tJ\u0012\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J.\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0019J\u0012\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J.\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0019R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "getAutoEarnState", "", FirebaseAnalytics.Param.CURRENCY, "", "onResult", "Lkotlin/Function1;", "", "partOPen", "onUnavailable", "onError", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kubi/assets/autoearn/AutoEarnContract$Effect;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "api", "Lcom/kubi/assets/autoearn/AutoEarnApi;", "kotlin.jvm.PlatformType", "openAutoEarn", "Lkotlin/Function2;", "closeAutoEarn", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AutoEarnViewModel extends ViewModel {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f16570Y = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC41668m<AbstractC9516f> f16571V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41673r<AbstractC9516f> f16572W;

    /* JADX INFO: renamed from: X */
    public final AutoEarnApi f16573X;

    /* JADX INFO: compiled from: AutoEarnViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnViewModel$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15425f(@Nullable String str, @NotNull Function2<? super Boolean, ? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AutoEarnViewModel$closeAutoEarn$2(str, this, onResult, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m15426g(@Nullable String str, @NotNull Function1<? super Boolean, Unit> onResult, @NotNull Function1<? super String, Unit> partOPen, @NotNull Function1<? super String, Unit> onUnavailable, @NotNull Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(partOPen, "partOPen");
        Intrinsics.checkNotNullParameter(onUnavailable, "onUnavailable");
        Intrinsics.checkNotNullParameter(onError, "onError");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AutoEarnViewModel$getAutoEarnState$1(this, str, onResult, partOPen, onUnavailable, onError, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41673r<AbstractC9516f> m15427n() {
        return this.f16572W;
    }

    /* JADX INFO: renamed from: p */
    public final void m15429p(@Nullable String str, @NotNull Function2<? super Boolean, ? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AutoEarnViewModel$openAutoEarn$2(str, this, onResult, null), 2, null);
    }

    public AutoEarnViewModel() {
        InterfaceC41668m<AbstractC9516f> interfaceC41668mM91001b = C41674s.m91001b(0, 0, null, 7, null);
        this.f16571V = interfaceC41668mM91001b;
        this.f16572W = C41636g.m90905b(interfaceC41668mM91001b);
        this.f16573X = (AutoEarnApi) C42597a.m93388d().create(AutoEarnApi.class);
    }

    /* JADX INFO: renamed from: e */
    public final void m15424e(@Nullable String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AutoEarnViewModel$closeAutoEarn$1(str, this, null), 2, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m15428o(@Nullable String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AutoEarnViewModel$openAutoEarn$1(str, this, null), 2, null);
    }
}
