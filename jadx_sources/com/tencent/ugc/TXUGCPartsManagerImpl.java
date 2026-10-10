package com.tencent.ugc;

import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class TXUGCPartsManagerImpl implements TXUGCPartsManager {
    private long mNativePartsManager;

    /* JADX INFO: renamed from: com.tencent.ugc.TXUGCPartsManagerImpl$1 */
    public class C354681 implements RemuxJoiner.RemuxJoinerListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TXUGCPartsManager.JoinAllPartsListener f76674a;

        public C354681(TXUGCPartsManager.JoinAllPartsListener joinAllPartsListener) {
            this.f76674a = joinAllPartsListener;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78964a(TXUGCPartsManager.JoinAllPartsListener joinAllPartsListener, int i11) {
            if (joinAllPartsListener != null) {
                joinAllPartsListener.onJoinAllParts(i11);
            }
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerComplete(int i11, String str) {
            ThreadUtils.getUiThreadHandler().post(RunnableC35554c.m79053a(this.f76674a, i11));
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerProgress(float f11) {
        }
    }

    private static native void nativeAddPart(long j11, String str, long j12);

    private static native void nativeDeleteAllParts(long j11);

    private static native void nativeDeleteLastPart(long j11);

    private static native void nativeDeletePart(long j11, int i11);

    private static native void nativeDestroy(long j11);

    private static native int nativeGetDuration(long j11);

    private static native String[] nativeGetPartsPathList(long j11);

    private static native void nativeInsertPart(long j11, String str, int i11);

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void addClipInfo(PartInfo partInfo) {
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            nativeAddPart(j11, partInfo.getPath(), partInfo.getDuration());
        }
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void deleteAllParts() {
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            nativeDeleteAllParts(j11);
        }
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void deleteLastPart() {
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            nativeDeleteLastPart(j11);
        }
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void deletePart(int i11) {
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            nativeDeletePart(j11, i11);
        }
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public int getDuration() {
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            return nativeGetDuration(j11);
        }
        return 0;
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public List<String> getPartsPathList() {
        String[] strArrNativeGetPartsPathList;
        ArrayList arrayList = new ArrayList();
        long j11 = this.mNativePartsManager;
        if (j11 != 0 && (strArrNativeGetPartsPathList = nativeGetPartsPathList(j11)) != null && strArrNativeGetPartsPathList.length != 0) {
            arrayList.addAll(Arrays.asList(strArrNativeGetPartsPathList));
        }
        return arrayList;
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public void insertPart(String str, int i11) {
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            nativeInsertPart(j11, str, i11);
        }
    }

    @Override // com.tencent.ugc.TXUGCPartsManager
    public boolean joinAllParts(String str, TXUGCPartsManager.JoinAllPartsListener joinAllPartsListener) {
        RemuxJoiner remuxJoiner = new RemuxJoiner();
        remuxJoiner.initialize();
        remuxJoiner.setVideoJoinerListener(new C354681(joinAllPartsListener));
        return remuxJoiner.setSourcePaths(getPartsPathList()) && remuxJoiner.setTargetPath(str) && remuxJoiner.start();
    }

    public TXUGCPartsManagerImpl(long j11) {
        this.mNativePartsManager = j11;
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j11 = this.mNativePartsManager;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativePartsManager = 0L;
        }
    }
}
