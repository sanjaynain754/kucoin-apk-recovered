package p549q5;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p547q3.InterfaceC43595a;
import p585r5.C43928c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: q5.a, reason: from toString */
/* JADX INFO: compiled from: BitmapMemoryCacheKey.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b'\u00105R\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m90084d2 = {"Lq5/a;", "Lq3/a;", "", "sourceString", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Lcom/facebook/imagepipeline/common/RotationOptions;", "rotationOptions", "Lr5/c;", "imageDecodeOptions", "postprocessorCacheKey", "postprocessorName", "<init>", "(Ljava/lang/String;Lcom/facebook/imagepipeline/common/ResizeOptions;Lcom/facebook/imagepipeline/common/RotationOptions;Lr5/c;Lq3/a;Ljava/lang/String;)V", "", "hashCode", "()I", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "b", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getSourceString", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "getResizeOptions", "()Lcom/facebook/imagepipeline/common/ResizeOptions;", "Lcom/facebook/imagepipeline/common/RotationOptions;", "getRotationOptions", "()Lcom/facebook/imagepipeline/common/RotationOptions;", "d", "Lr5/c;", "getImageDecodeOptions", "()Lr5/c;", "e", "Lq3/a;", "getPostprocessorCacheKey", "()Lq3/a;", "f", "getPostprocessorName", "g", "Ljava/lang/Object;", "getCallerContext", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "callerContext", CmcdData.Factory.STREAMING_FORMAT_HLS, "I", "hash", "", "i", "J", "getInBitmapCacheSince", "()J", "inBitmapCacheSince", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class BitmapMemoryCacheKey implements InterfaceC43595a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String sourceString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final ResizeOptions resizeOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final RotationOptions rotationOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final C43928c imageDecodeOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC43595a postprocessorCacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String postprocessorName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Object callerContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int hash;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long inBitmapCacheSince;

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: b */
    public boolean mo8759b() {
        return false;
    }

    @Override // p547q3.InterfaceC43595a
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BitmapMemoryCacheKey.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) other;
        return Intrinsics.areEqual(this.sourceString, bitmapMemoryCacheKey.sourceString) && Intrinsics.areEqual(this.resizeOptions, bitmapMemoryCacheKey.resizeOptions) && Intrinsics.areEqual(this.rotationOptions, bitmapMemoryCacheKey.rotationOptions) && Intrinsics.areEqual(this.imageDecodeOptions, bitmapMemoryCacheKey.imageDecodeOptions) && Intrinsics.areEqual(this.postprocessorCacheKey, bitmapMemoryCacheKey.postprocessorCacheKey) && Intrinsics.areEqual(this.postprocessorName, bitmapMemoryCacheKey.postprocessorName);
    }

    @Override // p547q3.InterfaceC43595a
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getSourceString() {
        return this.sourceString;
    }

    /* JADX INFO: renamed from: d */
    public final void m95971d(@Nullable Object obj) {
        this.callerContext = obj;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getHash() {
        return this.hash;
    }

    @NotNull
    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.sourceString + ", resizeOptions=" + this.resizeOptions + ", rotationOptions=" + this.rotationOptions + ", imageDecodeOptions=" + this.imageDecodeOptions + ", postprocessorCacheKey=" + this.postprocessorCacheKey + ", postprocessorName=" + this.postprocessorName + ")";
    }

    public BitmapMemoryCacheKey(@NotNull String sourceString, @Nullable ResizeOptions resizeOptions, @NotNull RotationOptions rotationOptions, @NotNull C43928c imageDecodeOptions, @Nullable InterfaceC43595a interfaceC43595a, @Nullable String str) {
        int iHashCode;
        int iHashCode2;
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.sourceString = sourceString;
        this.resizeOptions = resizeOptions;
        this.rotationOptions = rotationOptions;
        this.imageDecodeOptions = imageDecodeOptions;
        this.postprocessorCacheKey = interfaceC43595a;
        this.postprocessorName = str;
        int iHashCode3 = sourceString.hashCode() * 31;
        if (resizeOptions != null) {
            iHashCode = resizeOptions.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode4 = (((((iHashCode3 + iHashCode) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31;
        if (interfaceC43595a != null) {
            iHashCode2 = interfaceC43595a.hashCode();
        } else {
            iHashCode2 = 0;
        }
        this.hash = ((iHashCode4 + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        this.inBitmapCacheSince = RealtimeSinceBootClock.get().now();
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: c */
    public boolean mo8760c(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String sourceString = getSourceString();
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.contains$default((CharSequence) sourceString, (CharSequence) string, false, 2, (Object) null);
    }
}
