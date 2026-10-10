package p852kotlin.random;

import com.tencent.bugly.proguard.C33954u6;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "<init>", "()V", "implStorage", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", C33954u6.f72233d, "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    @NotNull
    private final FallbackThreadLocalRandom$implStorage$1 implStorage = new ThreadLocal<Random>() { // from class: kotlin.random.FallbackThreadLocalRandom$implStorage$1
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    };

    @Override // p852kotlin.random.AbstractPlatformRandom
    @NotNull
    public Random getImpl() {
        Random random = get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
