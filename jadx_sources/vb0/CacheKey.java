package vb0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: vb0.a, reason: from toString */
/* JADX INFO: compiled from: ScreenDummyLayoutHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lvb0/a;", "", "", "fontSize", "", "isTitleEmpty", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "Z", "()Z", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class CacheKey {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int fontSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isTitleEmpty;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheKey)) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) other;
        return this.fontSize == cacheKey.fontSize && this.isTitleEmpty == cacheKey.isTitleEmpty;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.fontSize) * 31) + Boolean.hashCode(this.isTitleEmpty);
    }

    @NotNull
    public String toString() {
        return "CacheKey(fontSize=" + this.fontSize + ", isTitleEmpty=" + this.isTitleEmpty + ")";
    }

    public CacheKey(int i11, boolean z11) {
        this.fontSize = i11;
        this.isTitleEmpty = z11;
    }
}
