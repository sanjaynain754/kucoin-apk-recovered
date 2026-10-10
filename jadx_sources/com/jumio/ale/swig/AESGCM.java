package com.jumio.ale.swig;

/* JADX INFO: loaded from: classes56.dex */
public class AESGCM {

    /* JADX INFO: renamed from: a */
    public transient long f13380a;
    protected transient boolean swigCMemOwn;

    public AESGCM(long j11, boolean z11) {
        this.swigCMemOwn = z11;
        this.f13380a = j11;
    }

    public synchronized void delete() {
        try {
            long j11 = this.f13380a;
            if (j11 != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    aleEngineJNI.delete_AESGCM(j11);
                }
                this.f13380a = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        aleEngineJNI.AESGCM_change_ownership(this, this.f13380a, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        aleEngineJNI.AESGCM_change_ownership(this, this.f13380a, true);
    }

    public static long getCPtr(AESGCM aesgcm) {
        if (aesgcm == null) {
            return 0L;
        }
        return aesgcm.f13380a;
    }

    public int finish(byte[] bArr, int i11) throws Exception {
        return aleEngineJNI.AESGCM_finish(this.f13380a, this, bArr, i11);
    }

    public void generateIV() throws Exception {
        aleEngineJNI.AESGCM_generateIV(this.f13380a, this);
    }

    public void generateKey() throws Exception {
        aleEngineJNI.AESGCM_generateKey(this.f13380a, this);
    }

    public void init() {
        aleEngineJNI.AESGCM_init(this.f13380a, this);
    }

    public void reset() throws Exception {
        aleEngineJNI.AESGCM_reset(this.f13380a, this);
    }

    public void setIV(byte[] bArr) throws Exception {
        aleEngineJNI.AESGCM_setIV(this.f13380a, this, bArr);
    }

    public void setKey(byte[] bArr) throws Exception {
        aleEngineJNI.AESGCM_setKey__SWIG_0(this.f13380a, this, bArr);
    }

    public void setMode(int i11) throws Exception {
        aleEngineJNI.AESGCM_setMode(this.f13380a, this, i11);
    }

    public int update(byte[] bArr, int i11, byte[] bArr2, int i12) throws Exception {
        return aleEngineJNI.AESGCM_update(this.f13380a, this, bArr, i11, bArr2, i12);
    }

    public void finalize() {
        delete();
    }

    public AESGCM() throws Exception {
        this(aleEngineJNI.new_AESGCM(), true);
        aleEngineJNI.AESGCM_director_connect(this, this.f13380a, true, true);
    }
}
