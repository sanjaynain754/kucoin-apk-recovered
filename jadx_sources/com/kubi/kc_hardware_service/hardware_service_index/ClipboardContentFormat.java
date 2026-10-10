package com.kubi.kc_hardware_service.hardware_service_index;

import androidx.webkit.internal.AssetHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClipboardHelper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kc_hardware_service/hardware_service_index/ClipboardContentFormat;", "", "encodedName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PLAIN_TEXT", "Companion", "hardware_service_index_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum ClipboardContentFormat {
    PLAIN_TEXT(AssetHelper.DEFAULT_MIME_TYPE);


    @NotNull
    private final String encodedName;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f27575c = EnumEntriesKt.enumEntries(m31862a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ClipboardHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kc_hardware_service/hardware_service_index/ClipboardContentFormat$Companion;", "", "<init>", "()V", "fromValue", "Lcom/kubi/kc_hardware_service/hardware_service_index/ClipboardContentFormat;", "encodedName", "", "hardware_service_index_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ClipboardContentFormat fromValue(@NotNull String encodedName) throws NoSuchFieldException {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            for (ClipboardContentFormat clipboardContentFormat : ClipboardContentFormat.values()) {
                if (Intrinsics.areEqual(clipboardContentFormat.encodedName, encodedName)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + encodedName);
        }
    }

    @NotNull
    public static EnumEntries<ClipboardContentFormat> getEntries() {
        return f27575c;
    }

    ClipboardContentFormat(String str) {
        this.encodedName = str;
    }
}
