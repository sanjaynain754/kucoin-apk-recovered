package com.jumio.core.extraction;

import android.os.SystemClock;
import com.google.firebase.messaging.Constants;
import com.jumio.commons.log.Log;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0010\u001a\u00020\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/jumio/core/extraction/ProcessingTimesRecorder;", "", "<init>", "()V", "startTime", "", "lock", "records", "", "", "", "start", InterfaceC33730j9.f70350a, "", "reset", "addRecord", Constants.ScionAnalytics.PARAM_LABEL, "recordsFor", "", "addProcessingTime", "", "calculatedTime", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProcessingTimesRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessingTimesRecorder.kt\ncom/jumio/core/extraction/ProcessingTimesRecorder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,59:1\n1#2:60\n381#3,7:61\n*S KotlinDebug\n*F\n+ 1 ProcessingTimesRecorder.kt\ncom/jumio/core/extraction/ProcessingTimesRecorder\n*L\n55#1:61,7\n*E\n"})
public final class ProcessingTimesRecorder {

    /* JADX INFO: renamed from: a */
    public long f13891a = -1;

    /* JADX INFO: renamed from: b */
    public final Object f13892b = new Object();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f13893c = new LinkedHashMap();

    public static /* synthetic */ void addRecord$default(ProcessingTimesRecorder processingTimesRecorder, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL;
        }
        processingTimesRecorder.addRecord(str);
    }

    public final void addRecord(@NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        synchronized (this.f13892b) {
            try {
                if (this.f13891a <= 0) {
                    Log.m14484w("ProcessingTimesRecorder", "startTime is not set, ignoring record! Make sure to call start() before addRecord(...)");
                } else {
                    long jUptimeMillis = SystemClock.uptimeMillis() - this.f13891a;
                    LinkedHashMap linkedHashMap = this.f13893c;
                    Object arrayList = linkedHashMap.get(label);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(label, arrayList);
                    }
                    ((List) arrayList).add(Long.valueOf(jUptimeMillis));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final List<Long> recordsFor(@NotNull String label) {
        List<Long> listEmptyList;
        Intrinsics.checkNotNullParameter(label, "label");
        synchronized (this.f13892b) {
            listEmptyList = (List) this.f13893c.get(label);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        return listEmptyList;
    }

    public final void reset() {
        synchronized (this.f13892b) {
            stop();
            this.f13893c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void stop() {
        this.f13891a = -1L;
    }

    public final long start() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f13891a = jUptimeMillis;
        return jUptimeMillis;
    }
}
