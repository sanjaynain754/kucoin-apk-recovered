package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.io.File;
import java.util.HashMap;
import p190d4.C36613d;
import p547q3.InterfaceC43595a;
import p585r5.C43928c;
import p586r6.C43931a;
import p712w3.C45706f;
import p712w3.C45708h;
import p712w3.InterfaceC45705e;
import p784y3.C46369a;
import p821z5.InterfaceC46705d;

/* JADX INFO: loaded from: classes34.dex */
public class ImageRequest {
    public static final InterfaceC45705e<ImageRequest, Uri> REQUEST_TO_URI_FN = new C5740a();
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;
    private final BytesRange mBytesRange;
    private final CacheChoice mCacheChoice;
    protected int mCachesDisabled;
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;
    private final String mDiskCacheId;
    private final DownsampleMode mDownsampleOverride;
    private int mHashcode;
    private final C43928c mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLoadThumbnailOnly;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final RequestLevel mLowestPermittedRequestLevel;
    private final InterfaceC5742b mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    private final InterfaceC46705d mRequestListener;
    private final Priority mRequestPriority;
    private final ResizeOptions mResizeOptions;
    private final Boolean mResizingAllowedOverride;
    private final RotationOptions mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    public enum CacheChoice {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        RequestLevel(int i11) {
            this.mValue = i11;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            if (requestLevel.getValue() > requestLevel2.getValue()) {
                return requestLevel;
            }
            return requestLevel2;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.request.ImageRequest$a */
    public class C5740a implements InterfaceC45705e<ImageRequest, Uri> {
        @Override // p712w3.InterfaceC45705e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(ImageRequest imageRequest) {
            if (imageRequest != null) {
                return imageRequest.getSourceUri();
            }
            return null;
        }
    }

    public static ImageRequest fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m9851x(uri).m9872a();
    }

