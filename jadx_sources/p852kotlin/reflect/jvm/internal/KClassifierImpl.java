package p852kotlin.reflect.jvm.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

/* JADX INFO: compiled from: KClassifierImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KClassifierImpl;", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassifierDescriptor;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KClassifierImpl {
    @NotNull
    ClassifierDescriptor getDescriptor();
}
