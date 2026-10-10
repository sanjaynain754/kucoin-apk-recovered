package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.soloader.nativeloader.NativeLoader;

/* JADX INFO: loaded from: classes45.dex */
@DoNotStripAny
public class HybridData {
    private final Destructor mDestructor = new Destructor(this);

    @DoNotStripAny
    public static class Destructor extends DestructorThread.Destructor {
        private volatile long mNativePointer;

        public static native void deleteNative(long j11);

        @Override // com.facebook.jni.DestructorThread.Destructor
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        NativeLoader.loadLibrary("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }
}
