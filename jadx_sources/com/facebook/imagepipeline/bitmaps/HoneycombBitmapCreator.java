package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p008a6.C0146g0;
import p008a6.C0161u;
import p221e4.InterfaceC37070a;
import p526p5.C43386b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoneycombBitmapCreator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator;", "Le4/a;", "La6/g0;", "poolFactory", "<init>", "(La6/g0;)V", "Lp5/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lp5/b;", "jpegGenerator", "La6/u;", "b", "La6/u;", "flexByteArrayPool", "c", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class HoneycombBitmapCreator implements InterfaceC37070a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C43386b jpegGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0161u flexByteArrayPool;

    /* JADX INFO: compiled from: HoneycombBitmapCreator.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator$Companion;", "", "<init>", "()V", "", "sampleSize", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/BitmapFactory$Options;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILandroid/graphics/Bitmap$Config;)Landroid/graphics/BitmapFactory$Options;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final BitmapFactory.Options m9118a(int sampleSize, Bitmap.Config bitmapConfig) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = bitmapConfig;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = sampleSize;
            options.inMutable = true;
            return options;
        }
    }

    public HoneycombBitmapCreator(@NotNull C0146g0 poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        this.jpegGenerator = new C43386b(poolFactory.m676h());
        C0161u c0161uM672d = poolFactory.m672d();
        Intrinsics.checkNotNullExpressionValue(c0161uM672d, "getFlexByteArrayPool(...)");
        this.flexByteArrayPool = c0161uM672d;
    }
}
