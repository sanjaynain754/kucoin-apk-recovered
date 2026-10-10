package p852kotlin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lkotlin/KotlinVersionCurrentValue;", "", "<init>", "()V", "get", "Lkotlin/KotlinVersion;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class KotlinVersionCurrentValue {

    @NotNull
    public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();

    @JvmStatic
    @NotNull
    public static final KotlinVersion get() {
        return new KotlinVersion(2, 2, 10);
    }

    private KotlinVersionCurrentValue() {
    }
}
