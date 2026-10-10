package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.mvi.common.MviExKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UniqueTaskChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001f\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00018\u00008\u0000 \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/kubi/mvi/state/UniqueTaskChannel;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "task", "Lkotlinx/coroutines/m0;", "scope", "", "d", "(Ljava/lang/Object;Lkotlinx/coroutines/m0;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "e", "(Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)V", "", "c", "(Ljava/lang/Object;)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Object;)V", "g", "Lkotlinx/coroutines/channels/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/coroutines/channels/d;", AppsFlyerProperties.CHANNEL, "", "kotlin.jvm.PlatformType", "", "b", "Ljava/util/Set;", "taskList", "Lkotlinx/coroutines/flow/e;", "f", "()Lkotlinx/coroutines/flow/e;", "channelFlow", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUniqueTaskChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniqueTaskChannel.kt\ncom/kubi/mvi/state/UniqueTaskChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class UniqueTaskChannel<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41565d<T> channel = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Set<T> taskList = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c */
    public final boolean m42661c(T task) {
        Set<T> taskList = this.taskList;
        Intrinsics.checkNotNullExpressionValue(taskList, "taskList");
        synchronized (taskList) {
            if (m42665g(task)) {
                C44128b.m97259c("UniqueTaskChannel", "add fail:" + task);
                return false;
            }
            boolean zAdd = this.taskList.add(task);
            C44128b.m97259c("UniqueTaskChannel", "add " + task + " result:" + zAdd + ' ');
            return zAdd;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m42662d(T task, @NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (m42661c(task)) {
            Object objMo90594e = this.channel.mo90594e(task);
            if (ChannelResult.m90676i(objMo90594e)) {
                C41696j.m91104d(scope, null, null, new UniqueTaskChannel$addTask$1$1(this, task, null), 3, null);
            }
            C44128b.m97259c("UniqueTaskChannel", "trySend " + task + " result:" + ChannelResult.m90677j(objMo90594e));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m42663e(@NotNull InterfaceC41709m0 scope, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(block, "block");
        MviExKt.m42505a(m42664f(), scope, new UniqueTaskChannel$collect$1(block, this, null));
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC41634e<T> m42664f() {
        return C41636g.m90936s(this.channel);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m42665g(T task) {
        T next;
        boolean z11;
        Set<T> taskList = this.taskList;
        Intrinsics.checkNotNullExpressionValue(taskList, "taskList");
        synchronized (taskList) {
            Set<T> taskList2 = this.taskList;
            Intrinsics.checkNotNullExpressionValue(taskList2, "taskList");
            Iterator<T> it = taskList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next, task));
            z11 = next != null;
        }
        return z11;
    }

    /* JADX INFO: renamed from: h */
    public final void m42666h(final T task) {
        Set<T> taskList = this.taskList;
        Intrinsics.checkNotNullExpressionValue(taskList, "taskList");
        synchronized (taskList) {
            Set<T> taskList2 = this.taskList;
            Intrinsics.checkNotNullExpressionValue(taskList2, "taskList");
            CollectionsKt.removeAll(taskList2, new Function1<T, Boolean>() { // from class: com.kubi.mvi.state.UniqueTaskChannel$remove$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t11) {
                    Boolean boolValueOf = Boolean.valueOf(Intrinsics.areEqual(t11, task));
                    C44128b.m97259c("UniqueTaskChannel", "remove:" + task);
                    return boolValueOf;
                }
            });
        }
    }
}
