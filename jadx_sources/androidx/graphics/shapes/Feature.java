package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Features.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0002\f\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH ¢\u0006\u0002\b\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Landroidx/graphics/shapes/Feature;", "", "cubics", "", "Landroidx/graphics/shapes/Cubic;", "(Ljava/util/List;)V", "getCubics", "()Ljava/util/List;", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed$graphics_shapes_release", "Corner", "Edge", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class Feature {

    @NotNull
    private final List<Cubic> cubics;

    /* JADX INFO: compiled from: Features.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0010¢\u0006\u0002\b\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\b\u001a\u00060\u0006j\u0002`\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m90084d2 = {"Landroidx/graphics/shapes/Feature$Corner;", "Landroidx/graphics/shapes/Feature;", "cubics", "", "Landroidx/graphics/shapes/Cubic;", "vertex", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "roundedCenter", "convex", "", "(Ljava/util/List;JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConvex", "()Z", "getRoundedCenter-1ufDz9w", "()J", "J", "getVertex-1ufDz9w", "toString", "", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed$graphics_shapes_release", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Corner extends Feature {
        private final boolean convex;

        /* JADX INFO: renamed from: roundedCenter, reason: from kotlin metadata and from toString */
        private final long center;
        private final long vertex;

        public /* synthetic */ Corner(List list, long j11, long j12, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j11, j12, z11);
        }

        public /* synthetic */ Corner(List list, long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j11, j12, (i11 & 8) != 0 ? true : z11, null);
        }

        public final boolean getConvex() {
            return this.convex;
        }

        /* JADX INFO: renamed from: getRoundedCenter-1ufDz9w, reason: not valid java name and from getter */
        public final long getCenter() {
            return this.center;
        }

        /* JADX INFO: renamed from: getVertex-1ufDz9w, reason: not valid java name and from getter */
        public final long getVertex() {
            return this.vertex;
        }

        @NotNull
        public String toString() {
            return "Corner: vertex=" + ((Object) FloatFloatPair.m103455toStringimpl(this.vertex)) + ", center=" + ((Object) FloatFloatPair.m103455toStringimpl(this.center)) + ", convex=" + this.convex;
        }

        @Override // androidx.graphics.shapes.Feature
        @NotNull
        public Feature transformed$graphics_shapes_release(@NotNull PointTransformer f11) {
            Intrinsics.checkNotNullParameter(f11, "f");
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int size = getCubics().size();
            for (int i11 = 0; i11 < size; i11++) {
                listCreateListBuilder.add(getCubics().get(i11).transformed(f11));
            }
            return new Corner(CollectionsKt.build(listCreateListBuilder), PointKt.m103569transformedso9K2fw(this.vertex, f11), PointKt.m103569transformedso9K2fw(this.center, f11), this.convex, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Corner(List<? extends Cubic> cubics, long j11, long j12, boolean z11) {
            super(cubics);
            Intrinsics.checkNotNullParameter(cubics, "cubics");
            this.vertex = j11;
            this.center = j12;
            this.convex = z11;
        }
    }

    /* JADX INFO: compiled from: Features.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/graphics/shapes/Feature$Edge;", "Landroidx/graphics/shapes/Feature;", "cubics", "", "Landroidx/graphics/shapes/Cubic;", "(Ljava/util/List;)V", "toString", "", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed$graphics_shapes_release", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Edge extends Feature {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edge(@NotNull List<? extends Cubic> cubics) {
            super(cubics);
            Intrinsics.checkNotNullParameter(cubics, "cubics");
        }

        @NotNull
        public String toString() {
            return "Edge";
        }

        @Override // androidx.graphics.shapes.Feature
        @NotNull
        public Edge transformed$graphics_shapes_release(@NotNull PointTransformer f11) {
            Intrinsics.checkNotNullParameter(f11, "f");
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int size = getCubics().size();
            for (int i11 = 0; i11 < size; i11++) {
                listCreateListBuilder.add(getCubics().get(i11).transformed(f11));
            }
            return new Edge(CollectionsKt.build(listCreateListBuilder));
        }
    }

    @NotNull
    public abstract Feature transformed$graphics_shapes_release(@NotNull PointTransformer f11);

    /* JADX WARN: Multi-variable type inference failed */
    public Feature(@NotNull List<? extends Cubic> cubics) {
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.cubics = cubics;
    }

    @NotNull
    public final List<Cubic> getCubics() {
        return this.cubics;
    }
}
