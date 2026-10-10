package com.kubi.kumex;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.DataInitPlugins;
import com.kubi.data.IInterceptor;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.extensions.C27039d;
import fm.C37566a;
import org.jetbrains.annotations.NotNull;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: BKuMexStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/BKuMexStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "b_kumex", priority = 300, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Await)
public final class BKuMexStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kumex.BKuMexStartupTask$a */
    /* JADX INFO: compiled from: BKuMexStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/BKuMexStartupTask$run$1", "Lcom/kubi/data/IInterceptor;", "intercept", "", "symbol", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBKuMexStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BKuMexStartupTask.kt\ncom/kubi/kumex/BKuMexStartupTask$run$1\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,37:1\n16#2:38\n*S KotlinDebug\n*F\n+ 1 BKuMexStartupTask.kt\ncom/kubi/kumex/BKuMexStartupTask$run$1\n*L\n29#1:38\n*E\n"})
    public static final class C15764a implements IInterceptor {
        @Override // com.kubi.data.IInterceptor
        /* JADX INFO: renamed from: a */
        public Integer mo23682a(String symbol) {
            PropertyEntity properties;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Integer displayPrecision = null;
            if (!C37566a.m84610b(symbol)) {
                return null;
            }
            CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C37566a.m84609a(symbol), false, 2, null);
            if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
                displayPrecision = properties.getDisplayPrecision();
            }
            return Integer.valueOf(C27039d.m66651k(displayPrecision, 8));
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C46527h0.f104291a.m102679O();
        DataInitPlugins.f21489a.m23680a(new C15764a());
    }
}
