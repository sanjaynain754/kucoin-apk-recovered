package p852kotlin.reflect;

import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;

/* JADX INFO: compiled from: KType.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lkotlin/reflect/KType;", "Lkotlin/reflect/KAnnotatedElement;", DocumentClassifier.KEY_SIDE, "Lkotlin/reflect/KClassifier;", "getClassifier$annotations", "()V", "getClassifier", "()Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "getArguments$annotations", "getArguments", "()Ljava/util/List;", "isMarkedNullable", "", "()Z", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KType extends KAnnotatedElement {
    @NotNull
    List<KTypeProjection> getArguments();

    @Nullable
    KClassifier getClassifier();

    boolean isMarkedNullable();

    /* JADX INFO: compiled from: KType.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getArguments$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getClassifier$annotations() {
        }
    }
}
