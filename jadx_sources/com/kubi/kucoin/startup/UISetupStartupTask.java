package com.kubi.kucoin.startup;

import android.app.Application;
import android.content.Context;
import androidx.media3.common.MimeTypes;
import bw.C4719f0;
import com.blankj.utilcode.util.C5287o0;
import com.google.gson.reflect.TypeToken;
import com.kubi.app.startup.R$drawable;
import com.kubi.app.startup.R$id;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.data.AKuCoinMemoryProxy;
import com.kubi.kucoin.view.KuCoinRefreshHeader;
import com.kubi.resources.widget.flyco.CommonTabLayout;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27097w;
import com.kubi.utils.Condition;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38162f;
import java.lang.reflect.Type;
import jb0.InterfaceC40369c;
import org.jetbrains.annotations.NotNull;
import p445m2.AbstractC42400k;
import p569qq.C43846g;
import p694vk.C45592u;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UISetupStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/UISetupStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "ui_setup", priority = 200, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nUISetupStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UISetupStartupTask.kt\ncom/kubi/kucoin/startup/UISetupStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n35#2,4:93\n39#2:99\n44#3,2:97\n1#4:100\n*S KotlinDebug\n*F\n+ 1 UISetupStartupTask.kt\ncom/kubi/kucoin/startup/UISetupStartupTask\n*L\n44#1:93,4\n44#1:99\n44#1:97,2\n*E\n"})
public final class UISetupStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.UISetupStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15616a extends TypeToken<Condition> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC38160d run$lambda$0(Context context, InterfaceC38162f interfaceC38162f) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interfaceC38162f, "<unused var>");
        return new KuCoinRefreshHeader(context);
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(application, "application");
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new InterfaceC40369c() { // from class: com.kubi.kucoin.startup.k0
            @Override // jb0.InterfaceC40369c
            /* JADX INFO: renamed from: a */
            public final InterfaceC38160d mo32878a(Context context, InterfaceC38162f interfaceC38162f) {
                return UISetupStartupTask.run$lambda$0(context, interfaceC38162f);
            }
        });
        C27012a.m66486i().m66495j(application);
        AbstractC42400k.m93086l(R$id.glide_tag);
        C5287o0.m6332b(application);
        AKuCoinMemoryProxy.f27714d.create();
        C45592u.f102714a.m100685c(application);
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15616a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("fragment_state_condition", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Condition condition = (Condition) objM20457a;
        if (condition != null) {
            C27097w.f54454a.m66910b(condition);
        }
        CommonTabLayout.setMoreIconRes(R$drawable.kucoin_icon_triangle_right_mirrored);
        C4719f0.f4716a.m4770f(application);
    }
}
