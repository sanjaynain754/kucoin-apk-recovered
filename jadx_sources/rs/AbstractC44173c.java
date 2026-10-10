package rs;

import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rs.c */
/* JADX INFO: compiled from: NumberMode.kt */
/* JADX INFO: loaded from: classes31.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/numeric/kit/NumberMode;", "", "precision", "", "scaleText", "", "<init>", "(IZ)V", "getPrecision", "()I", "getScaleText", "()Z", "Less", "Scientific", "Lcom/kubi/numeric/kit/NumberMode$Less;", "Lcom/kubi/numeric/kit/NumberMode$Scientific;", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC44173c {

    /* JADX INFO: renamed from: a */
    public final int f97512a;

    /* JADX INFO: renamed from: b */
    public final boolean f97513b;

    /* JADX INFO: renamed from: rs.c$a */
    /* JADX INFO: compiled from: NumberMode.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/numeric/kit/NumberMode$Less;", "Lcom/kubi/numeric/kit/NumberMode;", "precision", "", "scaleText", "", "<init>", "(IZ)V", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends AbstractC44173c {
        public a(int i11, boolean z11) {
            super(i11, z11, null);
        }

        public /* synthetic */ a(int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 6 : i11, (i12 & 2) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: rs.c$b */
    /* JADX INFO: compiled from: NumberMode.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/numeric/kit/NumberMode$Scientific;", "Lcom/kubi/numeric/kit/NumberMode;", "precision", "", "scaleText", "", "<init>", "(IZ)V", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends AbstractC44173c {
        public /* synthetic */ b(int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 14 : i11, (i12 & 2) != 0 ? true : z11);
        }

        public b(int i11, boolean z11) {
            super(i11, z11, null);
        }
    }

    public /* synthetic */ AbstractC44173c(int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11);
    }

    public AbstractC44173c(int i11, boolean z11) {
        this.f97512a = i11;
        this.f97513b = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF97513b() {
        return this.f97513b;
    }
}
