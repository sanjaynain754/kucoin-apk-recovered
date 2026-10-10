package com.kubi.app.bizcontrol;

import com.blankj.utilcode.util.ThreadUtils;
import com.kubi.app.bizcontrol.p074ui.BizControlFailedDialog;
import com.kubi.app.bizcontrol.p074ui.KycBizControlDialog;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38058b;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import ro.C44128b;

/* JADX INFO: compiled from: BizControlService.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/app/bizcontrol/BizControlService;", "", "<init>", "()V", "EVENT_BIZ_CONTROL_LOAD", "", "showBizControlFailedDialog", "", "autoLoading", "", "showKycFetchDialog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchBizConfigWithLogin", "getBizRaw", "", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BizControlService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BizControlService f15438a = new BizControlService();

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14993f(BizControlService bizControlService, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        bizControlService.m14998e(z11);
    }

    /* JADX INFO: renamed from: g */
    public static final void m14994g(boolean z11) {
        BizControlFailedDialog bizControlFailedDialog = new BizControlFailedDialog(z11);
        bizControlFailedDialog.m54191p3();
        C42899b.m94076f(bizControlFailedDialog, "BizControlFailedDialog");
    }

    /* JADX INFO: renamed from: i */
    public static final void m14995i() {
        KycBizControlDialog kycBizControlDialog = new KycBizControlDialog();
        kycBizControlDialog.m54191p3();
        C42899b.m94076f(kycBizControlDialog, "KycBizControlDialog");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m14996c(@NotNull Continuation<? super Boolean> continuation) {
        BizControlService$fetchBizConfigWithLogin$1 bizControlService$fetchBizConfigWithLogin$1;
        if (continuation instanceof BizControlService$fetchBizConfigWithLogin$1) {
            bizControlService$fetchBizConfigWithLogin$1 = (BizControlService$fetchBizConfigWithLogin$1) continuation;
            int i11 = bizControlService$fetchBizConfigWithLogin$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bizControlService$fetchBizConfigWithLogin$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bizControlService$fetchBizConfigWithLogin$1 = new BizControlService$fetchBizConfigWithLogin$1(this, continuation);
            }
        } else {
            bizControlService$fetchBizConfigWithLogin$1 = new BizControlService$fetchBizConfigWithLogin$1(this, continuation);
        }
        Object objM85931c = bizControlService$fetchBizConfigWithLogin$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bizControlService$fetchBizConfigWithLogin$1.label;
        boolean z11 = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM85931c);
                C38058b c38058b = C38058b.f85672a;
                bizControlService$fetchBizConfigWithLogin$1.label = 1;
                objM85931c = c38058b.m85931c(bizControlService$fetchBizConfigWithLogin$1);
                if (objM85931c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM85931c);
            }
            boolean zBooleanValue = ((Boolean) objM85931c).booleanValue();
            if (!zBooleanValue && C38058b.f85672a.m85937i()) {
                m14993f(this, false, 1, null);
            }
            z11 = zBooleanValue;
        } catch (Exception e11) {
            C44128b.m97270n("BizControlService", "fetchBizConfigWithLogin " + e11);
        }
        return Boxing.boxBoolean(z11);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m14997d() {
        return C38058b.f85672a.m85932d();
    }

    /* JADX INFO: renamed from: e */
    public final void m14998e(final boolean z11) {
        ThreadUtils.m6114g(new Runnable() { // from class: com.kubi.app.bizcontrol.c
            @Override // java.lang.Runnable
            public final void run() {
                BizControlService.m14994g(z11);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m14999h(@NotNull Continuation<? super Unit> continuation) {
        if (C38058b.f85672a.m85937i()) {
            ThreadUtils.m6114g(new Runnable() { // from class: com.kubi.app.bizcontrol.d
                @Override // java.lang.Runnable
                public final void run() {
                    BizControlService.m14995i();
                }
            });
            return Unit.INSTANCE;
        }
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new BizControlService$showKycFetchDialog$2(null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }
}
