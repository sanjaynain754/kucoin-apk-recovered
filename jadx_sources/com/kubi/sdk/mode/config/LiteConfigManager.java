package com.kubi.sdk.mode.config;

import com.kubi.sdk.mode.config.data.LiteConfigEntity;
import com.kubi.sdk.mode.exception.modeConfigException;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p578qz.C43888a;
import p578qz.InterfaceC43889b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import tz.C45079a;
import y70.C46392a;

/* JADX INFO: compiled from: LiteConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/mode/config/LiteConfigManager;", "", "<init>", "()V", "TAG", "", "api", "Lcom/kubi/sdk/mode/config/data/LiteConfigApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/sdk/mode/config/data/LiteConfigApi;", "api$delegate", "Lkotlin/Lazy;", "_popupEnabled", "", "popupEnabled", "getPopupEnabled", "()Z", "fetchLiteConfig", "Lkotlin/Result;", "", "fetchLiteConfig-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLiteRemoteEnabled", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteConfigManager.kt\ncom/kubi/sdk/mode/config/LiteConfigManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 ConfigIssue.kt\ncom/kubi/sdk/mode/exception/ConfigIssueKt\n*L\n1#1,46:1\n126#2,2:47\n136#2:52\n136#2:53\n39#3,3:49\n*S KotlinDebug\n*F\n+ 1 LiteConfigManager.kt\ncom/kubi/sdk/mode/config/LiteConfigManager\n*L\n33#1:47,2\n43#1:52\n44#1:53\n37#1:49,3\n*E\n"})
public final class LiteConfigManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiteConfigManager f47070a = new LiteConfigManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f47071b = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.mode.config.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteConfigManager.m57258b();
        }
    });

    /* JADX INFO: renamed from: c */
    public static boolean f47072c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m57259c(@NotNull Continuation<? super Result<Unit>> continuation) {
        LiteConfigManager$fetchLiteConfig$1 liteConfigManager$fetchLiteConfig$1;
        Object objM103844constructorimpl;
        Boolean popupEnabled;
        Boolean liteEnabled;
        if (continuation instanceof LiteConfigManager$fetchLiteConfig$1) {
            liteConfigManager$fetchLiteConfig$1 = (LiteConfigManager$fetchLiteConfig$1) continuation;
            int i11 = liteConfigManager$fetchLiteConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liteConfigManager$fetchLiteConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liteConfigManager$fetchLiteConfig$1 = new LiteConfigManager$fetchLiteConfig$1(this, continuation);
            }
        } else {
            liteConfigManager$fetchLiteConfig$1 = new LiteConfigManager$fetchLiteConfig$1(this, continuation);
        }
        Object objM96659a = liteConfigManager$fetchLiteConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liteConfigManager$fetchLiteConfig$1.label;
        boolean zBooleanValue = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM96659a);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC43889b interfaceC43889bM57260d = m57260d();
                liteConfigManager$fetchLiteConfig$1.L$0 = this;
                liteConfigManager$fetchLiteConfig$1.I$0 = 0;
                liteConfigManager$fetchLiteConfig$1.label = 1;
                objM96659a = interfaceC43889bM57260d.m96659a(liteConfigManager$fetchLiteConfig$1);
                if (objM96659a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM96659a);
            }
            LiteConfigEntity liteConfigEntity = (LiteConfigEntity) ((C43888a) objM96659a).m96658a();
            if (liteConfigEntity != null && (liteEnabled = liteConfigEntity.getLiteEnabled()) != null) {
                C46392a.m102328k(C45079a.f101482a.m99688b(), liteEnabled.booleanValue());
            }
            if (liteConfigEntity != null && (popupEnabled = liteConfigEntity.getPopupEnabled()) != null) {
                zBooleanValue = popupEnabled.booleanValue();
            }
            f47072c = zBooleanValue;
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g("LiteConfigManager", thM103847exceptionOrNullimpl);
            C43846g.m96568c(new modeConfigException(thM103847exceptionOrNullimpl, "LiteConfigManager", false, null, 8, null), null, 2, null);
            C44128b.m97270n("LiteConfigManager", "load lite config error: " + thM103847exceptionOrNullimpl.getMessage());
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC43889b m57260d() {
        return (InterfaceC43889b) f47071b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m57261e() {
        return f47072c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57262f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isLiteRemoteEnabled: ");
        C45079a c45079a = C45079a.f101482a;
        sb2.append(C46392a.m102322d(c45079a.m99688b(), false));
        C44128b.m97266j("LiteConfigManager", sb2.toString());
        return C46392a.m102322d(c45079a.m99688b(), false);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC43889b m57258b() {
        return (InterfaceC43889b) C42597a.m93386b().create(InterfaceC43889b.class);
    }
}
