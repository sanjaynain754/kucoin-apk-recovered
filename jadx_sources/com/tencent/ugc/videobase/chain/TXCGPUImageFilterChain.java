package com.tencent.ugc.videobase.chain;

import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUImageFilterChain extends TXCGPUImageFilter {
    private static final String TAG = "TXCGPUImageFilterChain";
    private final List<TXCGPUImageFilter> mFilters = new ArrayList();
    private final Map<TXCGPUImageFilter, List<GPUInterceptor>> mInterceptorsBeforeFilter = new HashMap();
    private final List<GPUInterceptor> mLastInterceptors = new ArrayList();
    private long mTimestamp = 0;
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);

    public synchronized void addFilter(TXCGPUImageFilter tXCGPUImageFilter) {
        if (tXCGPUImageFilter == null) {
            return;
        }
        try {
            if (!this.mLastInterceptors.isEmpty()) {
                if (this.mFilters.size() == 0) {
                    this.mFilters.add(new TXCGPUImageFilter());
                    LiteavLog.m76093w(TAG, "add COPY filter to filter chain.");
                }
                this.mInterceptorsBeforeFilter.put(tXCGPUImageFilter, new ArrayList(this.mLastInterceptors));
                this.mLastInterceptors.clear();
            }
            this.mFilters.add(tXCGPUImageFilter);
            initFiltersAndInterceptorsOnDraw();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addInterceptor(GPUInterceptor gPUInterceptor) {
        if (gPUInterceptor != null) {
            this.mLastInterceptors.add(gPUInterceptor);
            initFiltersAndInterceptorsOnDraw();
        }
    }

    public synchronized void removeAllFilterAndInterceptor() {
        this.mFilters.clear();
        this.mInterceptorsBeforeFilter.clear();
        this.mLastInterceptors.clear();
    }

    private GLTexture doIntercept(List<GPUInterceptor> list, GLTexture gLTexture) {
        if (list == null || list.isEmpty()) {
            return gLTexture;
        }
        Iterator<GPUInterceptor> it = list.iterator();
        GLTexture gLTexture2 = null;
        while (it.hasNext()) {
            GLTexture gLTextureIntercept = it.next().intercept(this.mTimestamp, gLTexture2 == null ? gLTexture : gLTexture2);
            if (gLTextureIntercept == null) {
                LiteavLog.m76083e(TAG, "doIntercept return null value");
                return gLTexture2;
            }
            if (gLTexture2 != null && gLTextureIntercept != gLTexture2) {
                gLTexture2.release();
            }
            gLTexture2 = gLTextureIntercept;
        }
        return gLTexture2;
    }

    private GLTexture doLastIntercept(GLTexture gLTexture) {
        if (this.mLastInterceptors.isEmpty()) {
            return gLTexture;
        }
        if (gLTexture != null) {
            return doIntercept(this.mLastInterceptors, gLTexture);
        }
        LiteavLog.m76083e(TAG, "last interceptors intecept on surface.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initFiltersAndInterceptors() {
        for (TXCGPUImageFilter tXCGPUImageFilter : this.mFilters) {
            if (!tXCGPUImageFilter.isInitialized()) {
                tXCGPUImageFilter.initialize(this.mTexturePool);
            }
        }
        for (List<GPUInterceptor> list : this.mInterceptorsBeforeFilter.values()) {
            if (list != null && !list.isEmpty()) {
                for (GPUInterceptor gPUInterceptor : list) {
                    if (!gPUInterceptor.isInitialized()) {
                        gPUInterceptor.initialize(this.mTexturePool);
                    }
                }
            }
        }
        for (GPUInterceptor gPUInterceptor2 : this.mLastInterceptors) {
            if (!gPUInterceptor2.isInitialized()) {
                gPUInterceptor2.initialize(this.mTexturePool);
            }
        }
    }

    public void setTimestamp(long j11) {
        this.mTimestamp = j11;
    }

    private void initFiltersAndInterceptorsOnDraw() {
        runOnDraw(RunnableC35813f.m79299a(this));
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i11, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        boolean z11;
        GLTexture gLTextureObtain;
        int id2;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            if (i11 != -1) {
                List<TXCGPUImageFilter> list = this.mFilters;
                int size = list.size();
                GLTexture gLTexture2 = null;
                for (int i12 = 0; i12 < size; i12++) {
                    TXCGPUImageFilter tXCGPUImageFilter = list.get(i12);
                    Size outputSize = tXCGPUImageFilter.getOutputSize();
                    if (gLTexture2 != null) {
                        GLTexture gLTextureDoIntercept = doIntercept(this.mInterceptorsBeforeFilter.get(tXCGPUImageFilter), gLTexture2);
                        if (gLTextureDoIntercept != null && gLTextureDoIntercept != gLTexture2) {
                            gLTexture2.release();
                        }
                        if (gLTextureDoIntercept != null) {
                            gLTextureDoIntercept.setMetaData(gLTexture.getMetaData());
                        }
                        gLTexture2 = gLTextureDoIntercept;
                    }
                    boolean z12 = true;
                    if (i12 < size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || CollectionUtils.isEmpty(this.mInterceptorsBeforeFilter.get(list.get(i12 + 1)))) {
                        z12 = false;
                    }
                    if (z11 && outputSize.equals(this.mOutputSize) && tXCGPUImageFilter.canBeSkipped() && (gLTexture2 != null || !z12)) {
                        tXCGPUImageFilter.onFilterBeenSkipped();
                    } else {
                        if (z11) {
                            gLTextureObtain = this.mTexturePool.obtain(outputSize.width, outputSize.height);
                            gLTextureObtain.setColorFormat(this.mColorRange, this.mColorSpace);
                        } else {
                            gLTextureObtain = gLTexture;
                        }
                        OpenGlUtils.glViewport(0, 0, outputSize.width, outputSize.height);
                        if (gLTexture2 == null) {
                            id2 = i11;
                        } else {
                            id2 = gLTexture2.getId();
                        }
                        if (i12 == 0) {
                            tXCGPUImageFilter.onDraw(id2, gLTextureObtain, floatBuffer, floatBuffer2);
                        } else {
                            tXCGPUImageFilter.onDraw(id2, gLTextureObtain, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
                        }
                        if (gLTexture2 != null) {
                            gLTexture2.release();
                        }
                        if (gLTextureObtain != null) {
                            gLTextureObtain.setMetaData(gLTexture.getMetaData());
                        }
                        gLTexture2 = gLTextureObtain;
                    }
                }
                if (gLTexture2 != null && gLTexture2 != gLTexture) {
                    gLTexture2.release();
                }
                GLTexture gLTextureDoLastIntercept = doLastIntercept(gLTexture);
                if (gLTextureDoLastIntercept != null && gLTextureDoLastIntercept != gLTexture) {
                    OpenGlUtils.glViewport(0, 0, gLTextureDoLastIntercept.getWidth(), gLTextureDoLastIntercept.getHeight());
                    super.onDraw(gLTextureDoLastIntercept.getId(), gLTexture, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
                    gLTextureDoLastIntercept.release();
                }
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        initFiltersAndInterceptors();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        Iterator<TXCGPUImageFilter> it = this.mFilters.iterator();
        while (it.hasNext()) {
            it.next().onOutputSizeChanged(i11, i12);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        Iterator<TXCGPUImageFilter> it = this.mFilters.iterator();
        while (it.hasNext()) {
            it.next().uninitialize();
        }
        for (List<GPUInterceptor> list : this.mInterceptorsBeforeFilter.values()) {
            if (list != null && !list.isEmpty()) {
                Iterator<GPUInterceptor> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().uninitialize();
                }
            }
        }
        Iterator<GPUInterceptor> it3 = this.mLastInterceptors.iterator();
        while (it3.hasNext()) {
            it3.next().uninitialize();
        }
    }
}
