package io.trtc.tuikit.atomicxcore.api.view;

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
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/VolumeLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Mute", "Low", "Medium", "High", "Peak", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallCoreView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallCoreView.kt\nio/trtc/tuikit/atomicxcore/api/view/VolumeLevel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,88:1\n8541#2,2:89\n8801#2,4:91\n*S KotlinDebug\n*F\n+ 1 CallCoreView.kt\nio/trtc/tuikit/atomicxcore/api/view/VolumeLevel\n*L\n41#1:89,2\n41#1:91,4\n*E\n"})
public enum VolumeLevel {
    Mute(0),
    Low(1),
    Medium(2),
    High(3),
    Peak(4);


    @NotNull
    private static final Map<Integer, VolumeLevel> valueMap;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/VolumeLevel$Companion;", "", "()V", "valueMap", "", "", "Lio/trtc/tuikit/atomicxcore/api/view/VolumeLevel;", "parse", "value", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final VolumeLevel parse(int value) {
            VolumeLevel volumeLevel = (VolumeLevel) VolumeLevel.valueMap.get(Integer.valueOf(value));
            if (volumeLevel == null) {
                return VolumeLevel.Low;
            }
            return volumeLevel;
        }
    }

    static {
        VolumeLevel[] volumeLevelArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(volumeLevelArrValues.length), 16));
        for (VolumeLevel volumeLevel : volumeLevelArrValues) {
            linkedHashMap.put(Integer.valueOf(volumeLevel.value), volumeLevel);
        }
        valueMap = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<VolumeLevel> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final VolumeLevel parse(int i11) {
        return INSTANCE.parse(i11);
    }

    public final int getValue() {
        return this.value;
    }

    VolumeLevel(int i11) {
        this.value = i11;
    }
}
