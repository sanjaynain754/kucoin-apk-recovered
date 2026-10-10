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
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CAMERA", "SCREEN", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRoomParticipantView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomParticipantView.kt\nio/trtc/tuikit/atomicxcore/api/view/VideoStreamType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,238:1\n8541#2,2:239\n8801#2,4:241\n*S KotlinDebug\n*F\n+ 1 RoomParticipantView.kt\nio/trtc/tuikit/atomicxcore/api/view/VideoStreamType\n*L\n45#1:239,2\n45#1:241,4\n*E\n"})
public enum VideoStreamType {
    CAMERA(0),
    SCREEN(1);


    @NotNull
    private static final Map<Integer, VideoStreamType> valueMap;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType$Companion;", "", "()V", "valueMap", "", "", "Lio/trtc/tuikit/atomicxcore/api/view/VideoStreamType;", "parse", "value", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final VideoStreamType parse(int value) {
            VideoStreamType videoStreamType = (VideoStreamType) VideoStreamType.valueMap.get(Integer.valueOf(value));
            if (videoStreamType == null) {
                return VideoStreamType.CAMERA;
            }
            return videoStreamType;
        }
    }

    static {
        VideoStreamType[] videoStreamTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(videoStreamTypeArrValues.length), 16));
        for (VideoStreamType videoStreamType : videoStreamTypeArrValues) {
            linkedHashMap.put(Integer.valueOf(videoStreamType.value), videoStreamType);
        }
        valueMap = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<VideoStreamType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final VideoStreamType parse(int i11) {
        return INSTANCE.parse(i11);
    }

    public final int getValue() {
        return this.value;
    }

    VideoStreamType(int i11) {
        this.value = i11;
    }
}
