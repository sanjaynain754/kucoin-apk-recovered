package com.kubi.sdk.pkg.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.WhiteCheckTool;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RnWritePageChecker.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/pkg/helper/RnWritePageChecker;", "", "", "rnRateLimit", "<init>", "(F)V", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "rnView", "", Constants.BIZ, "Lcom/kubi/sdk/pkg/helper/WhitePageCode;", "b", "(Landroid/view/View;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "code", "d", "(Ljava/lang/String;I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "F", "Lcom/kubi/sdk/pkg/util/WhiteCheckTool;", "Lcom/kubi/sdk/pkg/util/WhiteCheckTool;", "whiteCheckTool", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnWritePageChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnWritePageChecker.kt\ncom/kubi/sdk/pkg/helper/RnWritePageChecker\n+ 2 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,67:1\n74#2,12:68\n*S KotlinDebug\n*F\n+ 1 RnWritePageChecker.kt\ncom/kubi/sdk/pkg/helper/RnWritePageChecker\n*L\n61#1:68,12\n*E\n"})
public final class RnWritePageChecker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float rnRateLimit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WhiteCheckTool whiteCheckTool = new WhiteCheckTool();

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m57704b(@NotNull View view, @NotNull String str, @NotNull Continuation<? super WhitePageCode> continuation) {
        RnWritePageChecker$checkWhitePage$1 rnWritePageChecker$checkWhitePage$1;
        WhitePageCode whitePageCode;
        Object objM57857d;
        RnWritePageChecker rnWritePageChecker;
        String str2 = str;
        if (continuation instanceof RnWritePageChecker$checkWhitePage$1) {
            rnWritePageChecker$checkWhitePage$1 = (RnWritePageChecker$checkWhitePage$1) continuation;
            int i11 = rnWritePageChecker$checkWhitePage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rnWritePageChecker$checkWhitePage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rnWritePageChecker$checkWhitePage$1 = new RnWritePageChecker$checkWhitePage$1(this, continuation);
            }
        } else {
            rnWritePageChecker$checkWhitePage$1 = new RnWritePageChecker$checkWhitePage$1(this, continuation);
        }
        Object obj = rnWritePageChecker$checkWhitePage$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rnWritePageChecker$checkWhitePage$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (str2 == null || str2.length() == 0) {
                    return WhitePageCode.NOT_WHITEPAGE_CODE;
                }
                Context context = view.getContext();
                if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                    return WhitePageCode.NOT_WHITEPAGE_CODE;
                }
                whitePageCode = WhitePageCode.NOT_WHITEPAGE_CODE;
                WhiteCheckTool whiteCheckTool = this.whiteCheckTool;
                rnWritePageChecker$checkWhitePage$1.L$0 = this;
                rnWritePageChecker$checkWhitePage$1.L$1 = str2;
                rnWritePageChecker$checkWhitePage$1.L$2 = whitePageCode;
                rnWritePageChecker$checkWhitePage$1.label = 1;
                objM57857d = whiteCheckTool.m57857d(view, rnWritePageChecker$checkWhitePage$1);
                if (objM57857d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rnWritePageChecker = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                WhitePageCode whitePageCode2 = (WhitePageCode) rnWritePageChecker$checkWhitePage$1.L$2;
                String str3 = (String) rnWritePageChecker$checkWhitePage$1.L$1;
                RnWritePageChecker rnWritePageChecker2 = (RnWritePageChecker) rnWritePageChecker$checkWhitePage$1.L$0;
                ResultKt.throwOnFailure(obj);
                whitePageCode = whitePageCode2;
                str2 = str3;
                rnWritePageChecker = rnWritePageChecker2;
                objM57857d = obj;
            }
            WhiteCheckTool.C23981a c23981a = (WhiteCheckTool.C23981a) objM57857d;
            if (c23981a == null) {
                return whitePageCode;
            }
            String str4 = str2 + " checkWhitePage Rate:" + c23981a;
            if (rnWritePageChecker.whiteCheckTool.getIsNetworkAvailable()) {
                if (c23981a.getRate() < rnWritePageChecker.rnRateLimit) {
                    WhitePageCode whitePageCode3 = WhitePageCode.NOT_WHITEPAGE_CODE;
                    rnWritePageChecker.m57706d(str2, whitePageCode3.getCode());
                    C23985b.f47489a.m57877e("rnWhiteScreenCheck", str4);
                    return whitePageCode3;
                }
                WhitePageCode whitePageCode4 = WhitePageCode.WHITEPAGE_CODE;
                rnWritePageChecker.m57706d(str2, whitePageCode4.getCode());
                C23985b.m57873d(C23985b.f47489a, "rnWhiteScreenCheck", str4, null, 4, null);
                return whitePageCode4;
            }
            C23985b.m57873d(C23985b.f47489a, "rnWhiteScreenCheck", "internet not work uri:[" + str4 + ']', null, 4, null);
            WhitePageCode whitePageCode5 = WhitePageCode.INTERNET_NOT_WORK;
            rnWritePageChecker.m57706d(str2, whitePageCode5.getCode());
            return whitePageCode5;
        } catch (Throwable th2) {
            C23985b.f47489a.m57876c("rnWhiteScreenCheck", "checkWhitePage error", th2);
            return WhitePageCode.NOT_WHITEPAGE_CODE;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57706d(String biz, int code) {
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_RNPAGE_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("category", "white_page");
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
        }
    }

    public RnWritePageChecker(float f11) {
        this.rnRateLimit = f11;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m57705c(@NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new RnWritePageChecker$initNetworkAailable$2(this, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
