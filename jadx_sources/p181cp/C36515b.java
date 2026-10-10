package p181cp;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cp.b */
/* JADX INFO: compiled from: LiquidationBizType.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0000¨\u0006\u0005"}, m90084d2 = {"getLiquidationBizTypeList", "", "Lcom/kubi/margin/constant/LiquidationBizType;", "mapLiquidationBizType", "", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36515b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<AbstractC36514a> m81759a() {
        return CollectionsKt.listOf((Object[]) new AbstractC36514a[]{AbstractC36514a.a.f79342c, AbstractC36514a.b.f79343c, AbstractC36514a.c.f79344c});
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC36514a m81760b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractC36514a.a aVar = AbstractC36514a.a.f79342c;
        if (!Intrinsics.areEqual(str, aVar.getF79341b())) {
            AbstractC36514a.b bVar = AbstractC36514a.b.f79343c;
            if (Intrinsics.areEqual(str, bVar.getF79341b())) {
                return bVar;
            }
            AbstractC36514a.c cVar = AbstractC36514a.c.f79344c;
            if (Intrinsics.areEqual(str, cVar.getF79341b())) {
                return cVar;
            }
        }
        return aVar;
    }
}
