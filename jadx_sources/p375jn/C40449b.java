package p375jn;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.kyc.protocol.AdvancedCertificationProtocolHandler;
import com.kubi.kyc.protocol.AdvancedCertificationResult;
import com.kubi.kyc.protocol.KycBindProtocolHandler;
import com.kubi.kyc.protocol.KycBindProtocolResult;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36576k;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jn.b */
/* JADX INFO: compiled from: KycJsBridge.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J*\u0010\f\u001a\u00020\u0005*\u00020\u00112\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0002J\\\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kyc/jsbridge/KycJsBridge;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiKycModule;", "<init>", "()V", "gotoBindEmail", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "gotoBindPhone", "Lcom/kubi/kyc/protocol/KycBindProtocolResult;", "openAdvancedCertification", AppsFlyerProperties.CHANNEL, "data", "", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40449b implements InterfaceC36576k {
    /* JADX INFO: renamed from: f */
    public static final Unit m89087f(Function2 function2, AdvancedCertificationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        function2.invoke(result.m36856a(), null);
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36576k
    /* JADX INFO: renamed from: a */
    public void mo81872a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String channel, @NotNull String data, @NotNull final Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AdvancedCertificationProtocolHandler.f31241a.m36846b(ctx, channel, data, new Function1() { // from class: jn.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C40449b.m89087f(callback, (AdvancedCertificationResult) obj2);
            }
        });
    }

    @Override // d00.InterfaceC36576k
    /* JADX INFO: renamed from: b */
    public void mo81873b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m89088e(KycBindProtocolHandler.f31261a.m36863d(ctx), callback);
    }

    @Override // d00.InterfaceC36576k
    /* JADX INFO: renamed from: c */
    public void mo81874c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m89088e(KycBindProtocolHandler.f31261a.m36862c(ctx), callback);
    }

    /* JADX INFO: renamed from: e */
    public final void m89088e(KycBindProtocolResult kycBindProtocolResult, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        if (kycBindProtocolResult.getSuccess()) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, new ProtocolException(kycBindProtocolResult.getMessage(), null, null, false, 14, null));
        }
    }
}
