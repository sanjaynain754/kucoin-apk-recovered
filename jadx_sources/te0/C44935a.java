package te0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import dev.fluttercommunity.plus.share.ShareSuccessManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: te0.a */
/* JADX INFO: compiled from: MethodCallHandler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lte0/a;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lte0/d;", FirebaseAnalytics.Event.SHARE, "Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "manager", "<init>", "(Lte0/d;Ldev/fluttercommunity/plus/share/ShareSuccessManager;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lio/flutter/plugin/common/MethodCall;)V", "b", "Lte0/d;", "c", "Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "share_plus_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMethodCallHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodCallHandler.kt\ndev/fluttercommunity/plus/share/MethodCallHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class C44935a implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C44938d share;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ShareSuccessManager manager;

    /* JADX INFO: renamed from: a */
    public final void m99366a(MethodCall call) throws IllegalArgumentException {
        if (!(call.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r0.equals("shareFilesWithResult") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.equals("shareWithResult") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        m99366a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r10 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r11.manager.m82050b(r13) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r0 = r11.share;
        r1 = r12.argument("text");
        p852kotlin.jvm.internal.Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.String");
        r0.m99382p((java.lang.String) r1, (java.lang.String) r12.argument("subject"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r10 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r10 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        r13.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r13.success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r0.equals("shareFiles") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        m99366a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r10 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r11.manager.m82050b(r13) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        r5 = r11.share;
        r1 = r12.argument("paths");
        p852kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r5.m99383q((java.util.List) r1, (java.util.List) r12.argument("mimeTypes"), (java.lang.String) r12.argument("text"), (java.lang.String) r12.argument("subject"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r10 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r10 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        r13.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        r13.success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        r13.error("Share failed", r0.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0.equals(com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE) != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String method = call.method;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        boolean zEndsWith$default = StringsKt.endsWith$default(method, "WithResult", false, 2, (Object) null);
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1811378728:
                    break;
                case -1594861118:
                    break;
                case -1212337029:
                    break;
                case 109400031:
                    break;
            }
            return;
        }
        result.notImplemented();
    }

    public C44935a(@NotNull C44938d share, @NotNull ShareSuccessManager manager) {
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.share = share;
        this.manager = manager;
    }
}
