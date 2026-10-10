package com.kubi.sdk.widget;

import com.kubi.otc.entity.OtcAd;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TitleBar.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/widget/TitleBarMode;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", OtcAd.STATUS_NORMAL, "MINI_PROGRAM", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum TitleBarMode {
    NORMAL(0),
    MINI_PROGRAM(1);

    private final int value;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f48598c = EnumEntriesKt.enumEntries(m58943a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: TitleBar.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/widget/TitleBarMode$Companion;", "", "<init>", "()V", "fromValue", "Lcom/kubi/sdk/widget/TitleBarMode;", "value", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTitleBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TitleBar.kt\ncom/kubi/sdk/widget/TitleBarMode$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n295#2,2:630\n*S KotlinDebug\n*F\n+ 1 TitleBar.kt\ncom/kubi/sdk/widget/TitleBarMode$Companion\n*L\n625#1:630,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TitleBarMode fromValue(int value) {
            TitleBarMode next;
            Iterator<TitleBarMode> it = TitleBarMode.getEntries().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (next.getValue() != value);
            TitleBarMode titleBarMode = next;
            if (titleBarMode == null) {
                return TitleBarMode.NORMAL;
            }
            return titleBarMode;
        }
    }

    @NotNull
    public static EnumEntries<TitleBarMode> getEntries() {
        return f48598c;
    }

    public final int getValue() {
        return this.value;
    }

    TitleBarMode(int i11) {
        this.value = i11;
    }
}
