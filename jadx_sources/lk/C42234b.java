package lk;

import android.content.Context;
import c00.InterfaceC4760g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36580o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lk.b */
/* JADX INFO: compiled from: KCJsBridgePackage.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/packagemodule/KCJsBridgePackage;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPackageModule;", "<init>", "()V", "updatePackageVersion", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "version", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42234b implements InterfaceC36580o {
    @Override // d00.InterfaceC36580o
    /* JADX INFO: renamed from: a */
    public void mo81875a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String packageName, @NotNull String version, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(source, "H5")) {
            callback.invoke(null, new ProtocolException("-9003", null, "method is not supported", false, 10, null));
            return;
        }
        try {
            ((InterfaceC4760g) Router.f46192a.m56192n(InterfaceC4760g.class)).mo4807a(ctx, obj, packageName, version, new Function2() { // from class: lk.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C42234b.m92676c(callback, (Boolean) obj2, (ProtocolException) obj3);
                }
            });
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("updatePackageVersion 没有找到对应实现, " + e11), null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m92676c(Function2 function2, Boolean bool, ProtocolException protocolException) {
        function2.invoke(bool, protocolException);
        return Unit.INSTANCE;
    }
}
