package com.kubi.sdk.lib.kunlun.sdk.collector;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.lib.kunlun.sdk.KunLunSdk;
import com.kubi.utils.C27099x;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import mz.C42679a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p352iz.InterfaceC40193a;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import xg0.C46163a0;
import xg0.C46173h;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kunlun.sdk.collector.a */
/* JADX INFO: compiled from: BaseCollector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R6\u0010*\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%`&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/collector/a;", "", "", "eventName", "", "timeStamp", "<init>", "(Ljava/lang/String;J)V", "", "value", "", "labels", "", "b", "(Ljava/lang/Number;Ljava/util/Map;)V", "Lkotlinx/serialization/json/JsonArray;", "d", "()Lkotlinx/serialization/json/JsonArray;", "Lxg0/a0;", "builder", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lxg0/a0;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "()V", "", "c", "()Z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "J", "g", "()J", "setTimeStamp$kunlun_sdk_release", "(J)V", "Ljava/util/HashMap;", "", "Lcom/kubi/sdk/lib/kunlun/sdk/collector/b;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "f", "()Ljava/util/HashMap;", "samples", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCollector.kt\ncom/kubi/sdk/lib/kunlun/sdk/collector/BaseCollector\n+ 2 KunlunLogger.kt\ncom/kubi/sdk/lib/kunlun/sdk/utils/KunlunLoggerKt\n*L\n1#1,67:1\n35#2,3:68\n*S KotlinDebug\n*F\n+ 1 BaseCollector.kt\ncom/kubi/sdk/lib/kunlun/sdk/collector/BaseCollector\n*L\n29#1:68,3\n*E\n"})
public abstract class AbstractC23866a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long timeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, Sample> samples;

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract JsonArray mo57132d();

    public AbstractC23866a(@NotNull String eventName, long j11) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.timeStamp = j11;
        this.samples = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m57133a(@NotNull C46163a0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        KunLunSdk kunLunSdk = KunLunSdk.f46915a;
        InterfaceC40193a interfaceC40193aM57117c = kunLunSdk.m57117c();
        C46173h.m101809g(builder, "source", interfaceC40193aM57117c != null ? interfaceC40193aM57117c.mo32875a() : null);
        InterfaceC40193a interfaceC40193aM57117c2 = kunLunSdk.m57117c();
        C46173h.m101809g(builder, "app_version", interfaceC40193aM57117c2 != null ? interfaceC40193aM57117c2.mo32876b() : null);
        InterfaceC40193a interfaceC40193aM57117c3 = kunLunSdk.m57117c();
        C46173h.m101809g(builder, "country", interfaceC40193aM57117c3 != null ? interfaceC40193aM57117c3.mo32877c() : null);
    }

    /* JADX INFO: renamed from: b */
    public final void m57134b(@NotNull Number value, @NotNull Map<String, ? extends Object> labels) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (m57135c()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The number of labels exceeds the limit, please check the configuration");
            C42679a.m93503a(illegalArgumentException, "KunlunSDK", "The number of labels exceeds the limit, current is  " + C27099x.m66919i(labels, false, 2, null));
            C44128b.m97262f("KunlunSDK", "The number of labels exceeds the limit, current is  " + C27099x.m66919i(labels, false, 2, null), illegalArgumentException);
            return;
        }
        int iHashCode = labels.hashCode();
        if (this.samples.containsKey(Integer.valueOf(iHashCode))) {
            Sample sample = this.samples.get(Integer.valueOf(iHashCode));
            if (sample != null) {
                sample.m57140a(value);
                return;
            }
            return;
        }
        Sample sample2 = new Sample(null, MapsKt.toMap(labels), 1, null);
        sample2.m57140a(value);
        this.samples.put(Integer.valueOf(iHashCode), sample2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57135c() {
        return this.samples.size() >= KunLunSdk.f46915a.m57120f().getMaxLabelCount();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, Sample> m57137f() {
        return this.samples;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: h */
    public final void m57139h() {
        this.samples.clear();
        this.timeStamp = System.currentTimeMillis();
    }
}
