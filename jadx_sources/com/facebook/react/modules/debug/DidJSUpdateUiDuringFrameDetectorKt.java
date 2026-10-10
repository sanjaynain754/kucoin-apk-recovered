package com.facebook.react.modules.debug;

import java.util.ArrayList;
import java.util.Iterator;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DidJSUpdateUiDuringFrameDetector.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a0\u0010\b\u001a\u00020\u00042\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a(\u0010\t\u001a\u00020\n2\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, m90084d2 = {"hasEventBetweenTimestamps", "", "eventArray", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "startTime", "endTime", "getLastEventBetweenTimestamps", "cleanUp", "", "ReactAndroid_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDidJSUpdateUiDuringFrameDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DidJSUpdateUiDuringFrameDetector.kt\ncom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetectorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1755#2,3:150\n*S KotlinDebug\n*F\n+ 1 DidJSUpdateUiDuringFrameDetector.kt\ncom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetectorKt\n*L\n116#1:150,3\n*E\n"})
public final class DidJSUpdateUiDuringFrameDetectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEventBetweenTimestamps(ArrayList<Long> arrayList, long j11, long j12) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (j11 <= jLongValue && jLongValue < j12) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleanUp(ArrayList<Long> arrayList, long j11) {
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (arrayList.get(i12).longValue() < j11) {
                i11++;
            }
        }
        if (i11 > 0) {
            int i13 = size - i11;
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.set(i14, arrayList.get(i14 + i11));
            }
            CollectionsKt.dropLast(arrayList, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLastEventBetweenTimestamps(ArrayList<Long> arrayList, long j11, long j12) {
        Iterator<Long> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        long j13 = -1;
        while (it.hasNext()) {
            Long next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            long jLongValue = next.longValue();
            if (j11 <= jLongValue && jLongValue < j12) {
                j13 = jLongValue;
            } else if (jLongValue >= j12) {
                break;
            }
        }
        return j13;
    }
}
