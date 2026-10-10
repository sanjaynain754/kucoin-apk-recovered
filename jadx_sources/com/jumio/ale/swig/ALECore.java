package com.jumio.ale.swig;

/* JADX INFO: loaded from: classes56.dex */
public class ALECore {

    /* JADX INFO: renamed from: a */
    public transient long f13385a;
    protected transient boolean swigCMemOwn;

    public ALECore(long j11, boolean z11) {
        this.swigCMemOwn = z11;
        this.f13385a = j11;
    }

    public synchronized void delete() {
        try {
            long j11 = this.f13385a;
            if (j11 != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    aleEngineJNI.delete_ALECore(j11);
                }
                this.f13385a = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static long getCPtr(ALECore aLECore) {
        if (aLECore == null) {
            return 0L;
        }
        return aLECore.f13385a;
    }

    public ALERequest createRequest() throws Exception {
        long jALECore_createRequest = aleEngineJNI.ALECore_createRequest(this.f13385a, this);
        if (jALECore_createRequest == 0) {
            return null;
        }
        return new ALERequest(jALECore_createRequest, false);
    }

    public void destroyRequest(ALERequest aLERequest) {
        aleEngineJNI.ALECore_destroyRequest(this.f13385a, this, ALERequest.getCPtr(aLERequest), aLERequest);
    }

    public void finalize() {
        delete();
    }

    public ALECore(ALESettings aLESettings) {
        this(aleEngineJNI.new_ALECore(ALESettings.getCPtr(aLESettings), aLESettings), true);
    }
}
