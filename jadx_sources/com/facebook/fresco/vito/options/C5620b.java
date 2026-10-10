package com.facebook.fresco.vito.options;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p712w3.C45706f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.facebook.fresco.vito.options.b */
/* JADX INFO: compiled from: EncodedImageOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/b;", "", "Lcom/facebook/fresco/vito/options/b$a;", "builder", "<init>", "(Lcom/facebook/fresco/vito/options/b$a;)V", "other", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/fresco/vito/options/b;)Z", "", "hashCode", "()I", "Lw3/f$a;", "e", "()Lw3/f$a;", "Lcom/facebook/imagepipeline/common/Priority;", "Lcom/facebook/imagepipeline/common/Priority;", "d", "()Lcom/facebook/imagepipeline/common/Priority;", "priority", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "b", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "cacheChoice", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "diskCacheId", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C5620b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Priority priority;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ImageRequest.CacheChoice cacheChoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String diskCacheId;

    /* JADX INFO: renamed from: com.facebook.fresco.vito.options.b$a */
    /* JADX INFO: compiled from: EncodedImageOptions.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/b$a;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Lcom/facebook/fresco/vito/options/b;", "defaultOptions", "(Lcom/facebook/fresco/vito/options/b;)V", "Lcom/facebook/imagepipeline/common/Priority;", "priority", "e", "(Lcom/facebook/imagepipeline/common/Priority;)Lcom/facebook/fresco/vito/options/b$a;", "d", "()Lcom/facebook/fresco/vito/options/b$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/imagepipeline/common/Priority;", "c", "()Lcom/facebook/imagepipeline/common/Priority;", "setPriority$options_release", "(Lcom/facebook/imagepipeline/common/Priority;)V", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "b", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "setCacheChoice$options_release", "(Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;)V", "cacheChoice", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setDiskCacheId$options_release", "(Ljava/lang/String;)V", "diskCacheId", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEncodedImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncodedImageOptions.kt\ncom/facebook/fresco/vito/options/EncodedImageOptions$Builder\n*L\n1#1,91:1\n86#1,2:92\n86#1,2:94\n86#1,2:96\n*S KotlinDebug\n*F\n+ 1 EncodedImageOptions.kt\ncom/facebook/fresco/vito/options/EncodedImageOptions$Builder\n*L\n75#1:92,2\n77#1:94,2\n79#1:96,2\n*E\n"})
    public static class a<T extends a<T>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Priority priority;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public ImageRequest.CacheChoice cacheChoice;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String diskCacheId;

        public a() {
        }

        public a(@NotNull C5620b defaultOptions) {
            Intrinsics.checkNotNullParameter(defaultOptions, "defaultOptions");
            this.priority = defaultOptions.getPriority();
            this.cacheChoice = defaultOptions.getCacheChoice();
            this.diskCacheId = defaultOptions.getDiskCacheId();
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageRequest.CacheChoice getCacheChoice() {
            return this.cacheChoice;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDiskCacheId() {
            return this.diskCacheId;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Priority getPriority() {
            return this.priority;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final T m8967d() {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.facebook.fresco.vito.options.EncodedImageOptions.Builder");
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final T m8968e(@Nullable Priority priority) {
            this.priority = priority;
            return (T) m8967d();
        }
    }

    public C5620b(@NotNull a<?> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.priority = builder.getPriority();
        this.cacheChoice = builder.getCacheChoice();
        String diskCacheId = builder.getDiskCacheId();
        this.diskCacheId = diskCacheId;
        if (builder.getCacheChoice() == ImageRequest.CacheChoice.DYNAMIC) {
            if (diskCacheId == null) {
                throw new ImageRequestBuilder.BuilderException("Disk cache id must be set for dynamic cache choice");
            }
        } else if (diskCacheId != null && diskCacheId.length() != 0) {
            throw new ImageRequestBuilder.BuilderException("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageRequest.CacheChoice getCacheChoice() {
        return this.cacheChoice;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDiskCacheId() {
        return this.diskCacheId;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        Priority priority = this.priority;
        int iHashCode = (priority != null ? priority.hashCode() : 0) * 31;
        ImageRequest.CacheChoice cacheChoice = this.cacheChoice;
        int iHashCode2 = (iHashCode + (cacheChoice != null ? cacheChoice.hashCode() : 0)) * 31;
        String str = this.diskCacheId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8960a(@NotNull C5620b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (C45706f.m100883a(this.priority, other.priority) && C45706f.m100883a(this.cacheChoice, other.cacheChoice) && C45706f.m100883a(this.diskCacheId, other.diskCacheId)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public C45706f.a mo8892e() {
        C45706f.a aVarM100886b = C45706f.m100884b(this).m100886b("priority", this.priority).m100886b("cacheChoice", this.cacheChoice).m100886b("diskCacheId", this.diskCacheId);
        Intrinsics.checkNotNullExpressionValue(aVarM100886b, "add(...)");
        return aVarM100886b;
    }
}
