package p852kotlin.uuid;

import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlin/uuid/SecureRandomHolder;", "", "<init>", "()V", "instance", "Ljava/security/SecureRandom;", "getInstance", "()Ljava/security/SecureRandom;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class SecureRandomHolder {

    @NotNull
    public static final SecureRandomHolder INSTANCE = new SecureRandomHolder();

    @NotNull
    private static final SecureRandom instance = new SecureRandom();

    @NotNull
    public final SecureRandom getInstance() {
        return instance;
    }

    private SecureRandomHolder() {
    }
}
