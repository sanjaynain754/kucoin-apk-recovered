package com.kubi.unify.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifyCoroutineScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000521\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007H\u0000¢\u0006\u0002\u0010\u000e\u001a\u001a\u0010\u000f\u001a\u00020\f*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0000\u001a(\u0010\u000f\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0015H\u0000\u001a\u0012\u0010\u0016\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0000\u001a\u0018\u0010\u0016\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0015H\u0000¨\u0006\u0017"}, m90084d2 = {"launchAndCollectLatestIn", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "addTo", "scopeList", "", "key", "", "map", "", "clearDisposables", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyCoroutineScope.kt\ncom/kubi/unify/utils/UnifyCoroutineScopeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n2756#2:81\n1869#2,2:83\n1#3:82\n*S KotlinDebug\n*F\n+ 1 UnifyCoroutineScope.kt\ncom/kubi/unify/utils/UnifyCoroutineScopeKt\n*L\n69#1:81\n76#1:83,2\n69#1:82\n*E\n"})
public final class UnifyCoroutineScopeKt {
    /* JADX INFO: renamed from: a */
    public static final void m65462a(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull String key, @NotNull Map<String, InterfaceC41775x1> map) {
        Intrinsics.checkNotNullParameter(interfaceC41775x1, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(map, "map");
        map.put(key, interfaceC41775x1);
    }

    /* JADX INFO: renamed from: b */
    public static final void m65463b(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull List<InterfaceC41775x1> scopeList) {
        Intrinsics.checkNotNullParameter(interfaceC41775x1, "<this>");
        Intrinsics.checkNotNullParameter(scopeList, "scopeList");
        scopeList.add(interfaceC41775x1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m65464c(@NotNull List<InterfaceC41775x1> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            JobKt__JobKt.m90362f((InterfaceC41775x1) it.next(), "userCancel", null, 2, null);
        }
        list.clear();
    }

    /* JADX INFO: renamed from: d */
    public static final void m65465d(@NotNull Map<String, InterfaceC41775x1> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            JobKt__JobKt.m90362f((InterfaceC41775x1) it.next(), "userCancel", null, 2, null);
        }
        map.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41775x1 m65466e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 scope, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(action, "action");
        return C41696j.m91104d(scope, null, null, new UnifyCoroutineScopeKt$launchAndCollectLatestIn$1(interfaceC41634e, action, null), 3, null);
    }
}
