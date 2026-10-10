package p755xb;

import android.text.TextUtils;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.router.core.Router;
import com.kubi.sdk.mode.AppMode;
import com.kubi.utils.C27012a;
import com.kubi.widget.web.ui.KWebBaseActivity;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: xb.b */
/* JADX INFO: compiled from: NetBusinessErrorReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/clean/receiver/NetBusinessErrorReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "lastJumpTime", "", "invoke", "", "errorInfo", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "handleRestrictedRegionCode", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetBusinessErrorReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetBusinessErrorReceiver.kt\ncom/kubi/clean/receiver/NetBusinessErrorReceiver\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,60:1\n19#2,2:61\n*S KotlinDebug\n*F\n+ 1 NetBusinessErrorReceiver.kt\ncom/kubi/clean/receiver/NetBusinessErrorReceiver\n*L\n54#1:61,2\n*E\n"})
public final class C46124b implements InterfaceC46255c {

    /* JADX INFO: renamed from: b */
    public long f103589b;

    /* JADX INFO: renamed from: c */
    public static final void m101639c(String str) {
        Router router = Router.f46192a;
        Intrinsics.checkNotNull(str);
        router.m56184f(str).m4048k();
    }

    /* JADX INFO: renamed from: d */
    public void m101641d(@NotNull BizErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        if (!AppMode.INSTANCE.isWeb3Mode() && Intrinsics.areEqual(errorInfo.getBody().optString("code", ""), "50003")) {
            m101640b(errorInfo.getBody());
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m101641d((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m101640b(JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(strOptString)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f103589b < 1500 || (C27012a.m66486i().m66494h() instanceof KWebBaseActivity)) {
                return;
            }
            this.f103589b = jCurrentTimeMillis;
            C42917g.m94139e().execute(new Runnable() { // from class: xb.a
                @Override // java.lang.Runnable
                public final void run() {
                    C46124b.m101639c(strOptString);
                }
            });
        }
    }
}
