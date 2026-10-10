package p038bc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: bc.c */
/* JADX INFO: compiled from: ToggleCardSelectedMode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/component/dialog/ToggleCardSelectedMode;", "", "ItemSelected", "SwitchSelected", "Lcom/kubi/component/dialog/ToggleCardSelectedMode$ItemSelected;", "Lcom/kubi/component/dialog/ToggleCardSelectedMode$SwitchSelected;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4549c {

    /* JADX INFO: renamed from: bc.c$a */
    /* JADX INFO: compiled from: ToggleCardSelectedMode.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/component/dialog/ToggleCardSelectedMode$ItemSelected;", "Lcom/kubi/component/dialog/ToggleCardSelectedMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements InterfaceC4549c {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f4002a = new a();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "ItemSelected";
        }

        public int hashCode() {
            return 640641045;
        }
    }

    /* JADX INFO: renamed from: bc.c$b */
    /* JADX INFO: compiled from: ToggleCardSelectedMode.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/component/dialog/ToggleCardSelectedMode$SwitchSelected;", "Lcom/kubi/component/dialog/ToggleCardSelectedMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements InterfaceC4549c {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f4003a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "SwitchSelected";
        }

        public int hashCode() {
            return 304004470;
        }
    }
}
