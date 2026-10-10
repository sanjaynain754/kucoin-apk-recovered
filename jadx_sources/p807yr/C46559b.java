package p807yr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import ro.C44128b;

/* JADX INFO: renamed from: yr.b */
/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0004J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u00010\u0002*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lyr/b;", "", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "<init>", "()V", "element", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/subscribe/model/SubscribeRequest;)Z", "", "clear", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/HashMap;", "", "key", "defaultValue", "c", "(Ljava/util/HashMap;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;I)I", "b", "(Ljava/util/HashMap;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", DbParams.KEY_CHANNEL_RESULT, "d", "(ZLcom/kubi/network/api/subscribe/model/SubscribeRequest;)V", "Ljava/util/HashMap;", "queue", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/kubi/network/subscribe/model/SubscribeRequestQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1#2:155\n1855#3,2:156\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/kubi/network/subscribe/model/SubscribeRequestQueue\n*L\n78#1:156,2\n*E\n"})
public final class C46559b implements Iterable<SubscribeRequest>, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<SubscribeRequest, Integer> queue = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m102712a(@NotNull SubscribeRequest element) {
        try {
            Intrinsics.checkNotNullParameter(element, "element");
            boolean z11 = false;
            if (Intrinsics.areEqual(element.getType(), "unsubscribe")) {
                SubscribeRequest subscribeRequestM102713b = m102713b(this.queue, element);
                if (subscribeRequestM102713b == null) {
                    return false;
                }
                int iM102714c = m102714c(this.queue, subscribeRequestM102713b, 0);
                if (iM102714c > 1) {
                    this.queue.put(subscribeRequestM102713b, Integer.valueOf(iM102714c - 1));
                } else {
                    this.queue.remove(subscribeRequestM102713b);
                }
                if (iM102714c == 1) {
                    z11 = true;
                }
            } else {
                SubscribeRequest subscribeRequestM102713b2 = m102713b(this.queue, element);
                if (subscribeRequestM102713b2 == null) {
                    subscribeRequestM102713b2 = element;
                }
                HashMap<SubscribeRequest, Integer> map = this.queue;
                map.put(subscribeRequestM102713b2, Integer.valueOf(m102714c(map, subscribeRequestM102713b2, 0) + 1));
                Integer num = this.queue.get(subscribeRequestM102713b2);
                if (num != null && num.intValue() == 1) {
                    z11 = true;
                }
            }
            m102715d(z11, element);
            return z11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void clear() {
        this.queue.clear();
    }

    @Override // java.lang.Iterable
    @NotNull
    public synchronized Iterator<SubscribeRequest> iterator() {
        Set<SubscribeRequest> setKeySet;
        setKeySet = this.queue.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "queue.keys");
        return CollectionsKt.toMutableList((Collection) setKeySet).iterator();
    }

    /* JADX INFO: renamed from: d */
    public final void m102715d(boolean result, SubscribeRequest element) {
        StringBuffer stringBuffer = new StringBuffer();
        if (result) {
            stringBuffer.append("SocketRequestQueue 未交付\n");
        } else {
            stringBuffer.append("SocketRequestQueue 已交付\n");
        }
        if (Intrinsics.areEqual(element.getType(), "subscribe")) {
            stringBuffer.append("SocketRequestQueue 订阅:" + element.getTopic() + '\n');
        } else {
            stringBuffer.append("SocketRequestQueue 取消:" + element.getTopic() + '\n');
        }
        Set<Map.Entry<SubscribeRequest, Integer>> setEntrySet = this.queue.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "queue.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            stringBuffer.append("SocketRequestQueue 详情:" + ((SubscribeRequest) entry.getKey()).getTopic() + " = " + ((Number) entry.getValue()).intValue() + '\n');
        }
        stringBuffer.append("===========================================\n");
        C44128b.m97268l("CATEGORY_SOCKET", stringBuffer.toString());
    }

    /* JADX INFO: renamed from: b */
    public final SubscribeRequest m102713b(HashMap<SubscribeRequest, Integer> map, SubscribeRequest subscribeRequest) {
        Object next;
        Set<SubscribeRequest> keys = map.keySet();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((SubscribeRequest) next).getTopic(), subscribeRequest.getTopic())) {
                return (SubscribeRequest) next;
            }
        }
        next = null;
        return (SubscribeRequest) next;
    }

    /* JADX INFO: renamed from: c */
    public final int m102714c(HashMap<SubscribeRequest, Integer> map, SubscribeRequest subscribeRequest, int i11) {
        Integer num;
        SubscribeRequest subscribeRequestM102713b = m102713b(map, subscribeRequest);
        if (subscribeRequestM102713b != null && (num = map.get(subscribeRequestM102713b)) != null) {
            return num.intValue();
        }
        return i11;
    }
}
