package com.kubi.quotefacade.constant;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaConstant.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/AlphaMenu;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "ALL", "NEW", "ONDO", "CAP", "HOLDERS", "TXCOUNT", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum AlphaMenu {
    ALL("ALL_TRADABLE"),
    NEW("ALL_RECENTLY_PUBLISHED"),
    ONDO("ON_DO"),
    CAP("marketCup"),
    HOLDERS("holders"),
    TXCOUNT("txCount");


    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f41644c = EnumEntriesKt.enumEntries(m51043a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AlphaConstant.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/AlphaMenu$Companion;", "", "<init>", "()V", "findByType", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "type", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAlphaConstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaConstant.kt\ncom/kubi/quotefacade/constant/AlphaMenu$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final AlphaMenu findByType(@Nullable String type) {
            AlphaMenu next;
            Iterator<AlphaMenu> it = AlphaMenu.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getType(), type)) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    @JvmStatic
    @Nullable
    public static final AlphaMenu findByType(@Nullable String str) {
        return INSTANCE.findByType(str);
    }

    @NotNull
    public static EnumEntries<AlphaMenu> getEntries() {
        return f41644c;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    AlphaMenu(String str) {
        this.type = str;
    }
}
