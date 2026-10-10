package com.kubi.p072ad.service;

import ca.InterfaceC4919b;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.InterfaceC45268e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PrivacyCheckSPI.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/ad/service/PrivacyCheckSPI;", "Lcom/kubi/launch/spi/IPrivacyCheckSPI;", "<init>", "()V", "privacyCheck", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyCheckSPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyCheckSPI.kt\ncom/kubi/ad/service/PrivacyCheckSPI\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,25:1\n17#2,2:26\n*S KotlinDebug\n*F\n+ 1 PrivacyCheckSPI.kt\ncom/kubi/ad/service/PrivacyCheckSPI\n*L\n21#1:26,2\n*E\n"})
public final class PrivacyCheckSPI implements InterfaceC45268e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Override // p668un.InterfaceC45268e
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo14654a(@NotNull BaseActivity baseActivity, @NotNull Continuation<? super Boolean> continuation) {
        PrivacyCheckSPI$privacyCheck$1 privacyCheckSPI$privacyCheck$1;
        if (continuation instanceof PrivacyCheckSPI$privacyCheck$1) {
            privacyCheckSPI$privacyCheck$1 = (PrivacyCheckSPI$privacyCheck$1) continuation;
            int i11 = privacyCheckSPI$privacyCheck$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                privacyCheckSPI$privacyCheck$1.label = i11 - Integer.MIN_VALUE;
            } else {
                privacyCheckSPI$privacyCheck$1 = new PrivacyCheckSPI$privacyCheck$1(this, continuation);
            }
        } else {
            privacyCheckSPI$privacyCheck$1 = new PrivacyCheckSPI$privacyCheck$1(this, continuation);
        }
        Object objM14697b = privacyCheckSPI$privacyCheck$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = privacyCheckSPI$privacyCheck$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM14697b);
                return Boxing.boxBoolean(((Boolean) objM14697b).booleanValue());
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM14697b);
            return Boxing.boxBoolean(((Boolean) objM14697b).booleanValue());
        }
        ResultKt.throwOnFailure(objM14697b);
        C44128b.m97259c("StartupDispatcher", "checkGuide");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4919b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            InterfaceC4919b interfaceC4919b = (InterfaceC4919b) objM56186h;
            privacyCheckSPI$privacyCheck$1.L$0 = baseActivity;
            privacyCheckSPI$privacyCheck$1.L$1 = SpillingKt.nullOutSpilledVariable(objM56186h);
            privacyCheckSPI$privacyCheck$1.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC4919b);
            privacyCheckSPI$privacyCheck$1.I$0 = 0;
            privacyCheckSPI$privacyCheck$1.I$1 = 0;
            privacyCheckSPI$privacyCheck$1.label = 1;
            objM14697b = interfaceC4919b.m5144a(baseActivity, privacyCheckSPI$privacyCheck$1);
        } else {
            privacyCheckSPI$privacyCheck$1.L$0 = SpillingKt.nullOutSpilledVariable(baseActivity);
            privacyCheckSPI$privacyCheck$1.L$1 = SpillingKt.nullOutSpilledVariable(objM56186h);
            privacyCheckSPI$privacyCheck$1.L$2 = null;
            privacyCheckSPI$privacyCheck$1.I$0 = 0;
            privacyCheckSPI$privacyCheck$1.I$1 = 0;
            privacyCheckSPI$privacyCheck$1.label = 2;
            objM14697b = C9336k.m14697b(baseActivity, privacyCheckSPI$privacyCheck$1);
        }
        return coroutine_suspended;
    }
}
