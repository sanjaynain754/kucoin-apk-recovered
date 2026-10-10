package p852kotlin.random.jdk8;

import com.tencent.bugly.proguard.C33954u6;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.random.AbstractPlatformRandom;

/* JADX INFO: compiled from: PlatformThreadLocalRandom.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "<init>", "()V", C33954u6.f72233d, "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextInt", "", "from", "until", "nextLong", "", "nextDouble", "", "kotlin-stdlib-jdk8"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // p852kotlin.random.Random
    public long nextLong(long until) {
        return ThreadLocalRandom.current().nextLong(until);
    }

    @Override // p852kotlin.random.Random
    public long nextLong(long from, long until) {
        return ThreadLocalRandom.current().nextLong(from, until);
    }

    @Override // p852kotlin.random.AbstractPlatformRandom
    @NotNull
    public Random getImpl() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // p852kotlin.random.Random
    public double nextDouble(double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }

    @Override // p852kotlin.random.Random
    public int nextInt(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }
}
