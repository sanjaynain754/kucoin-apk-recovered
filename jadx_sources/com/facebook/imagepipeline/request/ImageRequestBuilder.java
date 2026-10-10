package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p190d4.C36613d;
import p585r5.C43928c;
import p712w3.C45708h;
import p821z5.InterfaceC46705d;

/* JADX INFO: loaded from: classes34.dex */
public class ImageRequestBuilder {

    /* JADX INFO: renamed from: t */
    public static final Set<String> f9510t = new HashSet();

    /* JADX INFO: renamed from: n */
    public InterfaceC46705d f9524n;

    /* JADX INFO: renamed from: r */
    public int f9528r;

    /* JADX INFO: renamed from: a */
    public Uri f9511a = null;

    /* JADX INFO: renamed from: b */
    public ImageRequest.RequestLevel f9512b = ImageRequest.RequestLevel.FULL_FETCH;

    /* JADX INFO: renamed from: c */
    public int f9513c = 0;

    /* JADX INFO: renamed from: d */
    public ResizeOptions f9514d = null;

    /* JADX INFO: renamed from: e */
    public RotationOptions f9515e = null;

    /* JADX INFO: renamed from: f */
    public C43928c f9516f = C43928c.m96831a();

    /* JADX INFO: renamed from: g */
    public ImageRequest.CacheChoice f9517g = ImageRequest.CacheChoice.DEFAULT;

    /* JADX INFO: renamed from: h */
    public boolean f9518h = ImagePipelineConfig.m9239K().getIsProgressiveRenderingEnabled();

    /* JADX INFO: renamed from: i */
    public boolean f9519i = false;

    /* JADX INFO: renamed from: j */
    public boolean f9520j = false;

    /* JADX INFO: renamed from: k */
    public Priority f9521k = Priority.HIGH;

    /* JADX INFO: renamed from: l */
    public InterfaceC5742b f9522l = null;

    /* JADX INFO: renamed from: m */
    public Boolean f9523m = null;

    /* JADX INFO: renamed from: o */
    public BytesRange f9525o = null;

    /* JADX INFO: renamed from: p */
    public Boolean f9526p = null;

    /* JADX INFO: renamed from: q */
    public DownsampleMode f9527q = null;

