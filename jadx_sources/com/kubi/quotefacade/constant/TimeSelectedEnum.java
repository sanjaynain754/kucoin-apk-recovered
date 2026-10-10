package com.kubi.quotefacade.constant;

import com.kubi.quotefacade.R$string;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TimeSelectedEnum.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/TimeSelectedEnum;", "", "constTimeTag", "", "resourceId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getConstTimeTag", "()Ljava/lang/String;", "getResourceId", "()I", "TIME_5_MINUTES", "TIME_1_HOUR", "TIME_4_HOURS", "TIME_24_HOURS", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum TimeSelectedEnum {
    TIME_5_MINUTES("5m", R$string.quote_chain_time_five_min),
    TIME_1_HOUR("1h", R$string.quote_chain_time_one_hour),
    TIME_4_HOURS("4h", R$string.quote_chain_time_four_hour),
    TIME_24_HOURS("24h", R$string.quote_chain_time_one_day);


    @NotNull
    private final String constTimeTag;
    private final int resourceId;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f41653c = EnumEntriesKt.enumEntries(m51047a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: TimeSelectedEnum.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/TimeSelectedEnum$Companion;", "", "<init>", "()V", "findEnumByConstTag", "Lcom/kubi/quotefacade/constant/TimeSelectedEnum;", "constTag", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTimeSelectedEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSelectedEnum.kt\ncom/kubi/quotefacade/constant/TimeSelectedEnum$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final TimeSelectedEnum findEnumByConstTag(@NotNull String constTag) {
            TimeSelectedEnum next;
            Intrinsics.checkNotNullParameter(constTag, "constTag");
            Iterator<TimeSelectedEnum> it = TimeSelectedEnum.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getConstTimeTag(), constTag)) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    @NotNull
    public static EnumEntries<TimeSelectedEnum> getEntries() {
        return f41653c;
    }

    @NotNull
    public final String getConstTimeTag() {
        return this.constTimeTag;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    TimeSelectedEnum(String str, int i11) {
        this.constTimeTag = str;
        this.resourceId = i11;
    }
}
