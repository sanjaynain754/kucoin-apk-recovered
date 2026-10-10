package com.kubi.sdk.site.config.client;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import com.kubi.sdk.site.issue.SiteConfigException;
import l00.InterfaceC42016a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0087@¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ6\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u001e\u0010\u000b\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0082@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/site/config/client/RemoteConfigClient;", "", "<init>", "()V", "fetchSiteConfig", "Lcom/kubi/sdk/site/config/data/SiteConfigEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createGsonWithStrictAdapters", "Lcom/google/gson/Gson;", "retryWhenException", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRemoteConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/sdk/site/config/client/RemoteConfigClient\n+ 2 SiteConfigIssue.kt\ncom/kubi/sdk/site/issue/SiteConfigIssueKt\n*L\n1#1,93:1\n44#2,2:94\n*S KotlinDebug\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/sdk/site/config/client/RemoteConfigClient\n*L\n42#1:94,2\n*E\n"})
public final class RemoteConfigClient {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f47902a = new Companion(null);

    /* JADX INFO: compiled from: RemoteConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/site/config/client/RemoteConfigClient$Companion;", "", "<init>", "()V", "TAG", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @SuppressLint({"VisibleForTests"})
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m58080b(@NotNull Continuation<? super SiteConfigEntity> continuation) {
        RemoteConfigClient$fetchSiteConfig$1 remoteConfigClient$fetchSiteConfig$1;
        if (continuation instanceof RemoteConfigClient$fetchSiteConfig$1) {
            remoteConfigClient$fetchSiteConfig$1 = (RemoteConfigClient$fetchSiteConfig$1) continuation;
            int i11 = remoteConfigClient$fetchSiteConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                remoteConfigClient$fetchSiteConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                remoteConfigClient$fetchSiteConfig$1 = new RemoteConfigClient$fetchSiteConfig$1(this, continuation);
            }
        } else {
            remoteConfigClient$fetchSiteConfig$1 = new RemoteConfigClient$fetchSiteConfig$1(this, continuation);
        }
        Object objM58081c = remoteConfigClient$fetchSiteConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = remoteConfigClient$fetchSiteConfig$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM58081c);
                C44128b.m97266j("SiteConfig_RemoteConfigClient", "fetchSiteConfig start");
                InterfaceC42016a interfaceC42016a = (InterfaceC42016a) C42597a.m93388d().create(InterfaceC42016a.class);
                RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1 remoteConfigClient$fetchSiteConfig$siteConfigEntity$1 = new RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1(interfaceC42016a, null);
                remoteConfigClient$fetchSiteConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC42016a);
                remoteConfigClient$fetchSiteConfig$1.label = 1;
                objM58081c = m58081c(remoteConfigClient$fetchSiteConfig$siteConfigEntity$1, remoteConfigClient$fetchSiteConfig$1);
                if (objM58081c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM58081c);
            }
            SiteConfigEntity siteConfigEntity = (SiteConfigEntity) objM58081c;
            if (siteConfigEntity == null) {
                return null;
            }
            C43840a.m96550d("fetchSiteConfig end " + siteConfigEntity, "SiteConfig_RemoteConfigClient");
            C44128b.m97266j("SiteConfig_RemoteConfigClient", "fetchSiteConfig end " + siteConfigEntity);
            C44128b.m97266j("SiteConfig_RemoteConfigClient", "fetchSiteConfig end " + siteConfigEntity.getSiteType());
            return siteConfigEntity;
        } catch (Exception e11) {
            C43846g.m96568c(new SiteConfigException(e11, "SiteConfig_RemoteConfigClient", false, null, 8, null), null, 2, null);
            C44128b.m97270n("SiteConfig_RemoteConfigClient", "load site config error: " + e11.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:39|24) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r14 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r2 = r13;
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(((long) r13) * 1000, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0070 -> B:22:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a4 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m58081c(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        RemoteConfigClient$retryWhenException$1 remoteConfigClient$retryWhenException$1;
        int i11;
        int i12;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        int i13;
        if (continuation instanceof RemoteConfigClient$retryWhenException$1) {
            remoteConfigClient$retryWhenException$1 = (RemoteConfigClient$retryWhenException$1) continuation;
            int i14 = remoteConfigClient$retryWhenException$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                remoteConfigClient$retryWhenException$1.label = i14 - Integer.MIN_VALUE;
            } else {
                remoteConfigClient$retryWhenException$1 = new RemoteConfigClient$retryWhenException$1(this, continuation);
            }
        } else {
            remoteConfigClient$retryWhenException$1 = new RemoteConfigClient$retryWhenException$1(this, continuation);
        }
        Object objInvoke = remoteConfigClient$retryWhenException$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = remoteConfigClient$retryWhenException$1.label;
        if (i15 != 0) {
            if (i15 == 1) {
                i12 = remoteConfigClient$retryWhenException$1.I$0;
                function2 = (Function1) remoteConfigClient$retryWhenException$1.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    i13 = i12;
                    function1 = function2;
                } catch (Exception e11) {
                    Exception e12 = e11;
                    C44128b.m97266j("SiteConfig_RemoteConfigClient", "retryWhenException: " + i12 + ", exception: " + e12);
                    remoteConfigClient$retryWhenException$1.L$0 = function2;
                    remoteConfigClient$retryWhenException$1.L$1 = SpillingKt.nullOutSpilledVariable(e12);
                    remoteConfigClient$retryWhenException$1.I$0 = i12;
                    remoteConfigClient$retryWhenException$1.label = 2;
                }
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = remoteConfigClient$retryWhenException$1.I$0;
                function2 = (Function1) remoteConfigClient$retryWhenException$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                i11 = i12;
                function1 = function2;
                C44128b.m97266j("SiteConfig_RemoteConfigClient", "retryWhenException: " + i11);
            }
            if (objInvoke != null) {
                return objInvoke;
            }
            i11 = i13;
        } else {
            ResultKt.throwOnFailure(objInvoke);
            i11 = 0;
        }
        i13 = i11 + 1;
        if (i11 > 5) {
            return null;
        }
        remoteConfigClient$retryWhenException$1.L$0 = function1;
        remoteConfigClient$retryWhenException$1.L$1 = null;
        remoteConfigClient$retryWhenException$1.I$0 = i13;
        remoteConfigClient$retryWhenException$1.label = 1;
        objInvoke = function1.invoke(remoteConfigClient$retryWhenException$1);
    }
}
