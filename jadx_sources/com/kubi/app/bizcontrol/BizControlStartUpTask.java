package com.kubi.app.bizcontrol;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.BaseConstants;
import com.kubi.sdk.lib.kucoin.biz.control.BizControlImpl;
import com.kubi.sdk.site.C24137e;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p294gz.C38058b;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: BizControlStartUpTask.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/app/bizcontrol/BizControlStartUpTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "biz_control", priority = 0, stepType = StartupStepType.PreFirstPage, threadType = StartupThreadType.Await)
@SourceDebugExtension({"SMAP\nBizControlStartUpTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlStartUpTask.kt\ncom/kubi/app/bizcontrol/BizControlStartUpTask\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,53:1\n136#2:54\n*S KotlinDebug\n*F\n+ 1 BizControlStartUpTask.kt\ncom/kubi/app/bizcontrol/BizControlStartUpTask\n*L\n45#1:54\n*E\n"})
public final class BizControlStartUpTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0() {
        C38058b c38058b = C38058b.f85672a;
        c38058b.m85940l(!C46392a.m102322d(BaseConstants.f46539a.m56609b(), false));
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        c38058b.m85938j(strH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$1(LoginUserEntity loginUserEntity) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("userInfo userInfoObs, update uid=");
        UserInfo userInfo = UserInfo.a;
        sb2.append(userInfo.h());
        C44128b.m97266j("BizControlStartUpTask", sb2.toString());
        C38058b c38058b = C38058b.f85672a;
        String strH = userInfo.h();
        if (strH == null) {
            strH = "";
        }
        c38058b.m85941m(strH);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C43841b.m96557d("EVENT_BIZ_CONTROL_LOAD", "page_load_start", null, 4, null);
        C38058b c38058b = C38058b.f85672a;
        BizControlImpl bizControlImpl = new BizControlImpl();
        SiteType.Companion companion = SiteType.INSTANCE;
        c38058b.m85936h(bizControlImpl, application, companion.getCurrentSiteType(), C24137e.m58087a(companion.getCurrentSiteType()));
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.app.bizcontrol.e
            @Override // java.lang.Runnable
            public final void run() {
                BizControlStartUpTask.run$lambda$0();
            }
        });
        Observable observableJ = UserInfo.a.j();
        final Function1 function1 = new Function1() { // from class: com.kubi.app.bizcontrol.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BizControlStartUpTask.run$lambda$1((LoginUserEntity) obj);
            }
        };
        observableJ.subscribe(new Consumer() { // from class: com.kubi.app.bizcontrol.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
    }
}
