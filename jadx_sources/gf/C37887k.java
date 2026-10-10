package gf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.data.coin.AccountType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gf.k */
/* JADX INFO: compiled from: TransferType.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/data/coin/Direction;", "", "from", "Lcom/kubi/data/coin/AccountType;", TypedValues.TransitionType.S_TO, "", "<init>", "(Lcom/kubi/data/coin/AccountType;Ljava/util/List;)V", "getFrom", "()Lcom/kubi/data/coin/AccountType;", "getTo", "()Ljava/util/List;", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37887k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AccountType f85267a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<AccountType> f85268b;

    /* JADX WARN: Multi-variable type inference failed */
    public C37887k(@NotNull AccountType from, @NotNull List<? extends AccountType> to2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        this.f85267a = from;
        this.f85268b = to2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccountType getF85267a() {
        return this.f85267a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<AccountType> m85582b() {
        return this.f85268b;
    }
}
