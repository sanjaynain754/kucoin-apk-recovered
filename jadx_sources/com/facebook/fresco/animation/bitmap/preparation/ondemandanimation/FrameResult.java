package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FrameLoader.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "", "La4/a;", "Landroid/graphics/Bitmap;", "bitmapRef", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "type", "<init>", "(La4/a;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "La4/a;", "()La4/a;", "b", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "FrameType", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FrameResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final AbstractC0110a<Bitmap> bitmapRef;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final FrameType type;

    /* JADX INFO: compiled from: FrameLoader.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult$FrameType;", "", "<init>", "(Ljava/lang/String;I)V", AppConstants.AB_TEST_SUCCESS, "NEAREST", "MISSING", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum FrameType {
        SUCCESS,
        NEAREST,
        MISSING;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f8442c = EnumEntriesKt.enumEntries(m8794a());

        @NotNull
        public static EnumEntries<FrameType> getEntries() {
            return f8442c;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractC0110a<Bitmap> m8792a() {
        return this.bitmapRef;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FrameType getType() {
        return this.type;
    }

    public FrameResult(@Nullable AbstractC0110a<Bitmap> abstractC0110a, @NotNull FrameType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.bitmapRef = abstractC0110a;
        this.type = type;
    }
}
