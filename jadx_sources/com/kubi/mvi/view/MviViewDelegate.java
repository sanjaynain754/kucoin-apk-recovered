package com.kubi.mvi.view;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.mvi.state.MviConfig;
import com.kubi.mvi.state.TaskFlow;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: MviViewDelegate.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0007B+\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00122\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J!\u0010\u001d\u001a\u00020\u00122\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J?\u0010$\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\u001c\u0010#\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\"\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00028\u0001¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b(\u0010\u0015J\u0015\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+JK\u0010)\u001a\u00020\u0012\"\u0004\b\u0003\u0010\u001d2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030,2\"\u0010/\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\"\u0012\u0006\u0012\u0004\u0018\u00010\u00070.¢\u0006\u0004\b)\u00100J\u000f\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b1\u0010\u0017J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010\u0017J\r\u00103\u001a\u00020\u0012¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u0017J\u000f\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u0010\u0017J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010\u0017J\u000f\u00107\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010I\u001a\u00028\u00028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010H¨\u0006J"}, m90084d2 = {"Lcom/kubi/mvi/view/MviViewDelegate;", "Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/BaseStateVM;", "VM", "", "Lcom/kubi/mvi/state/MviConfig;", "mviConfig", "Lkotlin/reflect/KClass;", "vmClass", "Lcom/kubi/mvi/view/a;", "mviView", "<init>", "(Lcom/kubi/mvi/state/MviConfig;Lkotlin/reflect/KClass;Lcom/kubi/mvi/view/a;)V", "Lkotlin/Function1;", "Ldr/a;", "", "singleIntentHandler", "p", "(Lkotlin/jvm/functions/Function1;)V", "x", "()V", "Lkotlin/Function0;", "call", "z", "(Lkotlin/jvm/functions/Function0;)V", "y", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "", JPushConstants.Operation.KEY_SEQUENCE, "mainThread", "Lkotlin/coroutines/Continuation;", "block", "j", "(ZZLkotlin/jvm/functions/Function1;)V", "m", "()Lcom/kubi/mvi/state/f;", "C", "i", "w", "(Lcom/kubi/mvi/state/d;)V", "Lkotlin/reflect/KProperty1;", "kProperty1", "Lkotlin/Function2;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAMING_FORMAT_SS, "r", "q", CmcdData.Factory.STREAMING_FORMAT_HLS, "t", "v", "u", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/mvi/state/MviConfig;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lcom/kubi/mvi/state/MviConfig;", "b", "Lkotlin/reflect/KClass;", "c", "Lcom/kubi/mvi/view/a;", "Lcom/kubi/mvi/state/TaskFlow;", "d", "Lkotlin/Lazy;", "n", "()Lcom/kubi/mvi/state/TaskFlow;", "taskFlow", "e", "o", "()Lcom/kubi/mvi/state/BaseStateVM;", "vm", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public class MviViewDelegate<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MviConfig mviConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final KClass<? extends VM> vmClass;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC19301a mviView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy taskFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy vm;

    /* JADX INFO: renamed from: B */
    public final void m42705B() {
        C19243e.m42539h("showLoadingView", null, 1, null);
        InterfaceC19301a interfaceC19301a = this.mviView;
        if (interfaceC19301a != null) {
            interfaceC19301a.mo42690d();
        }
    }

    public MviViewDelegate(@NotNull MviConfig mviConfig, @NotNull KClass<? extends VM> vmClass, @Nullable InterfaceC19301a interfaceC19301a) {
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        this.mviConfig = mviConfig;
        this.vmClass = vmClass;
        this.mviView = interfaceC19301a;
        this.taskFlow = LazyKt.lazy(new Function0<TaskFlow>() { // from class: com.kubi.mvi.view.MviViewDelegate$taskFlow$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final TaskFlow invoke() {
                return new TaskFlow();
            }
        });
        this.vm = LazyKt.lazy(new Function0<VM>(this) { // from class: com.kubi.mvi.view.MviViewDelegate$vm$2
            final /* synthetic */ MviViewDelegate<I, S, VM> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TVM; */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final BaseStateVM invoke() {
                ViewModelProvider.Factory factoryM42569i = this.this$0.getMviConfig().m42569i();
                if (factoryM42569i != null) {
                    MviViewDelegate<I, S, VM> mviViewDelegate = this.this$0;
                    BaseStateVM baseStateVM = (BaseStateVM) MviExKt.m42513i(mviViewDelegate.getMviConfig().getViewModelStoreOwner(), mviViewDelegate.vmClass, factoryM42569i);
                    if (baseStateVM != null) {
                        return baseStateVM;
                    }
                }
                return (BaseStateVM) MviExKt.m42514j(this.this$0.getMviConfig().getViewModelStoreOwner(), this.this$0.vmClass, null, 2, null);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m42703k(MviViewDelegate mviViewDelegate, boolean z11, boolean z12, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emitTask");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        mviViewDelegate.m42709j(z11, z12, function1);
    }

    /* JADX INFO: renamed from: A */
    public final void m42704A(Function0<Unit> call) {
        C19243e.m42539h(this.mviConfig.m42567g() + "  showFailView", null, 1, null);
        InterfaceC19301a interfaceC19301a = this.mviView;
        if (interfaceC19301a != null) {
            interfaceC19301a.mo42687a();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m42707h() {
        C19243e.m42538g(this.mviConfig.m42567g() + " bindState", this.mviConfig.m42567g());
    }

    /* JADX INFO: renamed from: i */
    public final <A> void m42708i(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "kProperty1");
        Intrinsics.checkNotNullParameter(action, "action");
        m42703k(this, false, false, new MviViewDelegate$bindState$1(this, kProperty1, action, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m42709j(boolean sequence, boolean mainThread, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (ChannelResult.m90676i(m42712n().m42656e(sequence, mainThread, block))) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(m42713o()), null, null, new MviViewDelegate$emitTask$1(this, sequence, mainThread, block, null), 3, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final MviConfig getMviConfig() {
        return this.mviConfig;
    }

    /* JADX INFO: renamed from: n */
    public final TaskFlow m42712n() {
        return (TaskFlow) this.taskFlow.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VM m42713o() {
        return (VM) this.vm.getValue();
    }

    /* JADX INFO: renamed from: r */
    public void m42716r() {
        C19243e.m42538g(this.mviConfig.m42567g() + " initView", this.mviConfig.m42567g());
    }

    /* JADX INFO: renamed from: s */
    public void m42717s() {
        C19243e.m42538g(this.mviConfig.m42567g() + " onCreate", this.mviConfig.m42567g());
    }

    /* JADX INFO: renamed from: u */
    public void m42719u() {
        C19243e.m42539h(this.mviConfig.m42567g() + " onHide", null, 1, null);
        m42703k(this, false, false, new MviViewDelegate$onHide$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public void m42720v() {
        C19243e.m42539h(this.mviConfig.m42567g() + " onShow", null, 1, null);
        m42703k(this, false, false, new MviViewDelegate$onShow$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m42721w(@NotNull I i11) {
        Intrinsics.checkNotNullParameter(i11, "i");
        m42703k(this, false, false, new MviViewDelegate$sendIntent$1(this, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m42722x() {
        C19243e.m42539h(this.mviConfig.m42567g() + " showContentView", null, 1, null);
        InterfaceC19301a interfaceC19301a = this.mviView;
        if (interfaceC19301a != null) {
            interfaceC19301a.mo42689c();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m42723y() {
        C19243e.m42539h(this.mviConfig.m42567g() + "  showEmptyView", null, 1, null);
        InterfaceC19301a interfaceC19301a = this.mviView;
        if (interfaceC19301a != null) {
            interfaceC19301a.mo42688b();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m42724z(Function0<Unit> call) {
        C19243e.m42539h(this.mviConfig.m42567g() + "  showErrorView", null, 1, null);
        InterfaceC19301a interfaceC19301a = this.mviView;
        if (interfaceC19301a != null) {
            interfaceC19301a.mo42691e();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m42706C(@Nullable Function1<? super InterfaceC36952a, Unit> singleIntentHandler) {
        m42714p(singleIntentHandler);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final S m42711m() {
        return (S) m42713o().getState();
    }

    /* JADX INFO: renamed from: p */
    public final void m42714p(Function1<? super InterfaceC36952a, Unit> singleIntentHandler) {
        MviExKt.m42506b(m42713o().getSingleEventFlow(), this.mviConfig.getLifecycleOwner(), new MviViewDelegate$handleSingleEvent$1(this, singleIntentHandler, null));
    }

    /* JADX INFO: renamed from: q */
    public final void m42715q() {
        m42713o().setMVIContext(this.mviConfig);
    }

    /* JADX INFO: renamed from: t */
    public void m42718t() {
        m42712n().m42655d();
        m42713o().destroyMVIContext();
        C19243e.m42538g(this.mviConfig.m42567g() + " onDestroy", this.mviConfig.m42567g());
        this.mviConfig.getHandler().removeCallbacksAndMessages(null);
    }
}
