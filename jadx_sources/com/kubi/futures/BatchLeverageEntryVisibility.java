package com.kubi.futures;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesRemote.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/BatchLeverageEntryVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "HIDE", "EXCLUDE_AU", "ALL", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum BatchLeverageEntryVisibility {
    HIDE,
    EXCLUDE_AU,
    ALL;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f22522c = EnumEntriesKt.enumEntries(m24430a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: FuturesRemote.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/BatchLeverageEntryVisibility$Companion;", "", "<init>", "()V", "fromRemoteValue", "Lcom/kubi/futures/BatchLeverageEntryVisibility;", "value", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFuturesRemote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesRemote.kt\ncom/kubi/futures/BatchLeverageEntryVisibility$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n295#2,2:100\n*S KotlinDebug\n*F\n+ 1 FuturesRemote.kt\ncom/kubi/futures/BatchLeverageEntryVisibility$Companion\n*L\n13#1:100,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BatchLeverageEntryVisibility fromRemoteValue(@Nullable String value) {
            BatchLeverageEntryVisibility batchLeverageEntryVisibility;
            Iterator<BatchLeverageEntryVisibility> it = BatchLeverageEntryVisibility.getEntries().iterator();
            while (true) {
                batchLeverageEntryVisibility = null;
                String string = null;
                if (!it.hasNext()) {
                    break;
                }
                BatchLeverageEntryVisibility next = it.next();
                String strName = next.name();
                if (value != null) {
                    string = StringsKt.trim((CharSequence) value).toString();
                }
                if (StringsKt.equals(strName, string, true)) {
                    batchLeverageEntryVisibility = next;
                    break;
                }
            }
            BatchLeverageEntryVisibility batchLeverageEntryVisibility2 = batchLeverageEntryVisibility;
            if (batchLeverageEntryVisibility2 == null) {
                return BatchLeverageEntryVisibility.EXCLUDE_AU;
            }
            return batchLeverageEntryVisibility2;
        }
    }

    @NotNull
    public static EnumEntries<BatchLeverageEntryVisibility> getEntries() {
        return f22522c;
    }
}
