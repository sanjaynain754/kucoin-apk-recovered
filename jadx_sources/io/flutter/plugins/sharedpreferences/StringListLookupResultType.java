package io.flutter.plugins.sharedpreferences;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MessagesAsync.g.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "PLATFORM_ENCODED", "JSON_ENCODED", "UNEXPECTED_STRING", "Companion", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum StringListLookupResultType {
    PLATFORM_ENCODED(0),
    JSON_ENCODED(1),
    UNEXPECTED_STRING(2);

    private final int raw;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: MessagesAsync.g.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/StringListLookupResultType$Companion;", "", "<init>", "()V", "ofRaw", "Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "raw", "", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMessagesAsync.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesAsync.g.kt\nio/flutter/plugins/sharedpreferences/StringListLookupResultType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,576:1\n1310#2,2:577\n*S KotlinDebug\n*F\n+ 1 MessagesAsync.g.kt\nio/flutter/plugins/sharedpreferences/StringListLookupResultType$Companion\n*L\n57#1:577,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final StringListLookupResultType ofRaw(int raw) {
            for (StringListLookupResultType stringListLookupResultType : StringListLookupResultType.values()) {
                if (stringListLookupResultType.getRaw() == raw) {
                    return stringListLookupResultType;
                }
            }
            return null;
        }
    }

    @NotNull
    public static EnumEntries<StringListLookupResultType> getEntries() {
        return $ENTRIES;
    }

    public final int getRaw() {
        return this.raw;
    }

    StringListLookupResultType(int i11) {
        this.raw = i11;
    }
}