    public synchronized File getSourceFile() {
        try {
            if (this.mSourceFile == null) {
                C45708h.m100896g(this.mSourceUri.getPath());
                this.mSourceFile = new File(this.mSourceUri.getPath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mSourceFile;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public static ImageRequest fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(C36613d.m81938g(file));
    }

    public static ImageRequest fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    private static int getHashCodeHelper(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static int getSourceUriType(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C36613d.m81947p(uri)) {
            return 0;
        }
        if (uri.getPath() != null && C36613d.m81945n(uri)) {
            return C46369a.m102265c(C46369a.m102264b(uri.getPath())) ? 2 : 3;
        }
        if (C36613d.m81944m(uri)) {
            return 4;
        }
        if (C36613d.m81941j(uri)) {
            return 5;
        }
        if (C36613d.m81946o(uri)) {
            return 6;
        }
        if (C36613d.m81940i(uri)) {
            return 7;
        }
        return C36613d.m81948q(uri) ? 8 : -1;
    }

    public static void setCacheHashcode(boolean z11) {
        sCacheHashcode = z11;
    }

    public static void setUseCachedHashcodeInEquals(boolean z11) {
        sUseCachedHashcodeInEquals = z11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (sUseCachedHashcodeInEquals) {
            int i11 = this.mHashcode;
            int i12 = imageRequest.mHashcode;
            if (i11 != 0 && i12 != 0 && i11 != i12) {
                return false;
            }
        }
        if (this.mLocalThumbnailPreviewsEnabled == imageRequest.mLocalThumbnailPreviewsEnabled && this.mIsDiskCacheEnabled == imageRequest.mIsDiskCacheEnabled && this.mIsMemoryCacheEnabled == imageRequest.mIsMemoryCacheEnabled && C45706f.m100883a(this.mSourceUri, imageRequest.mSourceUri) && C45706f.m100883a(this.mCacheChoice, imageRequest.mCacheChoice) && C45706f.m100883a(this.mDiskCacheId, imageRequest.mDiskCacheId) && C45706f.m100883a(this.mSourceFile, imageRequest.mSourceFile) && C45706f.m100883a(this.mBytesRange, imageRequest.mBytesRange) && C45706f.m100883a(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) && C45706f.m100883a(this.mResizeOptions, imageRequest.mResizeOptions) && C45706f.m100883a(this.mRequestPriority, imageRequest.mRequestPriority) && C45706f.m100883a(this.mLowestPermittedRequestLevel, imageRequest.mLowestPermittedRequestLevel) && C45706f.m100883a(Integer.valueOf(this.mCachesDisabled), Integer.valueOf(imageRequest.mCachesDisabled)) && C45706f.m100883a(this.mDecodePrefetches, imageRequest.mDecodePrefetches) && C45706f.m100883a(this.mResizingAllowedOverride, imageRequest.mResizingAllowedOverride) && C45706f.m100883a(this.mDownsampleOverride, imageRequest.mDownsampleOverride) && C45706f.m100883a(this.mRotationOptions, imageRequest.mRotationOptions) && this.mLoadThumbnailOnly == imageRequest.mLoadThumbnailOnly) {
            InterfaceC5742b interfaceC5742b = this.mPostprocessor;
            InterfaceC43595a postprocessorCacheKey = interfaceC5742b != null ? interfaceC5742b.getPostprocessorCacheKey() : null;
            InterfaceC5742b interfaceC5742b2 = imageRequest.mPostprocessor;
            if (C45706f.m100883a(postprocessorCacheKey, interfaceC5742b2 != null ? interfaceC5742b2.getPostprocessorCacheKey() : null) && this.mDelayMs == imageRequest.mDelayMs) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.m9196j();
    }

    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getCachesDisabled() {
        return this.mCachesDisabled;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    public String getDiskCacheId() {
        return this.mDiskCacheId;
    }

    public DownsampleMode getDownsampleOverride() {
        return this.mDownsampleOverride;
    }

    public C43928c getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLoadThumbnailOnlyForAndroidSdkAboveQ() {
        return Build.VERSION.SDK_INT >= 29 && this.mLoadThumbnailOnly;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    public InterfaceC5742b getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        if (resizeOptions != null) {
            return resizeOptions.height;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        if (resizeOptions != null) {
            return resizeOptions.width;
        }
        return 2048;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    public InterfaceC46705d getRequestListener() {
        return this.mRequestListener;
    }

    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int hashCode() {
        boolean z11 = sCacheHashcode;
        int i11 = z11 ? this.mHashcode : 0;
        if (i11 != 0) {
            return i11;
        }
        InterfaceC5742b interfaceC5742b = this.mPostprocessor;
        int iM96855a = C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(C43931a.m96855a(0, this.mCacheChoice), this.mSourceUri), Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled)), this.mBytesRange), this.mRequestPriority), this.mLowestPermittedRequestLevel), Integer.valueOf(this.mCachesDisabled)), Boolean.valueOf(this.mIsDiskCacheEnabled)), Boolean.valueOf(this.mIsMemoryCacheEnabled)), this.mImageDecodeOptions), this.mDecodePrefetches), this.mResizeOptions), this.mRotationOptions), interfaceC5742b != null ? interfaceC5742b.getPostprocessorCacheKey() : null), this.mResizingAllowedOverride), this.mDownsampleOverride), Integer.valueOf(this.mDelayMs)), Boolean.valueOf(this.mLoadThumbnailOnly));
        if (z11) {
            this.mHashcode = iM96855a;
        }
        return iM96855a;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public void recordHashCode(HashMap<String, Integer> map) {
        InterfaceC5742b interfaceC5742b = this.mPostprocessor;
        InterfaceC43595a postprocessorCacheKey = interfaceC5742b != null ? interfaceC5742b.getPostprocessorCacheKey() : null;
        map.put("ImageRequest", Integer.valueOf(hashCode()));
        map.put("ImageRequest.mSourceUri", Integer.valueOf(getHashCodeHelper(this.mSourceUri)));
        map.put("ImageRequest.mLocalThumbnailPreviewsEnabled", Integer.valueOf(getHashCodeHelper(Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled))));
        map.put("ImageRequest.mBytesRange", Integer.valueOf(getHashCodeHelper(this.mBytesRange)));
        map.put("ImageRequest.mRequestPriority", Integer.valueOf(getHashCodeHelper(this.mRequestPriority)));
        map.put("ImageRequest.mLowestPermittedRequestLevel", Integer.valueOf(getHashCodeHelper(this.mLowestPermittedRequestLevel)));
        map.put("ImageRequest.mCachesDisabled", Integer.valueOf(getHashCodeHelper(Integer.valueOf(this.mCachesDisabled))));
        map.put("ImageRequest.mIsDiskCacheEnabled", Integer.valueOf(getHashCodeHelper(Boolean.valueOf(this.mIsDiskCacheEnabled))));
        map.put("ImageRequest.mIsMemoryCacheEnabled", Integer.valueOf(getHashCodeHelper(Boolean.valueOf(this.mIsMemoryCacheEnabled))));
        map.put("ImageRequest.mImageDecodeOptions", Integer.valueOf(getHashCodeHelper(this.mImageDecodeOptions)));
        map.put("ImageRequest.mDecodePrefetches", Integer.valueOf(getHashCodeHelper(this.mDecodePrefetches)));
        map.put("ImageRequest.mSoumResizeOptionsrceUri", Integer.valueOf(getHashCodeHelper(this.mResizeOptions)));
        map.put("ImageRequest.mRotationOptions", Integer.valueOf(getHashCodeHelper(this.mRotationOptions)));
        map.put("ImageRequest.postprocessorCacheKey", Integer.valueOf(getHashCodeHelper(postprocessorCacheKey)));
        map.put("ImageRequest.mResizingAllowedOverride", Integer.valueOf(getHashCodeHelper(this.mResizingAllowedOverride)));
        map.put("ImageRequest.mDownsampleOverride", Integer.valueOf(getHashCodeHelper(this.mDownsampleOverride)));
        map.put("ImageRequest.mDelayMs", Integer.valueOf(getHashCodeHelper(Integer.valueOf(this.mDelayMs))));
        map.put("ImageRequest.mLoadThumbnailOnly", Integer.valueOf(getHashCodeHelper(Boolean.valueOf(this.mLoadThumbnailOnly))));
    }

    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        RotationOptions rotationOptionsM9887q;
        this.mCacheChoice = imageRequestBuilder.m9874d();
        Uri uriM9888r = imageRequestBuilder.m9888r();
        this.mSourceUri = uriM9888r;
        this.mSourceUriType = getSourceUriType(uriM9888r);
        this.mProgressiveRenderingEnabled = imageRequestBuilder.m9892w();
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.m9890u();
        this.mLoadThumbnailOnly = imageRequestBuilder.m9880j();
        this.mImageDecodeOptions = imageRequestBuilder.m9879i();
        this.mResizeOptions = imageRequestBuilder.m9885o();
        if (imageRequestBuilder.m9887q() == null) {
            rotationOptionsM9887q = RotationOptions.m9190d();
        } else {
            rotationOptionsM9887q = imageRequestBuilder.m9887q();
        }
        this.mRotationOptions = rotationOptionsM9887q;
        this.mBytesRange = imageRequestBuilder.m9873c();
        this.mRequestPriority = imageRequestBuilder.m9884n();
        this.mLowestPermittedRequestLevel = imageRequestBuilder.m9881k();
        boolean zM9889t = imageRequestBuilder.m9889t();
        this.mIsDiskCacheEnabled = zM9889t;
        int iM9875e = imageRequestBuilder.m9875e();
        this.mCachesDisabled = zM9889t ? iM9875e : iM9875e | 48;
        this.mIsMemoryCacheEnabled = imageRequestBuilder.m9891v();
        this.mDecodePrefetches = imageRequestBuilder.m9870S();
        this.mPostprocessor = imageRequestBuilder.m9882l();
        this.mRequestListener = imageRequestBuilder.m9883m();
        this.mResizingAllowedOverride = imageRequestBuilder.m9886p();
        this.mDownsampleOverride = imageRequestBuilder.m9878h();
        this.mDelayMs = imageRequestBuilder.m9876f();
        this.mDiskCacheId = imageRequestBuilder.m9877g();
    }

    public boolean isCacheEnabled(int i11) {
        if ((i11 & getCachesDisabled()) == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C45706f.m100884b(this).m100886b("uri", this.mSourceUri).m100886b("cacheChoice", this.mCacheChoice).m100886b("decodeOptions", this.mImageDecodeOptions).m100886b("postprocessor", this.mPostprocessor).m100886b("priority", this.mRequestPriority).m100886b("resizeOptions", this.mResizeOptions).m100886b("rotationOptions", this.mRotationOptions).m100886b("bytesRange", this.mBytesRange).m100886b("resizingAllowedOverride", this.mResizingAllowedOverride).m100886b("downsampleOverride", this.mDownsampleOverride).m100887c("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled).m100887c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).m100887c("loadThumbnailOnly", this.mLoadThumbnailOnly).m100886b("lowestPermittedRequestLevel", this.mLowestPermittedRequestLevel).m100885a("cachesDisabled", this.mCachesDisabled).m100887c("isDiskCacheEnabled", this.mIsDiskCacheEnabled).m100887c("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled).m100886b("decodePrefetches", this.mDecodePrefetches).m100885a("delayMs", this.mDelayMs).toString();
    }
}
