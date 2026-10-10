package com.tencent.rmonitor.base.plugin.listener;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.rmonitor.base.plugin.listener.IBaseListener;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;", "", "()V", "listenerList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;)V", "getListener", "()Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;", "getListenerList", "isEmpty", "", "removeListener", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class MonitorListenerMng<T extends IBaseListener> {

    @NotNull
    private final ArrayList<T> listenerList = new ArrayList<>();

    public final void addListener(@NotNull T listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            if (this.listenerList.contains(listener)) {
                return;
            }
            this.listenerList.add(listener);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final T getListener() {
        if (this.listenerList.isEmpty()) {
            return null;
        }
        try {
            return (T) CollectionsKt.last((List) this.listenerList);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public final ArrayList<T> getListenerList() {
        ArrayList<T> arrayList = new ArrayList<>();
        try {
            arrayList.addAll(this.listenerList);
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public final boolean isEmpty() {
        return this.listenerList.isEmpty();
    }

    public final void removeListener(@NotNull T listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            this.listenerList.remove(listener);
        } catch (Throwable unused) {
        }
    }
}
