package com.sumsub.sns.core.presentation.base;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28382A;
import com.sumsub.sns.internal.core.common.C28384B;
import com.sumsub.sns.internal.core.common.C28386C;
import com.sumsub.sns.internal.core.common.C28512z;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.InlineMarker;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28142p0 extends AbstractC28052C {

    @NotNull
    public static final C28074N Companion = new C28074N();
    public static final long DEBOUNCE = 50;
    private static final long DEFAULT_TIMEOUT = 25000;
    private static final long FLOW_SUBSCRIBE_TIMEOUT = 5000;

    @NotNull
    private final InterfaceC29953a commonRepository;

    @NotNull
    private final InterfaceC41678w<C28143q> commonUiViewState;

    @NotNull
    private final InterfaceC41634e<C28075O> dataFlow;

    @NotNull
    private final InterfaceC29984m dataRepository;

    @NotNull
    private final C28076P initViewModelConfig;

    @NotNull
    private final InterfaceC41669n<Boolean> progressFlow;

    @NotNull
    private final InterfaceC41678w<AbstractC28082W> viewState;

    public abstract InterfaceC41634e buildViewStateFlow(C28075O c28075o);

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public /* bridge */ /* synthetic */ InterfaceC41673r getViewState() {
        return this.viewState;
    }

    public final <T> void launchWithProgress(@NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2) {
        showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C28110d0(function2, this, null), 2, null);
    }

    public boolean onFinishCalled(@NotNull AbstractC28503w abstractC28503w) {
        return true;
    }

    public final <T> T withProgress(@NotNull Function0<? extends T> function0) {
        showProgress(true);
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            showProgress(false);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object getConfig$suspendImpl(AbstractC28142p0 abstractC28142p0, Continuation<? super C29124h> continuation) {
        return TimeoutKt.m90469d(25000L, new C28084Y(abstractC28142p0, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object getString$suspendImpl(AbstractC28142p0 abstractC28142p0, String str, Continuation<? super String> continuation) {
        C28087a0 c28087a0;
        if (continuation instanceof C28087a0) {
            c28087a0 = (C28087a0) continuation;
            int i11 = c28087a0.f57288d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28087a0.f57288d = i11 - Integer.MIN_VALUE;
            } else {
                c28087a0 = new C28087a0(abstractC28142p0, continuation);
            }
        } else {
            c28087a0 = new C28087a0(abstractC28142p0, continuation);
        }
        Object strings = c28087a0.f57286b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28087a0.f57288d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(strings);
            if (str == null) {
                return null;
            }
            c28087a0.f57285a = str;
            c28087a0.f57288d = 1;
            strings = abstractC28142p0.getStrings(c28087a0);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c28087a0.f57285a;
            ResultKt.throwOnFailure(strings);
        }
        return ((C29983l) strings).m70061a(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object getStrings$suspendImpl(AbstractC28142p0 abstractC28142p0, Continuation<? super C29983l> continuation) {
        C28104b0 c28104b0;
        if (continuation instanceof C28104b0) {
            c28104b0 = (C28104b0) continuation;
            int i11 = c28104b0.f57311c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28104b0.f57311c = i11 - Integer.MIN_VALUE;
            } else {
                c28104b0 = new C28104b0(abstractC28142p0, continuation);
            }
        } else {
            c28104b0 = new C28104b0(abstractC28142p0, continuation);
        }
        Object objM90469d = c28104b0.f57309a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28104b0.f57311c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            C28107c0 c28107c0 = new C28107c0(abstractC28142p0, null);
            c28104b0.f57311c = 1;
            objM90469d = TimeoutKt.m90469d(25000L, c28107c0, c28104b0);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        C29983l c29983l = (C29983l) objM90469d;
        return c29983l == null ? new C29983l() : c29983l;
    }

    @NotNull
    public final InterfaceC41678w<C28143q> getCommonUiViewState$idensic_mobile_sdk_aar_defaultRelease() {
        return this.commonUiViewState;
    }

    @Nullable
    public final Object getData(@NotNull Continuation<? super C28075O> continuation) {
        return TimeoutKt.m90469d(25000L, new C28085Z(this, null), continuation);
    }

    @NotNull
    public final InterfaceC41634e<C28075O> getDataFlow() {
        return this.dataFlow;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @NotNull
    public final InterfaceC41678w<AbstractC28082W> getViewState() {
        return this.viewState;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public void showProgress(boolean z11) {
        this.progressFlow.setValue(Boolean.valueOf(z11));
    }

    public AbstractC28142p0(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C28076P c28076p) {
        this.commonRepository = interfaceC29953a;
        this.dataRepository = interfaceC29984m;
        this.initViewModelConfig = c28076p;
        C28131k0 c28131k0 = new C28131k0(C41636g.m90917h(C41636g.m90939v(new C28512z(C41636g.m90927m(C41636g.m90887K(new C28382A(null)), C41636g.m90897U(new C28119g0(((C29967J) interfaceC29984m).f60201i, this), new C28384B(null)), new C28386C(null)))), new C28083X(this, null)));
        this.dataFlow = c28131k0;
        InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(new C28138n0(C41636g.m90939v(c28131k0), this), C41782z0.m91392b());
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        this.commonUiViewState = C41636g.m90916g0(interfaceC41634eM90890N, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), new C28143q());
        this.progressFlow = C41679x.m91009a(Boolean.FALSE);
        this.viewState = C41636g.m90916g0(C41636g.m90937t(C41636g.m90930n0(C41636g.m90939v(c28131k0), new C28122h0(this, null)), 50L), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), c28076p.f57272a);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C28072M(this, null), 2, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @Nullable
    public Object getConfig(@NotNull Continuation<? super C29124h> continuation) {
        return getConfig$suspendImpl(this, continuation);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @Nullable
    public Object getString(@Nullable String str, @NotNull Continuation<? super String> continuation) {
        return getString$suspendImpl(this, str, continuation);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @Nullable
    public Object getStrings(@NotNull Continuation<? super C29983l> continuation) {
        return getStrings$suspendImpl(this, continuation);
    }

    public void intent(@NotNull InterfaceC28077Q interfaceC28077Q) {
    }
}
