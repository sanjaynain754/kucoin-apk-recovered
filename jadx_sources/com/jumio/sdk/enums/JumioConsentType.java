package com.jumio.sdk.enums;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/sdk/enums/JumioConsentType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "PASSIVE", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum JumioConsentType {
    ACTIVE,
    PASSIVE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/sdk/enums/JumioConsentType$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/sdk/enums/JumioConsentType;", TypedValues.Custom.S_STRING, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nJumioConsentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioConsentType.kt\ncom/jumio/sdk/enums/JumioConsentType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
    public static final class Companion {
        @NotNull
        public final JumioConsentType fromString(@NotNull String string) {
            JumioConsentType next;
            String strName;
            String upperCase;
            Intrinsics.checkNotNullParameter(string, "string");
            Iterator<JumioConsentType> it = JumioConsentType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strName = next.name();
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                upperCase = string.toUpperCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } while (!Intrinsics.areEqual(strName, upperCase));
            JumioConsentType jumioConsentType = next;
            return jumioConsentType == null ? JumioConsentType.ACTIVE : jumioConsentType;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @NotNull
    public static EnumEntries<JumioConsentType> getEntries() {
        return $ENTRIES;
    }
}
