package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.network.encryption.KNetworkEncryptConfig;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NetworkEncryptionStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/startup/NetworkEncryptionStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "network_encryption", priority = 101, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nNetworkEncryptionStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkEncryptionStartupTask.kt\ncom/kubi/kucoin/startup/NetworkEncryptionStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,54:1\n35#2,4:55\n39#2:61\n44#3,2:59\n*S KotlinDebug\n*F\n+ 1 NetworkEncryptionStartupTask.kt\ncom/kubi/kucoin/startup/NetworkEncryptionStartupTask\n*L\n31#1:55,4\n31#1:61\n31#1:59,2\n*E\n"})
public final class NetworkEncryptionStartupTask implements IStartupTask {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "AccountContextSwitch";

    /* JADX INFO: compiled from: NetworkEncryptionStartupTask.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/startup/NetworkEncryptionStartupTask$Companion;", "", "<init>", "()V", "TAG", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.NetworkEncryptionStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15607a extends TypeToken<KNetworkEncryptionConfig> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$0() {
        if (UserInfo.a.n()) {
            return UserInfo.c().uid;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(AccountEventState accountEventState) {
        C44128b.m97266j("AccountContextSwitch", "refresh network encryption key, state=" + accountEventState.getState() + ", oldUid=" + accountEventState.getPreUid());
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kucoin.startup.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkEncryptionStartupTask.run$lambda$2$lambda$1();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2$lambda$1() {
        com.kubi.network.encryption.a.a.b(true);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15607a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_network_encryption_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        KNetworkEncryptionConfig kNetworkEncryptionConfig = (KNetworkEncryptionConfig) objM20457a;
        com.kubi.network.encryption.a.c(new KNetworkEncryptConfig.Builder().d(C27025c.m66567e(kNetworkEncryptionConfig != null ? kNetworkEncryptionConfig.getEncryptEnable() : null, false)).b(C27025c.m66567e(kNetworkEncryptionConfig != null ? kNetworkEncryptionConfig.getAllowDiskCache() : null, false)).c(C27039d.m66651k(kNetworkEncryptionConfig != null ? kNetworkEncryptionConfig.getAllowMaxTtl() : null, Integer.MAX_VALUE)).e(new Function0() { // from class: com.kubi.kucoin.startup.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkEncryptionStartupTask.run$lambda$0();
            }
        }).a(C42597a.m93391g()));
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkEncryptionStartupTask.run$lambda$2((AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: com.kubi.kucoin.startup.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
    }
}
