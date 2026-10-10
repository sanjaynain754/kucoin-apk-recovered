package p569qq;

import androidx.annotation.NonNull;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.h */
/* JADX INFO: compiled from: KunlunEvent.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lqq/h;", "", "<init>", "()V", "Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;", "event", "", "code", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;I)V", "Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;", "d", "(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V", "", "eventName", "category", "c", "(Ljava/lang/String;Ljava/lang/String;I)V", "e", "(Ljava/lang/String;I)V", "b", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43847h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43847h f96912a = new C43847h();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96572a(@NonNull @NotNull KunlunBusinessEventEnum event, @NonNull int code) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator();
        while (it.hasNext()) {
            it.next().mo94079b(KunlunEventNameEnum.FRONTEND_BUSINESS_EVENT_COUNT.getEventName(), MapsKt.mutableMapOf(TuplesKt.m90091to("category", event.getCategory()), TuplesKt.m90091to("code", Integer.valueOf(code))));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m96573b(@NonNull @NotNull String category, @NonNull int code) {
        Intrinsics.checkNotNullParameter(category, "category");
        Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator();
        while (it.hasNext()) {
            it.next().mo94079b(KunlunEventNameEnum.FRONTEND_BUSINESS_EVENT_COUNT.getEventName(), MapsKt.mutableMapOf(TuplesKt.m90091to("category", category), TuplesKt.m90091to("code", Integer.valueOf(code))));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m96574c(@NonNull @NotNull String eventName, @NonNull @NotNull String category, @NonNull int code) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(category, "category");
        Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator();
        while (it.hasNext()) {
            it.next().mo94079b(eventName, MapsKt.mutableMapOf(TuplesKt.m90091to("category", category), TuplesKt.m90091to("code", Integer.valueOf(code))));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m96575d(@NonNull @NotNull KunlunTechEventEnum event, @NonNull int code) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator();
        while (it.hasNext()) {
            it.next().mo94079b(KunlunEventNameEnum.FRONTEND_TECHNOLOGY_EVENT_COUNT.getEventName(), MapsKt.mutableMapOf(TuplesKt.m90091to("category", event.getCategory()), TuplesKt.m90091to("code", Integer.valueOf(code))));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m96576e(@NonNull @NotNull String category, @NonNull int code) {
        Intrinsics.checkNotNullParameter(category, "category");
        Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator();
        while (it.hasNext()) {
            it.next().mo94079b(KunlunEventNameEnum.FRONTEND_TECHNOLOGY_EVENT_COUNT.getEventName(), MapsKt.mutableMapOf(TuplesKt.m90091to("category", category), TuplesKt.m90091to("code", Integer.valueOf(code))));
        }
    }
}
