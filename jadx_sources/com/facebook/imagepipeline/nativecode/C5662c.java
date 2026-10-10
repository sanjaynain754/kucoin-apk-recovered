package com.facebook.imagepipeline.nativecode;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;
import p223e6.InterfaceC37079d;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.nativecode.c */
/* JADX INFO: compiled from: NativeImageTranscoderFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/imagepipeline/nativecode/c;", "", "<init>", "()V", "", "maxBitmapSize", "", "useDownSamplingRatio", "ensureTranscoderLibraryLoaded", "Le6/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IZZ)Le6/d;", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5662c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5662c f9181a = new C5662c();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC37079d m9514a(int maxBitmapSize, boolean useDownSamplingRatio, boolean ensureTranscoderLibraryLoaded) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(maxBitmapSize), Boolean.valueOf(useDownSamplingRatio), Boolean.valueOf(ensureTranscoderLibraryLoaded));
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return (InterfaceC37079d) objNewInstance;
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        } catch (IllegalArgumentException e13) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e14);
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e15);
        } catch (SecurityException e16) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e16);
        } catch (InvocationTargetException e17) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e17);
        }
    }
}
