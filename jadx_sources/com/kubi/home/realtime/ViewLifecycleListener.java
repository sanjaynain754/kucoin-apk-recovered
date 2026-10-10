package com.kubi.home.realtime;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.home.realtime.IRealTimeData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.home.realtime.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ViewLifecycleListener.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/realtime/ViewLifecycleListener;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "onCardCreate", "", "onCardShow", "onCardHide", "onCardDestroy", "onCardRefresh", "onViewLifecycleEvent", "event", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ViewLifecycleListener<T extends IRealTimeData> {
    /* JADX INFO: renamed from: a */
    void mo30039a();

    /* JADX INFO: renamed from: b */
    void mo30040b();

    @NotNull
    /* JADX INFO: renamed from: c */
    RealTimeViewType mo30041c();

    /* JADX INFO: renamed from: d */
    void mo30042d(@NotNull ViewLifecycleEvent<T> viewLifecycleEvent);

    /* JADX INFO: renamed from: f */
    void mo30044f();

    /* JADX INFO: renamed from: e */
    default void mo30043e() {
    }
}
