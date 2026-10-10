package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType;", "", "code", "", "desc", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDesc", "SELF_FUNDS", "LEAD_TRIAL", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum LeadTradingPositionFundsType {
    SELF_FUNDS("selfFunds", "自有类型"),
    LEAD_TRIAL(FuturesWelfareTrialItemEntity.LEAD_TRIAL_FUND_TYPE, "带单体验金");


    @NotNull
    private final String code;

    @NotNull
    private final String desc;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: CopyTdEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType$Companion;", "", "<init>", "()V", "fromCode", "Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType;", "raw", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCopyTdEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTdEntity.kt\ncom/kubi/copytrading/assets/LeadTradingPositionFundsType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n295#2,2:272\n*S KotlinDebug\n*F\n+ 1 CopyTdEntity.kt\ncom/kubi/copytrading/assets/LeadTradingPositionFundsType$Companion\n*L\n80#1:272,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final LeadTradingPositionFundsType fromCode(@Nullable String raw) {
            LeadTradingPositionFundsType leadTradingPositionFundsType = null;
            if (raw == null || raw.length() == 0) {
                return null;
            }
            for (LeadTradingPositionFundsType leadTradingPositionFundsType2 : LeadTradingPositionFundsType.getEntries()) {
                if (StringsKt.equals(leadTradingPositionFundsType2.getCode(), raw, true)) {
                    leadTradingPositionFundsType = leadTradingPositionFundsType2;
                    break;
                }
            }
            return leadTradingPositionFundsType;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @Nullable
    public static final LeadTradingPositionFundsType fromCode(@Nullable String str) {
        return INSTANCE.fromCode(str);
    }

    @NotNull
    public static EnumEntries<LeadTradingPositionFundsType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    LeadTradingPositionFundsType(String str, String str2) {
        this.code = str;
        this.desc = str2;
    }
}
