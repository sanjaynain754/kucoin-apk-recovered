package com.kubi.event.api;

import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.event.api.a */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001aS\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000121\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0010\u001a\u00020\f*\u00020\u000f21\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m90084d2 = {"Landroidx/lifecycle/LifecycleOwner;", "", "onStart", "Lkotlin/Function2;", "Lpf/b;", "Lkotlin/ParameterName;", "name", "e", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlinx/coroutines/x1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/m0;", "b", "(Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", "", "key", "data", "", "delay", "c", "(Ljava/lang/String;Ljava/lang/Object;J)V", "FlowEventBus_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C12572a {
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC41775x1 m23692a(@NotNull LifecycleOwner lifecycleOwner, boolean z11, @NotNull Function2<? super InterfaceC43461b, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return FlowEventBus.f21594a.m23688c(lifecycleOwner, z11, action);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC41775x1 m23693b(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull Function2<? super InterfaceC43461b, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41709m0, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return FlowEventBus.f21594a.m23689d(interfaceC41709m0, action);
    }

    /* JADX INFO: renamed from: c */
    public static final void m23694c(@NotNull String key, @Nullable Object obj, long j11) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (C12573b.f21598a.m23696a()) {
            key.length();
        }
        C44128b.m97259c("FlowEventBus", Intrinsics.stringPlus("sendFlowEvent:", key));
        FlowEventBus flowEventBus = FlowEventBus.f21594a;
        if (obj == null) {
            obj = key;
        }
        flowEventBus.m23691f(new C43460a(key, obj), j11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m23695d(String str, Object obj, long j11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        m23694c(str, obj, j11);
    }
}
