package com.kubi.resources.widget;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderBookShowView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/OrderBookType;", "", "Companion", "All", "OnlySell", "OnlyBuy", "Lcom/kubi/resources/widget/OrderBookType$All;", "Lcom/kubi/resources/widget/OrderBookType$OnlyBuy;", "Lcom/kubi/resources/widget/OrderBookType$OnlySell;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface OrderBookType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f43982a = Companion.f43983a;

    /* JADX INFO: compiled from: OrderBookShowView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/resources/widget/OrderBookType$Companion;", "", "<init>", "()V", "asString", "", "type", "Lcom/kubi/resources/widget/OrderBookType;", "asType", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f43983a = new Companion();

        @NotNull
        public final String asString(@NotNull OrderBookType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type, C22935a.f43984b)) {
                return "All";
            }
            if (Intrinsics.areEqual(type, C22937c.f43986b)) {
                return "OnlySell";
            }
            if (Intrinsics.areEqual(type, C22936b.f43985b)) {
                return "OnlyBuy";
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final OrderBookType asType(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int iHashCode = type.hashCode();
            if (iHashCode != -2004479682) {
                if (iHashCode != 65921) {
                    if (iHashCode == 350965530 && type.equals("OnlyBuy")) {
                        return C22936b.f43985b;
                    }
                } else if (type.equals("All")) {
                    return C22935a.f43984b;
                }
            } else if (type.equals("OnlySell")) {
                return C22937c.f43986b;
            }
            return C22935a.f43984b;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.OrderBookType$a */
    /* JADX INFO: compiled from: OrderBookShowView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/OrderBookType$All;", "Lcom/kubi/resources/widget/OrderBookType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C22935a implements OrderBookType {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C22935a f43984b = new C22935a();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C22935a);
        }

        @NotNull
        public String toString() {
            return "All";
        }

        public int hashCode() {
            return -596261869;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.OrderBookType$b */
    /* JADX INFO: compiled from: OrderBookShowView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/OrderBookType$OnlyBuy;", "Lcom/kubi/resources/widget/OrderBookType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C22936b implements OrderBookType {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C22936b f43985b = new C22936b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C22936b);
        }

        @NotNull
        public String toString() {
            return "OnlyBuy";
        }

        public int hashCode() {
            return 1295546540;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.OrderBookType$c */
    /* JADX INFO: compiled from: OrderBookShowView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/OrderBookType$OnlySell;", "Lcom/kubi/resources/widget/OrderBookType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C22937c implements OrderBookType {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C22937c f43986b = new C22937c();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C22937c);
        }

        @NotNull
        public String toString() {
            return "OnlySell";
        }

        public int hashCode() {
            return 1507727852;
        }
    }
}
