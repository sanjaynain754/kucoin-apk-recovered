package il;

import android.text.TextUtils;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: il.g */
/* JADX INFO: compiled from: BusinessErrorInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/NetBusinessErrorReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "invoke", "", "info", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBusinessErrorInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BusinessErrorInterceptor.kt\ncom/kubi/kucoin/interceptor/NetBusinessErrorReceiver\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,86:1\n71#2,4:87\n*S KotlinDebug\n*F\n+ 1 BusinessErrorInterceptor.kt\ncom/kubi/kucoin/interceptor/NetBusinessErrorReceiver\n*L\n70#1:87,4\n*E\n"})
public final class C38665g implements InterfaceC46255c {
    /* JADX INFO: renamed from: a */
    public void m87401a(@NotNull BizErrorInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", "request_invalid_not_login");
        eventParametersBuilderAcquire.m42393d("host", info.getRequest().url().host());
        eventParametersBuilderAcquire.m42393d("path", info.getRequest().url().encodedPath());
        eventParametersBuilderAcquire.m42394e("code", info.getBody().optInt("code", -999) == 401 && TextUtils.isEmpty(info.getRequest().header("X-APP-TOKEN")));
        eventParametersBuilderAcquire.m42394e("error_message", UserInfo.a.n());
        TechnologyEvent.m42388d("technology_event", eventParametersBuilderAcquire);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m87401a((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }
}
