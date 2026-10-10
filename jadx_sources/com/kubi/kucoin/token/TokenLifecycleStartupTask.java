package com.kubi.kucoin.token;

import android.app.Activity;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import com.kubi.user.model.LoginUserEntity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p351iy.C40192c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: TokenLifecycleStartupTask.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "token-lifecycle", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Main)
public final class TokenLifecycleStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleStartupTask$b */
    /* JADX INFO: compiled from: TokenLifecycleStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/token/TokenLifecycleStartupTask$run$5", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15667b implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            C44128b.m97261e("TokenLifecycle", "App entered foreground; triggering token lifecycle check");
            TokenLifecycleManager.f28424a.m32931W();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.TokenLifecycleStartupTask$a */
    /* JADX INFO: compiled from: TokenLifecycleStartupTask.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15666a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountState.values().length];
            try {
                iArr[AccountState.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountState.SwitchAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountState.Logout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(LoginUserEntity loginUserEntity) {
        TokenLifecycleManager tokenLifecycleManager = TokenLifecycleManager.f28424a;
        Intrinsics.checkNotNull(loginUserEntity);
        tokenLifecycleManager.m32932X(loginUserEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(Throwable th2) {
        C44128b.m97261e("TokenLifecycle", "observe user info failed: " + th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$6(Throwable th2) {
        C44128b.m97261e("TokenLifecycle", "observe account state failed: " + th2);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (!C40192c.f89321a.m88545g()) {
            C44128b.m97261e("TokenLifecycle", "Token lifecycle master switch disabled; lifecycle listeners not registered");
            return;
        }
        C44128b.m97261e("TokenLifecycle", "Initializing token lifecycle startup task");
        TokenLifecycleManager.f28424a.m32919K();
        UserInfo userInfo = UserInfo.a;
        Observable observableJ = userInfo.j();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.token.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TokenLifecycleStartupTask.run$lambda$0((LoginUserEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.token.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.token.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TokenLifecycleStartupTask.run$lambda$2((Throwable) obj);
            }
        };
        observableJ.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.token.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Observable observableA = userInfo.a();
        final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.token.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TokenLifecycleStartupTask.run$lambda$4((AccountEventState) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.kucoin.token.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kucoin.token.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TokenLifecycleStartupTask.run$lambda$6((Throwable) obj);
            }
        };
        observableA.subscribe(consumer2, new Consumer() { // from class: com.kubi.kucoin.token.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function4.invoke(obj);
            }
        });
        C5264d.registerAppStatusChangedListener(new C15667b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$4(AccountEventState accountEventState) {
        int i11;
        AccountState state = accountEventState.getState();
        if (state == null) {
            i11 = -1;
        } else {
            i11 = C15666a.$EnumSwitchMapping$0[state.ordinal()];
        }
        if (i11 != -1) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    C44128b.m97261e("TokenLifecycle", "Account logged out; clearing token lifecycle state");
                    TokenLifecycleManager.f28424a.m32951x();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                C44128b.m97261e("TokenLifecycle", "Account state changed; re-anchoring token, state=" + accountEventState.getState());
                TokenLifecycleManager.f28424a.m32919K();
            }
        }
        return Unit.INSTANCE;
    }
}
