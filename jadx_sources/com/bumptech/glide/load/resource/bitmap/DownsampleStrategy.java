package com.bumptech.glide.load.resource.bitmap;

import p628t1.C44612d;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a */
    public static final DownsampleStrategy f6960a = new C5355a();

    /* JADX INFO: renamed from: b */
    public static final DownsampleStrategy f6961b = new C5356b();

    /* JADX INFO: renamed from: c */
    public static final DownsampleStrategy f6962c = new C5359e();

    /* JADX INFO: renamed from: d */
    public static final DownsampleStrategy f6963d = new C5357c();

    /* JADX INFO: renamed from: e */
    public static final DownsampleStrategy f6964e;

    /* JADX INFO: renamed from: f */
    public static final DownsampleStrategy f6965f;

    /* JADX INFO: renamed from: g */
    public static final DownsampleStrategy f6966g;

    /* JADX INFO: renamed from: h */
    public static final C44612d<DownsampleStrategy> f6967h;

    /* JADX INFO: renamed from: i */
    public static final boolean f6968i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C5355a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo6850b(int i11, int i12, int i13, int i14) {
            int iMin = Math.min(i12 / i14, i11 / i13);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C5356b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo6850b(int i11, int i12, int i13, int i14) {
            int iCeil = (int) Math.ceil(Math.max(i12 / i14, i11 / i13));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.MEMORY;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C5357c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo6850b(int i11, int i12, int i13, int i14) {
            return Math.min(1.0f, DownsampleStrategy.f6962c.mo6850b(i11, i12, i13, i14));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14) {
            if (mo6850b(i11, i12, i13, i14) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f6962c.mo6849a(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C5358d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo6850b(int i11, int i12, int i13, int i14) {
            return Math.max(i13 / i11, i14 / i12);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C5359e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14) {
            return DownsampleStrategy.f6968i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo6850b(int i11, int i12, int i13, int i14) {
            if (DownsampleStrategy.f6968i) {
                return Math.min(i13 / i11, i14 / i12);
            }
            int iMax = Math.max(i12 / i14, i11 / i13);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C5360f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo6850b(int i11, int i12, int i13, int i14) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract SampleSizeRounding mo6849a(int i11, int i12, int i13, int i14);

    /* JADX INFO: renamed from: b */
    public abstract float mo6850b(int i11, int i12, int i13, int i14);

    static {
        C5358d c5358d = new C5358d();
        f6964e = c5358d;
        f6965f = new C5360f();
        f6966g = c5358d;
        f6967h = C44612d.m98727f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c5358d);
        f6968i = true;
    }
}
