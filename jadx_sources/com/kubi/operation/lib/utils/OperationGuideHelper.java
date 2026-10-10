package com.kubi.operation.lib.utils;

import androidx.annotation.VisibleForTesting;
import com.kubi.operation.api.entity.WelfareGuideInfo;
import com.kubi.operation.lib.api.IGuidanceApi;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.math.BigDecimal;
import java.util.Arrays;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p808ys.InterfaceC46560a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: OperationGuideHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0007*\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/OperationGuideHelper;", "", "<init>", "()V", "TAG", "", "loadWelfareGuideInfo", "Lcom/kubi/operation/api/entity/WelfareGuideInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUserGuideInfo", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "toUserGuideInfo$OperationLib_googleRelease", "getWelfareGuideInfo", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOperationGuideHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationGuideHelper.kt\ncom/kubi/operation/lib/utils/OperationGuideHelper\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,82:1\n17#2,2:83\n*S KotlinDebug\n*F\n+ 1 OperationGuideHelper.kt\ncom/kubi/operation/lib/utils/OperationGuideHelper\n*L\n49#1:83,2\n*E\n"})
public final class OperationGuideHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OperationGuideHelper f36851a = new OperationGuideHelper();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m43650c(Continuation<? super WelfareGuideInfo> continuation) {
        OperationGuideHelper$loadWelfareGuideInfo$1 operationGuideHelper$loadWelfareGuideInfo$1;
        if (continuation instanceof OperationGuideHelper$loadWelfareGuideInfo$1) {
            operationGuideHelper$loadWelfareGuideInfo$1 = (OperationGuideHelper$loadWelfareGuideInfo$1) continuation;
            int i11 = operationGuideHelper$loadWelfareGuideInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationGuideHelper$loadWelfareGuideInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationGuideHelper$loadWelfareGuideInfo$1 = new OperationGuideHelper$loadWelfareGuideInfo$1(this, continuation);
            }
        } else {
            operationGuideHelper$loadWelfareGuideInfo$1 = new OperationGuideHelper$loadWelfareGuideInfo$1(this, continuation);
        }
        Object objM43283a = operationGuideHelper$loadWelfareGuideInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationGuideHelper$loadWelfareGuideInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43283a);
                IGuidanceApi iGuidanceApi = (IGuidanceApi) C42597a.m93388d().create(IGuidanceApi.class);
                operationGuideHelper$loadWelfareGuideInfo$1.label = 1;
                objM43283a = iGuidanceApi.m43283a(operationGuideHelper$loadWelfareGuideInfo$1);
                if (objM43283a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43283a);
            }
            return m43651d((WelfareTaskInfoEntity) objM43283a);
        } catch (Throwable th2) {
            C44128b.m97262f("OperationGuideHelper", "amount loader error", th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: d */
    public final WelfareGuideInfo m43651d(@NotNull WelfareTaskInfoEntity welfareTaskInfoEntity) {
        WelfareGuideInfo.GuideType guideType;
        String strM92640e;
        String str;
        String str2;
        String rewardText;
        String rewardValue;
        String amount;
        String rewardText2;
        Intrinsics.checkNotNullParameter(welfareTaskInfoEntity, "<this>");
        String taskType = welfareTaskInfoEntity.getTaskType();
        if (taskType == null) {
            guideType = WelfareGuideInfo.GuideType.None;
        } else {
            int iHashCode = taskType.hashCode();
            if (iHashCode != -2022530434) {
                guideType = iHashCode != -660133283 ? WelfareGuideInfo.GuideType.Kyc : WelfareGuideInfo.GuideType.Kyc;
            } else if (taskType.equals("DEPOSIT")) {
                guideType = WelfareGuideInfo.GuideType.Deposit;
            } else {
                guideType = WelfareGuideInfo.GuideType.None;
            }
        }
        WelfareGuideInfo.GuideType guideType2 = guideType;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46560a.class, SiteInfoManager.f47913a.m58109c());
        if (!(objM56186h != null ? ((InterfaceC46560a) objM56186h).m102716a() : true) || (rewardText = welfareTaskInfoEntity.getRewardText()) == null || rewardText.length() == 0 || (rewardValue = welfareTaskInfoEntity.getRewardValue()) == null || rewardValue.length() == 0 || (amount = welfareTaskInfoEntity.getAmount()) == null || amount.length() == 0) {
            strM92640e = null;
            str = null;
            str2 = null;
        } else {
            try {
                strM92640e = C42180b.m92640e(new BigDecimal(welfareTaskInfoEntity.getAmount()), null, 0, false, false, false, 0, null, 127, null);
                try {
                    rewardText2 = welfareTaskInfoEntity.getRewardText();
                    try {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str3 = String.format(StringsKt.replace$default(welfareTaskInfoEntity.getRewardValue(), "{num}", "%s", false, 4, (Object) null), Arrays.copyOf(new Object[]{strM92640e}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        str2 = rewardText2;
                        str = str3;
                    } catch (Exception e11) {
                        e = e11;
                        C44128b.m97263g("OperationGuideHelper", e);
                        str2 = rewardText2;
                        str = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    rewardText2 = null;
                }
            } catch (Exception e13) {
                e = e13;
                strM92640e = null;
                rewardText2 = null;
            }
        }
        return new WelfareGuideInfo(guideType2, welfareTaskInfoEntity.getTaskSubTitle(), strM92640e, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m43649b(@NotNull Continuation<? super WelfareGuideInfo> continuation) {
        return m43650c(continuation);
    }
}
