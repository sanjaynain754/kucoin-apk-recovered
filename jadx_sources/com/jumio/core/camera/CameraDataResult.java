package com.jumio.core.camera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/camera/CameraDataResult;", "", "<init>", "()V", "statistics", "", "Lcom/jumio/core/camera/CameraStatistics;", "addStatistics", "", "getModel", "Lcom/jumio/core/camera/CameraDataModel;", "timestamp", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraDataResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraDataResult.kt\ncom/jumio/core/camera/CameraDataResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n360#2,7:41\n295#2,2:48\n543#2,6:50\n543#2,6:56\n1971#2,14:62\n*S KotlinDebug\n*F\n+ 1 CameraDataResult.kt\ncom/jumio/core/camera/CameraDataResult\n*L\n10#1:41,7\n23#1:48,2\n25#1:50,6\n34#1:56,6\n36#1:62,14\n*E\n"})
public final class CameraDataResult {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13723a = new ArrayList();

    public static /* synthetic */ CameraDataModel getModel$default(CameraDataResult cameraDataResult, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return cameraDataResult.getModel(j11);
    }

    public final void addStatistics(@NotNull CameraStatistics statistics) {
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        Iterator it = this.f13723a.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (((CameraStatistics) it.next()).getId() == statistics.getId()) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            this.f13723a.set(i11, statistics);
        } else {
            this.f13723a.add(statistics);
        }
    }

    @NotNull
    public final CameraDataModel getModel(long timestamp) {
        Object objPrevious;
        CameraStatistics cameraStatistics;
        Object objPrevious2;
        Object next;
        if (this.f13723a.isEmpty()) {
            return new CameraDataModel(new CameraStatistics(0, 0L, null, false, 0, 0L, 0L, 127, null), new CameraStatistics(0, 0L, null, false, 0, 0L, 0L, 127, null));
        }
        Object obj = null;
        if (timestamp == 0) {
            Iterator it = this.f13723a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((CameraStatistics) next).getSequence());
            cameraStatistics = (CameraStatistics) next;
            if (cameraStatistics == null) {
                cameraStatistics = (CameraStatistics) CollectionsKt.first((List) this.f13723a);
            }
        } else {
            ArrayList arrayList = this.f13723a;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                CameraStatistics cameraStatistics2 = (CameraStatistics) objPrevious;
                if (cameraStatistics2.getStart_time() != 0 && cameraStatistics2.getStart_time() <= timestamp && ((cameraStatistics2.getEnd_time() != 0 && cameraStatistics2.getEnd_time() >= timestamp) || cameraStatistics2.getEnd_time() == 0)) {
                    break;
                }
            }
            cameraStatistics = (CameraStatistics) objPrevious;
            if (cameraStatistics == null) {
                ArrayList arrayList2 = this.f13723a;
                ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = listIterator2.previous();
                } while (((CameraStatistics) objPrevious2).getTimestamp() > timestamp);
                cameraStatistics = (CameraStatistics) objPrevious2;
                if (cameraStatistics == null) {
                    cameraStatistics = (CameraStatistics) CollectionsKt.first((List) this.f13723a);
                }
            }
        }
        Iterator it2 = this.f13723a.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            if (it2.hasNext()) {
                int count = ((CameraStatistics) next2).getCount();
                do {
                    Object next3 = it2.next();
                    int count2 = ((CameraStatistics) next3).getCount();
                    if (count < count2) {
                        next2 = next3;
                        count = count2;
                    }
                } while (it2.hasNext());
            }
            obj = next2;
        }
        CameraStatistics cameraStatistics3 = (CameraStatistics) obj;
        if (cameraStatistics3 == null) {
            cameraStatistics3 = (CameraStatistics) CollectionsKt.first((List) this.f13723a);
        }
        return new CameraDataModel(cameraStatistics, cameraStatistics3);
    }
}
