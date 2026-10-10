package com.kubi.kucoin.main.knb;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.core.turbo.NativeLaunchTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.wallet.api.IWalletService;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.InterfaceC45265b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboLaunchImpl.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/main/knb/KCTurboLaunchImpl;", "Lcom/kubi/rn/core/turbo/NativeLaunchTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "enterHome", "", "mode", "(Ljava/lang/String;)Ljava/lang/Boolean;", "supportedModes", "", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeLaunchTurboModuleAbs.class})
public final class KCTurboLaunchImpl extends NativeLaunchTurboModuleAbs {

    @NotNull
    private final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboLaunchImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.TAG = "KCTurboLaunchImpl";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLaunchTurboModuleAbs
    @Nullable
    public Boolean enterHome(@NotNull String mode) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(mode, "mode");
        C44128b.m97266j(this.TAG, "enterHome start, mode=" + mode);
        try {
            Result.Companion companion = Result.INSTANCE;
            MviExKt.m42518n(new KCTurboLaunchImpl$enterHome$1$1(mode, this, null));
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97266j(this.TAG, "enterHome schedule error, mode=" + mode);
            objM103844constructorimpl = Boolean.FALSE;
        }
        return (Boolean) objM103844constructorimpl;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLaunchTurboModuleAbs
    @NotNull
    public List<String> supportedModes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Pro");
        if (((InterfaceC45265b) Router.f46192a.m56192n(InterfaceC45265b.class)).mo100052a()) {
            arrayList.add("Lite");
        }
        if (IWalletService.f54542a.get().mo66941a()) {
            arrayList.add("Web3");
        }
        return arrayList;
    }
}
