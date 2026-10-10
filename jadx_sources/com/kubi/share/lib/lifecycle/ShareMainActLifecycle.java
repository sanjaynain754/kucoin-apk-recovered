package com.kubi.share.lib.lifecycle;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.utils.C27100x0;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import ky.InterfaceC42005d;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ShareMainActLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/share/lib/lifecycle/ShareMainActLifecycle;", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "()V", "hasObserveLoginInfo", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "registerLanguageObserver", "Landroidx/fragment/app/FragmentActivity;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ShareMainActLifecycle implements InterfaceC42005d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicBoolean f49390a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.share.lib.lifecycle.ShareMainActLifecycle$a */
    /* JADX INFO: compiled from: ShareMainActLifecycle.kt */
    /* JADX INFO: loaded from: classes46.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/share/lib/lifecycle/ShareMainActLifecycle$registerLanguageObserver$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onDestroy", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24570a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C24571b f49391b;

        public C24570a(C24571b c24571b) {
            this.f49391b = c24571b;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            MultiLanguageManager.f46805a.removeOnLanguageChangeListener(this.f49391b);
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.lifecycle.ShareMainActLifecycle$b */
    /* JADX INFO: compiled from: ShareMainActLifecycle.kt */
    /* JADX INFO: loaded from: classes46.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/share/lib/lifecycle/ShareMainActLifecycle$registerLanguageObserver$listener$1", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24571b implements MultiLanguageManager.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FragmentActivity f49392a;

        public C24571b(FragmentActivity fragmentActivity) {
            this.f49392a = fragmentActivity;
        }

        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            final FragmentActivity fragmentActivity = this.f49392a;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.lifecycle.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMainActLifecycle.C24571b.m59718b(fragmentActivity);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m59718b(FragmentActivity fragmentActivity) {
            ShareMainActLifecycleKt.m59719a(LifecycleOwnerKt.getLifecycleScope(fragmentActivity));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.lifecycle.ShareMainActLifecycle$onActivityCreated$2 */
    /* JADX INFO: compiled from: ShareMainActLifecycle.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.share.lib.lifecycle.ShareMainActLifecycle$onActivityCreated$2", m90122f = "ShareMainActLifecycle.kt", m90123i = {0}, m90124l = {52}, m90125m = "invokeSuspend", m90126n = {"$this$launchWhenStarted"}, m90127s = {"L$0"})
    public static final class C245722 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C245722(Continuation<? super C245722> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245722 c245722 = new C245722(continuation);
            c245722.L$0 = obj;
            return c245722;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245722) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                this.L$0 = interfaceC41709m0;
                this.label = 1;
                if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ShareMainActLifecycleKt.m59719a(interfaceC41709m0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m59713d(final Activity activity, AccountEventState accountEventState) {
        C44128b.m97266j("ShareMainActLifecycle", "userInfo accountEventStateObs, isLogin=refreshReferral");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.lifecycle.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareMainActLifecycle.m59714e(activity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final Unit m59714e(Activity activity) {
        ShareMainActLifecycleKt.m59719a(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m59716g(FragmentActivity fragmentActivity) {
        C24571b c24571b = new C24571b(fragmentActivity);
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(c24571b);
        fragmentActivity.getLifecycle().addObserver(new C24570a(c24571b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ky.InterfaceC42005d
    @SuppressLint({"CheckResult"})
    public void onActivityCreated(@NotNull final Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityCreated(activity, savedInstanceState);
        if ((activity instanceof IMainActivity) && (activity instanceof FragmentActivity)) {
            if (this.f49390a.compareAndSet(false, true)) {
                Observable observableA = UserInfo.a.a();
                final Function1 function1 = new Function1() { // from class: com.kubi.share.lib.lifecycle.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShareMainActLifecycle.m59713d(activity, (AccountEventState) obj);
                    }
                };
                observableA.subscribe(new Consumer() { // from class: com.kubi.share.lib.lifecycle.b
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ShareMainActLifecycle.m59715f(function1, obj);
                    }
                });
            }
            m59716g((FragmentActivity) activity);
            LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity).launchWhenStarted(new C245722(null));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m59715f(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
