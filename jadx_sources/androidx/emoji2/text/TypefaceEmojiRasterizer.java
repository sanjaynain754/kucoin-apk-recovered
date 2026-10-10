package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import com.tencent.bugly.proguard.C33627eb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
public class TypefaceEmojiRasterizer {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int HAS_GLYPH_ABSENT = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int HAS_GLYPH_EXISTS = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final ThreadLocal<MetadataItem> sMetadataItem = new ThreadLocal<>();
    private volatile int mCache = 0;
    private final int mIndex;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    /* JADX INFO: loaded from: classes34.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HasGlyph {
    }

    private MetadataItem getMetadataItem() {
        ThreadLocal<MetadataItem> threadLocal = sMetadataItem;
        MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.mMetadataRepo.getMetadataList().list(metadataItem, this.mIndex);
        return metadataItem;
    }

    public void draw(@NonNull Canvas canvas, float f11, float f12, @NonNull Paint paint) {
        Typeface typeface = this.mMetadataRepo.getTypeface();
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.mMetadataRepo.getEmojiCharArray(), this.mIndex * 2, 2, f11, f12, paint);
        paint.setTypeface(typeface2);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getHasGlyph() {
        return this.mCache & 3;
    }

    @NonNull
    public Typeface getTypeface() {
        return this.mMetadataRepo.getTypeface();
    }

    public boolean isPreferredSystemRender() {
        return (this.mCache & 4) > 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasGlyph(boolean z11) {
        int i11 = this.mCache & 4;
        this.mCache = z11 ? i11 | 2 : i11 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(getId()));
        sb2.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i11 = 0; i11 < codepointsLength; i11++) {
            sb2.append(Integer.toHexString(getCodepointAt(i11)));
            sb2.append(C33627eb.f69716f);
        }
        return sb2.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TypefaceEmojiRasterizer(@NonNull MetadataRepo metadataRepo, @IntRange(from = 0) int i11) {
        this.mMetadataRepo = metadataRepo;
        this.mIndex = i11;
    }

    public int getCodepointAt(int i11) {
        return getMetadataItem().codepoints(i11);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getId() {
        return getMetadataItem().m2817id();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.mCache = 4;
        } else {
            this.mCache = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setExclusion(boolean z11) {
        int hasGlyph = getHasGlyph();
        if (z11) {
            this.mCache = hasGlyph | 4;
        } else {
            this.mCache = hasGlyph;
        }
    }
}
