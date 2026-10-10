package com.kubi.flutter.widget.kline.utils;

import com.appsflyer.AppsFlyerProperties;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MethodChannelWrapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/MethodChannelWrapper;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "channelScope", "Lkotlinx/coroutines/CoroutineScope;", "close", "", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMethodChannelWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodChannelWrapper.kt\ncom/kubi/flutter/widget/kline/utils/MethodChannelWrapper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,43:1\n47#2,4:44\n*S KotlinDebug\n*F\n+ 1 MethodChannelWrapper.kt\ncom/kubi/flutter/widget/kline/utils/MethodChannelWrapper\n*L\n22#1:44,4\n*E\n"})
public final class MethodChannelWrapper {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f22485c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MethodChannel f22486a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41709m0 f22487b;

    /* JADX INFO: compiled from: MethodChannelWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/MethodChannelWrapper$Companion;", "", "<init>", "()V", "TAG", "", "METHOD_CHANNEL", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.utils.MethodChannelWrapper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MethodChannelWrapper.kt\ncom/kubi/flutter/widget/kline/utils/MethodChannelWrapper\n+ 3 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,49:1\n22#2:50\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 MethodChannelWrapper.kt\ncom/kubi/flutter/widget/kline/utils/MethodChannelWrapper\n*L\n22#1:51,4\n*E\n"})
    public static final class C12805a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C12805a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43043a.m94532c(exception, "MethodChannel exception");
            }
        }
    }

    public MethodChannelWrapper(@NotNull BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.kc.user");
        this.f22486a = methodChannel;
        this.f22487b = C41713n0.m91125a(new CoroutineName("KLineMethodChannel").plus(C42911a.m94120b()).plus(new C12805a(CoroutineExceptionHandler.INSTANCE)));
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: com.kubi.flutter.widget.kline.utils.i
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                MethodChannelWrapper.m24387b(this.f22496b, methodCall, result);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final void m24387b(MethodChannelWrapper methodChannelWrapper, MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (Intrinsics.areEqual(str, "techTrackError")) {
            C41696j.m91104d(methodChannelWrapper.f22487b, null, null, new MethodChannelWrapper$1$1(call, result, null), 3, null);
        } else if (Intrinsics.areEqual(str, "techTrackEvent")) {
            C41696j.m91104d(methodChannelWrapper.f22487b, null, null, new MethodChannelWrapper$1$2(call, result, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24388c() {
        C41713n0.m91129e(this.f22487b, null, 1, null);
    }
}
