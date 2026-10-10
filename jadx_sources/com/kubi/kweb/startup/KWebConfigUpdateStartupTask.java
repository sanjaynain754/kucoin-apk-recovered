package com.kubi.kweb.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.kweb.exception.KWebException;
import com.kubi.kweb.helper.BizInfoHelper;
import com.kubi.kweb.helper.WhiteListHelper;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.sdk.pkg.hybird.OfflineUrlInfo;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.sdk.web.helper.C24307c;
import com.kubi.web.api.IWebService;
import com.kubi.widget.web.helper.PackageConfigHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x00.C45976a;
import x00.C45977b;

/* JADX INFO: compiled from: KWebConfigUpdateStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "kweb_config_update", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nKWebConfigUpdateStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebConfigUpdateStartupTask.kt\ncom/kubi/kweb/startup/KWebConfigUpdateStartupTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KWebIssue.kt\ncom/kubi/kweb/exception/KWebIssueKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,58:1\n1617#2,9:59\n1869#2:68\n1870#2:70\n1626#2:71\n1669#2,8:72\n1#3:69\n44#4,2:80\n47#5,4:82\n*S KotlinDebug\n*F\n+ 1 KWebConfigUpdateStartupTask.kt\ncom/kubi/kweb/startup/KWebConfigUpdateStartupTask\n*L\n35#1:59,9\n35#1:68\n35#1:70\n35#1:71\n36#1:72,8\n35#1:69\n40#1:80,2\n45#1:82,4\n*E\n"})
public final class KWebConfigUpdateStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kweb.startup.KWebConfigUpdateStartupTask$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KWebConfigUpdateStartupTask.kt\ncom/kubi/kweb/startup/KWebConfigUpdateStartupTask\n+ 3 KWebIssue.kt\ncom/kubi/kweb/exception/KWebIssueKt\n*L\n1#1,49:1\n45#2:50\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 KWebConfigUpdateStartupTask.kt\ncom/kubi/kweb/startup/KWebConfigUpdateStartupTask\n*L\n45#1:51,2\n*E\n"})
    public static final class C17086a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KWebException(exception, "hybrid_update error", false, null, 8, null), null, 2, null);
        }

        public C17086a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kweb.startup.KWebConfigUpdateStartupTask$run$1 */
    /* JADX INFO: compiled from: KWebConfigUpdateStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kweb.startup.KWebConfigUpdateStartupTask$run$1", m90122f = "KWebConfigUpdateStartupTask.kt", m90123i = {3, 4}, m90124l = {48, 49, 50, 54, 55}, m90125m = "invokeSuspend", m90126n = {"taskLimit", "taskLimit"}, m90127s = {"I$0", "I$0"})
    public static final class C170871 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C170871(Application application, Continuation<? super C170871> continuation) {
            super(2, continuation);
            this.$application = application;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C170871(this.$application, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C170871) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0060  */
        /* JADX WARN: Code duplicated, block: B:28:0x0075 A[PHI: r1
          0x0075: PHI (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:26:0x0072, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
        
            if (r8.m58700c(r3, r7) == r0) goto L30;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IWebService iWebService;
            int iM67271c;
            HybridPackageManager hybridPackageManager;
            Application application;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                iM67271c = this.I$0;
                                ResultKt.throwOnFailure(obj);
                                C24307c c24307c = C24307c.f48432a;
                                Application application2 = this.$application;
                                this.I$0 = iM67271c;
                                this.label = 5;
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            iM67271c = PackageConfigHelper.f55151a.m67271c();
                            hybridPackageManager = HybridPackageManager.f47391a;
                            application = this.$application;
                            this.I$0 = iM67271c;
                            this.label = 4;
                            if (hybridPackageManager.m57721m(application, iM67271c, this) != coroutine_suspended) {
                                C24307c c24307c2 = C24307c.f48432a;
                                Application application3 = this.$application;
                                this.I$0 = iM67271c;
                                this.label = 5;
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        iWebService = IWebService.f54644a.get();
                        this.label = 3;
                        if (IWebService.m67010d(iWebService, false, this, 1, null) != coroutine_suspended) {
                            iM67271c = PackageConfigHelper.f55151a.m67271c();
                            hybridPackageManager = HybridPackageManager.f47391a;
                            application = this.$application;
                            this.I$0 = iM67271c;
                            this.label = 4;
                            if (hybridPackageManager.m57721m(application, iM67271c, this) != coroutine_suspended) {
                                C24307c c24307c3 = C24307c.f48432a;
                                Application application4 = this.$application;
                                this.I$0 = iM67271c;
                                this.label = 5;
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C45977b c45977b = C45977b.f103426a;
            this.label = 1;
            if (c45977b.m101419e(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            WhiteListHelper whiteListHelper = WhiteListHelper.f31028a;
            this.label = 2;
            if (whiteListHelper.m36737a(this) != coroutine_suspended) {
                iWebService = IWebService.f54644a.get();
                this.label = 3;
                if (IWebService.m67010d(iWebService, false, this, 1, null) != coroutine_suspended) {
                    iM67271c = PackageConfigHelper.f55151a.m67271c();
                    hybridPackageManager = HybridPackageManager.f47391a;
                    application = this.$application;
                    this.I$0 = iM67271c;
                    this.label = 4;
                    if (hybridPackageManager.m57721m(application, iM67271c, this) != coroutine_suspended) {
                        C24307c c24307c4 = C24307c.f48432a;
                        Application application5 = this.$application;
                        this.I$0 = iM67271c;
                        this.label = 5;
                    }
                }
            }
            return coroutine_suspended;
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            List<C45976a> listM36729c = BizInfoHelper.f31023a.m36729c();
            C45977b.f103426a.m101421g(listM36729c);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM36729c.iterator();
            while (it.hasNext()) {
                OfflineUrlInfo offlineUrlInfoM101414d = ((C45976a) it.next()).m101414d();
                if (offlineUrlInfoM101414d != null) {
                    arrayList.add(offlineUrlInfoM101414d);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((OfflineUrlInfo) obj).getUrl())) {
                    arrayList2.add(obj);
                }
            }
            HybridPackageManager.f47391a.m57717h(application, CollectionsKt.toList(arrayList2));
        } catch (Throwable th2) {
            C43846g.m96568c(new KWebException(th2, "kweb_config_update", false, null, 8, null), null, 2, null);
        }
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("hybrid_update").plus(C42911a.m94120b()).plus(new C17086a(CoroutineExceptionHandler.INSTANCE))), null, null, new C170871(application, null), 3, null);
    }
}
