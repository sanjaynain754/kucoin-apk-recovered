package com.jumio.sdk.document;

import android.content.Context;
import com.jumio.core.C9301R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioDocumentType;", "", "<init>", "(Ljava/lang/String;I)V", "PASSPORT", "VISA", "DRIVING_LICENSE", "ID_CARD", "toString", "", "getLocalizedName", "c", "Landroid/content/Context;", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum JumioDocumentType {
    PASSPORT,
    VISA,
    DRIVING_LICENSE,
    ID_CARD;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioDocumentType$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/sdk/document/JumioDocumentType;", "id", "", "fromLocalizedName", "localizedDocument", "c", "Landroid/content/Context;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @Nullable
        public final JumioDocumentType fromLocalizedName(@NotNull String localizedDocument, @NotNull Context c11) {
            Intrinsics.checkNotNullParameter(localizedDocument, "localizedDocument");
            Intrinsics.checkNotNullParameter(c11, "c");
            if (Intrinsics.areEqual(localizedDocument, c11.getString(C9301R.string.jumio_idtype_pp))) {
                return JumioDocumentType.PASSPORT;
            }
            if (Intrinsics.areEqual(localizedDocument, c11.getString(C9301R.string.jumio_idtype_dl))) {
                return JumioDocumentType.DRIVING_LICENSE;
            }
            if (Intrinsics.areEqual(localizedDocument, c11.getString(C9301R.string.jumio_idtype_visa))) {
                return JumioDocumentType.VISA;
            }
            if (Intrinsics.areEqual(localizedDocument, c11.getString(C9301R.string.jumio_idtype_id))) {
                return JumioDocumentType.ID_CARD;
            }
            return null;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final JumioDocumentType fromString(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            switch (id2.hashCode()) {
                case -1895130188:
                    if (id2.equals("ID_CARD")) {
                        return JumioDocumentType.ID_CARD;
                    }
                    return null;
                case -1808062583:
                    if (!id2.equals("DRIVING_LICENSE")) {
                        return null;
                    }
                    break;
                case -1302291702:
                    if (!id2.equals("DRIVER_LICENSE")) {
                        return null;
                    }
                    break;
                case 2634817:
                    if (id2.equals("VISA")) {
                        return JumioDocumentType.VISA;
                    }
                    return null;
                case 1999404050:
                    if (id2.equals("PASSPORT")) {
                        return JumioDocumentType.PASSPORT;
                    }
                    return null;
                default:
                    return null;
            }
            return JumioDocumentType.DRIVING_LICENSE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JumioDocumentType.values().length];
            try {
                iArr[JumioDocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JumioDocumentType.VISA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JumioDocumentType.DRIVING_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JumioDocumentType.ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static EnumEntries<JumioDocumentType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getLocalizedName(@NotNull Context c11) {
        String string;
        Intrinsics.checkNotNullParameter(c11, "c");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            string = c11.getString(C9301R.string.jumio_idtype_pp);
        } else if (i11 == 2) {
            string = c11.getString(C9301R.string.jumio_idtype_visa);
        } else if (i11 == 3) {
            string = c11.getString(C9301R.string.jumio_idtype_dl);
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = c11.getString(C9301R.string.jumio_idtype_id);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return "PASSPORT";
        }
        if (i11 == 2) {
            return "VISA";
        }
        if (i11 == 3) {
            return "DRIVING_LICENSE";
        }
        if (i11 == 4) {
            return "ID_CARD";
        }
        throw new NoWhenBranchMatchedException();
    }
}
