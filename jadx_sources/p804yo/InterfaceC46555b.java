package p804yo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: yo.b */
/* JADX INFO: compiled from: MarginType.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/define/MarginType;", "", "typeString", "", "getTypeString", "()Ljava/lang/String;", "typeInt", "", "getTypeInt", "()I", "Cross", "Isolate", "Lcom/kubi/margin/api/define/MarginType$Cross;", "Lcom/kubi/margin/api/define/MarginType$Isolate;", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46555b {

    /* JADX INFO: renamed from: yo.b$a */
    /* JADX INFO: compiled from: MarginType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/api/define/MarginType$Cross;", "Lcom/kubi/margin/api/define/MarginType;", "<init>", "()V", "typeString", "", "getTypeString", "()Ljava/lang/String;", "typeInt", "", "getTypeInt", "()I", "equals", "", "other", "", "hashCode", "toString", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements InterfaceC46555b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f104307a = new a();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final String f104308b = "cross";

        /* JADX INFO: renamed from: c */
        public static final int f104309c = 1;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @Override // p804yo.InterfaceC46555b
        /* JADX INFO: renamed from: a */
        public int mo102698a() {
            return f104309c;
        }

        @Override // p804yo.InterfaceC46555b
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo102699b() {
            return f104308b;
        }

        @NotNull
        public String toString() {
            return "Cross";
        }

        public int hashCode() {
            return -1667426039;
        }
    }

    /* JADX INFO: renamed from: yo.b$b */
    /* JADX INFO: compiled from: MarginType.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/api/define/MarginType$Isolate;", "Lcom/kubi/margin/api/define/MarginType;", "<init>", "()V", "typeString", "", "getTypeString", "()Ljava/lang/String;", "typeInt", "", "getTypeInt", "()I", "equals", "", "other", "", "hashCode", "toString", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements InterfaceC46555b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f104310a = new b();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final String f104311b = "isolated";

        /* JADX INFO: renamed from: c */
        public static final int f104312c = 2;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @Override // p804yo.InterfaceC46555b
        /* JADX INFO: renamed from: a */
        public int mo102698a() {
            return f104312c;
        }

        @Override // p804yo.InterfaceC46555b
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo102699b() {
            return f104311b;
        }

        @NotNull
        public String toString() {
            return "Isolate";
        }

        public int hashCode() {
            return 684839732;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo102698a();

    @NotNull
    /* JADX INFO: renamed from: b */
    String mo102699b();
}
