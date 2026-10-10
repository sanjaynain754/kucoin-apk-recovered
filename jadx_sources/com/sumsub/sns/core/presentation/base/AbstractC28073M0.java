package com.sumsub.sns.core.presentation.base;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28073M0 extends AbstractC28052C {

    @NotNull
    private static final C28148s0 Companion = new C28148s0();

    @Deprecated
    public static final long DEFAULT_TIMEOUT = 25000;

    @Nullable
    private C29983l _strings;

    @NotNull
    private final InterfaceC41669n<C28150t0> _viewModelInternalState;

    @NotNull
    private final InterfaceC41668m<InterfaceC28147s> _viewState;

    @NotNull
    private final InterfaceC29953a commonRepository;

    @Nullable
    private C29124h config;

    @NotNull
    private final InterfaceC29984m dataRepository;

    @NotNull
    private final CoroutineExceptionHandler prepareExceptionHandler;

    @NotNull
    private final InterfaceC41565d<Function2<InterfaceC28147s, Continuation<InterfaceC28147s>, Object>> updateStateQueue = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);

    @NotNull
    private final InterfaceC41678w<C28150t0> viewModelInternalState;

    @NotNull
    private final InterfaceC41673r<InterfaceC28147s> viewState;

    /* JADX INFO: renamed from: a */
    public static final C28150t0 m69069a(C28150t0 c28150t0) {
        return C28150t0.m69088a(c28150t0, false, null, null, 25);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @Nullable
    public Object getConfig(@NotNull Continuation<? super C29124h> continuation) {
        return getConfig$suspendImpl(this, continuation);
    }

    public InterfaceC28147s getDefaultState() {
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @Nullable
    public Object getStrings(@NotNull Continuation<? super C29983l> continuation) {
        return getStrings$suspendImpl(this, continuation);
    }

    public AbstractC28073M0(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        this.commonRepository = interfaceC29953a;
        this.dataRepository = interfaceC29984m;
        InterfaceC41668m<InterfaceC28147s> interfaceC41668mM91001b = C41674s.m91001b(1, 0, null, 6, null);
        this._viewState = interfaceC41668mM91001b;
        this.viewState = C41636g.m90910d0(C41636g.m90939v(interfaceC41668mM91001b), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        InterfaceC41669n<C28150t0> interfaceC41669nM91009a = C41679x.m91009a(new C28150t0(false, false, false, null, null));
        this._viewModelInternalState = interfaceC41669nM91009a;
        this.viewModelInternalState = C41636g.m90907c(interfaceC41669nM91009a);
        C28069K0 c28069k0 = new C28069K0(CoroutineExceptionHandler.INSTANCE, this);
        this.prepareExceptionHandler = c28069k0;
        AbstractC28421U.m69306b(((C29967J) interfaceC29984m).f60201i, ViewModelKt.getViewModelScope(this), new C28144q0(this, null));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28146r0(this, null), 3, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91393c().plus(c28069k0), null, new C28067J0(this, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ <T extends InterfaceC28147s> Object getConfig$suspendImpl(AbstractC28073M0 abstractC28073M0, Continuation<? super C29124h> continuation) {
        C28049A0 c28049a0;
        if (continuation instanceof C28049A0) {
            c28049a0 = (C28049A0) continuation;
            int i11 = c28049a0.f57195d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28049a0.f57195d = i11 - Integer.MIN_VALUE;
            } else {
                c28049a0 = new C28049A0(abstractC28073M0, continuation);
            }
        } else {
            c28049a0 = new C28049A0(abstractC28073M0, continuation);
        }
        Object obj = c28049a0.f57193b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28049a0.f57195d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c28049a0.f57192a = abstractC28073M0;
            c28049a0.f57195d = 1;
            if (abstractC28073M0.awaitStringsReady(c28049a0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC28073M0 = c28049a0.f57192a;
            ResultKt.throwOnFailure(obj);
        }
        return abstractC28073M0.config;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ <T extends InterfaceC28147s> Object getString$suspendImpl(AbstractC28073M0 abstractC28073M0, String str, Continuation<? super String> continuation) {
        C28051B0 c28051b0;
        if (continuation instanceof C28051B0) {
            c28051b0 = (C28051B0) continuation;
            int i11 = c28051b0.f57208e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28051b0.f57208e = i11 - Integer.MIN_VALUE;
            } else {
                c28051b0 = new C28051B0(abstractC28073M0, continuation);
            }
        } else {
            c28051b0 = new C28051B0(abstractC28073M0, continuation);
        }
        Object obj = c28051b0.f57206c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28051b0.f57208e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c28051b0.f57204a = abstractC28073M0;
            c28051b0.f57205b = str;
            c28051b0.f57208e = 1;
            if (abstractC28073M0.awaitStringsReady(c28051b0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c28051b0.f57205b;
            abstractC28073M0 = c28051b0.f57204a;
            ResultKt.throwOnFailure(obj);
        }
        if (str == null) {
            return null;
        }
        return abstractC28073M0.getStrings().m70061a(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ <T extends InterfaceC28147s> Object getStrings$suspendImpl(AbstractC28073M0 abstractC28073M0, Continuation<? super C29983l> continuation) {
        C28053C0 c28053c0;
        if (continuation instanceof C28053C0) {
            c28053c0 = (C28053C0) continuation;
            int i11 = c28053c0.f57212d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28053c0.f57212d = i11 - Integer.MIN_VALUE;
            } else {
                c28053c0 = new C28053C0(abstractC28073M0, continuation);
            }
        } else {
            c28053c0 = new C28053C0(abstractC28073M0, continuation);
        }
        Object obj = c28053c0.f57210b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28053c0.f57212d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c28053c0.f57209a = abstractC28073M0;
            c28053c0.f57212d = 1;
            if (abstractC28073M0.awaitStringsReady(c28053c0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC28073M0 = c28053c0.f57209a;
            ResultKt.throwOnFailure(obj);
        }
        return abstractC28073M0.getStrings();
    }

    public static /* synthetic */ <T extends InterfaceC28147s> Object onPrepare$suspendImpl(AbstractC28073M0 abstractC28073M0, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateState$default(AbstractC28073M0 abstractC28073M0, boolean z11, Function2 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        abstractC28073M0.updateState(z11, function2);
    }

    /* JADX INFO: renamed from: a */
    public final void m69070a(InterfaceC28147s interfaceC28147s) {
        if (interfaceC28147s == null && C28468k0.f57988f) {
            throw new IllegalStateException(("Before updating state provide default state for " + AbstractC33294e.m71624a(this) + " by overriding getDefaultState()").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object awaitStringsReady(@NotNull Continuation<? super Boolean> continuation) {
        C28153u0 c28153u0;
        if (continuation instanceof C28153u0) {
            c28153u0 = (C28153u0) continuation;
            int i11 = c28153u0.f57397c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28153u0.f57397c = i11 - Integer.MIN_VALUE;
            } else {
                c28153u0 = new C28153u0(this, continuation);
            }
        } else {
            c28153u0 = new C28153u0(this, continuation);
        }
        Object objM90469d = c28153u0.f57395a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28153u0.f57397c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            C28157w0 c28157w0 = new C28157w0(this, null);
            c28153u0.f57397c = 1;
            objM90469d = TimeoutKt.m90469d(DEFAULT_TIMEOUT, c28157w0, c28153u0);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        return Boxing.boxBoolean(objM90469d != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object awaitViewModelPrepared(@NotNull Continuation<? super Boolean> continuation) {
        C28159x0 c28159x0;
        if (continuation instanceof C28159x0) {
            c28159x0 = (C28159x0) continuation;
            int i11 = c28159x0.f57406c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28159x0.f57406c = i11 - Integer.MIN_VALUE;
            } else {
                c28159x0 = new C28159x0(this, continuation);
            }
        } else {
            c28159x0 = new C28159x0(this, continuation);
        }
        Object objM90469d = c28159x0.f57404a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28159x0.f57406c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            C28163z0 c28163z0 = new C28163z0(this, null);
            c28159x0.f57406c = 1;
            objM90469d = TimeoutKt.m90469d(DEFAULT_TIMEOUT, c28163z0, c28159x0);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        return Boxing.boxBoolean(objM90469d != null);
    }

    @NotNull
    public final InterfaceC28147s currentState() {
        InterfaceC28147s interfaceC28147s = (InterfaceC28147s) CollectionsKt.firstOrNull((List) this._viewState.mo86421a());
        return interfaceC28147s == null ? getDefaultState() : interfaceC28147s;
    }

    @Nullable
    public final C29124h getConfig() {
        return this.config;
    }

    @NotNull
    public final C29983l getStrings() {
        C29983l c29983l = this._strings;
        if (c29983l != null) {
            return c29983l;
        }
        IllegalAccessException illegalAccessException = new IllegalAccessException("Accessing strings before onPrepared(). Use getStrings() or getString() instead.");
        C33272c.f67816e.f67810a.mo68956e(AbstractC33294e.m71624a(this), "Accessing strings before onPrepared()", illegalAccessException);
        return new C29983l();
    }

    @NotNull
    public final InterfaceC41678w<C28150t0> getViewModelInternalState() {
        return this.viewModelInternalState;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @NotNull
    public InterfaceC41673r<InterfaceC28147s> getViewState() {
        return this.viewState;
    }

    public final void onPrepareError() {
        if (this._strings == null) {
            this._strings = new C29983l();
        }
        InterfaceC41669n<C28150t0> interfaceC41669n = this._viewModelInternalState;
        interfaceC41669n.setValue((C28150t0) new Function1() { // from class: com.sumsub.sns.core.presentation.base.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28073M0.m69069a((C28150t0) obj);
            }
        }.invoke(interfaceC41669n.getValue()));
    }

    public final boolean shouldHideLogo() {
        return this.viewModelInternalState.getValue().f57389d;
    }

    public final void updateState(boolean z11, @NotNull Function2<InterfaceC28147s, ? super Continuation<InterfaceC28147s>, ? extends Object> function2) {
        if (!z11) {
            ChannelResult.m90669b(this.updateStateQueue.mo90594e(function2));
            return;
        }
        InterfaceC28147s interfaceC28147sCurrentState = currentState();
        m69070a(interfaceC28147sCurrentState);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28071L0(this, function2, interfaceC28147sCurrentState, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    @Nullable
    public Object getString(@Nullable String str, @NotNull Continuation<? super String> continuation) {
        return getString$suspendImpl(this, str, continuation);
    }

    public final void launchOnViewModelScope(@NotNull String str, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28055D0(function2, this, str, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Lifecycle: onCleared", null, 4, null);
        InterfaceC41576o.a.m90713a(this.updateStateQueue, null, 1, null);
    }

    public Object onPrepare(Continuation continuation) {
        return onPrepare$suspendImpl(this, continuation);
    }
}
