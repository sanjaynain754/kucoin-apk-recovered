package com.kubi.route.config.client;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.route.config.issue.RouteConfigException;
import com.kubi.route.config.model.RouteConfigEntry;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001e\u0010\u000e\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/route/config/client/RemoteConfigClient;", "", "<init>", "()V", "", "version", "Lcom/kubi/route/config/model/RouteConfigEntry;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "", "retryCount", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "b", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRemoteConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/route/config/client/RemoteConfigClient\n+ 2 RouteConfigIssue.kt\ncom/kubi/route/config/issue/RouteConfigIssueKt\n*L\n1#1,87:1\n44#2,2:88\n*S KotlinDebug\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/route/config/client/RemoteConfigClient\n*L\n32#1:88,2\n*E\n"})
public final class RemoteConfigClient {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m56174c(RemoteConfigClient remoteConfigClient, int i11, Function1 function1, Continuation continuation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 3;
        }
        return remoteConfigClient.m56176b(i11, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m56175a(@NotNull String str, @NotNull Continuation<? super RouteConfigEntry> continuation) {
        RemoteConfigClient$fetchRouteConfig$1 remoteConfigClient$fetchRouteConfig$1;
        if (continuation instanceof RemoteConfigClient$fetchRouteConfig$1) {
            remoteConfigClient$fetchRouteConfig$1 = (RemoteConfigClient$fetchRouteConfig$1) continuation;
            int i11 = remoteConfigClient$fetchRouteConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                remoteConfigClient$fetchRouteConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                remoteConfigClient$fetchRouteConfig$1 = new RemoteConfigClient$fetchRouteConfig$1(this, continuation);
            }
        } else {
            remoteConfigClient$fetchRouteConfig$1 = new RemoteConfigClient$fetchRouteConfig$1(this, continuation);
        }
        RemoteConfigClient$fetchRouteConfig$1 remoteConfigClient$fetchRouteConfig$2 = remoteConfigClient$fetchRouteConfig$1;
        Object objM56174c = remoteConfigClient$fetchRouteConfig$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = remoteConfigClient$fetchRouteConfig$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM56174c);
                C44128b.m97266j("RouteConfig::RemoteConfigClient", "fetchRouteConfig start");
                RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1 remoteConfigClient$fetchRouteConfig$routeConfigEntity$1 = new RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1((InterfaceC23632a) C42597a.m93388d().create(InterfaceC23632a.class), str, null);
                remoteConfigClient$fetchRouteConfig$2.label = 1;
                objM56174c = m56174c(this, 0, remoteConfigClient$fetchRouteConfig$routeConfigEntity$1, remoteConfigClient$fetchRouteConfig$2, 1, null);
                if (objM56174c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM56174c);
            }
            RouteConfigEntry routeConfigEntry = (RouteConfigEntry) objM56174c;
            if (routeConfigEntry == null) {
                C44128b.m97266j("RouteConfig::RemoteConfigClient", "fetchRouteConfig end: already latest version");
                return null;
            }
            C44128b.m97266j("RouteConfig::RemoteConfigClient", "fetchRouteConfig end " + routeConfigEntry);
            return routeConfigEntry;
        } catch (Exception e11) {
            C43846g.m96568c(new RouteConfigException(e11, "RouteConfig::RemoteConfigClient", false, null, 8, null), null, 2, null);
            C44128b.m97270n("RouteConfig::RemoteConfigClient", "fetchRouteConfig fail: " + e11.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:45|24|(1:34)(1:27)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r6 = r2;
        r2 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(((long) r13) * 1000, r0) == r1) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:35:0x0095). Please report as a decompilation issue!!! */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m56176b(int i11, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) throws Throwable {
        RemoteConfigClient$retryWhenException$1 remoteConfigClient$retryWhenException$1;
        int i12;
        int i13;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        int i14;
        Throwable th2;
        int i15;
        int i16;
        if (continuation instanceof RemoteConfigClient$retryWhenException$1) {
            remoteConfigClient$retryWhenException$1 = (RemoteConfigClient$retryWhenException$1) continuation;
            int i17 = remoteConfigClient$retryWhenException$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                remoteConfigClient$retryWhenException$1.label = i17 - Integer.MIN_VALUE;
            } else {
                remoteConfigClient$retryWhenException$1 = new RemoteConfigClient$retryWhenException$1(this, continuation);
            }
        } else {
            remoteConfigClient$retryWhenException$1 = new RemoteConfigClient$retryWhenException$1(this, continuation);
        }
        Object obj = remoteConfigClient$retryWhenException$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i18 = remoteConfigClient$retryWhenException$1.label;
        try {
            if (i18 != 0) {
                if (i18 == 1) {
                    i13 = remoteConfigClient$retryWhenException$1.I$2;
                    i14 = remoteConfigClient$retryWhenException$1.I$1;
                    i15 = remoteConfigClient$retryWhenException$1.I$0;
                    Function1<? super Continuation<? super T>, ? extends Object> function3 = (Function1) remoteConfigClient$retryWhenException$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        function2 = function3;
                    }
                } else {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i16 = remoteConfigClient$retryWhenException$1.I$2;
                    i14 = remoteConfigClient$retryWhenException$1.I$1;
                    i15 = remoteConfigClient$retryWhenException$1.I$0;
                    th2 = (Throwable) remoteConfigClient$retryWhenException$1.L$1;
                    Function1<? super Continuation<? super T>, ? extends Object> function4 = (Function1) remoteConfigClient$retryWhenException$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function2 = function4;
                    C44128b.m97266j("RouteConfig::RemoteConfigClient", "retryWhenException: count=" + i16 + ", exception=" + th2);
                    i13 = i14 + 1;
                    i12 = i15;
                }
                i16 = i13 + 1;
                if (i16 == i15) {
                    throw th2;
                }
                remoteConfigClient$retryWhenException$1.L$0 = function2;
                remoteConfigClient$retryWhenException$1.L$1 = th2;
                remoteConfigClient$retryWhenException$1.I$0 = i15;
                remoteConfigClient$retryWhenException$1.I$1 = i14;
                remoteConfigClient$retryWhenException$1.I$2 = i16;
                remoteConfigClient$retryWhenException$1.label = 2;
            } else {
                ResultKt.throwOnFailure(obj);
                i12 = i11;
                i13 = 0;
                function2 = function1;
            }
            if (i13 >= i12) {
                return null;
            }
            remoteConfigClient$retryWhenException$1.L$0 = function2;
            remoteConfigClient$retryWhenException$1.L$1 = null;
            remoteConfigClient$retryWhenException$1.I$0 = i12;
            remoteConfigClient$retryWhenException$1.I$1 = i13;
            remoteConfigClient$retryWhenException$1.I$2 = i13;
            remoteConfigClient$retryWhenException$1.label = 1;
            Object objInvoke = function2.invoke(remoteConfigClient$retryWhenException$1);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        } catch (ApiException e11) {
            if (Intrinsics.areEqual(e11.code, "50006")) {
                return null;
            }
            throw e11;
        }
    }
}
