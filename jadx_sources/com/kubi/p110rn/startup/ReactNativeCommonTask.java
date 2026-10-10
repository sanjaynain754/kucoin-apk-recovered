package com.kubi.p110rn.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReactNativeComomTask.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\t"}, m90084d2 = {"Lcom/kubi/rn/startup/ReactNativeCommonTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "react_native_common", stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nReactNativeComomTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeComomTask.kt\ncom/kubi/rn/startup/ReactNativeCommonTask\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,66:1\n106#2,2:67\n*S KotlinDebug\n*F\n+ 1 ReactNativeComomTask.kt\ncom/kubi/rn/startup/ReactNativeCommonTask\n*L\n45#1:67,2\n*E\n"})
public final class ReactNativeCommonTask implements IStartupTask {

    @Deprecated
    @NotNull
    public static final String ON_HIDE_ASSETS_EYE_STATUS_CHANGE = "onHideAssetsEyeStatusChange";

    @Nullable
    private static InterfaceC41775x1 hideAssetsEyeStatusJob;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final InterfaceC41709m0 commonEventScope = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94119a()));

    /* JADX INFO: compiled from: ReactNativeComomTask.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/rn/startup/ReactNativeCommonTask$Companion;", "", "<init>", "()V", "ON_HIDE_ASSETS_EYE_STATUS_CHANGE", "", "commonEventScope", "Lkotlinx/coroutines/CoroutineScope;", "getCommonEventScope", "()Lkotlinx/coroutines/CoroutineScope;", "hideAssetsEyeStatusJob", "Lkotlinx/coroutines/Job;", "getHideAssetsEyeStatusJob", "()Lkotlinx/coroutines/Job;", "setHideAssetsEyeStatusJob", "(Lkotlinx/coroutines/Job;)V", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final InterfaceC41709m0 getCommonEventScope() {
            return ReactNativeCommonTask.commonEventScope;
        }

        @Nullable
        public final InterfaceC41775x1 getHideAssetsEyeStatusJob() {
            return ReactNativeCommonTask.hideAssetsEyeStatusJob;
        }

        public final void setHideAssetsEyeStatusJob(@Nullable InterfaceC41775x1 interfaceC41775x1) {
            ReactNativeCommonTask.hideAssetsEyeStatusJob = interfaceC41775x1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(LoginUserEntity loginUserEntity) {
        IReactNativeService.INSTANCE.get().nativeNotifyRn("onUserinfoChange", MapsKt.hashMapOf(TuplesKt.m90091to("updateUserInfo", Boolean.TRUE)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(Boolean bool) {
        IReactNativeService.INSTANCE.get().nativeNotifyRn("onLoginStateChange", MapsKt.hashMapOf(TuplesKt.m90091to("isLogin", Boolean.valueOf(UserInfo.a.n()))));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        UserInfo userInfo = UserInfo.a;
        Observable observableJ = userInfo.j();
        final Function1 function1 = new Function1() { // from class: com.kubi.rn.startup.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactNativeCommonTask.run$lambda$0((LoginUserEntity) obj);
            }
        };
        observableJ.subscribe(new Consumer() { // from class: com.kubi.rn.startup.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Observable observableE = userInfo.e();
        final Function1 function2 = new Function1() { // from class: com.kubi.rn.startup.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactNativeCommonTask.run$lambda$2((Boolean) obj);
            }
        };
        observableE.subscribe(new Consumer() { // from class: com.kubi.rn.startup.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        InterfaceC41775x1 interfaceC41775x1 = hideAssetsEyeStatusJob;
        if (interfaceC41775x1 == null || !interfaceC41775x1.isActive()) {
            InterfaceC41709m0 interfaceC41709m0 = commonEventScope;
            if (C12573b.f21598a.m23696a()) {
                "hide_asset".length();
            }
            hideAssetsEyeStatusJob = C12572a.m23693b(interfaceC41709m0, new ReactNativeCommonTask$run$$inlined$bindFlowEvent$1("hide_asset", null));
        }
    }
}