    /* JADX INFO: renamed from: s */
    public String f9529s = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9850s(Uri uri) {
        Set<String> set = f9510t;
        if (set != null && uri != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static ImageRequestBuilder m9851x(Uri uri) {
        return new ImageRequestBuilder().m9869R(uri);
    }

    /* JADX INFO: renamed from: A */
    public ImageRequestBuilder m9852A(ImageRequest.CacheChoice cacheChoice) {
        this.f9517g = cacheChoice;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final ImageRequestBuilder m9853B(int i11) {
        this.f9513c = i11;
        if (this.f9517g != ImageRequest.CacheChoice.DYNAMIC) {
            this.f9529s = null;
        }
        return this;
    }

    /* JADX INFO: renamed from: C */
    public ImageRequestBuilder m9854C(int i11) {
        this.f9528r = i11;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public ImageRequestBuilder m9855D(String str) {
        this.f9529s = str;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public ImageRequestBuilder m9856E(DownsampleMode downsampleMode) {
        this.f9527q = downsampleMode;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public ImageRequestBuilder m9857F(C43928c c43928c) {
        this.f9516f = c43928c;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public ImageRequestBuilder m9858G(boolean z11) {
        this.f9520j = z11;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public ImageRequestBuilder m9859H(boolean z11) {
        this.f9519i = z11;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public ImageRequestBuilder m9860I(ImageRequest.RequestLevel requestLevel) {
        this.f9512b = requestLevel;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public ImageRequestBuilder m9861J(InterfaceC5742b interfaceC5742b) {
        this.f9522l = interfaceC5742b;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public ImageRequestBuilder m9862K(boolean z11) {
        this.f9518h = z11;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public ImageRequestBuilder m9863L(InterfaceC46705d interfaceC46705d) {
        this.f9524n = interfaceC46705d;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public ImageRequestBuilder m9864M(Priority priority) {
        this.f9521k = priority;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public ImageRequestBuilder m9865N(ResizeOptions resizeOptions) {
        this.f9514d = resizeOptions;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public ImageRequestBuilder m9866O(Boolean bool) {
        this.f9526p = bool;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public ImageRequestBuilder m9867P(RotationOptions rotationOptions) {
        this.f9515e = rotationOptions;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public ImageRequestBuilder m9868Q(Boolean bool) {
        this.f9523m = bool;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public Boolean m9870S() {
        return this.f9523m;
    }

    /* JADX INFO: renamed from: T */
    public void m9871T() {
        Uri uri = this.f9511a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (C36613d.m81946o(uri)) {
            if (!this.f9511a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f9511a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f9511a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (C36613d.m81941j(this.f9511a) && !this.f9511a.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }

    /* JADX INFO: renamed from: c */
    public BytesRange m9873c() {
        return this.f9525o;
    }

    /* JADX INFO: renamed from: d */
    public ImageRequest.CacheChoice m9874d() {
        return this.f9517g;
    }

    /* JADX INFO: renamed from: e */
    public int m9875e() {
        return this.f9513c;
    }

    /* JADX INFO: renamed from: f */
    public int m9876f() {
        return this.f9528r;
    }

    /* JADX INFO: renamed from: g */
    public String m9877g() {
        return this.f9529s;
    }

    /* JADX INFO: renamed from: h */
    public DownsampleMode m9878h() {
        return this.f9527q;
    }

    /* JADX INFO: renamed from: i */
    public C43928c m9879i() {
        return this.f9516f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m9880j() {
        return this.f9520j;
    }

    /* JADX INFO: renamed from: k */
    public ImageRequest.RequestLevel m9881k() {
        return this.f9512b;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC5742b m9882l() {
        return this.f9522l;
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC46705d m9883m() {
        return this.f9524n;
    }

    /* JADX INFO: renamed from: n */
    public Priority m9884n() {
        return this.f9521k;
    }

    /* JADX INFO: renamed from: o */
    public ResizeOptions m9885o() {
        return this.f9514d;
    }

    /* JADX INFO: renamed from: p */
    public Boolean m9886p() {
        return this.f9526p;
    }

    /* JADX INFO: renamed from: q */
    public RotationOptions m9887q() {
        return this.f9515e;
    }

    /* JADX INFO: renamed from: r */
    public Uri m9888r() {
        return this.f9511a;
    }

    /* JADX INFO: renamed from: t */
    public boolean m9889t() {
        if ((this.f9513c & 48) == 0) {
            return C36613d.m81947p(this.f9511a) || m9850s(this.f9511a);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m9890u() {
        return this.f9519i;
    }

    /* JADX INFO: renamed from: v */
    public boolean m9891v() {
        return (this.f9513c & 15) == 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m9892w() {
        return this.f9518h;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public ImageRequestBuilder m9893y(boolean z11) {
        return z11 ? m9867P(RotationOptions.m9190d()) : m9867P(RotationOptions.m9192g());
    }

    /* JADX INFO: renamed from: z */
    public ImageRequestBuilder m9894z(BytesRange bytesRange) {
        this.f9525o = bytesRange;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public static ImageRequestBuilder m9849b(ImageRequest imageRequest) {
        return m9851x(imageRequest.getSourceUri()).m9857F(imageRequest.getImageDecodeOptions()).m9894z(imageRequest.getBytesRange()).m9852A(imageRequest.getCacheChoice()).m9859H(imageRequest.getLocalThumbnailPreviewsEnabled()).m9858G(imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()).m9860I(imageRequest.getLowestPermittedRequestLevel()).m9853B(imageRequest.getCachesDisabled()).m9861J(imageRequest.getPostprocessor()).m9862K(imageRequest.getProgressiveRenderingEnabled()).m9864M(imageRequest.getPriority()).m9865N(imageRequest.getResizeOptions()).m9863L(imageRequest.getRequestListener()).m9867P(imageRequest.getRotationOptions()).m9868Q(imageRequest.shouldDecodePrefetches()).m9854C(imageRequest.getDelayMs()).m9855D(imageRequest.getDiskCacheId()).m9856E(imageRequest.getDownsampleOverride()).m9866O(imageRequest.getResizingAllowedOverride());
    }

    /* JADX INFO: renamed from: R */
    public ImageRequestBuilder m9869R(Uri uri) {
        C45708h.m100896g(uri);
        this.f9511a = uri;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public ImageRequest m9872a() {
        m9871T();
        return new ImageRequest(this);
    }
}
