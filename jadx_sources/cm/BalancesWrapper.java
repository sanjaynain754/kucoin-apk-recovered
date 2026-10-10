package cm;

import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: cm.a, reason: from toString */
/* JADX INFO: compiled from: ComposeUserEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0000J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/BalancesWrapper;", "", "balances", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "throwable", "", "<init>", "(Ljava/util/List;Ljava/lang/Throwable;)V", "getBalances", "()Ljava/util/List;", "getThrowable", "()Ljava/lang/Throwable;", "deepCopy", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nComposeUserEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeUserEntity.kt\ncom/kubi/kumex/data/trade/model/BalancesWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1563#2:72\n1634#2,3:73\n*S KotlinDebug\n*F\n+ 1 ComposeUserEntity.kt\ncom/kubi/kumex/data/trade/model/BalancesWrapper\n*L\n55#1:72\n55#1:73,3\n*E\n"})
public final /* data */ class BalancesWrapper {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final List<SimpleBalanceEntity> balances;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final Throwable throwable;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalancesWrapper)) {
            return false;
        }
        BalancesWrapper balancesWrapper = (BalancesWrapper) other;
        return Intrinsics.areEqual(this.balances, balancesWrapper.balances) && Intrinsics.areEqual(this.throwable, balancesWrapper.throwable);
    }

    public BalancesWrapper(@NotNull List<SimpleBalanceEntity> balances, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.balances = balances;
        this.throwable = th2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<SimpleBalanceEntity> m5306a() {
        return this.balances;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = this.balances.hashCode() * 31;
        Throwable th2 = this.throwable;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @NotNull
    public String toString() {
        return "BalancesWrapper(balances=" + this.balances + ", throwable=" + this.throwable + ')';
    }
}
