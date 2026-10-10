package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CallSuper;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.presentation.result.C32363c;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41637h;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28052C extends ViewModel {

    @NotNull
    private final InterfaceC41634e<InterfaceC28145r> events;

    @NotNull
    private final InterfaceC41565d<InterfaceC28145r> eventsInternal;
    private boolean firstAttachHandled;

    @Nullable
    private Boolean isAttachedToFragment;
    private boolean isUnitTest;

    @Nullable
    private Pair<? extends AbstractC29149l0, String> pendingError;

    @Nullable
    private C28137n pendingFinishEvent;

    public static /* synthetic */ void throwError$default(AbstractC28052C abstractC28052C, Throwable th2, String str, Parcelable parcelable, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwError");
        }
        if ((i11 & 4) != 0) {
            parcelable = null;
        }
        abstractC28052C.throwError(th2, str, parcelable);
    }

    @CallSuper
    public void fireEvent(@NotNull InterfaceC28145r interfaceC28145r) {
        fireEvent(interfaceC28145r, true);
    }

    public abstract Object getConfig(Continuation continuation);

    public abstract Object getString(String str, Continuation continuation);

    public abstract Object getStrings(Continuation continuation);

    public abstract InterfaceC41673r getViewState();

    public final void throwError(@NotNull Throwable th2, @NotNull String str, @Nullable Parcelable parcelable) {
        AbstractC29149l0 abstractC29149l0M69376a = AbstractC28476n.m69376a(th2, parcelable);
        if (abstractC29149l0M69376a != null) {
            throwError$default(this, abstractC29149l0M69376a, str, false, null, 12, null);
        }
    }

    public static /* synthetic */ void finish$default(AbstractC28052C abstractC28052C, AbstractC28503w abstractC28503w, Object obj, Long l11, C32363c c32363c, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
        }
        if ((i11 & 1) != 0) {
            abstractC28503w = C28497u.f58029b;
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        if ((i11 & 8) != 0) {
            c32363c = null;
        }
        abstractC28052C.finish(abstractC28503w, obj, l11, c32363c);
    }

    public static /* synthetic */ void finishWithResult$default(AbstractC28052C abstractC28052C, int i11, Bundle bundle, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishWithResult");
        }
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        if ((i12 & 2) != 0) {
            bundle = new Bundle();
        }
        abstractC28052C.finishWithResult(i11, bundle);
    }

    public static /* synthetic */ void onLinkClicked$default(AbstractC28052C abstractC28052C, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLinkClicked");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        abstractC28052C.onLinkClicked(str, z11);
    }

    public static /* synthetic */ void throwError$default(AbstractC28052C abstractC28052C, AbstractC29149l0 abstractC29149l0, String str, boolean z11, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwError");
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        abstractC28052C.throwError(abstractC29149l0, str, z11, str2);
    }

    public final void checkThrowableIsCritical(@NotNull Throwable th2) {
        Integer code;
        if ((th2 instanceof SNSException.Api) && (code = ((SNSException.Api) th2).getCode()) != null && code.intValue() == 401) {
            throwError$default(this, th2, getDocumentType(), null, 4, null);
        }
    }

    public final void finish(@NotNull AbstractC28503w abstractC28503w, @Nullable Object obj, @Nullable Long l11, @Nullable C32363c c32363c) {
        C28137n c28137n = new C28137n(abstractC28503w, obj, l11);
        showProgress(false);
        if (c32363c == null) {
            fireEvent(c28137n);
        } else {
            this.pendingFinishEvent = c28137n;
            fireEvent(new C28149t(c32363c));
        }
    }

    public final void finishAbnormal(@NotNull String str) {
        finish$default(this, new C28500v(new SNSCompletionResult.AbnormalTermination(new SNSGeneralException(str, null, null, 6, null))), null, null, null, 14, null);
    }

    public final void finishWithResult(int i11, @NotNull Bundle bundle) {
        fireEvent(new C28139o(i11, bundle));
    }

    public final void fireEvent(@NotNull InterfaceC28145r interfaceC28145r, boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91393c().getImmediate(), null, new C28162z(z11, this, interfaceC28145r, null), 2, null);
    }

    @NotNull
    public String getDocumentType() {
        return "TYPE_UNKNOWN";
    }

    @NotNull
    public final InterfaceC41634e<InterfaceC28145r> getEvents() {
        return this.events;
    }

    @Nullable
    public final C28137n getPendingFinishEvent$idensic_mobile_sdk_aar_defaultRelease() {
        return this.pendingFinishEvent;
    }

    @Nullable
    public final Boolean isAttachedToFragment() {
        return this.isAttachedToFragment;
    }

    public final boolean isFinishingWithResult() {
        return this.pendingFinishEvent != null;
    }

    @VisibleForTesting(otherwise = 4)
    public final boolean isUnitTest() {
        return this.isUnitTest;
    }

    @CallSuper
    public void onAttach() {
        String second;
        Pair<? extends AbstractC29149l0, String> pair = this.pendingError;
        if (pair != null) {
            AbstractC29149l0 first = pair.getFirst();
            Pair<? extends AbstractC29149l0, String> pair2 = this.pendingError;
            if (pair2 == null || (second = pair2.getSecond()) == null) {
                second = "";
            }
            String str = second;
            this.pendingError = null;
            throwError$default(this, first, str, false, null, 12, null);
        }
    }

    public final void setAttachedToFragment(@Nullable Boolean bool) {
        this.isAttachedToFragment = bool;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setUnitTest(boolean z11) {
        this.isUnitTest = z11;
    }

    public void showProgress(boolean z11) {
        fireEvent(new C28152u(z11));
    }

    public final void throwError(@Nullable AbstractC29149l0 abstractC29149l0, @NotNull String str, boolean z11, @Nullable String str2) {
        Throwable thMo69765c;
        Boolean bool = this.isAttachedToFragment;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.areEqual(bool, bool2) && z11) {
            return;
        }
        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this), "An error happened", abstractC29149l0 != null ? abstractC29149l0.mo69765c() : null);
        if (((abstractC29149l0 instanceof C29131i0) || (abstractC29149l0 instanceof C29107e0)) && (thMo69765c = abstractC29149l0.mo69765c()) != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41685g2.f91735b, null, new C28048A(thMo69765c, null), 2, null);
        }
        if (!Intrinsics.areEqual(this.isAttachedToFragment, bool2) || z11) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28050B(this, abstractC29149l0, str, str2, null), 3, null);
        } else {
            this.pendingError = TuplesKt.m90091to(abstractC29149l0, str);
        }
    }

    public AbstractC28052C() {
        InterfaceC41565d<InterfaceC28145r> interfaceC41565dM90691b = C41568g.m90691b(0, null, null, 7, null);
        this.eventsInternal = interfaceC41565dM90691b;
        this.events = C41636g.m90895S(C41636g.m90898V(FlowKt__ShareKt.m90802g(C41637h.m90945b(C41636g.m90890N(C41636g.m90900X(interfaceC41565dM90691b), C41782z0.m91393c().getImmediate()), 0, null, 3, null), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 0, 4, null), new C28158x(this, null)), new C28160y(this, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m69059a(SNSCompletionResult.AbnormalTermination abnormalTermination) {
        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this), "Completion the SDK with result - " + abnormalTermination, null);
        finish$default(this, new C28500v(abnormalTermination), null, null, null, 14, null);
    }

    public void onHandleError(@NotNull AbstractC29149l0 abstractC29149l0) {
        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this), "Handle error: " + abstractC29149l0, null);
        if (abstractC29149l0 instanceof C29131i0) {
            onLoad();
        } else if (abstractC29149l0 instanceof C29107e0) {
            m69059a(new SNSCompletionResult.AbnormalTermination(((C29107e0) abstractC29149l0).f59055a));
        }
    }

    public final void onLinkClicked(@NotNull String str, boolean z11) {
        try {
            C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this), "An user has clicked on " + str, null);
            if (Intrinsics.areEqual(str, "support")) {
                fireEvent(C28154v.f57398a);
            } else {
                fireEvent(new C28141p(str, z11));
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e(AbstractC33294e.m71624a(this), "onLinkClicked", th2);
        }
    }

    public void onDetach() {
    }

    public void onFirstAttach() {
    }

    public void onLoad() {
    }

    public void onErrorCancelled(@NotNull AbstractC29149l0 abstractC29149l0) {
    }
}
