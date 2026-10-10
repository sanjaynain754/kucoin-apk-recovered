package io.trtc.tuikit.atomicxcore.api.device;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "CHILD", "LITTLE_GIRL", "MAN", "HEAVY_METAL", "COLD", "FOREIGNER", "TRAPPED_BEAST", "FATSO", "STRONG_CURRENT", "HEAVY_MACHINERY", "ETHEREAL", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAudioEffectStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioEffectStore.kt\nio/trtc/tuikit/atomicxcore/api/device/AudioChangerType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,396:1\n8541#2,2:397\n8801#2,4:399\n*S KotlinDebug\n*F\n+ 1 AudioEffectStore.kt\nio/trtc/tuikit/atomicxcore/api/device/AudioChangerType\n*L\n102#1:397,2\n102#1:399,4\n*E\n"})
public enum AudioChangerType {
    NONE(0),
    CHILD(1),
    LITTLE_GIRL(2),
    MAN(3),
    HEAVY_METAL(4),
    COLD(5),
    FOREIGNER(6),
    TRAPPED_BEAST(7),
    FATSO(8),
    STRONG_CURRENT(9),
    HEAVY_MACHINERY(10),
    ETHEREAL(11);


    @NotNull
    private static final Map<Integer, AudioChangerType> valueMap;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType$Companion;", "", "()V", "valueMap", "", "", "Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;", "parse", "value", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final AudioChangerType parse(int value) {
            AudioChangerType audioChangerType = (AudioChangerType) AudioChangerType.valueMap.get(Integer.valueOf(value));
            if (audioChangerType == null) {
                return AudioChangerType.NONE;
            }
            return audioChangerType;
        }
    }

    static {
        AudioChangerType[] audioChangerTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(audioChangerTypeArrValues.length), 16));
        for (AudioChangerType audioChangerType : audioChangerTypeArrValues) {
            linkedHashMap.put(Integer.valueOf(audioChangerType.value), audioChangerType);
        }
        valueMap = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<AudioChangerType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final AudioChangerType parse(int i11) {
        return INSTANCE.parse(i11);
    }

    public final int getValue() {
        return this.value;
    }

    AudioChangerType(int i11) {
        this.value = i11;
    }
}
