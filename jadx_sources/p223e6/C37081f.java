package p223e6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.nativecode.C5662c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p617s5.C44347s;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e6.f */
/* JADX INFO: compiled from: MultiImageTranscoderFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m90084d2 = {"Le6/f;", "Le6/d;", "", "maxBitmapSize", "", "useDownSamplingRatio", "primaryImageTranscoderFactory", "imageTranscoderType", "ensureTranscoderLibraryLoaded", "<init>", "(IZLe6/d;Ljava/lang/Integer;Z)V", "Lcom/facebook/imageformat/ImageFormat;", "imageFormat", "isResizingEnabled", "Le6/c;", "createImageTranscoder", "(Lcom/facebook/imageformat/ImageFormat;Z)Le6/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "c", "d", "b", "I", "Z", "Le6/d;", "Ljava/lang/Integer;", "e", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37081f implements InterfaceC37079d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxBitmapSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean useDownSamplingRatio;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC37079d primaryImageTranscoderFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Integer imageTranscoderType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean ensureTranscoderLibraryLoaded;

    /* JADX INFO: renamed from: a */
    public final InterfaceC37078c m83001a(ImageFormat imageFormat, boolean isResizingEnabled) {
        InterfaceC37079d interfaceC37079d = this.primaryImageTranscoderFactory;
        if (interfaceC37079d != null) {
            return interfaceC37079d.createImageTranscoder(imageFormat, isResizingEnabled);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC37078c m83002b(ImageFormat imageFormat, boolean isResizingEnabled) {
        Integer num = this.imageTranscoderType;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return m83003c(imageFormat, isResizingEnabled);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return m83004d(imageFormat, isResizingEnabled);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC37078c m83003c(ImageFormat imageFormat, boolean isResizingEnabled) {
        return C5662c.m9514a(this.maxBitmapSize, this.useDownSamplingRatio, this.ensureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, isResizingEnabled);
    }

    @Override // p223e6.InterfaceC37079d
    @NotNull
    public InterfaceC37078c createImageTranscoder(@NotNull ImageFormat imageFormat, boolean isResizingEnabled) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        InterfaceC37078c interfaceC37078cM83001a = m83001a(imageFormat, isResizingEnabled);
        if (interfaceC37078cM83001a == null) {
            interfaceC37078cM83001a = m83002b(imageFormat, isResizingEnabled);
        }
        if (interfaceC37078cM83001a == null && C44347s.m97812a()) {
            interfaceC37078cM83001a = m83003c(imageFormat, isResizingEnabled);
        }
        return interfaceC37078cM83001a == null ? m83004d(imageFormat, isResizingEnabled) : interfaceC37078cM83001a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC37078c m83004d(ImageFormat imageFormat, boolean isResizingEnabled) {
        InterfaceC37078c interfaceC37078cCreateImageTranscoder = new C37082g(this.maxBitmapSize).createImageTranscoder(imageFormat, isResizingEnabled);
        Intrinsics.checkNotNullExpressionValue(interfaceC37078cCreateImageTranscoder, "createImageTranscoder(...)");
        return interfaceC37078cCreateImageTranscoder;
    }

    public C37081f(int i11, boolean z11, @Nullable InterfaceC37079d interfaceC37079d, @Nullable Integer num, boolean z12) {
        this.maxBitmapSize = i11;
        this.useDownSamplingRatio = z11;
        this.primaryImageTranscoderFactory = interfaceC37079d;
        this.imageTranscoderType = num;
        this.ensureTranscoderLibraryLoaded = z12;
    }
}
