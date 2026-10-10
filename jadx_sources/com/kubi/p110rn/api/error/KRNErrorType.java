package com.kubi.p110rn.api.error;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KRNError.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/api/error/KRNErrorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "JS", "NATIVE", "Companion", "BReactNativeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKRNError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KRNError.kt\ncom/kubi/rn/api/error/KRNErrorType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1208#2,2:42\n1236#2,4:44\n*S KotlinDebug\n*F\n+ 1 KRNError.kt\ncom/kubi/rn/api/error/KRNErrorType\n*L\n14#1:42,2\n14#1:44,4\n*E\n"})
public enum KRNErrorType {
    JS("js"),
    NATIVE("native");


    @NotNull
    private static final Map<String, KRNErrorType> lookup;

    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: KRNError.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/api/error/KRNErrorType$Companion;", "", "<init>", "()V", "lookup", "", "", "Lcom/kubi/rn/api/error/KRNErrorType;", "from", "value", "BReactNativeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final KRNErrorType from(@Nullable String value) {
            KRNErrorType kRNErrorType = (KRNErrorType) KRNErrorType.lookup.get(value);
            if (kRNErrorType == null) {
                return KRNErrorType.NATIVE;
            }
            return kRNErrorType;
        }
    }

    static {
        EnumEntries<KRNErrorType> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (KRNErrorType kRNErrorType : entries) {
            linkedHashMap.put(kRNErrorType.value, kRNErrorType);
        }
        lookup = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<KRNErrorType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    KRNErrorType(String str) {
        this.value = str;
    }
}
