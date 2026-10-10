package com.swmansion.rnscreens.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import vb0.CacheKey;

/* JADX INFO: compiled from: ScreenDummyLayoutHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/swmansion/rnscreens/utils/CacheEntry;", "", "Lvb0/a;", "cacheKey", "", "headerHeight", "<init>", "(Lvb0/a;F)V", "key", "", "c", "(Lvb0/a;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lvb0/a;", "getCacheKey", "()Lvb0/a;", "b", "F", "()F", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CacheEntry {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CacheEntry f68463d = new CacheEntry(new CacheKey(Integer.MIN_VALUE, false), 0.0f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CacheKey cacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float headerHeight;

    /* JADX INFO: compiled from: ScreenDummyLayoutHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/swmansion/rnscreens/utils/CacheEntry$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/swmansion/rnscreens/utils/CacheEntry;", "getEMPTY", "()Lcom/swmansion/rnscreens/utils/CacheEntry;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final CacheEntry getEMPTY() {
            return CacheEntry.f68463d;
        }
    }

    public CacheEntry(@NotNull CacheKey cacheKey, float f11) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.cacheKey = cacheKey;
        this.headerHeight = f11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getHeaderHeight() {
        return this.headerHeight;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72124c(@NotNull CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cacheKey.getFontSize() != Integer.MIN_VALUE && Intrinsics.areEqual(this.cacheKey, key);
    }
}
