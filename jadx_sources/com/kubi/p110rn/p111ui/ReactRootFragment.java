package com.kubi.p110rn.p111ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.KubiFragmentSavedStateAccess;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.google.gson.reflect.TypeToken;
import com.kubi.app.user.R$color;
import com.kubi.app.user.R$drawable;
import com.kubi.app.user.R$string;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.RNEvent;
import com.kubi.p110rn.config.RnWhitePageCheckConfig;
import com.kubi.p110rn.core.ReactConstKt;
import com.kubi.p110rn.core.ReactInitParam;
import com.kubi.p110rn.core.ReactRootViewHost;
import com.kubi.p110rn.exception.RNException;
import com.kubi.p110rn.modules.RNH5InterActionHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.modules.RNPageHideEvent;
import com.kubi.p110rn.modules.RNPageShowEvent;
import com.kubi.p110rn.modules.RNPublishSubject;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.performance.pageopen.ElapsedRealtimePageOpenClock;
import com.kubi.sdk.pkg.bundle.BundleManager;
import com.kubi.sdk.pkg.helper.RnWritePageChecker;
import com.kubi.sdk.pkg.helper.WhitePageCode;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27058k0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.lang.reflect.Type;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import my.InterfaceC42678q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p840zq.C46908e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: ReactRootFragment.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u0002062\u0006\u0010:\u001a\u000208H\u0016J\b\u0010;\u001a\u000206H\u0002J$\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u00107\u001a\u0004\u0018\u0001082\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020=2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010D\u001a\u000206H\u0002J\u0010\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020%H\u0002J\b\u0010G\u001a\u000206H\u0002J\b\u0010H\u001a\u000206H\u0002J\"\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020%2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u000206H\u0016J\u0018\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u00020%H\u0016J\u0010\u0010R\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010S\u001a\u00020\u000bH\u0016J\b\u0010T\u001a\u000206H\u0016J\"\u0010U\u001a\u0002062\u0006\u0010V\u001a\u00020%2\u0006\u0010W\u001a\u00020%2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u000206H\u0016J\b\u0010[\u001a\u000206H\u0016J\b\u0010\\\u001a\u000206H\u0016J\b\u0010]\u001a\u000206H\u0016J\b\u0010^\u001a\u000206H\u0016J\b\u0010_\u001a\u000206H\u0016J\b\u0010`\u001a\u000206H\u0016J\b\u0010a\u001a\u000206H\u0002J\r\u0010b\u001a\u000206H\u0000¢\u0006\u0002\bcJ\b\u0010d\u001a\u000206H\u0002J\b\u0010e\u001a\u000206H\u0002J\u0010\u0010f\u001a\u0002062\u0006\u0010g\u001a\u00020=H\u0002J\b\u0010h\u001a\u000206H\u0002J\b\u0010i\u001a\u000206H\u0002J\u0006\u0010j\u001a\u000206R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, m90084d2 = {"Lcom/kubi/rn/ui/ReactRootFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "Lcom/kubi/sdk/eventhub/RnContainerIdProvider;", "<init>", "()V", "rnContainerId", "", "getRnContainerId", "()Ljava/lang/String;", "lastHideOnBackGround", "", "hostInstance", "Lcom/kubi/rn/core/ReactRootViewHost;", "host", "getHost", "()Lcom/kubi/rn/core/ReactRootViewHost;", "backup", "rnBizPath", "bizName", "isRnDebugPage", "isDebugHostPausedByVisibility", "startTime", "", "pageOpenStartTimeMs", "pageId", "getPageId", "setPageId", "(Ljava/lang/String;)V", "visibilityCallbackHandler", "Landroid/os/Handler;", "hideRunnable", "Ljava/lang/Runnable;", "showRunnable", "rnWritePageChecker", "Lcom/kubi/sdk/pkg/helper/RnWritePageChecker;", "loadTaskId", "", "failedTaskId", "loadJob", "Lkotlinx/coroutines/Job;", "rnScreenCrashSwitch2", "getRnScreenCrashSwitch2", "()Z", "rnScreenCrashSwitch2$delegate", "Lkotlin/Lazy;", "customErrorView", "Lcom/kubi/rn/ui/RnCustomErrorView;", "debugCornerView", "Lcom/kubi/rn/ui/RnDebugCornerView;", "isRollingBack", "rollbackListener", "Lcom/kubi/sdk/pkg/bundle/BundleManager$OnBizRolledBackListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "clearRestoredChildFragmentManagerState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStartLoad", "onFailed", "taskId", "showRollbackDialog", "reloadByReplace", "showFailView", "tips", TUIConstants.TUIChat.INPUT_MORE_ICON, "click", "Landroid/view/View$OnClickListener;", "showContentView", "showLoadingView", "color", "gravity", "goDown", "onBackPressed", "invokeDefaultOnBackPressed", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onResume", "onPause", "onStop", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onDestroyView", "onDestroy", "cancelVisibilityCallbacks", "showDevOptionsDialog", "showDevOptionsDialog$BReactNativeLib_googleRelease", "pauseDebugHost", "resumeDebugHost", "attachDebugCornerView", "rootView", "bringDebugCornerViewToFront", "detachDebugCornerView", "exposeReportSensor", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactRootFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactRootFragment.kt\ncom/kubi/rn/ui/ReactRootFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,655:1\n1#2:656\n45#3,2:657\n35#4,4:659\n39#4:665\n44#5,2:663\n*S KotlinDebug\n*F\n+ 1 ReactRootFragment.kt\ncom/kubi/rn/ui/ReactRootFragment\n*L\n581#1:657,2\n133#1:659,4\n133#1:665\n133#1:663,2\n*E\n"})
public final class ReactRootFragment extends BaseFragment implements DefaultHardwareBackBtnHandler, InterfaceC42678q {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String backup;

