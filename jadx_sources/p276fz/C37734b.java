package p276fz;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ImagesContract;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p294gz.C38058b;
import p569qq.C43848i;
import p569qq.C43852m;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: fz.b */
/* JADX INFO: compiled from: BizControlMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lfz/b;", "", "<init>", "()V", "", "f", "", "type", "g", "(Ljava/lang/String;)V", "", DbParams.KEY_CHANNEL_RESULT, "e", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "c", "d", "", "b", "J", "fetchStartTime", "fetchEndTime", "Ljava/lang/String;", "loadType", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizControlMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlMonitor.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/monitor/BizControlMonitor\n+ 2 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,97:1\n74#2,12:98\n74#2,12:110\n*S KotlinDebug\n*F\n+ 1 BizControlMonitor.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/monitor/BizControlMonitor\n*L\n70#1:98,12\n77#1:110,12\n*E\n"})
public final class C37734b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long fetchStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static long fetchEndTime;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37734b f85015a = new C37734b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String loadType = ImagesContract.LOCAL;

    /* JADX INFO: renamed from: a */
    public final void m85046a(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        C38058b c38058b = C38058b.f85672a;
        if (c38058b.m85934f()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ab_decision", "old_flow");
            jSONObject.put("ab_decision_source", type);
            jSONObject.put("ab_fallback_reason", type);
            C43852m.m96605q("first_install_ab_result", jSONObject);
            c38058b.m85940l(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85047c() {
        fetchStartTime = 0L;
        fetchEndTime = 0L;
        loadType = ImagesContract.LOCAL;
    }

    /* JADX INFO: renamed from: d */
    public final void m85048d(int result) {
        long j11 = fetchEndTime - fetchStartTime;
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_BIZCONTROL_EVENT_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", result);
        eventParametersBuilderAcquire.m42393d("category", loadType);
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
        if (result == 0) {
            KunlunEventNameEnum kunlunEventNameEnum2 = KunlunEventNameEnum.FRONTEND_BIZCONTROL_COST_MILLISECONDS;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire2.m42393d("category", loadType);
            eventParametersBuilderAcquire2.m42396g(TypedValues.TransitionType.S_DURATION, j11);
            TechnologyEvent.C19216a c19216a2 = TechnologyEvent.C19216a.f35485a;
            Map<String, Object> mapM42399c2 = c19216a2.m42399c(eventParametersBuilderAcquire2);
            Map<String, Number> mapM42398a2 = c19216a2.m42398a(eventParametersBuilderAcquire2);
            for (InterfaceC44169a interfaceC44169a2 : C43848i.f96913a.m96586e().mo32841c()) {
                if (mapM42398a2.isEmpty()) {
                    interfaceC44169a2.mo94079b(kunlunEventNameEnum2.getEventName(), mapM42399c2);
                } else {
                    interfaceC44169a2.mo94078a(kunlunEventNameEnum2.getEventName(), mapM42398a2, mapM42399c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85051g(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        loadType = type;
    }

    /* JADX INFO: renamed from: e */
    public final void m85049e(int result) {
        fetchEndTime = System.currentTimeMillis();
        m85048d(result);
        m85047c();
    }

    /* JADX INFO: renamed from: f */
    public final void m85050f() {
        fetchStartTime = System.currentTimeMillis();
    }
}
