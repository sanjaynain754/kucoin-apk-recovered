package com.kubi.sdk.site.rebirth;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.kubi.sdk.site.exception.SiteException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AppRebirthLauncherService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/AppRebirthLauncherService;", "Landroid/app/Service;", "<init>", "()V", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "onBind", "Landroid/os/IBinder;", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppRebirthLauncherService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRebirthLauncherService.kt\ncom/kubi/sdk/site/rebirth/AppRebirthLauncherService\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,36:1\n47#2,4:37\n*S KotlinDebug\n*F\n+ 1 AppRebirthLauncherService.kt\ncom/kubi/sdk/site/rebirth/AppRebirthLauncherService\n*L\n25#1:37,4\n*E\n"})
public final class AppRebirthLauncherService extends Service {

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.AppRebirthLauncherService$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AppRebirthLauncherService.kt\ncom/kubi/sdk/site/rebirth/AppRebirthLauncherService\n+ 3 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,49:1\n25#2:50\n45#3,3:51\n*S KotlinDebug\n*F\n+ 1 AppRebirthLauncherService.kt\ncom/kubi/sdk/site/rebirth/AppRebirthLauncherService\n*L\n25#1:51,3\n*E\n"})
    public static final class C24167a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("SITE", exception);
            C43846g.m96568c(new SiteException(exception, "SITE", false, null, 8, null), null, 2, null);
        }

        public C24167a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.AppRebirthLauncherService$onStartCommand$1 */
    /* JADX INFO: compiled from: AppRebirthLauncherService.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.rebirth.AppRebirthLauncherService$onStartCommand$1", m90122f = "AppRebirthLauncherService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241681 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241681(Intent intent, Continuation<? super C241681> continuation) {
            super(2, continuation);
            this.$intent = intent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppRebirthLauncherService.this.new C241681(this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241681) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AppRebirthHelper.f47948a.m58196c(AppRebirthLauncherService.this, this.$intent.getExtras());
                AppRebirthLauncherService.this.stopSelf();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int flags, int startId) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C44128b.m97266j("SiteConfig::AppRebirth", "AppRebirthLauncherService onStartCommand");
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("siteUpdate").plus(new C24167a(CoroutineExceptionHandler.INSTANCE))), null, null, new C241681(intent, null), 3, null);
        return 2;
    }
}
