package p852kotlin.random;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0013B9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "x", "", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "nextInt", "nextBits", "bitCount", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class XorWowRandom extends Random implements Serializable {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: compiled from: XorWowRandom.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public XorWowRandom(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.x = i11;
        this.y = i12;
        this.z = i13;
        this.w = i14;
        this.v = i15;
        this.addend = i16;
        if ((i11 | i12 | i13 | i14 | i15) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i17 = 0; i17 < 64; i17++) {
            nextInt();
        }
    }

    @Override // p852kotlin.random.Random
    public int nextInt() {
        int i11 = this.x;
        int i12 = i11 ^ (i11 >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i13 = this.v;
        this.w = i13;
        int i14 = ((i12 ^ (i12 << 1)) ^ i13) ^ (i13 << 4);
        this.v = i14;
        int i15 = this.addend + 362437;
        this.addend = i15;
        return i14 + i15;
    }

    @Override // p852kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(nextInt(), bitCount);
    }

    public XorWowRandom(int i11, int i12) {
        this(i11, i12, 0, 0, ~i11, (i11 << 10) ^ (i12 >>> 4));
    }
}
