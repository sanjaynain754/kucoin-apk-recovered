package com.kubi.core.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000521\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007¢\u0006\u0002\u0010\u000e\u001aV\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000521\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007¢\u0006\u0002\u0010\u000e\u001a^\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000521\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"collectNotNullLatest", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "collectLatestData", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlowExtKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41775x1 m23400a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull CoroutineContext context, @NotNull InterfaceC41709m0 scope, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(action, "action");
        return C41696j.m91104d(scope, null, null, new FlowExtKt$collectLatestData$2(interfaceC41634e, action, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41775x1 m23401b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 scope, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(action, "action");
        return C41696j.m91104d(scope, null, null, new FlowExtKt$collectLatestData$1(interfaceC41634e, action, null), 3, null);
    }
}
