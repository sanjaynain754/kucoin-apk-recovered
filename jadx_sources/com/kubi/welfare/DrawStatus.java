package com.kubi.welfare;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DrawStatus.kt */
/* JADX INFO: loaded from: classes58.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/welfare/DrawStatus;", "", "status", "", "str", "color", "<init>", "(Ljava/lang/String;IIII)V", "getStatus", "()I", "getStr", "getColor", "NOT_DRAW", "IN_AWARD", "HAS_DRAW", "Companion", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum DrawStatus {
    NOT_DRAW(1, R$string.has_not_draw, R$color.secondary),
    IN_AWARD(2, R$string.withdrawaling, R$color.primary),
    HAS_DRAW(3, R$string.has_draw, R$color.emphasis60);

    private final int color;
    private final int status;
    private final int str;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f54801c = EnumEntriesKt.enumEntries(m67012a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: DrawStatus.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/welfare/DrawStatus$Companion;", "", "<init>", "()V", "valueOfInt", "Lcom/kubi/welfare/DrawStatus;", "status", "", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDrawStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawStatus.kt\ncom/kubi/welfare/DrawStatus$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,24:1\n13472#2,2:25\n*S KotlinDebug\n*F\n+ 1 DrawStatus.kt\ncom/kubi/welfare/DrawStatus$Companion\n*L\n17#1:25,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final DrawStatus valueOfInt(int status) {
            for (DrawStatus drawStatus : DrawStatus.values()) {
                if (drawStatus.getStatus() == status) {
                    return drawStatus;
                }
            }
            return null;
        }
    }

    @NotNull
    public static EnumEntries<DrawStatus> getEntries() {
        return f54801c;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getStr() {
        return this.str;
    }

    DrawStatus(int i11, int i12, int i13) {
        this.status = i11;
        this.str = i12;
        this.color = i13;
    }
}
