package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class UnwrappedType extends KotlinType {
    public /* synthetic */ UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract UnwrappedType makeNullableAsSpecified(boolean z11);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public abstract UnwrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    public abstract UnwrappedType replaceAttributes(@NotNull TypeAttributes typeAttributes);

    private UnwrappedType() {
        super(null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public final UnwrappedType unwrap() {
        return this;
    }
}
