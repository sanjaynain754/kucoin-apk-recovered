package com.kubi.jsbridge.knb;

import android.content.Context;
import c00.InterfaceC4760g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.jsbridge.exception.WebBridgeException;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCHybridBridgePackage.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgePackage;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgePackageCall;", "<init>", "()V", "updatePackageVersion", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "version", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "Companion", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHybridBridgePackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgePackage.kt\ncom/kubi/jsbridge/knb/KCHybridBridgePackage\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,55:1\n47#2,4:56\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgePackage.kt\ncom/kubi/jsbridge/knb/KCHybridBridgePackage\n*L\n43#1:56,4\n*E\n"})
public final class KCHybridBridgePackage implements InterfaceC4760g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27483a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgePackage.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgePackage$Companion;", "", "<init>", "()V", "TAG", "", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.knb.KCHybridBridgePackage$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes17.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCHybridBridgePackage.kt\ncom/kubi/jsbridge/knb/KCHybridBridgePackage\n+ 3 KWebBridgeIssue.kt\ncom/kubi/jsbridge/exception/KWebBridgeIssueKt\n*L\n1#1,49:1\n43#2:50\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgePackage.kt\ncom/kubi/jsbridge/knb/KCHybridBridgePackage\n*L\n43#1:51,2\n*E\n"})
    public static final class C15274a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new WebBridgeException(exception, "HybridFuncHandler", false, null, 8, null), null, 2, null);
        }

        public C15274a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @Override // c00.InterfaceC4760g
    /* JADX INFO: renamed from: a */
    public void mo4807a(@NotNull Context ctx, @Nullable Object obj, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            String strM57715f = HybridPackageManager.f47391a.m57715f(ctx, str);
            if (VersionUtils.f47483a.m57851b(str2, strM57715f) <= 0) {
                C44128b.m97270n("KCHybridBridgePackage", "updateOfflinePackage " + str + " error " + str2 + " less " + strM57715f + ' ');
                callback.invoke(Boolean.FALSE, new ProtocolException("newVersion less currentVersion", null, null, false, 14, null));
                return;
            }
        }
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("hybridManualUpdate").plus(C42911a.m94120b()).plus(new C15274a(CoroutineExceptionHandler.INSTANCE))), null, null, new KCHybridBridgePackage$updatePackageVersion$1(str, str2, ctx, null), 3, null);
        callback.invoke(Boolean.TRUE, null);
    }
}
