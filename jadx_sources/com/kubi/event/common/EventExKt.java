package com.kubi.event.common;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: EventEx.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a]\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u000221\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u000221\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a-\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Landroidx/lifecycle/LifecycleOwner;", TUIConstants.TUIChat.OWNER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlinx/coroutines/x1;", "b", "(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "bizType", "methodName", "", "throwable", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "FlowEventBus_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class EventExKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41775x1 m23698a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull LifecycleOwner owner, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(action, "action");
        return LifecycleOwnerKt.getLifecycleScope(owner).launchWhenCreated(new EventExKt$collectWhenCreated$1(interfaceC41634e, action, null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41775x1 m23699b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull LifecycleOwner owner, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(action, "action");
        return LifecycleOwnerKt.getLifecycleScope(owner).launchWhenStarted(new EventExKt$collectWhenStart$1(interfaceC41634e, action, null));
    }

    /* JADX INFO: renamed from: c */
    public static final void m23700c(@NotNull String bizType, @Nullable final String str, @NotNull final Throwable throwable) throws JSONException {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        C44128b.m97262f("crash_issue", "【程序发生错误】", throwable);
        C12576a.m23701d(C12576a.f21602a, "crash_issue", bizType, true, null, false, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.event.common.EventExKt$reportError$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                invoke2(eventParametersBuilder);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder trackFirebaseEvent) {
                Intrinsics.checkNotNullParameter(trackFirebaseEvent, "$this$trackFirebaseEvent");
                trackFirebaseEvent.m42393d(FirebaseAnalytics.Param.METHOD, C27041f.m66668h(str));
                trackFirebaseEvent.m42393d("error_message", C27041f.m66668h(throwable.getMessage()));
                trackFirebaseEvent.m42393d("type", "crash_issue");
            }
        }, 24, null);
        C43846g.m96568c(new EventException(bizType, throwable), null, 2, null);
    }
}
