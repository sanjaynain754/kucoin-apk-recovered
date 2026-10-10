package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
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
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTraderTrialFundStatus;", "", "code", "", "desc", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDesc", "INIT", "ACTIVATE", "ING", "FINISHING", "END", "EXPIRE", "SWITCH", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum LeadTraderTrialFundStatus {
    INIT("INIT", "待使用（未激活）"),
    ACTIVATE("ACTIVATE", "已激活"),
    ING("ING", "使用中"),
    FINISHING("FINISHING", "结束中"),
    END("END", "已完成"),
    EXPIRE("EXPIRE", "已过期"),
    SWITCH("SWITCH", "已切换（废弃）");


    @NotNull
    private final String code;

    @NotNull
    private final String desc;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: CopyTdEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTraderTrialFundStatus$Companion;", "", "<init>", "()V", "fromCode", "Lcom/kubi/copytrading/assets/LeadTraderTrialFundStatus;", "raw", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCopyTdEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTdEntity.kt\ncom/kubi/copytrading/assets/LeadTraderTrialFundStatus$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n295#2,2:272\n*S KotlinDebug\n*F\n+ 1 CopyTdEntity.kt\ncom/kubi/copytrading/assets/LeadTraderTrialFundStatus$Companion\n*L\n258#1:272,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final LeadTraderTrialFundStatus fromCode(@Nullable String raw) {
            LeadTraderTrialFundStatus leadTraderTrialFundStatus = null;
            if (raw == null || raw.length() == 0) {
                return null;
            }
            for (LeadTraderTrialFundStatus leadTraderTrialFundStatus2 : LeadTraderTrialFundStatus.getEntries()) {
                if (StringsKt.equals(leadTraderTrialFundStatus2.getCode(), raw, true)) {
                    leadTraderTrialFundStatus = leadTraderTrialFundStatus2;
                    break;
                }
            }
            return leadTraderTrialFundStatus;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @Nullable
    public static final LeadTraderTrialFundStatus fromCode(@Nullable String str) {
        return INSTANCE.fromCode(str);
    }

    @NotNull
    public static EnumEntries<LeadTraderTrialFundStatus> getEntries() {
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

    LeadTraderTrialFundStatus(String str, String str2) {
        this.code = str;
        this.desc = str2;
    }
}