    @Nullable
    private RnCustomErrorView customErrorView;

    @Nullable
    private RnDebugCornerView debugCornerView;

    @Nullable
    private Runnable hideRunnable;

    @Nullable
    private ReactRootViewHost hostInstance;
    private boolean isDebugHostPausedByVisibility;
    private boolean isRnDebugPage;
    private volatile boolean isRollingBack;
    private boolean lastHideOnBackGround;

    @Nullable
    private InterfaceC41775x1 loadJob;
    private int loadTaskId;

    @Nullable
    private Runnable showRunnable;

    @NotNull
    private String rnBizPath = "";

    @NotNull
    private String bizName = "";
    private final long startTime = System.currentTimeMillis();
    private final long pageOpenStartTimeMs = ElapsedRealtimePageOpenClock.f47223a.mo57396a();

    @Nullable
    private String pageId = "page_RN";

    @NotNull
    private final Handler visibilityCallbackHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final RnWritePageChecker rnWritePageChecker = new RnWritePageChecker(RnWhitePageCheckConfig.INSTANCE.getThresholdRate());
    private int failedTaskId = -1;

    /* JADX INFO: renamed from: rnScreenCrashSwitch2$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rnScreenCrashSwitch2 = LazyKt.lazy(new Function0() { // from class: com.kubi.rn.ui.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ReactRootFragment.rnScreenCrashSwitch2_delegate$lambda$1());
        }
    });

    @NotNull
    private final BundleManager.InterfaceC23925a rollbackListener = new BundleManager.InterfaceC23925a() { // from class: com.kubi.rn.ui.b
        @Override // com.kubi.sdk.pkg.bundle.BundleManager.InterfaceC23925a
        /* JADX INFO: renamed from: a */
        public final void mo56151a(List list) {
            ReactRootFragment.rollbackListener$lambda$3(this.f46130a, list);
        }
    };

    /* JADX INFO: compiled from: ReactRootFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/ui/ReactRootFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/rn/ui/ReactRootFragment;", "initialProperties", "Landroid/os/Bundle;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ReactRootFragment newInstance(@Nullable Bundle initialProperties) {
            ReactRootFragment reactRootFragment = new ReactRootFragment();
            if (initialProperties == null) {
                initialProperties = Bundle.EMPTY;
            }
            reactRootFragment.setArguments(initialProperties);
            return reactRootFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.ui.ReactRootFragment$onCreate$1 */
    /* JADX INFO: compiled from: ReactRootFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.ui.ReactRootFragment$onCreate$1", m90122f = "ReactRootFragment.kt", m90123i = {}, m90124l = {160}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C236001 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C236001(Continuation<? super C236001> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReactRootFragment.this.new C236001(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236001) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                RnWritePageChecker rnWritePageChecker = ReactRootFragment.this.rnWritePageChecker;
                this.label = 1;
                if (rnWritePageChecker.m57705c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.ui.ReactRootFragment$onPause$1 */
    /* JADX INFO: compiled from: ReactRootFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.ui.ReactRootFragment$onPause$1", m90122f = "ReactRootFragment.kt", m90123i = {0, 0}, m90124l = {493}, m90125m = "invokeSuspend", m90126n = {"it", "$i$a$-let-ReactRootFragment$onPause$1$1"}, m90127s = {"L$1", "I$0"})
    public static final class C236011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        public C236011(Continuation<? super C236011> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReactRootFragment.this.new C236011(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReactRootFragment reactRootFragment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        reactRootFragment = (ReactRootFragment) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    View view = ReactRootFragment.this.getView();
                    if (view != null) {
                        ReactRootFragment reactRootFragment2 = ReactRootFragment.this;
                        RnWritePageChecker rnWritePageChecker = reactRootFragment2.rnWritePageChecker;
                        String str = reactRootFragment2.bizName;
                        this.L$0 = reactRootFragment2;
                        this.L$1 = SpillingKt.nullOutSpilledVariable(view);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = rnWritePageChecker.m57704b(view, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        reactRootFragment = reactRootFragment2;
                    }
                    return Unit.INSTANCE;
                }
                reactRootFragment.getHost().setWhitePageChecker(((WhitePageCode) obj).getCode());
            } catch (Throwable th2) {
                C44128b.m97262f("rnWhiteScreenCheck", "onPause checkWhitePage error:" + ReactRootFragment.this.bizName, th2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.ui.ReactRootFragment$onStartLoad$2 */
    /* JADX INFO: compiled from: ReactRootFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.ui.ReactRootFragment$onStartLoad$2", m90122f = "ReactRootFragment.kt", m90123i = {}, m90124l = {248}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C236022 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $taskId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C236022(int i11, Continuation<? super C236022> continuation) {
            super(2, continuation);
            this.$taskId = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReactRootFragment.this.new C236022(this.$taskId, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236022) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ReactRootViewHost host = ReactRootFragment.this.getHost();
                this.label = 1;
                obj = host.startReactAsync(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (this.$taskId != ReactRootFragment.this.loadTaskId) {
                C23985b.f47489a.m57877e("openKRN", "onStartLoad stale result ignored(taskId=" + this.$taskId + ",current=" + ReactRootFragment.this.loadTaskId + ",success=" + zBooleanValue + "): " + ReactRootFragment.this.rnBizPath);
                return Unit.INSTANCE;
            }
            if (zBooleanValue) {
                if (this.$taskId == ReactRootFragment.this.failedTaskId) {
                    C23985b.f47489a.m57877e("openKRN", "onStartLoad stale success ignored, already failed: " + ReactRootFragment.this.rnBizPath);
                    return Unit.INSTANCE;
                }
                C23985b.f47489a.m57877e("openKRN", "onStartLoad rn success: " + ReactRootFragment.this.rnBizPath);
                ReactRootFragment.this.showContentView();
            } else {
                C23985b.m57873d(C23985b.f47489a, "openKRN", "onStartLoad rn onFailed: " + ReactRootFragment.this.rnBizPath, null, 4, null);
                ReactRootFragment.this.onFailed(this.$taskId);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onStartLoad() {
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        final int i11 = this.loadTaskId + 1;
        this.loadTaskId = i11;
        getHost().cancelPendingStart();
        getHost().setReactCrashListener(new Function0() { // from class: com.kubi.rn.ui.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootFragment.onStartLoad$lambda$10(this.f46141b, i11);
            }
        });
        InterfaceC41775x1 interfaceC41775x1 = this.loadJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.loadJob = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C236022(i11, null), 3, null);
    }

    private final void cancelVisibilityCallbacks() {
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            this.visibilityCallbackHandler.removeCallbacks(runnable);
        }
        this.hideRunnable = null;
        Runnable runnable2 = this.showRunnable;
        if (runnable2 != null) {
            this.visibilityCallbackHandler.removeCallbacks(runnable2);
        }
        this.showRunnable = null;
    }

    private final void clearRestoredChildFragmentManagerState() {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(KubiFragmentSavedStateAccess.removeChildFragmentManagerState(this)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            try {
                C43840a.m96549c("clearRestoredChildFragmentManagerState fatal: " + thM103847exceptionOrNullimpl.getMessage(), null, 2, null);
                objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                Log.e(getTAG(), "Breadcrumbs err");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactRootViewHost getHost() {
        ReactRootViewHost reactRootViewHost = this.hostInstance;
        if (reactRootViewHost != null) {
            return reactRootViewHost;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ReactRootViewHost reactRootViewHost2 = new ReactRootViewHost(contextRequireContext, fragmentActivityRequireActivity, this, viewLifecycleOwner, Long.valueOf(this.pageOpenStartTimeMs));
        this.hostInstance = reactRootViewHost2;
        return reactRootViewHost2;
    }

    private final void goDown(final String backup) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.rn.ui.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootFragment.goDown$lambda$20(this.f46137b, backup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goDown$lambda$20(ReactRootFragment reactRootFragment, String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            reactRootFragment.getHost().onDestroy();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        String strDecode = Uri.decode(str);
        Router router = Router.f46192a;
        Intrinsics.checkNotNull(strDecode);
        router.m56184f(strDecode).m4048k();
        FragmentActivity activity = reactRootFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailed(int taskId) {
        if (taskId != this.loadTaskId) {
            C23985b.f47489a.m57877e("reload", "onFailed ignored, stale taskId: " + this.rnBizPath);
            return;
        }
        if (taskId == this.failedTaskId) {
            C23985b.f47489a.m57877e("reload", "onFailed ignored, already handled: " + this.rnBizPath);
            return;
        }
        if (this.isRollingBack) {
            C23985b.f47489a.m57877e("reload", "onFailed rollback，wait dialog: " + this.rnBizPath);
            return;
        }
        this.failedTaskId = taskId;
        Bundle arguments = getArguments();
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, Constants.BIZ) : null;
        Bundle arguments2 = getArguments();
        C12572a.m23695d(RNEvent.RN_LOAD_FAIL, MapsKt.mapOf(TuplesKt.m90091to(Constants.BIZ, strM56284y), TuplesKt.m90091to(Constants.COMPONENT, arguments2 != null ? RouteExKt.m56284y(arguments2, Constants.COMPONENT) : null)), 0L, 4, null);
        getHost().cancelPendingStart();
        InterfaceC41775x1 interfaceC41775x1 = this.loadJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        if (ReactRootViewHost.notifyHostHandledError$default(getHost(), 0, 1, null)) {
            C23985b.f47489a.m57877e("reload", "onFailed handled by host: " + this.rnBizPath);
            return;
        }
        getHost().unmountReactRootView();
        String str = this.backup;
        if (str == null || StringsKt.isBlank(str)) {
            C23985b.m57873d(C23985b.f47489a, "reload", "onFailed ReactRootFragment showFailView: " + this.rnBizPath, null, 4, null);
            BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.rn.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReactRootFragment.onFailed$lambda$11(this.f46136b, view);
                }
            }, 3, (Object) null);
            return;
        }
        C23985b.m57873d(C23985b.f47489a, "reload", "onFailed ReactRootFragment goDown: " + this.rnBizPath, null, 4, null);
        goDown(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailed$lambda$11(ReactRootFragment reactRootFragment, View view) {
        C23985b.m57873d(C23985b.f47489a, "reload", "onFailed ReactRootFragment retryByReplace: " + reactRootFragment.rnBizPath, null, 4, null);
        reactRootFragment.reloadByReplace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartLoad$lambda$10(final ReactRootFragment reactRootFragment, final int i11) {
        reactRootFragment.runOnUiThread(new Function0() { // from class: com.kubi.rn.ui.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootFragment.onStartLoad$lambda$10$lambda$9(this.f46132b, i11);
            }
        });
        return Unit.INSTANCE;
    }

    private final void reloadByReplace() {
        Object objM103844constructorimpl;
        this.loadTaskId++;
        InterfaceC41775x1 interfaceC41775x1 = this.loadJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.loadJob = null;
        cancelVisibilityCallbacks();
        ReactRootViewHost reactRootViewHost = this.hostInstance;
        if (reactRootViewHost != null) {
            reactRootViewHost.cancelPendingStart();
            try {
                Result.Companion companion = Result.INSTANCE;
                reactRootViewHost.onDestroy();
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Result.m103843boximpl(objM103844constructorimpl);
        }
        this.hostInstance = null;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        Object parent = requireView().getParent();
        if (parent != null) {
            View view = parent instanceof View ? (View) parent : null;
            Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
            if (numValueOf != null) {
                parentFragmentManager.beginTransaction().replace(numValueOf.intValue(), INSTANCE.newInstance(getArguments())).commitAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rnScreenCrashSwitch2_delegate$lambda$1() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<Boolean>() { // from class: com.kubi.rn.ui.ReactRootFragment$rnScreenCrashSwitch2_delegate$lambda$1$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_rn_screen_crash_switch2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rollbackListener$lambda$3(final ReactRootFragment reactRootFragment, List rolledBackBizList) {
        Intrinsics.checkNotNullParameter(rolledBackBizList, "rolledBackBizList");
        if (reactRootFragment.isRollingBack || reactRootFragment.bizName.length() <= 0 || !rolledBackBizList.contains(reactRootFragment.bizName)) {
            return;
        }
        reactRootFragment.isRollingBack = true;
        C23985b.f47489a.m57877e("pkgPlatform", "rollbackListener biz=" + reactRootFragment.bizName + "，call rollback dialog");
        reactRootFragment.runOnUiThread(new Function0() { // from class: com.kubi.rn.ui.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootFragment.rollbackListener$lambda$3$lambda$2(this.f46129b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRollbackDialog$lambda$12(ReactRootFragment reactRootFragment, DialogInterface dialogInterface, int i11) {
        C23985b.f47489a.m57877e("pkgPlatform", "showRollbackDialog reload biz=" + reactRootFragment.bizName);
        reactRootFragment.reloadByReplace();
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF53793U() {
        return this.pageId;
    }

    public final boolean getRnScreenCrashSwitch2() {
        return ((Boolean) this.rnScreenCrashSwitch2.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        String biz;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        cancelVisibilityCallbacks();
        ReactRootViewHost reactRootViewHost = this.hostInstance;
        if (reactRootViewHost != null) {
            reactRootViewHost.cancelPendingStart();
            reactRootViewHost.onDestroy();
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.hostInstance = new ReactRootViewHost(contextRequireContext, fragmentActivityRequireActivity, this, viewLifecycleOwner, null, 16, null);
        ReactInitParam reactInitParamFromBundle = ReactInitParam.INSTANCE.fromBundle(getArguments());
        if (reactInitParamFromBundle != null && reactInitParamFromBundle.getTitleBarHidden()) {
            getTitleBar().m58934f();
        }
        this.isRnDebugPage = reactInitParamFromBundle != null && reactInitParamFromBundle.isDebug();
        this.backup = reactInitParamFromBundle != null ? reactInitParamFromBundle.getBackup() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(reactInitParamFromBundle != null ? reactInitParamFromBundle.getBiz() : null);
        sb2.append('-');
        sb2.append(reactInitParamFromBundle != null ? reactInitParamFromBundle.getEntry() : null);
        this.rnBizPath = sb2.toString();
        if (reactInitParamFromBundle == null || (biz = reactInitParamFromBundle.getBiz()) == null) {
            biz = "";
        }
        this.bizName = biz;
        C46908e c46908e = C46908e.f104773a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(reactInitParamFromBundle != null ? reactInitParamFromBundle.getBiz() : null);
        sb3.append('-');
        sb3.append(reactInitParamFromBundle != null ? reactInitParamFromBundle.getEntry() : null);
        c46908e.mo42474b(this, sb3.toString());
        C23985b.f47489a.m57877e("openKRN", "onCreateView biz:" + this.rnBizPath);
        return getHost().initRootView(reactInitParamFromBundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Object objM103844constructorimpl;
        InterfaceC41775x1 interfaceC41775x1 = this.loadJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.loadJob = null;
        cancelVisibilityCallbacks();
        ReactRootViewHost reactRootViewHost = this.hostInstance;
        if (reactRootViewHost != null) {
            reactRootViewHost.cancelPendingStart();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ReactRootViewHost reactRootViewHost2 = this.hostInstance;
            if (reactRootViewHost2 != null) {
                reactRootViewHost2.onDestroy();
            }
            RNH5InterActionHelper.release();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
        super.onDestroy();
        this.hostInstance = null;
        this.customErrorView = null;
        C23985b.m57873d(C23985b.f47489a, "deinit", "onDestroy ReactRootFragment : " + this.rnBizPath, null, 4, null);
        C46908e.f104773a.mo42473a(this, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.loadTaskId++;
        InterfaceC41775x1 interfaceC41775x1 = this.loadJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.loadJob = null;
        cancelVisibilityCallbacks();
        ReactRootViewHost reactRootViewHost = this.hostInstance;
        if (reactRootViewHost != null) {
            reactRootViewHost.cancelPendingStart();
        }
        ReactRootViewHost reactRootViewHost2 = this.hostInstance;
        if (reactRootViewHost2 != null) {
            reactRootViewHost2.onDestroy();
        }
        this.hostInstance = null;
        detachDebugCornerView();
        this.customErrorView = null;
        BundleManager.f47277a.removeOnBizRolledBackListener(this.rollbackListener);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ReactInitParam reactInitParamFromBundle = ReactInitParam.INSTANCE.fromBundle(getArguments());
        view.setBackgroundColor((reactInitParamFromBundle == null || !reactInitParamFromBundle.getTransparent()) ? requireContext().getResources().getColor(R$color.c_overlay) : 0);
        attachDebugCornerView(view);
        BundleManager.f47277a.addOnBizRolledBackListener(this.rollbackListener);
        onStartLoad();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.pageId = str;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void showContentView() {
        RnCustomErrorView rnCustomErrorView = this.customErrorView;
        if (rnCustomErrorView != null) {
            rnCustomErrorView.hide();
        }
        super.showContentView();
        bringDebugCornerViewToFront();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void showFailView(int tips, int icon, @Nullable View.OnClickListener click) {
        View view;
        if (this.customErrorView == null && (view = getView()) != null && (view instanceof ViewGroup)) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RnCustomErrorView rnCustomErrorView = new RnCustomErrorView(contextRequireContext, null, 0, 6, null);
            rnCustomErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            rnCustomErrorView.hide();
            ((ViewGroup) view).addView(rnCustomErrorView);
            this.customErrorView = rnCustomErrorView;
        }
        RnCustomErrorView rnCustomErrorView2 = this.customErrorView;
        if (rnCustomErrorView2 != null) {
            rnCustomErrorView2.setOnRetryClickListener(click);
            rnCustomErrorView2.show();
        }
        bringDebugCornerViewToFront();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void showLoadingView(int color, int gravity) {
        RnCustomErrorView rnCustomErrorView = this.customErrorView;
        if (rnCustomErrorView != null) {
            rnCustomErrorView.hide();
        }
        super.showLoadingView(color, gravity);
        bringDebugCornerViewToFront();
    }

    private final void attachDebugCornerView(View rootView) {
        FrameLayout frameLayout;
        if (ReactConstKt.getDeveloperSupport()) {
            if (rootView instanceof FrameLayout) {
                frameLayout = (FrameLayout) rootView;
            } else {
                frameLayout = null;
            }
            if (frameLayout == null) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            RnDebugCornerView rnDebugCornerView = new RnDebugCornerView(fragmentActivityRequireActivity, new Function0() { // from class: com.kubi.rn.ui.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactRootFragment.attachDebugCornerView$lambda$31(this.f46139b);
                }
            });
            rnDebugCornerView.attachTo(frameLayout);
            this.debugCornerView = rnDebugCornerView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String attachDebugCornerView$lambda$31(ReactRootFragment reactRootFragment) {
        return reactRootFragment.getHost().getDebugBundleDialogContent();
    }

    private final void bringDebugCornerViewToFront() {
        RnDebugCornerView rnDebugCornerView;
        if (ReactConstKt.getDeveloperSupport() && (rnDebugCornerView = this.debugCornerView) != null) {
            rnDebugCornerView.bringToFront();
        }
    }

    private final void detachDebugCornerView() {
        RnDebugCornerView rnDebugCornerView;
        if (ReactConstKt.getDeveloperSupport() && (rnDebugCornerView = this.debugCornerView) != null) {
            rnDebugCornerView.detach();
        }
        this.debugCornerView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeDefaultOnBackPressed$lambda$21(ReactRootFragment reactRootFragment) {
        Boolean boolValueOf;
        Bundle arguments = reactRootFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("ignoreHandleBackPressed"));
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            if (C27012a.m66486i().m66492f() == 1) {
                InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
            }
            FragmentActivity activity = reactRootFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHide$lambda$22(ReactRootFragment reactRootFragment) {
        ReactRootViewHost reactRootViewHost;
        if (reactRootFragment.isAdded() && reactRootFragment.getView() != null && (reactRootViewHost = reactRootFragment.hostInstance) != null) {
            boolean zM66755e = C27058k0.f54342a.m66755e();
            boolean z11 = !zM66755e;
            if (!zM66755e) {
                reactRootViewHost.onAppBackground();
            }
            RNPublishSubject.INSTANCE.getNativePageHideStatus().onNext(new RNPageHideEvent(reactRootViewHost.getEventHubContainerId(), z11));
            reactRootFragment.lastHideOnBackGround = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onShow$lambda$25(ReactRootFragment reactRootFragment) {
        ReactRootViewHost reactRootViewHost;
        if (reactRootFragment.isAdded() && reactRootFragment.getView() != null && (reactRootViewHost = reactRootFragment.hostInstance) != null) {
            RNPublishSubject.INSTANCE.getNativePageShowStatus().onNext(new RNPageShowEvent(reactRootViewHost.getEventHubContainerId(), reactRootFragment.lastHideOnBackGround));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartLoad$lambda$10$lambda$9(ReactRootFragment reactRootFragment, int i11) {
        reactRootFragment.onFailed(i11);
        return Unit.INSTANCE;
    }

    private final void pauseDebugHost() {
        if (ReactConstKt.getDeveloperSupport() && this.isRnDebugPage && !this.isDebugHostPausedByVisibility) {
            getHost().onPause();
            this.isDebugHostPausedByVisibility = true;
        }
    }

    private final void resumeDebugHost() {
        if (ReactConstKt.getDeveloperSupport() && this.isRnDebugPage && this.isDebugHostPausedByVisibility) {
            getHost().onResume();
            this.isDebugHostPausedByVisibility = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rollbackListener$lambda$3$lambda$2(ReactRootFragment reactRootFragment) {
        reactRootFragment.showRollbackDialog();
        return Unit.INSTANCE;
    }

    private final void showRollbackDialog() {
        if (isAdded() && !isDetached()) {
            FragmentActivity activity = getActivity();
            if (activity != null && activity.isFinishing()) {
                return;
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && activity2.isDestroyed()) {
                return;
            }
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54173d5(false).m54156M4(getString(R$string.rn_bundle_error)).m54157N4(true).m54161R4(0).m54152I4(false).m54151H4(false).m54162S4(R$string.rn_bundle_retry, new DialogInterface.OnClickListener() { // from class: com.kubi.rn.ui.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    ReactRootFragment.showRollbackDialog$lambda$12(this.f46131b, dialogInterface, i11);
                }
            }).m54172c5(getChildFragmentManager());
        }
    }

    public final void exposeReportSensor() {
        getHost().exposeReportSensor();
    }

    @Override // my.InterfaceC42678q
    @Nullable
    public String getRnContainerId() {
        ReactRootViewHost reactRootViewHost;
        if (getView() == null || (reactRootViewHost = this.hostInstance) == null) {
            return null;
        }
        return reactRootViewHost.getEventHubContainerId();
    }

    @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
    public void invokeDefaultOnBackPressed() {
        IAppletService.f46452a.get().mo15069d(getActivity(), new Function0() { // from class: com.kubi.rn.ui.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactRootFragment.invokeDefaultOnBackPressed$lambda$21(this.f46140b);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getHost().onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        Boolean boolValueOf;
        if (getHost().handleBackPressed()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                boolValueOf = Boolean.valueOf(arguments.getBoolean("ignoreHandleBackPressed"));
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf)) {
                return true;
            }
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C236001(null), 3, null);
        if (savedInstanceState != null) {
            clearRestoredChildFragmentManagerState();
        }
        super.onCreate(null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        pauseDebugHost();
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            this.visibilityCallbackHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.kubi.rn.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                ReactRootFragment.onHide$lambda$22(this.f46135b);
            }
        };
        this.hideRunnable = runnable2;
        this.visibilityCallbackHandler.postDelayed(runnable2, 100L);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        pauseDebugHost();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        RnWhitePageCheckConfig rnWhitePageCheckConfig = RnWhitePageCheckConfig.INSTANCE;
        if (rnWhitePageCheckConfig.isEnable() && jCurrentTimeMillis >= rnWhitePageCheckConfig.getDelay()) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C236011(null), 3, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getHost().onResume();
        this.isDebugHostPausedByVisibility = false;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        resumeDebugHost();
        Runnable runnable = this.showRunnable;
        if (runnable != null) {
            this.visibilityCallbackHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.kubi.rn.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                ReactRootFragment.onShow$lambda$25(this.f46134b);
            }
        };
        this.showRunnable = runnable2;
        this.visibilityCallbackHandler.postDelayed(runnable2, 100L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        FragmentActivity activity;
        super.onStop();
        FragmentActivity activity2 = getActivity();
        if ((activity2 != null && activity2.isFinishing()) || ((activity = getActivity()) != null && activity.isChangingConfigurations())) {
            getHost().onPause();
        }
    }

    public final void showDevOptionsDialog$BReactNativeLib_googleRelease() {
        getHost().showDevOptionsDialog();
    }
}
