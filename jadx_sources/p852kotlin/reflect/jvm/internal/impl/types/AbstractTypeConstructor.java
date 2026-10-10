package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: AbstractTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAbstractTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeConstructor.kt\norg/jetbrains/kotlin/types/AbstractTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;

    @NotNull
    private final NotNullLazyValue<Supertypes> supertypes;

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public final class ModuleViewTypeConstructor implements TypeConstructor {

        @NotNull
        private final KotlinTypeRefiner kotlinTypeRefiner;

        @NotNull
        private final Lazy refinedSupertypes$delegate;
        final /* synthetic */ AbstractTypeConstructor this$0;

        public ModuleViewTypeConstructor(@NotNull final AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.this$0 = abstractTypeConstructor;
            this.kotlinTypeRefiner = kotlinTypeRefiner;
            this.refinedSupertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this, abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$ModuleViewTypeConstructor$$Lambda$0
                private final AbstractTypeConstructor.ModuleViewTypeConstructor arg$0;
                private final AbstractTypeConstructor arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return AbstractTypeConstructor.ModuleViewTypeConstructor.refinedSupertypes_delegate$lambda$0(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = abstractTypeConstructor;
                }
            });
        }

        private final List<KotlinType> getRefinedSupertypes() {
            return (List) this.refinedSupertypes$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List refinedSupertypes_delegate$lambda$0(ModuleViewTypeConstructor moduleViewTypeConstructor, AbstractTypeConstructor abstractTypeConstructor) {
            return KotlinTypeRefinerKt.refineTypes(moduleViewTypeConstructor.kotlinTypeRefiner, abstractTypeConstructor.mo105127getSupertypes());
        }

        public boolean equals(@Nullable Object obj) {
            return this.this$0.equals(obj);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.this$0.getBuiltIns();
            Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
            return builtIns;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo105126getDeclarationDescriptor() {
            return this.this$0.mo105126getDeclarationDescriptor();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.this$0.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            return parameters;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getSupertypes */
        public List<KotlinType> mo105127getSupertypes() {
            return getRefinedSupertypes();
        }

        public int hashCode() {
            return this.this$0.hashCode();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.this$0.isDenotable();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.this$0.refine(kotlinTypeRefiner);
        }

        @NotNull
        public String toString() {
            return this.this$0.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public static final class Supertypes {

        @NotNull
        private final Collection<KotlinType> allSupertypes;

        @NotNull
        private List<? extends KotlinType> supertypesWithoutCycles;

        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(@NotNull Collection<? extends KotlinType> allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.allSupertypes = allSupertypes;
            this.supertypesWithoutCycles = CollectionsKt.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }

        @NotNull
        public final Collection<KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        @NotNull
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(@NotNull List<? extends KotlinType> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.supertypesWithoutCycles = list;
        }
    }

    @NotNull
    public abstract Collection<KotlinType> computeSupertypes();

    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    private final Collection<KotlinType> computeNeighbours(TypeConstructor typeConstructor, boolean z11) {
        List listPlus;
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null && (listPlus = CollectionsKt.plus((Collection) abstractTypeConstructor.supertypes.invoke().getAllSupertypes(), (Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z11))) != null) {
            return listPlus;
        }
        Collection<KotlinType> collectionMo105127getSupertypes = typeConstructor.mo105127getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
        return collectionMo105127getSupertypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Supertypes supertypes$lambda$0(AbstractTypeConstructor abstractTypeConstructor) {
        return new Supertypes(abstractTypeConstructor.computeSupertypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Supertypes supertypes$lambda$1(boolean z11) {
        return new Supertypes(CollectionsKt.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable supertypes$lambda$7$lambda$2(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractTypeConstructor.computeNeighbours(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit supertypes$lambda$7$lambda$3(AbstractTypeConstructor abstractTypeConstructor, KotlinType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        abstractTypeConstructor.reportSupertypeLoopError(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable supertypes$lambda$7$lambda$5(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractTypeConstructor.computeNeighbours(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit supertypes$lambda$7$lambda$6(AbstractTypeConstructor abstractTypeConstructor, KotlinType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        abstractTypeConstructor.reportScopesLoopError(it);
        return Unit.INSTANCE;
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getSupertypes */
    public List<KotlinType> mo105127getSupertypes() {
        return this.supertypes.invoke().getSupertypesWithoutCycles();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.supertypes = storageManager.createLazyValueWithPostCompute(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$0
            private final AbstractTypeConstructor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return AbstractTypeConstructor.supertypes$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        }, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeConstructor.supertypes$lambda$1(((Boolean) obj).booleanValue());
            }
        }, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$2
            private final AbstractTypeConstructor arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeConstructor.supertypes$lambda$7(this.arg$0, (AbstractTypeConstructor.Supertypes) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit supertypes$lambda$7(final AbstractTypeConstructor abstractTypeConstructor, Supertypes supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        Collection<KotlinType> collectionFindLoopsInSupertypesAndDisconnect = abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, supertypes.getAllSupertypes(), new Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$3
            private final AbstractTypeConstructor arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeConstructor.supertypes$lambda$7$lambda$2(this.arg$0, (TypeConstructor) obj);
            }

            {
                this.arg$0 = abstractTypeConstructor;
            }
        }, new Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$4
            private final AbstractTypeConstructor arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeConstructor.supertypes$lambda$7$lambda$3(this.arg$0, (KotlinType) obj);
            }

            {
                this.arg$0 = abstractTypeConstructor;
            }
        });
        List<KotlinType> list = null;
        if (collectionFindLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType kotlinTypeDefaultSupertypeIfEmpty = abstractTypeConstructor.defaultSupertypeIfEmpty();
            if (kotlinTypeDefaultSupertypeIfEmpty != null) {
                collectionFindLoopsInSupertypesAndDisconnect = CollectionsKt.listOf(kotlinTypeDefaultSupertypeIfEmpty);
            } else {
                collectionFindLoopsInSupertypesAndDisconnect = null;
            }
            if (collectionFindLoopsInSupertypesAndDisconnect == null) {
                collectionFindLoopsInSupertypesAndDisconnect = CollectionsKt.emptyList();
            }
        }
        if (abstractTypeConstructor.getShouldReportCyclicScopeWithCompanionWarning()) {
            abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, collectionFindLoopsInSupertypesAndDisconnect, new Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$5
                private final AbstractTypeConstructor arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return AbstractTypeConstructor.supertypes$lambda$7$lambda$5(this.arg$0, (TypeConstructor) obj);
                }

                {
                    this.arg$0 = abstractTypeConstructor;
                }
            }, new Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$6
                private final AbstractTypeConstructor arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return AbstractTypeConstructor.supertypes$lambda$7$lambda$6(this.arg$0, (KotlinType) obj);
                }

                {
                    this.arg$0 = abstractTypeConstructor;
                }
            });
        }
        if (collectionFindLoopsInSupertypesAndDisconnect instanceof List) {
            list = (List) collectionFindLoopsInSupertypesAndDisconnect;
        }
        if (list == null) {
            list = CollectionsKt.toList(collectionFindLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(abstractTypeConstructor.processSupertypesWithoutCycles(list));
        return Unit.INSTANCE;
    }

    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z11) {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    public void reportScopesLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public void reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
