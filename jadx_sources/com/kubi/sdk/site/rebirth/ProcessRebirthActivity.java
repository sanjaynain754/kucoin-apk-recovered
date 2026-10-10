package com.kubi.sdk.site.rebirth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.site.R$anim;
import com.kubi.sdk.site.R$id;
import com.kubi.sdk.site.R$layout;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ProcessRebirthActivity.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0014J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\tH\u0014J\b\u0010!\u001a\u00020\tH\u0014J\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\b\u0010#\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0018\u00010\u0015R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/ProcessRebirthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "isBlockChange", "", "resumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showBlockLayout", "showLoadingLayout", "showAnime", "showLayout", "Landroid/view/View;", "hideLayout", "setSystemUI", "onResume", "targetSiteReceiver", "Lcom/kubi/sdk/site/rebirth/ProcessRebirthActivity$TargetSiteReceiver;", "GET_TARGET_SITE", "", "getGET_TARGET_SITE", "()Ljava/lang/String;", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "goSplash", "killPid", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPause", "onDestroy", "killMainProcess", "restartByService", "Companion", "TargetSiteReceiver", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProcessRebirthActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f47937n = new Companion(null);

    /* JADX INFO: renamed from: o */
    @Nullable
    public static WeakReference<ProcessRebirthActivity> f47938o;

    /* JADX INFO: renamed from: i */
    public boolean f47939i;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C24169a f47941k;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AtomicBoolean f47940j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    @NotNull
    public final String f47942l = "get_target_site";

    /* JADX INFO: renamed from: m */
    @NotNull
    public final InterfaceC41769w<Boolean> f47943m = C41777y.m91388c(null, 1, null);

    /* JADX INFO: compiled from: ProcessRebirthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/ProcessRebirthActivity$Companion;", "", "<init>", "()V", "TAG", "", "activityRef", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/sdk/site/rebirth/ProcessRebirthActivity;", "finishSelf", "", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void finishSelf() {
            ProcessRebirthActivity processRebirthActivity;
            WeakReference weakReference = ProcessRebirthActivity.f47938o;
            if (weakReference != null && (processRebirthActivity = (ProcessRebirthActivity) weakReference.get()) != null) {
                processRebirthActivity.finish();
            }
            C44128b.m97266j("ProcessRebirthActivity", "finishSelf");
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.ProcessRebirthActivity$a */
    /* JADX INFO: compiled from: ProcessRebirthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/ProcessRebirthActivity$TargetSiteReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/kubi/sdk/site/rebirth/ProcessRebirthActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C24169a extends BroadcastReceiver {
        public C24169a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TargetSiteReceiver：onReceive=");
            sb2.append(intent != null ? intent.getAction() : null);
            C44128b.m97266j("ProcessRebirthActivity", sb2.toString());
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, ProcessRebirthActivity.this.getF47942l())) {
                boolean booleanExtra = intent.getBooleanExtra("remoteSiteConfigSuc", false);
                C44128b.m97266j("ProcessRebirthActivity", "TargetSiteReceiver onReceive：" + booleanExtra);
                if (booleanExtra) {
                    ProcessRebirthActivity.this.f47943m.mo91370n(Boolean.TRUE);
                } else {
                    C44128b.m97266j("ProcessRebirthActivity", "TargetSiteReceiver onReceive false and always loading...");
                    ToastCompat.m66436B("Failed to switch site.", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.ProcessRebirthActivity$c */
    /* JADX INFO: compiled from: ProcessRebirthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/sdk/site/rebirth/ProcessRebirthActivity$showAnime$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationStart", "", "animation", "Landroid/view/animation/Animation;", "onAnimationEnd", "onAnimationRepeat", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class AnimationAnimationListenerC24171c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f47945a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f47946b;

        public AnimationAnimationListenerC24171c(View view, View view2) {
            this.f47945a = view;
            this.f47946b = view2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ViewExtKt.m66594y(this.f47945a);
            View view = this.f47946b;
            if (view != null) {
                C27046k.m66703r(view);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            ViewExtKt.m66594y(this.f47945a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.ProcessRebirthActivity$onResume$1 */
    /* JADX INFO: compiled from: ProcessRebirthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.rebirth.ProcessRebirthActivity$onResume$1", m90122f = "ProcessRebirthActivity.kt", m90123i = {2}, m90124l = {TPPixelFormat.TP_PIX_FMT_MEDIACODEC, 170, 173}, m90125m = "invokeSuspend", m90126n = {"res"}, m90127s = {"Z$0"})
    public static final class C241721 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $killPid;
        final /* synthetic */ String $targetSite;
        boolean Z$0;
        int label;
        final /* synthetic */ ProcessRebirthActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241721(String str, ProcessRebirthActivity processRebirthActivity, int i11, Continuation<? super C241721> continuation) {
            super(2, continuation);
            this.$targetSite = str;
            this.this$0 = processRebirthActivity;
            this.$killPid = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C241721(this.$targetSite, this.this$0, this.$killPid, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241721) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x004d  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        
            if (r1.m58183M(r3, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        
            if (r7.m58183M(r1, r6) == r0) goto L26;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (zBooleanValue) {
                            C44128b.m97266j("ProcessRebirthActivity", "Push Process need wait, BroadcastReceiver onReceive and goSplash");
                            ProcessRebirthActivity processRebirthActivity = this.this$0;
                            int i12 = this.$killPid;
                            this.Z$0 = zBooleanValue;
                            this.label = 3;
                        }
                        return Unit.INSTANCE;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$targetSite;
            if (str != null && str.length() != 0) {
                C44128b.m97266j("ProcessRebirthActivity", "Push Process need wait, wait BroadcastReceiver");
                InterfaceC41769w interfaceC41769w = this.this$0.f47943m;
                this.label = 2;
                obj = interfaceC41769w.mo91198h(this);
                if (obj != coroutine_suspended) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        C44128b.m97266j("ProcessRebirthActivity", "Push Process need wait, BroadcastReceiver onReceive and goSplash");
                        ProcessRebirthActivity processRebirthActivity2 = this.this$0;
                        int i13 = this.$killPid;
                        this.Z$0 = zBooleanValue;
                        this.label = 3;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                C44128b.m97266j("ProcessRebirthActivity", "have no target site, just restart main process");
                ProcessRebirthActivity processRebirthActivity3 = this.this$0;
                int i14 = this.$killPid;
                this.label = 1;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: P */
    private final void m58180P() {
        EdgeToEdgeCompat.f48106a.m58273k(this);
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getF47942l() {
        return this.f47942l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public final Object m58183M(int i11, Continuation<? super Unit> continuation) {
        ProcessRebirthActivity$goSplash$1 processRebirthActivity$goSplash$1;
        if (continuation instanceof ProcessRebirthActivity$goSplash$1) {
            processRebirthActivity$goSplash$1 = (ProcessRebirthActivity$goSplash$1) continuation;
            int i12 = processRebirthActivity$goSplash$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                processRebirthActivity$goSplash$1.label = i12 - Integer.MIN_VALUE;
            } else {
                processRebirthActivity$goSplash$1 = new ProcessRebirthActivity$goSplash$1(this, continuation);
            }
        } else {
            processRebirthActivity$goSplash$1 = new ProcessRebirthActivity$goSplash$1(this, continuation);
        }
        Object obj = processRebirthActivity$goSplash$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = processRebirthActivity$goSplash$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i11 > 0) {
                processRebirthActivity$goSplash$1.I$0 = i11;
                processRebirthActivity$goSplash$1.label = 1;
                if (m58184N(i11, processRebirthActivity$goSplash$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.f47939i) {
            m58185O();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(600, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m58184N(int i11, Continuation<? super Unit> continuation) {
        ProcessRebirthActivity$killMainProcess$1 processRebirthActivity$killMainProcess$1;
        if (continuation instanceof ProcessRebirthActivity$killMainProcess$1) {
            processRebirthActivity$killMainProcess$1 = (ProcessRebirthActivity$killMainProcess$1) continuation;
            int i12 = processRebirthActivity$killMainProcess$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                processRebirthActivity$killMainProcess$1.label = i12 - Integer.MIN_VALUE;
            } else {
                processRebirthActivity$killMainProcess$1 = new ProcessRebirthActivity$killMainProcess$1(this, continuation);
            }
        } else {
            processRebirthActivity$killMainProcess$1 = new ProcessRebirthActivity$killMainProcess$1(this, continuation);
        }
        Object obj = processRebirthActivity$killMainProcess$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = processRebirthActivity$killMainProcess$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            processRebirthActivity$killMainProcess$1.I$0 = i11;
            processRebirthActivity$killMainProcess$1.label = 1;
            if (DelayKt.m90350b(100L, processRebirthActivity$killMainProcess$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            i11 = processRebirthActivity$killMainProcess$1.I$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = processRebirthActivity$killMainProcess$1.I$0;
            ResultKt.throwOnFailure(obj);
        }
        C44128b.m97266j("ProcessRebirthActivity", "waitPidExit " + i11);
        return Unit.INSTANCE;
        Process.killProcess(i11);
        C44128b.m97266j("ProcessRebirthActivity", "killProcess " + i11);
        processRebirthActivity$killMainProcess$1.I$0 = i11;
        processRebirthActivity$killMainProcess$1.label = 2;
    }

    /* JADX INFO: renamed from: O */
    public final void m58185O() {
        AppRebirthHelper.f47948a.m58197d(this, getIntent().getExtras());
        C44128b.m97266j("ProcessRebirthActivity", "start AppRebirthLauncherService end");
    }

    /* JADX INFO: renamed from: Q */
    public final void m58186Q(View view, View view2) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R$anim.anim_right_in_200);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC24171c(view, view2));
        view.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: R */
    public final void m58187R() {
        final View viewFindViewById = findViewById(R$id.site_switch_block);
        final View viewFindViewById2 = findViewById(R$id.site_switch_loading);
        SiteLoadingHelper siteLoadingHelper = SiteLoadingHelper.f47947a;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        siteLoadingHelper.m58191c(decorView, getIntent().getExtras());
        Intrinsics.checkNotNull(viewFindViewById);
        m58186Q(viewFindViewById, null);
        View viewFindViewById3 = findViewById(R$id.btn_confirm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.sdk.site.rebirth.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessRebirthActivity.m58181S(this.f47949b, viewFindViewById2, viewFindViewById);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m58188T() {
        View viewFindViewById = findViewById(R$id.site_switch_loading);
        Intrinsics.checkNotNull(viewFindViewById);
        m58186Q(viewFindViewById, null);
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m58181S(ProcessRebirthActivity processRebirthActivity, View view, View view2) {
        Intrinsics.checkNotNull(view);
        processRebirthActivity.m58186Q(view, view2);
        processRebirthActivity.m58185O();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int i11;
        boolean booleanExtra = getIntent().getBooleanExtra("app_rebirth_theme_mode", false);
        AppCompatDelegate delegate = getDelegate();
        if (booleanExtra) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        delegate.setLocalNightMode(i11);
        super.onCreate(savedInstanceState);
        f47938o = new WeakReference<>(this);
        overridePendingTransition(0, 0);
        m58180P();
        setContentView(R$layout.site_switch_layout);
        C44128b.m97266j("ProcessRebirthActivity", "onCreate");
        SiteLoadingHelper siteLoadingHelper = SiteLoadingHelper.f47947a;
        this.f47939i = siteLoadingHelper.m58189a(getIntent().getExtras());
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        siteLoadingHelper.m58192d(decorView, getIntent().getExtras());
        if (this.f47939i) {
            m58187R();
        } else {
            m58188T();
        }
        getOnBackPressedDispatcher().addCallback(new C24170b());
        C24169a c24169a = this.f47941k;
        if (c24169a == null) {
            c24169a = new C24169a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(this.f47942l);
            Unit unit = Unit.INSTANCE;
            ContextCompat.registerReceiver(this, c24169a, intentFilter, 4);
        }
        this.f47941k = c24169a;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C44128b.m97266j("ProcessRebirthActivity", "onDestroy");
        f47938o = null;
        unregisterReceiver(this.f47941k);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C44128b.m97266j("ProcessRebirthActivity", "onPause");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f47940j.getAndSet(true)) {
            return;
        }
        C44128b.m97266j("ProcessRebirthActivity", "Ready to restart main process: currentSiteType=" + SiteType.INSTANCE.getCurrentSiteType() + "，targetSite=" + SiteInfoManager.f47913a.m58110d() + " => " + Thread.currentThread());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C241721(getIntent().getStringExtra("app_rebirth_target_site"), this, getIntent().getIntExtra("app_rebirth_main_process_pid", -1), null), 3, null);
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.ProcessRebirthActivity$b */
    /* JADX INFO: compiled from: ProcessRebirthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/sdk/site/rebirth/ProcessRebirthActivity$onCreate$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24170b extends OnBackPressedCallback {
        public C24170b() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }
    }
}
