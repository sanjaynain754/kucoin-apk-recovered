package kotlinx.serialization.internal;

import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: kotlinx.serialization.internal.x0 */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lkotlinx/serialization/internal/x0;", "Lkotlin/reflect/KType;", "origin", "<init>", "(Lkotlin/reflect/KType;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/reflect/KType;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", DocumentClassifier.KEY_SIDE, "isMarkedNullable", "()Z", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41899x0 implements KType {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final KType origin;

    public boolean equals(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        KType kType = this.origin;
        C41899x0 c41899x0 = other instanceof C41899x0 ? (C41899x0) other : null;
        if (!Intrinsics.areEqual(kType, c41899x0 != null ? c41899x0.origin : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = other instanceof KType ? (KType) other : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    public C41899x0(@NotNull KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // p852kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    @Override // p852kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.origin.getArguments();
    }

    @Override // p852kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return this.origin.getClassifier();
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    @Override // p852kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    @NotNull
    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
