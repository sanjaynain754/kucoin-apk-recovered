package com.kubi.assets.sort;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AccountTabSortData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/sort/SortType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DEFAULT", "MANUAL", "VALUE_DESC", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SortType {
    DEFAULT("DEFAULT"),
    MANUAL("MANUAL"),
    VALUE_DESC("VALUE_DESC");


    @NotNull
    private final String serverValue;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f18775c = EnumEntriesKt.enumEntries(m19341a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/sort/SortType$Companion;", "", "<init>", "()V", "fromServerValue", "Lcom/kubi/assets/sort/SortType;", "value", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAccountTabSortData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortData.kt\ncom/kubi/assets/sort/SortType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SortType fromServerValue(@Nullable String value) {
            SortType next;
            Iterator<SortType> it = SortType.getEntries().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(next.getServerValue(), value));
            SortType sortType = next;
            if (sortType == null) {
                return SortType.DEFAULT;
            }
            return sortType;
        }
    }

    @NotNull
    public static EnumEntries<SortType> getEntries() {
        return f18775c;
    }

    @NotNull
    public final String getServerValue() {
        return this.serverValue;
    }

    SortType(String str) {
        this.serverValue = str;
    }
}
