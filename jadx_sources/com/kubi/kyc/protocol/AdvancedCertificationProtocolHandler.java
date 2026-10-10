package com.kubi.kyc.protocol;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.sdk.BaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kn.C41076a;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdvancedCertificationProtocolHandler.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fJ4\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002J4\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002J$\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler;", "", "<init>", "()V", "TAG", "", "CHANNEL_JUMIO", "CHANNEL_SUMSUB", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "context", "Landroid/content/Context;", AppsFlyerProperties.CHANNEL, "data", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/kyc/protocol/AdvancedCertificationResult;", "openJumio", "openSumsub", "unsupported", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdvancedCertificationProtocolHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvancedCertificationProtocolHandler.kt\ncom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1#2:265\n*E\n"})
public final class AdvancedCertificationProtocolHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AdvancedCertificationProtocolHandler f31241a = new AdvancedCertificationProtocolHandler();

    /* JADX INFO: renamed from: c */
    public static final Unit m36845c(AtomicBoolean atomicBoolean, Function1 function1, AdvancedCertificationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (atomicBoolean.compareAndSet(false, true)) {
            function1.invoke(result);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m36846b(@NotNull Context context, @NotNull String channel, @NotNull String data, @NotNull final Function1<? super AdvancedCertificationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Function1<? super AdvancedCertificationResult, Unit> function1 = new Function1() { // from class: com.kubi.kyc.protocol.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedCertificationProtocolHandler.m36845c(atomicBoolean, callback, (AdvancedCertificationResult) obj);
            }
        };
        if (Intrinsics.areEqual(channel, "jumio")) {
            m36847d(context, channel, data, function1);
        } else if (Intrinsics.areEqual(channel, "sumsub")) {
            m36848e(context, channel, data, function1);
        } else {
            m36849f(context, function1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36847d(Context context, String str, String str2, Function1<? super AdvancedCertificationResult, Unit> function1) {
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new AdvancedCertificationProtocolHandler$openJumio$1(str2, str, function1, baseActivity, null), 3, null);
        } else {
            C41076a.f91293a.m90059a("-200000");
            function1.invoke(AdvancedCertificationResult.f31242e.failure("-200000", "activity is null"));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m36848e(Context context, String str, String str2, Function1<? super AdvancedCertificationResult, Unit> function1) {
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new AdvancedCertificationProtocolHandler$openSumsub$1(str2, str, function1, baseActivity, null), 3, null);
        } else {
            C41076a.f91293a.m90059a("-100000");
            function1.invoke(AdvancedCertificationResult.f31242e.failure("-100000", "activity is null"));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m36849f(Context context, Function1<? super AdvancedCertificationResult, Unit> function1) {
        Object objM103844constructorimpl;
        C41076a.f91293a.m90059a("-999999");
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                IKuFacadeService.f27711a.get().mo31924c(baseActivity);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Result.m103843boximpl(objM103844constructorimpl);
        }
        function1.invoke(AdvancedCertificationResult.f31242e.failure("-999999", "channel is not supported"));
    }
}
