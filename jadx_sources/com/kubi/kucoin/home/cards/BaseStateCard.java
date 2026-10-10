package com.kubi.kucoin.home.cards;

import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.mvi.state.InterfaceC19285g;
import com.kubi.mvi.state.MviConfig;
import com.kubi.mvi.state.StateDelegate;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
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

/* JADX INFO: compiled from: BaseStateCard.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014JG\u0010\u001c\u001a\u00020\u0015\"\u0004\b\u0003\u0010\u001d*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u001d0\u001e2\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150!\u0012\u0006\u0012\u0004\u0018\u00010\"0 H\u0004¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020\u0015H\u0014J\r\u0010.\u001a\u00028\u0001H\u0004¢\u0006\u0002\u0010/J\u001b\u00100\u001a\u00020\u0015\"\b\b\u0003\u00101*\u00028\u0000*\u0002H1H\u0005¢\u0006\u0002\u00102J\u001b\u00103\u001a\u00020\u0015\"\b\b\u0003\u00101*\u00028\u0000*\u0002H1H\u0004¢\u0006\u0002\u00102J\u001b\u00104\u001a\u00028\u0001\"\b\b\u0003\u00101*\u00028\u0000*\u0002H1H\u0004¢\u0006\u0002\u00105J\b\u00106\u001a\u00020\u0015H\u0016J\b\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020\u0015H\u0016R\u001a\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/BaseStateCard;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "VM", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "Lcom/kubi/mvi/state/IStateConfig;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "stateDelegate", "Lcom/kubi/mvi/state/StateDelegate;", "stateLogTag", "", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "createStateDelegate", "bindFlowEvent", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "bindState", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/reflect/KProperty1;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "initView", "getState", "()Lcom/kubi/mvi/state/IState;", "sendToIntent", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/kubi/mvi/state/IIntent;)V", "sendIntent", "sendSyncIntent", "(Lcom/kubi/mvi/state/IIntent;)Lcom/kubi/mvi/state/IState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroy", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseStateCard<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> extends BaseCard implements InterfaceC19285g {

    /* JADX INFO: renamed from: V */
    public StateDelegate<I, S, VM> f27852V;

    /* JADX INFO: renamed from: W */
    public final String f27853W = getClass().getSimpleName();

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.BaseStateCard$onCreate$1 */
    /* JADX INFO: compiled from: BaseStateCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kucoin.home.cards.BaseStateCard$onCreate$1", m90122f = "BaseStateCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C153751 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseStateCard<I, S, VM> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153751(BaseStateCard<I, S, VM> baseStateCard, Continuation<? super C153751> continuation) {
            super(1, continuation);
            this.this$0 = baseStateCard;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C153751(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C153751) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m32174f(BaseStateCard baseStateCard, InterfaceC36952a interfaceC36952a) {
            baseStateCard.dispatchSingleEvent(interfaceC36952a);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.this$0.isDetached()) {
                    StateDelegate stateDelegate = this.this$0.f27852V;
                    StateDelegate stateDelegate2 = null;
                    if (stateDelegate == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                        stateDelegate = null;
                    }
                    stateDelegate.m42637z();
                    this.this$0.bindState();
                    this.this$0.bindFlowEvent();
                    StateDelegate stateDelegate3 = this.this$0.f27852V;
                    if (stateDelegate3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
                    } else {
                        stateDelegate2 = stateDelegate3;
                    }
                    final BaseStateCard<I, S, VM> baseStateCard = this.this$0;
                    stateDelegate2.m42626R(new Function1() { // from class: com.kubi.kucoin.home.cards.b
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return BaseStateCard.C153751.m32174f(baseStateCard, (InterfaceC36952a) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final <A> void bindState(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42628p(kProperty1, action);
    }

    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        return null;
    }

    @NotNull
    public abstract KClass<? extends VM> getVmClass();

    private final void createStateDelegate() {
        MviConfig mviConfig = new MviConfig(this, this);
        mviConfig.m42573m(getArguments());
        mviConfig.m42574n(this);
        mviConfig.m42575o(new Function0() { // from class: com.kubi.kucoin.home.cards.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseStateCard.m32172h3(this.f27868b);
            }
        });
        StateDelegate<I, S, VM> stateDelegate = new StateDelegate<>(mviConfig, getVmClass(), this);
        this.f27852V = stateDelegate;
        stateDelegate.m42613C();
    }

    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42612B("bindToUI");
    }

    public void bindState() {
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42627o();
    }

    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
    }

    public void initView() {
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42611A();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX WARN: Incorrect types in method signature: <T::TI;>(TT;)V */
    public final void sendIntent(@NotNull InterfaceC19282d interfaceC19282d) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42617G(interfaceC19282d);
    }

    /* JADX INFO: renamed from: h3 */
    public static final ViewModelProvider.Factory m32172h3(BaseStateCard baseStateCard) {
        return baseStateCard.getViewModeFactory();
    }

    @Override // com.kubi.mvi.state.InterfaceC19285g
    public boolean needCatchUIException() {
        return InterfaceC19285g.a.m42667a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        StateDelegate<I, S, VM> stateDelegate;
        super.onCreate(savedInstanceState);
        createStateDelegate();
        StateDelegate<I, S, VM> stateDelegate2 = this.f27852V;
        if (stateDelegate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        } else {
            stateDelegate = stateDelegate2;
        }
        StateDelegate.m42610r(stateDelegate, false, false, new C153751(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42614D();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        super.onHide();
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42615E();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        super.onShow();
        StateDelegate<I, S, VM> stateDelegate = this.f27852V;
        if (stateDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateDelegate");
            stateDelegate = null;
        }
        stateDelegate.m42616F();
    }

    public void bindFlowEvent() {
    }
}
