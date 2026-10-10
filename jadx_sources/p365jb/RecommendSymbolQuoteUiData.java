package p365jb;

import io.reactivex.functions.Consumer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jb.a, reason: from toString */
/* JADX INFO: compiled from: RecommendSymbolQuoteUiData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/data/RecommendSymbolQuoteUiData;", "", "list", "", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "consumer", "Lio/reactivex/functions/Consumer;", "<init>", "(Ljava/util/List;Lio/reactivex/functions/Consumer;)V", "getList", "()Ljava/util/List;", "getConsumer", "()Lio/reactivex/functions/Consumer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecommendSymbolQuoteUiData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final List<InterfaceC40366c> list;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final Consumer<InterfaceC40366c> consumer;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendSymbolQuoteUiData)) {
            return false;
        }
        RecommendSymbolQuoteUiData recommendSymbolQuoteUiData = (RecommendSymbolQuoteUiData) other;
        return Intrinsics.areEqual(this.list, recommendSymbolQuoteUiData.list) && Intrinsics.areEqual(this.consumer, recommendSymbolQuoteUiData.consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendSymbolQuoteUiData(@NotNull List<? extends InterfaceC40366c> list, @NotNull Consumer<InterfaceC40366c> consumer) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.list = list;
        this.consumer = consumer;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Consumer<InterfaceC40366c> m88948a() {
        return this.consumer;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC40366c> m88949b() {
        return this.list;
    }

    public int hashCode() {
        return (this.list.hashCode() * 31) + this.consumer.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecommendSymbolQuoteUiData(list=" + this.list + ", consumer=" + this.consumer + ')';
    }
}
