package ar;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.monitor.metrics.bean.CollectorData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p840zq.C46908e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ar.b, reason: from toString */
/* JADX INFO: compiled from: PageInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u0005R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u0005R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u00103\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R2\u00107\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000704j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00106R2\u00108\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000704j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106¨\u00069"}, m90084d2 = {"Lar/b;", "", "", "pageId", "<init>", "(Ljava/lang/String;)V", "", "Lcom/kubi/monitor/metrics/bean/CollectorData;", "collectValues", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Collection;)V", "", "dataType", "d", "(I)Lcom/kubi/monitor/metrics/bean/CollectorData;", "b", "i", "j", "()V", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "k", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "setPageId", "c", CmcdData.Factory.STREAM_TYPE_LIVE, "", "J", CmcdData.Factory.STREAMING_FORMAT_HLS, "()J", "setPageStartTime", "(J)V", "pageStartTime", "f", "n", "pageEndTime", "e", "Z", "()Z", "m", "(Z)V", "needReport", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "maxMap", "beforeMap", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class PageInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String pageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String extra;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long pageStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long pageEndTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean needReport;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public HashMap<Integer, CollectorData> maxMap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public HashMap<Integer, CollectorData> beforeMap;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PageInfo) && Intrinsics.areEqual(this.pageId, ((PageInfo) other).pageId);
    }

    public PageInfo(@NotNull String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.pageId = pageId;
        this.pageStartTime = System.currentTimeMillis();
        this.maxMap = new HashMap<>();
        this.beforeMap = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m3971a(@NotNull Collection<CollectorData> collectValues) {
        Intrinsics.checkNotNullParameter(collectValues, "collectValues");
        for (CollectorData collectorData : collectValues) {
            if (this.beforeMap.get(Integer.valueOf(collectorData.getDataType())) != null) {
                return;
            }
            CollectorData collectorDataAcquire = C46908e.f104773a.m103324k().acquire();
            if (collectorDataAcquire == null) {
                collectorDataAcquire = new CollectorData(collectorData.getDataType());
            }
            collectorDataAcquire.m42487h(collectorData);
            this.beforeMap.put(Integer.valueOf(collectorData.getDataType()), collectorDataAcquire);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final CollectorData m3972b(int dataType) {
        return this.beforeMap.get(Integer.valueOf(dataType));
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final CollectorData m3974d(int dataType) {
        return this.maxMap.get(Integer.valueOf(dataType));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNeedReport() {
        return this.needReport;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPageEndTime() {
        return this.pageEndTime;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPageStartTime() {
        return this.pageStartTime;
    }

    public int hashCode() {
        return this.pageId.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m3979i(@NotNull Collection<CollectorData> collectValues) {
        Intrinsics.checkNotNullParameter(collectValues, "collectValues");
        m3971a(collectValues);
        for (CollectorData collectorData : collectValues) {
            CollectorData collectorData2 = this.maxMap.get(Integer.valueOf(collectorData.getDataType()));
            if (collectorData2 == null) {
                collectorData2 = C46908e.f104773a.m103324k().acquire();
            }
            if (collectorData2 == null) {
                collectorData2 = new CollectorData(collectorData.getDataType());
                collectorData2.m42487h(collectorData);
            } else {
                collectorData2.m42487h(collectorData);
            }
            if (collectorData.getCurrentValue() > collectorData2.getCurrentValue()) {
                collectorData2.m42487h(collectorData);
            }
            this.maxMap.put(Integer.valueOf(collectorData.getDataType()), collectorData2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3980j() {
        Iterator<Map.Entry<Integer, CollectorData>> it = this.maxMap.entrySet().iterator();
        while (it.hasNext()) {
            C46908e.f104773a.m103324k().release(it.next().getValue());
        }
        Iterator<Map.Entry<Integer, CollectorData>> it2 = this.beforeMap.entrySet().iterator();
        while (it2.hasNext()) {
            C46908e.f104773a.m103324k().release(it2.next().getValue());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3981k(@NotNull String pageId, @Nullable String extra) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.pageId = pageId;
        this.extra = extra;
        this.pageStartTime = System.currentTimeMillis();
        this.pageEndTime = 0L;
        this.beforeMap.clear();
        this.maxMap.clear();
        this.needReport = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m3982l(@Nullable String str) {
        this.extra = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m3983m(boolean z11) {
        this.needReport = z11;
    }

    /* JADX INFO: renamed from: n */
    public final void m3984n(long j11) {
        this.pageEndTime = j11;
    }

    @NotNull
    public String toString() {
        return "PageInfo(pageId=" + this.pageId + ')';
    }
}
