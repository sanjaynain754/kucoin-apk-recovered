package p511or;

import com.google.firebase.messaging.Constants;
import com.kubi.network.retrofit.exception.JsonConvertException;
import com.kubi.network.retrofit.exception.NetCoreRetrofitIssueException;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: or.a */
/* JADX INFO: compiled from: NetCoreRetrofitIssue.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"", "e", "", "source", "", "c", "(Ljava/lang/Throwable;Ljava/lang/String;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "code", "", "ignore", "b", "(Ljava/lang/Throwable;IZ)V", "network-core-retrofit_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43174a {
    @PublishedApi
    /* JADX INFO: renamed from: b */
    public static final void m94786b(@NotNull Throwable error, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(error, "error");
        C43847h.m96575d(KunlunTechEventEnum.CATE_JSON_PROTOCOL, i11);
        C43846g.m96568c(new JsonConvertException(error, "GsonConvert", z11, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m94787c(Throwable th2, String str) {
        C43846g.m96568c(new NetCoreRetrofitIssueException(th2, str, false, null, 8, null), null, 2, null);
    }
}
