package com.kubi.sdk.site.migration;

import androidx.annotation.VisibleForTesting;
import com.kubi.sdk.site.C24137e;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.exception.SiteMessage;
import com.kubi.sdk.site.helper.ReportHelper;
import com.kubi.sdk.util.PreLoader;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import f00.C37304a;
import g00.InterfaceC37761m;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SiteMigrationService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0005H\u0082\bJ\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/SiteMigrationService;", "", "<init>", "()V", "TAG", "", "checked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "FROM_HOME", "FROM_LOGIN", "FROM_GATEWAY", "FROM_H5", "FROM_FUTURES", "reset", "", "reset$LSite_googleRelease", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "registerListener", "registerListener$LSite_googleRelease", "updateSiteMigration", "from", "force", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needMigrationLoader", "Lcom/kubi/sdk/util/PreLoader;", "Lcom/kubi/sdk/site/migration/SiteTransferUserResponse;", "withBreadcrumb", "message", "canUseMigration", "fetchNeedMigration", "fetchNeedMigration$LSite_googleRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromToTransferSwitchType", "showNeedMigrationDialog", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FromType", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteMigrationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteMigrationService.kt\ncom/kubi/sdk/site/migration/SiteMigrationService\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,191:1\n129#1,2:195\n129#1,2:197\n129#1,2:199\n129#1,2:201\n45#2,3:192\n50#2,3:203\n45#2,3:206\n47#3,4:209\n*S KotlinDebug\n*F\n+ 1 SiteMigrationService.kt\ncom/kubi/sdk/site/migration/SiteMigrationService\n*L\n169#1:195,2\n172#1:197,2\n173#1:199,2\n174#1:201,2\n113#1:192,3\n178#1:203,3\n187#1:206,3\n62#1:209,4\n*E\n"})
public final class SiteMigrationService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteMigrationService f47924a = new SiteMigrationService();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicBoolean f47925b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41709m0 f47926c = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()).plus(new CoroutineName("siteUpdate")).plus(new C24152a(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final PreLoader<SiteTransferUserResponse> f47927d = PreLoader.f48118e.create(new SiteMigrationService$needMigrationLoader$1(null));

    /* JADX INFO: renamed from: com.kubi.sdk.site.migration.SiteMigrationService$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SiteMigrationService.kt\ncom/kubi/sdk/site/migration/SiteMigrationService\n+ 3 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,49:1\n62#2:50\n45#3,3:51\n*S KotlinDebug\n*F\n+ 1 SiteMigrationService.kt\ncom/kubi/sdk/site/migration/SiteMigrationService\n*L\n62#1:51,3\n*E\n"})
    public static final class C24152a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("SiteMigrationService", exception);
            C43846g.m96568c(new SiteException(exception, "SiteMigrationService", false, null, 8, null), null, 2, null);
        }

        public C24152a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m58142g(AccountEventState accountEventState) throws InterruptedException {
        C44128b.m97266j("SiteMigrationService", "userInfo accountEventStateObs, accountEventState.state=" + accountEventState.getState());
        if (accountEventState.getState() == AccountState.Login || accountEventState.getState() == AccountState.SwitchAccount) {
            InterfaceC41709m0 interfaceC41709m0 = f47926c;
            C41696j.m91104d(interfaceC41709m0, null, null, new SiteMigrationService$registerListener$1$1(null), 3, null);
            C41696j.m91104d(interfaceC41709m0, null, null, new SiteMigrationService$registerListener$1$2(null), 3, null);
        } else {
            f47924a.m58149i();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m58144l(SiteMigrationService siteMigrationService, String str, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return siteMigrationService.m58151k(str, z11, continuation);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58145c() {
        return C24137e.m58087a(SiteType.INSTANCE.getCurrentSiteType()) && UserInfo.a.d() == UserInfo.LoginState.Login;
    }

    /* JADX INFO: renamed from: e */
    public final String m58147e(String str) {
        if (Intrinsics.areEqual(str, "home")) {
            return "FRONT_PAGE";
        }
        if (Intrinsics.areEqual(str, SearchCategory$Companion.FUTURES)) {
            return "BIZ_PAGE";
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m58148f() {
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.site.migration.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SiteMigrationService.m58142g((AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: com.kubi.sdk.site.migration.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SiteMigrationService.m58143h(function1, obj);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final void m58149i() throws InterruptedException {
        f47925b.set(false);
        f47927d.m58346f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011a, code lost:
    
        if (r2 == r4) goto L52;
     */
    @Nullable
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m58150j(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SiteMigrationService$showNeedMigrationDialog$1 siteMigrationService$showNeedMigrationDialog$1;
        boolean zM58138d;
        Object objM58344d;
        String str2 = str;
        if (continuation instanceof SiteMigrationService$showNeedMigrationDialog$1) {
            siteMigrationService$showNeedMigrationDialog$1 = (SiteMigrationService$showNeedMigrationDialog$1) continuation;
            int i11 = siteMigrationService$showNeedMigrationDialog$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteMigrationService$showNeedMigrationDialog$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteMigrationService$showNeedMigrationDialog$1 = new SiteMigrationService$showNeedMigrationDialog$1(this, continuation);
            }
        } else {
            siteMigrationService$showNeedMigrationDialog$1 = new SiteMigrationService$showNeedMigrationDialog$1(this, continuation);
        }
        Object objM58130a = siteMigrationService$showNeedMigrationDialog$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteMigrationService$showNeedMigrationDialog$1.label;
        boolean zBooleanValue = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM58130a);
                if (!m58145c()) {
                    return Boxing.boxBoolean(false);
                }
                zM58138d = SiteMigrationConfig.f47922a.m58138d(str2);
                if (zM58138d) {
                    C43840a.m96550d("has showed", "SiteMigrationService");
                    return Boxing.boxBoolean(false);
                }
                PreLoader<SiteTransferUserResponse> preLoader = f47927d;
                siteMigrationService$showNeedMigrationDialog$1.L$0 = str2;
                siteMigrationService$showNeedMigrationDialog$1.Z$0 = zM58138d;
                siteMigrationService$showNeedMigrationDialog$1.label = 1;
                objM58344d = preLoader.m58344d(siteMigrationService$showNeedMigrationDialog$1);
                if (objM58344d == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                boolean z11 = siteMigrationService$showNeedMigrationDialog$1.Z$0;
                String str3 = (String) siteMigrationService$showNeedMigrationDialog$1.L$0;
                ResultKt.throwOnFailure(objM58130a);
                zM58138d = z11;
                str2 = str3;
                objM58344d = objM58130a;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM58130a);
            }
            zBooleanValue = ((Boolean) objM58130a).booleanValue();
            return Boxing.boxBoolean(zBooleanValue);
            SiteTransferUserResponse siteTransferUserResponse = (SiteTransferUserResponse) objM58344d;
            if (siteTransferUserResponse == null) {
                C43840a.m96550d("loadData = null", "SiteMigrationService");
                return Boxing.boxBoolean(false);
            }
            String strM58147e = m58147e(str2);
            if (strM58147e == null) {
                C43840a.m96550d("unknownFrom:" + str2, "SiteMigrationService");
                return Boxing.boxBoolean(false);
            }
            if (!Intrinsics.areEqual(siteTransferUserResponse.getTransferSwitchMap().get(strM58147e), Boxing.boxBoolean(true))) {
                C43840a.m96550d(str2 + " canTransfer = false", "SiteMigrationService");
                return Boxing.boxBoolean(false);
            }
            String targetSiteType = siteTransferUserResponse.getTargetSiteType();
            if (targetSiteType != null && targetSiteType.length() != 0) {
                NeedMigrationDialog needMigrationDialog = NeedMigrationDialog.f47921a;
                siteMigrationService$showNeedMigrationDialog$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                siteMigrationService$showNeedMigrationDialog$1.L$1 = SpillingKt.nullOutSpilledVariable(siteTransferUserResponse);
                siteMigrationService$showNeedMigrationDialog$1.L$2 = SpillingKt.nullOutSpilledVariable(strM58147e);
                siteMigrationService$showNeedMigrationDialog$1.L$3 = SpillingKt.nullOutSpilledVariable(targetSiteType);
                siteMigrationService$showNeedMigrationDialog$1.Z$0 = zM58138d;
                siteMigrationService$showNeedMigrationDialog$1.label = 2;
                objM58130a = needMigrationDialog.m58130a(targetSiteType, str2, siteMigrationService$showNeedMigrationDialog$1);
            }
            C44128b.m97261e("SiteMigrationService", "targetSiteType is Empty");
            C43846g.m96568c(new SiteMessage("targetSiteType is Empty", "SiteMigrationService", false, 4, null), null, 2, null);
            return Boxing.boxBoolean(false);
        } catch (Exception e11) {
            C44128b.m97263g("SiteMigrationService", e11);
            C43846g.m96568c(new SiteException(e11, "SiteMigrationService", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m58151k(@NotNull String str, boolean z11, @NotNull Continuation<? super Unit> continuation) {
        SiteMigrationService$updateSiteMigration$1 siteMigrationService$updateSiteMigration$1;
        if (continuation instanceof SiteMigrationService$updateSiteMigration$1) {
            siteMigrationService$updateSiteMigration$1 = (SiteMigrationService$updateSiteMigration$1) continuation;
            int i11 = siteMigrationService$updateSiteMigration$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteMigrationService$updateSiteMigration$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteMigrationService$updateSiteMigration$1 = new SiteMigrationService$updateSiteMigration$1(this, continuation);
            }
        } else {
            siteMigrationService$updateSiteMigration$1 = new SiteMigrationService$updateSiteMigration$1(this, continuation);
        }
        Object objM58152a = siteMigrationService$updateSiteMigration$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteMigrationService$updateSiteMigration$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM58152a);
                if (!m58145c()) {
                    return Unit.INSTANCE;
                }
                if (!z11 && f47925b.getAndSet(true)) {
                    return Unit.INSTANCE;
                }
                ISiteMigrationAPI iSiteMigrationAPI = (ISiteMigrationAPI) C42597a.m93388d().create(ISiteMigrationAPI.class);
                siteMigrationService$updateSiteMigration$1.L$0 = str;
                siteMigrationService$updateSiteMigration$1.Z$0 = z11;
                siteMigrationService$updateSiteMigration$1.label = 1;
                objM58152a = iSiteMigrationAPI.m58152a(siteMigrationService$updateSiteMigration$1);
                if (objM58152a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) siteMigrationService$updateSiteMigration$1.L$0;
                ResultKt.throwOnFailure(objM58152a);
            }
            String str2 = str;
            SiteMigrationStatusResponse siteMigrationStatusResponse = (SiteMigrationStatusResponse) objM58152a;
            if (siteMigrationStatusResponse.isNeedShowStatus()) {
                InterfaceC37761m.a.m85176a(C37304a.f82764a, str2, null, null, null, 14, null);
                ReportHelper reportHelper = ReportHelper.f47911a;
                String originalSiteType = siteMigrationStatusResponse.getOriginalSiteType();
                String str3 = "";
                if (originalSiteType == null) {
                    originalSiteType = "";
                }
                String targetSiteType = siteMigrationStatusResponse.getTargetSiteType();
                if (targetSiteType != null) {
                    str3 = targetSiteType;
                }
                reportHelper.m58103b(originalSiteType, str3, str2, siteMigrationStatusResponse.getStatusType());
            } else {
                C43840a.m96550d("updateSiteMigration " + siteMigrationStatusResponse.getTransferStatus() + ' ' + siteMigrationStatusResponse.getStatus() + ' ' + siteMigrationStatusResponse.getAlreadyDisplayed() + '}', "SiteMigrationService");
            }
        } catch (CancellationException unused) {
        } catch (Exception e11) {
            C44128b.m97263g("SiteMigrationService", e11);
            C43846g.m96568c(new SiteException(e11, "SiteMigrationService", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m58143h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m58146d(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (!m58145c()) {
            return Unit.INSTANCE;
        }
        Object objM58345e = f47927d.m58345e(continuation);
        if (objM58345e == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM58345e;
        }
        return Unit.INSTANCE;
    }
}
