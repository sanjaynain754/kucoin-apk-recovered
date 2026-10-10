package i90;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.opensource.svgaplayer.proto.AudioEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: i90.a */
/* JADX INFO: compiled from: SVGAAudioEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0007\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R$\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b\"\u0004\b\u0019\u0010\u001cR$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\r\u0010\u001b\"\u0004\b\u0016\u0010\u001c¨\u0006 "}, m90084d2 = {"Li90/a;", "", "Lcom/opensource/svgaplayer/proto/AudioEntity;", "audioItem", "<init>", "(Lcom/opensource/svgaplayer/proto/AudioEntity;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getAudioKey", "()Ljava/lang/String;", "audioKey", "", "b", "I", "d", "()I", "startFrame", "c", "endFrame", "getStartTime", "startTime", "e", "getTotalTime", "totalTime", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "soundID", "g", "playID", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C38488a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String audioKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int startFrame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int endFrame;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int startTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int totalTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer soundID;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Integer playID;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEndFrame() {
        return this.endFrame;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getPlayID() {
        return this.playID;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getSoundID() {
        return this.soundID;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartFrame() {
        return this.startFrame;
    }

    /* JADX INFO: renamed from: e */
    public final void m87085e(@Nullable Integer num) {
        this.playID = num;
    }

    /* JADX INFO: renamed from: f */
    public final void m87086f(@Nullable Integer num) {
        this.soundID = num;
    }

    public C38488a(@NotNull AudioEntity audioEntity) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.audioKey = audioEntity.audioKey;
        Integer num = audioEntity.startFrame;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.startFrame = iIntValue;
        Integer num2 = audioEntity.endFrame;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.endFrame = iIntValue2;
        Integer num3 = audioEntity.startTime;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.startTime = iIntValue3;
        Integer num4 = audioEntity.totalTime;
        this.totalTime = num4 != null ? num4.intValue() : 0;
    }
}
