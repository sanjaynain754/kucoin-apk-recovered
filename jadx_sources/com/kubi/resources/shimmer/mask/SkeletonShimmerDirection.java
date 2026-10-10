package com.kubi.resources.shimmer.mask;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SkeletonShimmerDirection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "", "stableId", "", "<init>", "(Ljava/lang/String;II)V", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SkeletonShimmerDirection {
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1);

    private final int stableId;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f43695c = EnumEntriesKt.enumEntries(m54402a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SkeletonShimmerDirection.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion;", "", "<init>", "()V", "valueOf", "Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "stableId", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSkeletonShimmerDirection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonShimmerDirection.kt\ncom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n1310#2,2:22\n*S KotlinDebug\n*F\n+ 1 SkeletonShimmerDirection.kt\ncom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion\n*L\n18#1:22,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final SkeletonShimmerDirection valueOf(int stableId) {
            for (SkeletonShimmerDirection skeletonShimmerDirection : SkeletonShimmerDirection.values()) {
                if (skeletonShimmerDirection.stableId == stableId) {
                    return skeletonShimmerDirection;
                }
            }
            return null;
        }
    }

    @NotNull
    public static EnumEntries<SkeletonShimmerDirection> getEntries() {
        return f43695c;
    }

    SkeletonShimmerDirection(int i11) {
        this.stableId = i11;
    }
}
