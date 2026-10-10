package com.kubi.home.realtime;

import com.google.android.gms.stats.CodePackage;
import com.kubi.home.api.R$string;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RealTimeViewType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/home/realtime/RealTimeViewType;", "", "typeName", "", "stringId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getTypeName", "()Ljava/lang/String;", "getStringId", "()I", CodePackage.COMMON, "NEW_COIN", "GEM_POOL", "WELFARE_BONUS", "Companion", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum RealTimeViewType {
    COMMON("Common", 0),
    NEW_COIN("NewCoin", R$string.home_card_activity_title_new_coin),
    GEM_POOL("GemPool", R$string.home_card_activity_title_gempool),
    WELFARE_BONUS("WelfareBonus", R$string.home_card_activity_title_bonus);

    private final int stringId;

    @NotNull
    private final String typeName;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f26090c = EnumEntriesKt.enumEntries(m30037a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: RealTimeViewType.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/realtime/RealTimeViewType$Companion;", "", "<init>", "()V", "tryParse", "Lcom/kubi/home/realtime/RealTimeViewType;", "typeName", "", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRealTimeViewType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeViewType.kt\ncom/kubi/home/realtime/RealTimeViewType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final RealTimeViewType tryParse(@NotNull String typeName) {
            RealTimeViewType next;
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Iterator<RealTimeViewType> it = RealTimeViewType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getTypeName(), typeName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    @NotNull
    public static EnumEntries<RealTimeViewType> getEntries() {
        return f26090c;
    }

    public final int getStringId() {
        return this.stringId;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    RealTimeViewType(String str, int i11) {
        this.typeName = str;
        this.stringId = i11;
    }
}
