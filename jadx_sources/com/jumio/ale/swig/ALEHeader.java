package com.jumio.ale.swig;

/* JADX INFO: loaded from: classes56.dex */
public class ALEHeader {

    /* JADX INFO: renamed from: a */
    public transient long f13386a;
    protected transient boolean swigCMemOwn;

    public ALEHeader(long j11, boolean z11) {
        this.swigCMemOwn = z11;
        this.f13386a = j11;
    }

    public synchronized void delete() {
        try {
            long j11 = this.f13386a;
            if (j11 != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    aleEngineJNI.delete_ALEHeader(j11);
                }
                this.f13386a = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static long getCPtr(ALEHeader aLEHeader) {
        if (aLEHeader == null) {
            return 0L;
        }
        return aLEHeader.f13386a;
    }

    public void add(String str, String str2) {
        aleEngineJNI.ALEHeader_add__SWIG_0(this.f13386a, this, str, str2);
    }

    public void clear() {
        aleEngineJNI.ALEHeader_clear(this.f13386a, this);
    }

    public void finalize() {
        delete();
    }

    public ALEHeader() {
        this(aleEngineJNI.new_ALEHeader(), true);
    }
}
