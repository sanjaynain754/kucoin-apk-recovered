package com.kubi.sdk.web.helper;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24334g;
import com.kubi.sdk.web.util.WebWhiteTool;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WritePageChecker.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/web/helper/WritePageChecker;", "", "Lcom/kubi/sdk/web/core/WebBridge;", "webBridge", "", "rateLimit", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;F)V", "Landroid/net/Uri;", "uri", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", Constants.BIZ, "", "code", "b", "(Ljava/lang/String;I)V", "Lcom/kubi/sdk/web/core/WebBridge;", "F", "c", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWritePageChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WritePageChecker.kt\ncom/kubi/sdk/web/helper/WritePageChecker\n+ 2 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,66:1\n74#2,12:67\n*S KotlinDebug\n*F\n+ 1 WritePageChecker.kt\ncom/kubi/sdk/web/helper/WritePageChecker\n*L\n59#1:67,12\n*E\n"})
public final class WritePageChecker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebBridge webBridge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float rateLimit;

    public WritePageChecker(@NotNull WebBridge webBridge, float f11) {
        Intrinsics.checkNotNullParameter(webBridge, "webBridge");
        this.webBridge = webBridge;
        this.rateLimit = f11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m58690a(@Nullable Uri uri, @NotNull Continuation<? super Unit> continuation) {
        WritePageChecker$checkWhitePage$1 writePageChecker$checkWhitePage$1;
        WritePageChecker writePageChecker;
        Uri uri2 = uri;
        if (continuation instanceof WritePageChecker$checkWhitePage$1) {
            writePageChecker$checkWhitePage$1 = (WritePageChecker$checkWhitePage$1) continuation;
            int i11 = writePageChecker$checkWhitePage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                writePageChecker$checkWhitePage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                writePageChecker$checkWhitePage$1 = new WritePageChecker$checkWhitePage$1(this, continuation);
            }
        } else {
            writePageChecker$checkWhitePage$1 = new WritePageChecker$checkWhitePage$1(this, continuation);
        }
        Object objM58853d = writePageChecker$checkWhitePage$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = writePageChecker$checkWhitePage$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM58853d);
                if (uri2 == null) {
                    return Unit.INSTANCE;
                }
                Context context = this.webBridge.getWebView().getContext();
                if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                    return Unit.INSTANCE;
                }
                WebWhiteTool webWhiteTool = WebWhiteTool.f48551a;
                KWebView webView = this.webBridge.getWebView();
                writePageChecker$checkWhitePage$1.L$0 = this;
                writePageChecker$checkWhitePage$1.L$1 = uri2;
                writePageChecker$checkWhitePage$1.label = 1;
                objM58853d = webWhiteTool.m58853d(webView, writePageChecker$checkWhitePage$1);
                if (objM58853d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                writePageChecker = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri2 = (Uri) writePageChecker$checkWhitePage$1.L$1;
                writePageChecker = (WritePageChecker) writePageChecker$checkWhitePage$1.L$0;
                ResultKt.throwOnFailure(objM58853d);
            }
            WebWhiteTool.C24325a c24325a = (WebWhiteTool.C24325a) objM58853d;
            if (c24325a == null) {
                return Unit.INSTANCE;
            }
            String str = uri2 + " checkWhitePage Rate:" + c24325a;
            String str2 = "other";
            if (!WebWhiteTool.f48551a.m58856g()) {
                C24329b.m58861c(C24329b.f48558a, "whiteScreenCheck", "internet not work uri:[" + str + ']', null, 4, null);
                String strM58702a = C24308d.m58702a(uri2);
                if (strM58702a != null) {
                    str2 = strM58702a;
                }
                writePageChecker.m58691b(str2, 2);
            } else if (c24325a.getRate() < writePageChecker.rateLimit) {
                String strM58702a2 = C24308d.m58702a(uri2);
                if (strM58702a2 != null) {
                    str2 = strM58702a2;
                }
                writePageChecker.m58691b(str2, 0);
                C24329b.f48558a.m58864d("whiteScreenCheck", str);
            } else {
                String strM58702a3 = C24308d.m58702a(uri2);
                if (strM58702a3 != null) {
                    str2 = strM58702a3;
                }
                writePageChecker.m58691b(str2, 1);
                C24329b.m58861c(C24329b.f48558a, "whiteScreenCheck", str, null, 4, null);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            C24329b.f48558a.m58863b("whiteScreenCheck", "checkWhitePage error", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58691b(String biz, int code) {
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_H5PAGE_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("path", C24334g.f48568a.m58881a(biz));
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
}
