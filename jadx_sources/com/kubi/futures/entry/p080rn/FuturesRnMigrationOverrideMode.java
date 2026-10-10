package com.kubi.futures.entry.p080rn;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesRnMigrationOverrideMode.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnMigrationOverrideMode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FOLLOW_CLOUD", "FORCE_ON", "FORCE_OFF", "resolve", "", "cloudEnabled", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum FuturesRnMigrationOverrideMode {
    FOLLOW_CLOUD("follow_cloud"),
    FORCE_ON("force_on"),
    FORCE_OFF("force_off");


    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f23040c = EnumEntriesKt.enumEntries(m25554a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: FuturesRnMigrationOverrideMode.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnMigrationOverrideMode$Companion;", "", "<init>", "()V", "fromValue", "Lcom/kubi/futures/entry/rn/FuturesRnMigrationOverrideMode;", "value", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFuturesRnMigrationOverrideMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesRnMigrationOverrideMode.kt\ncom/kubi/futures/entry/rn/FuturesRnMigrationOverrideMode$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n295#2,2:29\n*S KotlinDebug\n*F\n+ 1 FuturesRnMigrationOverrideMode.kt\ncom/kubi/futures/entry/rn/FuturesRnMigrationOverrideMode$Companion\n*L\n25#1:29,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FuturesRnMigrationOverrideMode fromValue(@Nullable String value) {
            FuturesRnMigrationOverrideMode next;
            Iterator<FuturesRnMigrationOverrideMode> it = FuturesRnMigrationOverrideMode.getEntries().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(next.getValue(), value));
            FuturesRnMigrationOverrideMode futuresRnMigrationOverrideMode = next;
            if (futuresRnMigrationOverrideMode == null) {
                return FuturesRnMigrationOverrideMode.FOLLOW_CLOUD;
            }
            return futuresRnMigrationOverrideMode;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.entry.rn.FuturesRnMigrationOverrideMode$a */
    /* JADX INFO: compiled from: FuturesRnMigrationOverrideMode.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C13195a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesRnMigrationOverrideMode.values().length];
            try {
                iArr[FuturesRnMigrationOverrideMode.FOLLOW_CLOUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesRnMigrationOverrideMode.FORCE_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesRnMigrationOverrideMode.FORCE_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static EnumEntries<FuturesRnMigrationOverrideMode> getEntries() {
        return f23040c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final boolean resolve(boolean cloudEnabled) {
        int i11 = C13195a.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return cloudEnabled;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    FuturesRnMigrationOverrideMode(String str) {
        this.value = str;
    }
}
