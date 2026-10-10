package io.trtc.tuikit.atomicxcore.api.contact;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "JOIN_APPROVED_BY_ADMIN", "INVITE_APPROVED_BY_INVITEE", "INVITE_APPROVED_BY_ADMIN", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContactListStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListStore.kt\nio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1194#2,2:196\n1222#2,4:198\n*S KotlinDebug\n*F\n+ 1 ContactListStore.kt\nio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType\n*L\n45#1:196,2\n45#1:198,4\n*E\n"})
public enum GroupApplicationType {
    JOIN_APPROVED_BY_ADMIN(0),
    INVITE_APPROVED_BY_INVITEE(1),
    INVITE_APPROVED_BY_ADMIN(2);


    @NotNull
    private static final Map<Integer, GroupApplicationType> valueMap;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType$Companion;", "", "()V", "valueMap", "", "", "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;", "parse", "value", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final GroupApplicationType parse(int value) {
            GroupApplicationType groupApplicationType = (GroupApplicationType) GroupApplicationType.valueMap.get(Integer.valueOf(value));
            if (groupApplicationType == null) {
                return GroupApplicationType.JOIN_APPROVED_BY_ADMIN;
            }
            return groupApplicationType;
        }
    }

    static {
        EnumEntries<GroupApplicationType> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (GroupApplicationType groupApplicationType : entries) {
            linkedHashMap.put(Integer.valueOf(groupApplicationType.value), groupApplicationType);
        }
        valueMap = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<GroupApplicationType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final GroupApplicationType parse(int i11) {
        return INSTANCE.parse(i11);
    }

    public final int getValue() {
        return this.value;
    }

    GroupApplicationType(int i11) {
        this.value = i11;
    }
}
