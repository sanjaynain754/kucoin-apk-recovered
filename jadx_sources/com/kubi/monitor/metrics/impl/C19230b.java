package com.kubi.monitor.metrics.impl;

import android.text.TextUtils;
import androidx.core.util.Pools;
import androidx.media3.exoplayer.upstream.CmcdData;
import ar.PageInfo;
import br.InterfaceC4646b;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.monitor.metrics.bean.CollectorData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p840zq.C46908e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.monitor.metrics.impl.b */
/* JADX INFO: compiled from: MetricsProcessor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u001fj\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0004` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R0\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u001fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R0\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u001fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!¨\u0006%"}, m90084d2 = {"Lcom/kubi/monitor/metrics/impl/b;", "Lbr/b;", "<init>", "()V", "Lcom/kubi/monitor/metrics/bean/CollectorData;", "data", "", "c", "(Lcom/kubi/monitor/metrics/bean/CollectorData;)V", "", "pageId", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "b", "release", "e", "Lar/b;", "pageInfo", "f", "(Lar/b;)V", "", "dataType", "eventName", "g", "(Lar/b;ILjava/lang/String;)V", "d", "(Ljava/lang/String;Ljava/lang/String;)Lar/b;", "Landroidx/core/util/Pools$Pool;", "Landroidx/core/util/Pools$Pool;", "dataPool", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "dataMap", "lastPageInfoMap", "currentPageInfoMap", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19230b implements InterfaceC4646b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Pools.Pool<PageInfo> dataPool = new Pools.SimplePool(10);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, CollectorData> dataMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, PageInfo> lastPageInfoMap = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, PageInfo> currentPageInfoMap = new HashMap<>();

    @Override // br.InterfaceC4646b
    /* JADX INFO: renamed from: c */
    public void mo4596c(@NotNull CollectorData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.dataMap.containsKey(Integer.valueOf(data.getDataType()))) {
            CollectorData collectorData = this.dataMap.get(Integer.valueOf(data.getDataType()));
            if (collectorData != null) {
                collectorData.m42487h(data);
            }
        } else {
            this.dataMap.put(Integer.valueOf(data.getDataType()), CollectorData.m42480b(data, 0, 1, null));
        }
        m42494e();
        C46908e.f104773a.m103324k().release(data);
    }

    /* JADX INFO: renamed from: d */
    public final PageInfo m42493d(String pageId, String extra) {
        PageInfo c4383bAcquire = this.dataPool.acquire();
        if (c4383bAcquire != null) {
            c4383bAcquire.m3981k(pageId, extra);
            return c4383bAcquire;
        }
        PageInfo c4383b = new PageInfo(pageId);
        c4383b.m3982l(extra);
        return c4383b;
    }

    /* JADX INFO: renamed from: e */
    public final void m42494e() {
        Iterator<Map.Entry<String, PageInfo>> it = this.currentPageInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            PageInfo value = it.next().getValue();
            Collection<CollectorData> collectionValues = this.dataMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "dataMap.values");
            value.m3979i(collectionValues);
        }
        if (this.lastPageInfoMap.isEmpty()) {
            return;
        }
        HashMap<String, PageInfo> map = this.lastPageInfoMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PageInfo> entry : map.entrySet()) {
            if (entry.getValue().getNeedReport()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            m42495f((PageInfo) entry2.getValue());
            this.lastPageInfoMap.remove(((PageInfo) entry2.getValue()).getPageId());
            ((PageInfo) entry2.getValue()).m3980j();
            this.dataPool.release((PageInfo) entry2.getValue());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m42495f(PageInfo pageInfo) {
        C46908e c46908e = C46908e.f104773a;
        if (c46908e.m103321g(1) && pageInfo.m3974d(1) != null) {
            m42496g(pageInfo, 1, "app_performance_cpu");
        }
        if (!c46908e.m103321g(2) || pageInfo.m3974d(2) == null) {
            return;
        }
        m42496g(pageInfo, 2, "app_performance_memory");
    }

    /* JADX INFO: renamed from: g */
    public final void m42496g(PageInfo pageInfo, int dataType, String eventName) {
        String strM3977g = pageInfo.getPageId();
        String strM3973c = pageInfo.getCn.jiguang.privates.analysis.constants.JAnalysisConstants.ACCOUNT_EXTRA_ATTR java.lang.String();
        CollectorData collectorDataM3974d = pageInfo.m3974d(dataType);
        Long lValueOf = collectorDataM3974d == null ? null : Long.valueOf(((collectorDataM3974d.getCurrentTime() - pageInfo.getPageStartTime()) * 1000) / (pageInfo.getPageEndTime() - pageInfo.getPageStartTime()));
        Intrinsics.checkNotNull(lValueOf);
        long jLongValue = lValueOf.longValue();
        CollectorData collectorDataM3974d2 = pageInfo.m3974d(dataType);
        Long lValueOf2 = collectorDataM3974d2 == null ? null : Long.valueOf(collectorDataM3974d2.getCurrentValue());
        Intrinsics.checkNotNull(lValueOf2);
        long jLongValue2 = lValueOf2.longValue();
        CollectorData collectorDataM3974d3 = pageInfo.m3974d(dataType);
        Long lValueOf3 = collectorDataM3974d3 == null ? null : Long.valueOf(collectorDataM3974d3.getRestValue());
        Intrinsics.checkNotNull(lValueOf3);
        long jLongValue3 = lValueOf3.longValue();
        CollectorData collectorDataM3972b = pageInfo.m3972b(dataType);
        Long lValueOf4 = collectorDataM3972b == null ? null : Long.valueOf(collectorDataM3972b.getCurrentValue());
        Intrinsics.checkNotNull(lValueOf4);
        long jLongValue4 = lValueOf4.longValue();
        CollectorData collectorData = this.dataMap.get(Integer.valueOf(dataType));
        Long lValueOf5 = collectorData != null ? Long.valueOf(collectorData.getCurrentValue()) : null;
        Intrinsics.checkNotNull(lValueOf5);
        long jLongValue5 = lValueOf5.longValue();
        long j11 = jLongValue2 - jLongValue4;
        C44128b.m97259c("MetricsManager", "report value name " + eventName + " category " + strM3977g + " proportion " + jLongValue + " size " + jLongValue2 + " number1 " + jLongValue4 + " number2 " + jLongValue5 + " number3 " + j11 + " number4 " + jLongValue3 + " url " + ((Object) strM3973c));
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", strM3977g);
        eventParametersBuilderAcquire.m42396g("proportion", jLongValue);
        eventParametersBuilderAcquire.m42396g("size", jLongValue2);
        eventParametersBuilderAcquire.m42396g("number1", jLongValue4);
        eventParametersBuilderAcquire.m42396g("number2", jLongValue5);
        eventParametersBuilderAcquire.m42396g("number3", j11);
        eventParametersBuilderAcquire.m42396g("number4", jLongValue3);
        if (strM3973c != null) {
            eventParametersBuilderAcquire.m42393d("url", strM3973c);
        }
        TechnologyEvent.m42388d(eventName, eventParametersBuilderAcquire);
    }

    @Override // br.InterfaceC4646b
    public void release() {
        this.currentPageInfoMap.clear();
    }

    @Override // br.InterfaceC4646b
    /* JADX INFO: renamed from: a */
    public void mo4594a(@Nullable String pageId, @Nullable String extra) {
        if (TextUtils.isEmpty(pageId)) {
            return;
        }
        Intrinsics.checkNotNull(pageId);
        PageInfo c4383bM42493d = m42493d(pageId, extra);
        c4383bM42493d.m3982l(extra);
        Collection<CollectorData> collectionValues = this.dataMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "dataMap.values");
        c4383bM42493d.m3971a(collectionValues);
        this.currentPageInfoMap.put(c4383bM42493d.getPageId(), c4383bM42493d);
    }

    @Override // br.InterfaceC4646b
    /* JADX INFO: renamed from: b */
    public void mo4595b(@Nullable String pageId, @Nullable String extra) {
        PageInfo c4383b;
        if (!TextUtils.isEmpty(pageId) && (c4383b = this.currentPageInfoMap.get(pageId)) != null) {
            c4383b.m3984n(System.currentTimeMillis());
            c4383b.m3983m(true);
            Collection<CollectorData> collectionValues = this.dataMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "dataMap.values");
            c4383b.m3971a(collectionValues);
            this.lastPageInfoMap.put(c4383b.getPageId(), c4383b);
            this.currentPageInfoMap.remove(c4383b.getPageId());
        }
    }
}
