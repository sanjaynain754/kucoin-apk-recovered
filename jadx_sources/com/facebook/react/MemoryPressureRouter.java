package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes45.dex */
public class MemoryPressureRouter implements ComponentCallbacks2 {
    private final CopyOnWriteArrayList<MemoryPressureListener> mListeners = new CopyOnWriteArrayList<>();

    private void dispatchMemoryPressure(int i11) {
        Iterator<MemoryPressureListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().handleMemoryPressure(i11);
        }
    }

    public void addMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        if (this.mListeners.contains(memoryPressureListener)) {
            return;
        }
        this.mListeners.add(memoryPressureListener);
    }

    public void removeMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        this.mListeners.remove(memoryPressureListener);
    }

    public MemoryPressureRouter(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    public void destroy(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        dispatchMemoryPressure(i11);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
