package com.kubi.event.api;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.event.common.EventExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBus.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJU\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e21\u0010\u0015\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001921\u0010\u0015\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m90084d2 = {"Lcom/kubi/event/api/FlowEventBus;", "", "<init>", "()V", "Lpf/b;", ExifInterface.GPS_DIRECTION_TRUE, "event", "", "delay", "", "f", "(Lpf/b;J)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "isState", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "e", "Lkotlin/coroutines/Continuation;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlinx/coroutines/x1;", "c", "(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/m0;", "coroutineScope", "d", "(Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "b", "Lkotlinx/coroutines/m0;", "flowEventBusScope", "Lkotlinx/coroutines/flow/m;", "Lkotlinx/coroutines/flow/m;", "mutableSharedFlow", "Lkotlinx/coroutines/flow/e;", "()Lkotlinx/coroutines/flow/e;", "flow", "FlowEventBus_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class FlowEventBus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlowEventBus f21594a = new FlowEventBus();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC41709m0 flowEventBusScope = C41713n0.m91125a(new CoroutineName("FlowEventBus"));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC41668m<InterfaceC43461b> mutableSharedFlow = C41674s.m91001b(0, Integer.MAX_VALUE, null, 5, null);

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41775x1 m23688c(@NotNull LifecycleOwner lifecycleOwner, boolean isState, @NotNull Function2<? super InterfaceC43461b, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(action, "action");
        return isState ? EventExKt.m23699b(m23690e(), lifecycleOwner, new FlowEventBus$bindFlowEvent$1(action, null)) : EventExKt.m23698a(m23690e(), lifecycleOwner, new FlowEventBus$bindFlowEvent$2(action, null));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41775x1 m23689d(@NotNull InterfaceC41709m0 coroutineScope, @NotNull Function2<? super InterfaceC43461b, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(action, "action");
        return C41696j.m91104d(coroutineScope, null, null, new FlowEventBus$bindFlowEvent$3(action, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e<InterfaceC43461b> m23690e() {
        return C41636g.m90905b(mutableSharedFlow);
    }

    /* JADX INFO: renamed from: f */
    public final <T extends InterfaceC43461b> void m23691f(@NotNull T event, long delay) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (delay <= 0) {
            mutableSharedFlow.mo90855d(event);
        } else {
            C41696j.m91104d(flowEventBusScope, null, null, new FlowEventBus$sendFlowEvent$1(delay, event, null), 3, null);
        }
    }
}
