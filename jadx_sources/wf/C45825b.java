package wf;

import com.kubi.monitor.TechnologyEvent;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: wf.b */
/* JADX INFO: compiled from: FallbackMonitor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/fallback/internal/monitor/FallbackMonitor;", "", "<init>", "()V", "reportKunLun", "", DbParams.KEY_CHANNEL_RESULT, "", Constants.BIZ, "", "category", "path", "logI", "message", "logE", "throwable", "", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFallbackMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallbackMonitor.kt\ncom/kubi/fallback/internal/monitor/FallbackMonitor\n+ 2 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,44:1\n104#2,12:45\n*S KotlinDebug\n*F\n+ 1 FallbackMonitor.kt\ncom/kubi/fallback/internal/monitor/FallbackMonitor\n*L\n21#1:45,12\n*E\n"})
public final class C45825b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45825b f103310a = new C45825b();

    /* JADX INFO: renamed from: a */
    public final void m101238a(@Nullable Throwable th2) {
        C44128b.m97263g("Fallback", th2);
    }

    /* JADX INFO: renamed from: b */
    public final void m101239b(@Nullable String str) {
        C44128b.m97266j("Fallback", str);
    }

    /* JADX INFO: renamed from: c */
    public final void m101240c(boolean z11, @NotNull String biz, @NotNull String category, @NotNull String path) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(path, "path");
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_FALLBACK_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("code", z11 ? "0" : OtcAd.KYC_NOT_PASS);
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
        eventParametersBuilderAcquire.m42393d("category", category);
        eventParametersBuilderAcquire.m42393d("path", path);
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
