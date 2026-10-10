package p804yo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yo.a */
/* JADX INFO: compiled from: MarginTradeHistoryType.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/api/define/MarginTradeHistoryType;", "", "index", "", "<init>", "(I)V", "getIndex", "()I", "CurrentDelegate", "Lcom/kubi/margin/api/define/MarginTradeHistoryType$CurrentDelegate;", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC46554a {

    /* JADX INFO: renamed from: a */
    public final int f104305a;

    /* JADX INFO: renamed from: yo.a$a */
    /* JADX INFO: compiled from: MarginTradeHistoryType.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/margin/api/define/MarginTradeHistoryType$CurrentDelegate;", "Lcom/kubi/margin/api/define/MarginTradeHistoryType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a extends AbstractC46554a {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final a f104306b = new a();

        public a() {
            super(0, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "CurrentDelegate";
        }

        public int hashCode() {
            return -555685161;
        }
    }

    public /* synthetic */ AbstractC46554a(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public AbstractC46554a(int i11) {
        this.f104305a = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF104305a() {
        return this.f104305a;
    }
}
