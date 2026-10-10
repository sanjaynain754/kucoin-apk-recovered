package com.kubi.mvi.state;

import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: BaseStateFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0016H\u0014J\b\u0010!\u001a\u00020\u0016H\u0014J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0014JG\u0010 \u001a\u00020\u0016\"\u0004\b\u0003\u0010'*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H'0(2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160+\u0012\u0006\u0012\u0004\u0018\u00010,0*H\u0004¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0016H\u0014J\r\u0010/\u001a\u00028\u0001H\u0004¢\u0006\u0002\u00100J\u001b\u00101\u001a\u00020\u0016\"\b\b\u0003\u00102*\u00028\u0000*\u0002H2H\u0004¢\u0006\u0002\u00103J\u001b\u00104\u001a\u00020\u0016\"\b\b\u0003\u00102*\u00028\u0000*\u0002H2H\u0005¢\u0006\u0002\u00103J)\u00105\u001a\u000206*\u0002072\u0016\u0010:\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010,0;\"\u0004\u0018\u00010,H\u0004¢\u0006\u0002\u0010<J!\u0010=\u001a\u00028\u0001\"\u0004\b\u0003\u00102\"\b\b\u0004\u0010>*\u00028\u0000*\u0002H>H\u0004¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u0016H\u0016R\u001a\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u00105\u001a\u000206*\u0002078DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006A"}, m90084d2 = {"Lcom/kubi/mvi/state/BaseStateFragment;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "VM", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/mvi/state/IStateConfig;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "stateDelegate", "Lcom/kubi/mvi/state/StateDelegate;", "asyncInit", "", "getAsyncInit", "()Z", "createStateDelegate", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "init", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindState", "bindFlowEvent", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/reflect/KProperty1;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "initView", "getState", "()Lcom/kubi/mvi/state/IState;", "sendIntent", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/kubi/mvi/state/IIntent;)V", "sendToIntent", "language", "", "", "getLanguage", "(I)Ljava/lang/String;", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "sendSyncIntent", "Intent", "(Lcom/kubi/mvi/state/IIntent;)Lcom/kubi/mvi/state/IState;", "onDestroy", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseStateFragment<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> extends OldBaseFragment implements InterfaceC19285g {
    private final boolean asyncInit = true;
    private StateDelegate<I, S, VM> stateDelegate;

    /* JADX INFO: renamed from: com.kubi.mvi.state.BaseStateFragment$onCreate$1 */
    /* JADX INFO: compiled from: BaseStateFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mvi.state.BaseStateFragment$onCreate$1", m90122f = "BaseStateFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192551 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseStateFragment<I, S, VM> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192551(BaseStateFragment<I, S, VM> baseStateFragment, Continuation<? super C192551> continuation) {
            super(1, continuation);
            this.this$0 = baseStateFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C192551(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C192551) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.this$0.isDetached()) {
                    this.this$0.init();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void bindState() {
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42627o();
    }

    @NotNull
    public final String getLanguage(int i11) {
        return getStringRes(i11, new Object[0]);
    }

    @NotNull
    public abstract KClass<? extends VM> getVmClass();

    private final void createStateDelegate() {
        MviConfig mviConfig = new MviConfig(this, this);
        mviConfig.m42573m(getArguments());
        mviConfig.m42574n(this);
        mviConfig.m42575o(new Function0() { // from class: com.kubi.mvi.state.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f35687b.getViewModeFactory();
            }
        });
        StateDelegate<I, S, VM> stateDelegate = new StateDelegate<>(mviConfig, getVmClass(), this);
        this.stateDelegate = stateDelegate;
        stateDelegate.m42613C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$2(BaseStateFragment baseStateFragment, InterfaceC36952a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseStateFragment.dispatchSingleEvent(it);
        return Unit.INSTANCE;
    }

    public final <A> void bindState(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42628p(kProperty1, action);
    }

    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
    }

    public boolean getAsyncInit() {
        return this.asyncInit;
    }

    @NotNull
    public final S getState() {
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            return (S) stateDelegate.m42632u();
        }
        throw new IllegalStateException(getClass().getSimpleName() + ": stateDelegate not initialized");
    }

    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        C19243e.m42538g("getViewModeFactory", stateDelegate.getF35660a().m42567g());
        return null;
    }

    public void init() {
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        StateDelegate<I, S, VM> stateDelegate2 = null;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42637z();
        bindState();
        bindFlowEvent();
        StateDelegate<I, S, VM> stateDelegate3 = this.stateDelegate;
        if (stateDelegate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
        } else {
            stateDelegate2 = stateDelegate3;
        }
        stateDelegate2.m42626R(new Function1() { // from class: com.kubi.mvi.state.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseStateFragment.init$lambda$2(this.f35686b, (InterfaceC36952a) obj);
            }
        });
    }

    public void initView() {
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            stateDelegate.m42611A();
        }
    }

    @NotNull
    public final String language(int i11, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return getStringRes(i11, formatArgs);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX WARN: Incorrect types in method signature: <T::TI;>(TT;)V */
    public final void sendIntent(@NotNull InterfaceC19282d interfaceC19282d) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            stateDelegate.m42617G(interfaceC19282d);
            return;
        }
        C19243e.m42538g(interfaceC19282d.getClass().getSimpleName() + ": stateDelegate not initialized, skipping sendIntent", "MVI_ERROR");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;Intent::TI;>(TIntent;)TS; */
    @NotNull
    public final InterfaceC19284f sendSyncIntent(@NotNull InterfaceC19282d interfaceC19282d) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            return stateDelegate.m42618H(interfaceC19282d);
        }
        throw new IllegalStateException(interfaceC19282d.getClass().getSimpleName() + ": stateDelegate not initialized");
    }

    /* JADX WARN: Incorrect types in method signature: <T::TI;>(TT;)V */
    @Deprecated(message = "use sendIntent")
    public final void sendToIntent(@NotNull InterfaceC19282d interfaceC19282d) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            stateDelegate.m42617G(interfaceC19282d);
            return;
        }
        C19243e.m42538g(interfaceC19282d.getClass().getSimpleName() + ": stateDelegate not initialized, skipping sendToIntent", "MVI_ERROR");
    }

    public boolean needCatchUIException() {
        return InterfaceC19285g.a.m42667a(this);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        StateDelegate<I, S, VM> stateDelegate;
        super.onCreate(savedInstanceState);
        createStateDelegate();
        if (getAsyncInit()) {
            StateDelegate<I, S, VM> stateDelegate2 = this.stateDelegate;
            if (stateDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            } else {
                stateDelegate = stateDelegate2;
            }
            StateDelegate.m42610r(stateDelegate, false, false, new C192551(this, null), 3, null);
            return;
        }
        init();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            stateDelegate.m42614D();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            stateDelegate.m42615E();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        StateDelegate<I, S, VM> stateDelegate = this.stateDelegate;
        if (stateDelegate != null) {
            if (stateDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                stateDelegate = null;
            }
            stateDelegate.m42616F();
        }
    }

    public void bindFlowEvent() {
    }
}
