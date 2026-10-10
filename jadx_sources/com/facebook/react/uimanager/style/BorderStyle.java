package com.facebook.react.uimanager.style;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BorderStyle.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/BorderStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "DASHED", "DOTTED", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public enum BorderStyle {
    SOLID,
    DASHED,
    DOTTED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: BorderStyle.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/BorderStyle$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/BorderStyle;", "borderStyle", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final BorderStyle fromString(@NotNull String borderStyle) {
            Intrinsics.checkNotNullParameter(borderStyle, "borderStyle");
            String lowerCase = borderStyle.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1338941519) {
                if (lowerCase.equals("dashed")) {
                    return BorderStyle.DASHED;
                }
                return null;
            }
            if (iHashCode == -1325970902) {
                if (lowerCase.equals("dotted")) {
                    return BorderStyle.DOTTED;
                }
                return null;
            }
            if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                return BorderStyle.SOLID;
            }
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final BorderStyle fromString(@NotNull String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<BorderStyle> getEntries() {
        return $ENTRIES;
    }
}
