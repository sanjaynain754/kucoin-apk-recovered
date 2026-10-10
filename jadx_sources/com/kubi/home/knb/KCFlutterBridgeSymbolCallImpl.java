package com.kubi.home.knb;

import android.content.Context;
import b00.InterfaceC4421f0;
import com.kubi.home.exception.HomeException;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
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

/* JADX INFO: compiled from: KCFlutterBridgeSymbolCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\fH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSymbolCall;", "<init>", "()V", "getCoinIconUrl", "", "ctx", "Landroid/content/Context;", "symbol", "", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeSymbolCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeSymbolCallImpl.kt\ncom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,59:1\n47#2,4:60\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeSymbolCallImpl.kt\ncom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl\n*L\n44#1:60,4\n*E\n"})
public final class KCFlutterBridgeSymbolCallImpl implements InterfaceC4421f0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25705a = new Companion(null);

    /* JADX INFO: compiled from: KCFlutterBridgeSymbolCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl$Companion;", "", "<init>", "()V", "TAG", "", "noNullInt", "", "", "(Ljava/lang/Integer;)J", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final long noNullInt(@Nullable Integer num) {
            if (num != null) {
                return num.intValue();
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.knb.KCFlutterBridgeSymbolCallImpl$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCFlutterBridgeSymbolCallImpl.kt\ncom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,49:1\n45#2:50\n46#2:53\n47#3,2:51\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeSymbolCallImpl.kt\ncom/kubi/home/knb/KCFlutterBridgeSymbolCallImpl\n*L\n45#1:51,2\n*E\n"})
    public static final class C14588a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new HomeException(exception, "KCFlutterBridgeSymbolCallImpl", false, null, 8, null), null, 2, null);
        }

        public C14588a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @Override // b00.InterfaceC4421f0
    /* JADX INFO: renamed from: a */
    public void mo4125a(@NotNull Context ctx, @NotNull List<String> symbol, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97266j("KCFlutterBridgeSymbolCallImpl", "symbol=" + symbol);
        C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b().plus(new C14588a(CoroutineExceptionHandler.INSTANCE))), null, null, new KCFlutterBridgeSymbolCallImpl$getCoinIconUrl$2(symbol, callback, null), 3, null);
    }
}
