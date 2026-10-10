package com.kubi.sdk.lib.kunlun.sdk.handler;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.lib.kunlun.sdk.KunLunSdk;
import com.kubi.sdk.lib.kunlun.sdk.LabelKey;
import com.kubi.sdk.lib.kunlun.sdk.collector.AbstractC23866a;
import com.kubi.sdk.lib.kunlun.sdk.collector.CounterCollector;
import com.kubi.sdk.lib.kunlun.sdk.collector.DetailCollector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import mz.C42679a;
import org.jetbrains.annotations.NotNull;
import p325hz.C38365a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import xg0.C46164b;

/* JADX INFO: compiled from: KunlunRecorder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder;", "", "<init>", "()V", "", "eventName", "", "labels", "", "d", "(Ljava/lang/String;Ljava/util/Map;)V", "", "", "values", "c", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lkotlinx/serialization/json/JsonArray;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/serialization/json/JsonArray;", "value", "b", "(Ljava/lang/String;Ljava/lang/Number;Ljava/util/Map;)V", "Lcom/kubi/sdk/lib/kunlun/sdk/collector/a;", "Ljava/util/Map;", "collectors", "", "J", "sessionStartTime", "Companion", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKunlunRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KunlunRecorder.kt\ncom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder\n+ 2 KunlunLogger.kt\ncom/kubi/sdk/lib/kunlun/sdk/utils/KunlunLoggerKt\n+ 3 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,90:1\n35#2,3:91\n35#2,3:94\n35#2,3:97\n49#3,4:100\n*S KotlinDebug\n*F\n+ 1 KunlunRecorder.kt\ncom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder\n*L\n31#1:91,3\n48#1:94,3\n62#1:97,3\n76#1:100,4\n*E\n"})
public final class KunlunRecorder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, AbstractC23866a> collectors = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long sessionStartTime = System.currentTimeMillis();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JsonArray m57160a() {
        C46164b c46164b = new C46164b();
        Iterator<AbstractC23866a> it = this.collectors.values().iterator();
        while (it.hasNext()) {
            JsonArray jsonArrayMo57132d = it.next().mo57132d();
            if (jsonArrayMo57132d != null) {
                Iterator<JsonElement> it2 = jsonArrayMo57132d.iterator();
                while (it2.hasNext()) {
                    c46164b.m101770a(it2.next());
                }
            }
        }
        return c46164b.m101771b();
    }

    /* JADX INFO: renamed from: b */
    public final void m57161b(String eventName, Number value, Map<String, Object> labels) {
        AbstractC23866a abstractC23866a = this.collectors.get(eventName);
        if (abstractC23866a == null) {
            DetailCollector detailCollector = new DetailCollector(eventName, this.sessionStartTime);
            detailCollector.m57134b(value, labels);
            this.collectors.put(eventName, detailCollector);
            return;
        }
        if (abstractC23866a instanceof DetailCollector) {
            ((DetailCollector) abstractC23866a).m57134b(value, labels);
            return;
        }
        if (KunLunSdk.f46915a.m57122h()) {
            throw new IllegalArgumentException("event " + eventName + " is not a detail event");
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("event " + eventName + " is not a detail event");
        C42679a.m93503a(illegalArgumentException, "KunlunSDK::KunlunRecorder", "event is Illegal");
        C44128b.m97262f("KunlunSDK::KunlunRecorder", "event is Illegal", illegalArgumentException);
    }

    /* JADX INFO: renamed from: c */
    public final void m57162c(@NotNull String eventName, @NotNull Map<String, ? extends Number> values, @NotNull Map<String, Object> labels) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(labels, "labels");
        for (Map.Entry<String, ? extends Number> entry : values.entrySet()) {
            if (C38365a.m86569a().contains(entry.getKey())) {
                labels.put(LabelKey.COST_TYPE.getKey(), entry.getKey());
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("event " + entry.getKey() + " is not a detail event");
                C42679a.m93503a(illegalArgumentException, "KunlunSDK::KunlunRecorder", "value.key is Illegal");
                C44128b.m97262f("KunlunSDK::KunlunRecorder", "value.key is Illegal", illegalArgumentException);
            }
            m57161b(eventName, entry.getValue(), labels);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57163d(@NotNull String eventName, @NotNull Map<String, Object> labels) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(labels, "labels");
        AbstractC23866a abstractC23866a = this.collectors.get(eventName);
        if (abstractC23866a == null) {
            CounterCollector counterCollector = new CounterCollector(eventName, this.sessionStartTime);
            counterCollector.m57134b(1, labels);
            this.collectors.put(eventName, counterCollector);
            return;
        }
        if (abstractC23866a instanceof CounterCollector) {
            ((CounterCollector) abstractC23866a).m57134b(1, labels);
            return;
        }
        if (KunLunSdk.f46915a.m57122h()) {
            throw new IllegalArgumentException("event " + eventName + " is not a counter event");
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("event " + eventName + " is not a counter event");
        C42679a.m93503a(illegalArgumentException, "KunlunSDK::KunlunRecorder", "event is Illegal");
        C44128b.m97262f("KunlunSDK::KunlunRecorder", "event is Illegal", illegalArgumentException);
    }
}
