package p852kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.SetsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, still in use, count: 1, list:
  (r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) from 0x0074: FILLED_NEW_ARRAY 
  (r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r5v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r6v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r7v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r8v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r9v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r10v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
 A[WRAPPED] (LINE:119) elemType: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PrimitiveType.kt */
/* JADX INFO: loaded from: classes23.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    @NotNull
    private final Lazy arrayTypeFqName$delegate;

    @NotNull
    private final Name arrayTypeName;

    @NotNull
    private final Lazy typeFqName$delegate;

    @NotNull
    private final Name typeName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final Set<PrimitiveType> NUMBER_TYPES = SetsKt.setOf((Object[]) new PrimitiveType[]{new PrimitiveType("Char"), new PrimitiveType("Byte"), new PrimitiveType("Short"), new PrimitiveType("Int"), new PrimitiveType("Float"), new PrimitiveType("Long"), new PrimitiveType("Double")});

    /* JADX INFO: compiled from: PrimitiveType.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName arrayTypeFqName_delegate$lambda$1(PrimitiveType primitiveType) {
        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.arrayTypeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName typeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    @NotNull
    public final FqName getArrayTypeFqName() {
        return (FqName) this.arrayTypeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getArrayTypeName() {
        return this.arrayTypeName;
    }

    @NotNull
    public final FqName getTypeFqName() {
        return (FqName) this.typeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }

    private PrimitiveType(String str) {
        super(str, i);
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        this.typeName = nameIdentifier;
        Name nameIdentifier2 = Name.identifier(str + "Array");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        this.arrayTypeName = nameIdentifier2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$0
            private final PrimitiveType arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return PrimitiveType.typeFqName_delegate$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        this.arrayTypeFqName$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$1
            private final PrimitiveType arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return PrimitiveType.arrayTypeFqName_delegate$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }
}
