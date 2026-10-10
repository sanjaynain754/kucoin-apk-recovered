package com.facebook.imagepipeline.memory;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PoolStatsTracker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/imagepipeline/memory/PoolStatsTracker;", "", "Lcom/facebook/imagepipeline/memory/BasePool;", "basePool", "", "g", "(Lcom/facebook/imagepipeline/memory/BasePool;)V", "", "bucketedSize", "b", "(I)V", "d", "()V", "c", "size", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "sizeInBytes", "e", "f", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface PoolStatsTracker {

    /* JADX INFO: compiled from: PoolStatsTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/facebook/imagepipeline/memory/PoolStatsTracker$Companion;", "", "<init>", "()V", "BUCKETS_USED_PREFIX", "", "USED_COUNT", "USED_BYTES", "FREE_COUNT", "FREE_BYTES", "SOFT_CAP", "HARD_CAP", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String BUCKETS_USED_PREFIX = "buckets_used_";

        @NotNull
        public static final String FREE_BYTES = "free_bytes";

        @NotNull
        public static final String FREE_COUNT = "free_count";

        @NotNull
        public static final String HARD_CAP = "hard_cap";

        @NotNull
        public static final String SOFT_CAP = "soft_cap";

        @NotNull
        public static final String USED_BYTES = "used_bytes";

        @NotNull
        public static final String USED_COUNT = "used_count";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f9168a = new Companion();
    }

    /* JADX INFO: renamed from: a */
    void mo615a(int size);

    /* JADX INFO: renamed from: b */
    void mo616b(int bucketedSize);

    /* JADX INFO: renamed from: c */
    void mo617c();

    /* JADX INFO: renamed from: d */
    void mo618d();

    /* JADX INFO: renamed from: e */
    void mo619e(int sizeInBytes);

    /* JADX INFO: renamed from: f */
    void mo620f(int sizeInBytes);

    /* JADX INFO: renamed from: g */
    void mo621g(@NotNull BasePool<?> basePool);
}
