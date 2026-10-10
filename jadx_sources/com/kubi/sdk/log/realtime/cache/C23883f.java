package com.kubi.sdk.log.realtime.cache;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.sdk.log.realtime.cache.f */
/* JADX INFO: compiled from: LogMemCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/cache/f;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "d", "()I", "data", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", TUIConstants.TUIContact.LIMIT, "", "c", "(I)Ljava/util/List;", "b", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "memCache", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23883f<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentLinkedQueue<T> memCache = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    public final void m57233a(T data) {
        this.memCache.offer(data);
    }

    /* JADX INFO: renamed from: b */
    public final void m57234b() {
        this.memCache.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<T> m57235c(int limit) {
        ArrayList arrayList = new ArrayList();
        int iCoerceAtMost = RangesKt.coerceAtMost(limit, this.memCache.size());
        for (int i11 = 0; i11 < iCoerceAtMost; i11++) {
            T tPoll = this.memCache.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final int m57236d() {
        return this.memCache.size();
    }
}
